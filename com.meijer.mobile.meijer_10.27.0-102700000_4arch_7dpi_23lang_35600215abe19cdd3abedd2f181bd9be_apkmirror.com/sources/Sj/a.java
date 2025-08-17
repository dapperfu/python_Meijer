package Sj;

import Bj.o;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import le.InterfaceC15403a;
import q2.y;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LSj/a;", "Landroidx/core/view/a;", "<init>", "()V", "Landroid/view/View;", "host", "Lq2/y;", "info", "", "g", "(Landroid/view/View;Lq2/y;)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class a extends androidx.core.view.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.a
    public void g(View host, y info) {
        Intrinsics.j(host, "host");
        Intrinsics.j(info, "info");
        super.g(host, info);
        if (!(host instanceof InterfaceC15403a)) {
            throw new IllegalStateException("Accessibility Delegate host must implement ExpandableWidget");
        }
        InterfaceC15403a interfaceC15403a = (InterfaceC15403a) host;
        info.b(new y.a(16, host.getContext().getString(interfaceC15403a.c() ? o.f3005a : o.f3007b)));
        info.F0(2);
        info.C0(host.getContext().getString(interfaceC15403a.c() ? o.f2979J0 : o.f2977I0));
        info.B0(true);
    }
}
