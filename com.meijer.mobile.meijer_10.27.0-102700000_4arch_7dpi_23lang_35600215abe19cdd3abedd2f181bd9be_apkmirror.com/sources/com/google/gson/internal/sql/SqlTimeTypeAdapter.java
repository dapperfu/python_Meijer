package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes7.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    static final v f89672b = new v() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f89673a;

    private SqlTimeTypeAdapter() {
        this.f89673a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f89673a.format((Date) time);
        }
        jsonWriter.value(str);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f89673a.getTimeZone();
            try {
                try {
                    time = new Time(this.f89673a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e10);
                }
            } finally {
                this.f89673a.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
