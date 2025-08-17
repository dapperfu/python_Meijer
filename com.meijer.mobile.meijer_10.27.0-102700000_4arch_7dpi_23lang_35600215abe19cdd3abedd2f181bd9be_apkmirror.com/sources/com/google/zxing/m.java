package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f90836a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f90837b;

    /* renamed from: c, reason: collision with root package name */
    private final int f90838c;

    /* renamed from: d, reason: collision with root package name */
    private o[] f90839d;

    /* renamed from: e, reason: collision with root package name */
    private final a f90840e;

    /* renamed from: f, reason: collision with root package name */
    private Map<n, Object> f90841f;

    /* renamed from: g, reason: collision with root package name */
    private final long f90842g;

    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    public m(String str, byte[] bArr, o[] oVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j10);
    }

    public void a(o[] oVarArr) {
        o[] oVarArr2 = this.f90839d;
        if (oVarArr2 == null) {
            this.f90839d = oVarArr;
            return;
        }
        if (oVarArr == null || oVarArr.length <= 0) {
            return;
        }
        o[] oVarArr3 = new o[oVarArr2.length + oVarArr.length];
        System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
        System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
        this.f90839d = oVarArr3;
    }

    public a b() {
        return this.f90840e;
    }

    public byte[] c() {
        return this.f90837b;
    }

    public Map<n, Object> d() {
        return this.f90841f;
    }

    public o[] e() {
        return this.f90839d;
    }

    public String f() {
        return this.f90836a;
    }

    public void g(Map<n, Object> map) {
        if (map != null) {
            Map<n, Object> map2 = this.f90841f;
            if (map2 == null) {
                this.f90841f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(n nVar, Object obj) {
        if (this.f90841f == null) {
            this.f90841f = new EnumMap(n.class);
        }
        this.f90841f.put(nVar, obj);
    }

    public String toString() {
        return this.f90836a;
    }

    public m(String str, byte[] bArr, int i10, o[] oVarArr, a aVar, long j10) {
        this.f90836a = str;
        this.f90837b = bArr;
        this.f90838c = i10;
        this.f90839d = oVarArr;
        this.f90840e = aVar;
        this.f90841f = null;
        this.f90842g = j10;
    }
}
