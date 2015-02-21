/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinanet.customerbackend.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author pinarodrigo
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.pinanet.customerbackend.NewCrossOriginResourceSharingFilter.class);
        resources.add(com.pinanet.customerbackend.service.CustomerFacadeREST.class);
        resources.add(com.pinanet.customerbackend.service.DiscountCodeFacadeREST.class);
        resources.add(com.pinanet.customerbackend.service.MicroMarketFacadeREST.class);
    }
    
}
