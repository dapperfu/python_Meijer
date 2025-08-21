package L1;

import O1.e;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LL1/e;", "LL1/b;", "", "Lkotlin/Function1;", "LL1/B;", "", "tasks", "", PreferencesHelper.PREF_ID, "", "index", "<init>", "(Ljava/util/List;Ljava/lang/Object;I)V", "state", "LO1/a;", "c", "(LL1/B;)LO1/a;", "Ljava/lang/Object;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: L1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4008e extends AbstractC4005b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4008e(List<Function1<B, Unit>> tasks, Object id2, int i10) {
        super(tasks, i10);
        Intrinsics.j(tasks, "tasks");
        Intrinsics.j(id2, "id");
        this.id = id2;
    }

    @Override // L1.AbstractC4005b
    public O1.a c(B state) {
        Intrinsics.j(state, "state");
        O1.c cVarH = state.h(this.id, e.EnumC0378e.VERTICAL_CHAIN);
        Intrinsics.i(cVarH, "state.helper(id, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN)");
        return cVarH;
    }
}
