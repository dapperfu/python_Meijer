package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6516i implements V6.i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s f64065a;

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, V6.g gVar) throws IOException {
        return this.f64065a.g(byteBuffer, i10, i11, gVar);
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, V6.g gVar) {
        return this.f64065a.q(byteBuffer);
    }

    public C6516i(s sVar) {
        this.f64065a = sVar;
    }
}
