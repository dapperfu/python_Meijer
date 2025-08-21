package L1;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LL1/i;", "LL1/d;", "", PreferencesHelper.PREF_ID, "", "Lkotlin/Function1;", "LL1/B;", "", "tasks", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "a", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "b", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class i implements InterfaceC4007d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<B, Unit>> tasks;

    public i(Object id2, List<Function1<B, Unit>> tasks) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(tasks, "tasks");
        this.id = id2;
        this.tasks = tasks;
    }
}
