package qf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f157258a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f157259b;

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f157258a));
    }

    public synchronized boolean c(List<j> list) {
        this.f157258a.clear();
        if (list.size() <= this.f157259b) {
            return this.f157258a.addAll(list);
        }
        lf.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f157259b);
        return this.f157258a.addAll(list.subList(0, this.f157259b));
    }

    public k(int i10) {
        this.f157259b = i10;
    }

    public List<AbstractC16777F.e.d.AbstractC2462e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(listB.get(i10).h());
        }
        return arrayList;
    }
}
