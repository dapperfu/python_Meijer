package ju;

import androidx.recyclerview.widget.h;
import java.util.Collection;

/* renamed from: ju.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
class C15067b extends h.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f141262a;

    /* renamed from: b, reason: collision with root package name */
    private final int f141263b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<? extends InterfaceC15068c> f141264c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<? extends InterfaceC15068c> f141265d;

    @Override // androidx.recyclerview.widget.h.b
    public boolean a(int i10, int i11) {
        return f.a(this.f141265d, i11).m(f.a(this.f141264c, i10));
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean b(int i10, int i11) {
        return f.a(this.f141265d, i11).q(f.a(this.f141264c, i10));
    }

    @Override // androidx.recyclerview.widget.h.b
    public Object c(int i10, int i11) {
        return f.a(this.f141264c, i10).h(f.a(this.f141265d, i11));
    }

    @Override // androidx.recyclerview.widget.h.b
    public int d() {
        return this.f141263b;
    }

    @Override // androidx.recyclerview.widget.h.b
    public int e() {
        return this.f141262a;
    }

    C15067b(Collection<? extends InterfaceC15068c> collection, Collection<? extends InterfaceC15068c> collection2) {
        this.f141262a = f.b(collection);
        this.f141263b = f.b(collection2);
        this.f141264c = collection;
        this.f141265d = collection2;
    }
}
