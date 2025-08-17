package dv;

import U.d;
import gv.C14313a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pw.c;

/* renamed from: dv.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC13584b implements c {
    CANCELLED;

    public static boolean p(c cVar, c cVar2) {
        if (cVar2 == null) {
            C14313a.s(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        l();
        return false;
    }

    @Override // pw.c
    public void cancel() {
    }

    @Override // pw.c
    public void t(long j10) {
    }

    public static void l() {
        C14313a.s(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean m(AtomicReference<c> atomicReference, c cVar) {
        Ru.b.e(cVar, "s is null");
        if (d.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        l();
        return false;
    }

    public static boolean o(long j10) {
        if (j10 > 0) {
            return true;
        }
        C14313a.s(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean a(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        EnumC13584b enumC13584b = CANCELLED;
        if (cVar != enumC13584b && (andSet = atomicReference.getAndSet(enumC13584b)) != enumC13584b) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void b(AtomicReference<c> atomicReference, AtomicLong atomicLong, long j10) {
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.t(j10);
            return;
        }
        if (o(j10)) {
            ev.d.a(atomicLong, j10);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.t(andSet);
                }
            }
        }
    }

    public static boolean e(AtomicReference<c> atomicReference, AtomicLong atomicLong, c cVar) {
        if (m(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.t(andSet);
                return true;
            }
            return true;
        }
        return false;
    }
}
