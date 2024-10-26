import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoDAO produtoDAO;

    // Serve a página inicial
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    // Serve a página de listagem
    @GetMapping("/produtos")
    public String listarProdutos() {
        return "listar.html";
    }

    // Serve a API de listagem de produtos (para JavaScript)
    @GetMapping("/produtos/api")
    @ResponseBody
    public List<Produto> listarProdutosApi() {
        return produtoDAO.obterTodosProdutos();
    }

    // Serve a página de formulário
    @GetMapping("/produtos/novo")
    public String novoProduto(Model model) {
        model.addAttribute("produto", new Produto(0, "", 0.0, 0));
        return "formulario.html";
    }

    // Salva um novo produto via POST
    @PostMapping("/produtos/salvar")
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoDAO.inserirProduto(produto);
        return "redirect:/produtos";
    }
}




