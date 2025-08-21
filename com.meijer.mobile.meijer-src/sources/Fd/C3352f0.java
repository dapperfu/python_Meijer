package Fd;

import java.io.Serializable;

/* renamed from: Fd.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3352f0 extends J implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f10076a;

    /* renamed from: b, reason: collision with root package name */
    final Object f10077b;

    @Override // Fd.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f10076a;
    }

    @Override // Fd.J, java.util.Map.Entry
    public final Object getValue() {
        return this.f10077b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    C3352f0(Object obj, Object obj2) {
        this.f10076a = obj;
        this.f10077b = obj2;
    }
}
