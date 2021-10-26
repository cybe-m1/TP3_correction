package tp3.correction.tp3.correction.drink;

import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }
}
