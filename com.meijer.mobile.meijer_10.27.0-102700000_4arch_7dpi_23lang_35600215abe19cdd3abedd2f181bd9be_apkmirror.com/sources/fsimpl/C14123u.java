package fsimpl;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;

/* renamed from: fsimpl.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14123u {

    /* renamed from: a, reason: collision with root package name */
    private RectF f132368a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private Region f132369b = new Region();

    /* renamed from: c, reason: collision with root package name */
    private float[] f132370c = new float[8];

    /* renamed from: d, reason: collision with root package name */
    private Region f132371d = new Region();

    public void a() {
        synchronized (this.f132371d) {
            this.f132371d.setEmpty();
        }
    }

    public void a(Matrix matrix, int i10, int i11, int i12, int i13) {
        Path path = new Path();
        float[] fArr = this.f132370c;
        float f10 = i10;
        fArr[0] = f10;
        float f11 = i11;
        fArr[1] = f11;
        float f12 = i12;
        fArr[2] = f12;
        fArr[3] = f11;
        fArr[4] = f12;
        float f13 = i13;
        fArr[5] = f13;
        fArr[6] = f10;
        fArr[7] = f13;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.f132370c;
        path.moveTo(fArr2[0], fArr2[1]);
        float[] fArr3 = this.f132370c;
        path.lineTo(fArr3[2], fArr3[3]);
        float[] fArr4 = this.f132370c;
        path.lineTo(fArr4[4], fArr4[5]);
        float[] fArr5 = this.f132370c;
        path.lineTo(fArr5[6], fArr5[7]);
        path.close();
        this.f132369b.set(-10000, -10000, 10000, 10000);
        Region region = this.f132369b;
        region.setPath(path, region);
        this.f132371d.op(this.f132369b, Region.Op.UNION);
    }

    public boolean a(int i10, int i11) {
        return this.f132371d.contains(i10, i11);
    }
}
