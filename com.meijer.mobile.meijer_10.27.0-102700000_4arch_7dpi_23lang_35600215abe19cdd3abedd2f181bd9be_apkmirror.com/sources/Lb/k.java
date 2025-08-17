package Lb;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.lang.Thread;

/* loaded from: classes4.dex */
public class k implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    protected static final C6380a f17955b = C6381b.a(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    protected static final C6382c f17956c = C6383d.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private boolean f17957a;

    public k() {
        this((byte) 0);
    }

    protected String b(Throwable th2) {
        return null;
    }

    private k(byte b10) {
        this.f17957a = false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 instanceof Error) {
            Error error = (Error) th2;
            a("Rethrowing unhandled {} in {}: {}", error.getClass().getSimpleName(), thread.getName(), error.getMessage());
            if (!this.f17957a) {
                throw error;
            }
            return;
        }
        String strB = b(th2);
        if (strB != null) {
            f17956c.f(strB, new Object[0]);
        }
        a("Caught unhandled {} in {}: {}", th2.getClass().getSimpleName(), thread.getName(), th2.getMessage());
    }

    protected static String a(String str, String... strArr) {
        return sw.f.a(str, strArr).a();
    }
}
