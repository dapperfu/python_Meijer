package Mu;

import cv.C13558a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public enum d implements Ju.b {
    DISPOSED;

    public static boolean p(AtomicReference<Ju.b> atomicReference, Ju.b bVar) {
        if (U.d.a(atomicReference, null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean t(Ju.b bVar, Ju.b bVar2) {
        if (bVar2 == null) {
            C13558a.s(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        l();
        return false;
    }

    @Override // Ju.b
    public void dispose() {
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return true;
    }

    public static boolean b(Ju.b bVar) {
        return bVar == DISPOSED;
    }

    public static void l() {
        C13558a.s(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean o(AtomicReference<Ju.b> atomicReference, Ju.b bVar) {
        Nu.b.e(bVar, "d is null");
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

    public static boolean a(AtomicReference<Ju.b> atomicReference) {
        Ju.b andSet;
        Ju.b bVar = atomicReference.get();
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

    public static boolean e(AtomicReference<Ju.b> atomicReference, Ju.b bVar) {
        Ju.b bVar2;
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

    public static boolean m(AtomicReference<Ju.b> atomicReference, Ju.b bVar) {
        Ju.b bVar2;
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
