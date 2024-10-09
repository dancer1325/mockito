<a href="https://site.mockito.org">
<img src="https://raw.githubusercontent.com/mockito/mockito/main/src/main/javadoc/org/mockito/logo.png"
     srcset="https://raw.githubusercontent.com/mockito/mockito/main/src/main/javadoc/org/mockito/logo@2x.png 2x"
     alt="Mockito" />
</a>

Most popular mocking framework for Java

[![CI](https://github.com/mockito/mockito/workflows/CI/badge.svg)](https://github.com/mockito/mockito/actions?query=workflow%3ACI)
[![Coverage Status](https://img.shields.io/codecov/c/github/mockito/mockito.svg)](https://codecov.io/github/mockito/mockito)
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/mockito/mockito/blob/main/LICENSE)

[![Release Notes](https://img.shields.io/badge/release%20notes-5.x-yellow.svg)](https://github.com/mockito/mockito/releases/)
[![Maven Central](https://img.shields.io/maven-central/v/org.mockito/mockito-core.svg)](https://search.maven.org/artifact/org.mockito/mockito-core/)
[![Javadoc](https://www.javadoc.io/badge/org.mockito/mockito-core.svg)](https://www.javadoc.io/doc/org.mockito/mockito-core)


## Current version is 5.x
* [what's new | Mockito 2](https://github.com/mockito/mockito/wiki/What%27s-new-in-Mockito-2)
  * requirements
    * Java v6+
* [Mockito 3](https://github.com/mockito/mockito/releases/tag/v3.0.0)
  * NOT breaking API changes
  * requirements
    * Java v8+
* [Mockito 4](https://github.com/mockito/mockito/releases/tag/v4.0.0)
  * removes deprecated API
* [Mockito 5](https://github.com/mockito/mockito/releases/tag/v5.0.0)
  * default `mockmaker` -- is replaced by -- `mockito-inline`
  * changes are NOT backward compatible
  * requirements
    * Java v11+

## Mockito for enterprise

* [Tidelift](https://tidelift.com/subscription/pkg/maven-org-mockito-mockito-core) Subscription
* run by 
  * maintainers of `org.mockito:mockito-core`
* benefits
  * Save time
  * reduce risk
  * improve code health
  * pay on demand the exact dependencies / you use
* [Learn more.](https://tidelift.com/subscription/pkg/maven-org-mockito-mockito-core?utm_source=maven-org-mockito-mockito-core&utm_medium=referral&utm_campaign=enterprise&utm_term=repo)

## Development

* `-SNAPSHOT` version
  * published | public Sonatype repository
* new minor or patch version 
  * published / month | Maven Central
* [Shipkit](http://shipkit.org) & [Gradle Nexus Publish Plugin](https://github.com/gradle-nexus/publish-plugin)
  * uses
    * release automation
* [latest release notes](https://github.com/mockito/mockito/releases/)
* [latest documentation](https://javadoc.io/page/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
* [semantic versioning in Mockito](https://github.com/mockito/mockito/wiki/Semantic-Versioning)
* Older 1.x and 2.x 
  * releases are available | [Central Repository](https://search.maven.org/artifact/org.mockito/mockito-core/1.10.19/jar) &
  * [javadoc.io documentation](https://javadoc.io/doc/org.mockito/mockito-core/1.10.19/org/mockito/Mockito.html)

## More information

All you want to know about Mockito is hosted at [The Mockito Site](https://site.mockito.org) which is [Open Source](https://github.com/mockito/mockito.github.io) and likes [pull requests](https://github.com/mockito/mockito.github.io/pulls), too.

Want to contribute? Take a look at the [Contributing Guide](https://github.com/mockito/mockito/blob/main/.github/CONTRIBUTING.md).

Enjoy Mockito!

## Need help?

* Search / Ask question on [stackoverflow](https://stackoverflow.com/questions/tagged/mockito)
* Go to the [mockito mailing-list](https://groups.google.com/group/mockito) (moderated)
* Open a ticket in GitHub [issue tracker](https://github.com/mockito/mockito/issues)

## How to develop Mockito?

* `./gradlew build`
  * build locally
* if you are using IntelliJ IDEA -> you can 
  * use built-in Gradle import wizard | IDEA
  * `./gradlew idea`
    * -- generate the -- importable IDEA metadata files
    * open the generated "*.ipr" | IDEA

## How to release new version?

1. Every change on the main development branch is released as `-SNAPSHOT` version to Sonatype snapshot repo
   at https://s01.oss.sonatype.org/content/repositories/snapshots/org/mockito/mockito-core.
2. In order to release a non-snapshot version to Maven Central push an annotated tag, for example:

```
git tag -a -m "Release 3.4.5" v3.4.5
git push origin v3.4.5
```

3. At the moment, you **may not create releases from GitHub Web UI**. Doing so will make the CI build fail because the
   CI creates the changelog and posts to GitHub releases. We'll support this in the future.
