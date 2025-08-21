package F;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class Z<C> {

    /* renamed from: a, reason: collision with root package name */
    private Set<C> f8699a = new HashSet();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract Z<C> clone();

    public void a(List<C> list) {
        this.f8699a.addAll(list);
    }

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f8699a));
    }
}
