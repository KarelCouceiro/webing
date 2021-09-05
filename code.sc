package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if(c==r || c== 0) 1 else pascal(c, r-1) + pascal(c-1,r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def empt(chars: List[Char], x:Int):Int = if(chars.isEmpty) x else if (x>=0) balanced(chars, x) else balanced(chars, x-99)
    def balanced(chars: List[Char], x: Int) = {
    if(chars.head == '(') empt(chars.tail,x+1) else if (chars.head == ')') empt(chars.tail,x-1)
    else empt(chars.tail,x)
    }
  empt(chars,0) == 0

  }

 /**
   * Exercise 3
   */

  def countChange(money: Int, coins: List[Int]): Int = ???
}
