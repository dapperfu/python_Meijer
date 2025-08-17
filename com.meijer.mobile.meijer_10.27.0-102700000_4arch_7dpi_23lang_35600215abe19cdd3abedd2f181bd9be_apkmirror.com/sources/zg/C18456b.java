package zg;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: zg.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18456b {
    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            Point point = pointArr[i10];
            int i11 = i10 + i10;
            fArr[i11] = point.x;
            fArr[i11 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            int i13 = i12 + i12;
            pointArr[i12].set((int) fArr[i13], (int) fArr[i13 + 1]);
        }
    }

    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i10);
    }

    public static void c(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
