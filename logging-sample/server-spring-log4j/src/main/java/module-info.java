module dev.rico.samples.http.server.spring {

    opens dev.rico.samples.http.server;

    requires dev.rico.server.spring;
    requires dev.rico.log4j2.appender;
    requires spring.boot;
    requires spring.web;
    requires spring.beans;
    requires org.slf4j;
}
