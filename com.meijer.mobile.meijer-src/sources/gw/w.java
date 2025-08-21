package gw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"gw/x", "gw/y"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w {
    @JvmName
    public static final J a() {
        return y.a();
    }

    public static final InterfaceC14417f b(J j10) {
        return y.b(j10);
    }

    public static final InterfaceC14418g c(K k10) {
        return y.c(k10);
    }

    @JvmOverloads
    public static final J d(File file, boolean z10) throws FileNotFoundException {
        return x.a(file, z10);
    }

    public static final J e(OutputStream outputStream) {
        return x.b(outputStream);
    }

    public static final J f(Socket socket) throws IOException {
        return x.c(socket);
    }

    public static final K h(File file) throws FileNotFoundException {
        return x.e(file);
    }

    public static final K i(InputStream inputStream) {
        return x.f(inputStream);
    }

    public static final K j(Socket socket) throws IOException {
        return x.g(socket);
    }
}
