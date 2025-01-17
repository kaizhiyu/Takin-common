/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.takin.definition.config.http;

/**
 * @author shiyajian
 * create: 2020-12-09
 */
public final class takinHttpConfigConstants {

    private takinHttpConfigConstants() { /* no instance */ }

    /**
     * 统一前缀
     */
    public static final String PREFIX_URL = "/api";

    /**
     * 白名单查询接口
     */
    public static final String WHITELIST_URL = "/confcenter/query/bwlist";

    /**
     * 白名单查询接口 / 读取file
     */
    public static final String WHITELIST_FILE_URL = "/confcenter/wbmnt/query";

    /**
     * 拉取影子库表配置的接口
     */
    public static final String SHADOW_DB_TABLE_URL = "/link/ds/configs/pull";

    /**
     * 查询影子job的接口
     */
    public static final String takin_SHADOW_JOB_URL = "/shadow/job/queryByAppName";

    /**
     * 上报错误的影子job接口
     */
    public static final String takin_REPORT_ERROR_SHADOW_JOB_URL = "/shadow/job/update";

    /**
     * 上报应用的接口
     */
    public static final String APP_INSERT_URL = "/application/center/app/info";

    /**
     * 上报应用状态的接口
     */
    public static final String UPLOAD_ACCESS_STATUS_URL = "/application/agent/access/status";

    /**
     * 上传应用信息接口
     */
    public static final String UPLOAD_APP_INFO_URL = "/confcenter/interface/add/interfaceData";

    /**
     * 是否需要上传应用信息接口
     */
    public static final String UPLOAD_URL = "/confcenter/interface/query/needUpload";

    /**
     * 更新应用agent版本的接口
     */
    public static final String AGENT_VERSION_URL = "/confcenter/applicationmnt/update/applicationAgent";

    /**
     * 全局压测开关
     */
    public static final String APP_PRESSURE_SWITCH_STATUS_URL = "/application/center/app/switch/agent";

    /**
     * 白名单开关
     */
    public static final String APP_WHITE_LIST_SWITCH_STATUS_URL = "/global/switch/whitelist";

    /**
     * 挡板配置
     */
    public static final String GUARD_URL = "/link/guard/guardmanage";

    public static final String BWLISTMETRIC_URL = "/confcenter/wbmnt/query/bwlistmetric";

    public static final String REGISTER_URL = "/agent/api/register";

    /**
     * 中间件状态
     */
    public static final String MIDDLE_STAUTS_URL = "/application/agent/middle/status";


    public static final String ROCKETMQ_ISO_URL = "/isolation/query/rockemtMqIsoQuery";

    /**
     * 性能分析
     */
    public static final String PERFORMANCE_BASE_URL = "/agent/performance/basedata";
    public static final String PERFORMANCE_TRACE_URL = "/traceManage/uploadTraceInfo";

}
