package ak.explore.cicd_github_actions_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdGithubActionsExApplication {

	@GetMapping("/welcome")
	public String sample(){
		return "Welcome to CI/CD workflow example Using GITHUB Actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(CiCdGithubActionsExApplication.class, args);
	}

/*
echo "# cicd-github-actions-ex" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/arunkumarsakthivel/cicd-github-actions-ex.git
git push -u origin main
 */

}
