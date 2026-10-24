package stark.dataworks.basic.data.json;

import junit.framework.TestCase;

import java.time.Instant;
import java.util.Map;

public class JsonSerializerTest extends TestCase
{
    public void testSerializeInstantAsIsoTimestamp()
    {
        String serialized = JsonSerializer.serialize(Map.of(
            "creationTime", Instant.parse("2026-10-24T00:00:00Z")));

        assertNotNull(serialized);
        assertTrue(serialized.contains("\"creationTime\":\"2026-10-24T00:00:00Z\""));
    }
}
