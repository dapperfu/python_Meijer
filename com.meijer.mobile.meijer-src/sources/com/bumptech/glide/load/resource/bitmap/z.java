package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import r7.C16868a;

/* loaded from: classes4.dex */
public final class z implements X6.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C6638f f64957a = new C6638f();

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, X6.g gVar) throws IOException {
        return true;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(InputStream inputStream, int i10, int i11, X6.g gVar) throws IOException {
        return this.f64957a.c(ImageDecoder.createSource(C16868a.b(inputStream)), i10, i11, gVar);
    }
}
