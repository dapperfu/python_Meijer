package k6;

import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15094b extends AbstractC15099g<Integer> {
    public int s(C17845a<Integer> c17845a, float f10) {
        float f11;
        Float f12;
        if (c17845a.f166945b == null || c17845a.f166946c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17847c<A> c17847c = this.f141625e;
        if (c17847c == 0 || (f12 = c17845a.f166951h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) c17847c.b(c17845a.f166950g, f12.floatValue(), c17845a.f166945b, c17845a.f166946c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return v6.e.c(v6.l.b(f11, 0.0f, 1.0f), c17845a.f166945b.intValue(), c17845a.f166946c.intValue());
    }

    public C15094b(List<C17845a<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(C17845a<Integer> c17845a, float f10) {
        return Integer.valueOf(s(c17845a, f10));
    }
}
