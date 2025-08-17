package L1;

import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, d2 = {"LL1/F;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "LL1/B;", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "tasks", "LL1/h;", "LL1/h;", "()LL1/h;", "parent", "LL1/x;", "d", "LL1/x;", "()LL1/x;", "top", "e", "bottom", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<B, Unit>> tasks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h parent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x top;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x bottom;

    public F(Object id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = O1.e.f23026f;
        Intrinsics.i(PARENT, "PARENT");
        this.parent = new h(PARENT);
        this.top = new C4037e(arrayList, id2, 0);
        this.bottom = new C4037e(arrayList, id2, 1);
    }

    /* renamed from: a, reason: from getter */
    public final x getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final h getParent() {
        return this.parent;
    }

    public final List<Function1<B, Unit>> c() {
        return this.tasks;
    }

    /* renamed from: d, reason: from getter */
    public final x getTop() {
        return this.top;
    }
}
