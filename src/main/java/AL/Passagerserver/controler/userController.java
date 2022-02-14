package AL.Passagerserver.controler;

import AL.Passagerserver.model.Passager;

import AL.Passagerserver.repository.PassagerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/Passager")
public class userController {

    @Autowired
    private PassagerRepository passagerRepository;
   //add passager
    @PostMapping("/PassagerAdd")
    public Passager creePassager( Passager e) {
        return passagerRepository.save(e);
    }
    //get all passagers
    @GetMapping("/PassagerGet")
    public List<Passager> GetAllPassager(){
        return passagerRepository.findAll();
    }

    //get passager par id
    @DeleteMapping (value = "/Delete")
    public void supprimerPassager( Long id) {
        passagerRepository.deleteById(id);
    }

    @GetMapping(value = "/find")
    public Optional<Passager> getPassagerById( Long id) {
        return passagerRepository.findById(id);
    }

    //get card
    @GetMapping(value = "/findBycard")
    public Optional<Passager> getPassagerByNum( int num) {
        return passagerRepository.findByNum(num);
    }









}
