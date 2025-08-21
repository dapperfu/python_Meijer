package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class k implements X6.i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C6638f f64906a = new C6638f();

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, X6.g gVar) throws IOException {
        return true;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, X6.g gVar) throws IOException {
        return this.f64906a.c(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
    }
}
