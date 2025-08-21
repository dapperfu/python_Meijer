package av;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f59694a = new a();

    static final class a extends Throwable {
        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }

        a() {
            super("No further exceptions");
        }
    }

    public static String c(long j10, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j10 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        Throwable compositeException;
        do {
            th3 = atomicReference.get();
            if (th3 == f59694a) {
                return false;
            }
            if (th3 == null) {
                compositeException = th2;
            } else {
                compositeException = new CompositeException(th3, th2);
            }
        } while (!U.d.a(atomicReference, th3, compositeException));
        return true;
    }

    public static <T> Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f59694a;
        if (th2 != th3) {
            return atomicReference.getAndSet(th3);
        }
        return th2;
    }
}
