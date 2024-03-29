# nuxeo-custom-resolver-sanitize

This plugin defines a **resolver** that can be used in a schema in order to apply a constraint on a property that makes sure that the property does not contain illegal characters not permitted by the **HTML Sanitizer Service**.

# Requirements

Building requires the following software:

* git
* maven

# Build

```
git clone ...
cd nuxeo-custom-resolver-sanitize

mvn clean install
```

# CI

[![Java CI with Maven](https://github.com/vdutat/nuxeo-custom-resolver-sanitize/actions/workflows/maven.yml/badge.svg)](https://github.com/vdutat/nuxeo-custom-resolver-sanitize/actions/workflows/maven.yml)

# Installation

```
nuxeoctl mp-install nuxeo-custom-resolver-sanitize/nuxeo-custom-resolver-sanitize-package/target/nuxeo-custom-resolver-sanitize-package-*.zip
```

# Support

**These features are not part of the Nuxeo Production platform, they are not supported**

These solutions are provided for inspiration and we encourage customers to use them as code samples and learning resources.

This is a moving project (no API maintenance, no deprecation process, etc.) If any of these solutions are found to be useful for the Nuxeo Platform in general, they will be integrated directly into platform, not maintained here.


# Licensing

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)


# About Nuxeo

Nuxeo dramatically improves how content-based applications are built, managed and deployed, making customers more agile, innovative and successful. Nuxeo provides a next generation, enterprise ready platform for building traditional and cutting-edge content oriented applications. Combining a powerful application development environment with SaaS-based tools and a modular architecture, the Nuxeo Platform and Products provide clear business value to some of the most recognizable brands including Verizon, Electronic Arts, Sharp, FICO, the U.S. Navy, and Boeing. Nuxeo is headquartered in New York and Paris.

More information is available at [www.nuxeo.com](http://www.nuxeo.com).
