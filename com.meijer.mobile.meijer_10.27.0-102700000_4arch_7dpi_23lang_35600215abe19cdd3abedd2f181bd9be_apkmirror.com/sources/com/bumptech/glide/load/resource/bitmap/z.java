package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import p7.C16264a;

/* loaded from: classes4.dex */
public final class z implements V6.i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C6513f f64117a = new C6513f();

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, V6.g gVar) throws IOException {
        return true;
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(InputStream inputStream, int i10, int i11, V6.g gVar) throws IOException {
        return this.f64117a.c(ImageDecoder.createSource(C16264a.b(inputStream)), i10, i11, gVar);
    }
}
