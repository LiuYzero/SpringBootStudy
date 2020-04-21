## FAQ
### idea 自动注入mapper报错
IDEA 使用 @Autowired 去注解 Mapper 报错

解决办法参照：https://www.v2ex.com/t/363764

mapper 接口里添加 @repository 了吗，不添加 idea 不知道这是个 bean
直接去 facets 里删除 spring 也行（不过这也是治标不治本，不推荐，上面那个应该算是比较好的做法了吧）

### Error creating bean with name 'passwordController': Unsatisfied dependency expressed through field 'passwordService'; nested exception
XML parameterType="java.lang.String" 写为 "java.util.String

### ere is no getter for property named 'url' in 'class java.lang.String'
PasswordMapper.xml 中 #{url} 写成了 ${url}