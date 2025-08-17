package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6514g implements X6.c<Bitmap>, X6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f64063a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.d f64064b;

    public static C6514g e(Bitmap bitmap, Y6.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C6514g(bitmap, dVar);
    }

    @Override // X6.c
    public void a() {
        this.f64064b.c(this.f64063a);
    }

    @Override // X6.b
    public void b() {
        this.f64063a.prepareToDraw();
    }

    @Override // X6.c
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // X6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f64063a;
    }

    @Override // X6.c
    public int getSize() {
        return p7.l.h(this.f64063a);
    }

    public C6514g(Bitmap bitmap, Y6.d dVar) {
        this.f64063a = (Bitmap) p7.k.e(bitmap, "Bitmap must not be null");
        this.f64064b = (Y6.d) p7.k.e(dVar, "BitmapPool must not be null");
    }
}
