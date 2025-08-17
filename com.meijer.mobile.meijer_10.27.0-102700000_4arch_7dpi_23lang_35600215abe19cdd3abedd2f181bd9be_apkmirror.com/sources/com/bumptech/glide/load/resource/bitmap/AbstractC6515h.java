package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6515h implements V6.k<Bitmap> {
    @Override // V6.k
    public final X6.c<Bitmap> transform(Context context, X6.c<Bitmap> cVar, int i10, int i11) {
        if (!p7.l.t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Y6.d dVarF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = cVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(dVarF, bitmap, i10, i11);
        return bitmap.equals(bitmapTransform) ? cVar : C6514g.e(bitmapTransform, dVarF);
    }

    protected abstract Bitmap transform(Y6.d dVar, Bitmap bitmap, int i10, int i11);
}
