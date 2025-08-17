package j6;

import java.util.List;
import v6.C17512a;
import v6.C17514c;
import v6.C17515d;

/* loaded from: classes4.dex */
public class l extends AbstractC14867g<C17515d> {

    /* renamed from: i, reason: collision with root package name */
    private final C17515d f139459i;

    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C17515d i(C17512a<C17515d> c17512a, float f10) {
        C17515d c17515d;
        float f11;
        C17515d c17515d2 = c17512a.f164561b;
        if (c17515d2 == null || (c17515d = c17512a.f164562c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17515d c17515d3 = c17515d2;
        C17515d c17515d4 = c17515d;
        C17514c<A> c17514c = this.f139427e;
        if (c17514c != 0) {
            f11 = f10;
            C17515d c17515d5 = (C17515d) c17514c.b(c17512a.f164566g, c17512a.f164567h.floatValue(), c17515d3, c17515d4, f11, e(), f());
            if (c17515d5 != null) {
                return c17515d5;
            }
        } else {
            f11 = f10;
        }
        this.f139459i.d(u6.l.i(c17515d3.b(), c17515d4.b(), f11), u6.l.i(c17515d3.c(), c17515d4.c(), f11));
        return this.f139459i;
    }

    public l(List<C17512a<C17515d>> list) {
        super(list);
        this.f139459i = new C17515d();
    }
}
