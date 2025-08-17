package Y4;

import N4.AbstractC4333v;
import V4.e;
import V4.i;
import V4.p;
import V4.q;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LV4/i;", "workNameDao", "LV4/q;", "workTagDao", "LV4/e;", "systemIdInfoDao", "", "Landroidx/work/impl/model/WorkSpec;", "workSpecs", "", "d", "(LV4/i;LV4/q;LV4/e;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Landroidx/work/impl/model/WorkSpec;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40116a;

    static {
        String strI = AbstractC4333v.i("DiagnosticsWrkr");
        Intrinsics.i(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f40116a = strI;
    }

    private static final String c(WorkSpec workSpec, String str, Integer num, String str2) {
        return '\n' + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(i iVar, q qVar, e eVar, List<WorkSpec> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfoE = eVar.e(p.a(workSpec));
            sb2.append(c(workSpec, CollectionsKt.B0(iVar.b(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String), ",", null, null, 0, null, null, 62, null), systemIdInfoE != null ? Integer.valueOf(systemIdInfoE.systemId) : null, CollectionsKt.B0(qVar.a(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
