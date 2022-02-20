import com.freedom.HelloWorld
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldNotBe

class MainTestSpec : WordSpec({
    "HelloWorld" should {
        "return Hello World" {
            HelloWorld() shouldNotBe  "Hello World"
        }
    }
})