package nu;

import androidx.recyclerview.widget.h;
import java.util.Collection;

/* renamed from: nu.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
class C15947b extends h.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f152812a;

    /* renamed from: b, reason: collision with root package name */
    private final int f152813b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<? extends InterfaceC15948c> f152814c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<? extends InterfaceC15948c> f152815d;

    @Override // androidx.recyclerview.widget.h.b
    public boolean a(int i10, int i11) {
        return f.a(this.f152815d, i11).m(f.a(this.f152814c, i10));
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean b(int i10, int i11) {
        return f.a(this.f152815d, i11).q(f.a(this.f152814c, i10));
    }

    @Override // androidx.recyclerview.widget.h.b
    public Object c(int i10, int i11) {
        return f.a(this.f152814c, i10).h(f.a(this.f152815d, i11));
    }

    @Override // androidx.recyclerview.widget.h.b
    public int d() {
        return this.f152813b;
    }

    @Override // androidx.recyclerview.widget.h.b
    public int e() {
        return this.f152812a;
    }

    C15947b(Collection<? extends InterfaceC15948c> collection, Collection<? extends InterfaceC15948c> collection2) {
        this.f152812a = f.b(collection);
        this.f152813b = f.b(collection2);
        this.f152814c = collection;
        this.f152815d = collection2;
    }
}
