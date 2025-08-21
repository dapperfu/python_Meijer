package fsimpl;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.Arrays;

/* renamed from: fsimpl.bm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14113bm implements InterfaceC14115bo {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f133088a = new float[2];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f133089b = new float[384];

    @Override // fsimpl.InterfaceC14115bo
    public int a(gh ghVar, Path path, int i10) {
        if (path == null || path.isEmpty()) {
            return 0;
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        int i11 = 0;
        do {
            float length = pathMeasure.getLength();
            pathMeasure.getPosTan(0.0f, this.f133088a, null);
            float[] fArr = this.f133089b;
            int i12 = i11 * 3;
            fArr[i12] = i11;
            int i13 = i12 + 1;
            float[] fArr2 = this.f133088a;
            fArr[i13] = fArr2[0];
            fArr[i13] = fArr2[1];
            int i14 = i11 + 1;
            pathMeasure.getPosTan(length / 2.0f, fArr2, null);
            float[] fArr3 = this.f133089b;
            int i15 = i14 * 3;
            fArr3[i15] = i14;
            int i16 = i15 + 1;
            float[] fArr4 = this.f133088a;
            fArr3[i16] = fArr4[0];
            fArr3[i16] = fArr4[1];
            int i17 = i14 + 1;
            pathMeasure.getPosTan(length, fArr4, null);
            float[] fArr5 = this.f133089b;
            int i18 = i17 * 3;
            fArr5[i18] = i17;
            int i19 = i18 + 1;
            float[] fArr6 = this.f133088a;
            fArr5[i19] = fArr6[0];
            fArr5[i19] = fArr6[1];
            i11 = i17 + 1;
            if (i11 > 120) {
                break;
            }
        } while (pathMeasure.nextContour());
        return C14162dh.a(ghVar, i10, C14162dh.a(ghVar, Arrays.copyOf(this.f133089b, i11 * 3)), 0);
    }

    @Override // fsimpl.InterfaceC14115bo
    public boolean a() {
        return true;
    }
}
