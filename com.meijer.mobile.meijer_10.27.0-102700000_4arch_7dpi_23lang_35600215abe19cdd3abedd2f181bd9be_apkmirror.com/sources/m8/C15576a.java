package m8;

import android.os.Process;
import com.fullstory.FS;
import g8.n;
import g8.u;
import g8.x;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15576a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f149955a = x.f133195a + "CrashCatcher";

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f149956b = false;

    /* renamed from: c, reason: collision with root package name */
    private static List<InterfaceC15577b> f149957c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f149958d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Throwable f149959e = null;

    /* renamed from: m8.a$a, reason: collision with other inner class name */
    private static class C2301a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        private static C2301a f149960a = new C2301a();

        static C2301a a() {
            return f149960a;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (x.f133196b) {
                x8.f.y(C15576a.f149955a, String.format("Uncaught exception occurred in %s[name=%s, id=%d, pid=%d]", thread.getClass().getName(), thread.getName(), Long.valueOf(x8.f.h(thread)), Integer.valueOf(Process.myPid())));
            }
            if (C15576a.f149959e != th2) {
                Throwable unused = C15576a.f149959e = th2;
                C15576a.g(thread, th2);
            }
            if (C15576a.f149958d != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C15576a.f149958d;
                if (x.f133196b) {
                    x8.f.y(C15576a.f149955a, "Passing exception to " + uncaughtExceptionHandler.getClass().getName());
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }

        private C2301a() {
        }
    }

    public static void g(Thread thread, Throwable th2) {
        n.f133102d = true;
        if (!u.b()) {
            if (x.f133196b) {
                x8.f.y(f149955a, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (InterfaceC15577b interfaceC15577b : f149957c) {
            try {
                interfaceC15577b.b(thread, th2);
            } catch (Throwable th3) {
                if (x.f133196b) {
                    x8.f.x(f149955a, "Failed to process an uncaught exception by " + interfaceC15577b.toString(), th3);
                }
            }
        }
    }

    public static void h(InterfaceC15577b interfaceC15577b) {
        if (interfaceC15577b != null) {
            f149957c.add(interfaceC15577b);
        }
    }

    public static void e() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = FS.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof C2301a)) {
            if (x.f133196b) {
                x8.f.u(f149955a, "The agent crash handler is already registered.");
            }
        } else {
            f149958d = defaultUncaughtExceptionHandler;
            FS.setDefaultUncaughtExceptionHandler(C2301a.a());
            if (x.f133196b) {
                x8.f.u(f149955a, "Registered agent crash handler");
            }
            f149956b = true;
        }
    }

    public static void f(String str, String str2, String str3, String str4) {
        if (!u.b()) {
            if (x.f133196b) {
                x8.f.y(f149955a, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (InterfaceC15577b interfaceC15577b : f149957c) {
            try {
                interfaceC15577b.a(str, str2, str3, str4);
            } catch (Throwable th2) {
                if (x.f133196b) {
                    x8.f.x(f149955a, "Failed to process an uncaught exception by " + interfaceC15577b.toString(), th2);
                }
            }
        }
    }
}
