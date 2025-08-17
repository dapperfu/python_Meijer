package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6509b implements V6.j<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.d f64057a;

    /* renamed from: b, reason: collision with root package name */
    private final V6.j<Bitmap> f64058b;

    @Override // V6.j
    public V6.c a(V6.g gVar) {
        return this.f64058b.a(gVar);
    }

    @Override // V6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(X6.c<BitmapDrawable> cVar, File file, V6.g gVar) {
        return this.f64058b.b(new C6514g(cVar.get().getBitmap(), this.f64057a), file, gVar);
    }

    public C6509b(Y6.d dVar, V6.j<Bitmap> jVar) {
        this.f64057a = dVar;
        this.f64058b = jVar;
    }
}
