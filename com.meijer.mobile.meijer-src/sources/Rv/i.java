package Rv;

import Sv.d;
import dw.h;
import gw.AbstractC14425n;
import gw.AbstractC14426o;
import gw.C14416e;
import gw.J;
import gw.K;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000274B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\r\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\r\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u001aJ\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u001aJ\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u001aJ\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u001aJ?\u00104\u001a\u00028\u0000\"\n\b\u0000\u0010/*\u0004\u0018\u00010\f2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020\u00152\b\b\u0002\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR$\u0010G\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010FR$\u0010I\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010F¨\u0006P"}, d2 = {"LRv/i;", "", "LRv/o;", "call", "Lokhttp3/g;", "eventListener", "LRv/j;", "finder", "LSv/d;", "codec", "<init>", "(LRv/o;Lokhttp3/g;LRv/j;LSv/d;)V", "Ljava/io/IOException;", "e", "", "w", "(Ljava/io/IOException;)V", "Lokhttp3/Request;", "request", "y", "(Lokhttp3/Request;)V", "", "duplex", "Lgw/J;", "(Lokhttp3/Request;Z)Lgw/J;", "h", "()V", "g", "v", "expectContinue", "Lokhttp3/Response$a;", "t", "(Z)Lokhttp3/Response$a;", "Lokhttp3/Response;", "response", "u", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "s", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Ldw/h$d;", "p", "()Ldw/h$d;", "x", "q", "d", "f", "E", "", "bytesRead", "responseDone", "requestDone", "b", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "r", "a", "LRv/o;", "i", "()LRv/o;", "Lokhttp3/g;", "k", "()Lokhttp3/g;", "c", "LRv/j;", "l", "()LRv/j;", "LSv/d;", "value", "Z", "o", "()Z", "isDuplex", "m", "hasFailure", "LRv/p;", "j", "()LRv/p;", "connection", "n", "isCoalescedConnection", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.g eventListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j finder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Sv.d codec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasFailure;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001f"}, d2 = {"LRv/i$a;", "Lgw/n;", "Lgw/J;", "delegate", "", "contentLength", "<init>", "(LRv/i;Lgw/J;J)V", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lgw/e;", "source", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "b", "J", "", "c", "Z", "completed", "d", "bytesReceived", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    private final class a extends AbstractC14425n {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f34115f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, J delegate, long j10) {
            super(delegate);
            Intrinsics.j(delegate, "delegate");
            this.f34115f = iVar;
            this.contentLength = j10;
        }

        private final <E extends IOException> E a(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            return (E) i.c(this.f34115f, this.bytesReceived, false, true, e10, 2, null);
        }

        @Override // gw.AbstractC14425n, gw.J
        public void E1(C14416e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.contentLength;
            if (j10 == -1 || this.bytesReceived + byteCount <= j10) {
                try {
                    super.E1(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }

        @Override // gw.AbstractC14425n, gw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // gw.AbstractC14425n, gw.J, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001f"}, d2 = {"LRv/i$b;", "Lgw/o;", "Lgw/K;", "delegate", "", "contentLength", "<init>", "(LRv/i;Lgw/K;J)V", "Lgw/e;", "sink", "byteCount", "read", "(Lgw/e;J)J", "", "close", "()V", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "b", "bytesReceived", "", "c", "Z", "invokeStartEvent", "d", "completed", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class b extends AbstractC14426o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f34121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, K delegate, long j10) {
            super(delegate);
            Intrinsics.j(delegate, "delegate");
            this.f34121f = iVar;
            this.contentLength = j10;
            this.invokeStartEvent = true;
            if (j10 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            if (e10 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f34121f.getEventListener().x(this.f34121f.getCall());
            }
            return (E) i.c(this.f34121f, this.bytesReceived, true, false, e10, 4, null);
        }

        @Override // gw.AbstractC14426o, gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // gw.AbstractC14426o, gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f34121f.getEventListener().x(this.f34121f.getCall());
                }
                if (j10 == -1) {
                    a(null);
                    return -1L;
                }
                long j11 = this.bytesReceived + j10;
                long j12 = this.contentLength;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j11);
                }
                this.bytesReceived = j11;
                if (this.f34121f.codec.f()) {
                    a(null);
                }
                return j10;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    private final void w(IOException e10) {
        this.hasFailure = true;
        this.codec.getCarrier().f(this.call, e10);
    }

    public final void x() {
        c(this, 0L, true, true, null, 1, null);
    }

    public i(o call, okhttp3.g eventListener, j finder, Sv.d codec) {
        Intrinsics.j(call, "call");
        Intrinsics.j(eventListener, "eventListener");
        Intrinsics.j(finder, "finder");
        Intrinsics.j(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
    }

    public static /* synthetic */ IOException c(i iVar, long j10, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return iVar.b(j10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, iOException);
    }

    public final <E extends IOException> E b(long bytesRead, boolean responseDone, boolean requestDone, E e10) {
        if (e10 != null) {
            w(e10);
        }
        if (requestDone) {
            if (e10 != null) {
                this.eventListener.t(this.call, e10);
            } else {
                this.eventListener.r(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e10 != null) {
                this.eventListener.y(this.call, e10);
            } else {
                this.eventListener.w(this.call, bytesRead);
            }
        }
        return (E) this.call.s(this, requestDone, responseDone, e10);
    }

    public final void d() {
        this.codec.cancel();
    }

    public final J e(Request request, boolean duplex) throws IOException {
        Intrinsics.j(request, "request");
        this.isDuplex = duplex;
        RequestBody body = request.getBody();
        Intrinsics.g(body);
        long jContentLength = body.contentLength();
        this.eventListener.s(this.call);
        return new a(this, this.codec.d(request, jContentLength), jContentLength);
    }

    public final void f() {
        this.codec.cancel();
        this.call.s(this, true, true, null);
    }

    public final void g() throws IOException {
        try {
            this.codec.a();
        } catch (IOException e10) {
            this.eventListener.t(this.call, e10);
            w(e10);
            throw e10;
        }
    }

    public final void h() throws IOException {
        try {
            this.codec.h();
        } catch (IOException e10) {
            this.eventListener.t(this.call, e10);
            w(e10);
            throw e10;
        }
    }

    /* renamed from: i, reason: from getter */
    public final o getCall() {
        return this.call;
    }

    public final p j() {
        d.a aVarI = this.codec.getCarrier();
        p pVar = aVarI instanceof p ? (p) aVarI : null;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    /* renamed from: k, reason: from getter */
    public final okhttp3.g getEventListener() {
        return this.eventListener;
    }

    /* renamed from: l, reason: from getter */
    public final j getFinder() {
        return this.finder;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean n() {
        return !Intrinsics.e(this.finder.getRoutePlanner().getAddress().getUrl().getHost(), this.codec.getCarrier().getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost());
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final h.d p() throws SocketException {
        this.call.y();
        d.a aVarI = this.codec.getCarrier();
        Intrinsics.h(aVarI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        return ((p) aVarI).u(this);
    }

    public final void q() {
        this.codec.getCarrier().c();
    }

    public final void r() {
        o.t(this.call, this, true, false, null, 4, null);
    }

    public final ResponseBody s(Response response) throws IOException {
        Intrinsics.j(response, "response");
        try {
            String strJ = Response.j(response, "Content-Type", null, 2, null);
            long jC = this.codec.c(response);
            return new Sv.h(strJ, jC, gw.w.c(new b(this, this.codec.b(response), jC)));
        } catch (IOException e10) {
            this.eventListener.y(this.call, e10);
            w(e10);
            throw e10;
        }
    }

    public final Response.a t(boolean expectContinue) throws IOException {
        try {
            Response.a aVarG = this.codec.g(expectContinue);
            if (aVarG == null) {
                return aVarG;
            }
            aVarG.k(this);
            return aVarG;
        } catch (IOException e10) {
            this.eventListener.y(this.call, e10);
            w(e10);
            throw e10;
        }
    }

    public final void u(Response response) {
        Intrinsics.j(response, "response");
        this.eventListener.z(this.call, response);
    }

    public final void v() {
        this.eventListener.A(this.call);
    }

    public final void y(Request request) throws IOException {
        Intrinsics.j(request, "request");
        try {
            this.eventListener.v(this.call);
            this.codec.e(request);
            this.eventListener.u(this.call, request);
        } catch (IOException e10) {
            this.eventListener.t(this.call, e10);
            w(e10);
            throw e10;
        }
    }
}
