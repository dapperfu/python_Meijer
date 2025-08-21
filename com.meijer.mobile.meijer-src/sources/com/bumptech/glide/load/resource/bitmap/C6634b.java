package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6634b implements X6.j<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f64897a;

    /* renamed from: b, reason: collision with root package name */
    private final X6.j<Bitmap> f64898b;

    @Override // X6.j
    public X6.c a(X6.g gVar) {
        return this.f64898b.a(gVar);
    }

    @Override // X6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(Z6.c<BitmapDrawable> cVar, File file, X6.g gVar) {
        return this.f64898b.b(new C6639g(cVar.get().getBitmap(), this.f64897a), file, gVar);
    }

    public C6634b(a7.d dVar, X6.j<Bitmap> jVar) {
        this.f64897a = dVar;
        this.f64898b = jVar;
    }
}
