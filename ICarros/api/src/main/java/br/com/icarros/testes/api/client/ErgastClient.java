package br.com.icarros.testes.api.client;

import com.google.gson.JsonObject;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "results",url = "${api.ergast.results}")
@Headers(MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface ErgastClient {
    @GetMapping("/f1/2017/last/results.json")
    JsonObject getAllResults();
    @GetMapping("/f1/{year}/last/results.json")
    JsonObject getAllResultsByYear(@PathVariable String year);
}
