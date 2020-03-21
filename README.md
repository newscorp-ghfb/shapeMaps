# Shape Maps

Scala implementation of [Shape Maps](https://shexspec.github.io/shape-map/)

[![Build Status](https://travis-ci.org/weso/shapeMaps.svg?branch=master)](https://travis-ci.org/weso/shapeMaps)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d421668975834528bf562ca81bff4433)](https://www.codacy.com/gh/weso/shex-s?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=weso/shex-s&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/weso/shapeMaps/branch/master/graph/badge.svg)](https://codecov.io/gh/weso/shapeMaps)

## Introduction

This project contains a Scala implementation of [Shape Maps](https://shexspec.github.io/shape-map/).

## Installation and compilation

The project uses [sbt](http://www.scala-sbt.org/) for compilation as well as Java 1.8.

* `sbt test` compiles and runs the tests

## Implementation details

* The engine is based on Monads using the [cats library](http://typelevel.org/cats/)
* The compact syntax parser
  is implemented using the following [Antlr grammar](https://github.com/shexSpec/grammar/blob/master/ShExDoc.g4) (previous versions used Scala Parser Combinators)
  which is based on this [grammar](https://github.com/shexSpec/shex.js/blob/master/doc/bnf)

## More information

* An online demo based on this library is available at [http://rdfshape.weso.es](http://rdfshape.weso.es).
* Another online demo based on this library customized for Wikidata is available at [http://wikishape.weso.es](http://wikishape.weso.es).

## Author & contributors

* Author: [Jose Emilio Labra Gayo](http://labra.weso.es)

## Contribution

Contributions are greatly appreciated.
Please fork this repository and open a
pull request to add more features or [submit issues](https://github.com/weso/shapeMaps/issues)
