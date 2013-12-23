primefaces-cookbook-osgi
========================

Make work primefaces cookbook on various osgi containers (jboss, karaf, virgo) <br/>
Note : primefaces coobook for osgi env. is just a fork from http://ova2.github.com/primefaces-cookbook/ and a pinch of osgi<br/>
<br/>
JBoss EAP 6.2 - working <br/>
Apache Karaf  - not working (pb with el & jsf)<br/>
Eclipse Virgo - working <br/>
<br/>
<br/>
primefaces-cookbook-osgi on JBoss :
===================================

To make work this primefaces osgi showcase you need to add some stuff to the default JBoss (tested one is JBoss EAP 6.2) :<br/><br/>

Custom JBoss modules : ./jboss-integration/jboss-modules/ <br/>
JBoss configuration  : ./jboss-integration/jboss-standalone-conf/standalone.conf <br/><br/>

WARNING : in JBoss configuration there is a custom com.sun.faces.jsf-api osgi capability you need to package according the descriptions provided in this configuration file.<br/><br/>

That's all. Then run JBoss and deploy the compiled wab...<br/>
<br/>
<br/>

primefaces-cookbook-osgi on Karaf :
===================================

TODO<br/><br/>

<br/>
<br/>
primefaces-cookbook-osgi on Virgo :
===================================

To make work this primefaces osgi showcase you need to deploy some bundle on the default Eclipse Virgo Tomcat server (tested one is 3.6.1).<br/><br/>

Bellow the maven path of these bundle :<br/><br/>

commons-codec:commons-codec:1.5<br/>
org.apache.servicemix.bundles:org.apache.servicemix.bundles.poi:3.9_2<br/>
org.bouncycastle:com.springsource.org.bouncycastle.jce:1.39.0 <br/>
org.bouncycastle:com.springsource.org.bouncycastle.mail:1.39.0 <br/>
com.lowagie:itext:2.1.7 - repackaged with virgo bundlor and manifest file ./virgo-integration/bundlor/com/lowagie/itext/itext.mf<br/>
commons-fileupload:commons-fileupload:1.3<br/>
commons-io:commons-io:2.4<br/>
com.spectral.com.sun.faces:jsf-api:2.1.26 (WARNING: check ./jboss-integration/jboss-standalone-conf/standalone.conf file to know how this bundle has been repackaged)<br/>
com.sun.faces:jsf-impl:2.1.26<br/>
org.glassfish.web:el-impl:2.2.1-b05<br/>
org.apache.commons:commons-lang3:3.1<br/>
rome:rome:1.0<br/>
org.atmosphere:atmosphere-runtime:2.0.0<br/>
org.primefaces:primefaces:3.5<br/><br/>

That's all. Then run Eclipse Virgo and deploy the compiled wab...<br/>
<br/>
<br/>