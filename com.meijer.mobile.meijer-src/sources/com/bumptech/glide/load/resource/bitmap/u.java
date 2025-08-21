package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class u implements X6.k<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private final X6.k<Bitmap> f64937b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64938c;

    public X6.k<BitmapDrawable> a() {
        return this;
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f64937b.equals(((u) obj).f64937b);
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return this.f64937b.hashCode();
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f64937b.updateDiskCacheKey(messageDigest);
    }

    public u(X6.k<Bitmap> kVar, boolean z10) {
        this.f64937b = kVar;
        this.f64938c = z10;
    }

    private Z6.c<Drawable> b(Context context, Z6.c<Bitmap> cVar) {
        return A.e(context.getResources(), cVar);
    }

    @Override // X6.k
    public Z6.c<Drawable> transform(Context context, Z6.c<Drawable> cVar, int i10, int i11) {
        a7.d dVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = cVar.get();
        Z6.c<Bitmap> cVarA = t.a(dVarF, drawable, i10, i11);
        if (cVarA == null) {
            if (!this.f64938c) {
                return cVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        Z6.c<Bitmap> cVarTransform = this.f64937b.transform(context, cVarA, i10, i11);
        if (cVarTransform.equals(cVarA)) {
            cVarTransform.a();
            return cVar;
        }
        return b(context, cVarTransform);
    }
}
