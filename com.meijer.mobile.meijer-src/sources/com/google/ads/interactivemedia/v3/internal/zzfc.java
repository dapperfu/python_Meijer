package com.google.ads.interactivemedia.v3.internal;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class zzfc {
    private final zzuv zza;
    private final float zzb;

    final /* synthetic */ Bitmap zza(String str, com.google.ads.interactivemedia.v3.impl.data.zzbo zzboVar) throws Exception {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection()))).getInputStream());
        if (bitmapDecodeStream == null) {
            return null;
        }
        if (zzboVar.width != bitmapDecodeStream.getWidth() || zzboVar.height != bitmapDecodeStream.getHeight()) {
            return bitmapDecodeStream;
        }
        double d10 = this.zzb;
        if (Math.copySign(1.0d - d10, 1.0d) <= 0.1d || d10 == 1.0d) {
            return bitmapDecodeStream;
        }
        if (Double.isNaN(1.0d) && Double.isNaN(d10)) {
            return bitmapDecodeStream;
        }
        return Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (this.zzb * bitmapDecodeStream.getWidth()), (int) (this.zzb * bitmapDecodeStream.getHeight()), true);
    }

    public final AbstractC5516j zzb(final String str, final com.google.ads.interactivemedia.v3.impl.data.zzbo zzboVar) {
        C5517k c5517k = new C5517k();
        zzuk.zze(this.zza.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(str, zzboVar);
            }
        }), new zzfb(this, c5517k, str), this.zza);
        return c5517k.a();
    }

    public zzfc(ExecutorService executorService, float f10) {
        this.zzb = f10;
        this.zza = zzvb.zza(executorService);
    }
}
