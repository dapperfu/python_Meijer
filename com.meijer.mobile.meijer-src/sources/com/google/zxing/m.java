package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f91675a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f91676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91677c;

    /* renamed from: d, reason: collision with root package name */
    private o[] f91678d;

    /* renamed from: e, reason: collision with root package name */
    private final a f91679e;

    /* renamed from: f, reason: collision with root package name */
    private Map<n, Object> f91680f;

    /* renamed from: g, reason: collision with root package name */
    private final long f91681g;

    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    public m(String str, byte[] bArr, o[] oVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j10);
    }

    public void a(o[] oVarArr) {
        o[] oVarArr2 = this.f91678d;
        if (oVarArr2 == null) {
            this.f91678d = oVarArr;
            return;
        }
        if (oVarArr == null || oVarArr.length <= 0) {
            return;
        }
        o[] oVarArr3 = new o[oVarArr2.length + oVarArr.length];
        System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
        System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
        this.f91678d = oVarArr3;
    }

    public a b() {
        return this.f91679e;
    }

    public byte[] c() {
        return this.f91676b;
    }

    public Map<n, Object> d() {
        return this.f91680f;
    }

    public o[] e() {
        return this.f91678d;
    }

    public String f() {
        return this.f91675a;
    }

    public void g(Map<n, Object> map) {
        if (map != null) {
            Map<n, Object> map2 = this.f91680f;
            if (map2 == null) {
                this.f91680f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(n nVar, Object obj) {
        if (this.f91680f == null) {
            this.f91680f = new EnumMap(n.class);
        }
        this.f91680f.put(nVar, obj);
    }

    public String toString() {
        return this.f91675a;
    }

    public m(String str, byte[] bArr, int i10, o[] oVarArr, a aVar, long j10) {
        this.f91675a = str;
        this.f91676b = bArr;
        this.f91677c = i10;
        this.f91678d = oVarArr;
        this.f91679e = aVar;
        this.f91680f = null;
        this.f91681g = j10;
    }
}
