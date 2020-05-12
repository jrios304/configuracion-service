package com.jasmine.erp.configuracion.service.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jasmine.erp.configuracion.conf.ConfiguracionBDConfig;

@Configuration
@Import(ConfiguracionBDConfig.class)
@ComponentScan("com.jasmine.erp.configuracion.service")
public class ConfiguracionServiceConf {

}
