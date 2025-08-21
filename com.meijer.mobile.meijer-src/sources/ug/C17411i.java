package ug;

import Vd.C5518l;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import df.C13676c;
import df.C13679f;
import java.util.concurrent.Executor;

/* renamed from: ug.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17411i {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f163944b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C17411i f163945c;

    /* renamed from: a, reason: collision with root package name */
    private df.n f163946a;

    public static C17411i c() {
        C17411i c17411i;
        synchronized (f163944b) {
            com.google.android.gms.common.internal.r.q(f163945c != null, "MlKitContext has not been initialized");
            c17411i = (C17411i) com.google.android.gms.common.internal.r.l(f163945c);
        }
        return c17411i;
    }

    public static C17411i d(Context context) {
        C17411i c17411iE;
        synchronized (f163944b) {
            c17411iE = e(context, C5518l.f39866a);
        }
        return c17411iE;
    }

    public static C17411i e(Context context, Executor executor) {
        C17411i c17411i;
        synchronized (f163944b) {
            com.google.android.gms.common.internal.r.q(f163945c == null, "MlKitContext is already initialized");
            C17411i c17411i2 = new C17411i();
            f163945c = c17411i2;
            Context contextF = f(context);
            df.n nVarE = df.n.m(executor).d(C13679f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C13676c.q(contextF, Context.class, new Class[0])).b(C13676c.q(c17411i2, C17411i.class, new Class[0])).e();
            c17411i2.f163946a = nVarE;
            nVarE.p(true);
            c17411i = f163945c;
        }
        return c17411i;
    }

    public <T> T a(Class<T> cls) {
        com.google.android.gms.common.internal.r.q(f163945c == this, "MlKitContext has been deleted");
        com.google.android.gms.common.internal.r.l(this.f163946a);
        return (T) this.f163946a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }

    private C17411i() {
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
