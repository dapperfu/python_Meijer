package com.bumptech.glide.load.resource.bitmap;

import a7.InterfaceC5665b;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.s;
import java.io.IOException;
import java.io.InputStream;
import r7.C16871d;

/* loaded from: classes4.dex */
public class E implements X6.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s f64874a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5665b f64875b;

    static class a implements s.b {

        /* renamed from: a, reason: collision with root package name */
        private final C f64876a;

        /* renamed from: b, reason: collision with root package name */
        private final C16871d f64877b;

        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void a() {
            this.f64876a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.s.b
        public void b(a7.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f64877b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.c(bitmap);
                throw iOExceptionA;
            }
        }

        a(C c10, C16871d c16871d) {
            this.f64876a = c10;
            this.f64877b = c16871d;
        }
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(InputStream inputStream, int i10, int i11, X6.g gVar) throws IOException {
        boolean z10;
        C c10;
        if (inputStream instanceof C) {
            c10 = (C) inputStream;
            z10 = false;
        } else {
            z10 = true;
            c10 = new C(inputStream, this.f64875b);
        }
        C16871d c16871dB = C16871d.b(c10);
        try {
            Z6.c<Bitmap> cVarF = this.f64874a.f(new r7.i(c16871dB), i10, i11, gVar, new a(c10, c16871dB));
            c16871dB.c();
            if (z10) {
                c10.c();
            }
            return cVarF;
        } finally {
        }
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, X6.g gVar) {
        return this.f64874a.p(inputStream);
    }

    public E(s sVar, InterfaceC5665b interfaceC5665b) {
        this.f64874a = sVar;
        this.f64875b = interfaceC5665b;
    }
}
