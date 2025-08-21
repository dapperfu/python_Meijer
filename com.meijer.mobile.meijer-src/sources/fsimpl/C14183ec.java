package fsimpl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.ec, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14183ec {

    /* renamed from: a, reason: collision with root package name */
    private List f133374a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List f133375b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f133376c = new ArrayList();

    C14183ec() {
    }

    private dQ[] d(List list) {
        dQ[] dQVarArr = new dQ[0];
        return list == null ? dQVarArr : (dQ[]) list.toArray(dQVarArr);
    }

    C14181ea a() {
        return new C14181ea(d(this.f133374a), d(this.f133375b), d(this.f133376c));
    }

    C14183ec a(List list) {
        if (list != null) {
            this.f133374a.addAll(list);
        }
        return this;
    }

    C14183ec b(List list) {
        if (list != null) {
            this.f133375b.addAll(list);
        }
        return this;
    }

    C14183ec c(List list) {
        if (list != null) {
            this.f133376c.addAll(list);
        }
        return this;
    }
}
