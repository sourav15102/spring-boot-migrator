/*
 * Copyright 2021 - 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.sbm.boot.upgrade_27_30.report;

import org.springframework.sbm.boot.upgrade.common.UpgradeReportUtil;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

/**
 * @author Fabian Krüger
 */
@Component
public class SpringBootUpgradeReportRenderer {
    public void writeReport(String s, Path outputDir, String filename) {
        UpgradeReportUtil.writeHtml(s, outputDir, filename);
    }
}