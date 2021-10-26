package tp3.correction.tp3.correction.type;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/types")
public class TypeController {
    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping
    public List<Type> allDrinkTypes() {
        return typeService.allDrinkTypes();
    }

    @PostMapping
    public Type addType(@RequestBody Type newType) {
        return typeService.addDrinkTypes(newType);
    }

    @PutMapping
    public Type modifyType(@RequestBody Type type){
        return typeService.modifyType(type);
    }

}
