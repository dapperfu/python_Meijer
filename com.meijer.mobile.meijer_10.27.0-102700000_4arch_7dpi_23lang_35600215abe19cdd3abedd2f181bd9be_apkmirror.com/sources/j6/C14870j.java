package j6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* renamed from: j6.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14870j extends AbstractC14867g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f139453i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f139454j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f139455k;

    /* renamed from: l, reason: collision with root package name */
    private final PathMeasure f139456l;

    /* renamed from: m, reason: collision with root package name */
    private C14869i f139457m;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(C17512a<PointF> c17512a, float f10) {
        float f11;
        C14869i c14869i = (C14869i) c17512a;
        Path pathK = c14869i.k();
        C17514c<A> c17514c = this.f139427e;
        if (c17514c == 0 || c17512a.f164567h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) c17514c.b(c14869i.f164566g, c14869i.f164567h.floatValue(), (PointF) c14869i.f164561b, (PointF) c14869i.f164562c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return c17512a.f164561b;
        }
        if (this.f139457m != c14869i) {
            this.f139456l.setPath(pathK, false);
            this.f139457m = c14869i;
        }
        float length = this.f139456l.getLength();
        float f12 = f11 * length;
        this.f139456l.getPosTan(f12, this.f139454j, this.f139455k);
        PointF pointF2 = this.f139453i;
        float[] fArr = this.f139454j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f139453i;
            float[] fArr2 = this.f139455k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f139453i;
            float[] fArr3 = this.f139455k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f139453i;
    }

    public C14870j(List<? extends C17512a<PointF>> list) {
        super(list);
        this.f139453i = new PointF();
        this.f139454j = new float[2];
        this.f139455k = new float[2];
        this.f139456l = new PathMeasure();
    }
}
