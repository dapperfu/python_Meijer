package k6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* renamed from: k6.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15102j extends AbstractC15099g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f141651i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f141652j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f141653k;

    /* renamed from: l, reason: collision with root package name */
    private final PathMeasure f141654l;

    /* renamed from: m, reason: collision with root package name */
    private C15101i f141655m;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(C17845a<PointF> c17845a, float f10) {
        float f11;
        C15101i c15101i = (C15101i) c17845a;
        Path pathK = c15101i.k();
        C17847c<A> c17847c = this.f141625e;
        if (c17847c == 0 || c17845a.f166951h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) c17847c.b(c15101i.f166950g, c15101i.f166951h.floatValue(), (PointF) c15101i.f166945b, (PointF) c15101i.f166946c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return c17845a.f166945b;
        }
        if (this.f141655m != c15101i) {
            this.f141654l.setPath(pathK, false);
            this.f141655m = c15101i;
        }
        float length = this.f141654l.getLength();
        float f12 = f11 * length;
        this.f141654l.getPosTan(f12, this.f141652j, this.f141653k);
        PointF pointF2 = this.f141651i;
        float[] fArr = this.f141652j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f141651i;
            float[] fArr2 = this.f141653k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f141651i;
            float[] fArr3 = this.f141653k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f141651i;
    }

    public C15102j(List<? extends C17845a<PointF>> list) {
        super(list);
        this.f141651i = new PointF();
        this.f141652j = new float[2];
        this.f141653k = new float[2];
        this.f141654l = new PathMeasure();
    }
}
