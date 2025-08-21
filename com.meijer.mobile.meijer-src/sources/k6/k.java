package k6;

import android.graphics.PointF;
import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* loaded from: classes4.dex */
public class k extends AbstractC15099g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f141656i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k6.AbstractC15093a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(C17845a<PointF> c17845a, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c17845a.f166945b;
        if (pointF3 == null || (pointF = c17845a.f166946c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C17847c<A> c17847c = this.f141625e;
        if (c17847c != 0 && (pointF2 = (PointF) c17847c.b(c17845a.f166950g, c17845a.f166951h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f141656i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f141656i;
    }

    public k(List<C17845a<PointF>> list) {
        super(list);
        this.f141656i = new PointF();
    }

    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(C17845a<PointF> c17845a, float f10) {
        return j(c17845a, f10, f10, f10);
    }
}
