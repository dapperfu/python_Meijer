package Nb;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.lang.Thread;

/* loaded from: classes4.dex */
public class k implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    protected static final C13784a f20775b = C13785b.a(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    protected static final C13786c f20776c = C13787d.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private boolean f20777a;

    public k() {
        this((byte) 0);
    }

    protected String b(Throwable th2) {
        return null;
    }

    private k(byte b10) {
        this.f20777a = false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 instanceof Error) {
            Error error = (Error) th2;
            a("Rethrowing unhandled {} in {}: {}", error.getClass().getSimpleName(), thread.getName(), error.getMessage());
            if (!this.f20777a) {
                throw error;
            }
            return;
        }
        String strB = b(th2);
        if (strB != null) {
            f20776c.f(strB, new Object[0]);
        }
        a("Caught unhandled {} in {}: {}", th2.getClass().getSimpleName(), thread.getName(), th2.getMessage());
    }

    protected static String a(String str, String... strArr) {
        return ow.f.a(str, strArr).a();
    }
}
