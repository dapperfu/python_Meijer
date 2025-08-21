package jd;

import android.os.DeadObjectException;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public final class k0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f140346b;

    @Override // jd.o0
    public final void a(Status status) {
        try {
            this.f140346b.o(status);
        } catch (IllegalStateException e10) {
            FS.log_w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // jd.o0
    public final void b(Exception exc) {
        try {
            this.f140346b.o(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            FS.log_w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // jd.o0
    public final void c(H h10) throws DeadObjectException {
        try {
            this.f140346b.m(h10.t());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // jd.o0
    public final void d(C15000x c15000x, boolean z10) {
        c15000x.c(this.f140346b, z10);
    }

    public k0(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        this.f140346b = (com.google.android.gms.common.api.internal.a) com.google.android.gms.common.internal.r.m(aVar, "Null methods are not runnable.");
    }
}
