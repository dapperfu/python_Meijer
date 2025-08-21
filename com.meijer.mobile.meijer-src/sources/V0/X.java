package V0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a<\u0010\u000f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e*\n\u0010\u001f\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LU0/f;", "from", "to", "", "LV0/q0;", "colors", "", "colorStops", "LV0/I1;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "a", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "b", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "", "c", "(Ljava/util/List;)I", "numTransparentColors", "", "d", "(Ljava/util/List;I)[I", "stops", "", "e", "(Ljava/util/List;Ljava/util/List;I)[F", "", "f", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X {
    public static final int c(List<C5489q0> list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = CollectionsKt.o(list);
        for (int i11 = 1; i11 < iO; i11++) {
            if (C5489q0.t(list.get(i11).getValue()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] d(List<C5489q0> list, int i10) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = C5492s0.j(list.get(i12).getValue());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iO = CollectionsKt.o(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long value = list.get(i12).getValue();
            if (C5489q0.t(value) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = C5492s0.j(C5489q0.q(list.get(1).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == iO) {
                    i11 = i13 + 1;
                    iArr2[i13] = C5492s0.j(C5489q0.q(list.get(i12 - 1).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = C5492s0.j(C5489q0.q(list.get(i12 - 1).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = C5492s0.j(C5489q0.q(list.get(i12 + 1).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = C5492s0.j(value);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] e(List<Float> list, List<C5489q0> list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt.g1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iO = CollectionsKt.o(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iO; i12++) {
            long value = list2.get(i12).getValue();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt.o(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (C5489q0.t(value) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt.o(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void f(List<C5489q0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final Shader a(long j10, long j11, List<C5489q0> list, List<Float> list2, int i10) {
        f(list, list2);
        int iC = c(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), d(list, iC), e(list2, list, iC), Y.a(i10));
    }

    public static final Shader b(long j10, List<C5489q0> list, List<Float> list2) {
        f(list, list2);
        int iC = c(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), d(list, iC), e(list2, list, iC));
    }
}
