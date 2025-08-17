package Lu;

import Pu.o;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile o<Callable<t>, t> f18746a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile o<t, t> f18747b;

    public static t d(Callable<t> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<t>, t> oVar = f18746a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static t e(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<t, t> oVar = f18747b;
        return oVar == null ? tVar : (t) a(oVar, tVar);
    }

    static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw Ou.a.a(th2);
        }
    }

    static t b(o<Callable<t>, t> oVar, Callable<t> callable) {
        t tVar = (t) a(oVar, callable);
        if (tVar != null) {
            return tVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static t c(Callable<t> callable) {
        try {
            t tVarCall = callable.call();
            if (tVarCall != null) {
                return tVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw Ou.a.a(th2);
        }
    }
}
