package j6;

import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* renamed from: j6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14866f extends AbstractC14867g<Integer> {
    int r(C17512a<Integer> c17512a, float f10) {
        float f11;
        if (c17512a.f164561b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = c17512a.f164562c == null ? c17512a.h() : c17512a.e();
        C17514c<A> c17514c = this.f139427e;
        if (c17514c != 0) {
            f11 = f10;
            Integer num = (Integer) c17514c.b(c17512a.f164566g, c17512a.f164567h.floatValue(), c17512a.f164561b, Integer.valueOf(iH), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return u6.l.j(c17512a.h(), iH, f11);
    }

    public C14866f(List<C17512a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(C17512a<Integer> c17512a, float f10) {
        return Integer.valueOf(r(c17512a, f10));
    }
}
