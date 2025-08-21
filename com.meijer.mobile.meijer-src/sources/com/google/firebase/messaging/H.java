package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes8.dex */
public class H implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f89645a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future<?> f89646b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5516j<Bitmap> f89647c;

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            FS.log_i("FirebaseMessaging", "Starting download of: " + this.f89645a);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f89645a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Successfully downloaded image: " + this.f89645a);
        }
        return bitmapDecodeByteArray;
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionUrlconnection_wrapInstance = FS.urlconnection_wrapInstance(this.f89645a.openConnection());
        if (uRLConnectionUrlconnection_wrapInstance.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionUrlconnection_wrapInstance.getInputStream();
        try {
            byte[] bArrD = C11456b.d(C11456b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                FS.log_v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f89645a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89646b.cancel(true);
    }

    public AbstractC5516j<Bitmap> g() {
        return (AbstractC5516j) com.google.android.gms.common.internal.r.l(this.f89647c);
    }

    public void h(ExecutorService executorService) {
        final C5517k c5517k = new C5517k();
        this.f89646b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.G
            @Override // java.lang.Runnable
            public final void run() {
                H.a(this.f89643a, c5517k);
            }
        });
        this.f89647c = c5517k.a();
    }

    private H(URL url) {
        this.f89645a = url;
    }

    public static /* synthetic */ void a(H h10, C5517k c5517k) {
        h10.getClass();
        try {
            c5517k.c(h10.b());
        } catch (Exception e10) {
            c5517k.b(e10);
        }
    }

    public static H d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new H(new URL(str));
        } catch (MalformedURLException unused) {
            FS.log_w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }
}
