package androidx.profileinstaller;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
class d {
    static int h(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    static long i(InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    static int j(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    static void p(OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 2);
    }

    static void q(OutputStream outputStream, long j10) throws IOException {
        o(outputStream, j10, 4);
    }

    static void r(OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 1);
    }

    static int a(int i10) {
        return ((i10 + 7) & (-8)) / 8;
    }

    static byte[] b(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    static byte[] d(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw c("Not enough bytes to read: " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    static byte[] e(InputStream inputStream, int i10, int i11) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[RecyclerView.m.FLAG_MOVED];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw c(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw c("Inflater did not finish");
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    static String f(InputStream inputStream, int i10) throws IOException {
        return new String(d(inputStream, i10), StandardCharsets.UTF_8);
    }

    static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static long g(InputStream inputStream, int i10) throws IOException {
        byte[] bArrD = d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (bArrD[i11] & 255) << (i11 * 8);
        }
        return j10;
    }
}
