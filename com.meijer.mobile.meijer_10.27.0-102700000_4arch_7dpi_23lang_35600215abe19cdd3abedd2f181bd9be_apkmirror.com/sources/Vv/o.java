package Vv;

import Vv.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15326c;
import kw.K;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001V\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002EIB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010$J%\u0010-\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J?\u00109\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f2\u0006\u00106\u001a\u00020/2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b;\u0010\u0012J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u000eJ\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010!J\u000f\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0004\bD\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u0010L\u001a\u0004\bM\u0010!R\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u001a\u0010U\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\u0019\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010_R(\u00103\u001a\u0004\u0018\u0001022\b\u0010a\u001a\u0004\u0018\u0001028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010LR(\u0010i\u001a\u0004\u0018\u00010/2\b\u0010a\u001a\u0004\u0018\u00010/8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010f\u001a\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010k\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010LR\u0016\u0010l\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010LR\u0018\u00106\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010fR \u0010s\u001a\b\u0012\u0004\u0012\u00020p0o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010q\u001a\u0004\bm\u0010r¨\u0006t"}, d2 = {"LVv/o;", "Lokhttp3/d;", "", "", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "", "e", "()V", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "z", "", "A", "()Ljava/lang/String;", "Lkw/K;", "timeout", "()Lkw/K;", "f", "()Lokhttp3/d;", "request", "()Lokhttp3/Request;", "cancel", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "LQv/b;", "responseCallback", "b2", "(LQv/b;)V", "q", "newRoutePlanner", "LWv/g;", "chain", "g", "(Lokhttp3/Request;ZLWv/g;)V", "LVv/i;", "r", "(LWv/g;)LVv/i;", "LVv/p;", "connection", "c", "(LVv/p;)V", "exchange", "requestDone", "responseDone", "s", "(LVv/i;ZZLjava/io/IOException;)Ljava/io/IOException;", "u", "Ljava/net/Socket;", "w", "()Ljava/net/Socket;", "y", "closeExchange", "i", "(Z)V", "x", "v", "a", "Lokhttp3/OkHttpClient;", "j", "()Lokhttp3/OkHttpClient;", "b", "Lokhttp3/Request;", "o", "Z", "m", "LVv/q;", "LVv/q;", "connectionPool", "Lokhttp3/g;", "Lokhttp3/g;", "l", "()Lokhttp3/g;", "eventListener", "Vv/o$c", "LVv/o$c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "h", "Ljava/lang/Object;", "callStackTrace", "LVv/j;", "LVv/j;", "exchangeFinder", "value", "LVv/p;", "k", "()LVv/p;", "timeoutEarlyExit", "LVv/i;", "n", "()LVv/i;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "p", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "LVv/v$b;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "plansToCancel", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class o implements okhttp3.d, Cloneable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Request originalRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q connectionPool;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.g eventListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c timeout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private j exchangeFinder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private p connection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i interceptorScopedExchange;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private volatile i exchange;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<v.b> plansToCancel;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010 ¨\u0006\""}, d2 = {"LVv/o$a;", "Ljava/lang/Runnable;", "LQv/b;", "responseCallback", "<init>", "(LVv/o;LQv/b;)V", "LVv/o;", "other", "", "h", "(LVv/o$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "b", "(Ljava/util/concurrent/RejectedExecutionException;)V", "run", "()V", "LQv/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "g", "()Ljava/lang/String;", "host", "()LVv/o;", "call", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Qv.b responseCallback;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile AtomicInteger callsPerHost;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f38142c;

        public a(o oVar, Qv.b responseCallback) {
            Intrinsics.j(responseCallback, "responseCallback");
            this.f38142c = oVar;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            Intrinsics.j(executorService, "executorService");
            Rv.k.e(this.f38142c.getClient().getDispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f38142c.getClient().getDispatcher().g(this);
                }
            } catch (Throwable th2) {
                this.f38142c.getClient().getDispatcher().g(this);
                throw th2;
            }
        }

        public final void b(RejectedExecutionException e10) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e10);
            this.f38142c.u(interruptedIOException);
            this.responseCallback.onFailure(this.f38142c, interruptedIOException);
        }

        /* renamed from: e, reason: from getter */
        public final o getF38142c() {
            return this.f38142c;
        }

        /* renamed from: f, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String g() {
            return this.f38142c.getOriginalRequest().getUrl().getHost();
        }

        public final void h(a other) {
            Intrinsics.j(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            Qv.l dispatcher;
            String str = "OkHttp " + this.f38142c.v();
            o oVar = this.f38142c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                oVar.timeout.v();
                try {
                    try {
                        z10 = true;
                        try {
                            this.responseCallback.onResponse(oVar, oVar.q());
                            dispatcher = oVar.getClient().getDispatcher();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                okhttp3.internal.platform.c.INSTANCE.e().k("Callback failure for " + oVar.A(), 4, e10);
                            } else {
                                this.responseCallback.onFailure(oVar, e10);
                            }
                            dispatcher = oVar.getClient().getDispatcher();
                            dispatcher.g(this);
                        } catch (Throwable th3) {
                            th2 = th3;
                            oVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                ExceptionsKt.a(iOException, th2);
                                this.responseCallback.onFailure(oVar, iOException);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        oVar.getClient().getDispatcher().g(this);
                        throw th4;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th5) {
                    z10 = false;
                    th2 = th5;
                }
                dispatcher.g(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LVv/o$b;", "Ljava/lang/ref/WeakReference;", "LVv/o;", "referent", "", "callStackTrace", "<init>", "(LVv/o;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends WeakReference<o> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o referent, Object obj) {
            super(referent);
            Intrinsics.j(referent, "referent");
            this.callStackTrace = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Vv/o$c", "Lkw/c;", "", "B", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends C15326c {
        c() {
        }

        @Override // kw.C15326c
        protected void B() {
            o.this.cancel();
        }
    }

    public final void i(boolean closeExchange) {
        i iVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f142422a;
        }
        if (closeExchange && (iVar = this.exchange) != null) {
            iVar.f();
        }
        this.interceptorScopedExchange = null;
    }

    public final IOException u(IOException e10) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? d(e10) : e10;
    }

    public o(OkHttpClient client, Request originalRequest, boolean z10) {
        Intrinsics.j(client, "client");
        Intrinsics.j(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().a(this);
        c cVar = new c();
        cVar.g(client.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : "");
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(v());
        return sb2.toString();
    }

    private final <E extends IOException> E d(E e10) throws IOException {
        Socket socketW;
        boolean z10 = Rv.k.f33047b;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        p pVar = this.connection;
        if (pVar != null) {
            if (z10 && Thread.holdsLock(pVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVar);
            }
            synchronized (pVar) {
                socketW = w();
            }
            if (this.connection == null) {
                if (socketW != null) {
                    Rv.k.h(socketW);
                }
                this.eventListener.l(this, pVar);
                pVar.getConnectionListener().g(pVar, this);
                if (socketW != null) {
                    pVar.getConnectionListener().f(pVar);
                }
            } else if (socketW != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e11 = (E) z(e10);
        if (e10 == null) {
            this.eventListener.d(this);
            return e11;
        }
        okhttp3.g gVar = this.eventListener;
        Intrinsics.g(e11);
        gVar.e(this, e11);
        return e11;
    }

    private final void e() {
        this.callStackTrace = okhttp3.internal.platform.c.INSTANCE.e().i("response.body().close()");
        this.eventListener.f(this);
    }

    public static /* synthetic */ IOException t(o oVar, i iVar, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return oVar.s(iVar, z10, z11, iOException);
    }

    private final <E extends IOException> E z(E cause) {
        if (this.timeoutEarlyExit || !this.timeout.w()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @Override // okhttp3.d
    public void b2(Qv.b responseCallback) {
        Intrinsics.j(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        this.client.getDispatcher().b(new a(this, responseCallback));
    }

    public final void c(p connection) {
        Intrinsics.j(connection, "connection");
        if (!Rv.k.f33047b || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.j().add(new b(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.d
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        i iVar = this.exchange;
        if (iVar != null) {
            iVar.d();
        }
        Iterator<v.b> it = this.plansToCancel.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.eventListener.g(this);
    }

    @Override // okhttp3.d
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.v();
        e();
        try {
            this.client.getDispatcher().c(this);
            return q();
        } finally {
            this.client.getDispatcher().h(this);
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public okhttp3.d clone() {
        return new o(this.client, this.originalRequest, this.forWebSocket);
    }

    public final void g(Request request, boolean newRoutePlanner, Wv.g chain) {
        Intrinsics.j(request, "request");
        Intrinsics.j(chain, "chain");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f142422a;
        }
        if (newRoutePlanner) {
            r rVar = new r(this.client.getTaskRunner(), this.connectionPool, this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis(), chain.getConnectTimeoutMillis(), chain.getReadTimeoutMillis(), this.client.getPingIntervalMillis(), this.client.getRetryOnConnectionFailure(), this.client.getFastFallback(), this.client.f(request.getUrl()), this.client.getRouteDatabase(), new Vv.b(this, this.connectionPool.getConnectionListener(), chain));
            this.exchangeFinder = this.client.getFastFallback() ? new l(rVar, this.client.getTaskRunner()) : new x(rVar);
        }
    }

    @Override // okhttp3.d
    /* renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    /* renamed from: j, reason: from getter */
    public final OkHttpClient getClient() {
        return this.client;
    }

    /* renamed from: k, reason: from getter */
    public final p getConnection() {
        return this.connection;
    }

    /* renamed from: l, reason: from getter */
    public final okhttp3.g getEventListener() {
        return this.eventListener;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* renamed from: n, reason: from getter */
    public final i getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    /* renamed from: o, reason: from getter */
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final CopyOnWriteArrayList<v.b> p() {
        return this.plansToCancel;
    }

    public final Response q() throws IOException {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.C(arrayList, this.client.y());
        arrayList.add(new Wv.j(this.client));
        arrayList.add(new Wv.a(this.client.getCookieJar()));
        arrayList.add(new Tv.a(this.client.getCache()));
        arrayList.add(Vv.c.f38062a);
        if (!this.forWebSocket) {
            CollectionsKt.C(arrayList, this.client.A());
        }
        arrayList.add(new Wv.b(this.forWebSocket));
        boolean z10 = false;
        try {
            try {
                Response responseProceed = new Wv.g(this, arrayList, 0, null, this.originalRequest, this.client.getConnectTimeoutMillis(), this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis()).proceed(this.originalRequest);
                if (getCanceled()) {
                    Rv.h.f(responseProceed);
                    throw new IOException("Canceled");
                }
                u(null);
                return responseProceed;
            } catch (IOException e10) {
                z10 = true;
                IOException iOExceptionU = u(e10);
                Intrinsics.h(iOExceptionU, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionU;
            }
        } catch (Throwable th2) {
            if (!z10) {
                u(null);
            }
            throw th2;
        }
    }

    public final i r(Wv.g chain) throws IOException {
        Intrinsics.j(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f142422a;
        }
        j jVar = this.exchangeFinder;
        Intrinsics.g(jVar);
        i iVar = new i(this, this.eventListener, jVar, jVar.a().t(this.client, chain));
        this.interceptorScopedExchange = iVar;
        this.exchange = iVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return iVar;
    }

    @Override // okhttp3.d
    public Request request() {
        return this.originalRequest;
    }

    public final <E extends IOException> E s(i exchange, boolean requestDone, boolean responseDone, E e10) {
        boolean z10;
        boolean z11;
        Intrinsics.j(exchange, "exchange");
        if (Intrinsics.e(exchange, this.exchange)) {
            synchronized (this) {
                z10 = false;
                if (requestDone) {
                    try {
                        if (!this.requestBodyOpen) {
                            if (responseDone || !this.responseBodyOpen) {
                                z11 = false;
                            }
                            Unit unit = Unit.f142422a;
                        }
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        boolean z12 = this.requestBodyOpen;
                        boolean z13 = (z12 || this.responseBodyOpen) ? false : true;
                        if (!z12 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                            z10 = true;
                        }
                        z11 = z10;
                        z10 = z13;
                        Unit unit2 = Unit.f142422a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (responseDone) {
                    }
                    z11 = false;
                    Unit unit22 = Unit.f142422a;
                }
            }
            if (z10) {
                this.exchange = null;
                p pVar = this.connection;
                if (pVar != null) {
                    pVar.p();
                }
            }
            if (z11) {
                return (E) d(e10);
            }
        }
        return e10;
    }

    @Override // okhttp3.d
    public K timeout() {
        return this.timeout;
    }

    public final String v() {
        return this.originalRequest.getUrl().v();
    }

    public final Socket w() {
        p pVar = this.connection;
        Intrinsics.g(pVar);
        if (Rv.k.f33047b && !Thread.holdsLock(pVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + pVar);
        }
        List<Reference<o>> listJ = pVar.j();
        Iterator<Reference<o>> it = listJ.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.e(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listJ.remove(i10);
        this.connection = null;
        if (listJ.isEmpty()) {
            pVar.y(System.nanoTime());
            if (this.connectionPool.d(pVar)) {
                return pVar.getSocket();
            }
        }
        return null;
    }

    public final boolean x() {
        i iVar = this.exchange;
        if (iVar == null || !iVar.getHasFailure()) {
            return false;
        }
        j jVar = this.exchangeFinder;
        Intrinsics.g(jVar);
        v vVarB = jVar.getRoutePlanner();
        i iVar2 = this.exchange;
        return vVarB.b(iVar2 != null ? iVar2.j() : null);
    }

    public final void y() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.w();
    }
}
