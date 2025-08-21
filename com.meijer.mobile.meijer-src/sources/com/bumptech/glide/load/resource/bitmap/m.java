package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class m extends AbstractC6640h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64908b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(X6.e.f41646a);

    @Override // X6.e
    public int hashCode() {
        return -670243078;
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64908b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6640h
    protected Bitmap transform(a7.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.c(dVar, bitmap, i10, i11);
    }
}
