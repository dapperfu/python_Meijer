package oh;

import com.google.gson.Gson;
import com.launchdarkly.sdk.LDContext;
import ih.AbstractC14726e;
import ih.C14724c;
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
import oh.C16067i;
import oh.C16072n;
import oh.InterfaceC16071m;

/* renamed from: oh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16059a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    private static final Gson f153608n = new Gson();

    /* renamed from: a, reason: collision with root package name */
    private final C16073o f153609a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<e> f153610b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f153611c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f153612d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f153613e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f153614f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f153615g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f153616h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f153617i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f153618j;

    /* renamed from: k, reason: collision with root package name */
    private ScheduledFuture<?> f153619k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f153620l;

    /* renamed from: m, reason: collision with root package name */
    private final C14724c f153621m;

    /* renamed from: oh.a$a, reason: collision with other inner class name */
    class RunnableC2389a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f153622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16067i f153623b;

        RunnableC2389a(h hVar, C16067i c16067i) {
            this.f153622a = hVar;
            this.f153623b = c16067i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C16059a.this.g(this.f153622a, this.f153623b);
        }
    }

    /* renamed from: oh.a$c */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        private final int f153628c;

        /* renamed from: d, reason: collision with root package name */
        private final C14724c f153629d;

        /* renamed from: a, reason: collision with root package name */
        final List<C16067i> f153626a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final C16072n f153627b = new C16072n();

        /* renamed from: e, reason: collision with root package name */
        private boolean f153630e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f153631f = 0;

        void a(C16067i c16067i) {
            if (this.f153626a.size() < this.f153628c) {
                this.f153630e = false;
                this.f153626a.add(c16067i);
            } else {
                if (!this.f153630e) {
                    this.f153630e = true;
                    this.f153629d.n("Exceeded event queue capacity. Increase capacity to avoid dropping events.");
                }
                this.f153631f++;
            }
        }

        void b(C16067i.b bVar) {
            this.f153627b.e(bVar.b(), bVar.f(), bVar.k(), bVar.j(), bVar.i(), bVar.e(), bVar.a());
        }

        void c() {
            this.f153626a.clear();
            this.f153627b.a();
        }

        long d() {
            long j10 = this.f153631f;
            this.f153631f = 0L;
            return j10;
        }

        g e() {
            List<C16067i> list = this.f153626a;
            return new g((C16067i[]) list.toArray(new C16067i[list.size()]), this.f153627b.b());
        }

        boolean f() {
            return this.f153626a.isEmpty() && this.f153627b.c();
        }

        c(int i10, C14724c c14724c) {
            this.f153628c = i10;
            this.f153629d = c14724c;
        }
    }

    /* renamed from: oh.a$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final C16073o f153632a;

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<e> f153633b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f153634c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f153635d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f153636e;

        /* renamed from: f, reason: collision with root package name */
        private final List<i> f153637f;

        /* renamed from: g, reason: collision with root package name */
        private final AtomicInteger f153638g;

        /* renamed from: h, reason: collision with root package name */
        private final AtomicLong f153639h;

        /* renamed from: i, reason: collision with root package name */
        private final AtomicBoolean f153640i;

        /* renamed from: j, reason: collision with root package name */
        private final AtomicBoolean f153641j;

        /* renamed from: k, reason: collision with root package name */
        final C16066h f153642k;

        /* renamed from: l, reason: collision with root package name */
        private final ExecutorService f153643l;

        /* renamed from: m, reason: collision with root package name */
        private final C14724c f153644m;

        /* renamed from: n, reason: collision with root package name */
        private long f153645n;

        /* renamed from: oh.a$d$a, reason: collision with other inner class name */
        class ThreadFactoryC2390a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f153646a;

            ThreadFactoryC2390a(int i10) {
                this.f153646a = i10;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                thread.setName(String.format("LaunchDarkly-event-delivery-%d", Long.valueOf(thread.getId())));
                thread.setPriority(this.f153646a);
                return thread;
            }
        }

        /* renamed from: oh.a$d$b */
        class b extends Thread {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BlockingQueue f153648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f153649b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BlockingQueue f153650c;

            b(BlockingQueue blockingQueue, c cVar, BlockingQueue blockingQueue2) {
                this.f153648a = blockingQueue;
                this.f153649b = cVar;
                this.f153650c = blockingQueue2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                d.this.l(this.f153648a, this.f153649b, this.f153650c);
            }
        }

        /* renamed from: oh.a$d$c */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16064f f153652a;

            c(C16064f c16064f) {
                this.f153652a = c16064f;
            }

            @Override // java.lang.Runnable
            public void run() throws IOException {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, Charset.forName("UTF-8")), 2000);
                    C16059a.f153608n.B(this.f153652a.f153719b, bufferedWriter);
                    bufferedWriter.flush();
                    d.this.i(d.this.f153632a.f153786e.Q(byteArrayOutputStream.toByteArray(), d.this.f153632a.f153788g));
                    if (this.f153652a.f153718a) {
                        d.this.f153641j.set(true);
                    }
                } catch (Exception e10) {
                    d.this.f153644m.f("Unexpected error in event processor: {}", e10.toString());
                    d.this.f153644m.b(e10.toString(), e10);
                }
            }
        }

        /* synthetic */ d(C16073o c16073o, ExecutorService executorService, int i10, BlockingQueue blockingQueue, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, C14724c c14724c, RunnableC2389a runnableC2389a) {
            this(c16073o, executorService, i10, blockingQueue, atomicBoolean, atomicBoolean2, atomicBoolean3, c14724c);
        }

        private d(C16073o c16073o, ExecutorService executorService, int i10, BlockingQueue<e> blockingQueue, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, C14724c c14724c) {
            this.f153639h = new AtomicLong(0L);
            this.f153640i = new AtomicBoolean(false);
            this.f153641j = new AtomicBoolean(false);
            this.f153645n = 0L;
            this.f153632a = c16073o;
            this.f153633b = blockingQueue;
            this.f153634c = atomicBoolean;
            this.f153635d = atomicBoolean2;
            this.f153636e = atomicBoolean3;
            this.f153643l = executorService;
            this.f153642k = c16073o.f153785d;
            this.f153638g = new AtomicInteger(0);
            this.f153644m = c14724c;
            ThreadFactoryC2390a threadFactoryC2390a = new ThreadFactoryC2390a(i10);
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            Thread threadNewThread = threadFactoryC2390a.newThread(new b(blockingQueue, new c(c16073o.f153783b, c14724c), arrayBlockingQueue));
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: oh.b
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    this.f153675a.j(thread, th2);
                }
            });
            threadNewThread.start();
            this.f153637f = new ArrayList();
            f fVar = new f() { // from class: oh.c
                @Override // oh.C16059a.f
                public final void a(InterfaceC16071m.a aVar) {
                    this.f153676a.i(aVar);
                }
            };
            for (int i11 = 0; i11 < c16073o.f153787f; i11++) {
                this.f153637f.add(new i(c16073o, fVar, arrayBlockingQueue, this.f153638g, threadFactoryC2390a, c14724c));
            }
        }

        private Runnable g(C16064f c16064f) {
            return new c(c16064f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Thread thread, Throwable th2) {
            this.f153644m.g("Event processor thread was terminated by an unrecoverable error. No more analytics events will be sent. {} {}", AbstractC14726e.b(th2), AbstractC14726e.c(th2));
            this.f153636e.set(true);
            ArrayList arrayList = new ArrayList();
            this.f153633b.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c();
            }
        }

        private void k(C16067i c16067i, c cVar) {
            boolean zN;
            if (this.f153640i.get()) {
                return;
            }
            if (c16067i instanceof C16067i.e) {
                if (C16074p.a(((C16067i.e) c16067i).c())) {
                    cVar.a(c16067i);
                    return;
                }
                return;
            }
            LDContext lDContextA = c16067i.a();
            if (lDContextA == null) {
                return;
            }
            boolean z10 = c16067i instanceof C16067i.b;
            C16067i.b bVarO = null;
            if (z10) {
                C16067i.b bVar = (C16067i.b) c16067i;
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
                boolean z11 = c16067i instanceof C16067i.a;
            }
            if (zN && C16074p.a(c16067i.c())) {
                cVar.a(c16067i);
            }
            if (bVarO == null || !C16074p.a(c16067i.c())) {
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
                        switch (b.f153625a[eVar.f153654a.ordinal()]) {
                            case 1:
                                k(eVar.f153655b, cVar);
                                eVar.c();
                            case 2:
                                if (!this.f153635d.get()) {
                                    o(cVar, blockingQueue2);
                                }
                                eVar.c();
                            case 3:
                                eVar.c();
                            case 4:
                                if (!this.f153635d.get() && !this.f153634c.get() && !this.f153641j.get()) {
                                    this.f153643l.submit(g(this.f153642k.b()));
                                }
                                eVar.c();
                                break;
                            case 5:
                                if (!this.f153635d.get() && !this.f153634c.get()) {
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
                    this.f153644m.f("Unexpected error in event processor: {}", e10.toString());
                    this.f153644m.b(e10.toString(), e10);
                }
            }
        }

        private void m(c cVar) {
            if (this.f153640i.get()) {
                return;
            }
            C16064f c16064fA = this.f153642k.a(cVar.d(), this.f153645n);
            this.f153645n = 0L;
            this.f153643l.submit(g(c16064fA));
        }

        private void o(c cVar, BlockingQueue<g> blockingQueue) {
            if (this.f153640i.get() || cVar.f()) {
                return;
            }
            g gVarE = cVar.e();
            if (this.f153642k != null) {
                this.f153642k.f(gVarE.f153657a.length + (!gVarE.f153658b.b() ? 1 : 0));
            }
            this.f153638g.incrementAndGet();
            if (blockingQueue.offer(gVarE)) {
                cVar.c();
                return;
            }
            this.f153644m.a("Skipped flushing because all workers are busy");
            cVar.f153627b.d(gVarE.f153658b);
            synchronized (this.f153638g) {
                this.f153638g.decrementAndGet();
                this.f153638g.notify();
            }
        }

        private void p() {
            while (true) {
                try {
                    synchronized (this.f153638g) {
                        try {
                            if (this.f153638g.get() == 0) {
                                return;
                            } else {
                                this.f153638g.wait();
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
            this.f153640i.set(true);
            Iterator<i> it = this.f153637f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            try {
                this.f153632a.f153786e.close();
            } catch (IOException e10) {
                this.f153644m.f("Unexpected error when closing event sender: {}", AbstractC14726e.b(e10));
                this.f153644m.a(AbstractC14726e.c(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(InterfaceC16071m.a aVar) {
            if (aVar.a() != null) {
                this.f153639h.set(aVar.a().getTime());
            }
            if (aVar.b()) {
                this.f153640i.set(true);
            }
        }

        private boolean n(C16067i.b bVar) {
            Long lD = bVar.d();
            if (lD == null) {
                return false;
            }
            long jLongValue = lD.longValue();
            if (jLongValue <= 0 || jLongValue <= this.f153639h.get() || jLongValue <= System.currentTimeMillis()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: oh.a$e */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final h f153654a;

        /* renamed from: b, reason: collision with root package name */
        private final C16067i f153655b;

        /* renamed from: c, reason: collision with root package name */
        private final Semaphore f153656c;

        /* synthetic */ e(h hVar, C16067i c16067i, boolean z10, RunnableC2389a runnableC2389a) {
            this(hVar, c16067i, z10);
        }

        private e(h hVar, C16067i c16067i, boolean z10) {
            this.f153654a = hVar;
            this.f153655b = c16067i;
            this.f153656c = z10 ? new Semaphore(0) : null;
        }

        void c() {
            Semaphore semaphore = this.f153656c;
            if (semaphore != null) {
                semaphore.release();
            }
        }

        void d() throws InterruptedException {
            if (this.f153656c == null) {
                return;
            }
            while (true) {
                try {
                    this.f153656c.acquire();
                    return;
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oh.a$f */
    interface f {
        void a(InterfaceC16071m.a aVar);
    }

    /* renamed from: oh.a$h */
    private enum h {
        EVENT,
        FLUSH,
        FLUSH_USERS,
        DIAGNOSTIC_INIT,
        DIAGNOSTIC_STATS,
        SYNC,
        SHUTDOWN
    }

    /* renamed from: oh.a$i */
    private static final class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C16073o f153667a;

        /* renamed from: b, reason: collision with root package name */
        private final f f153668b;

        /* renamed from: c, reason: collision with root package name */
        private final BlockingQueue<g> f153669c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicInteger f153670d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f153671e = new AtomicBoolean(false);

        /* renamed from: f, reason: collision with root package name */
        private final C16070l f153672f;

        /* renamed from: g, reason: collision with root package name */
        private final Thread f153673g;

        /* renamed from: h, reason: collision with root package name */
        private final C14724c f153674h;

        void a() {
            this.f153671e.set(true);
            this.f153673g.interrupt();
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            while (!this.f153671e.get()) {
                try {
                    g gVarTake = this.f153669c.take();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, Charset.forName("UTF-8")), 2000);
                        int iL = this.f153672f.l(gVarTake.f153657a, gVarTake.f153658b, bufferedWriter);
                        bufferedWriter.flush();
                        this.f153668b.a(this.f153667a.f153786e.R2(byteArrayOutputStream.toByteArray(), iL, this.f153667a.f153788g));
                    } catch (Exception e10) {
                        this.f153674h.f("Unexpected error in event processor: {}", AbstractC14726e.b(e10));
                        this.f153674h.a(AbstractC14726e.c(e10));
                    }
                    synchronized (this.f153670d) {
                        this.f153670d.decrementAndGet();
                        this.f153670d.notifyAll();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        i(C16073o c16073o, f fVar, BlockingQueue<g> blockingQueue, AtomicInteger atomicInteger, ThreadFactory threadFactory, C14724c c14724c) {
            this.f153667a = c16073o;
            this.f153672f = new C16070l(c16073o);
            this.f153668b = fVar;
            this.f153669c = blockingQueue;
            this.f153670d = atomicInteger;
            this.f153674h = c14724c;
            Thread threadNewThread = threadFactory.newThread(this);
            this.f153673g = threadNewThread;
            threadNewThread.setDaemon(true);
            threadNewThread.start();
        }
    }

    ScheduledFuture<?> c(boolean z10, ScheduledFuture<?> scheduledFuture, long j10, h hVar) {
        if (z10) {
            return scheduledFuture != null ? scheduledFuture : this.f153611c.scheduleAtFixedRate(h(hVar, null), j10, j10, TimeUnit.MILLISECONDS);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        return null;
    }

    /* renamed from: oh.a$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f153625a;

        static {
            int[] iArr = new int[h.values().length];
            f153625a = iArr;
            try {
                iArr[h.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f153625a[h.FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f153625a[h.FLUSH_USERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f153625a[h.DIAGNOSTIC_INIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f153625a[h.DIAGNOSTIC_STATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f153625a[h.SYNC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f153625a[h.SHUTDOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: oh.a$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        final C16067i[] f153657a;

        /* renamed from: b, reason: collision with root package name */
        final C16072n.b f153658b;

        g(C16067i[] c16067iArr, C16072n.b bVar) {
            this.f153657a = c16067iArr;
            this.f153658b = bVar;
        }
    }

    private void d(h hVar, C16067i c16067i) throws InterruptedException {
        e eVar = new e(hVar, c16067i, true, null);
        if (i(eVar)) {
            eVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(h hVar, C16067i c16067i) {
        i(new e(hVar, c16067i, false, null));
    }

    private Runnable h(h hVar, C16067i c16067i) {
        return new RunnableC2389a(hVar, c16067i);
    }

    private boolean i(e eVar) {
        if (this.f153610b.offer(eVar)) {
            return true;
        }
        boolean z10 = this.f153620l;
        this.f153620l = true;
        if (z10) {
            return false;
        }
        this.f153621m.n("Events are being produced faster than they can be processed; some events will be dropped");
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (!this.f153615g.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.f153616h) {
            try {
                try {
                    this.f153617i = c(false, this.f153617i, 0L, null);
                    this.f153618j = c(false, this.f153618j, 0L, null);
                    this.f153619k = c(false, this.f153619k, 0L, null);
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

    public void j(C16067i c16067i) {
        if (this.f153615g.get()) {
            return;
        }
        g(h.EVENT, c16067i);
    }

    public void k1(boolean z10) {
        synchronized (this.f153616h) {
            try {
                if (this.f153613e.getAndSet(z10) == z10) {
                    return;
                }
                l(z10, this.f153612d.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l(boolean z10, boolean z11) {
        this.f153617i = c(!z11, this.f153617i, this.f153609a.f153789h, h.FLUSH);
        this.f153619k = c((z11 || z10 || this.f153609a.f153785d == null) ? false : true, this.f153619k, this.f153609a.f153784c, h.DIAGNOSTIC_STATS);
        if (z10 || z11 || this.f153614f.get() || this.f153609a.f153785d == null) {
            return;
        }
        g(h.DIAGNOSTIC_INIT, null);
    }

    public void w3(boolean z10) {
        synchronized (this.f153616h) {
            try {
                if (this.f153612d.getAndSet(z10) == z10) {
                    return;
                }
                l(this.f153613e.get(), z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C16059a(C16073o c16073o, ScheduledExecutorService scheduledExecutorService, int i10, C14724c c14724c) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f153615g = atomicBoolean;
        this.f153616h = new Object();
        this.f153620l = false;
        this.f153609a = c16073o;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(c16073o.f153783b);
        this.f153610b = arrayBlockingQueue;
        this.f153611c = scheduledExecutorService;
        this.f153621m = c14724c;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(c16073o.f153790i);
        this.f153613e = atomicBoolean2;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(c16073o.f153791j);
        this.f153612d = atomicBoolean3;
        new d(c16073o, scheduledExecutorService, i10, arrayBlockingQueue, atomicBoolean2, atomicBoolean3, atomicBoolean, c14724c, null);
        l(c16073o.f153790i, c16073o.f153791j);
    }
}
