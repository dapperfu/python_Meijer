package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class n extends AbstractC6515h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64069b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(V6.e.f36934a);

    @Override // V6.e
    public int hashCode() {
        return 1101716364;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64069b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6515h
    protected Bitmap transform(Y6.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.d(dVar, bitmap, i10, i11);
    }
}
