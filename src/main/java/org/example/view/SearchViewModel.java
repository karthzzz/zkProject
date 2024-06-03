package org.example.view;


import org.example.service.Impl.CarServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.example.model.Car;
import org.example.service.CarService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;


import java.util.List;


@Getter @Setter
public class SearchViewModel {
    private String keyword;
    private List<Car> carList;
    private Car selectedCar;
    private CarService carService = new CarServiceImpl();


    @Command
    @NotifyChange("carList")
    public void search() {
        carList = carService.search(keyword);
    }
}
