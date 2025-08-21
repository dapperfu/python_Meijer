package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/model/Dependency;", "", "", "workSpecId", "prerequisiteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Dependency {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String workSpecId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String prerequisiteId;

    public Dependency(String workSpecId, String prerequisiteId) {
        Intrinsics.j(workSpecId, "workSpecId");
        Intrinsics.j(prerequisiteId, "prerequisiteId");
        this.workSpecId = workSpecId;
        this.prerequisiteId = prerequisiteId;
    }

    /* renamed from: a, reason: from getter */
    public final String getPrerequisiteId() {
        return this.prerequisiteId;
    }

    /* renamed from: b, reason: from getter */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
