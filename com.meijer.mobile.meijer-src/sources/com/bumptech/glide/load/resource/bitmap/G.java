package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class G implements X6.i<Bitmap, Bitmap> {

    private static final class a implements Z6.c<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f64883a;

        @Override // Z6.c
        public void a() {
        }

        @Override // Z6.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f64883a;
        }

        @Override // Z6.c
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // Z6.c
        public int getSize() {
            return r7.l.h(this.f64883a);
        }

        a(Bitmap bitmap) {
            this.f64883a = bitmap;
        }
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, X6.g gVar) {
        return true;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(Bitmap bitmap, int i10, int i11, X6.g gVar) {
        return new a(bitmap);
    }
}
