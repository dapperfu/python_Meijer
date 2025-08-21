package com.google.gson.internal.bind;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a extends JsonReader {

    /* renamed from: e, reason: collision with root package name */
    private static final Reader f90490e = new C1300a();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f90491f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Object[] f90492a;

    /* renamed from: b, reason: collision with root package name */
    private int f90493b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f90494c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f90495d;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C1300a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }

        C1300a() {
        }
    }

    private String getPath(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f90493b;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f90492a;
            Object obj = objArr[i10];
            if (obj instanceof h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f90495d[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f90494c[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return c(false);
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90496a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f90496a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90496a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90496a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90496a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(k kVar) {
        super(f90490e);
        this.f90492a = new Object[32];
        this.f90493b = 0;
        this.f90494c = new String[32];
        this.f90495d = new int[32];
        i(kVar);
    }

    private String c(boolean z10) throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        String str = (String) entry.getKey();
        this.f90494c[this.f90493b - 1] = z10 ? "<skipped>" : str;
        i(entry.getValue());
        return str;
    }

    private Object d() {
        return this.f90492a[this.f90493b - 1];
    }

    private Object g() {
        Object[] objArr = this.f90492a;
        int i10 = this.f90493b - 1;
        this.f90493b = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void i(Object obj) {
        int i10 = this.f90493b;
        Object[] objArr = this.f90492a;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f90492a = Arrays.copyOf(objArr, i11);
            this.f90495d = Arrays.copyOf(this.f90495d, i11);
            this.f90494c = (String[]) Arrays.copyOf(this.f90494c, i11);
        }
        Object[] objArr2 = this.f90492a;
        int i12 = this.f90493b;
        this.f90493b = i12 + 1;
        objArr2[i12] = obj;
    }

    private String locationString() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        i(((h) d()).iterator());
        this.f90495d[this.f90493b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        i(((m) d()).s().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f90492a = new Object[]{f90491f};
        this.f90493b = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        g();
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        this.f90494c[this.f90493b - 1] = null;
        g();
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void h() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        i(entry.getValue());
        i(new n((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean zQ = ((n) g()).q();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zQ;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f90493b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objD = d();
        if (objD instanceof Iterator) {
            boolean z10 = this.f90492a[this.f90493b - 2] instanceof m;
            Iterator it = (Iterator) objD;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            i(it.next());
            return peek();
        }
        if (objD instanceof m) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objD instanceof h) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objD instanceof n) {
            n nVar = (n) objD;
            if (nVar.y()) {
                return JsonToken.STRING;
            }
            if (nVar.v()) {
                return JsonToken.BOOLEAN;
            }
            if (nVar.x()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objD instanceof l) {
            return JsonToken.NULL;
        }
        if (objD == f90491f) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objD.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return a.class.getSimpleName() + locationString();
    }

    private void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    k b() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            k kVar = (k) d();
            skipValue();
            return kVar;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dR = ((n) d()).r();
        if (!isLenient() && (Double.isNaN(dR) || Double.isInfinite(dR))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dR);
        }
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dR;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iS = ((n) d()).s();
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iS;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jT = ((n) d()).t();
        g();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jT;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String strH = ((n) g()).h();
        int i10 = this.f90493b;
        if (i10 > 0) {
            int[] iArr = this.f90495d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strH;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i10 = b.f90496a[peek().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g();
                        int i11 = this.f90493b;
                        if (i11 > 0) {
                            int[] iArr = this.f90495d;
                            int i12 = i11 - 1;
                            iArr[i12] = iArr[i12] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                endObject();
                return;
            }
            endArray();
            return;
        }
        c(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
