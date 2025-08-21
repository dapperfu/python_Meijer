package i8;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.common.api.a;
import i8.y;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.C15689d;
import m8.EnumC15686a;
import org.json.JSONException;
import org.json.JSONObject;
import x8.C18134b;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final String f137377a = C14695b.a() + " not running";

    /* renamed from: b, reason: collision with root package name */
    private static final String f137378b = x.f137411a + "Dynatrace";

    /* renamed from: c, reason: collision with root package name */
    private static final Object f137379c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f137380d = new AtomicBoolean(false);

    public static void i(Application application, C15689d c15689d) {
        h(application, null, c15689d);
    }

    public static boolean b() {
        if (x.f137413c.get()) {
            return l.l();
        }
        return false;
    }

    protected static void d() {
        if (x.f137413c.get()) {
            l.i();
        }
    }

    public static void f(final String str, final Throwable th2) {
        z8.f.a("dtxEventGeneration", "reportError, errorName: " + str);
        if (str == null) {
            z8.f.a("dtxEventGeneration", "event is rejected, name can't be null");
            return;
        }
        if (b()) {
            final p8.b bVarC = p8.b.c(false);
            if (th2 != null) {
                l.f137293g.a(bVarC, new y.a() { // from class: i8.t
                    @Override // i8.y.a
                    public final void a(u7.h hVar) throws JSONException {
                        u.a(th2, str, bVarC, hVar);
                    }
                });
            } else {
                z8.f.a("dtxEventGeneration", "Grail event is rejected, throwable can't be null");
            }
            o8.f fVar = th2 == null ? new o8.f(null, null, null, o8.d.JAVA) : new o8.c(th2, C14695b.e().c().f150767d == EnumC15686a.APP_MON ? 10 : a.e.API_PRIORITY_OTHER).a();
            e(str, 10, bVarC, fVar.a(), fVar.b(), fVar.c(), fVar.d().b());
        }
    }

    protected static void g() {
        if (x.f137413c.get()) {
            l.f137299m.I(false);
        }
    }

    private static void h(Application application, Activity activity, C15689d c15689d) {
        if (application == null || c15689d == null) {
            return;
        }
        if (z8.f.j()) {
            if (c15689d.f150785v) {
                z8.f.u(f137378b, "Isolated service detected. Monitoring deactivated for this process");
            }
        } else {
            if (new A8.a().b()) {
                return;
            }
            synchronized (f137379c) {
                if (f137380d.get()) {
                    return;
                }
                try {
                    l.A(application, activity, c15689d, new C18134b(c15689d.c(), new x8.h().a(), application, c15689d.f150762C, new x8.e(application)));
                    f137380d.set(true);
                } catch (Exception e10) {
                    if (x.f137412b) {
                        z8.f.v(f137378b, "unable to start agent", e10);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(Throwable th2, String str, p8.b bVar, u7.h hVar) throws JSONException {
        JSONObject jSONObjectB = P7.a.b(th2, str);
        if (jSONObjectB != null) {
            hVar.a(jSONObjectB, C14693B.a(), 0L, x8.f.a(bVar), true, null);
        }
    }

    public static void c(String str) {
        if (b()) {
            p8.b bVarC = p8.b.c(false);
            if (bVarC.f().e(w.f137401r)) {
                if (str == null || str.isEmpty()) {
                    str = null;
                }
                bVarC.s(str);
                l.r(bVarC);
            }
        }
    }

    private static void e(String str, int i10, p8.b bVar, String... strArr) {
        if (!b()) {
            return;
        }
        l.d(str, i10, 0L, null, bVar, C14695b.e().f137219c, strArr);
    }
}
