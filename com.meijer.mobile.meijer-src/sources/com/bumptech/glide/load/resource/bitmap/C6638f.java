package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6638f implements X6.i<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final a7.d f64902a = new a7.e();

    public boolean d(ImageDecoder.Source source, X6.g gVar) throws IOException {
        return true;
    }

    public Z6.c<Bitmap> c(ImageDecoder.Source source, int i10, int i11, X6.g gVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new f7.i(i10, i11, gVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            FS.log_v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C6639g(bitmapDecodeBitmap, this.f64902a);
    }

    @Override // X6.i
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, X6.g gVar) throws IOException {
        return d(C6636d.a(source), gVar);
    }

    @Override // X6.i
    public /* bridge */ /* synthetic */ Z6.c<Bitmap> b(ImageDecoder.Source source, int i10, int i11, X6.g gVar) throws IOException {
        return c(C6636d.a(source), i10, i11, gVar);
    }
}
