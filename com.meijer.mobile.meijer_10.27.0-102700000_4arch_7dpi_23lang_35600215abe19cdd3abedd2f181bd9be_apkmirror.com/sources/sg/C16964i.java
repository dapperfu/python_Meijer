package sg;

import Td.C5234l;
import android.content.Context;
import bf.C6245c;
import bf.C6248f;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;

/* renamed from: sg.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16964i {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f160458b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C16964i f160459c;

    /* renamed from: a, reason: collision with root package name */
    private bf.n f160460a;

    public static C16964i c() {
        C16964i c16964i;
        synchronized (f160458b) {
            com.google.android.gms.common.internal.r.q(f160459c != null, "MlKitContext has not been initialized");
            c16964i = (C16964i) com.google.android.gms.common.internal.r.l(f160459c);
        }
        return c16964i;
    }

    public static C16964i d(Context context) {
        C16964i c16964iE;
        synchronized (f160458b) {
            c16964iE = e(context, C5234l.f34933a);
        }
        return c16964iE;
    }

    public static C16964i e(Context context, Executor executor) {
        C16964i c16964i;
        synchronized (f160458b) {
            com.google.android.gms.common.internal.r.q(f160459c == null, "MlKitContext is already initialized");
            C16964i c16964i2 = new C16964i();
            f160459c = c16964i2;
            Context contextF = f(context);
            bf.n nVarE = bf.n.m(executor).d(C6248f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C6245c.q(contextF, Context.class, new Class[0])).b(C6245c.q(c16964i2, C16964i.class, new Class[0])).e();
            c16964i2.f160460a = nVarE;
            nVarE.p(true);
            c16964i = f160459c;
        }
        return c16964i;
    }

    public <T> T a(Class<T> cls) {
        com.google.android.gms.common.internal.r.q(f160459c == this, "MlKitContext has been deleted");
        com.google.android.gms.common.internal.r.l(this.f160460a);
        return (T) this.f160460a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }

    private C16964i() {
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
