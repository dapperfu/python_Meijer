package Xu;

import A0.c;
import Pu.o;
import Zu.k;
import io.reactivex.j;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class g {
    static <T> boolean a(Object obj, o<? super T, ? extends io.reactivex.d> oVar, io.reactivex.c cVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            io.reactivex.d dVar = eVar != null ? (io.reactivex.d) Ru.b.e(oVar.apply(eVar), "The mapper returned a null CompletableSource") : null;
            if (dVar == null) {
                Qu.e.b(cVar);
            } else {
                dVar.a(cVar);
            }
            return true;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.l(th2, cVar);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, o<? super T, ? extends j<? extends R>> oVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            j jVar = eVar != null ? (j) Ru.b.e(oVar.apply(eVar), "The mapper returned a null MaybeSource") : null;
            if (jVar == null) {
                Qu.e.e(sVar);
            } else {
                jVar.a(Wu.a.c(sVar));
            }
            return true;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, o<? super T, ? extends y<? extends R>> oVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) obj).call();
            y yVar = eVar != null ? (y) Ru.b.e(oVar.apply(eVar), "The mapper returned a null SingleSource") : null;
            if (yVar == null) {
                Qu.e.e(sVar);
            } else {
                yVar.a(k.c(sVar));
            }
            return true;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
            return true;
        }
    }
}
