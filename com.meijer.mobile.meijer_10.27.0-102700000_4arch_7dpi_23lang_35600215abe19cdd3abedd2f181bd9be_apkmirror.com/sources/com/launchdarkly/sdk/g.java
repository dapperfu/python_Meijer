package com.launchdarkly.sdk;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes7.dex */
abstract class g {

    /* JADX INFO: Add missing generic type declarations: [U] */
    static class a<U> implements Iterable<U> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f91304a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f91305b;

        /* renamed from: com.launchdarkly.sdk.g$a$a, reason: collision with other inner class name */
        class C1303a implements Iterator<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f91306a;

            C1303a(Iterator it) {
                this.f91306a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f91306a.hasNext();
            }

            @Override // java.util.Iterator
            public U next() {
                return (U) a.this.f91305b.apply(this.f91306a.next());
            }
        }

        a(Iterable iterable, f fVar) {
            this.f91304a = iterable;
            this.f91305b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<U> iterator() {
            return new C1303a(this.f91304a.iterator());
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91308a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f91308a = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91308a[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static String b(JsonReader jsonReader) throws IOException {
        if (b.f91308a[jsonReader.peek().ordinal()] == 1) {
            return jsonReader.nextString();
        }
        throw new JsonParseException("expected string value");
    }

    static String c(JsonReader jsonReader) throws IOException {
        int i10 = b.f91308a[jsonReader.peek().ordinal()];
        if (i10 == 1) {
            return jsonReader.nextString();
        }
        if (i10 != 2) {
            throw new JsonParseException("expected string value or null");
        }
        jsonReader.nextNull();
        return null;
    }

    static <T, U> Iterable<U> d(Iterable<T> iterable, f<T, U> fVar) {
        return new a(iterable, fVar);
    }

    static <T extends Enum<T>> T a(Class<T> cls, JsonReader jsonReader) throws IOException {
        String strB = b(jsonReader);
        try {
            return (T) Enum.valueOf(cls, strB);
        } catch (IllegalArgumentException unused) {
            throw new JsonParseException(String.format("unsupported value \"%s\" for %s", strB, cls));
        }
    }
}
