package V4;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "LV4/h;", "a", "(Landroidx/work/impl/model/WorkSpec;)LV4/h;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p {
    public static final WorkGenerationalId a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, workSpec.getGeneration());
    }
}
