package V4;

import androidx.work.impl.model.SystemIdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LV4/h;", "generationalId", "", "systemId", "Landroidx/work/impl/model/SystemIdInfo;", "a", "(LV4/h;I)Landroidx/work/impl/model/SystemIdInfo;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {
    public static final SystemIdInfo a(WorkGenerationalId generationalId, int i10) {
        Intrinsics.j(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i10);
    }
}
