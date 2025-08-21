package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6641i implements X6.i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s f64905a;

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, X6.g gVar) throws IOException {
        return this.f64905a.g(byteBuffer, i10, i11, gVar);
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, X6.g gVar) {
        return this.f64905a.q(byteBuffer);
    }

    public C6641i(s sVar) {
        this.f64905a = sVar;
    }
}
