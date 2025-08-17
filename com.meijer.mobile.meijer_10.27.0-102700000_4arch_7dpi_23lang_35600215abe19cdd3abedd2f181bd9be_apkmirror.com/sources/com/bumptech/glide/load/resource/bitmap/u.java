package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class u implements V6.k<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private final V6.k<Bitmap> f64097b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64098c;

    public V6.k<BitmapDrawable> a() {
        return this;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f64097b.equals(((u) obj).f64097b);
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return this.f64097b.hashCode();
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f64097b.updateDiskCacheKey(messageDigest);
    }

    public u(V6.k<Bitmap> kVar, boolean z10) {
        this.f64097b = kVar;
        this.f64098c = z10;
    }

    private X6.c<Drawable> b(Context context, X6.c<Bitmap> cVar) {
        return A.e(context.getResources(), cVar);
    }

    @Override // V6.k
    public X6.c<Drawable> transform(Context context, X6.c<Drawable> cVar, int i10, int i11) {
        Y6.d dVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = cVar.get();
        X6.c<Bitmap> cVarA = t.a(dVarF, drawable, i10, i11);
        if (cVarA == null) {
            if (!this.f64098c) {
                return cVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        X6.c<Bitmap> cVarTransform = this.f64097b.transform(context, cVarA, i10, i11);
        if (cVarTransform.equals(cVarA)) {
            cVarTransform.a();
            return cVar;
        }
        return b(context, cVarTransform);
    }
}
