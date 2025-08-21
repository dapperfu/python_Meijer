package gw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lgw/L;", "", "<init>", "()V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)Lgw/L;", "h", "()J", "", "e", "()Z", "c", "deadlineNanoTime", "d", "(J)Lgw/L;", "b", "()Lgw/L;", "a", "", "f", "Z", "hasDeadline", "J", "timeoutNanos", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class L {

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final L f134518e = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasDeadline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long deadlineNanoTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long timeoutNanos;

    public L a() {
        this.hasDeadline = false;
        return this;
    }

    public L d(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"gw/L$a", "Lgw/L;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)Lgw/L;", "deadlineNanoTime", "d", "(J)Lgw/L;", "", "f", "()V", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends L {
        @Override // gw.L
        public L d(long deadlineNanoTime) {
            return this;
        }

        @Override // gw.L
        public void f() {
        }

        @Override // gw.L
        public L g(long timeout, TimeUnit unit) {
            Intrinsics.j(unit, "unit");
            return this;
        }

        a() {
        }
    }

    public L b() {
        this.timeoutNanos = 0L;
        return this;
    }

    public long c() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: e, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public L g(long timeout, TimeUnit unit) {
        Intrinsics.j(unit, "unit");
        if (timeout >= 0) {
            this.timeoutNanos = unit.toNanos(timeout);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + timeout).toString());
    }

    /* renamed from: h, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public void f() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }
}
