import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.taketoncheir.Hellofinagle

object HellofinagleSpec extends Properties("List") {

  property("cumul") = forAll {
    val hello = Hellofinagle
    (xs: List[Int]) => hello.cumulative(xs).size == xs.size
  }
}

