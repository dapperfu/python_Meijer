package androidx.view;

import X2.a;
import X2.b;
import X2.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"LX2/e;", "a", "LX2/e;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/c0;", "Lmv/O;", "(Landroidx/lifecycle/c0;)Lmv/O;", "viewModelScope", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e f55473a = new e();

    public static final InterfaceC15783O a(c0 c0Var) {
        a aVarB;
        Intrinsics.j(c0Var, "<this>");
        synchronized (f55473a) {
            aVarB = (a) c0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVarB == null) {
                aVarB = b.b();
                c0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVarB);
            }
        }
        return aVarB;
    }
}
