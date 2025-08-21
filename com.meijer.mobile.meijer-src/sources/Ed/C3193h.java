package Ed;

import java.util.Arrays;

/* renamed from: Ed.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3193h {

    /* renamed from: a, reason: collision with root package name */
    Object[] f7119a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f7120b = 0;

    /* renamed from: c, reason: collision with root package name */
    C3192g f7121c;

    public final C3193h a(Object obj, Object obj2) {
        int i10 = this.f7120b + 1;
        Object[] objArr = this.f7119a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f7119a = Arrays.copyOf(objArr, C3187b.a(length, i11));
        }
        b0.a(obj, obj2);
        Object[] objArr2 = this.f7119a;
        int i12 = this.f7120b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f7120b = i12 + 1;
        return this;
    }

    public final AbstractC3194i b() {
        C3192g c3192g = this.f7121c;
        if (c3192g != null) {
            throw c3192g.a();
        }
        C3202q c3202qH = C3202q.h(this.f7120b, this.f7119a, this);
        C3192g c3192g2 = this.f7121c;
        if (c3192g2 == null) {
            return c3202qH;
        }
        throw c3192g2.a();
    }
}
