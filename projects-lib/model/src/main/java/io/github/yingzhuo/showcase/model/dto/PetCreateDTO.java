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

package io.github.yingzhuo.showcase.model.dto;

import io.github.yingzhuo.showcase.model.entity.Sex;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @see io.github.yingzhuo.showcase.model.entity.Pet
 */
@Data
@Schema(description = "宠物创建请求参数")
public class PetCreateDTO implements Serializable {

	@Schema(
		description = "ID",
		example = "00000000000000000000000000000001",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotBlank(message = "ID无可为空")
	private String id;

	@Schema(
		description = "宠物名称",
		example = "喵喵",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotBlank(message = "名称不可为空")
	private String name;

	@Schema(
		description = "出生日期",
		examples = {
			"2025-12-25",
			"2025/12/25"
		},
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "出生日期不可为空")
	private LocalDate dob;

	@Schema(
		description = "性别",
		requiredMode = Schema.RequiredMode.REQUIRED
	)
	@NotNull(message = "性别不可为空")
	private Sex sex;

}
