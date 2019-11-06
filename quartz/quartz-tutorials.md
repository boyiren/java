# Tutorials

官方教程，一共13课。包含一个特殊教程（[CronTrigger Tutorial](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html)）。

## [Lesson 1: Using Quartz](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-01.html)

内容比较简单，看原文就行，就不做笔记了，直接贴示例代码，添加了相关注释。

```java
// 通过 SchedulerFactory 获取实例化的 Scheduler
SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();

Scheduler sched = schedFact.getScheduler();

sched.start();

// define the job and tie it to our HelloJob class
JobDetail job = newJob(HelloJob.class)
  .withIdentity("myJob", "group1")
  .build();

// Trigger the job to run now, and then every 40 seconds
Trigger trigger = newTrigger()
  .withIdentity("myTrigger", "group1")
  .startNow()
  .withSchedule(simpleSchedule()
      .withIntervalInSeconds(40)
      .repeatForever())
  .build();

// Tell quartz to schedule the job using our trigger
sched.scheduleJob(job, trigger);
```



## [Lesson 2: The Quartz API, Jobs And Triggers](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-02.html)

### The Quartz API

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

本小节介绍了 Quartz API 的主要接口，分别是 Scheduler、Job、JobDetail、Trigger、JobBuilder、TriggerBuilder。

一个 Scheduler 的生命周期主要受到 SchedulerFactory 和 Scheduler方法shutdown() 的限制。

Scheduler 可以添加，移除、列举 Jobs 和 Triggers。



## [Lesson 3: More About Jobs & JobDetails](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-03.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 4: More About Triggers](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-04.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

### Common Trigger Attributes

### Priority

### Misfire Instructions

### Calendars

**The Calendar Interface**

**Calendar Example**

## [Lesson 5: SimpleTriggers](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-05.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 6: CronTriggers](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-06.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 7: TriggerListeners & JobListeners](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-07.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 8: SchedulerListeners](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-08.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 9: JobStores](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-09.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 10: Configuration, Resource Usage and SchedulerFactory](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-10.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 11: Advanced (Enterprise) Features](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-11.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

## [Lesson 12: Miscellaneous Features](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-12.html)

不做翻译，以下内容主要对原文档做点简单笔记，方便回顾本节原内容。

