package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class k implements V6.i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C6513f f64066a = new C6513f();

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, V6.g gVar) throws IOException {
        return true;
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, V6.g gVar) throws IOException {
        return this.f64066a.c(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
    }
}
