package o6;

import java.util.Arrays;
import java.util.List;
import v6.C17512a;

/* loaded from: classes4.dex */
abstract class p<V, O> implements o<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<C17512a<V>> f153194a;

    @Override // o6.o
    public List<C17512a<V>> b() {
        return this.f153194a;
    }

    @Override // o6.o
    public boolean g() {
        return this.f153194a.isEmpty() || (this.f153194a.size() == 1 && this.f153194a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f153194a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f153194a.toArray()));
        }
        return sb2.toString();
    }

    p(List<C17512a<V>> list) {
        this.f153194a = list;
    }
}
