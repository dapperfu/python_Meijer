package hh;

import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.launchdarkly.eventsource.UnsuccessfulResponseException;
import com.medallia.digital.mobilesdk.l8;
import hh.InterfaceC14462i;
import ih.C14724c;
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
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: hh.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C14468o implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    private static final Headers f134998w = new Headers.a().a("Accept", "text/event-stream").a("Cache-Control", "no-cache").f();

    /* renamed from: a, reason: collision with root package name */
    final C14724c f134999a;

    /* renamed from: b, reason: collision with root package name */
    private final String f135000b;

    /* renamed from: c, reason: collision with root package name */
    private volatile HttpUrl f135001c;

    /* renamed from: d, reason: collision with root package name */
    private final Headers f135002d;

    /* renamed from: e, reason: collision with root package name */
    private final String f135003e;

    /* renamed from: f, reason: collision with root package name */
    private final RequestBody f135004f;

    /* renamed from: g, reason: collision with root package name */
    private final c f135005g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f135006h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f135007i;

    /* renamed from: j, reason: collision with root package name */
    final int f135008j;

    /* renamed from: k, reason: collision with root package name */
    volatile long f135009k;

    /* renamed from: l, reason: collision with root package name */
    final long f135010l;

    /* renamed from: m, reason: collision with root package name */
    final long f135011m;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f135012n;

    /* renamed from: o, reason: collision with root package name */
    final C14460g f135013o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC14462i f135014p;

    /* renamed from: q, reason: collision with root package name */
    final boolean f135015q;

    /* renamed from: r, reason: collision with root package name */
    final Set<String> f135016r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<EnumC14473t> f135017s;

    /* renamed from: t, reason: collision with root package name */
    private final OkHttpClient f135018t;

    /* renamed from: u, reason: collision with root package name */
    private volatile okhttp3.d f135019u;

    /* renamed from: v, reason: collision with root package name */
    private final SecureRandom f135020v = new SecureRandom();

    /* renamed from: hh.o$a */
    class a implements InterfaceC14463j {
        a() {
        }

        @Override // hh.InterfaceC14463j
        public void a(long j10) {
            C14468o.this.H(j10);
        }

        @Override // hh.InterfaceC14463j
        public void b(String str) {
            C14468o.this.D(str);
        }
    }

    /* renamed from: hh.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f135022a;

        /* renamed from: b, reason: collision with root package name */
        private long f135023b;

        /* renamed from: c, reason: collision with root package name */
        private long f135024c;

        /* renamed from: d, reason: collision with root package name */
        private long f135025d;

        /* renamed from: e, reason: collision with root package name */
        private String f135026e;

        /* renamed from: f, reason: collision with root package name */
        private final HttpUrl f135027f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC14464k f135028g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC14462i f135029h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f135030i;

        /* renamed from: j, reason: collision with root package name */
        private Headers f135031j;

        /* renamed from: k, reason: collision with root package name */
        private Proxy f135032k;

        /* renamed from: l, reason: collision with root package name */
        private Qv.a f135033l;

        /* renamed from: m, reason: collision with root package name */
        private String f135034m;

        /* renamed from: n, reason: collision with root package name */
        private c f135035n;

        /* renamed from: o, reason: collision with root package name */
        private RequestBody f135036o;

        /* renamed from: p, reason: collision with root package name */
        private OkHttpClient.Builder f135037p;

        /* renamed from: q, reason: collision with root package name */
        private int f135038q;

        /* renamed from: r, reason: collision with root package name */
        private C14724c f135039r;

        /* renamed from: s, reason: collision with root package name */
        private int f135040s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f135041t;

        /* renamed from: u, reason: collision with root package name */
        private Set<String> f135042u;

        /* renamed from: hh.o$b$a */
        public interface a {
            void a(OkHttpClient.Builder builder);
        }

        public b(InterfaceC14464k interfaceC14464k, URI uri) {
            this(interfaceC14464k, uri == null ? null : HttpUrl.h(uri));
        }

        public b(InterfaceC14464k interfaceC14464k, HttpUrl httpUrl) {
            this.f135023b = 1000L;
            this.f135024c = 30000L;
            this.f135025d = l8.b.f92525b;
            this.f135029h = InterfaceC14462i.f134971a;
            this.f135030i = null;
            this.f135031j = Headers.n(new String[0]);
            this.f135033l = null;
            this.f135034m = "GET";
            this.f135035n = null;
            this.f135036o = null;
            this.f135038q = 1000;
            this.f135039r = null;
            this.f135040s = 0;
            this.f135042u = null;
            if (interfaceC14464k == null) {
                throw new IllegalArgumentException("handler must not be null");
            }
            if (httpUrl == null) {
                throw new IllegalArgumentException("URI/URL must not be null");
            }
            this.f135027f = httpUrl;
            this.f135028g = interfaceC14464k;
            this.f135037p = w();
        }

        private static OkHttpClient.Builder w() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder);
            OkHttpClient.Builder builderF = builder.f(new Qv.h(1, 1L, TimeUnit.SECONDS));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderX = builderF.d(10000L, timeUnit).V(5000L, timeUnit).b0(5000L, timeUnit).X(true);
            try {
                builderX.a0(new C14472s(), x());
            } catch (GeneralSecurityException unused) {
            }
            return builderX;
        }

        public b B(c cVar) {
            this.f135035n = cVar;
            return this;
        }

        public b t(RequestBody requestBody) {
            this.f135036o = requestBody;
            return this;
        }

        public C14468o u() {
            Proxy proxy = this.f135032k;
            if (proxy != null) {
                this.f135037p.T(proxy);
            }
            Qv.a aVar = this.f135033l;
            if (aVar != null) {
                this.f135037p.U(aVar);
            }
            return new C14468o(this);
        }

        public b v(a aVar) {
            aVar.a(this.f135037p);
            return this;
        }

        public b z(String str) {
            this.f135034m = (str == null || str.length() <= 0) ? "GET" : str.toUpperCase();
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
            this.f135023b = C14468o.z(j10, timeUnit);
            return this;
        }

        public b y(long j10, TimeUnit timeUnit) {
            this.f135024c = C14468o.z(j10, timeUnit);
            return this;
        }
    }

    /* renamed from: hh.o$c */
    public interface c {
        Request a(Request request);
    }

    private void A(AtomicLong atomicLong) throws Exception {
        InterfaceC14462i.b bVarP = InterfaceC14462i.b.PROCEED;
        AtomicReference<EnumC14473t> atomicReference = this.f135017s;
        EnumC14473t enumC14473t = EnumC14473t.CONNECTING;
        this.f134999a.c("readyState change: {} -> {}", atomicReference.getAndSet(enumC14473t), enumC14473t);
        atomicLong.set(0L);
        this.f135019u = this.f135018t.b(j());
        try {
            try {
                Response responseExecute = FirebasePerfOkHttpClient.execute(this.f135019u);
                try {
                    if (responseExecute.getIsSuccessful()) {
                        atomicLong.set(System.currentTimeMillis());
                        u(responseExecute);
                        EnumC14473t enumC14473t2 = this.f135017s.get();
                        if (enumC14473t2 != EnumC14473t.SHUTDOWN && enumC14473t2 != EnumC14473t.CLOSED) {
                            this.f134999a.n("Connection unexpectedly closed");
                            bVarP = this.f135014p.a(new EOFException());
                        }
                    } else {
                        this.f134999a.b("Unsuccessful response: {}", responseExecute);
                        bVarP = p(new UnsuccessfulResponseException(responseExecute.getCode()));
                    }
                    responseExecute.close();
                    if (bVarP == InterfaceC14462i.b.SHUTDOWN) {
                        this.f134999a.i("Connection has been explicitly shut down by error handler");
                        close();
                        return;
                    }
                    AtomicReference<EnumC14473t> atomicReference2 = this.f135017s;
                    EnumC14473t enumC14473t3 = EnumC14473t.OPEN;
                    EnumC14473t enumC14473t4 = EnumC14473t.CLOSED;
                    boolean zA = U.d.a(atomicReference2, enumC14473t3, enumC14473t4);
                    boolean zA2 = U.d.a(this.f135017s, enumC14473t, enumC14473t4);
                    if (zA) {
                        this.f134999a.c("readyState change: {} -> {}", enumC14473t3, enumC14473t4);
                        this.f135013o.c();
                    } else if (zA2) {
                        this.f134999a.c("readyState change: {} -> {}", enumC14473t, enumC14473t4);
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
                EnumC14473t enumC14473t5 = this.f135017s.get();
                if (enumC14473t5 != EnumC14473t.SHUTDOWN && enumC14473t5 != EnumC14473t.CLOSED) {
                    this.f134999a.b("Connection problem: {}", e10);
                    bVarP = p(e10);
                }
                if (bVarP == InterfaceC14462i.b.SHUTDOWN) {
                    this.f134999a.i("Connection has been explicitly shut down by error handler");
                    close();
                    return;
                }
                AtomicReference<EnumC14473t> atomicReference3 = this.f135017s;
                EnumC14473t enumC14473t6 = EnumC14473t.OPEN;
                EnumC14473t enumC14473t7 = EnumC14473t.CLOSED;
                boolean zA3 = U.d.a(atomicReference3, enumC14473t6, enumC14473t7);
                AtomicReference<EnumC14473t> atomicReference4 = this.f135017s;
                EnumC14473t enumC14473t8 = EnumC14473t.CONNECTING;
                boolean zA4 = U.d.a(atomicReference4, enumC14473t8, enumC14473t7);
                if (zA3) {
                    this.f134999a.c("readyState change: {} -> {}", enumC14473t6, enumC14473t7);
                    this.f135013o.c();
                } else if (zA4) {
                    this.f134999a.c("readyState change: {} -> {}", enumC14473t8, enumC14473t7);
                }
            }
        } catch (Throwable th4) {
            if (bVarP != InterfaceC14462i.b.SHUTDOWN) {
                AtomicReference<EnumC14473t> atomicReference5 = this.f135017s;
                EnumC14473t enumC14473t9 = EnumC14473t.OPEN;
                EnumC14473t enumC14473t10 = EnumC14473t.CLOSED;
                boolean zA5 = U.d.a(atomicReference5, enumC14473t9, enumC14473t10);
                AtomicReference<EnumC14473t> atomicReference6 = this.f135017s;
                EnumC14473t enumC14473t11 = EnumC14473t.CONNECTING;
                boolean zA6 = U.d.a(atomicReference6, enumC14473t11, enumC14473t10);
                if (zA5) {
                    this.f134999a.c("readyState change: {} -> {}", enumC14473t9, enumC14473t10);
                    this.f135013o.c();
                } else if (zA6) {
                    this.f134999a.c("readyState change: {} -> {}", enumC14473t11, enumC14473t10);
                }
            } else {
                this.f134999a.i("Connection has been explicitly shut down by error handler");
                close();
            }
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() throws Exception {
        AtomicLong atomicLong = new AtomicLong();
        int iW = 0;
        while (!Thread.currentThread().isInterrupted() && this.f135017s.get() != EnumC14473t.SHUTDOWN) {
            try {
                iW = iW == 0 ? iW + 1 : w(iW, atomicLong.get());
                A(atomicLong);
            } catch (RejectedExecutionException e10) {
                this.f135019u = null;
                this.f134999a.b("Rejected execution exception ignored: {}", e10);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        this.f135012n = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(long j10) {
        this.f135009k = j10;
    }

    private static TimeUnit K(TimeUnit timeUnit) {
        return timeUnit == null ? TimeUnit.MILLISECONDS : timeUnit;
    }

    private static Headers h(Headers headers) {
        Headers.a aVar = new Headers.a();
        for (String str : f134998w.names()) {
            if (!headers.names().contains(str)) {
                Iterator<String> it = f134998w.q(str).iterator();
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

    private void l(EnumC14473t enumC14473t) throws Exception {
        if (enumC14473t == EnumC14473t.OPEN) {
            this.f135013o.c();
        }
        if (this.f135019u != null) {
            this.f135019u.cancel();
            this.f134999a.a("call cancelled");
        }
    }

    private InterfaceC14462i.b p(Throwable th2) throws Exception {
        InterfaceC14462i.b bVarA = this.f135014p.a(th2);
        if (bVarA != InterfaceC14462i.b.SHUTDOWN) {
            this.f135013o.onError(th2);
        }
        return bVarA;
    }

    private void u(Response response) throws Exception {
        a aVar = new a();
        AtomicReference<EnumC14473t> atomicReference = this.f135017s;
        EnumC14473t enumC14473t = EnumC14473t.OPEN;
        EnumC14473t andSet = atomicReference.getAndSet(enumC14473t);
        if (andSet != EnumC14473t.CONNECTING) {
            this.f134999a.n("Unexpected readyState change: " + andSet + " -> " + enumC14473t);
        } else {
            this.f134999a.c("readyState change: {} -> {}", andSet, enumC14473t);
        }
        this.f134999a.i("Connected to EventSource stream.");
        this.f135013o.b();
        C14465l c14465l = new C14465l(response.getBody().byteStream(), this.f135001c.y(), this.f135013o, aVar, this.f135008j, this.f135015q, this.f135016r, this.f134999a);
        while (!Thread.currentThread().isInterrupted() && !c14465l.d()) {
            c14465l.f();
        }
    }

    private int w(int i10, long j10) throws InterruptedException {
        if (this.f135009k <= 0) {
            return i10;
        }
        if (j10 > 0 && System.currentTimeMillis() - j10 >= this.f135011m) {
            i10 = 1;
        }
        try {
            long jI = i(i10);
            this.f134999a.j("Waiting {} milliseconds before reconnecting...", Long.valueOf(jI));
            Thread.sleep(jI);
        } catch (InterruptedException unused) {
        }
        return i10 + 1;
    }

    public void J() {
        AtomicReference<EnumC14473t> atomicReference = this.f135017s;
        EnumC14473t enumC14473t = EnumC14473t.RAW;
        EnumC14473t enumC14473t2 = EnumC14473t.CONNECTING;
        if (!U.d.a(atomicReference, enumC14473t, enumC14473t2)) {
            this.f134999a.i("Start method called on this already-started EventSource object. Doing nothing");
            return;
        }
        this.f134999a.c("readyState change: {} -> {}", enumC14473t, enumC14473t2);
        this.f134999a.j("Starting EventSource client using URI: {}", this.f135001c);
        this.f135007i.execute(new Runnable() { // from class: hh.n
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f134997a.B();
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        AtomicReference<EnumC14473t> atomicReference = this.f135017s;
        EnumC14473t enumC14473t = EnumC14473t.SHUTDOWN;
        EnumC14473t andSet = atomicReference.getAndSet(enumC14473t);
        this.f134999a.c("readyState change: {} -> {}", andSet, enumC14473t);
        if (andSet == enumC14473t) {
            return;
        }
        l(andSet);
        this.f135006h.shutdown();
        this.f135007i.shutdown();
        if (this.f135018t.getConnectionPool() != null) {
            this.f135018t.getConnectionPool().c();
        }
        if (this.f135018t.getDispatcher() != null) {
            this.f135018t.getDispatcher().a();
            if (this.f135018t.getDispatcher().d() != null) {
                this.f135018t.getDispatcher().d().shutdownNow();
            }
        }
    }

    long i(int i10) {
        long jMin = Math.min(this.f135010l, this.f135009k * AbstractC14469p.a(i10));
        int i11 = jMin > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) jMin;
        return (i11 / 2) + (this.f135020v.nextInt(i11) / 2);
    }

    Request j() {
        Request.a aVarO = new Request.a().n(this.f135002d).v(this.f135001c).o(this.f135003e, this.f135004f);
        if (this.f135012n != null && !this.f135012n.isEmpty()) {
            aVarO.a("Last-Event-ID", this.f135012n);
        }
        Request requestB = aVarO.b();
        c cVar = this.f135005g;
        return cVar == null ? requestB : cVar.a(requestB);
    }

    C14468o(b bVar) {
        String str;
        C14724c c14724cM;
        Semaphore semaphore;
        InterfaceC14462i interfaceC14462i;
        if (bVar.f135022a != null) {
            str = bVar.f135022a;
        } else {
            str = "";
        }
        this.f135000b = str;
        if (bVar.f135039r != null) {
            c14724cM = bVar.f135039r;
        } else {
            c14724cM = C14724c.m();
        }
        this.f134999a = c14724cM;
        this.f135001c = bVar.f135027f;
        this.f135002d = h(bVar.f135031j);
        this.f135003e = bVar.f135034m;
        this.f135004f = bVar.f135036o;
        this.f135005g = bVar.f135035n;
        this.f135012n = bVar.f135026e;
        this.f135009k = bVar.f135023b;
        this.f135010l = bVar.f135024c;
        this.f135011m = bVar.f135025d;
        this.f135015q = bVar.f135041t;
        this.f135016r = bVar.f135042u;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(m("okhttp-eventsource-events", bVar.f135030i));
        this.f135006h = executorServiceNewSingleThreadExecutor;
        this.f135007i = Executors.newSingleThreadExecutor(m("okhttp-eventsource-stream", bVar.f135030i));
        if (bVar.f135040s > 0) {
            semaphore = new Semaphore(bVar.f135040s);
        } else {
            semaphore = null;
        }
        this.f135013o = new C14460g(executorServiceNewSingleThreadExecutor, bVar.f135028g, c14724cM, semaphore);
        if (bVar.f135029h != null) {
            interfaceC14462i = bVar.f135029h;
        } else {
            interfaceC14462i = InterfaceC14462i.f134971a;
        }
        this.f135014p = interfaceC14462i;
        this.f135008j = bVar.f135038q;
        this.f135017s = new AtomicReference<>(EnumC14473t.RAW);
        this.f135018t = bVar.f135037p.a();
    }

    public static /* synthetic */ Thread a(C14468o c14468o, ThreadFactory threadFactory, String str, AtomicLong atomicLong, Integer num, Runnable runnable) {
        c14468o.getClass();
        Thread threadNewThread = threadFactory.newThread(runnable);
        threadNewThread.setName(String.format(Locale.ROOT, "%s-[%s]-%d", str, c14468o.f135000b, Long.valueOf(atomicLong.getAndIncrement())));
        threadNewThread.setDaemon(true);
        if (num != null) {
            threadNewThread.setPriority(num.intValue());
        }
        return threadNewThread;
    }

    private ThreadFactory m(final String str, final Integer num) {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        final AtomicLong atomicLong = new AtomicLong(0L);
        return new ThreadFactory() { // from class: hh.m
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C14468o.a(this.f134992a, threadFactoryDefaultThreadFactory, str, atomicLong, num, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long z(long j10, TimeUnit timeUnit) {
        return K(timeUnit).toMillis(j10);
    }
}
