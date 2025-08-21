package p6;

import java.util.Arrays;
import java.util.List;
import w6.C17845a;

/* loaded from: classes4.dex */
abstract class p<V, O> implements o<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<C17845a<V>> f156186a;

    @Override // p6.o
    public List<C17845a<V>> b() {
        return this.f156186a;
    }

    @Override // p6.o
    public boolean g() {
        return this.f156186a.isEmpty() || (this.f156186a.size() == 1 && this.f156186a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f156186a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f156186a.toArray()));
        }
        return sb2.toString();
    }

    p(List<C17845a<V>> list) {
        this.f156186a = list;
    }
}
