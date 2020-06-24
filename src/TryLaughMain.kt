fun main() {
    replace("龙总跟缇娜姐", "跳舞", "女团", "姐妹", "跳", "杨超越", "火箭少女")

    replace("老板", "编程", "程序员", "同事", "写", "张三", "编程少年")
    replace("老师", "考试", "学生", "同学", "考", "李四", "学习少年")
}

fun replace(boss: String, work: String, team: String, partner: String, doo: String, name: String, combination: String) {

    val speech = "哎呦，对不起$boss，我是干啥啥不行，跟$boss 吵架第一名\n" +
            "但是我前阵子的压力，我实在是太大了，我就是参加个比赛，我没有想到我能做$team 两年！" +
            "我不知道就是那种大早上被$partner 拉起来，他告诉你要去$work，我说我不行，她说你可以的！\n" +
            "有些人说，$name 都不可能做$team ，她$doo 成这样，我都可以！\n" +
            "你们看，老天不一定爱聪明的人，万分之一也会宠幸到笨小孩身上，不要放弃平庸和笨的自己！老天就是喜欢你，你就配拥有这些爱！\n" +
            "我每天都要爬起来$work，我每天都好焦虑，我一$doo 错了就骂我，但是我真的练了好久，我一上台我就错，我也是不知道为什么，气死了……\n" +
            "两年了，我终于毕业了，我以后没办法$work 给你们看了，我真的$doo 不好！我也没有十个$partner 给我打掩护了，我$doo 不好就太明显了……\n" +
            "$combination$name，再见，$name，你好！\n"

    println(speech)
}
