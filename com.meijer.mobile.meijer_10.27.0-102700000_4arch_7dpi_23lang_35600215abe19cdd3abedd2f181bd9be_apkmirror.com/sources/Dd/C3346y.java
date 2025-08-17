package Dd;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: Dd.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3346y extends AbstractC3260q0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f6335a;

    C3346y(A a10) {
        this.f6335a = a10;
    }

    @Override // Dd.AbstractC3260q0
    final Map a() {
        return this.f6335a;
    }

    @Override // Dd.AbstractC3260q0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f6335a.f5143c.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3357z(this.f6335a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        A a10 = this.f6335a;
        I.k(a10.f5144d, entry.getKey());
        return true;
    }
}
