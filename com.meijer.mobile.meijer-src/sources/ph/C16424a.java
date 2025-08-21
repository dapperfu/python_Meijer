package ph;

import com.google.gson.Gson;
import com.launchdarkly.sdk.LDContext;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jh.AbstractC15036e;
import jh.C15034c;
import ph.C16432i;
import ph.C16437n;
import ph.InterfaceC16436m;

/* renamed from: ph.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16424a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    private static final Gson f156368n = new Gson();

    /* renamed from: a, reason: collision with root package name */
    private final C16438o f156369a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<e> f156370b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f156371c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f156372d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f156373e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f156374f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f156375g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f156376h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f156377i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f156378j;

    /* renamed from: k, reason: collision with root package name */
    private ScheduledFuture<?> f156379k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f156380l;

    /* renamed from: m, reason: collision with root package name */
    private final C15034c f156381m;

    /* renamed from: ph.a$a, reason: collision with other inner class name */
    class RunnableC2423a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f156382a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16432i f156383b;

        RunnableC2423a(h hVar, C16432i c16432i) {
            this.f156382a = hVar;
            this.f156383b = c16432i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C16424a.this.g(this.f156382a, this.f156383b);
        }
    }

    /* renamed from: ph.a$c */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        private final int f156388c;

        /* renamed from: d, reason: collision with root package name */
        private final C15034c f156389d;

        /* renamed from: a, reason: collision with root package name */
        final List<C16432i> f156386a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final C16437n f156387b = new C16437n();

        /* renamed from: e, reason: collision with root package name */
        private boolean f156390e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f156391f = 0;

        void a(C16432i c16432i) {
            if (this.f156386a.size() < this.f156388c) {
                this.f156390e = false;
                this.f156386a.add(c16432i);
            } else {
                if (!this.f156390e) {
                    this.f156390e = true;
                    this.f156389d.n("Exceeded event queue capacity. Increase capacity to avoid dropping events.");
                }
                this.f156391f++;
            }
        }

        void b(C16432i.b bVar) {
            this.f156387b.e(bVar.b(), bVar.f(), bVar.k(), bVar.j(), bVar.i(), bVar.e(), bVar.a());
        }

        void c() {
            this.f156386a.clear();
            this.f156387b.a();
        }

        long d() {
            long j10 = this.f156391f;
            this.f156391f = 0L;
            return j10;
        }

        g e() {
            List<C16432i> list = this.f156386a;
            return new g((C16432i[]) list.toArray(new C16432i[list.size()]), this.f156387b.b());
        }

        boolean f() {
            return this.f156386a.isEmpty() && this.f156387b.c();
        }

        c(int i10, C15034c c15034c) {
            this.f156388c = i10;
            this.f156389d = c15034c;
        }
    }

    /* renamed from: ph.a$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final C16438o f156392a;

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<e> f156393b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f156394c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f156395d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f156396e;

        /* renamed from: f, reason: collision with root package name */
        private final List<i> f156397f;

        /* renamed from: g, reason: collision with root package name */
        private final AtomicInteger f156398g;

        /* renamed from: h, reason: collision with root package name */
        private final AtomicLong f156399h;

        /* renamed from: i, reason: collision with root package name */
        private final AtomicBoolean f156400i;

        /* renamed from: j, reason: collision with root package name */
        private final AtomicBoolean f156401j;

        /* renamed from: k, reason: collision with root package name */
        final C16431h f156402k;

        /* renamed from: l, reason: collision with root package name */
        private final ExecutorService f156403l;

        /* renamed from: m, reason: collision with root package name */
        private final C15034c f156404m;

        /* renamed from: n, reason: collision with root package name */
        private long f156405n;

        /* renamed from: ph.a$d$a, reason: collision with other inner class name */
        class ThreadFactoryC2424a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f156406a;

            ThreadFactoryC2424a(int i10) {
                this.f156406a = i10;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                thread.setName(String.format("LaunchDarkly-event-delivery-%d", Long.valueOf(thread.getId())));
                thread.setPriority(this.f156406a);
                return thread;
            }
        }

        /* renamed from: ph.a$d$b */
        class b extends Thread {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BlockingQueue f156408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f156409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BlockingQueue f156410c;

            b(BlockingQueue blockingQueue, c cVar, BlockingQueue blockingQueue2) {
                this.f156408a = blockingQueue;
                this.f156409b = cVar;
                this.f156410c = blockingQueue2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                d.this.l(this.f156408a, this.f156409b, this.f156410c);
            }
        }

        /* renamed from: ph.a$d$c */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16429f f156412a;

            c(C16429f c16429f) {
                this.f156412a = c16429f;
            }

            @Override // java.lang.Runnable
            public void run() throws IOException {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, Charset.forName("UTF-8")), 2000);
                    C16424a.f156368n.B(this.f156412a.f156479b, bufferedWriter);
                    bufferedWriter.flush();
                    d.this.i(d.this.f156392a.f156546e.Q(byteArrayOutputStream.toByteArray(), d.this.f156392a.f156548g));
                    if (this.f156412a.f156478a) {
                        d.this.f156401j.set(true);
                    }
                } catch (Exception e10) {
                    d.this.f156404m.f("Unexpected error in event processor: {}", e10.toString());
                    d.this.f156404m.b(e10.toString(), e10);
                }
            }
        }

        /* synthetic */ d(C16438o c16438o, ExecutorService executorService, int i10, BlockingQueue blockingQueue, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, C15034c c15034c, RunnableC2423a runnableC2423a) {
            this(c16438o, executorService, i10, blockingQueue, atomicBoolean, atomicBoolean2, atomicBoolean3, c15034c);
        }

        private d(C16438o c16438o, ExecutorService executorService, int i10, BlockingQueue<e> blockingQueue, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, C15034c c15034c) {
            this.f156399h = new AtomicLong(0L);
            this.f156400i = new AtomicBoolean(false);
            this.f156401j = new AtomicBoolean(false);
            this.f156405n = 0L;
            this.f156392a = c16438o;
            this.f156393b = blockingQueue;
            this.f156394c = atomicBoolean;
            this.f156395d = atomicBoolean2;
            this.f156396e = atomicBoolean3;
            this.f156403l = executorService;
            this.f156402k = c16438o.f156545d;
            this.f156398g = new AtomicInteger(0);
            this.f156404m = c15034c;
            ThreadFactoryC2424a threadFactoryC2424a = new ThreadFactoryC2424a(i10);
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            Thread threadNewThread = threadFactoryC2424a.newThread(new b(blockingQueue, new c(c16438o.f156543b, c15034c), arrayBlockingQueue));
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ph.b
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    this.f156435a.j(thread, th2);
                }
            });
            threadNewThread.start();
            this.f156397f = new ArrayList();
            f fVar = new f() { // from class: ph.c
                @Override // ph.C16424a.f
                public final void a(InterfaceC16436m.a aVar) {
                    this.f156436a.i(aVar);
                }
            };
            for (int i11 = 0; i11 < c16438o.f156547f; i11++) {
                this.f156397f.add(new i(c16438o, fVar, arrayBlockingQueue, this.f156398g, threadFactoryC2424a, c15034c));
            }
        }

        private Runnable g(C16429f c16429f) {
            return new c(c16429f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Thread thread, Throwable th2) {
            this.f156404m.g("Event processor thread was terminated by an unrecoverable error. No more analytics events will be sent. {} {}", AbstractC15036e.b(th2), AbstractC15036e.c(th2));
            this.f156396e.set(true);
            ArrayList arrayList = new ArrayList();
            this.f156393b.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c();
            }
        }

        private void k(C16432i c16432i, c cVar) {
            boolean zN;
            if (this.f156400i.get()) {
                return;
            }
            if (c16432i instanceof C16432i.e) {
                if (C16439p.a(((C16432i.e) c16432i).c())) {
                    cVar.a(c16432i);
                    return;
                }
                return;
            }
            LDContext lDContextA = c16432i.a();
            if (lDContextA == null) {
                return;
            }
            boolean z10 = c16432i instanceof C16432i.b;
            C16432i.b bVarO = null;
            if (z10) {
                C16432i.b bVar = (C16432i.b) c16432i;
                if (!bVar.m()) {
                    cVar.b(bVar);
                }
                zN = bVar.n();
                if (n(bVar)) {
                    bVarO = bVar.o();
                }
            } else {
                zN = true;
            }
            if (lDContextA.j() != null && !z10) {
                boolean z11 = c16432i instanceof C16432i.a;
            }
            if (zN && C16439p.a(c16432i.c())) {
                cVar.a(c16432i);
            }
            if (bVarO == null || !C16439p.a(c16432i.c())) {
                return;
            }
            cVar.a(bVarO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0032. Please report as an issue. */
        public void l(BlockingQueue<e> blockingQueue, c cVar, BlockingQueue<g> blockingQueue2) {
            ArrayList<e> arrayList = new ArrayList(50);
            while (true) {
                try {
                    arrayList.clear();
                    arrayList.add(blockingQueue.take());
                    blockingQueue.drainTo(arrayList, 49);
                    for (e eVar : arrayList) {
                        switch (b.f156385a[eVar.f156414a.ordinal()]) {
                            case 1:
                                k(eVar.f156415b, cVar);
                                eVar.c();
                            case 2:
                                if (!this.f156395d.get()) {
                                    o(cVar, blockingQueue2);
                                }
                                eVar.c();
                            case 3:
                                eVar.c();
                            case 4:
                                if (!this.f156395d.get() && !this.f156394c.get() && !this.f156401j.get()) {
                                    this.f156403l.submit(g(this.f156402k.b()));
                                }
                                eVar.c();
                                break;
                            case 5:
                                if (!this.f156395d.get() && !this.f156394c.get()) {
                                    m(cVar);
                                }
                                eVar.c();
                                break;
                            case 6:
                                p();
                                eVar.c();
                            case 7:
                                break;
                            default:
                                eVar.c();
                        }
                        h();
                        eVar.c();
                        return;
                    }
                } catch (InterruptedException unused) {
                } catch (Exception e10) {
                    this.f156404m.f("Unexpected error in event processor: {}", e10.toString());
                    this.f156404m.b(e10.toString(), e10);
                }
            }
        }

        private void m(c cVar) {
            if (this.f156400i.get()) {
                return;
            }
            C16429f c16429fA = this.f156402k.a(cVar.d(), this.f156405n);
            this.f156405n = 0L;
            this.f156403l.submit(g(c16429fA));
        }

        private void o(c cVar, BlockingQueue<g> blockingQueue) {
            if (this.f156400i.get() || cVar.f()) {
                return;
            }
            g gVarE = cVar.e();
            if (this.f156402k != null) {
                this.f156402k.f(gVarE.f156417a.length + (!gVarE.f156418b.b() ? 1 : 0));
            }
            this.f156398g.incrementAndGet();
            if (blockingQueue.offer(gVarE)) {
                cVar.c();
                return;
            }
            this.f156404m.a("Skipped flushing because all workers are busy");
            cVar.f156387b.d(gVarE.f156418b);
            synchronized (this.f156398g) {
                this.f156398g.decrementAndGet();
                this.f156398g.notify();
            }
        }

        private void p() {
            while (true) {
                try {
                    synchronized (this.f156398g) {
                        try {
                            if (this.f156398g.get() == 0) {
                                return;
                            } else {
                                this.f156398g.wait();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        private void h() throws IOException {
            p();
            this.f156400i.set(true);
            Iterator<i> it = this.f156397f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            try {
                this.f156392a.f156546e.close();
            } catch (IOException e10) {
                this.f156404m.f("Unexpected error when closing event sender: {}", AbstractC15036e.b(e10));
                this.f156404m.a(AbstractC15036e.c(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(InterfaceC16436m.a aVar) {
            if (aVar.a() != null) {
                this.f156399h.set(aVar.a().getTime());
            }
            if (aVar.b()) {
                this.f156400i.set(true);
            }
        }

        private boolean n(C16432i.b bVar) {
            Long lD = bVar.d();
            if (lD == null) {
                return false;
            }
            long jLongValue = lD.longValue();
            if (jLongValue <= 0 || jLongValue <= this.f156399h.get() || jLongValue <= System.currentTimeMillis()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: ph.a$e */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final h f156414a;

        /* renamed from: b, reason: collision with root package name */
        private final C16432i f156415b;

        /* renamed from: c, reason: collision with root package name */
        private final Semaphore f156416c;

        /* synthetic */ e(h hVar, C16432i c16432i, boolean z10, RunnableC2423a runnableC2423a) {
            this(hVar, c16432i, z10);
        }

        private e(h hVar, C16432i c16432i, boolean z10) {
            this.f156414a = hVar;
            this.f156415b = c16432i;
            this.f156416c = z10 ? new Semaphore(0) : null;
        }

        void c() {
            Semaphore semaphore = this.f156416c;
            if (semaphore != null) {
                semaphore.release();
            }
        }

        void d() throws InterruptedException {
            if (this.f156416c == null) {
                return;
            }
            while (true) {
                try {
                    this.f156416c.acquire();
                    return;
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.a$f */
    interface f {
        void a(InterfaceC16436m.a aVar);
    }

    /* renamed from: ph.a$h */
    private enum h {
        EVENT,
        FLUSH,
        FLUSH_USERS,
        DIAGNOSTIC_INIT,
        DIAGNOSTIC_STATS,
        SYNC,
        SHUTDOWN
    }

    /* renamed from: ph.a$i */
    private static final class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C16438o f156427a;

        /* renamed from: b, reason: collision with root package name */
        private final f f156428b;

        /* renamed from: c, reason: collision with root package name */
        private final BlockingQueue<g> f156429c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicInteger f156430d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f156431e = new AtomicBoolean(false);

        /* renamed from: f, reason: collision with root package name */
        private final C16435l f156432f;

        /* renamed from: g, reason: collision with root package name */
        private final Thread f156433g;

        /* renamed from: h, reason: collision with root package name */
        private final C15034c f156434h;

        void a() {
            this.f156431e.set(true);
            this.f156433g.interrupt();
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            while (!this.f156431e.get()) {
                try {
                    g gVarTake = this.f156429c.take();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, Charset.forName("UTF-8")), 2000);
                        int iL = this.f156432f.l(gVarTake.f156417a, gVarTake.f156418b, bufferedWriter);
                        bufferedWriter.flush();
                        this.f156428b.a(this.f156427a.f156546e.R2(byteArrayOutputStream.toByteArray(), iL, this.f156427a.f156548g));
                    } catch (Exception e10) {
                        this.f156434h.f("Unexpected error in event processor: {}", AbstractC15036e.b(e10));
                        this.f156434h.a(AbstractC15036e.c(e10));
                    }
                    synchronized (this.f156430d) {
                        this.f156430d.decrementAndGet();
                        this.f156430d.notifyAll();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        i(C16438o c16438o, f fVar, BlockingQueue<g> blockingQueue, AtomicInteger atomicInteger, ThreadFactory threadFactory, C15034c c15034c) {
            this.f156427a = c16438o;
            this.f156432f = new C16435l(c16438o);
            this.f156428b = fVar;
            this.f156429c = blockingQueue;
            this.f156430d = atomicInteger;
            this.f156434h = c15034c;
            Thread threadNewThread = threadFactory.newThread(this);
            this.f156433g = threadNewThread;
            threadNewThread.setDaemon(true);
            threadNewThread.start();
        }
    }

    ScheduledFuture<?> c(boolean z10, ScheduledFuture<?> scheduledFuture, long j10, h hVar) {
        if (z10) {
            return scheduledFuture != null ? scheduledFuture : this.f156371c.scheduleAtFixedRate(h(hVar, null), j10, j10, TimeUnit.MILLISECONDS);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        return null;
    }

    /* renamed from: ph.a$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156385a;

        static {
            int[] iArr = new int[h.values().length];
            f156385a = iArr;
            try {
                iArr[h.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156385a[h.FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f156385a[h.FLUSH_USERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f156385a[h.DIAGNOSTIC_INIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f156385a[h.DIAGNOSTIC_STATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f156385a[h.SYNC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f156385a[h.SHUTDOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: ph.a$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        final C16432i[] f156417a;

        /* renamed from: b, reason: collision with root package name */
        final C16437n.b f156418b;

        g(C16432i[] c16432iArr, C16437n.b bVar) {
            this.f156417a = c16432iArr;
            this.f156418b = bVar;
        }
    }

    private void d(h hVar, C16432i c16432i) throws InterruptedException {
        e eVar = new e(hVar, c16432i, true, null);
        if (i(eVar)) {
            eVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(h hVar, C16432i c16432i) {
        i(new e(hVar, c16432i, false, null));
    }

    private Runnable h(h hVar, C16432i c16432i) {
        return new RunnableC2423a(hVar, c16432i);
    }

    private boolean i(e eVar) {
        if (this.f156370b.offer(eVar)) {
            return true;
        }
        boolean z10 = this.f156380l;
        this.f156380l = true;
        if (z10) {
            return false;
        }
        this.f156381m.n("Events are being produced faster than they can be processed; some events will be dropped");
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (!this.f156375g.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.f156376h) {
            try {
                try {
                    this.f156377i = c(false, this.f156377i, 0L, null);
                    this.f156378j = c(false, this.f156378j, 0L, null);
                    this.f156379k = c(false, this.f156379k, 0L, null);
                    g(h.FLUSH, null);
                    d(h.SHUTDOWN, null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public void j(C16432i c16432i) {
        if (this.f156375g.get()) {
            return;
        }
        g(h.EVENT, c16432i);
    }

    void l(boolean z10, boolean z11) {
        this.f156377i = c(!z11, this.f156377i, this.f156369a.f156549h, h.FLUSH);
        this.f156379k = c((z11 || z10 || this.f156369a.f156545d == null) ? false : true, this.f156379k, this.f156369a.f156544c, h.DIAGNOSTIC_STATS);
        if (z10 || z11 || this.f156374f.get() || this.f156369a.f156545d == null) {
            return;
        }
        g(h.DIAGNOSTIC_INIT, null);
    }

    public void l1(boolean z10) {
        synchronized (this.f156376h) {
            try {
                if (this.f156373e.getAndSet(z10) == z10) {
                    return;
                }
                l(z10, this.f156372d.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w3(boolean z10) {
        synchronized (this.f156376h) {
            try {
                if (this.f156372d.getAndSet(z10) == z10) {
                    return;
                }
                l(this.f156373e.get(), z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C16424a(C16438o c16438o, ScheduledExecutorService scheduledExecutorService, int i10, C15034c c15034c) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f156375g = atomicBoolean;
        this.f156376h = new Object();
        this.f156380l = false;
        this.f156369a = c16438o;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(c16438o.f156543b);
        this.f156370b = arrayBlockingQueue;
        this.f156371c = scheduledExecutorService;
        this.f156381m = c15034c;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(c16438o.f156550i);
        this.f156373e = atomicBoolean2;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(c16438o.f156551j);
        this.f156372d = atomicBoolean3;
        new d(c16438o, scheduledExecutorService, i10, arrayBlockingQueue, atomicBoolean2, atomicBoolean3, atomicBoolean, c15034c, null);
        l(c16438o.f156550i, c16438o.f156551j);
    }
}
