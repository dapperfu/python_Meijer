package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import qv.N0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "message", "", "cause", "Lqv/C0;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lqv/C0;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lqv/C0;", "_job", "()Lqv/C0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final transient C0 _job;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final C0 a() {
        C0 c02 = this._job;
        return c02 == null ? N0.f157609b : c02;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) other;
        return Intrinsics.e(jobCancellationException.getMessage(), getMessage()) && Intrinsics.e(jobCancellationException.a(), a()) && Intrinsics.e(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }

    public JobCancellationException(String str, Throwable th2, C0 c02) {
        super(str);
        this._job = c02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public int hashCode() {
        int iHashCode;
        String message = getMessage();
        Intrinsics.g(message);
        int iHashCode2 = message.hashCode() * 31;
        C0 c0A = a();
        int iHashCode3 = 0;
        if (c0A != null) {
            iHashCode = c0A.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = (iHashCode2 + iHashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            iHashCode3 = cause.hashCode();
        }
        return i10 + iHashCode3;
    }
}
