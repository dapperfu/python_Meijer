package fsimpl;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;

/* renamed from: fsimpl.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14248u {

    /* renamed from: a, reason: collision with root package name */
    private RectF f133618a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    private Region f133619b = new Region();

    /* renamed from: c, reason: collision with root package name */
    private float[] f133620c = new float[8];

    /* renamed from: d, reason: collision with root package name */
    private Region f133621d = new Region();

    public void a() {
        synchronized (this.f133621d) {
            this.f133621d.setEmpty();
        }
    }

    public void a(Matrix matrix, int i10, int i11, int i12, int i13) {
        Path path = new Path();
        float[] fArr = this.f133620c;
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
        float[] fArr2 = this.f133620c;
        path.moveTo(fArr2[0], fArr2[1]);
        float[] fArr3 = this.f133620c;
        path.lineTo(fArr3[2], fArr3[3]);
        float[] fArr4 = this.f133620c;
        path.lineTo(fArr4[4], fArr4[5]);
        float[] fArr5 = this.f133620c;
        path.lineTo(fArr5[6], fArr5[7]);
        path.close();
        this.f133619b.set(-10000, -10000, 10000, 10000);
        Region region = this.f133619b;
        region.setPath(path, region);
        this.f133621d.op(this.f133619b, Region.Op.UNION);
    }

    public boolean a(int i10, int i11) {
        return this.f133621d.contains(i10, i11);
    }
}
