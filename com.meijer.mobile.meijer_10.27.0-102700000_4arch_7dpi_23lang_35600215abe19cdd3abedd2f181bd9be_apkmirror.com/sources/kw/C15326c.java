package kw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lkw/c;", "Lkw/K;", "<init>", "()V", "", "now", "y", "(J)J", "", "v", "", "w", "()Z", "B", "Lkw/I;", "sink", "z", "(Lkw/I;)Lkw/I;", "Lkw/J;", "source", "A", "(Lkw/J;)Lkw/J;", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "x", "", "f", "I", "state", "g", "Lkw/c;", "next", "h", "J", "timeoutAt", "i", "b", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C15326c extends K {

    /* renamed from: i, reason: collision with root package name */
    private static final a f148070i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f148071j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f148072k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f148073l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f148074m;

    /* renamed from: n, reason: collision with root package name */
    private static C15326c f148075n;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C15326c next;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lkw/c$a;", "", "<init>", "()V", "Lkw/c;", "node", "", "timeoutNanos", "", "hasDeadline", "", "f", "(Lkw/c;JZ)V", "g", "(Lkw/c;)V", "c", "()Lkw/c;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "d", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "head", "Lkw/c;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kw.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C15326c node, long timeoutNanos, boolean hasDeadline) {
            if (C15326c.f148075n == null) {
                C15326c.f148075n = new C15326c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = Math.min(timeoutNanos, node.c() - jNanoTime) + jNanoTime;
            } else if (timeoutNanos != 0) {
                node.timeoutAt = timeoutNanos + jNanoTime;
            } else if (hasDeadline) {
                node.timeoutAt = node.c();
            } else {
                throw new AssertionError();
            }
            long jY = node.y(jNanoTime);
            C15326c c15326c = C15326c.f148075n;
            Intrinsics.g(c15326c);
            while (c15326c.next != null) {
                C15326c c15326c2 = c15326c.next;
                Intrinsics.g(c15326c2);
                if (jY < c15326c2.y(jNanoTime)) {
                    break;
                }
                c15326c = c15326c.next;
                Intrinsics.g(c15326c);
            }
            node.next = c15326c.next;
            c15326c.next = node;
            if (c15326c == C15326c.f148075n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C15326c node) {
            for (C15326c c15326c = C15326c.f148075n; c15326c != null; c15326c = c15326c.next) {
                if (c15326c.next == node) {
                    c15326c.next = node.next;
                    node.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C15326c c() throws InterruptedException {
            C15326c c15326c = C15326c.f148075n;
            Intrinsics.g(c15326c);
            C15326c c15326c2 = c15326c.next;
            if (c15326c2 != null) {
                long jY = c15326c2.y(System.nanoTime());
                if (jY <= 0) {
                    C15326c c15326c3 = C15326c.f148075n;
                    Intrinsics.g(c15326c3);
                    c15326c3.next = c15326c2.next;
                    c15326c2.next = null;
                    c15326c2.state = 2;
                    return c15326c2;
                }
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            long jNanoTime = System.nanoTime();
            d().await(C15326c.f148073l, TimeUnit.MILLISECONDS);
            C15326c c15326c4 = C15326c.f148075n;
            Intrinsics.g(c15326c4);
            if (c15326c4.next == null && System.nanoTime() - jNanoTime >= C15326c.f148074m) {
                return C15326c.f148075n;
            }
            return null;
        }

        public final Condition d() {
            return C15326c.f148072k;
        }

        public final ReentrantLock e() {
            return C15326c.f148071j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lkw/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "", "run", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kw.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            C15326c c15326cC;
            while (true) {
                try {
                    reentrantLockE = C15326c.f148070i.e();
                    reentrantLockE.lock();
                    try {
                        c15326cC = C15326c.f148070i.c();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c15326cC == C15326c.f148075n) {
                    a unused2 = C15326c.f148070i;
                    C15326c.f148075n = null;
                    return;
                } else {
                    Unit unit = Unit.f142422a;
                    reentrantLockE.unlock();
                    if (c15326cC != null) {
                        c15326cC.B();
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kw/c$c", "Lkw/I;", "Lkw/e;", "source", "", "byteCount", "", "M1", "(Lkw/e;J)V", "flush", "()V", "close", "Lkw/c;", "a", "()Lkw/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.c$c, reason: collision with other inner class name */
    public static final class C2278c implements I {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f148080b;

        C2278c(I i10) {
            this.f148080b = i10;
        }

        @Override // kw.I
        public void M1(C15328e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            C15325b.b(source.getSize(), 0L, byteCount);
            while (true) {
                long j10 = 0;
                if (byteCount <= 0) {
                    return;
                }
                F f10 = source.head;
                Intrinsics.g(f10);
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += f10.limit - f10.pos;
                    if (j10 >= byteCount) {
                        j10 = byteCount;
                        break;
                    } else {
                        f10 = f10.next;
                        Intrinsics.g(f10);
                    }
                }
                C15326c c15326c = C15326c.this;
                I i10 = this.f148080b;
                c15326c.v();
                try {
                    try {
                        i10.M1(source, j10);
                        Unit unit = Unit.f142422a;
                        if (c15326c.w()) {
                            throw c15326c.p(null);
                        }
                        byteCount -= j10;
                    } catch (IOException e10) {
                        if (!c15326c.w()) {
                            throw e10;
                        }
                        throw c15326c.p(e10);
                    }
                } catch (Throwable th2) {
                    c15326c.w();
                    throw th2;
                }
            }
        }

        @Override // kw.I
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C15326c timeout() {
            return C15326c.this;
        }

        @Override // kw.I, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C15326c c15326c = C15326c.this;
            I i10 = this.f148080b;
            c15326c.v();
            try {
                i10.close();
                Unit unit = Unit.f142422a;
                if (c15326c.w()) {
                    throw c15326c.p(null);
                }
            } catch (IOException e10) {
                if (!c15326c.w()) {
                    throw e10;
                }
                throw c15326c.p(e10);
            } finally {
                c15326c.w();
            }
        }

        @Override // kw.I, java.io.Flushable
        public void flush() throws IOException {
            C15326c c15326c = C15326c.this;
            I i10 = this.f148080b;
            c15326c.v();
            try {
                i10.flush();
                Unit unit = Unit.f142422a;
                if (c15326c.w()) {
                    throw c15326c.p(null);
                }
            } catch (IOException e10) {
                if (!c15326c.w()) {
                    throw e10;
                }
                throw c15326c.p(e10);
            } finally {
                c15326c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f148080b + ')';
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"kw/c$d", "Lkw/J;", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "", "close", "()V", "Lkw/c;", "a", "()Lkw/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.c$d */
    public static final class d implements J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f148082b;

        d(J j10) {
            this.f148082b = j10;
        }

        @Override // kw.J
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C15326c timeout() {
            return C15326c.this;
        }

        @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C15326c c15326c = C15326c.this;
            J j10 = this.f148082b;
            c15326c.v();
            try {
                j10.close();
                Unit unit = Unit.f142422a;
                if (c15326c.w()) {
                    throw c15326c.p(null);
                }
            } catch (IOException e10) {
                if (!c15326c.w()) {
                    throw e10;
                }
                throw c15326c.p(e10);
            } finally {
                c15326c.w();
            }
        }

        @Override // kw.J
        public long read(C15328e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            C15326c c15326c = C15326c.this;
            J j10 = this.f148082b;
            c15326c.v();
            try {
                long j11 = j10.read(sink, byteCount);
                if (c15326c.w()) {
                    throw c15326c.p(null);
                }
                return j11;
            } catch (IOException e10) {
                if (c15326c.w()) {
                    throw c15326c.p(e10);
                }
                throw e10;
            } finally {
                c15326c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f148082b + ')';
        }
    }

    protected void B() {
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f148071j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.i(conditionNewCondition, "newCondition(...)");
        f148072k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f148073l = millis;
        f148074m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long now) {
        return this.timeoutAt - now;
    }

    public final J A(J source) {
        Intrinsics.j(source, "source");
        return new d(source);
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f148071j;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f148070i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final I z(I sink) {
        Intrinsics.j(sink, "sink");
        return new C2278c(sink);
    }

    @PublishedApi
    public final IOException p(IOException cause) {
        return x(cause);
    }

    public final void v() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = f148071j;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                f148070i.f(this, timeoutNanos, hasDeadline);
                Unit unit = Unit.f142422a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }
}
