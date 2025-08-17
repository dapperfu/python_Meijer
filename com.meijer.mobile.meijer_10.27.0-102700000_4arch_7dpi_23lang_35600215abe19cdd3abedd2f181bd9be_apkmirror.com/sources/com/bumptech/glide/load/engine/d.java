package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class d implements V6.e {

    /* renamed from: b, reason: collision with root package name */
    private final V6.e f63820b;

    /* renamed from: c, reason: collision with root package name */
    private final V6.e f63821c;

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f63820b.equals(dVar.f63820b) && this.f63821c.equals(dVar.f63821c)) {
                return true;
            }
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return (this.f63820b.hashCode() * 31) + this.f63821c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f63820b + ", signature=" + this.f63821c + '}';
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f63820b.updateDiskCacheKey(messageDigest);
        this.f63821c.updateDiskCacheKey(messageDigest);
    }

    d(V6.e eVar, V6.e eVar2) {
        this.f63820b = eVar;
        this.f63821c = eVar2;
    }
}
