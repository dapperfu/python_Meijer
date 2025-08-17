package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes4.dex */
public class D implements V6.i<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final f7.l f64027a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.d f64028b;

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(Uri uri, int i10, int i11, V6.g gVar) {
        X6.c<Drawable> cVarB = this.f64027a.b(uri, i10, i11, gVar);
        if (cVarB == null) {
            return null;
        }
        return t.a(this.f64028b, cVarB.get(), i10, i11);
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, V6.g gVar) {
        return "android.resource".equals(uri.getScheme());
    }

    public D(f7.l lVar, Y6.d dVar) {
        this.f64027a = lVar;
        this.f64028b = dVar;
    }
}
