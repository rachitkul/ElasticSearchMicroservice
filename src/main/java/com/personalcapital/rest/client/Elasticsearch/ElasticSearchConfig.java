package com.personalcapital.rest.client.Elasticsearch;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfig {
    @Value("${elasticsearch.host}")
    private String restHost;


    @Bean
    public RestHighLevelClient client(){
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost(restHost)));
        return client;
    }


}

