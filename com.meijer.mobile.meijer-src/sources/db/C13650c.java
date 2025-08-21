package db;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/* renamed from: db.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13650c {

    /* renamed from: a, reason: collision with root package name */
    public static final char f128335a = File.separatorChar;

    /* renamed from: b, reason: collision with root package name */
    public static final String f128336b;

    static {
        C13651d c13651d = new C13651d((byte) 0);
        PrintWriter printWriter = new PrintWriter(c13651d);
        printWriter.println();
        f128336b = c13651d.toString();
        printWriter.close();
    }

    private static int a(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                break;
            }
            writer.write(cArr, 0, i10);
            j10 += i10;
        }
        if (j10 > 2147483647L) {
            return -1;
        }
        return (int) j10;
    }

    private static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] h(InputStream inputStream) throws IOException {
        C13648a c13648a = new C13648a();
        byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return c13648a.b();
            }
            c13648a.write(bArr, 0, i10);
        }
    }

    public static void c(InputStream inputStream) throws IOException {
        b(inputStream);
    }

    public static void d(InputStream inputStream, Writer writer, String str) throws IOException {
        a(new InputStreamReader(inputStream, C13649b.b(C13649b.a(str))), writer);
    }

    public static void e(OutputStream outputStream) throws IOException {
        b(outputStream);
    }

    public static void f(Reader reader) throws IOException {
        b(reader);
    }

    public static void g(Reader reader, OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C13649b.b(C13649b.a(str)));
        a(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }
}
