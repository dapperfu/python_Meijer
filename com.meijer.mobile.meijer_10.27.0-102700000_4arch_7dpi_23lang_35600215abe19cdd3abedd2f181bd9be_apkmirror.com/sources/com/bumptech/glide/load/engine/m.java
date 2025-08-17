package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
class m implements V6.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f63961b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63962c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63963d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f63964e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f63965f;

    /* renamed from: g, reason: collision with root package name */
    private final V6.e f63966g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, V6.k<?>> f63967h;

    /* renamed from: i, reason: collision with root package name */
    private final V6.g f63968i;

    /* renamed from: j, reason: collision with root package name */
    private int f63969j;

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f63961b.equals(mVar.f63961b) && this.f63966g.equals(mVar.f63966g) && this.f63963d == mVar.f63963d && this.f63962c == mVar.f63962c && this.f63967h.equals(mVar.f63967h) && this.f63964e.equals(mVar.f63964e) && this.f63965f.equals(mVar.f63965f) && this.f63968i.equals(mVar.f63968i)) {
                return true;
            }
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        if (this.f63969j == 0) {
            int iHashCode = this.f63961b.hashCode();
            this.f63969j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f63966g.hashCode()) * 31) + this.f63962c) * 31) + this.f63963d;
            this.f63969j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f63967h.hashCode();
            this.f63969j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f63964e.hashCode();
            this.f63969j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f63965f.hashCode();
            this.f63969j = iHashCode5;
            this.f63969j = (iHashCode5 * 31) + this.f63968i.hashCode();
        }
        return this.f63969j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f63961b + ", width=" + this.f63962c + ", height=" + this.f63963d + ", resourceClass=" + this.f63964e + ", transcodeClass=" + this.f63965f + ", signature=" + this.f63966g + ", hashCode=" + this.f63969j + ", transformations=" + this.f63967h + ", options=" + this.f63968i + '}';
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    m(Object obj, V6.e eVar, int i10, int i11, Map<Class<?>, V6.k<?>> map, Class<?> cls, Class<?> cls2, V6.g gVar) {
        this.f63961b = p7.k.d(obj);
        this.f63966g = (V6.e) p7.k.e(eVar, "Signature must not be null");
        this.f63962c = i10;
        this.f63963d = i11;
        this.f63967h = (Map) p7.k.d(map);
        this.f63964e = (Class) p7.k.e(cls, "Resource class must not be null");
        this.f63965f = (Class) p7.k.e(cls2, "Transcode class must not be null");
        this.f63968i = (V6.g) p7.k.d(gVar);
    }
}
