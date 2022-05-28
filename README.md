# 软件工程

## 介绍
荣耀王者组作业

## 数据库说明

**后台管理登录表**

|   列名   |  类型   | 默认值 | 可否为空 | 注释 |
| :------: | :-----: | :----: | :------: | :---: |
|    id    | INTEGER |  null  |    否    |  id  |
| account  | VARCHAR |  null  |    否    | 账户 |
| password | VARCHAR |  null  |    否    | 密码 |

**classroom（教室）表**

|      列名       |  类型   | 默认值 | 可否为空 |   注释   |
| :-------------: | :-----: | :----: | :------: | :------: |
|       id        |   int   |  null  |    否    |    id    |
|      name       | varchar |  null  |    否    |   姓名   |
| number_of_seats | varchar |  null  |    否    |  教室号  |
|   use_status    |   int   |  null  |    否    | 使用状态 |

**teacher（教师）表**

| 列名  |  类型   | 默认值 | 可否为空 |   注释   |
| :---: | :-----: | :----: | :------: | :------: |
|  id   | INTEGER |  null  |    否    |    id    |
| name  | VARCHAR |  null  |    否    |   姓名   |
| phone | VARCHAR |  null  |    否    | 电话号码 |
| mail  | VARCHAR |  null  |    否    | 电子邮箱 |

**school_course（学校课程关联）表**

|     列名      |  类型   | 默认值 | 可否为空 |   注释   |
| :-----------: | :-----: | :----: | :------: | :------: |
|      id       | INTEGER |  null  |    否    |    id    |
|   school_id   | VARCHAR |  null  |    否    |  学校id  |
| classroom_id  | VARCHAR |  null  |    否    |  教室id  |
| teaching_time |  DATE   |  null  |    否    | 上课时间 |
|  course_name  | VARCHAR |  null  |    否    | 课程名称 |

**school（学校）表**

|   列名   |  类型   | 默认值 | 可否为空 |   注释   |
| :------: | :-----: | :----: | :------: | :------: |
|    id    | INTEGER |  null  |    否    |    id    |
|   name   | VARCHAR |  null  |    否    | 学校名称 |
| location | VARCHAR |  null  |    否    | 学校地址 |

**user(（用户）表**

|      列名       |   类型   | 默认值 | 可否为空 |   注释   |
| :-------------: | :------: | :----: | :------: | :------: |
|       id        | INTEGER  |  null  |    否    |    id    |
|      name       | VARCHAR  |  null  |    否    |   姓名   |
|       sex       | VARCHAR  |  null  |    否    |   性别   |
|    Birthday     | DATETIME |  null  |    否    |   生日   |
|    School_id    | INTEGER  |  null  |    否    |  学校id  |
|      phone      | VARCHAR  |  null  |    否    | 电话号码 |
|    password     | VARCHAR  |  null  |    否    |   密码   |
|      mail       | VARCHAR  |  null  |    否    |   邮箱   |
|     balance     | DECIMAL  |  null  |    否    |   余额   |
|  create_score   | INTEGER  |  null  |    否    |  信誉分  |
| number_of_likes | INTEGER  |  null  |    否    |  点赞数  |



**school_admin（学校登录）表**

|   列名    |  类型   | 默认值 | 可否为空 |  注释  |
| :-------: | :-----: | :----: | :------: | :----: |
|    id     | INTEGER |  null  |    否    |   id   |
| shcool_id | VARCHAR |  null  |    否    | 学校id |
|  account  | VARCHAR |  null  |    否    |  账户  |
| password  | VARCHAR |  null  |    否    |  密码  |

**course（课程）表**

|       列名       |   类型   | 默认值 | 可否为空 |   注释   |
| :--------------: | :------: | :----: | :------: | :------: |
|        id        | INTEGER  |  null  |    否    |    id    |
|     user_id      | INTEGER  |  null  |    否    |  用户id  |
|       name       | VARCHAR  |  null  |    否    |   姓名   |
|  teaching_time   | DATETIME |  null  |    否    | 上课时间 |
|   course_type    | VARCHAR  |  null  |    否    | 课程类型 |
|     location     | VARCHAR  |  null  |    否    |   地点   |
|       cost       | DECIKAL  |  null  |    否    |   费用   |
| number_of_people | INTEGER  |  null  |    否    | 上课人数 |
| approval_status  | INTEGER  |  null  |    否    | 审核状态 |
|      remark      |   TEXT   |  null  |    否    |   评论   |

**audit（审核）表**

|      列名      |  类型   | 默认值 | 可否为空 |   注释   |
| :------------: | :-----: | :----: | :------: | :------: |
|       id       | INTEGER |  null  |    否    |    id    |
|   course_id    | INTEGER |  null  |    否    |   姓名   |
| approval_staus | INTEGER |  null  |    否    | 审核状态 |
|     remark     | VARCHAR |  null  |    否    | 审核内容 |



**curriculum_evaluation（课程评价）表**

|        列名        |   类型   | 默认值 | 可否为空 |    注释    |
| :----------------: | :------: | :----: | :------: | :--------: |
|         id         | INTEGER  |  null  |    否    | 课程评价id |
|     course_id      | INTEGER  |  null  |    否    |   课程id   |
|      user_id       | VARCHAR  |  null  |    否    |   用户id   |
|        TIME        | DATETIME |  null  |    否    |    时间    |
| overall_evaluation | INTEGER  |  null  |    否    |  总体评价  |
|  learning_effect   | INTEGER  |  null  |    否    |  学习效果  |
|   course_quality   | INTEGER  |  null  |    否    |  学习质量  |
|   teaching_level   | INTEGER  |  null  |    否    |  教学水平  |
|      context       |   TEXT   |  null  |    否    |  评价内容  |











