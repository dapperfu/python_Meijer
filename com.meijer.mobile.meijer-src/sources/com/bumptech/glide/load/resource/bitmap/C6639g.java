package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6639g implements Z6.c<Bitmap>, Z6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f64903a;

    /* renamed from: b, reason: collision with root package name */
    private final a7.d f64904b;

    public static C6639g e(Bitmap bitmap, a7.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C6639g(bitmap, dVar);
    }

    @Override // Z6.c
    public void a() {
        this.f64904b.c(this.f64903a);
    }

    @Override // Z6.b
    public void b() {
        this.f64903a.prepareToDraw();
    }

    @Override // Z6.c
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // Z6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f64903a;
    }

    @Override // Z6.c
    public int getSize() {
        return r7.l.h(this.f64903a);
    }

    public C6639g(Bitmap bitmap, a7.d dVar) {
        this.f64903a = (Bitmap) r7.k.e(bitmap, "Bitmap must not be null");
        this.f64904b = (a7.d) r7.k.e(dVar, "BitmapPool must not be null");
    }
}
