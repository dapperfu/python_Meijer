package k6;

import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15098f extends AbstractC15099g<Integer> {
    int r(C17845a<Integer> c17845a, float f10) {
        float f11;
        if (c17845a.f166945b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = c17845a.f166946c == null ? c17845a.h() : c17845a.e();
        C17847c<A> c17847c = this.f141625e;
        if (c17847c != 0) {
            f11 = f10;
            Integer num = (Integer) c17847c.b(c17845a.f166950g, c17845a.f166951h.floatValue(), c17845a.f166945b, Integer.valueOf(iH), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return v6.l.j(c17845a.h(), iH, f11);
    }

    public C15098f(List<C17845a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(C17845a<Integer> c17845a, float f10) {
        return Integer.valueOf(r(c17845a, f10));
    }
}
