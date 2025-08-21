package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes14.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader jsonReaderU = this.gson.u(responseBody.charStream());
        try {
            T t10 = this.adapter.read(jsonReaderU);
            if (jsonReaderU.peek() == JsonToken.END_DOCUMENT) {
                return t10;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }
}
