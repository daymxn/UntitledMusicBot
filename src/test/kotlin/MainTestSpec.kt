import com.freedom.HelloWorld
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class MainTestSpec : WordSpec({
    "HelloWorld" should {
        "return Hello World" {
            HelloWorld() shouldBe  "Hello World"
        }
    }
})