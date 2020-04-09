# request-metrics-analyzer-next

[![Build Status](https://travis-ci.org/kgibm/request-metrics-analyzer-next.svg)](https://travis-ci.org/kgibm/request-metrics-analyzer-next)

A graphical tool for analyzing [request metrics](https://www.ibm.com/support/knowledgecenter/en/SSAW57_9.0.5/com.ibm.websphere.nd.multiplatform.doc/ae/tprf_requestmetrics.html) generated by Traditional WebSphere Application Server.

## Download

Download request-metrics-analyzer-next-*-jar-with-dependencies.jar from https://github.com/kgibm/request-metrics-analyzer-next/releases

## Run

`java -jar request-metrics-analyzer-next-*-jar-with-dependencies.jar`

## Importing the project into eclipse

* Open Eclipse and select "File" > "Import"
* In the wizard, select "Maven" > "Existing Maven Projects" and click next
* Select the root directory (your git-checkout location)
* You should see the maven POM and be able to import it

## Development

Run `de.ibm.issw.requestmetrics.Starter`

### Create a new release

1. Update `<version>X.Y.Z</version>` in pom.xml
1. Update `name: request-metrics-analyzer-next-X.Y.Z` in .travis.yml
1. `git commit -am "Commit message"`
1. `git tag vX.Y.Z`
1. `git push --follow-tags`
