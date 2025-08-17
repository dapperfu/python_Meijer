package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class y implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final p f88113f = new p(y.class);

    /* renamed from: a, reason: collision with root package name */
    private final Executor f88114a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f88115b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f88116c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f88117d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f88118e = new b(this, null);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f88119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f88120b;

        a(y yVar, Runnable runnable) {
            this.f88119a = runnable;
            this.f88120b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88119a.run();
        }

        public String toString() {
            return this.f88119a.toString();
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f88121a;

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
        
            r8.f88121a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.common.util.concurrent.y.f88113f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f88121a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.f88121a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
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
                com.google.common.util.concurrent.y r2 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = com.google.common.util.concurrent.y.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r0 = com.google.common.util.concurrent.y.b(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L81
            L22:
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.d(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.y r3 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.y.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f88121a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                com.google.common.util.concurrent.y r0 = com.google.common.util.concurrent.y.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.y.c(r0, r3)     // Catch: java.lang.Throwable -> L20
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
                java.lang.Runnable r3 = r8.f88121a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            L55:
                r8.f88121a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L83
            L5a:
                r0 = move-exception
                goto L7e
            L5c:
                r3 = move-exception
                com.google.common.util.concurrent.p r4 = com.google.common.util.concurrent.y.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f88121a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7e:
                r8.f88121a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L81:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L83:
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.y.b.a():void");
        }

        /* synthetic */ b(y yVar, a aVar) {
            this();
        }

        public String toString() {
            Runnable runnable = this.f88121a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + y.this.f88116c + "}";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (y.this.f88115b) {
                    y.this.f88116c = c.IDLE;
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

    static /* synthetic */ long d(y yVar) {
        long j10 = yVar.f88117d;
        yVar.f88117d = 1 + j10;
        return j10;
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f88114a + "}";
    }

    y(Executor executor) {
        this.f88114a = (Executor) Be.p.q(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            Be.p.q(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f88115b
            monitor-enter(r0)
            com.google.common.util.concurrent.y$c r1 = r7.f88116c     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.y$c r2 = com.google.common.util.concurrent.y.c.RUNNING     // Catch: java.lang.Throwable -> L6b
            if (r1 == r2) goto L6d
            com.google.common.util.concurrent.y$c r2 = com.google.common.util.concurrent.y.c.QUEUED     // Catch: java.lang.Throwable -> L6b
            if (r1 != r2) goto L11
            goto L6d
        L11:
            long r3 = r7.f88117d     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.y$a r1 = new com.google.common.util.concurrent.y$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque<java.lang.Runnable> r8 = r7.f88115b     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.y$c r8 = com.google.common.util.concurrent.y.c.QUEUING     // Catch: java.lang.Throwable -> L6b
            r7.f88116c = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r0 = r7.f88114a     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.y$b r5 = r7.f88118e     // Catch: java.lang.Throwable -> L44
            r0.execute(r5)     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.y$c r0 = r7.f88116c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f88115b
            monitor-enter(r0)
            long r5 = r7.f88117d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.common.util.concurrent.y$c r1 = r7.f88116c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f88116c = r2     // Catch: java.lang.Throwable -> L3e
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
            java.util.Deque<java.lang.Runnable> r2 = r7.f88115b
            monitor-enter(r2)
            com.google.common.util.concurrent.y$c r0 = r7.f88116c     // Catch: java.lang.Throwable -> L53
            com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.IDLE     // Catch: java.lang.Throwable -> L53
            if (r0 == r3) goto L55
            com.google.common.util.concurrent.y$c r3 = com.google.common.util.concurrent.y.c.QUEUING     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L5f
            goto L55
        L53:
            r8 = move-exception
            goto L69
        L55:
            java.util.Deque<java.lang.Runnable> r0 = r7.f88115b     // Catch: java.lang.Throwable -> L53
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L68
            if (r0 != 0) goto L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            return
        L68:
            throw r8     // Catch: java.lang.Throwable -> L53
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r8
        L6b:
            r8 = move-exception
            goto L74
        L6d:
            java.util.Deque<java.lang.Runnable> r1 = r7.f88115b     // Catch: java.lang.Throwable -> L6b
            r1.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.y.execute(java.lang.Runnable):void");
    }
}
