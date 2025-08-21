package sc;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: sc.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17059v {
    public abstract long c();

    static AbstractC17059v a(long j10) {
        return new C17049l(j10);
    }

    public static AbstractC17059v b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? a(Long.parseLong(jsonReader.nextString())) : a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
