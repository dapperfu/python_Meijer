package hh;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: hh.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14470q {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f135044a;

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        this.f135044a.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    C14470q(Throwable th2) {
        this.f135044a = th2;
    }
}
