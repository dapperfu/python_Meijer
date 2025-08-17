package ev;

import gv.C14313a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class h {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        C14313a.s(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<Nu.b> atomicReference, Nu.b bVar, Class<?> cls) {
        Ru.b.e(bVar, "next is null");
        if (U.d.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == Qu.d.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(Nu.b bVar, Nu.b bVar2, Class<?> cls) {
        Ru.b.e(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == Qu.d.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
