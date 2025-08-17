package K8;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final List<d> f16338a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f16339b;

    public List<c> a() {
        return this.f16339b;
    }

    public List<d> b() {
        return this.f16338a;
    }

    public i(List<d> list, List<c> list2) {
        this.f16338a = Collections.unmodifiableList(list);
        this.f16339b = Collections.unmodifiableList(list2);
    }
}
