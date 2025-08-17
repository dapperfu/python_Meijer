package j6;

import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14864d extends AbstractC14867g<Float> {
    float s(C17512a<Float> c17512a, float f10) {
        float f11;
        if (c17512a.f164561b == null || c17512a.f164562c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17514c<A> c17514c = this.f139427e;
        if (c17514c != 0) {
            f11 = f10;
            Float f12 = (Float) c17514c.b(c17512a.f164566g, c17512a.f164567h.floatValue(), c17512a.f164561b, c17512a.f164562c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return u6.l.i(c17512a.g(), c17512a.d(), f11);
    }

    public C14864d(List<C17512a<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(C17512a<Float> c17512a, float f10) {
        return Float.valueOf(s(c17512a, f10));
    }
}
