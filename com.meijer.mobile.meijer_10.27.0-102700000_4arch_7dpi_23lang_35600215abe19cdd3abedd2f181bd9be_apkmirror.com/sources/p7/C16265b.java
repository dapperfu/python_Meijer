package p7;

import Z.C5503a;
import Z.n0;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16265b<K, V> extends C5503a<K, V> {

    /* renamed from: g, reason: collision with root package name */
    private int f155649g;

    @Override // Z.n0, java.util.Map
    public void clear() {
        this.f155649g = 0;
        super.clear();
    }

    @Override // Z.n0
    public void h(n0<? extends K, ? extends V> n0Var) {
        this.f155649g = 0;
        super.h(n0Var);
    }

    @Override // Z.n0
    public V i(int i10) {
        this.f155649g = 0;
        return (V) super.i(i10);
    }

    @Override // Z.n0
    public V j(int i10, V v10) {
        this.f155649g = 0;
        return (V) super.j(i10, v10);
    }

    @Override // Z.n0, java.util.Map
    public V put(K k10, V v10) {
        this.f155649g = 0;
        return (V) super.put(k10, v10);
    }

    @Override // Z.n0, java.util.Map
    public int hashCode() {
        if (this.f155649g == 0) {
            this.f155649g = super.hashCode();
        }
        return this.f155649g;
    }
}
