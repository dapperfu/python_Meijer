package com.google.android.gms.internal.pal;

import android.os.Handler;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import com.google.ads.interactivemedia.pal.zzat;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class G2 extends K2 {
    public G2(Handler handler, ExecutorService executorService) {
        super(handler, executorService, C10783e2.b(2L));
    }

    private static F7 g() throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) FS.urlconnection_wrapInstance(new URL("https://imasdk.googleapis.com/pal/key/public.json").openConnection());
                try {
                    try {
                        httpURLConnection2.setConnectTimeout(zzat.zzb);
                        httpURLConnection2.setReadTimeout(zzat.zzc);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.setUseCaches(false);
                        httpURLConnection2.connect();
                        if (httpURLConnection2.getResponseCode() != 200) {
                            FS.log_w("NonceGenerator", "Failed keystore response: " + httpURLConnection2.getResponseCode());
                            throw NonceLoaderException.zzb(HttpResponseStatus.SUCCESS_ACCEPTED);
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        try {
                            F7 f7B = F7.b(C10996r7.a(inputStream));
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpURLConnection2.disconnect();
                            return f7B;
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th3) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException | GeneralSecurityException e10) {
                    e = e10;
                    FS.log_e("NonceGenerator", "Failed to read keyset handle: " + e.toString());
                    throw new NonceLoaderException(HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, e);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (GeneralSecurityException e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10995r6 a() throws NonceLoaderException {
        try {
            C10871j9.a();
            return AbstractC10995r6.f(new F2((InterfaceC10981q7) g().c(InterfaceC10981q7.class)));
        } catch (GeneralSecurityException e10) {
            FS.log_e("NonceGenerator", "Can't access the cryptography library.", e10);
            throw new NonceLoaderException(HttpResponseStatus.SUCCESS_CREATED, e10);
        }
    }
}
