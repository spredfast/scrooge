# Scrooge

[![Build status](https://travis-ci.org/twitter/scrooge.svg?branch=develop)](https://travis-ci.org/twitter/scrooge)
[![Codecov branch](https://img.shields.io/codecov/c/github/twitter/scrooge/develop.svg)](http://codecov.io/github/twitter/scrooge?branch=develop)
[![Project status](https://img.shields.io/badge/status-active-brightgreen.svg)](#status)
[![Gitter](https://img.shields.io/badge/gitter-join%20chat-green.svg)](https://gitter.im/twitter/finagle?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Maven Central](https://img.shields.io/maven-central/v/com.twitter/scrooge_2.11.svg)](https://maven-badges.herokuapp.com/maven-central/com.twitter/scrooge_2.11)

Scrooge is a [thrift](https://thrift.apache.org/) code generator written in
Scala, which currently generates code for Scala, Java, Cocoa, Android and Lua.

It's meant to be a replacement for the apache thrift code generator, and
generates conforming, compatible binary codecs by building on top of
libthrift.  It integrates with the [finagle][0] project, exporting stats
and finagle APIs, and makes it easy to build high throughput, low latency,
robust thrift servers and clients.

Part of the motivation behind scrooge's scala implementation is that since Scala
is API-compatible with Java, you can use the apache thrift code generator to
generate Java files and use them from within Scala, but the generated code uses
Java collections and mutable "bean" classes, causing some annoying boilerplate
conversions to be hand-written. Scrooge bypasses the problem by generating Scala
code directly. It also uses Scala syntax so the generated code is much more
compact.

There is a comprehensive set of unit tests, which generate code, compile it, and
execute it to verify expectations, as well as gold files to make it easy to
review the effects of changes to the generator.

## Status

This project is used in production at Twitter (and many other organizations),
and is actively developed and maintained.

## Building the develop branch locally

We are not currently publishing snapshots for Scrooge's dependencies, which
means that it may be necessary to publish the `develop` branches of these
libraries locally in order to work on Scrooge's `develop` branch. To do so
you can use our build tool, [dodo](https://github.com/twitter/dodo).

``` bash
curl -s https://raw.githubusercontent.com/twitter/dodo/develop/bin/build | bash -s -- --no-test scrooge
```

If you have any questions or run into any problems, please create
an issue here, tweet at us at [@finagle](https://twitter.com/finagle), or email
the Finaglers mailing list.

## Full Documentation

<https://twitter.github.io/scrooge/>

[0]: https://github.com/twitter/finagle
