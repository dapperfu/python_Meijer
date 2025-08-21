package ih;

import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.launchdarkly.eventsource.UnsuccessfulResponseException;
import com.medallia.digital.mobilesdk.l8;
import ih.InterfaceC14742i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jh.C15034c;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: ih.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14748o implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    private static final Headers f137638w = new Headers.a().a("Accept", "text/event-stream").a("Cache-Control", "no-cache").f();

    /* renamed from: a, reason: collision with root package name */
    final C15034c f137639a;

    /* renamed from: b, reason: collision with root package name */
    private final String f137640b;

    /* renamed from: c, reason: collision with root package name */
    private volatile HttpUrl f137641c;

    /* renamed from: d, reason: collision with root package name */
    private final Headers f137642d;

    /* renamed from: e, reason: collision with root package name */
    private final String f137643e;

    /* renamed from: f, reason: collision with root package name */
    private final RequestBody f137644f;

    /* renamed from: g, reason: collision with root package name */
    private final c f137645g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f137646h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f137647i;

    /* renamed from: j, reason: collision with root package name */
    final int f137648j;

    /* renamed from: k, reason: collision with root package name */
    volatile long f137649k;

    /* renamed from: l, reason: collision with root package name */
    final long f137650l;

    /* renamed from: m, reason: collision with root package name */
    final long f137651m;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f137652n;

    /* renamed from: o, reason: collision with root package name */
    final C14740g f137653o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC14742i f137654p;

    /* renamed from: q, reason: collision with root package name */
    final boolean f137655q;

    /* renamed from: r, reason: collision with root package name */
    final Set<String> f137656r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<EnumC14753t> f137657s;

    /* renamed from: t, reason: collision with root package name */
    private final OkHttpClient f137658t;

    /* renamed from: u, reason: collision with root package name */
    private volatile okhttp3.d f137659u;

    /* renamed from: v, reason: collision with root package name */
    private final SecureRandom f137660v = new SecureRandom();

    /* renamed from: ih.o$a */
    class a implements InterfaceC14743j {
        a() {
        }

        @Override // ih.InterfaceC14743j
        public void a(long j10) {
            C14748o.this.H(j10);
        }

        @Override // ih.InterfaceC14743j
        public void b(String str) {
            C14748o.this.D(str);
        }
    }

    /* renamed from: ih.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f137662a;

        /* renamed from: b, reason: collision with root package name */
        private long f137663b;

        /* renamed from: c, reason: collision with root package name */
        private long f137664c;

        /* renamed from: d, reason: collision with root package name */
        private long f137665d;

        /* renamed from: e, reason: collision with root package name */
        private String f137666e;

        /* renamed from: f, reason: collision with root package name */
        private final HttpUrl f137667f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC14744k f137668g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC14742i f137669h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f137670i;

        /* renamed from: j, reason: collision with root package name */
        private Headers f137671j;

        /* renamed from: k, reason: collision with root package name */
        private Proxy f137672k;

        /* renamed from: l, reason: collision with root package name */
        private Mv.a f137673l;

        /* renamed from: m, reason: collision with root package name */
        private String f137674m;

        /* renamed from: n, reason: collision with root package name */
        private c f137675n;

        /* renamed from: o, reason: collision with root package name */
        private RequestBody f137676o;

        /* renamed from: p, reason: collision with root package name */
        private OkHttpClient.Builder f137677p;

        /* renamed from: q, reason: collision with root package name */
        private int f137678q;

        /* renamed from: r, reason: collision with root package name */
        private C15034c f137679r;

        /* renamed from: s, reason: collision with root package name */
        private int f137680s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f137681t;

        /* renamed from: u, reason: collision with root package name */
        private Set<String> f137682u;

        /* renamed from: ih.o$b$a */
        public interface a {
            void a(OkHttpClient.Builder builder);
        }

        public b(InterfaceC14744k interfaceC14744k, URI uri) {
            this(interfaceC14744k, uri == null ? null : HttpUrl.h(uri));
        }

        public b(InterfaceC14744k interfaceC14744k, HttpUrl httpUrl) {
            this.f137663b = 1000L;
            this.f137664c = 30000L;
            this.f137665d = l8.b.f93364b;
            this.f137669h = InterfaceC14742i.f137611a;
            this.f137670i = null;
            this.f137671j = Headers.n(new String[0]);
            this.f137673l = null;
            this.f137674m = "GET";
            this.f137675n = null;
            this.f137676o = null;
            this.f137678q = 1000;
            this.f137679r = null;
            this.f137680s = 0;
            this.f137682u = null;
            if (interfaceC14744k == null) {
                throw new IllegalArgumentException("handler must not be null");
            }
            if (httpUrl == null) {
                throw new IllegalArgumentException("URI/URL must not be null");
            }
            this.f137667f = httpUrl;
            this.f137668g = interfaceC14744k;
            this.f137677p = w();
        }

        private static OkHttpClient.Builder w() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder);
            OkHttpClient.Builder builderF = builder.f(new Mv.h(1, 1L, TimeUnit.SECONDS));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderX = builderF.d(10000L, timeUnit).V(5000L, timeUnit).b0(5000L, timeUnit).X(true);
            try {
                builderX.a0(new C14752s(), x());
            } catch (GeneralSecurityException unused) {
            }
            return builderX;
        }

        public b B(c cVar) {
            this.f137675n = cVar;
            return this;
        }

        public b t(RequestBody requestBody) {
            this.f137676o = requestBody;
            return this;
        }

        public C14748o u() {
            Proxy proxy = this.f137672k;
            if (proxy != null) {
                this.f137677p.T(proxy);
            }
            Mv.a aVar = this.f137673l;
            if (aVar != null) {
                this.f137677p.U(aVar);
            }
            return new C14748o(this);
        }

        public b v(a aVar) {
            aVar.a(this.f137677p);
            return this;
        }

        public b z(String str) {
            this.f137674m = (str == null || str.length() <= 0) ? "GET" : str.toUpperCase();
            return this;
        }

        private static X509TrustManager x() throws GeneralSecurityException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        }

        public b A(long j10, TimeUnit timeUnit) {
            this.f137663b = C14748o.z(j10, timeUnit);
            return this;
        }

        public b y(long j10, TimeUnit timeUnit) {
            this.f137664c = C14748o.z(j10, timeUnit);
            return this;
        }
    }

    /* renamed from: ih.o$c */
    public interface c {
        Request a(Request request);
    }

    private void A(AtomicLong atomicLong) throws Exception {
        InterfaceC14742i.b bVarP = InterfaceC14742i.b.PROCEED;
        AtomicReference<EnumC14753t> atomicReference = this.f137657s;
        EnumC14753t enumC14753t = EnumC14753t.CONNECTING;
        this.f137639a.c("readyState change: {} -> {}", atomicReference.getAndSet(enumC14753t), enumC14753t);
        atomicLong.set(0L);
        this.f137659u = this.f137658t.b(j());
        try {
            try {
                Response responseExecute = FirebasePerfOkHttpClient.execute(this.f137659u);
                try {
                    if (responseExecute.getIsSuccessful()) {
                        atomicLong.set(System.currentTimeMillis());
                        u(responseExecute);
                        EnumC14753t enumC14753t2 = this.f137657s.get();
                        if (enumC14753t2 != EnumC14753t.SHUTDOWN && enumC14753t2 != EnumC14753t.CLOSED) {
                            this.f137639a.n("Connection unexpectedly closed");
                            bVarP = this.f137654p.a(new EOFException());
                        }
                    } else {
                        this.f137639a.b("Unsuccessful response: {}", responseExecute);
                        bVarP = p(new UnsuccessfulResponseException(responseExecute.getCode()));
                    }
                    responseExecute.close();
                    if (bVarP == InterfaceC14742i.b.SHUTDOWN) {
                        this.f137639a.i("Connection has been explicitly shut down by error handler");
                        close();
                        return;
                    }
                    AtomicReference<EnumC14753t> atomicReference2 = this.f137657s;
                    EnumC14753t enumC14753t3 = EnumC14753t.OPEN;
                    EnumC14753t enumC14753t4 = EnumC14753t.CLOSED;
                    boolean zA = U.d.a(atomicReference2, enumC14753t3, enumC14753t4);
                    boolean zA2 = U.d.a(this.f137657s, enumC14753t, enumC14753t4);
                    if (zA) {
                        this.f137639a.c("readyState change: {} -> {}", enumC14753t3, enumC14753t4);
                        this.f137653o.d();
                    } else if (zA2) {
                        this.f137639a.c("readyState change: {} -> {}", enumC14753t, enumC14753t4);
                    }
                } catch (Throwable th2) {
                    if (responseExecute != null) {
                        try {
                            responseExecute.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                EnumC14753t enumC14753t5 = this.f137657s.get();
                if (enumC14753t5 != EnumC14753t.SHUTDOWN && enumC14753t5 != EnumC14753t.CLOSED) {
                    this.f137639a.b("Connection problem: {}", e10);
                    bVarP = p(e10);
                }
                if (bVarP == InterfaceC14742i.b.SHUTDOWN) {
                    this.f137639a.i("Connection has been explicitly shut down by error handler");
                    close();
                    return;
                }
                AtomicReference<EnumC14753t> atomicReference3 = this.f137657s;
                EnumC14753t enumC14753t6 = EnumC14753t.OPEN;
                EnumC14753t enumC14753t7 = EnumC14753t.CLOSED;
                boolean zA3 = U.d.a(atomicReference3, enumC14753t6, enumC14753t7);
                AtomicReference<EnumC14753t> atomicReference4 = this.f137657s;
                EnumC14753t enumC14753t8 = EnumC14753t.CONNECTING;
                boolean zA4 = U.d.a(atomicReference4, enumC14753t8, enumC14753t7);
                if (zA3) {
                    this.f137639a.c("readyState change: {} -> {}", enumC14753t6, enumC14753t7);
                    this.f137653o.d();
                } else if (zA4) {
                    this.f137639a.c("readyState change: {} -> {}", enumC14753t8, enumC14753t7);
                }
            }
        } catch (Throwable th4) {
            if (bVarP != InterfaceC14742i.b.SHUTDOWN) {
                AtomicReference<EnumC14753t> atomicReference5 = this.f137657s;
                EnumC14753t enumC14753t9 = EnumC14753t.OPEN;
                EnumC14753t enumC14753t10 = EnumC14753t.CLOSED;
                boolean zA5 = U.d.a(atomicReference5, enumC14753t9, enumC14753t10);
                AtomicReference<EnumC14753t> atomicReference6 = this.f137657s;
                EnumC14753t enumC14753t11 = EnumC14753t.CONNECTING;
                boolean zA6 = U.d.a(atomicReference6, enumC14753t11, enumC14753t10);
                if (zA5) {
                    this.f137639a.c("readyState change: {} -> {}", enumC14753t9, enumC14753t10);
                    this.f137653o.d();
                } else if (zA6) {
                    this.f137639a.c("readyState change: {} -> {}", enumC14753t11, enumC14753t10);
                }
            } else {
                this.f137639a.i("Connection has been explicitly shut down by error handler");
                close();
            }
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() throws Exception {
        AtomicLong atomicLong = new AtomicLong();
        int iW = 0;
        while (!Thread.currentThread().isInterrupted() && this.f137657s.get() != EnumC14753t.SHUTDOWN) {
            try {
                iW = iW == 0 ? iW + 1 : w(iW, atomicLong.get());
                A(atomicLong);
            } catch (RejectedExecutionException e10) {
                this.f137659u = null;
                this.f137639a.b("Rejected execution exception ignored: {}", e10);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        this.f137652n = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(long j10) {
        this.f137649k = j10;
    }

    private static TimeUnit K(TimeUnit timeUnit) {
        return timeUnit == null ? TimeUnit.MILLISECONDS : timeUnit;
    }

    private static Headers h(Headers headers) {
        Headers.a aVar = new Headers.a();
        for (String str : f137638w.names()) {
            if (!headers.names().contains(str)) {
                Iterator<String> it = f137638w.q(str).iterator();
                while (it.hasNext()) {
                    aVar.a(str, it.next());
                }
            }
        }
        for (String str2 : headers.names()) {
            Iterator<String> it2 = headers.q(str2).iterator();
            while (it2.hasNext()) {
                aVar.a(str2, it2.next());
            }
        }
        return aVar.f();
    }

    private void l(EnumC14753t enumC14753t) throws Exception {
        if (enumC14753t == EnumC14753t.OPEN) {
            this.f137653o.d();
        }
        if (this.f137659u != null) {
            this.f137659u.cancel();
            this.f137639a.a("call cancelled");
        }
    }

    private InterfaceC14742i.b p(Throwable th2) throws Exception {
        InterfaceC14742i.b bVarA = this.f137654p.a(th2);
        if (bVarA != InterfaceC14742i.b.SHUTDOWN) {
            this.f137653o.onError(th2);
        }
        return bVarA;
    }

    private void u(Response response) throws Exception {
        a aVar = new a();
        AtomicReference<EnumC14753t> atomicReference = this.f137657s;
        EnumC14753t enumC14753t = EnumC14753t.OPEN;
        EnumC14753t andSet = atomicReference.getAndSet(enumC14753t);
        if (andSet != EnumC14753t.CONNECTING) {
            this.f137639a.n("Unexpected readyState change: " + andSet + " -> " + enumC14753t);
        } else {
            this.f137639a.c("readyState change: {} -> {}", andSet, enumC14753t);
        }
        this.f137639a.i("Connected to EventSource stream.");
        this.f137653o.c();
        C14745l c14745l = new C14745l(response.getBody().byteStream(), this.f137641c.y(), this.f137653o, aVar, this.f137648j, this.f137655q, this.f137656r, this.f137639a);
        while (!Thread.currentThread().isInterrupted() && !c14745l.d()) {
            c14745l.f();
        }
    }

    private int w(int i10, long j10) throws InterruptedException {
        if (this.f137649k <= 0) {
            return i10;
        }
        if (j10 > 0 && System.currentTimeMillis() - j10 >= this.f137651m) {
            i10 = 1;
        }
        try {
            long jI = i(i10);
            this.f137639a.j("Waiting {} milliseconds before reconnecting...", Long.valueOf(jI));
            Thread.sleep(jI);
        } catch (InterruptedException unused) {
        }
        return i10 + 1;
    }

    public void J() {
        AtomicReference<EnumC14753t> atomicReference = this.f137657s;
        EnumC14753t enumC14753t = EnumC14753t.RAW;
        EnumC14753t enumC14753t2 = EnumC14753t.CONNECTING;
        if (!U.d.a(atomicReference, enumC14753t, enumC14753t2)) {
            this.f137639a.i("Start method called on this already-started EventSource object. Doing nothing");
            return;
        }
        this.f137639a.c("readyState change: {} -> {}", enumC14753t, enumC14753t2);
        this.f137639a.j("Starting EventSource client using URI: {}", this.f137641c);
        this.f137647i.execute(new Runnable() { // from class: ih.n
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f137637a.B();
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        AtomicReference<EnumC14753t> atomicReference = this.f137657s;
        EnumC14753t enumC14753t = EnumC14753t.SHUTDOWN;
        EnumC14753t andSet = atomicReference.getAndSet(enumC14753t);
        this.f137639a.c("readyState change: {} -> {}", andSet, enumC14753t);
        if (andSet == enumC14753t) {
            return;
        }
        l(andSet);
        this.f137646h.shutdown();
        this.f137647i.shutdown();
        if (this.f137658t.getConnectionPool() != null) {
            this.f137658t.getConnectionPool().c();
        }
        if (this.f137658t.getDispatcher() != null) {
            this.f137658t.getDispatcher().a();
            if (this.f137658t.getDispatcher().d() != null) {
                this.f137658t.getDispatcher().d().shutdownNow();
            }
        }
    }

    long i(int i10) {
        long jMin = Math.min(this.f137650l, this.f137649k * AbstractC14749p.a(i10));
        int i11 = jMin > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) jMin;
        return (i11 / 2) + (this.f137660v.nextInt(i11) / 2);
    }

    Request j() {
        Request.a aVarO = new Request.a().n(this.f137642d).v(this.f137641c).o(this.f137643e, this.f137644f);
        if (this.f137652n != null && !this.f137652n.isEmpty()) {
            aVarO.a("Last-Event-ID", this.f137652n);
        }
        Request requestB = aVarO.b();
        c cVar = this.f137645g;
        return cVar == null ? requestB : cVar.a(requestB);
    }

    C14748o(b bVar) {
        String str;
        C15034c c15034cM;
        Semaphore semaphore;
        InterfaceC14742i interfaceC14742i;
        if (bVar.f137662a != null) {
            str = bVar.f137662a;
        } else {
            str = "";
        }
        this.f137640b = str;
        if (bVar.f137679r != null) {
            c15034cM = bVar.f137679r;
        } else {
            c15034cM = C15034c.m();
        }
        this.f137639a = c15034cM;
        this.f137641c = bVar.f137667f;
        this.f137642d = h(bVar.f137671j);
        this.f137643e = bVar.f137674m;
        this.f137644f = bVar.f137676o;
        this.f137645g = bVar.f137675n;
        this.f137652n = bVar.f137666e;
        this.f137649k = bVar.f137663b;
        this.f137650l = bVar.f137664c;
        this.f137651m = bVar.f137665d;
        this.f137655q = bVar.f137681t;
        this.f137656r = bVar.f137682u;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(m("okhttp-eventsource-events", bVar.f137670i));
        this.f137646h = executorServiceNewSingleThreadExecutor;
        this.f137647i = Executors.newSingleThreadExecutor(m("okhttp-eventsource-stream", bVar.f137670i));
        if (bVar.f137680s > 0) {
            semaphore = new Semaphore(bVar.f137680s);
        } else {
            semaphore = null;
        }
        this.f137653o = new C14740g(executorServiceNewSingleThreadExecutor, bVar.f137668g, c15034cM, semaphore);
        if (bVar.f137669h != null) {
            interfaceC14742i = bVar.f137669h;
        } else {
            interfaceC14742i = InterfaceC14742i.f137611a;
        }
        this.f137654p = interfaceC14742i;
        this.f137648j = bVar.f137678q;
        this.f137657s = new AtomicReference<>(EnumC14753t.RAW);
        this.f137658t = bVar.f137677p.a();
    }

    public static /* synthetic */ Thread a(C14748o c14748o, ThreadFactory threadFactory, String str, AtomicLong atomicLong, Integer num, Runnable runnable) {
        c14748o.getClass();
        Thread threadNewThread = threadFactory.newThread(runnable);
        threadNewThread.setName(String.format(Locale.ROOT, "%s-[%s]-%d", str, c14748o.f137640b, Long.valueOf(atomicLong.getAndIncrement())));
        threadNewThread.setDaemon(true);
        if (num != null) {
            threadNewThread.setPriority(num.intValue());
        }
        return threadNewThread;
    }

    private ThreadFactory m(final String str, final Integer num) {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        final AtomicLong atomicLong = new AtomicLong(0L);
        return new ThreadFactory() { // from class: ih.m
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C14748o.a(this.f137632a, threadFactoryDefaultThreadFactory, str, atomicLong, num, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long z(long j10, TimeUnit timeUnit) {
        return K(timeUnit).toMillis(j10);
    }
}
