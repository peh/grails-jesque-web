class JesqueUrlMappings {

    static mappings = {
        "/jesque"(controller: 'jesqueOverview')

        "/jesque/overview"(controller: 'jesqueOverview', action: 'index')

        "/jesque/working"(controller: 'jesqueWorking')
        "/jesque/working/details/$id"(controller: 'jesqueWorking', action: 'detail')

        "/jesque/failed"(controller: 'jesqueFailed')
        "/jesque/failed/retryAll"(controller: 'jesqueFailed', action: 'retryAll')
        "/jesque/failed/clear"(controller: 'jesqueFailed', action: 'clear')
        "/jesque/failed/remove/$id"(controller: 'jesqueFailed', action: 'remove')
        "/jesque/failed/requeue/$id"(controller: 'jesqueFailed', action: 'requeue')

        "/jesque/queues"(controller: 'jesqueQueues')
        "/jesque/queues/details/$id"(controller: 'jesqueQueues', action: 'detail')
        "/jesque/queues/remove/$id"(controller: 'jesqueQueues', action: 'remove')

        "/jesque/workers"(controller: 'jesqueWorkers')
        "/jesque/workers/details/$id"(controller: 'jesqueWorkers', action: 'detail')
        "/jesque/workers/remove/$id"(controller: 'jesqueWorkers', action: 'remove')

        "/jesque/stats/$id"(controller: 'jesqueStats', action: 'detail')
        "/jesque/stats/keys/$id"(controller: 'jesqueStats', action: 'keys')

        "/jesque/scheduled"(controller: 'jesqueScheduled')
    }
}
