package ih;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: ih.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC14726e {

    /* renamed from: ih.e$a */
    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f137770a;

        a(Throwable th2) {
            this.f137770a = th2;
        }

        @Override // ih.AbstractC14726e.c
        public String get() {
            StringWriter stringWriter = new StringWriter();
            this.f137770a.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    /* renamed from: ih.e$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f137771a;

        public String toString() {
            return this.f137771a.get();
        }

        b(c cVar) {
            this.f137771a = cVar;
        }
    }

    /* renamed from: ih.e$c */
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
