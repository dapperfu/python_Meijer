package M8;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final List<d> f19697a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f19698b;

    public List<c> a() {
        return this.f19698b;
    }

    public List<d> b() {
        return this.f19697a;
    }

    public i(List<d> list, List<c> list2) {
        this.f19697a = Collections.unmodifiableList(list);
        this.f19698b = Collections.unmodifiableList(list2);
    }
}
