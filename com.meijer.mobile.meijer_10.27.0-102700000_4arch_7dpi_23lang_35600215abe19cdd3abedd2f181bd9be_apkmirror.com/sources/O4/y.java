package O4;

import V4.WorkGenerationalId;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LO4/y;", "", "LV4/h;", PreferencesHelper.PREF_ID, "<init>", "(LV4/h;)V", "a", "LV4/h;", "()LV4/h;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkGenerationalId id;

    public y(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
    }

    /* renamed from: a, reason: from getter */
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
