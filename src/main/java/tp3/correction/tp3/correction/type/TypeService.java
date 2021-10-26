package tp3.correction.tp3.correction.type;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> allDrinkTypes() {
        return typeRepository.findAll();
    }

    public Type addDrinkTypes(Type newType) {
        if (typeRepository.existsById(newType.getId())) {
            throw new IllegalArgumentException("Id " + newType.getId() + " déja utilisé");
        } else {
            return typeRepository.save(newType);
        }
    }

    public Type modifyType(Type type) {
        if (!typeRepository.existsById(type.getId())) {
            throw new IllegalArgumentException("Id " + type.getId() + " n'existe pas");
        } else {
            return typeRepository.save(type);
        }
    }
}
