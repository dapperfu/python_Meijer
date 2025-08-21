package Gd;

import java.util.AbstractMap;

/* loaded from: classes6.dex */
final class T5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ U5 f11857c;

    T5(U5 u52) {
        this.f11857c = u52;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f11857c.f11869e, "index");
        U5 u52 = this.f11857c;
        int i11 = i10 + i10;
        Object obj = u52.f11868d[i11];
        obj.getClass();
        Object obj2 = u52.f11868d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11857c.f11869e;
    }
}
