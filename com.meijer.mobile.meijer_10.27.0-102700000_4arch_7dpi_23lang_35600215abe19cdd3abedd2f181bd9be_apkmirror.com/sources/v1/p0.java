package v1;

import android.graphics.RectF;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import v1.C17459M;
import w1.C17747g;
import w1.C17750j;
import w1.InterfaceC17746f;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lv1/o0;", "Landroid/text/Layout;", "layout", "Lv1/M;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "d", "(Lv1/o0;Landroid/text/Layout;Lv1/M;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "lineIndex", "Lw1/f;", "segmentFinder", "getStart", "f", "(Lv1/o0;Landroid/text/Layout;Lv1/M;ILandroid/graphics/RectF;Lw1/f;Lkotlin/jvm/functions/Function2;Z)I", "Lv1/M$a;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "e", "(Lv1/M$a;Landroid/graphics/RectF;IIIFF[FLw1/f;Lkotlin/jvm/functions/Function2;)I", "c", "offset", "a", "(II[F)F", "b", "left", "right", "g", "(Landroid/graphics/RectF;FF)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    public static final int[] d(o0 o0Var, Layout layout, C17459M c17459m, RectF rectF, int i10, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int i11;
        InterfaceC17746f c17750j = i10 == 1 ? new C17750j(o0Var.G(), o0Var.I()) : C17747g.a(o0Var.G(), o0Var.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > o0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= o0Var.getLineCount()) {
            return null;
        }
        int i12 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < o0Var.w(0)) {
            return null;
        }
        int iF = f(o0Var, layout, c17459m, i12, rectF, c17750j, function2, true);
        while (true) {
            i11 = i12;
            if (iF != -1 || i11 >= lineForVertical2) {
                break;
            }
            i12 = i11 + 1;
            iF = f(o0Var, layout, c17459m, i12, rectF, c17750j, function2, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(o0Var, layout, c17459m, lineForVertical2, rectF, c17750j, function2, false);
        while (iF2 == -1 && i11 < lineForVertical2) {
            int i13 = lineForVertical2 - 1;
            iF2 = f(o0Var, layout, c17459m, i13, rectF, c17750j, function2, false);
            lineForVertical2 = i13;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{c17750j.b(iF + 1), c17750j.c(iF2 - 1)};
    }

    private static final int f(o0 o0Var, Layout layout, C17459M c17459m, int i10, RectF rectF, InterfaceC17746f interfaceC17746f, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z10) {
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        o0Var.b(i10, fArr);
        C17459M.BidiRun[] bidiRunArrD = c17459m.d(i10);
        IntProgression intProgressionI0 = z10 ? ArraysKt.i0(bidiRunArrD) : RangesKt.t(ArraysKt.m0(bidiRunArrD), 0);
        int first = intProgressionI0.getFirst();
        int last = intProgressionI0.getLast();
        int step = intProgressionI0.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i11 = first;
            while (true) {
                C17459M.BidiRun bidiRun = bidiRunArrD[i11];
                float fA = bidiRun.getIsRtl() ? a(bidiRun.getEnd() - 1, lineStart, fArr) : a(bidiRun.getStart(), lineStart, fArr);
                float fB = bidiRun.getIsRtl() ? b(bidiRun.getStart(), lineStart, fArr) : b(bidiRun.getEnd() - 1, lineStart, fArr);
                int iE = z10 ? e(bidiRun, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, interfaceC17746f, function2) : c(bidiRun, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, interfaceC17746f, function2);
                if (iE < 0) {
                    if (i11 == last) {
                        break;
                    }
                    i11 += step;
                } else {
                    return iE;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }

    private static final int c(C17459M.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, InterfaceC17746f interfaceC17746f, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iC;
        float fA;
        float fB;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((!bidiRun.getIsRtl() && rectF.right >= f11) || (bidiRun.getIsRtl() && rectF.left <= f10)) {
            start = bidiRun.getEnd() - 1;
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i13 = (end + start) / 2;
                float fA2 = a(i13, i10, fArr);
                if ((!bidiRun.getIsRtl() && fA2 > rectF.right) || (bidiRun.getIsRtl() && fA2 < rectF.left)) {
                    end = i13;
                } else {
                    start = i13;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        }
        int iB = interfaceC17746f.b(start + 1);
        if (iB == -1 || (iC = interfaceC17746f.c(iB)) <= bidiRun.getStart()) {
            return -1;
        }
        int iF = RangesKt.f(iB, bidiRun.getStart());
        int iK = RangesKt.k(iC, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            if (bidiRun.getIsRtl()) {
                fA = a(iK - 1, i10, fArr);
            } else {
                fA = a(iF, i10, fArr);
            }
            rectF2.left = fA;
            if (bidiRun.getIsRtl()) {
                fB = b(iF, i10, fArr);
            } else {
                fB = b(iK - 1, i10, fArr);
            }
            rectF2.right = fB;
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iK;
            }
            iK = interfaceC17746f.d(iK);
            if (iK == -1 || iK <= bidiRun.getStart()) {
                break;
            }
            iF = RangesKt.f(interfaceC17746f.b(iK), bidiRun.getStart());
        }
        return -1;
    }

    private static final int e(C17459M.BidiRun bidiRun, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, InterfaceC17746f interfaceC17746f, Function2<? super RectF, ? super RectF, Boolean> function2) {
        int start;
        int iB;
        float fA;
        float fB;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((!bidiRun.getIsRtl() && rectF.left <= f10) || (bidiRun.getIsRtl() && rectF.right >= f11)) {
            start = bidiRun.getStart();
        } else {
            start = bidiRun.getStart();
            int end = bidiRun.getEnd();
            while (end - start > 1) {
                int i13 = (end + start) / 2;
                float fA2 = a(i13, i10, fArr);
                if ((!bidiRun.getIsRtl() && fA2 > rectF.left) || (bidiRun.getIsRtl() && fA2 < rectF.right)) {
                    end = i13;
                } else {
                    start = i13;
                }
            }
            if (bidiRun.getIsRtl()) {
                start = end;
            }
        }
        int iC = interfaceC17746f.c(start);
        if (iC == -1 || (iB = interfaceC17746f.b(iC)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iF = RangesKt.f(iB, bidiRun.getStart());
        int iK = RangesKt.k(iC, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            if (bidiRun.getIsRtl()) {
                fA = a(iK - 1, i10, fArr);
            } else {
                fA = a(iF, i10, fArr);
            }
            rectF2.left = fA;
            if (bidiRun.getIsRtl()) {
                fB = b(iF, i10, fArr);
            } else {
                fB = b(iK - 1, i10, fArr);
            }
            rectF2.right = fB;
            if (function2.invoke(rectF2, rectF).booleanValue()) {
                return iF;
            }
            iF = interfaceC17746f.a(iF);
            if (iF == -1 || iF >= bidiRun.getEnd()) {
                break;
            }
            iK = RangesKt.k(interfaceC17746f.c(iF), bidiRun.getEnd());
        }
        return -1;
    }
}
