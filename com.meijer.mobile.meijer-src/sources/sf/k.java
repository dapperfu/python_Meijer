package sf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f160373a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f160374b;

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f160373a));
    }

    public synchronized boolean c(List<j> list) {
        this.f160373a.clear();
        if (list.size() <= this.f160374b) {
            return this.f160373a.addAll(list);
        }
        nf.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f160374b);
        return this.f160373a.addAll(list.subList(0, this.f160374b));
    }

    public k(int i10) {
        this.f160374b = i10;
    }

    public List<AbstractC17251F.e.d.AbstractC2568e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(listB.get(i10).h());
        }
        return arrayList;
    }
}
