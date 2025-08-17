package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.s;
import java.io.IOException;
import java.io.InputStream;
import p7.C16267d;

/* loaded from: classes4.dex */
public class E implements V6.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s f64034a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.b f64035b;

    static class a implements s.b {

        /* renamed from: a, reason: collision with root package name */
        private final C f64036a;

        /* renamed from: b, reason: collision with root package name */
        private final C16267d f64037b;

        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void a(Y6.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f64037b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.c(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void b() {
            this.f64036a.b();
        }

        a(C c10, C16267d c16267d) {
            this.f64036a = c10;
            this.f64037b = c16267d;
        }
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(InputStream inputStream, int i10, int i11, V6.g gVar) throws IOException {
        boolean z10;
        C c10;
        if (inputStream instanceof C) {
            c10 = (C) inputStream;
            z10 = false;
        } else {
            z10 = true;
            c10 = new C(inputStream, this.f64035b);
        }
        C16267d c16267dB = C16267d.b(c10);
        try {
            X6.c<Bitmap> cVarF = this.f64034a.f(new p7.i(c16267dB), i10, i11, gVar, new a(c10, c16267dB));
            c16267dB.c();
            if (z10) {
                c10.c();
            }
            return cVarF;
        } finally {
        }
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, V6.g gVar) {
        return this.f64034a.p(inputStream);
    }

    public E(s sVar, Y6.b bVar) {
        this.f64034a = sVar;
        this.f64035b = bVar;
    }
}
