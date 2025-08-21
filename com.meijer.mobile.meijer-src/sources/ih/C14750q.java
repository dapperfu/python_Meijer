package ih;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: ih.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14750q {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f137684a;

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        this.f137684a.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    C14750q(Throwable th2) {
        this.f137684a = th2;
    }
}
