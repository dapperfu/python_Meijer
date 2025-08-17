package j6;

import java.util.List;
import u6.C17231e;
import v6.C17512a;
import v6.C17514c;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14862b extends AbstractC14867g<Integer> {
    public int s(C17512a<Integer> c17512a, float f10) {
        float f11;
        Float f12;
        if (c17512a.f164561b == null || c17512a.f164562c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C17514c<A> c17514c = this.f139427e;
        if (c17514c == 0 || (f12 = c17512a.f164567h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) c17514c.b(c17512a.f164566g, f12.floatValue(), c17512a.f164561b, c17512a.f164562c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C17231e.c(u6.l.b(f11, 0.0f, 1.0f), c17512a.f164561b.intValue(), c17512a.f164562c.intValue());
    }

    public C14862b(List<C17512a<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(C17512a<Integer> c17512a, float f10) {
        return Integer.valueOf(s(c17512a, f10));
    }
}
