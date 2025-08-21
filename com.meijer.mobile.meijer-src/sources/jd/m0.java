package jd;

import Vd.C5517k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import id.C14720c;

/* loaded from: classes4.dex */
public final class m0 extends P {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC14995s f140359b;

    /* renamed from: c, reason: collision with root package name */
    private final C5517k f140360c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14994q f140361d;

    @Override // jd.o0
    public final void a(Status status) {
        this.f140360c.d(this.f140361d.a(status));
    }

    @Override // jd.o0
    public final void b(Exception exc) {
        this.f140360c.d(exc);
    }

    @Override // jd.o0
    public final void c(H h10) throws DeadObjectException {
        try {
            this.f140359b.b(h10.t(), this.f140360c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f140360c.d(e12);
        }
    }

    @Override // jd.o0
    public final void d(C15000x c15000x, boolean z10) {
        c15000x.d(this.f140360c, z10);
    }

    @Override // jd.P
    public final boolean f(H h10) {
        return this.f140359b.c();
    }

    @Override // jd.P
    public final C14720c[] g(H h10) {
        return this.f140359b.e();
    }

    public m0(int i10, AbstractC14995s abstractC14995s, C5517k c5517k, InterfaceC14994q interfaceC14994q) {
        super(i10);
        this.f140360c = c5517k;
        this.f140359b = abstractC14995s;
        this.f140361d = interfaceC14994q;
        if (i10 == 2 && abstractC14995s.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
