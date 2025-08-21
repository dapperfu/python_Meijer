package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class B implements X6.i<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s f64860a;

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, X6.g gVar) throws IOException {
        return this.f64860a.d(parcelFileDescriptor, i10, i11, gVar);
    }

    public B(s sVar) {
        this.f64860a = sVar;
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, X6.g gVar) {
        if (e(parcelFileDescriptor) && this.f64860a.o(parcelFileDescriptor)) {
            return true;
        }
        return false;
    }
}
