package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class t implements V6.e {

    /* renamed from: j, reason: collision with root package name */
    private static final p7.h<Class<?>, byte[]> f63998j = new p7.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    private final Y6.b f63999b;

    /* renamed from: c, reason: collision with root package name */
    private final V6.e f64000c;

    /* renamed from: d, reason: collision with root package name */
    private final V6.e f64001d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64002e;

    /* renamed from: f, reason: collision with root package name */
    private final int f64003f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f64004g;

    /* renamed from: h, reason: collision with root package name */
    private final V6.g f64005h;

    /* renamed from: i, reason: collision with root package name */
    private final V6.k<?> f64006i;

    private byte[] a() {
        p7.h<Class<?>, byte[]> hVar = f63998j;
        byte[] bArrG = hVar.g(this.f64004g);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f64004g.getName().getBytes(V6.e.f36934a);
        hVar.k(this.f64004g, bytes);
        return bytes;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f64003f == tVar.f64003f && this.f64002e == tVar.f64002e && p7.l.d(this.f64006i, tVar.f64006i) && this.f64004g.equals(tVar.f64004g) && this.f64000c.equals(tVar.f64000c) && this.f64001d.equals(tVar.f64001d) && this.f64005h.equals(tVar.f64005h)) {
                return true;
            }
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        int iHashCode = (((((this.f64000c.hashCode() * 31) + this.f64001d.hashCode()) * 31) + this.f64002e) * 31) + this.f64003f;
        V6.k<?> kVar = this.f64006i;
        if (kVar != null) {
            iHashCode = (iHashCode * 31) + kVar.hashCode();
        }
        return (((iHashCode * 31) + this.f64004g.hashCode()) * 31) + this.f64005h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f64000c + ", signature=" + this.f64001d + ", width=" + this.f64002e + ", height=" + this.f64003f + ", decodedResourceClass=" + this.f64004g + ", transformation='" + this.f64006i + "', options=" + this.f64005h + '}';
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f63999b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f64002e).putInt(this.f64003f).array();
        this.f64001d.updateDiskCacheKey(messageDigest);
        this.f64000c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        V6.k<?> kVar = this.f64006i;
        if (kVar != null) {
            kVar.updateDiskCacheKey(messageDigest);
        }
        this.f64005h.updateDiskCacheKey(messageDigest);
        messageDigest.update(a());
        this.f63999b.put(bArr);
    }

    t(Y6.b bVar, V6.e eVar, V6.e eVar2, int i10, int i11, V6.k<?> kVar, Class<?> cls, V6.g gVar) {
        this.f63999b = bVar;
        this.f64000c = eVar;
        this.f64001d = eVar2;
        this.f64002e = i10;
        this.f64003f = i11;
        this.f64006i = kVar;
        this.f64004g = cls;
        this.f64005h = gVar;
    }
}
