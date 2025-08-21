package av;

import cv.C13558a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class h {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        C13558a.s(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<Ju.b> atomicReference, Ju.b bVar, Class<?> cls) {
        Nu.b.e(bVar, "next is null");
        if (U.d.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == Mu.d.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(Ju.b bVar, Ju.b bVar2, Class<?> cls) {
        Nu.b.e(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == Mu.d.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
