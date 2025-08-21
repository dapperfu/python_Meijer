package Tu;

import A0.c;
import Lu.o;
import Vu.k;
import io.reactivex.j;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
final class g {
    static <T> boolean a(Object obj, o<? super T, ? extends io.reactivex.d> oVar, io.reactivex.c cVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            io.reactivex.d dVar = eVar != null ? (io.reactivex.d) Nu.b.e(oVar.apply(eVar), "The mapper returned a null CompletableSource") : null;
            if (dVar == null) {
                Mu.e.b(cVar);
            } else {
                dVar.a(cVar);
            }
            return true;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.l(th2, cVar);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, o<? super T, ? extends j<? extends R>> oVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            j jVar = eVar != null ? (j) Nu.b.e(oVar.apply(eVar), "The mapper returned a null MaybeSource") : null;
            if (jVar == null) {
                Mu.e.e(sVar);
            } else {
                jVar.a(Su.a.c(sVar));
            }
            return true;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, o<? super T, ? extends y<? extends R>> oVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            y yVar = eVar != null ? (y) Nu.b.e(oVar.apply(eVar), "The mapper returned a null SingleSource") : null;
            if (yVar == null) {
                Mu.e.e(sVar);
            } else {
                yVar.a(k.c(sVar));
            }
            return true;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
            return true;
        }
    }
}
