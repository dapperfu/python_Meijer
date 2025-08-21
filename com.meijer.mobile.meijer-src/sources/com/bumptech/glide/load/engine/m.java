package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
class m implements X6.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f64801b;

    /* renamed from: c, reason: collision with root package name */
    private final int f64802c;

    /* renamed from: d, reason: collision with root package name */
    private final int f64803d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f64804e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f64805f;

    /* renamed from: g, reason: collision with root package name */
    private final X6.e f64806g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, X6.k<?>> f64807h;

    /* renamed from: i, reason: collision with root package name */
    private final X6.g f64808i;

    /* renamed from: j, reason: collision with root package name */
    private int f64809j;

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f64801b.equals(mVar.f64801b) && this.f64806g.equals(mVar.f64806g) && this.f64803d == mVar.f64803d && this.f64802c == mVar.f64802c && this.f64807h.equals(mVar.f64807h) && this.f64804e.equals(mVar.f64804e) && this.f64805f.equals(mVar.f64805f) && this.f64808i.equals(mVar.f64808i)) {
                return true;
            }
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        if (this.f64809j == 0) {
            int iHashCode = this.f64801b.hashCode();
            this.f64809j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f64806g.hashCode()) * 31) + this.f64802c) * 31) + this.f64803d;
            this.f64809j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f64807h.hashCode();
            this.f64809j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f64804e.hashCode();
            this.f64809j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f64805f.hashCode();
            this.f64809j = iHashCode5;
            this.f64809j = (iHashCode5 * 31) + this.f64808i.hashCode();
        }
        return this.f64809j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f64801b + ", width=" + this.f64802c + ", height=" + this.f64803d + ", resourceClass=" + this.f64804e + ", transcodeClass=" + this.f64805f + ", signature=" + this.f64806g + ", hashCode=" + this.f64809j + ", transformations=" + this.f64807h + ", options=" + this.f64808i + '}';
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    m(Object obj, X6.e eVar, int i10, int i11, Map<Class<?>, X6.k<?>> map, Class<?> cls, Class<?> cls2, X6.g gVar) {
        this.f64801b = r7.k.d(obj);
        this.f64806g = (X6.e) r7.k.e(eVar, "Signature must not be null");
        this.f64802c = i10;
        this.f64803d = i11;
        this.f64807h = (Map) r7.k.d(map);
        this.f64804e = (Class) r7.k.e(cls, "Resource class must not be null");
        this.f64805f = (Class) r7.k.e(cls2, "Transcode class must not be null");
        this.f64808i = (X6.g) r7.k.d(gVar);
    }
}
