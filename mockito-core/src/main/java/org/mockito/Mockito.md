* TODO:

## 2. How about some stubbing?
* By default, ALL methods / return a value -> mock will return
  * null
  * primitive/primitive wrapper value
    * _Example1:_ if method returns int/Integer -> mock will return 0
    * _Example2:_ if method returns boolean/Boolean -> mock will return false
  * empty collection
* 👁️Stubbing can be overridden 👁
  * ️_Example:_ common stubbing can go to fixture setup & test methods can override it
  * overriding stubbing is a potential code smell / -- points out -- too much stubbing
* Once stubbed, the method / regardless # of times called -- will always return a -- stubbed value 
* Last stubbing is MORE important
  * == order of stubbing matters 
  * _Example:_ you stubbed the same method -- via -- same arguments / many times

* TODO:

## 13. Spying | real objects
* `spy`
  * == create spies | real objects
    * -> 👁️if method NOT stubbed -> real methods are called👁️
  * == "partial mocking" from Mockito v1.8+
    * Reason: 🧠partial mock == code smell 🧠
  * uses
    * dealing with legacy code
    * 3rd party interfaces
    * interim refactoring of legacy code
  * if you stub a spy, sometimes
    * `when()` is NOT allowed
    * ⚠️use the `doReturn`|`Answer`|`Throw()` family⚠️ 
  * if an un-stubbed method is called | spy, NOT | real instance -> NO effects | real instance 
  * Mockito creates a copy the real instance
    * -> does NOT delegate calls to the passed real instance
  * if you spy | real objects & try to stub or verify a final method -> trouble
    * Reason: 🧠Mockito does NOT mock final methods 🧠

* TODO: