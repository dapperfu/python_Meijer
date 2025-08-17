package kw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljava/io/OutputStream;", "Lkw/I;", "d", "(Ljava/io/OutputStream;)Lkw/I;", "Ljava/io/InputStream;", "Lkw/J;", "h", "(Ljava/io/InputStream;)Lkw/J;", "Ljava/net/Socket;", "e", "(Ljava/net/Socket;)Lkw/I;", "i", "(Ljava/net/Socket;)Lkw/J;", "Ljava/io/File;", "", "append", "c", "(Ljava/io/File;Z)Lkw/I;", "a", "(Ljava/io/File;)Lkw/I;", "g", "(Ljava/io/File;)Lkw/J;", "okio"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes13.dex */
final /* synthetic */ class x {
    @JvmOverloads
    public static final I b(File file) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return f(file, false, 1, null);
    }

    public static final I a(File file) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return w.g(new FileOutputStream(file, true));
    }

    @JvmOverloads
    public static final I c(File file, boolean z10) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return w.g(new FileOutputStream(file, z10));
    }

    public static final I d(OutputStream outputStream) {
        Intrinsics.j(outputStream, "<this>");
        return new sink(outputStream, new K());
    }

    public static final I e(Socket socket) throws IOException {
        Intrinsics.j(socket, "<this>");
        lw.m mVar = new lw.m(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.i(outputStream, "getOutputStream(...)");
        return mVar.z(new sink(outputStream, mVar));
    }

    public static /* synthetic */ I f(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return w.f(file, z10);
    }

    public static final J g(File file) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return new source(new FileInputStream(file), K.f148056e);
    }

    public static final J h(InputStream inputStream) {
        Intrinsics.j(inputStream, "<this>");
        return new source(inputStream, new K());
    }

    public static final J i(Socket socket) throws IOException {
        Intrinsics.j(socket, "<this>");
        lw.m mVar = new lw.m(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.i(inputStream, "getInputStream(...)");
        return mVar.A(new source(inputStream, mVar));
    }
}
