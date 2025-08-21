package pd;

import Vd.C5517k;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import jd.C14988k;
import jd.C14996t;
import od.C16111g;
import od.InterfaceC16105a;

/* loaded from: classes4.dex */
final class t extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f156336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5517k f156337b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC16105a f156338c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f156339d;

    t(v vVar, AtomicReference atomicReference, C5517k c5517k, InterfaceC16105a interfaceC16105a) {
        this.f156339d = vVar;
        this.f156336a = atomicReference;
        this.f156337b = c5517k;
        this.f156338c = interfaceC16105a;
    }

    @Override // pd.b, pd.h
    public final void K8(Status status, C16111g c16111g) {
        if (c16111g != null) {
            this.f156336a.set(c16111g);
        }
        C14996t.c(status, null, this.f156337b);
        if (!status.d1() || (c16111g != null && c16111g.T())) {
            this.f156339d.doUnregisterEventListener(C14988k.c(this.f156338c, InterfaceC16105a.class.getSimpleName()), 27306);
        }
    }
}
