package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.E;
import com.google.gson.internal.y;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import pg.C16423a;

/* loaded from: classes8.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final v f90353c = new v() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new DefaultDateTypeAdapter(a.f90356b, i10, i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a<T> f90354a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f90355b;

    public static abstract class a<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final a<Date> f90356b = new C1299a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f90357a;

        protected abstract T d(Date date);

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        class C1299a extends a<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected Date d(Date date) {
                return date;
            }

            C1299a(Class cls) {
                super(cls);
            }
        }

        private v c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f90357a, defaultDateTypeAdapter);
        }

        public final v a(int i10, int i11) {
            return c(new DefaultDateTypeAdapter<>(this, i10, i11));
        }

        public final v b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected a(Class<T> cls) {
            this.f90357a = cls;
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.f90355b.get(0);
        synchronized (this.f90355b) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f90355b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(a<T> aVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f90355b = arrayList;
        Objects.requireNonNull(aVar);
        this.f90354a = aVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date a(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        synchronized (this.f90355b) {
            try {
                Iterator<DateFormat> it = this.f90355b.iterator();
                while (it.hasNext()) {
                    DateFormat next = it.next();
                    TimeZone timeZone = next.getTimeZone();
                    try {
                        try {
                            return next.parse(strNextString);
                        } finally {
                            next.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        next.setTimeZone(timeZone);
                    }
                }
                try {
                    return C16423a.c(strNextString, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) this.f90354a.d(a(jsonReader));
    }

    private DefaultDateTypeAdapter(a<T> aVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f90355b = arrayList;
        Objects.requireNonNull(aVar);
        this.f90354a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (y.c()) {
            arrayList.add(E.c(i10, i11));
        }
    }
}
