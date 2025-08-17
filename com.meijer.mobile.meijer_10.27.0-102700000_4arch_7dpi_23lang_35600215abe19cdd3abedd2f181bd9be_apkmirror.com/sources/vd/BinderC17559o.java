package vd;

import Td.C5233k;
import bd.C6224c;
import bd.C6227f;
import com.google.android.gms.common.api.Status;
import hd.C14418t;

/* renamed from: vd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC17559o extends AbstractBinderC17549e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f164656a;

    BinderC17559o(C17560p c17560p, C5233k c5233k) {
        this.f164656a = c5233k;
    }

    @Override // vd.InterfaceC17550f
    public final void o7(Status status, C6227f c6227f) {
        C14418t.b(status, c6227f != null ? new C6224c(c6227f.T(), c6227f.B()) : null, this.f164656a);
    }
}
