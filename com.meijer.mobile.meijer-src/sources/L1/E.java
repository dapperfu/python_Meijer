package L1;

import L1.k;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R \u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"LL1/E;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "LL1/k$b;", "b", "LL1/k$b;", "getTop", "()LL1/k$b;", "getTop$annotations", "()V", "top", "c", "getBottom", "getBottom$annotations", "bottom", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.HorizontalAnchor top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k.HorizontalAnchor bottom;

    public E(Object id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
        this.top = new k.HorizontalAnchor(id2, 0);
        this.bottom = new k.HorizontalAnchor(id2, 1);
    }

    /* renamed from: a, reason: from getter */
    public final Object getId() {
        return this.id;
    }
}
