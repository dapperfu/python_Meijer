package fsimpl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.ec, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14058ec {

    /* renamed from: a, reason: collision with root package name */
    private List f132124a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List f132125b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f132126c = new ArrayList();

    C14058ec() {
    }

    private dQ[] d(List list) {
        dQ[] dQVarArr = new dQ[0];
        return list == null ? dQVarArr : (dQ[]) list.toArray(dQVarArr);
    }

    C14056ea a() {
        return new C14056ea(d(this.f132124a), d(this.f132125b), d(this.f132126c));
    }

    C14058ec a(List list) {
        if (list != null) {
            this.f132124a.addAll(list);
        }
        return this;
    }

    C14058ec b(List list) {
        if (list != null) {
            this.f132125b.addAll(list);
        }
        return this;
    }

    C14058ec c(List list) {
        if (list != null) {
            this.f132126c.addAll(list);
        }
        return this;
    }
}
