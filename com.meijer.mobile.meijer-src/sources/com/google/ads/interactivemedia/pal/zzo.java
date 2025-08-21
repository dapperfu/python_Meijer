package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.AbstractC10736b6;
import com.google.android.gms.internal.pal.C10852i6;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes4.dex */
final class zzo extends Thread {
    final /* synthetic */ String zza;

    zzo(zzs zzsVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str = this.zza;
        try {
            C10852i6 c10852i6A = AbstractC10736b6.a();
            try {
                URLConnection uRLConnectionB = c10852i6A.b(new URL(str), 26624);
                ((HttpURLConnection) uRLConnectionB).setConnectTimeout(zzat.zzb);
                ((HttpURLConnection) uRLConnectionB).setReadTimeout(zzat.zzc);
                ((HttpURLConnection) uRLConnectionB).setDoInput(false);
                ((HttpURLConnection) uRLConnectionB).setUseCaches(false);
                ((HttpURLConnection) uRLConnectionB).getResponseCode();
                c10852i6A.close();
            } catch (Throwable th2) {
                try {
                    c10852i6A.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
        }
    }
}
