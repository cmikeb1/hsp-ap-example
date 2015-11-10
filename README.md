# hsp-api-example
Example of how to configure and extend the HSP API to create a deployable war with Spring Boot.

## sbs-api-base
This module references the hsp api code, then adds some configuration on top of that which is specific 
to how we hope to deploy at Intermountain.

## sbs-api-example
This is an example of a deployable FHIR servlet, that is HSPC compliant.  It depends on sbs-api-base, then 
adds implementations of resource proivders to serve up individual FHIR resources.

I expect a complete FHIR service could be made up of several sbs-api-example style modules, each depending on
sbs-api-base for general configuration and containing a subset of FHIR resource providers.
