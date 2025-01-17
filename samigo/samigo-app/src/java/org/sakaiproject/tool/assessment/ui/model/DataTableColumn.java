/*
 * Copyright (c) 2003-2023 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.tool.assessment.ui.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataTableColumn {


    public static final String TYPE_HTML = "html";
    public static final String TYPE_HTML_NUM = "html-num";
    public static final String TYPE_NUM = "numeric";
    public static final String TYPE_ANY_NUM = "any-number";
    public static final String TYPE_IP_ADDRESS = "ip-address";


    private boolean orderable;
    private boolean searchable;
    private String type;
}
