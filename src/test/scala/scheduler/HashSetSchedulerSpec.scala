package scheduler

import http.Request
import org.scalatest.FunSuite

class HashSetSchedulerSpec extends FunSuite{

  test("Scheduler mast check to false") {
    val scheduler = new HashSetScheduler()
    scheduler.check(Request("http://www.scalatest.org/user_guide/selecting_a_style"))
    assert(!scheduler.check(Request("http://www.scalatest.org/user_guide/selecting_a_style")))
  }



}
