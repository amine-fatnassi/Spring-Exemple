package tn.esprit.exampratique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exampratique.entities.Secouriste;
import tn.esprit.exampratique.repos.SecouristeRepo;

@Service
public class SecouristeServiceImpl implements SecouristeService {
    @Autowired
    private SecouristeRepo secouristeRepo;
    @Override
    public Secouriste addSecouriste(Secouriste secouriste) {
        return secouristeRepo.save(secouriste) ;
    }
}
