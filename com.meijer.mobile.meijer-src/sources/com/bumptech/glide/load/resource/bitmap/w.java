package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class w extends AbstractC6640h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64939b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(X6.e.f41646a);

    @Override // X6.e
    public int hashCode() {
        return 1572326941;
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        return obj instanceof w;
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64939b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6640h
    protected Bitmap transform(a7.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.f(dVar, bitmap, i10, i11);
    }
}
