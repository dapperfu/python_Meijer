package hd;

import Td.C5233k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import gd.C14244c;

/* loaded from: classes4.dex */
public final class m0 extends P {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC14417s f134670b;

    /* renamed from: c, reason: collision with root package name */
    private final C5233k f134671c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14416q f134672d;

    @Override // hd.o0
    public final void a(Status status) {
        this.f134671c.d(this.f134672d.a(status));
    }

    @Override // hd.o0
    public final void b(Exception exc) {
        this.f134671c.d(exc);
    }

    @Override // hd.o0
    public final void c(H h10) throws DeadObjectException {
        try {
            this.f134670b.b(h10.t(), this.f134671c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f134671c.d(e12);
        }
    }

    @Override // hd.o0
    public final void d(C14422x c14422x, boolean z10) {
        c14422x.d(this.f134671c, z10);
    }

    @Override // hd.P
    public final boolean f(H h10) {
        return this.f134670b.c();
    }

    @Override // hd.P
    public final C14244c[] g(H h10) {
        return this.f134670b.e();
    }

    public m0(int i10, AbstractC14417s abstractC14417s, C5233k c5233k, InterfaceC14416q interfaceC14416q) {
        super(i10);
        this.f134671c = c5233k;
        this.f134670b = abstractC14417s;
        this.f134672d = interfaceC14416q;
        if (i10 == 2 && abstractC14417s.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
