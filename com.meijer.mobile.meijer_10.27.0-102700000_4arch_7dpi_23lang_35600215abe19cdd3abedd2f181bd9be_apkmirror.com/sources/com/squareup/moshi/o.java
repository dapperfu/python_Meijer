package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import com.squareup.moshi.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
final class o extends k {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f126382h = new Object();

    /* renamed from: g, reason: collision with root package name */
    private Object[] f126383g;

    static final class a implements Iterator<Object>, Cloneable {

        /* renamed from: a, reason: collision with root package name */
        final k.c f126384a;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f126385b;

        /* renamed from: c, reason: collision with root package name */
        int f126386c;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f126384a, this.f126385b, this.f126386c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126386c < this.f126385b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f126385b;
            int i10 = this.f126386c;
            this.f126386c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        a(k.c cVar, Object[] objArr, int i10) {
            this.f126384a = cVar;
            this.f126385b = objArr;
            this.f126386c = i10;
        }
    }

    o(Object obj) {
        int[] iArr = this.f126348b;
        int i10 = this.f126347a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f126383g = objArr;
        this.f126347a = i10 + 1;
        objArr[i10] = obj;
    }

    private void O(Object obj) {
        int i10 = this.f126347a;
        if (i10 == this.f126383g.length) {
            if (i10 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            int[] iArr = this.f126348b;
            this.f126348b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f126349c;
            this.f126349c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f126350d;
            this.f126350d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f126383g;
            this.f126383g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f126383g;
        int i11 = this.f126347a;
        this.f126347a = i11 + 1;
        objArr2[i11] = obj;
    }

    private void R() {
        int i10 = this.f126347a;
        int i11 = i10 - 1;
        this.f126347a = i11;
        Object[] objArr = this.f126383g;
        objArr[i11] = null;
        this.f126348b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f126350d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    O(it.next());
                }
            }
        }
    }

    private <T> T T(Class<T> cls, k.c cVar) throws IOException {
        int i10 = this.f126347a;
        Object obj = i10 != 0 ? this.f126383g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == k.c.NULL) {
            return null;
        }
        if (obj == f126382h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw K(obj, cVar);
    }

    @Override // com.squareup.moshi.k
    public int A(k.b bVar) throws IOException {
        int i10 = this.f126347a;
        Object obj = i10 != 0 ? this.f126383g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f126382h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f126354a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f126354a[i11].equals(str)) {
                R();
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.k
    public void H() throws IOException {
        if (!this.f126352f) {
            this.f126383g[this.f126347a - 1] = ((Map.Entry) T(Map.Entry.class, k.c.NAME)).getValue();
            this.f126349c[this.f126347a - 2] = BuildConfig.TRAVIS;
            return;
        }
        k.c cVarL = l();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + cVarL + " at " + getPath());
    }

    @Override // com.squareup.moshi.k
    public void a() throws IOException {
        List list = (List) T(List.class, k.c.BEGIN_ARRAY);
        a aVar = new a(k.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f126383g;
        int i10 = this.f126347a;
        objArr[i10 - 1] = aVar;
        this.f126348b[i10 - 1] = 1;
        this.f126350d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            O(aVar.next());
        }
    }

    @Override // com.squareup.moshi.k
    public void b() throws IOException {
        Map map = (Map) T(Map.class, k.c.BEGIN_OBJECT);
        a aVar = new a(k.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f126383g;
        int i10 = this.f126347a;
        objArr[i10 - 1] = aVar;
        this.f126348b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            O(aVar.next());
        }
    }

    @Override // com.squareup.moshi.k
    public void c() throws IOException {
        k.c cVar = k.c.END_ARRAY;
        a aVar = (a) T(a.class, cVar);
        if (aVar.f126384a != cVar || aVar.hasNext()) {
            throw K(aVar, cVar);
        }
        R();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.f126383g, 0, this.f126347a, (Object) null);
        this.f126383g[0] = f126382h;
        this.f126348b[0] = 8;
        this.f126347a = 1;
    }

    @Override // com.squareup.moshi.k
    public void d() throws IOException {
        k.c cVar = k.c.END_OBJECT;
        a aVar = (a) T(a.class, cVar);
        if (aVar.f126384a != cVar || aVar.hasNext()) {
            throw K(aVar, cVar);
        }
        this.f126349c[this.f126347a - 1] = null;
        R();
    }

    @Override // com.squareup.moshi.k
    public boolean hasNext() throws IOException {
        int i10 = this.f126347a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f126383g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.k
    public <T> T i() throws IOException {
        T(Void.class, k.c.NULL);
        R();
        return null;
    }

    @Override // com.squareup.moshi.k
    public k.c l() throws IOException {
        int i10 = this.f126347a;
        if (i10 == 0) {
            return k.c.END_DOCUMENT;
        }
        Object obj = this.f126383g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f126384a;
        }
        if (obj instanceof List) {
            return k.c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return k.c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return k.c.NAME;
        }
        if (obj instanceof String) {
            return k.c.STRING;
        }
        if (obj instanceof Boolean) {
            return k.c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return k.c.NUMBER;
        }
        if (obj == null) {
            return k.c.NULL;
        }
        if (obj == f126382h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw K(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.k
    public k m() {
        return new o(this);
    }

    @Override // com.squareup.moshi.k
    public boolean nextBoolean() throws IOException {
        Boolean bool = (Boolean) T(Boolean.class, k.c.BOOLEAN);
        R();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.k
    public double nextDouble() throws IOException, NumberFormatException {
        double dDoubleValue;
        k.c cVar = k.c.NUMBER;
        Object objT = T(Object.class, cVar);
        if (objT instanceof Number) {
            dDoubleValue = ((Number) objT).doubleValue();
        } else {
            if (!(objT instanceof String)) {
                throw K(objT, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objT);
            } catch (NumberFormatException unused) {
                throw K(objT, k.c.NUMBER);
            }
        }
        if (this.f126351e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            R();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public int nextInt() throws IOException, NumberFormatException {
        int iIntValueExact;
        k.c cVar = k.c.NUMBER;
        Object objT = T(Object.class, cVar);
        if (objT instanceof Number) {
            iIntValueExact = ((Number) objT).intValue();
        } else {
            if (!(objT instanceof String)) {
                throw K(objT, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objT);
                } catch (NumberFormatException unused) {
                    throw K(objT, k.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objT).intValueExact();
            }
        }
        R();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.k
    public long nextLong() throws IOException, NumberFormatException {
        long jLongValueExact;
        k.c cVar = k.c.NUMBER;
        Object objT = T(Object.class, cVar);
        if (objT instanceof Number) {
            jLongValueExact = ((Number) objT).longValue();
        } else {
            if (!(objT instanceof String)) {
                throw K(objT, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objT);
                } catch (NumberFormatException unused) {
                    throw K(objT, k.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objT).longValueExact();
            }
        }
        R();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.k
    public String nextName() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) T(Map.Entry.class, k.c.NAME);
        String strZ = Z(entry);
        this.f126383g[this.f126347a - 1] = entry.getValue();
        this.f126349c[this.f126347a - 2] = strZ;
        return strZ;
    }

    @Override // com.squareup.moshi.k
    public String nextString() throws IOException {
        int i10 = this.f126347a;
        Object obj = i10 != 0 ? this.f126383g[i10 - 1] : null;
        if (obj instanceof String) {
            R();
            return (String) obj;
        }
        if (obj instanceof Number) {
            R();
            return obj.toString();
        }
        if (obj == f126382h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw K(obj, k.c.STRING);
    }

    @Override // com.squareup.moshi.k
    public void skipValue() throws IOException {
        if (this.f126352f) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + getPath());
        }
        int i10 = this.f126347a;
        if (i10 > 1) {
            this.f126349c[i10 - 2] = BuildConfig.TRAVIS;
        }
        Object obj = i10 != 0 ? this.f126383g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f126383g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                R();
                return;
            }
            throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public int z(k.b bVar) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) T(Map.Entry.class, k.c.NAME);
        String strZ = Z(entry);
        int length = bVar.f126354a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f126354a[i10].equals(strZ)) {
                this.f126383g[this.f126347a - 1] = entry.getValue();
                this.f126349c[this.f126347a - 2] = strZ;
                return i10;
            }
        }
        return -1;
    }

    private String Z(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw K(key, k.c.NAME);
    }

    @Override // com.squareup.moshi.k
    public void p() throws IOException {
        if (hasNext()) {
            O(nextName());
        }
    }

    o(o oVar) {
        super(oVar);
        this.f126383g = (Object[]) oVar.f126383g.clone();
        for (int i10 = 0; i10 < this.f126347a; i10++) {
            Object[] objArr = this.f126383g;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
