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

org.glassfish:javax.faces:jar:2.2.9<br/>
org.apache.commons:commons-lang3:jar:3.1<br/>
javax.el:el-api:jar:2.2<br/>
javax.annotation:jsr250-api:jar:1.0<br/>
javax.validation:validation-api:jar:1.1.0.Final<br/>
javax.servlet:javax.servlet-api:jar:3.0.1<br/>
javax.enterprise:cdi-api:jar:1.1<br/>
org.glassfish.main.javaee-api:javax.annotation:jar:3.1.2<br/>
rome:rome:jar:1.0<br/>
org.apache.poi:poi:jar:3.7<br/>
com.lowagie:itext:jar:1.4.8<br/>
net.sf.ehcache:ehcache:jar:2.9.0<br/>
commons-fileupload:commons-fileupload:jar:1.3<br/>
commons-io:commons-io:jar:2.4<br/>
org.webjars:font-awesome:jar:4.2.0<br/>
org.omnifaces:omnifaces:jar:1.8.1<br/>
org.primefaces.extensions:primefaces-extensions:jar:3.1.0<br/>
org.primefaces.extensions:resources-codemirror:jar:3.1.0<br/>
org.primefaces:primefaces:jar:5.2<br/>
org.primefaces.themes:all-themes:jar:1.0.10<br/>

That's all. Then run Eclipse Virgo and deploy the compiled wab...<br/>
<br/>
<br/>
