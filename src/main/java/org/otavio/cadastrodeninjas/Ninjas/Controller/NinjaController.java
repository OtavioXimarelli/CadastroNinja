package org.otavio.cadastrodeninjas.Ninjas.Controller;


import org.otavio.cadastrodeninjas.Ninjas.Dto.NinjaDTO;
import org.otavio.cadastrodeninjas.Ninjas.Service.NinjaService;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO ninjaDTO = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso: " + ninjaDTO.getName() + "ID: " + ninjaDTO.getId());

    }

    @GetMapping("/show")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {

        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) {
        NinjaDTO ninjaDTO = ninjaService.listarNinjaPorId(id);

        if (ninjaDTO != null) {
            return ResponseEntity.ok(ninjaDTO);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o id: " + id
                + " não foi encontrado, revise e tente novamente");

    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> updateNinjaByID(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        NinjaDTO ninjaDTO = ninjaService.atualizarNinja(id, ninja);
        if (ninjaDTO != null) {
            return ResponseEntity.ok(ninjaDTO);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("o ninja com o id: " +
                id
                + " não foi encontrado nos registros, tente novamente ");
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNinjaByID(@PathVariable Long id) {
        if (ninjaService.listarNinjaPorId(id) != null) {
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("ninja deletado com sucesso " + "ID: " + id);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com id: " + id +
                " não foi encontrado no banco de dados, tente novamente.");


    }
}
