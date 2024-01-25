package com.acme.ecm.core.resolver;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.schema.types.resolver.AbstractObjectResolver;
import org.nuxeo.ecm.core.schema.types.resolver.ObjectResolver;
import org.nuxeo.ecm.platform.htmlsanitizer.HtmlSanitizerService;
import org.nuxeo.runtime.api.Framework;

public class SanitizeResolver extends AbstractObjectResolver implements ObjectResolver {

    private static final long serialVersionUID = 1L;

    public static final String NAME = "sanitizeResolver";

    protected static final Log log = LogFactory.getLog(SanitizeResolver.class);
    
    @Override
    public Object fetch(Object value) {
        log.debug("<fetch> " + value);
        if (value instanceof String) {
            String originalValue = (String) value;
            HtmlSanitizerService sanitizer = Framework.getService(HtmlSanitizerService.class);
            var sanitized = sanitizer.sanitizeString(originalValue, "dummy");
            log.debug("<fetch> sanitized: " + sanitized);
            return originalValue.compareTo(sanitized) == 0 ? originalValue: null;
        };
        return null;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public <T> T fetch(Class<T> value, Object context) {
        log.warn("<fetch> " + value + ", " + context);
        throw new UnsupportedOperationException();
    }

    @Override
    public String getConstraintErrorMessage(Object invalidValue, Locale locale) {
        //Add to 'messages.json' in Studio Designer:
        //"label.schema.constraint.violation.resolver.sanitizeResolver":"'{0}' contains illegal characters."
        return ObjectResolver.Helper.getConstraintErrorMessage(this, invalidValue, locale);
    }

    @Override
    public List<Class<?>> getManagedClasses() {
        log.warn("<fetch>");
        throw new UnsupportedOperationException();
    }

    @Override
    public Serializable getReference(Object value) {
        log.warn("<getReference> " + value);
        throw new UnsupportedOperationException();
    }

}
