package io.mosip.registrationProcessor.perf.schema.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchemaObjectList {

	private List<SchemaObjectElement> objectList;
}
