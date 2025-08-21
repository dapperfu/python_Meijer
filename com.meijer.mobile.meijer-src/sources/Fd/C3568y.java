package Fd;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: Fd.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3568y extends AbstractC3482q0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f10368a;

    C3568y(A a10) {
        this.f10368a = a10;
    }

    @Override // Fd.AbstractC3482q0
    final Map a() {
        return this.f10368a;
    }

    @Override // Fd.AbstractC3482q0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f10368a.f9176c.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3579z(this.f10368a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        A a10 = this.f10368a;
        I.k(a10.f9177d, entry.getKey());
        return true;
    }
}
