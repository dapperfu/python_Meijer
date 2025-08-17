package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes4.dex */
public final class A implements X6.c<BitmapDrawable>, X6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f64018a;

    /* renamed from: b, reason: collision with root package name */
    private final X6.c<Bitmap> f64019b;

    public static X6.c<BitmapDrawable> e(Resources resources, X6.c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new A(resources, cVar);
    }

    @Override // X6.c
    public void a() {
        this.f64019b.a();
    }

    @Override // X6.b
    public void b() {
        X6.c<Bitmap> cVar = this.f64019b;
        if (cVar instanceof X6.b) {
            ((X6.b) cVar).b();
        }
    }

    @Override // X6.c
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // X6.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f64018a, this.f64019b.get());
    }

    @Override // X6.c
    public int getSize() {
        return this.f64019b.getSize();
    }

    private A(Resources resources, X6.c<Bitmap> cVar) {
        this.f64018a = (Resources) p7.k.d(resources);
        this.f64019b = (X6.c) p7.k.d(cVar);
    }
}
