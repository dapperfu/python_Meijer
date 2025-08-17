package kw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"kw/x", "kw/y"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w {
    public static final I a(File file) throws FileNotFoundException {
        return x.a(file);
    }

    @JvmName
    public static final I b() {
        return y.a();
    }

    public static final InterfaceC15329f c(I i10) {
        return y.b(i10);
    }

    public static final InterfaceC15330g d(J j10) {
        return y.c(j10);
    }

    @JvmOverloads
    public static final I e(File file) throws FileNotFoundException {
        return x.b(file);
    }

    @JvmOverloads
    public static final I f(File file, boolean z10) throws FileNotFoundException {
        return x.c(file, z10);
    }

    public static final I g(OutputStream outputStream) {
        return x.d(outputStream);
    }

    public static final I h(Socket socket) throws IOException {
        return x.e(socket);
    }

    public static final J j(File file) throws FileNotFoundException {
        return x.g(file);
    }

    public static final J k(InputStream inputStream) {
        return x.h(inputStream);
    }

    public static final J l(Socket socket) throws IOException {
        return x.i(socket);
    }
}
