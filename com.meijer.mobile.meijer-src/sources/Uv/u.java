package Uv;

import Vv.WindowCounter;
import gw.C14414c;
import gw.C14416e;
import gw.InterfaceC14418g;
import gw.J;
import gw.K;
import gw.L;
import io.constructor.data.local.PreferencesHelper;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 X2\u00020\u00012\u00020\u0001:\u0004*.20B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u0017\u0010=\u001a\u0002098\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<R*\u0010C\u001a\u00020,2\u0006\u0010>\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u0010>\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010?\u001a\u0004\bD\u0010A\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010JR\u001e\u0010#\u001a\u00060LR\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bN\u0010OR\u001e\u0010T\u001a\u00060PR\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010Q\u001a\u0004\bR\u0010SR\u001e\u0010Z\u001a\u00060UR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001e\u0010]\u001a\u00060UR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010^\u001a\u0004\bV\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010a\u001a\u0004\b[\u0010b\"\u0004\bc\u0010dR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010\u0014R\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bg\u0010\u0014R\u0011\u0010j\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bi\u0010\u0014¨\u0006k"}, d2 = {"LUv/u;", "", "", PreferencesHelper.PREF_ID, "LUv/n;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILUv/n;ZZLokhttp3/Headers;)V", "LUv/a;", "errorCode", "Ljava/io/IOException;", "errorException", "f", "(LUv/a;Ljava/io/IOException;)Z", "h", "()Z", "callerIsIdle", "B", "(Z)Lokhttp3/Headers;", "Lgw/L;", "w", "()Lgw/L;", "D", "rstStatusCode", "", "e", "(LUv/a;Ljava/io/IOException;)V", "g", "(LUv/a;)V", "Lgw/g;", "source", "length", "x", "(Lgw/g;I)V", "y", "(Lokhttp3/Headers;Z)V", "z", "c", "()V", "", "delta", "b", "(J)V", "d", "C", "a", "I", "l", "()I", "LUv/n;", "i", "()LUv/n;", "LVv/a;", "LVv/a;", "m", "()LVv/a;", "readBytes", "value", "J", "r", "()J", "A", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "Z", "hasResponseHeaders", "LUv/u$c;", "LUv/u$c;", "p", "()LUv/u$c;", "LUv/u$b;", "LUv/u$b;", "o", "()LUv/u$b;", "sink", "LUv/u$d;", "j", "LUv/u$d;", "n", "()LUv/u$d;", "readTimeout", "k", "s", "writeTimeout", "LUv/a;", "()LUv/a;", "setErrorCode$okhttp", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "u", "isOpen", "t", "isLocallyInitiated", "v", "isSourceComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WindowCounter readBytes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b sink;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d readTimeout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d writeTimeout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private a errorCode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private IOException errorException;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\tR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b%\u0010\t¨\u0006'"}, d2 = {"LUv/u$b;", "Lgw/J;", "", "finished", "<init>", "(LUv/u;Z)V", "outFinishedOnLastFrame", "", "a", "(Z)V", "Lgw/e;", "source", "", "byteCount", "E1", "(Lgw/e;J)V", "flush", "()V", "Lgw/L;", "timeout", "()Lgw/L;", "close", "Z", "c", "()Z", "setFinished", "b", "Lgw/e;", "sendBuffer", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "d", "setClosed", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class b implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C14416e sendBuffer = new C14416e();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Headers trailers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public b(boolean z10) {
            this.finished = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z10;
            u uVar = u.this;
            synchronized (uVar) {
                try {
                    uVar.getWriteTimeout().t();
                    while (uVar.getWriteBytesTotal() >= uVar.getWriteBytesMaximum() && !this.finished && !this.closed && uVar.j() == null) {
                        try {
                            uVar.C();
                        } catch (Throwable th2) {
                            uVar.getWriteTimeout().A();
                            throw th2;
                        }
                    }
                    uVar.getWriteTimeout().A();
                    uVar.d();
                    jMin = Math.min(uVar.getWriteBytesMaximum() - uVar.getWriteBytesTotal(), this.sendBuffer.getSize());
                    uVar.A(uVar.getWriteBytesTotal() + jMin);
                    z10 = outFinishedOnLastFrame && jMin == this.sendBuffer.getSize();
                    Unit unit = Unit.f143329a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            u.this.getWriteTimeout().t();
            try {
                u.this.getConnection().n1(u.this.getId(), z10, this.sendBuffer, jMin);
            } finally {
                u.this.getWriteTimeout().A();
            }
        }

        @Override // gw.J
        public void E1(C14416e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            u uVar = u.this;
            if (!Nv.k.f22781b || !Thread.holdsLock(uVar)) {
                this.sendBuffer.E1(source, byteCount);
                while (this.sendBuffer.getSize() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            u uVar = u.this;
            if (Nv.k.f22781b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            u uVar2 = u.this;
            synchronized (uVar2) {
                if (this.closed) {
                    return;
                }
                boolean z10 = uVar2.j() == null;
                Unit unit = Unit.f143329a;
                if (!u.this.getSink().finished) {
                    boolean z11 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(false);
                        }
                        n connection = u.this.getConnection();
                        int id2 = u.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.g(headers);
                        connection.q1(id2, z10, Nv.k.r(headers));
                    } else if (z11) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        u.this.getConnection().n1(u.this.getId(), true, null, 0L);
                    }
                }
                u uVar3 = u.this;
                synchronized (uVar3) {
                    this.closed = true;
                    Intrinsics.h(uVar3, "null cannot be cast to non-null type java.lang.Object");
                    uVar3.notifyAll();
                    Unit unit2 = Unit.f143329a;
                }
                u.this.getConnection().flush();
                u.this.c();
            }
        }

        @Override // gw.J, java.io.Flushable
        public void flush() throws IOException {
            u uVar = u.this;
            if (Nv.k.f22781b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            u uVar2 = u.this;
            synchronized (uVar2) {
                uVar2.d();
                Unit unit = Unit.f143329a;
            }
            while (this.sendBuffer.getSize() > 0) {
                a(false);
                u.this.getConnection().flush();
            }
        }

        @Override // gw.J
        /* renamed from: timeout */
        public L getTimeout() {
            return u.this.getWriteTimeout();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b \u0010#R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00100\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b/\u0010\u001f¨\u00061"}, d2 = {"LUv/u$c;", "Lgw/K;", "", "maxByteCount", "", "finished", "<init>", "(LUv/u;JZ)V", "read", "", "i", "(J)V", "Lgw/e;", "sink", "byteCount", "(Lgw/e;J)J", "Lgw/g;", "source", "d", "(Lgw/g;J)V", "Lgw/L;", "timeout", "()Lgw/L;", "close", "()V", "a", "J", "b", "Z", "()Z", "g", "(Z)V", "c", "Lgw/e;", "getReceiveBuffer", "()Lgw/e;", "receiveBuffer", "readBuffer", "Lokhttp3/Headers;", "e", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "h", "(Lokhttp3/Headers;)V", "trailers", "f", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class c implements K {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C14416e receiveBuffer = new C14416e();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final C14416e readBuffer = new C14416e();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Headers trailers;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public c(long j10, boolean z10) {
            this.maxByteCount = j10;
            this.finished = z10;
        }

        private final void i(long read) {
            u uVar = u.this;
            if (!Nv.k.f22781b || !Thread.holdsLock(uVar)) {
                u.this.getConnection().k1(read);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        /* renamed from: c, reason: from getter */
        public final C14416e getReadBuffer() {
            return this.readBuffer;
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            u uVar = u.this;
            synchronized (uVar) {
                this.closed = true;
                size = this.readBuffer.getSize();
                this.readBuffer.a();
                Intrinsics.h(uVar, "null cannot be cast to non-null type java.lang.Object");
                uVar.notifyAll();
                Unit unit = Unit.f143329a;
            }
            if (size > 0) {
                i(size);
            }
            u.this.c();
        }

        public final void d(InterfaceC14418g source, long byteCount) throws IOException {
            boolean z10;
            boolean z11;
            Intrinsics.j(source, "source");
            u uVar = u.this;
            if (Nv.k.f22781b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (u.this) {
                    z10 = this.finished;
                    z11 = this.readBuffer.getSize() + j10 > this.maxByteCount;
                    Unit unit = Unit.f143329a;
                }
                if (z11) {
                    source.skip(j10);
                    u.this.g(a.f39041f);
                    return;
                }
                if (z10) {
                    source.skip(j10);
                    return;
                }
                long j11 = source.read(this.receiveBuffer, j10);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j10 -= j11;
                u uVar2 = u.this;
                synchronized (uVar2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.a();
                        } else {
                            boolean z12 = this.readBuffer.getSize() == 0;
                            this.readBuffer.t2(this.receiveBuffer);
                            if (z12) {
                                Intrinsics.h(uVar2, "null cannot be cast to non-null type java.lang.Object");
                                uVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            i(byteCount);
            u.this.getConnection().getFlowControlListener().a(u.this.getId(), u.this.getReadBytes(), this.readBuffer.getSize());
        }

        public final void g(boolean z10) {
            this.finished = z10;
        }

        public final void h(Headers headers) {
            this.trailers = headers;
        }

        @Override // gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z10;
            long j10;
            Intrinsics.j(sink, "sink");
            long j11 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                u uVar = u.this;
                synchronized (uVar) {
                    boolean zH = uVar.h();
                    if (zH) {
                        uVar.getReadTimeout().t();
                    }
                    try {
                        if (uVar.j() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = uVar.getErrorException();
                            if (errorException == null) {
                                a aVarJ = uVar.j();
                                Intrinsics.g(aVarJ);
                                errorException = new StreamResetException(aVarJ);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.readBuffer.getSize() > j11) {
                            C14416e c14416e = this.readBuffer;
                            j10 = c14416e.read(sink, Math.min(byteCount, c14416e.getSize()));
                            WindowCounter.c(uVar.getReadBytes(), j10, 0L, 2, null);
                            long jA = uVar.getReadBytes().a();
                            if (errorException == null && jA >= uVar.getConnection().getOkHttpSettings().c() / 2) {
                                uVar.getConnection().D1(uVar.getId(), jA);
                                WindowCounter.c(uVar.getReadBytes(), 0L, jA, 1, null);
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                uVar.C();
                                z10 = true;
                            }
                            j10 = -1;
                        }
                        if (zH) {
                            uVar.getReadTimeout().A();
                        }
                        Unit unit = Unit.f143329a;
                    } finally {
                    }
                }
                u.this.getConnection().getFlowControlListener().a(u.this.getId(), u.this.getReadBytes(), this.readBuffer.getSize());
                if (!z10) {
                    if (j10 != -1) {
                        return j10;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j11 = 0;
            }
        }

        @Override // gw.K
        /* renamed from: timeout */
        public L getTimeout() {
            return u.this.getReadTimeout();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LUv/u$d;", "Lgw/c;", "<init>", "(LUv/u;)V", "", "z", "()V", "Ljava/io/IOException;", "cause", "v", "(Ljava/io/IOException;)Ljava/io/IOException;", "A", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d extends C14414c {
        public d() {
        }

        @Override // gw.C14414c
        protected IOException v(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // gw.C14414c
        protected void z() {
            u.this.g(a.f39046k);
            u.this.getConnection().c1();
        }

        public final void A() throws IOException {
            if (!u()) {
            } else {
                throw v(null);
            }
        }
    }

    public final Headers B(boolean callerIsIdle) throws IOException {
        Headers headers;
        synchronized (this) {
            while (this.headersQueue.isEmpty() && j() == null) {
                try {
                    boolean z10 = callerIsIdle || h();
                    if (z10) {
                        this.readTimeout.t();
                    }
                    try {
                        C();
                        if (z10) {
                            this.readTimeout.A();
                        }
                    } catch (Throwable th2) {
                        if (z10) {
                            this.readTimeout.A();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.headersQueue.isEmpty()) {
                IOException iOException = this.errorException;
                if (iOException != null) {
                    throw iOException;
                }
                a aVarJ = j();
                Intrinsics.g(aVarJ);
                throw new StreamResetException(aVarJ);
            }
            Headers headersRemoveFirst = this.headersQueue.removeFirst();
            Intrinsics.i(headersRemoveFirst, "removeFirst(...)");
            headers = headersRemoveFirst;
        }
        return headers;
    }

    public final a j() {
        a aVar;
        synchronized (this) {
            aVar = this.errorCode;
        }
        return aVar;
    }

    public final boolean u() {
        synchronized (this) {
            try {
                if (j() != null) {
                    return false;
                }
                if (getSource().getFinished() || getSource().getClosed()) {
                    if (getSink().getFinished() || getSink().getClosed()) {
                        if (this.hasResponseHeaders) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r1 = this;
            monitor-enter(r1)
            Uv.u$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            Uv.u$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            gw.e r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.i2()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r1)
            return r0
        L20:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Uv.u.v():boolean");
    }

    public u(int i10, n connection, boolean z10, boolean z11, Headers headers) {
        Intrinsics.j(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.readBytes = new WindowCounter(i10);
        this.writeBytesMaximum = connection.getPeerSettings().c();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(connection.getOkHttpSettings().c(), z11);
        this.sink = new b(z10);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (headers == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean f(a errorCode, IOException errorException) {
        if (Nv.k.f22781b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (j() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (getSource().getFinished() && getSink().getFinished()) {
                return false;
            }
            Unit unit = Unit.f143329a;
            this.connection.Z0(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        return !this.connection.getClient() || getSink().getClosed() || getSink().getFinished();
    }

    public final void A(long j10) {
        this.writeBytesTotal = j10;
    }

    public final void C() throws InterruptedException, InterruptedIOException {
        try {
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final L D() {
        return this.writeTimeout;
    }

    public final void b(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void c() throws IOException {
        boolean z10;
        boolean zU;
        if (Nv.k.f22781b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !getSource().getFinished() && getSource().getClosed() && (getSink().getFinished() || getSink().getClosed());
                zU = u();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            e(a.f39046k, null);
        } else {
            if (zU) {
                return;
            }
            this.connection.Z0(this.id);
        }
    }

    public final void e(a rstStatusCode, IOException errorException) throws IOException {
        Intrinsics.j(rstStatusCode, "rstStatusCode");
        if (f(rstStatusCode, errorException)) {
            this.connection.y1(this.id, rstStatusCode);
        }
    }

    public final void g(a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        if (f(errorCode, null)) {
            this.connection.A1(this.id, errorCode);
        }
    }

    /* renamed from: i, reason: from getter */
    public final n getConnection() {
        return this.connection;
    }

    /* renamed from: k, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* renamed from: l, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: m, reason: from getter */
    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    /* renamed from: n, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: o, reason: from getter */
    public b getSink() {
        return this.sink;
    }

    /* renamed from: p, reason: from getter */
    public c getSource() {
        return this.source;
    }

    /* renamed from: q, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: r, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* renamed from: s, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean t() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final L w() {
        return this.readTimeout;
    }

    public final void x(InterfaceC14418g source, int length) throws IOException {
        Intrinsics.j(source, "source");
        if (!Nv.k.f22781b || !Thread.holdsLock(this)) {
            getSource().d(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void y(Headers headers, boolean inFinished) {
        boolean zU;
        Intrinsics.j(headers, "headers");
        if (Nv.k.f22781b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && headers.get(":status") == null && headers.get(":method") == null) {
                    getSource().h(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    getSource().g(true);
                }
                zU = u();
                Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            return;
        }
        this.connection.Z0(this.id);
    }

    public final void z(a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (j() == null) {
                    this.errorCode = errorCode;
                    Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() throws IOException {
        if (!getSink().getClosed()) {
            if (!getSink().getFinished()) {
                if (j() != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        a aVarJ = j();
                        Intrinsics.g(aVarJ);
                        throw new StreamResetException(aVarJ);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }
}
