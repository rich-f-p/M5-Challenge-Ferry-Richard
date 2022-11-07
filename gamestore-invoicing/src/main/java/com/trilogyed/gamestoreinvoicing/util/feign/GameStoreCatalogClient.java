package com.trilogyed.gamestoreinvoicing.util.feign;

import com.trilogyed.gamestoreinvoicing.viewModel.ConsoleViewModel;
import com.trilogyed.gamestoreinvoicing.viewModel.GameViewModel;
import com.trilogyed.gamestoreinvoicing.viewModel.TShirtViewModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "gamestore-catalog")
public interface GameStoreCatalogClient {

    @RequestMapping(value = "game/{id}", method = RequestMethod.GET)
    public Optional<GameViewModel> getGameById(@PathVariable Long id);

    @RequestMapping(value = "console/{id}", method = RequestMethod.GET)
    public Optional<ConsoleViewModel> getConsoleById(@PathVariable Long id);

    @RequestMapping(value = "/tshirt/{id}",method = RequestMethod.GET)
    public Optional<TShirtViewModel> getTShirtById(@PathVariable Long id);
}
