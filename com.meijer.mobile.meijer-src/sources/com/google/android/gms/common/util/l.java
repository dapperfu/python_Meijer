package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes4.dex */
public final class l {
    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return c(inputStream, outputStream, false, 1024);
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    break;
                }
                j10 += i11;
                outputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
