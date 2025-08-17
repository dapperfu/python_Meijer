package Qu;

import gv.C14313a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public enum d implements Nu.b {
    DISPOSED;

    public static boolean p(AtomicReference<Nu.b> atomicReference, Nu.b bVar) {
        if (U.d.a(atomicReference, null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean t(Nu.b bVar, Nu.b bVar2) {
        if (bVar2 == null) {
            C14313a.s(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        l();
        return false;
    }

    @Override // Nu.b
    public void dispose() {
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return true;
    }

    public static boolean b(Nu.b bVar) {
        return bVar == DISPOSED;
    }

    public static void l() {
        C14313a.s(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean o(AtomicReference<Nu.b> atomicReference, Nu.b bVar) {
        Ru.b.e(bVar, "d is null");
        if (U.d.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        l();
        return false;
    }

    public static boolean a(AtomicReference<Nu.b> atomicReference) {
        Nu.b andSet;
        Nu.b bVar = atomicReference.get();
        d dVar = DISPOSED;
        if (bVar != dVar && (andSet = atomicReference.getAndSet(dVar)) != dVar) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean e(AtomicReference<Nu.b> atomicReference, Nu.b bVar) {
        Nu.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!U.d.a(atomicReference, bVar2, bVar));
        return true;
    }

    public static boolean m(AtomicReference<Nu.b> atomicReference, Nu.b bVar) {
        Nu.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!U.d.a(atomicReference, bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }
}
