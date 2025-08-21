package com.medallia.digital.mobilesdk;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
final class x8 {

    /* renamed from: a, reason: collision with root package name */
    static final int f94355a = 1024;

    x8() {
    }

    static ByteArrayOutputStream a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[f94355a];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    static boolean b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) i4.c().b().getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnectedOrConnecting();
                }
                return false;
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return true;
    }

    static boolean a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) i4.c().b().getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(0).isConnected();
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return false;
    }
}
