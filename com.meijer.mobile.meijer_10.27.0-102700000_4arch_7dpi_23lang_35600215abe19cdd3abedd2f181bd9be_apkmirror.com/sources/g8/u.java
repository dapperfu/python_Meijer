package g8;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.common.api.a;
import g8.y;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.C15118d;
import k8.EnumC15115a;
import org.json.JSONException;
import org.json.JSONObject;
import v8.C17522b;
import y8.C18188a;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final String f133161a = C14219b.a() + " not running";

    /* renamed from: b, reason: collision with root package name */
    private static final String f133162b = x.f133195a + "Dynatrace";

    /* renamed from: c, reason: collision with root package name */
    private static final Object f133163c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f133164d = new AtomicBoolean(false);

    public static void i(Application application, C15118d c15118d) {
        h(application, null, c15118d);
    }

    public static boolean b() {
        if (x.f133197c.get()) {
            return l.l();
        }
        return false;
    }

    protected static void d() {
        if (x.f133197c.get()) {
            l.i();
        }
    }

    public static void f(final String str, final Throwable th2) {
        x8.f.a("dtxEventGeneration", "reportError, errorName: " + str);
        if (str == null) {
            x8.f.a("dtxEventGeneration", "event is rejected, name can't be null");
            return;
        }
        if (b()) {
            final n8.b bVarC = n8.b.c(false);
            if (th2 != null) {
                l.f133077g.a(bVarC, new y.a() { // from class: g8.t
                    @Override // g8.y.a
                    public final void a(s7.h hVar) throws JSONException {
                        u.a(th2, str, bVarC, hVar);
                    }
                });
            } else {
                x8.f.a("dtxEventGeneration", "Grail event is rejected, throwable can't be null");
            }
            m8.f fVar = th2 == null ? new m8.f(null, null, null, m8.d.JAVA) : new m8.c(th2, C14219b.e().c().f141621d == EnumC15115a.APP_MON ? 10 : a.e.API_PRIORITY_OTHER).a();
            e(str, 10, bVarC, fVar.a(), fVar.b(), fVar.c(), fVar.d().b());
        }
    }

    protected static void g() {
        if (x.f133197c.get()) {
            l.f133083m.I(false);
        }
    }

    private static void h(Application application, Activity activity, C15118d c15118d) {
        if (application == null || c15118d == null) {
            return;
        }
        if (x8.f.j()) {
            if (c15118d.f141639v) {
                x8.f.u(f133162b, "Isolated service detected. Monitoring deactivated for this process");
            }
        } else {
            if (new C18188a().b()) {
                return;
            }
            synchronized (f133163c) {
                if (f133164d.get()) {
                    return;
                }
                try {
                    l.A(application, activity, c15118d, new C17522b(c15118d.c(), new v8.h().a(), application, c15118d.f141616C, new v8.e(application)));
                    f133164d.set(true);
                } catch (Exception e10) {
                    if (x.f133196b) {
                        x8.f.v(f133162b, "unable to start agent", e10);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(Throwable th2, String str, n8.b bVar, s7.h hVar) throws JSONException {
        JSONObject jSONObjectB = N7.a.b(th2, str);
        if (jSONObjectB != null) {
            hVar.b(jSONObjectB, C14217B.a(), 0L, v8.f.a(bVar), true, null);
        }
    }

    public static void c(String str) {
        if (b()) {
            n8.b bVarC = n8.b.c(false);
            if (bVarC.f().e(w.f133185r)) {
                if (str == null || str.isEmpty()) {
                    str = null;
                }
                bVarC.s(str);
                l.r(bVarC);
            }
        }
    }

    private static void e(String str, int i10, n8.b bVar, String... strArr) {
        if (!b()) {
            return;
        }
        l.d(str, i10, 0L, null, bVar, C14219b.e().f133003c, strArr);
    }
}
