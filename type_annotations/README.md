Plus one with strict deps

In some cases Scala compiler needs some desp to be on the classpath, which are not directly mentioned in the source code
 of the target. Such deps should can transitively with plus-one. Otherwise it is a coupling on the client side, which
 will will break if implementation target changes it's dependencies. This becomes a big challenge if such couling 
 happens with an external dep.
 
Repro:

`a.Hello` depends on `b.LoggingProvider`, but it also asks to add //type_annotation/c, which is implementation
 detail of `b.LoggingProvider`. 
 
If implementation of LoggingProvider is changed to use `d.BetterLogger`, it requires not only to add d to b, but also d 
to a, and remove c from a.