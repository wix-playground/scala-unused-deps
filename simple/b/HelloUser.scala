package b

import a.Hello

class HelloUser {
  def hello(user: String) = (new Hello()).hello + ", " + user
}