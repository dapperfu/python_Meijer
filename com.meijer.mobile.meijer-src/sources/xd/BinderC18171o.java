package xd;

import Vd.C5517k;
import com.google.android.gms.common.api.Status;
import dd.C13655c;
import dd.C13658f;
import jd.C14996t;

/* renamed from: xd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC18171o extends AbstractBinderC18161e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f170692a;

    BinderC18171o(C18172p c18172p, C5517k c5517k) {
        this.f170692a = c5517k;
    }

    @Override // xd.InterfaceC18162f
    public final void C4(Status status, C13658f c13658f) {
        C14996t.b(status, c13658f != null ? new C13655c(c13658f.T(), c13658f.B()) : null, this.f170692a);
    }
}
