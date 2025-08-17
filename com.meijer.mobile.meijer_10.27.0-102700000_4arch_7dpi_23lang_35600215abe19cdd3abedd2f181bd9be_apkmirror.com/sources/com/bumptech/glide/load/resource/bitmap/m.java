package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class m extends AbstractC6515h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64068b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(V6.e.f36934a);

    @Override // V6.e
    public int hashCode() {
        return -670243078;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64068b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6515h
    protected Bitmap transform(Y6.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.c(dVar, bitmap, i10, i11);
    }
}
