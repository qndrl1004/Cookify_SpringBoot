package Cook.Cookify_SpringBoot.domain.heart.controller;

import Cook.Cookify_SpringBoot.domain.heart.Heart;
import Cook.Cookify_SpringBoot.domain.heart.dto.HeartRecipeDto;
import Cook.Cookify_SpringBoot.domain.heart.service.HeartService;
import Cook.Cookify_SpringBoot.domain.member.repository.GoogleMemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/heart")
public class HeartController {

    private HeartService heartService;

    @PostMapping("/{recipeId}")
    public ResponseEntity addHeart(@PathVariable("recipeId") Long recipeId){
        heartService.addHeart(recipeId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping()
    public ResponseEntity<List<HeartRecipeDto>> getHeartRecipe(){
        List<HeartRecipeDto> recipes = heartService.getHeartRecipe();
        return ResponseEntity.ok().body(recipes);
    }
}
