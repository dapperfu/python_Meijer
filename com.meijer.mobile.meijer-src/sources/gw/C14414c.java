package gw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lgw/c;", "Lgw/L;", "<init>", "()V", "", "t", "", "u", "()Z", "", "now", "w", "(J)J", "z", "Lgw/J;", "sink", "x", "(Lgw/J;)Lgw/J;", "Lgw/K;", "source", "y", "(Lgw/K;)Lgw/K;", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "v", "", "f", "I", "state", "g", "index", "h", "J", "timeoutAt", "i", "b", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gw.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14414c extends L {

    /* renamed from: i, reason: collision with root package name */
    private static final a f134532i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final D f134533j = new D();

    /* renamed from: k, reason: collision with root package name */
    private static C14414c f134534k;

    /* renamed from: l, reason: collision with root package name */
    private static final ReentrantLock f134535l;

    /* renamed from: m, reason: collision with root package name */
    private static final Condition f134536m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f134537n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f134538o;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int index = -1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010%¨\u0006-"}, d2 = {"Lgw/c$a;", "", "<init>", "()V", "Lgw/c;", "node", "", "timeoutNanos", "", "hasDeadline", "", "g", "(Lgw/c;JZ)V", "b", "()Lgw/c;", "Lgw/D;", "queue", "Lgw/D;", "f", "()Lgw/D;", "idleSentinel", "Lgw/c;", "d", "h", "(Lgw/c;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "c", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: gw.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C14414c node, long timeoutNanos, boolean hasDeadline) {
            if (d() == null) {
                h(new C14414c());
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = jNanoTime + Math.min(timeoutNanos, node.c() - jNanoTime);
            } else if (timeoutNanos != 0) {
                node.timeoutAt = jNanoTime + timeoutNanos;
            } else if (hasDeadline) {
                node.timeoutAt = node.c();
            } else {
                throw new AssertionError();
            }
            f().a(node);
            if (node.index == 1) {
                c().signal();
            }
        }

        public final C14414c b() throws InterruptedException {
            C14414c c14414cB = f().b();
            if (c14414cB == null) {
                long jNanoTime = System.nanoTime();
                c().await(C14414c.f134537n, TimeUnit.MILLISECONDS);
                if (f().b() != null || System.nanoTime() - jNanoTime < C14414c.f134538o) {
                    return null;
                }
                return d();
            }
            long jW = c14414cB.w(System.nanoTime());
            if (jW > 0) {
                c().await(jW, TimeUnit.NANOSECONDS);
                return null;
            }
            f().e(c14414cB);
            c14414cB.state = 2;
            return c14414cB;
        }

        public final Condition c() {
            return C14414c.f134536m;
        }

        public final C14414c d() {
            return C14414c.f134534k;
        }

        public final ReentrantLock e() {
            return C14414c.f134535l;
        }

        public final D f() {
            return C14414c.f134533j;
        }

        public final void h(C14414c c14414c) {
            C14414c.f134534k = c14414c;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lgw/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "", "run", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: gw.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            C14414c c14414cB;
            while (true) {
                try {
                    reentrantLockE = C14414c.f134532i.e();
                    reentrantLockE.lock();
                    try {
                        c14414cB = C14414c.f134532i.b();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c14414cB == C14414c.f134532i.d()) {
                    C14414c.f134532i.h(null);
                    return;
                }
                Unit unit = Unit.f143329a;
                reentrantLockE.unlock();
                if (c14414cB != null) {
                    c14414cB.z();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gw/c$c", "Lgw/J;", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "Lgw/c;", "a", "()Lgw/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gw.c$c, reason: collision with other inner class name */
    public static final class C2130c implements J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f134543b;

        C2130c(J j10) {
            this.f134543b = j10;
        }

        @Override // gw.J
        public void E1(C14416e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            C14413b.b(source.getSize(), 0L, byteCount);
            while (true) {
                long j10 = 0;
                if (byteCount <= 0) {
                    return;
                }
                G g10 = source.head;
                Intrinsics.g(g10);
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += g10.limit - g10.pos;
                    if (j10 >= byteCount) {
                        j10 = byteCount;
                        break;
                    } else {
                        g10 = g10.next;
                        Intrinsics.g(g10);
                    }
                }
                C14414c c14414c = C14414c.this;
                J j11 = this.f134543b;
                c14414c.t();
                try {
                    try {
                        j11.E1(source, j10);
                        Unit unit = Unit.f143329a;
                        if (c14414c.u()) {
                            throw c14414c.p(null);
                        }
                        byteCount -= j10;
                    } catch (IOException e10) {
                        if (!c14414c.u()) {
                            throw e10;
                        }
                        throw c14414c.p(e10);
                    }
                } catch (Throwable th2) {
                    c14414c.u();
                    throw th2;
                }
            }
        }

        @Override // gw.J
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C14414c timeout() {
            return C14414c.this;
        }

        @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C14414c c14414c = C14414c.this;
            J j10 = this.f134543b;
            c14414c.t();
            try {
                j10.close();
                Unit unit = Unit.f143329a;
                if (c14414c.u()) {
                    throw c14414c.p(null);
                }
            } catch (IOException e10) {
                if (!c14414c.u()) {
                    throw e10;
                }
                throw c14414c.p(e10);
            } finally {
                c14414c.u();
            }
        }

        @Override // gw.J, java.io.Flushable
        public void flush() throws IOException {
            C14414c c14414c = C14414c.this;
            J j10 = this.f134543b;
            c14414c.t();
            try {
                j10.flush();
                Unit unit = Unit.f143329a;
                if (c14414c.u()) {
                    throw c14414c.p(null);
                }
            } catch (IOException e10) {
                if (!c14414c.u()) {
                    throw e10;
                }
                throw c14414c.p(e10);
            } finally {
                c14414c.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f134543b + ')';
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"gw/c$d", "Lgw/K;", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "", "close", "()V", "Lgw/c;", "a", "()Lgw/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gw.c$d */
    public static final class d implements K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f134545b;

        d(K k10) {
            this.f134545b = k10;
        }

        @Override // gw.K
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C14414c timeout() {
            return C14414c.this;
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C14414c c14414c = C14414c.this;
            K k10 = this.f134545b;
            c14414c.t();
            try {
                k10.close();
                Unit unit = Unit.f143329a;
                if (c14414c.u()) {
                    throw c14414c.p(null);
                }
            } catch (IOException e10) {
                if (!c14414c.u()) {
                    throw e10;
                }
                throw c14414c.p(e10);
            } finally {
                c14414c.u();
            }
        }

        @Override // gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            C14414c c14414c = C14414c.this;
            K k10 = this.f134545b;
            c14414c.t();
            try {
                long j10 = k10.read(sink, byteCount);
                if (c14414c.u()) {
                    throw c14414c.p(null);
                }
                return j10;
            } catch (IOException e10) {
                if (c14414c.u()) {
                    throw c14414c.p(e10);
                }
                throw e10;
            } finally {
                c14414c.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f134545b + ')';
        }
    }

    protected void z() {
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f134535l = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.i(conditionNewCondition, "newCondition(...)");
        f134536m = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f134537n = millis;
        f134538o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final boolean u() {
        ReentrantLock reentrantLock = f134535l;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f134533j.e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException v(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final long w(long now) {
        return this.timeoutAt - now;
    }

    public final J x(J sink) {
        Intrinsics.j(sink, "sink");
        return new C2130c(sink);
    }

    public final K y(K source) {
        Intrinsics.j(source, "source");
        return new d(source);
    }

    @PublishedApi
    public final IOException p(IOException cause) {
        return v(cause);
    }

    public final void t() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = f134535l;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                f134532i.g(this, timeoutNanos, hasDeadline);
                Unit unit = Unit.f143329a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }
}
