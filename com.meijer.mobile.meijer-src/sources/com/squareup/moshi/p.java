package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
final class p extends q {

    /* renamed from: j, reason: collision with root package name */
    Object[] f127339j = new Object[32];

    /* renamed from: k, reason: collision with root package name */
    private String f127340k;

    @Override // com.squareup.moshi.q
    public q J(double d10) throws IOException {
        if (!this.f127346f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f127348h) {
            this.f127348h = false;
            return l(Double.toString(d10));
        }
        Y(Double.valueOf(d10));
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q K(long j10) throws IOException {
        if (this.f127348h) {
            this.f127348h = false;
            return l(Long.toString(j10));
        }
        Y(Long.valueOf(j10));
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q O(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return K(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return J(number.doubleValue());
        }
        if (number == null) {
            return m();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f127348h) {
            this.f127348h = false;
            return l(bigDecimal.toString());
        }
        Y(bigDecimal);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q R(String str) throws IOException {
        if (this.f127348h) {
            this.f127348h = false;
            return l(str);
        }
        Y(str);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q T(boolean z10) throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        Y(Boolean.valueOf(z10));
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q a() throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f127341a;
        int i11 = this.f127349i;
        if (i10 == i11 && this.f127342b[i10 - 1] == 1) {
            this.f127349i = ~i11;
            return this;
        }
        c();
        ArrayList arrayList = new ArrayList();
        Y(arrayList);
        Object[] objArr = this.f127339j;
        int i12 = this.f127341a;
        objArr[i12] = arrayList;
        this.f127344d[i12] = 0;
        z(1);
        return this;
    }

    @Override // com.squareup.moshi.q
    public q b() throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f127341a;
        int i11 = this.f127349i;
        if (i10 == i11 && this.f127342b[i10 - 1] == 3) {
            this.f127349i = ~i11;
            return this;
        }
        c();
        r rVar = new r();
        Y(rVar);
        this.f127339j[this.f127341a] = rVar;
        z(3);
        return this;
    }

    public Object b0() {
        int i10 = this.f127341a;
        if (i10 > 1 || (i10 == 1 && this.f127342b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f127339j[0];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f127341a;
        if (i10 > 1 || (i10 == 1 && this.f127342b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f127341a = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f127341a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.q
    public q l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f127341a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (u() != 3 || this.f127340k != null || this.f127348h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f127340k = str;
        this.f127343c[this.f127341a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q m() throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        Y(null);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    p() {
        z(6);
    }

    private p Y(Object obj) {
        String str;
        Object objPut;
        int iU = u();
        int i10 = this.f127341a;
        if (i10 == 1) {
            if (iU == 6) {
                this.f127342b[i10 - 1] = 7;
                this.f127339j[i10 - 1] = obj;
                return this;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
        if (iU == 3 && (str = this.f127340k) != null) {
            if ((obj == null && !this.f127347g) || (objPut = ((Map) this.f127339j[i10 - 1]).put(str, obj)) == null) {
                this.f127340k = null;
                return this;
            }
            throw new IllegalArgumentException("Map key '" + this.f127340k + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
        }
        if (iU == 1) {
            ((List) this.f127339j[i10 - 1]).add(obj);
            return this;
        }
        if (iU == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.q
    public q d() throws IOException {
        if (u() == 1) {
            int i10 = this.f127341a;
            int i11 = this.f127349i;
            if (i10 == (~i11)) {
                this.f127349i = ~i11;
                return this;
            }
            int i12 = i10 - 1;
            this.f127341a = i12;
            this.f127339j[i12] = null;
            int[] iArr = this.f127344d;
            int i13 = i10 - 2;
            iArr[i13] = iArr[i13] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.q
    public q g() throws IOException {
        if (u() == 3) {
            if (this.f127340k == null) {
                int i10 = this.f127341a;
                int i11 = this.f127349i;
                if (i10 == (~i11)) {
                    this.f127349i = ~i11;
                    return this;
                }
                this.f127348h = false;
                int i12 = i10 - 1;
                this.f127341a = i12;
                this.f127339j[i12] = null;
                this.f127343c[i12] = null;
                int[] iArr = this.f127344d;
                int i13 = i10 - 2;
                iArr[i13] = iArr[i13] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.f127340k);
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
