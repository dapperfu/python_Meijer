package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class NJ {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.P f68864a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f68865b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f68866c;

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jC = this.f68865b.c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jC2 = this.f68865b.c();
        if (bitmapDecodeByteArray != null) {
            long j10 = jC2 - jC;
            Pc.p0.k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j10 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d10, boolean z10, S6 s62) {
        byte[] bArr = s62.f70032b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76228Y5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) Mc.A.c().a(C8659lf.f76242Z5)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final com.google.common.util.concurrent.q b(String str, final double d10, final boolean z10) {
        return Mj0.m(this.f68864a.a(str), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.MJ
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f68623a.a(d10, z10, (S6) obj);
            }
        }, this.f68866c);
    }

    public NJ(Pc.P p10, com.google.android.gms.common.util.f fVar, Executor executor) {
        this.f68864a = p10;
        this.f68865b = fVar;
        this.f68866c = executor;
    }
}
