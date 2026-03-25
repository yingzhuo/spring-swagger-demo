/*
 * Copyright 2022-2026 the original author or authors.
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

package io.github.yingzhuo.showcase.core.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Schema(description = "用户信息响应数据")
public class UserVO implements Serializable {

	@Schema(description = "用户ID", example = "1001", accessMode = Schema.AccessMode.READ_ONLY)
	private Long id;

	@Schema(description = "用户名", example = "zhangsan")
	private String username;

	@Schema(description = "邮箱", example = "zhangsan@example.com")
	private String email;

	@Schema(description = "注册时间", example = "2023-01-01T12:00:00")
	private LocalDateTime createTime;

}
