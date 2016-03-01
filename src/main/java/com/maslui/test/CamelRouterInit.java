package com.maslui.test;

import org.apache.camel.spring.boot.FatJarRouter;
import org.apache.camel.spring.boot.FatWarInitializer;

public class CamelRouterInit extends FatWarInitializer{
	
	@Override
	protected Class<? extends FatJarRouter> routerClass() {
        return CamelTest.class;
    }

}
