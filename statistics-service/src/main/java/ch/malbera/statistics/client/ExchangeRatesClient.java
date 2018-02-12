package ch.malbera.statistics.client;

import ch.malbera.statistics.domain.Currency;
import ch.malbera.statistics.domain.ExchangeRatesContainer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${rates.url}", name = "rates-client")
public interface ExchangeRatesClient {

	@RequestMapping(method = RequestMethod.GET, value = "/latest")
    ExchangeRatesContainer getRates(@RequestParam("base") Currency base);

}
