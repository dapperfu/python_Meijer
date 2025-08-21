package com.launchdarkly.sdk;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes8.dex */
abstract class g {

    /* JADX INFO: Add missing generic type declarations: [U] */
    static class a<U> implements Iterable<U> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f92143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f92144b;

        /* renamed from: com.launchdarkly.sdk.g$a$a, reason: collision with other inner class name */
        class C1312a implements Iterator<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f92145a;

            C1312a(Iterator it) {
                this.f92145a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f92145a.hasNext();
            }

            @Override // java.util.Iterator
            public U next() {
                return (U) a.this.f92144b.apply(this.f92145a.next());
            }
        }

        a(Iterable iterable, f fVar) {
            this.f92143a = iterable;
            this.f92144b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<U> iterator() {
            return new C1312a(this.f92143a.iterator());
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92147a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f92147a = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92147a[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static String b(JsonReader jsonReader) throws IOException {
        if (b.f92147a[jsonReader.peek().ordinal()] == 1) {
            return jsonReader.nextString();
        }
        throw new JsonParseException("expected string value");
    }

    static String c(JsonReader jsonReader) throws IOException {
        int i10 = b.f92147a[jsonReader.peek().ordinal()];
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
