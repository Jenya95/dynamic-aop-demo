# How to use
If in [application.properties](src/main/resources/application.properties)

`package-target=one`

You will see log
```
Intercepted  co.il.sanevich.pointcutdynamic.service.one.doJob
2020-08-25 14:25:58.910  INFO 24091 --- [           main] c.i.s.p.service.one.ServiceOne           : ServiceOne worked
2020-08-25 14:25:58.914  INFO 24091 --- [           main] c.i.s.p.service.two.ServiceTwo           : ServiceTwo worked
```

If in [application.properties](src/main/resources/application.properties)

`package-target=two`

You will see log
```
2020-08-25 14:26:32.732  INFO 24102 --- [           main] c.i.s.p.service.one.ServiceOne           : ServiceOne worked
Intercepted  co.il.sanevich.pointcutdynamic.service.two.doJob
2020-08-25 14:26:32.737  INFO 24102 --- [           main] c.i.s.p.service.two.ServiceTwo           : ServiceTwo worked
```