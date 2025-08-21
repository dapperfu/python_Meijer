package k6;

import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15096d extends AbstractC15099g<Float> {
    float s(C17845a<Float> c17845a, float f10) {
        float f11;
        if (c17845a.f166945b == null || c17845a.f166946c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17847c<A> c17847c = this.f141625e;
        if (c17847c != 0) {
            f11 = f10;
            Float f12 = (Float) c17847c.b(c17845a.f166950g, c17845a.f166951h.floatValue(), c17845a.f166945b, c17845a.f166946c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return v6.l.i(c17845a.g(), c17845a.d(), f11);
    }

    public C15096d(List<C17845a<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(C17845a<Float> c17845a, float f10) {
        return Float.valueOf(s(c17845a, f10));
    }
}
