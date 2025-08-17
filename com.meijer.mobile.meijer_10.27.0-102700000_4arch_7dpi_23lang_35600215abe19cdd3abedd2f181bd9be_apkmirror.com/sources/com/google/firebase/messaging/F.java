package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5233k;
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

/* loaded from: classes7.dex */
public class F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f88779a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future<?> f88780b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5232j<Bitmap> f88781c;

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            FS.log_i("FirebaseMessaging", "Starting download of: " + this.f88779a);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f88779a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Successfully downloaded image: " + this.f88779a);
        }
        return bitmapDecodeByteArray;
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionUrlconnection_wrapInstance = FS.urlconnection_wrapInstance(this.f88779a.openConnection());
        if (uRLConnectionUrlconnection_wrapInstance.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionUrlconnection_wrapInstance.getInputStream();
        try {
            byte[] bArrD = C11331b.d(C11331b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                FS.log_v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f88779a);
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
        this.f88780b.cancel(true);
    }

    public AbstractC5232j<Bitmap> g() {
        return (AbstractC5232j) com.google.android.gms.common.internal.r.l(this.f88781c);
    }

    public void h(ExecutorService executorService) {
        final C5233k c5233k = new C5233k();
        this.f88780b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                F.a(this.f88777a, c5233k);
            }
        });
        this.f88781c = c5233k.a();
    }

    private F(URL url) {
        this.f88779a = url;
    }

    public static /* synthetic */ void a(F f10, C5233k c5233k) {
        f10.getClass();
        try {
            c5233k.c(f10.b());
        } catch (Exception e10) {
            c5233k.b(e10);
        }
    }

    public static F d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            FS.log_w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }
}
