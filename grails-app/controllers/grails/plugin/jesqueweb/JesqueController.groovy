package grails.plugin.jesqueweb

import grails.plugin.jesque.TriggerDaoService
import net.greghaines.jesque.Config
import net.greghaines.jesque.meta.dao.FailureDAO
import net.greghaines.jesque.meta.dao.KeysDAO
import net.greghaines.jesque.meta.dao.QueueInfoDAO
import net.greghaines.jesque.meta.dao.WorkerInfoDAO
import net.greghaines.jesque.utils.VersionUtils

abstract class JesqueController {

    Config jesqueConfig
    QueueInfoDAO queueInfoDao
    FailureDAO failureDao
    WorkerInfoDAO workerInfoDao
    KeysDAO keysDao
    def scheduledJobDaoService
    TriggerDaoService triggerDaoService

    def afterInterceptor = { model ->
        model.version = VersionUtils.version
        model.namespace = jesqueConfig.namespace
        model.redisUri = jesqueConfig.URI
    }

}
