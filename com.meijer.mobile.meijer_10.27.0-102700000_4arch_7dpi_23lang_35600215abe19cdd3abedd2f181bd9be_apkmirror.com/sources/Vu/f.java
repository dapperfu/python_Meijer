package Vu;

import dv.EnumC13584b;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class f<T> extends Vu.a<T, T> {

    static final class a<T> extends AtomicInteger implements g<T>, pw.c {

        /* renamed from: a, reason: collision with root package name */
        final pw.b<? super T> f38052a;

        /* renamed from: b, reason: collision with root package name */
        pw.c f38053b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f38054c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f38055d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f38056e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f38057f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<T> f38058g = new AtomicReference<>();

        @Override // pw.b
        public void onComplete() {
            this.f38054c = true;
            c();
        }

        boolean a(boolean z10, boolean z11, pw.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f38056e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f38055d;
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

        @Override // pw.b
        public void b(pw.c cVar) {
            if (EnumC13584b.p(this.f38053b, cVar)) {
                this.f38053b = cVar;
                this.f38052a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // pw.c
        public void cancel() {
            if (this.f38056e) {
                return;
            }
            this.f38056e = true;
            this.f38053b.cancel();
            if (getAndIncrement() == 0) {
                this.f38058g.lazySet(null);
            }
        }

        @Override // pw.b
        public void onError(Throwable th2) {
            this.f38055d = th2;
            this.f38054c = true;
            c();
        }

        @Override // pw.b
        public void onNext(T t10) {
            this.f38058g.lazySet(t10);
            c();
        }

        a(pw.b<? super T> bVar) {
            this.f38052a = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f38054c;
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
        
            ev.d.c(r1, r7);
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
                pw.b<? super T> r0 = r13.f38052a
                java.util.concurrent.atomic.AtomicLong r1 = r13.f38057f
                java.util.concurrent.atomic.AtomicReference<T> r2 = r13.f38058g
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
                boolean r9 = r13.f38054c
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
                boolean r9 = r13.f38054c
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
                ev.d.c(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vu.f.a.c():void");
        }

        @Override // pw.c
        public void t(long j10) {
            if (EnumC13584b.o(j10)) {
                ev.d.a(this.f38057f, j10);
                c();
            }
        }
    }

    @Override // io.reactivex.f
    protected void h(pw.b<? super T> bVar) {
        this.f38026b.g(new a(bVar));
    }

    public f(io.reactivex.f<T> fVar) {
        super(fVar);
    }
}
