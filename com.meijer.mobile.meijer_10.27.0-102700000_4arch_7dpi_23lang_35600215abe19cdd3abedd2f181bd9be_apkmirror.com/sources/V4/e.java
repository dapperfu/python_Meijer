package V4;

import androidx.work.impl.model.SystemIdInfo;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"LV4/e;", "", "Landroidx/work/impl/model/SystemIdInfo;", "systemIdInfo", "", "d", "(Landroidx/work/impl/model/SystemIdInfo;)V", "", "workSpecId", "", "generation", "b", "(Ljava/lang/String;I)Landroidx/work/impl/model/SystemIdInfo;", "LV4/h;", PreferencesHelper.PREF_ID, "e", "(LV4/h;)Landroidx/work/impl/model/SystemIdInfo;", "f", "(Ljava/lang/String;I)V", "g", "(Ljava/lang/String;)V", "a", "(LV4/h;)V", "", "c", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {
    SystemIdInfo b(String workSpecId, int generation);

    List<String> c();

    void d(SystemIdInfo systemIdInfo);

    void f(String workSpecId, int generation);

    void g(String workSpecId);

    default void a(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        f(id2.getWorkSpecId(), id2.getGeneration());
    }

    default SystemIdInfo e(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        return b(id2.getWorkSpecId(), id2.getGeneration());
    }
}
