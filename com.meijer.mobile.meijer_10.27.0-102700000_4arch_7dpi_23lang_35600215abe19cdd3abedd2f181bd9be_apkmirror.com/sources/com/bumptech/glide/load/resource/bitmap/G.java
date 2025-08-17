package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class G implements V6.i<Bitmap, Bitmap> {

    private static final class a implements X6.c<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f64043a;

        @Override // X6.c
        public void a() {
        }

        @Override // X6.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f64043a;
        }

        @Override // X6.c
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // X6.c
        public int getSize() {
            return p7.l.h(this.f64043a);
        }

        a(Bitmap bitmap) {
            this.f64043a = bitmap;
        }
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, V6.g gVar) {
        return true;
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(Bitmap bitmap, int i10, int i11, V6.g gVar) {
        return new a(bitmap);
    }
}
