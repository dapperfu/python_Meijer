package k6;

import java.util.List;
import w6.C17845a;
import w6.C17847c;
import w6.C17848d;

/* loaded from: classes4.dex */
public class l extends AbstractC15099g<C17848d> {

    /* renamed from: i, reason: collision with root package name */
    private final C17848d f141657i;

    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C17848d i(C17845a<C17848d> c17845a, float f10) {
        C17848d c17848d;
        float f11;
        C17848d c17848d2 = c17845a.f166945b;
        if (c17848d2 == null || (c17848d = c17845a.f166946c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17848d c17848d3 = c17848d2;
        C17848d c17848d4 = c17848d;
        C17847c<A> c17847c = this.f141625e;
        if (c17847c != 0) {
            f11 = f10;
            C17848d c17848d5 = (C17848d) c17847c.b(c17845a.f166950g, c17845a.f166951h.floatValue(), c17848d3, c17848d4, f11, e(), f());
            if (c17848d5 != null) {
                return c17848d5;
            }
        } else {
            f11 = f10;
        }
        this.f141657i.d(v6.l.i(c17848d3.b(), c17848d4.b(), f11), v6.l.i(c17848d3.c(), c17848d4.c(), f11));
        return this.f141657i;
    }

    public l(List<C17845a<C17848d>> list) {
        super(list);
        this.f141657i = new C17848d();
    }
}
