package ug;

import Ed.HandlerC3186a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ug.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17409g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f163941b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C17409g f163942c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f163943a;

    public static C17409g a() {
        C17409g c17409g;
        synchronized (f163941b) {
            try {
                if (f163942c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f163942c = new C17409g(handlerThread.getLooper());
                }
                c17409g = f163942c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17409g;
    }

    public static Executor d() {
        return u.f164002a;
    }

    public <ResultT> AbstractC5516j<ResultT> b(final Callable<ResultT> callable) {
        final C5517k c5517k = new C5517k();
        c(new Runnable() { // from class: ug.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C5517k c5517k2 = c5517k;
                try {
                    c5517k2.c(callable2.call());
                } catch (MlKitException e10) {
                    c5517k2.b(e10);
                } catch (Exception e11) {
                    c5517k2.b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c5517k.a();
    }

    private C17409g(Looper looper) {
        this.f163943a = new HandlerC3186a(looper);
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
