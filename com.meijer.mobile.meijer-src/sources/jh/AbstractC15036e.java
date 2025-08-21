package jh;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: jh.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC15036e {

    /* renamed from: jh.e$a */
    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f140656a;

        a(Throwable th2) {
            this.f140656a = th2;
        }

        @Override // jh.AbstractC15036e.c
        public String get() {
            StringWriter stringWriter = new StringWriter();
            this.f140656a.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    /* renamed from: jh.e$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f140657a;

        public String toString() {
            return this.f140657a.get();
        }

        b(c cVar) {
            this.f140657a = cVar;
        }
    }

    /* renamed from: jh.e$c */
    public interface c {
        String get();
    }

    public static Object b(Throwable th2) {
        return th2;
    }

    public static Object a(c cVar) {
        return new b(cVar);
    }

    public static Object c(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return a(new a(th2));
    }
}
