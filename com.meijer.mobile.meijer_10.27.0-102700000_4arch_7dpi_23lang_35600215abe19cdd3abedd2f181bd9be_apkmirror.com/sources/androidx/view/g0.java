package androidx.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/g0;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/c0;", "viewModel", "", "d", "(Ljava/lang/String;Landroidx/lifecycle/c0;)V", "b", "(Ljava/lang/String;)Landroidx/lifecycle/c0;", "", "c", "()Ljava/util/Set;", "a", "", "Ljava/util/Map;", "map", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, c0> map = new LinkedHashMap();

    public final void a() {
        Iterator<c0> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    public final c0 b(String key) {
        Intrinsics.j(key, "key");
        return this.map.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.map.keySet());
    }

    public final void d(String key, c0 viewModel) {
        Intrinsics.j(key, "key");
        Intrinsics.j(viewModel, "viewModel");
        c0 c0VarPut = this.map.put(key, viewModel);
        if (c0VarPut != null) {
            c0VarPut.clear$lifecycle_viewmodel_release();
        }
    }
}
