/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.message.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Map;

/**
 * Thread pool notify alarm.
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ThreadPoolNotifyAlarm {

    /**
     * Is alarm
     */
    @NonNull
    private Boolean isAlarm;

    /**
     * Active alarm
     */
    @NonNull
    private Integer activeAlarm;

    /**
     * Capacity alarm
     */
    @NonNull
    private Integer capacityAlarm;

    /**
     * Interval
     */
    private Integer interval;

    /**
     * Receive
     */
    private String receive;

    /**
     * Receives
     *
     * <p> Do not enable this configuration for the time being, it may be useful if you develop mailboxes in the future.
     */
    @Deprecated
    private Map<String, String> receives;
}
