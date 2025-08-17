package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes7.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    static final v f89674b = new v() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.r(Date.class));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter<Date> f89675a;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f89675a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date date = this.f89675a.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f89675a.write(jsonWriter, timestamp);
    }
}
