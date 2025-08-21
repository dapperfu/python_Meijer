package L1;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LL1/j;", "LL1/b;", "", PreferencesHelper.PREF_ID, "", "index", "", "Lkotlin/Function1;", "LL1/B;", "", "tasks", "<init>", "(Ljava/lang/Object;ILjava/util/List;)V", "state", "LO1/a;", "c", "(LL1/B;)LO1/a;", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class j extends AbstractC4005b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object id2, int i10, List<Function1<B, Unit>> tasks) {
        super(tasks, i10);
        Intrinsics.j(id2, "id");
        Intrinsics.j(tasks, "tasks");
        this.id = id2;
    }

    @Override // L1.AbstractC4005b
    public O1.a c(B state) {
        Intrinsics.j(state, "state");
        O1.a aVarB = state.b(this.id);
        Intrinsics.i(aVarB, "state.constraints(id)");
        return aVarB;
    }
}
