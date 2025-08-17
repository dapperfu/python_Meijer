package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class w extends AbstractC6515h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f64099b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(V6.e.f36934a);

    @Override // V6.e
    public int hashCode() {
        return 1572326941;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        return obj instanceof w;
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f64099b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC6515h
    protected Bitmap transform(Y6.d dVar, Bitmap bitmap, int i10, int i11) {
        return F.f(dVar, bitmap, i10, i11);
    }
}
