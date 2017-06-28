/**
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.stage.plugin.navigator;

import com.streamsets.pipeline.api.lineage.LineageEvent;
import com.streamsets.pipeline.api.lineage.LineagePublisher;
import com.streamsets.pipeline.api.lineage.LineagePublisherDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

@LineagePublisherDef(
  label = "Navigator",
  description = "Publishes lineage data to Cloudera Navigator."
)
public class NavigatorLineagePublisher implements LineagePublisher {

  private static final Logger LOG = LoggerFactory.getLogger(NavigatorLineagePublisher.class);

  @Override
  public List<ConfigIssue> init(Context context) {
    LOG.info("Navigator Lineage Plugin initializing");
    return Collections.emptyList();
  }

  @Override
  public void run(List<LineageEvent> events) {

  }

  @Override
  public void destroy() {
    LOG.info("Navigator Lineage Plugin destroying");
  }
}
