package O4;

import V4.WorkGenerationalId;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LO4/A;", "LO4/z;", "<init>", "()V", "LV4/h;", PreferencesHelper.PREF_ID, "LO4/y;", "d", "(LV4/h;)LO4/y;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(LV4/h;)Z", "", "b", "Ljava/util/Map;", "runs", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class A implements z {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<WorkGenerationalId, y> runs = new LinkedHashMap();

    @Override // O4.z
    public y c(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        return this.runs.remove(id2);
    }

    @Override // O4.z
    public y d(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        Map<WorkGenerationalId, y> map = this.runs;
        y yVar = map.get(id2);
        if (yVar == null) {
            yVar = new y(id2);
            map.put(id2, yVar);
        }
        return yVar;
    }

    @Override // O4.z
    public boolean e(WorkGenerationalId id2) {
        Intrinsics.j(id2, "id");
        return this.runs.containsKey(id2);
    }

    @Override // O4.z
    public List<y> remove(String workSpecId) {
        Intrinsics.j(workSpecId, "workSpecId");
        Map<WorkGenerationalId, y> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, y> entry : map.entrySet()) {
            if (Intrinsics.e(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.j1(linkedHashMap.values());
    }
}
