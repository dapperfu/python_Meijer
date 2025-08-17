package j6;

import android.graphics.PointF;
import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* loaded from: classes4.dex */
public class k extends AbstractC14867g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f139458i;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j6.AbstractC14861a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(C17512a<PointF> c17512a, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c17512a.f164561b;
        if (pointF3 == null || (pointF = c17512a.f164562c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C17514c<A> c17514c = this.f139427e;
        if (c17514c != 0 && (pointF2 = (PointF) c17514c.b(c17512a.f164566g, c17512a.f164567h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f139458i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f139458i;
    }

    public k(List<C17512a<PointF>> list) {
        super(list);
        this.f139458i = new PointF();
    }

    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(C17512a<PointF> c17512a, float f10) {
        return j(c17512a, f10, f10, f10);
    }
}
