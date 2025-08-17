package dh;

import Pu.q;

/* renamed from: dh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C13520a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f127389a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f127390b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f127391c;

    /* renamed from: d, reason: collision with root package name */
    private int f127392d;

    /* renamed from: dh.a$a, reason: collision with other inner class name */
    public interface InterfaceC2004a<T> extends q<T> {
        @Override // Pu.q
        boolean test(T t10);
    }

    void a(T t10) {
        int i10 = this.f127389a;
        int i11 = this.f127392d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f127391c[i10] = objArr;
            this.f127391c = objArr;
            i11 = 0;
        }
        this.f127391c[i11] = t10;
        this.f127392d = i11 + 1;
    }

    void b(InterfaceC2004a<? super T> interfaceC2004a) {
        int i10;
        int i11 = this.f127389a;
        for (Object[] objArr = this.f127390b; objArr != null; objArr = (Object[]) objArr[i11]) {
            while (i10 < i11) {
                Object obj = objArr[i10];
                i10 = (obj == null || interfaceC2004a.test(obj)) ? 0 : i10 + 1;
            }
        }
    }

    C13520a(int i10) {
        this.f127389a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f127390b = objArr;
        this.f127391c = objArr;
    }
}
