package Ru;

import io.reactivex.g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class f<T> extends Ru.a<T, T> {

    static final class a<T> extends AtomicInteger implements g<T>, lw.c {

        /* renamed from: a, reason: collision with root package name */
        final lw.b<? super T> f34063a;

        /* renamed from: b, reason: collision with root package name */
        lw.c f34064b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f34065c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f34066d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f34067e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f34068f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f34069g = new AtomicReference<>();

        @Override // lw.b
        public void onComplete() {
            this.f34065c = true;
            c();
        }

        boolean a(boolean z10, boolean z11, lw.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f34067e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f34066d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                bVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // lw.b
        public void b(lw.c cVar) {
            if (Zu.b.p(this.f34064b, cVar)) {
                this.f34064b = cVar;
                this.f34063a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // lw.c
        public void cancel() {
            if (this.f34067e) {
                return;
            }
            this.f34067e = true;
            this.f34064b.cancel();
            if (getAndIncrement() == 0) {
                this.f34069g.lazySet(null);
            }
        }

        @Override // lw.b
        public void onError(Throwable th2) {
            this.f34066d = th2;
            this.f34065c = true;
            c();
        }

        @Override // lw.b
        public void onNext(T t10) {
            this.f34069g.lazySet(t10);
            c();
        }

        a(lw.b<? super T> bVar) {
            this.f34063a = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f34065c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (a(r9, r10, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            av.d.c(r1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void c() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                goto L5e
            L7:
                lw.b<? super T> r0 = r13.f34063a
                java.util.concurrent.atomic.AtomicLong r1 = r13.f34068f
                java.util.concurrent.atomic.AtomicReference<T> r2 = r13.f34069g
                r3 = 1
                r4 = r3
            Lf:
                r5 = 0
                r7 = r5
            L12:
                long r9 = r1.get()
                int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                r10 = 0
                if (r9 == 0) goto L38
                boolean r9 = r13.f34065c
                r11 = 0
                java.lang.Object r11 = r2.getAndSet(r11)
                if (r11 != 0) goto L26
                r12 = r3
                goto L27
            L26:
                r12 = r10
            L27:
                boolean r9 = r13.a(r9, r12, r0, r2)
                if (r9 == 0) goto L2e
                goto L5e
            L2e:
                if (r12 == 0) goto L31
                goto L38
            L31:
                r0.onNext(r11)
                r9 = 1
                long r7 = r7 + r9
                goto L12
            L38:
                long r11 = r1.get()
                int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r9 != 0) goto L50
                boolean r9 = r13.f34065c
                java.lang.Object r11 = r2.get()
                if (r11 != 0) goto L49
                r10 = r3
            L49:
                boolean r9 = r13.a(r9, r10, r0, r2)
                if (r9 == 0) goto L50
                goto L5e
            L50:
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 == 0) goto L57
                av.d.c(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ru.f.a.c():void");
        }

        @Override // lw.c
        public void t(long j10) {
            if (Zu.b.o(j10)) {
                av.d.a(this.f34068f, j10);
                c();
            }
        }
    }

    @Override // io.reactivex.f
    protected void h(lw.b<? super T> bVar) {
        this.f34037b.g(new a(bVar));
    }

    public f(io.reactivex.f<T> fVar) {
        super(fVar);
    }
}
