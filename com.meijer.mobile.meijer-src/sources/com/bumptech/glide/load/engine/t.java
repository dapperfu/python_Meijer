package com.bumptech.glide.load.engine;

import a7.InterfaceC5665b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class t implements X6.e {

    /* renamed from: j, reason: collision with root package name */
    private static final r7.h<Class<?>, byte[]> f64838j = new r7.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5665b f64839b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.e f64840c;

    /* renamed from: d, reason: collision with root package name */
    private final X6.e f64841d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64842e;

    /* renamed from: f, reason: collision with root package name */
    private final int f64843f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f64844g;

    /* renamed from: h, reason: collision with root package name */
    private final X6.g f64845h;

    /* renamed from: i, reason: collision with root package name */
    private final X6.k<?> f64846i;

    private byte[] a() {
        r7.h<Class<?>, byte[]> hVar = f64838j;
        byte[] bArrG = hVar.g(this.f64844g);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f64844g.getName().getBytes(X6.e.f41646a);
        hVar.k(this.f64844g, bytes);
        return bytes;
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f64843f == tVar.f64843f && this.f64842e == tVar.f64842e && r7.l.d(this.f64846i, tVar.f64846i) && this.f64844g.equals(tVar.f64844g) && this.f64840c.equals(tVar.f64840c) && this.f64841d.equals(tVar.f64841d) && this.f64845h.equals(tVar.f64845h)) {
                return true;
            }
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        int iHashCode = (((((this.f64840c.hashCode() * 31) + this.f64841d.hashCode()) * 31) + this.f64842e) * 31) + this.f64843f;
        X6.k<?> kVar = this.f64846i;
        if (kVar != null) {
            iHashCode = (iHashCode * 31) + kVar.hashCode();
        }
        return (((iHashCode * 31) + this.f64844g.hashCode()) * 31) + this.f64845h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f64840c + ", signature=" + this.f64841d + ", width=" + this.f64842e + ", height=" + this.f64843f + ", decodedResourceClass=" + this.f64844g + ", transformation='" + this.f64846i + "', options=" + this.f64845h + '}';
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f64839b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f64842e).putInt(this.f64843f).array();
        this.f64841d.updateDiskCacheKey(messageDigest);
        this.f64840c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        X6.k<?> kVar = this.f64846i;
        if (kVar != null) {
            kVar.updateDiskCacheKey(messageDigest);
        }
        this.f64845h.updateDiskCacheKey(messageDigest);
        messageDigest.update(a());
        this.f64839b.put(bArr);
    }

    t(InterfaceC5665b interfaceC5665b, X6.e eVar, X6.e eVar2, int i10, int i11, X6.k<?> kVar, Class<?> cls, X6.g gVar) {
        this.f64839b = interfaceC5665b;
        this.f64840c = eVar;
        this.f64841d = eVar2;
        this.f64842e = i10;
        this.f64843f = i11;
        this.f64846i = kVar;
        this.f64844g = cls;
        this.f64845h = gVar;
    }
}
