package cf;

import com.google.android.gms.common.internal.r;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f61757f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f61758a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f61759b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f61760c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f61761d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f61762e = new b(this, null);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f61763a;

        a(Runnable runnable) {
            this.f61763a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61763a.run();
        }

        public String toString() {
            return this.f61763a.toString();
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f61765a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f61765a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            cf.k.f61757f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f61765a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f61765a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                cf.k r2 = cf.k.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = cf.k.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                cf.k r0 = cf.k.this     // Catch: java.lang.Throwable -> L20
                cf.k$c r0 = cf.k.b(r0)     // Catch: java.lang.Throwable -> L20
                cf.k$c r3 = cf.k.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                cf.k r0 = cf.k.this     // Catch: java.lang.Throwable -> L20
                cf.k.d(r0)     // Catch: java.lang.Throwable -> L20
                cf.k r0 = cf.k.this     // Catch: java.lang.Throwable -> L20
                cf.k.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                cf.k r3 = cf.k.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = cf.k.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f61765a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                cf.k r0 = cf.k.this     // Catch: java.lang.Throwable -> L20
                cf.k$c r3 = cf.k.c.IDLE     // Catch: java.lang.Throwable -> L20
                cf.k.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f61765a     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f61765a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = cf.k.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f61765a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f61765a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cf.k.b.a():void");
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }

        public String toString() {
            Runnable runnable = this.f61765a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f61760c + "}";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f61759b) {
                    k.this.f61760c = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long d(k kVar) {
        long j10 = kVar.f61761d;
        kVar.f61761d = 1 + j10;
        return j10;
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f61758a + "}";
    }

    k(Executor executor) {
        this.f61758a = (Executor) r.l(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.r.l(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f61759b
            monitor-enter(r0)
            cf.k$c r1 = r7.f61760c     // Catch: java.lang.Throwable -> L6d
            cf.k$c r2 = cf.k.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            cf.k$c r2 = cf.k.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f61761d     // Catch: java.lang.Throwable -> L6d
            cf.k$a r1 = new cf.k$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.f61759b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            cf.k$c r8 = cf.k.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f61760c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f61758a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            cf.k$b r5 = r7.f61762e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            cf.k$c r0 = r7.f61760c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f61759b
            monitor-enter(r0)
            long r5 = r7.f61761d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            cf.k$c r1 = r7.f61760c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f61760c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.f61759b
            monitor-enter(r2)
            cf.k$c r0 = r7.f61760c     // Catch: java.lang.Throwable -> L55
            cf.k$c r3 = cf.k.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            cf.k$c r3 = cf.k.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.f61759b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.f61759b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.k.execute(java.lang.Runnable):void");
    }
}
