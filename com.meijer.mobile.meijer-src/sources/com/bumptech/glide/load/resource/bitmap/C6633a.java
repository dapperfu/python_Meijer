package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6633a<DataType> implements X6.i<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final X6.i<DataType, Bitmap> f64895a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f64896b;

    @Override // X6.i
    public boolean a(DataType datatype, X6.g gVar) throws IOException {
        return this.f64895a.a(datatype, gVar);
    }

    @Override // X6.i
    public Z6.c<BitmapDrawable> b(DataType datatype, int i10, int i11, X6.g gVar) throws IOException {
        return A.e(this.f64896b, this.f64895a.b(datatype, i10, i11, gVar));
    }

    public C6633a(Resources resources, X6.i<DataType, Bitmap> iVar) {
        this.f64896b = (Resources) r7.k.d(resources);
        this.f64895a = (X6.i) r7.k.d(iVar);
    }
}
