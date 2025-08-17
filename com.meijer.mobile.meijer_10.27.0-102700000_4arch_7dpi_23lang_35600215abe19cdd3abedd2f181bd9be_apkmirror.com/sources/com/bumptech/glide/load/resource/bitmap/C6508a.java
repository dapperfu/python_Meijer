package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6508a<DataType> implements V6.i<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final V6.i<DataType, Bitmap> f64055a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f64056b;

    @Override // V6.i
    public boolean a(DataType datatype, V6.g gVar) throws IOException {
        return this.f64055a.a(datatype, gVar);
    }

    @Override // V6.i
    public X6.c<BitmapDrawable> b(DataType datatype, int i10, int i11, V6.g gVar) throws IOException {
        return A.e(this.f64056b, this.f64055a.b(datatype, i10, i11, gVar));
    }

    public C6508a(Resources resources, V6.i<DataType, Bitmap> iVar) {
        this.f64056b = (Resources) p7.k.d(resources);
        this.f64055a = (V6.i) p7.k.d(iVar);
    }
}
