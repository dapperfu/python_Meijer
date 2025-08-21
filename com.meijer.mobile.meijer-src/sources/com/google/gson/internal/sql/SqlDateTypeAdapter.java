package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes8.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    static final v f90512b = new v() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f90513a;

    private SqlDateTypeAdapter() {
        this.f90513a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f90513a.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f90513a.getTimeZone();
            try {
                try {
                    date = new Date(this.f90513a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } finally {
                this.f90513a.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
