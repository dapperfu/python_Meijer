package lf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import mf.C15712a;

/* renamed from: lf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15488b {

    /* renamed from: a, reason: collision with root package name */
    public static final char f149598a = File.separatorChar;

    /* renamed from: b, reason: collision with root package name */
    public static final String f149599b;

    static {
        C15712a c15712a = new C15712a(4);
        try {
            PrintWriter printWriter = new PrintWriter(c15712a);
            try {
                printWriter.println();
                f149599b = c15712a.toString();
                printWriter.close();
                c15712a.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    c15712a.close();
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
