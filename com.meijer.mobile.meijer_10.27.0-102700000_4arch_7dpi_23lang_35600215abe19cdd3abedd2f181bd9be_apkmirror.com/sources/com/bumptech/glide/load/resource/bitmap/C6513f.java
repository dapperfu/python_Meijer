package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6513f implements V6.i<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final Y6.d f64062a = new Y6.e();

    public boolean d(ImageDecoder.Source source, V6.g gVar) throws IOException {
        return true;
    }

    public X6.c<Bitmap> c(ImageDecoder.Source source, int i10, int i11, V6.g gVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new d7.i(i10, i11, gVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            FS.log_v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C6514g(bitmapDecodeBitmap, this.f64062a);
    }

    @Override // V6.i
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, V6.g gVar) throws IOException {
        return d(C6511d.a(source), gVar);
    }

    @Override // V6.i
    public /* bridge */ /* synthetic */ X6.c<Bitmap> b(ImageDecoder.Source source, int i10, int i11, V6.g gVar) throws IOException {
        return c(C6511d.a(source), i10, i11, gVar);
    }
}
