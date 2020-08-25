# How to use
If in [application.properties](src/main/resources/application.properties)

`package-target=one`

You will see log
```
Intercepted  co.il.sanevich.pointcutdynamic.service.one.ServiceOne.doJob
2020-08-25 14:49:24.419  INFO 24804 --- [           main] c.i.s.p.service.one.ServiceOne           : ServiceOne worked
Intercepted  co.il.sanevich.pointcutdynamic.service.one.ServiceOneExtra.someOther
2020-08-25 14:49:24.423  INFO 24804 --- [           main] c.i.s.p.service.one.ServiceOneExtra      : ServiceOneExtra worked
2020-08-25 14:49:24.427  INFO 24804 --- [           main] c.i.s.p.service.two.ServiceTwo           : ServiceTwo worked
```

If in [application.properties](src/main/resources/application.properties)

`package-target=two`

You will see log
```
2020-08-25 14:26:32.732  INFO 24102 --- [           main] c.i.s.p.service.one.ServiceOne           : ServiceOne worked
Intercepted  co.il.sanevich.pointcutdynamic.service.two.doJob
2020-08-25 14:26:32.737  INFO 24102 --- [           main] c.i.s.p.service.two.ServiceTwo           : ServiceTwo worked
```