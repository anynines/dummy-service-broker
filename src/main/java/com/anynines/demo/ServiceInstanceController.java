package com.anynines.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/v2")
@RestController
public class ServiceInstanceController {

    @RequestMapping(path = "/catalog", method = RequestMethod.GET)
    public String getCatalog() {

        System.out.println("get Catalog executed");

        return "{\n" +
                "  \"services\": [{\n" +
                "    \"id\": \"c6f2cfb7-47ec-46cb-b047-180c7039fae4\",\n" +
                "    \"name\": \"testservice\",\n" +
                "    \"description\": \"The simplest service broker possible\",\n" +
                "    \"bindable\": false,\n" +
                "    \"plans\": [{\n" +
                "      \"id\": \"76c6d84f-84a2-4067-bb9b-14646d76dfa1\",\n" +
                "      \"name\": \"default\",\n" +
                "      \"description\": \"A default service plan.\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";
    }

    @RequestMapping(value = "/service_instances/{serviceId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String createServiceInstance(@PathVariable String serviceId) {

        System.out.println("create service instance");

        return "{\"dashboard_url\": \"no\"}";
    }

    @RequestMapping(value  = "/service_instances/{serviceId}/last_operation", method = RequestMethod.GET)
    public String getLastOperationStatus(@PathVariable String serviceId) throws Exception {

        System.out.println("get last operation");

        return "{\n" +
                "  \"state\": \"succeeded\",\n" +
                "  \"description\": \"done\"\n" +
            "}";
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/service_instances/{serviceId}", method = RequestMethod.DELETE)
    public String deleteServiceInstance(@PathVariable String serviceId) {

        System.out.println("delete service instance");

        return "{}";
    }
}
