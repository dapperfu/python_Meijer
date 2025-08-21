package Zu;

import U.d;
import cv.C13558a;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lw.c;

/* loaded from: classes10.dex */
public enum b implements c {
    CANCELLED;

    public static boolean p(c cVar, c cVar2) {
        if (cVar2 == null) {
            C13558a.s(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        l();
        return false;
    }

    @Override // lw.c
    public void cancel() {
    }

    @Override // lw.c
    public void t(long j10) {
    }

    public static void l() {
        C13558a.s(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean m(AtomicReference<c> atomicReference, c cVar) {
        Nu.b.e(cVar, "s is null");
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
        C13558a.s(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean a(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        b bVar = CANCELLED;
        if (cVar != bVar && (andSet = atomicReference.getAndSet(bVar)) != bVar) {
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
            av.d.a(atomicLong, j10);
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
