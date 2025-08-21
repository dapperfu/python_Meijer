package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes4.dex */
public final class A implements Z6.c<BitmapDrawable>, Z6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f64858a;

    /* renamed from: b, reason: collision with root package name */
    private final Z6.c<Bitmap> f64859b;

    public static Z6.c<BitmapDrawable> e(Resources resources, Z6.c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new A(resources, cVar);
    }

    @Override // Z6.c
    public void a() {
        this.f64859b.a();
    }

    @Override // Z6.b
    public void b() {
        Z6.c<Bitmap> cVar = this.f64859b;
        if (cVar instanceof Z6.b) {
            ((Z6.b) cVar).b();
        }
    }

    @Override // Z6.c
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // Z6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f64858a, this.f64859b.get());
    }

    @Override // Z6.c
    public int getSize() {
        return this.f64859b.getSize();
    }

    private A(Resources resources, Z6.c<Bitmap> cVar) {
        this.f64858a = (Resources) r7.k.d(resources);
        this.f64859b = (Z6.c) r7.k.d(cVar);
    }
}
