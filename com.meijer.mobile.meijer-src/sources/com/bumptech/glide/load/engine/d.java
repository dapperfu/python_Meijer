package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class d implements X6.e {

    /* renamed from: b, reason: collision with root package name */
    private final X6.e f64660b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.e f64661c;

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f64660b.equals(dVar.f64660b) && this.f64661c.equals(dVar.f64661c)) {
                return true;
            }
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return (this.f64660b.hashCode() * 31) + this.f64661c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f64660b + ", signature=" + this.f64661c + '}';
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f64660b.updateDiskCacheKey(messageDigest);
        this.f64661c.updateDiskCacheKey(messageDigest);
    }

    d(X6.e eVar, X6.e eVar2) {
        this.f64660b = eVar;
        this.f64661c = eVar2;
    }
}
