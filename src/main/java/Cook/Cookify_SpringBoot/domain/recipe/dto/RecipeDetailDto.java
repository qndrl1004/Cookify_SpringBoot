package Cook.Cookify_SpringBoot.domain.recipe.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.List;

@Data
public class RecipeDetailDto {

    private String title;
    @ElementCollection
    private List<String> ingredients;
    @ElementCollection
    private List<String> ingredients2;
    @ElementCollection
    private List<String> steps;
    private String thumbnail;

    public RecipeDetailDto(String title, List<String> ingredients, List<String> ingredients2, List<String> steps, String thumbnail) {
        this.title = title;
        this.ingredients = ingredients;
        this.ingredients2 = ingredients2;
        this.steps = steps;
        this.thumbnail = thumbnail;
    }
}
