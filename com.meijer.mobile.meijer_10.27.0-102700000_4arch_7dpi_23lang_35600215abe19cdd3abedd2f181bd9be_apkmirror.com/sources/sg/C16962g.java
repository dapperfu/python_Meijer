package sg;

import Cd.HandlerC2983a;
import Td.AbstractC5232j;
import Td.C5233k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: sg.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16962g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f160455b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C16962g f160456c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f160457a;

    public static C16962g a() {
        C16962g c16962g;
        synchronized (f160455b) {
            try {
                if (f160456c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f160456c = new C16962g(handlerThread.getLooper());
                }
                c16962g = f160456c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16962g;
    }

    public static Executor d() {
        return u.f160516a;
    }

    public <ResultT> AbstractC5232j<ResultT> b(final Callable<ResultT> callable) {
        final C5233k c5233k = new C5233k();
        c(new Runnable() { // from class: sg.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C5233k c5233k2 = c5233k;
                try {
                    c5233k2.c(callable2.call());
                } catch (MlKitException e10) {
                    c5233k2.b(e10);
                } catch (Exception e11) {
                    c5233k2.b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c5233k.a();
    }

    private C16962g(Looper looper) {
        this.f160457a = new HandlerC2983a(looper);
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
