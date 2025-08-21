package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes4.dex */
public class D implements X6.i<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final h7.l f64867a;

    /* renamed from: b, reason: collision with root package name */
    private final a7.d f64868b;

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(Uri uri, int i10, int i11, X6.g gVar) {
        Z6.c<Drawable> cVarB = this.f64867a.b(uri, i10, i11, gVar);
        if (cVarB == null) {
            return null;
        }
        return t.a(this.f64868b, cVarB.get(), i10, i11);
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, X6.g gVar) {
        return "android.resource".equals(uri.getScheme());
    }

    public D(h7.l lVar, a7.d dVar) {
        this.f64867a = lVar;
        this.f64868b = dVar;
    }
}
