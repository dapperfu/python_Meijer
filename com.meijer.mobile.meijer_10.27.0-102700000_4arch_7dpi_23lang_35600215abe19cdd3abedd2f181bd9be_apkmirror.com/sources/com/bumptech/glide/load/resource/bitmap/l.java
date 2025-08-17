package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class l extends AbstractC6515h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64067b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(V6.e.f36934a);

    @Override // V6.e
    public int hashCode() {
        return -599754482;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64067b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6515h
    protected Bitmap transform(Y6.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.b(dVar, bitmap, i10, i11);
    }
}
