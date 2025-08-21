package gw;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/io/OutputStream;", "Lgw/J;", "b", "(Ljava/io/OutputStream;)Lgw/J;", "Ljava/io/InputStream;", "Lgw/K;", "f", "(Ljava/io/InputStream;)Lgw/K;", "Ljava/net/Socket;", "c", "(Ljava/net/Socket;)Lgw/J;", "g", "(Ljava/net/Socket;)Lgw/K;", "Ljava/io/File;", "", "append", "a", "(Ljava/io/File;Z)Lgw/J;", "e", "(Ljava/io/File;)Lgw/K;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes14.dex */
final /* synthetic */ class x {
    @JvmOverloads
    public static final J a(File file, boolean z10) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return w.e(new FileOutputStream(file, z10));
    }

    public static final J b(OutputStream outputStream) {
        Intrinsics.j(outputStream, "<this>");
        return new sink(outputStream, new L());
    }

    public static final J c(Socket socket) throws IOException {
        Intrinsics.j(socket, "<this>");
        hw.m mVar = new hw.m(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.i(outputStream, "getOutputStream(...)");
        return mVar.x(new sink(outputStream, mVar));
    }

    public static /* synthetic */ J d(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return w.d(file, z10);
    }

    public static final K e(File file) throws FileNotFoundException {
        Intrinsics.j(file, "<this>");
        return new source(new FileInputStream(file), L.f134518e);
    }

    public static final K f(InputStream inputStream) {
        Intrinsics.j(inputStream, "<this>");
        return new source(inputStream, new L());
    }

    public static final K g(Socket socket) throws IOException {
        Intrinsics.j(socket, "<this>");
        hw.m mVar = new hw.m(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.i(inputStream, "getInputStream(...)");
        return mVar.y(new source(inputStream, mVar));
    }
}
