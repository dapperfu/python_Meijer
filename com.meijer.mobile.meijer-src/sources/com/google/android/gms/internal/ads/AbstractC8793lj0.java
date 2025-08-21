package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.lj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8793lj0 extends AbstractC9328qj0 {

    /* renamed from: o, reason: collision with root package name */
    private static final Vj0 f77466o = new Vj0(AbstractC8793lj0.class);

    /* renamed from: l, reason: collision with root package name */
    private AbstractC7526Zg0 f77467l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f77468m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f77469n;

    private static void O(Throwable th2) {
        f77466o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void U(int i10, com.google.common.util.concurrent.q qVar) {
        try {
            if (qVar.isCancelled()) {
                this.f77467l = null;
                cancel(false);
            } else {
                L(i10, qVar);
            }
            V(null);
        } catch (Throwable th2) {
            V(null);
            throw th2;
        }
    }

    abstract void R(int i10, Object obj);

    abstract void S();

    void W(int i10) {
        this.f77467l = null;
    }

    private static boolean Q(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    final void T() {
        Objects.requireNonNull(this.f77467l);
        if (this.f77467l.isEmpty()) {
            S();
            return;
        }
        if (!this.f77468m) {
            final AbstractC7526Zg0 abstractC7526Zg0 = this.f77469n ? this.f77467l : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.kj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76541a.V(abstractC7526Zg0);
                }
            };
            AbstractC8684ki0 it = this.f77467l.iterator();
            while (it.hasNext()) {
                com.google.common.util.concurrent.q qVar = (com.google.common.util.concurrent.q) it.next();
                if (qVar.isDone()) {
                    V(abstractC7526Zg0);
                } else {
                    qVar.addListener(runnable, EnumC10290zj0.INSTANCE);
                }
            }
            return;
        }
        AbstractC8684ki0 it2 = this.f77467l.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final com.google.common.util.concurrent.q qVar2 = (com.google.common.util.concurrent.q) it2.next();
            int i11 = i10 + 1;
            if (qVar2.isDone()) {
                U(i10, qVar2);
            } else {
                qVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.jj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76351a.U(i10, qVar2);
                    }
                }, EnumC10290zj0.INSTANCE);
            }
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final String e() {
        AbstractC7526Zg0 abstractC7526Zg0 = this.f77467l;
        return abstractC7526Zg0 != null ? "futures=".concat(abstractC7526Zg0.toString()) : super.e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final void f() {
        AbstractC7526Zg0 abstractC7526Zg0 = this.f77467l;
        W(1);
        if ((abstractC7526Zg0 != null) && isCancelled()) {
            boolean zW = w();
            AbstractC8684ki0 it = abstractC7526Zg0.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zW);
            }
        }
    }

    AbstractC8793lj0(AbstractC7526Zg0 abstractC7526Zg0, boolean z10, boolean z11) {
        super(abstractC7526Zg0.size());
        this.f77467l = abstractC7526Zg0;
        this.f77468m = z10;
        this.f77469n = z11;
    }

    private final void L(int i10, Future future) {
        try {
            R(i10, C9223pk0.a(future));
        } catch (ExecutionException e10) {
            N(e10.getCause());
        } catch (Throwable th2) {
            N(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void V(AbstractC7526Zg0 abstractC7526Zg0) {
        boolean z10;
        int iD = D();
        int i10 = 0;
        if (iD >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6782Df0.m(z10, "Less than 0 remaining futures");
        if (iD == 0) {
            if (abstractC7526Zg0 != null) {
                AbstractC8684ki0 it = abstractC7526Zg0.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        L(i10, future);
                    }
                    i10++;
                }
            }
            I();
            S();
            W(2);
        }
    }

    private final void N(Throwable th2) {
        th2.getClass();
        if (this.f77468m && !h(th2) && Q(F(), th2)) {
            O(th2);
        } else if (th2 instanceof Error) {
            O(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9328qj0
    final void J(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable thA = a();
            Objects.requireNonNull(thA);
            Q(set, thA);
        }
    }
}
