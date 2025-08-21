package o8;

import android.os.Process;
import com.fullstory.FS;
import i8.n;
import i8.u;
import i8.x;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16086a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f153742a = x.f137411a + "CrashCatcher";

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f153743b = false;

    /* renamed from: c, reason: collision with root package name */
    private static List<InterfaceC16087b> f153744c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f153745d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Throwable f153746e = null;

    /* renamed from: o8.a$a, reason: collision with other inner class name */
    private static class C2380a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        private static C2380a f153747a = new C2380a();

        static C2380a a() {
            return f153747a;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (x.f137412b) {
                z8.f.y(C16086a.f153742a, String.format("Uncaught exception occurred in %s[name=%s, id=%d, pid=%d]", thread.getClass().getName(), thread.getName(), Long.valueOf(z8.f.h(thread)), Integer.valueOf(Process.myPid())));
            }
            if (C16086a.f153746e != th2) {
                Throwable unused = C16086a.f153746e = th2;
                C16086a.g(thread, th2);
            }
            if (C16086a.f153745d != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C16086a.f153745d;
                if (x.f137412b) {
                    z8.f.y(C16086a.f153742a, "Passing exception to " + uncaughtExceptionHandler.getClass().getName());
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }

        private C2380a() {
        }
    }

    public static void g(Thread thread, Throwable th2) {
        n.f137318d = true;
        if (!u.b()) {
            if (x.f137412b) {
                z8.f.y(f153742a, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (InterfaceC16087b interfaceC16087b : f153744c) {
            try {
                interfaceC16087b.b(thread, th2);
            } catch (Throwable th3) {
                if (x.f137412b) {
                    z8.f.x(f153742a, "Failed to process an uncaught exception by " + interfaceC16087b.toString(), th3);
                }
            }
        }
    }

    public static void h(InterfaceC16087b interfaceC16087b) {
        if (interfaceC16087b != null) {
            f153744c.add(interfaceC16087b);
        }
    }

    public static void e() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = FS.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof C2380a)) {
            if (x.f137412b) {
                z8.f.u(f153742a, "The agent crash handler is already registered.");
            }
        } else {
            f153745d = defaultUncaughtExceptionHandler;
            FS.setDefaultUncaughtExceptionHandler(C2380a.a());
            if (x.f137412b) {
                z8.f.u(f153742a, "Registered agent crash handler");
            }
            f153743b = true;
        }
    }

    public static void f(String str, String str2, String str3, String str4) {
        if (!u.b()) {
            if (x.f137412b) {
                z8.f.y(f153742a, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (InterfaceC16087b interfaceC16087b : f153744c) {
            try {
                interfaceC16087b.a(str, str2, str3, str4);
            } catch (Throwable th2) {
                if (x.f137412b) {
                    z8.f.x(f153742a, "Failed to process an uncaught exception by " + interfaceC16087b.toString(), th2);
                }
            }
        }
    }
}
