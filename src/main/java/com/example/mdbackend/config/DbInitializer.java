package com.example.mdbackend.config;

import com.example.mdbackend.model.ERole;
import com.example.mdbackend.model.Role;
import com.example.mdbackend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DbInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize roles
        if (!roleRepository.findByName(ERole.ROLE_USER).isPresent()) {
            Role userRole = new Role();
            userRole.setName(ERole.ROLE_USER);
            roleRepository.save(userRole);
        }

        if (!roleRepository.findByName(ERole.ROLE_ADMIN).isPresent()) {
            Role adminRole = new Role();
            adminRole.setName(ERole.ROLE_ADMIN);
            roleRepository.save(adminRole);
        }
    }
} 