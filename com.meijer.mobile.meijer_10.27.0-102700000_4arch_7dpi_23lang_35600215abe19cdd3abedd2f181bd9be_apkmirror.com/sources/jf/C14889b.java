package jf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import kf.C15141a;

/* renamed from: jf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C14889b {

    /* renamed from: a, reason: collision with root package name */
    public static final char f139584a = File.separatorChar;

    /* renamed from: b, reason: collision with root package name */
    public static final String f139585b;

    static {
        C15141a c15141a = new C15141a(4);
        try {
            PrintWriter printWriter = new PrintWriter(c15141a);
            try {
                printWriter.println();
                f139585b = c15141a.toString();
                printWriter.close();
                c15141a.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    c15141a.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        return d(inputStream, outputStream, new byte[i10]);
    }

    public static long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        return b(inputStream, outputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    public static long d(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jC = c(inputStream, outputStream);
        if (jC > 2147483647L) {
            return -1;
        }
        return (int) jC;
    }
}
