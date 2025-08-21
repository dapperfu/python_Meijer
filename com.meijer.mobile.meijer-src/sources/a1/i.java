package a1;

import a1.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "La1/h;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "", "a", "(CLjava/util/ArrayList;[FI)V", "", "b", "(Ljava/util/List;[FI)V", "c", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i {
    public static final void a(char c10, ArrayList<h> arrayList, float[] fArr, int i10) {
        int i11 = 0;
        switch (c10) {
            case 'A':
                int i12 = i10 - 7;
                for (int i13 = 0; i13 <= i12; i13 += 7) {
                    arrayList.add(new h.ArcTo(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], Float.compare(fArr[i13 + 3], 0.0f) != 0, Float.compare(fArr[i13 + 4], 0.0f) != 0, fArr[i13 + 5], fArr[i13 + 6]));
                }
                return;
            case 'C':
                int i14 = i10 - 6;
                while (i11 <= i14) {
                    arrayList.add(new h.CurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'H':
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new h.HorizontalTo(fArr[i11]));
                    i11++;
                }
                return;
            case 'L':
                int i16 = i10 - 2;
                while (i11 <= i16) {
                    arrayList.add(new h.LineTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'M':
                b(arrayList, fArr, i10);
                return;
            case 'Q':
                int i17 = i10 - 4;
                while (i11 <= i17) {
                    arrayList.add(new h.QuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 'S':
                int i18 = i10 - 4;
                while (i11 <= i18) {
                    arrayList.add(new h.ReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 'T':
                int i19 = i10 - 2;
                while (i11 <= i19) {
                    arrayList.add(new h.ReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'V':
                int i20 = i10 - 1;
                while (i11 <= i20) {
                    arrayList.add(new h.VerticalTo(fArr[i11]));
                    i11++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(h.b.f44257c);
                return;
            case 'a':
                int i21 = i10 - 7;
                for (int i22 = 0; i22 <= i21; i22 += 7) {
                    arrayList.add(new h.RelativeArcTo(fArr[i22], fArr[i22 + 1], fArr[i22 + 2], Float.compare(fArr[i22 + 3], 0.0f) != 0, Float.compare(fArr[i22 + 4], 0.0f) != 0, fArr[i22 + 5], fArr[i22 + 6]));
                }
                return;
            case 'c':
                int i23 = i10 - 6;
                while (i11 <= i23) {
                    arrayList.add(new h.RelativeCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
                return;
            case 'h':
                int i24 = i10 - 1;
                while (i11 <= i24) {
                    arrayList.add(new h.RelativeHorizontalTo(fArr[i11]));
                    i11++;
                }
                return;
            case 'l':
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new h.RelativeLineTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i10);
                return;
            case 'q':
                int i26 = i10 - 4;
                while (i11 <= i26) {
                    arrayList.add(new h.RelativeQuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 's':
                int i27 = i10 - 4;
                while (i11 <= i27) {
                    arrayList.add(new h.RelativeReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
                return;
            case 't':
                int i28 = i10 - 2;
                while (i11 <= i28) {
                    arrayList.add(new h.RelativeReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
                return;
            case 'v':
                int i29 = i10 - 1;
                while (i11 <= i29) {
                    arrayList.add(new h.RelativeVerticalTo(fArr[i11]));
                    i11++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c10);
        }
    }

    private static final void b(List<h> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new h.MoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new h.LineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    private static final void c(List<h> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new h.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new h.RelativeLineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
