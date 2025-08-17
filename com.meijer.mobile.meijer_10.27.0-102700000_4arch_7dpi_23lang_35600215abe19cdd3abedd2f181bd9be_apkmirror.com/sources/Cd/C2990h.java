package Cd;

import java.util.Arrays;

/* renamed from: Cd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2990h {

    /* renamed from: a, reason: collision with root package name */
    Object[] f3807a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f3808b = 0;

    /* renamed from: c, reason: collision with root package name */
    C2989g f3809c;

    public final C2990h a(Object obj, Object obj2) {
        int i10 = this.f3808b + 1;
        Object[] objArr = this.f3807a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f3807a = Arrays.copyOf(objArr, C2984b.a(length, i11));
        }
        b0.a(obj, obj2);
        Object[] objArr2 = this.f3807a;
        int i12 = this.f3808b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f3808b = i12 + 1;
        return this;
    }

    public final AbstractC2991i b() {
        C2989g c2989g = this.f3809c;
        if (c2989g != null) {
            throw c2989g.a();
        }
        C2999q c2999qH = C2999q.h(this.f3808b, this.f3807a, this);
        C2989g c2989g2 = this.f3809c;
        if (c2989g2 == null) {
            return c2999qH;
        }
        throw c2989g2.a();
    }
}
