package z1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lz1/M;", "textFieldValue", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lz1/M;Lz1/E;Lu1/v;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "d", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILz1/E;Lu1/v;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILz1/E;Lu1/v;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18358d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, z1.InterfaceC18354E r20, u1.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.g r7 = r21.getMultiParagraph()
            long r8 = u1.C17207A.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L8b
            int r2 = r1.b(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.r(r7)
            float r8 = r7.getLeft()
            float r9 = r7.getTop()
            boolean r8 = c(r3, r8, r9)
            if (r8 == 0) goto L64
            float r8 = r7.l()
            float r9 = r7.i()
            boolean r8 = c(r3, r8, r9)
            if (r8 != 0) goto L61
            goto L64
        L61:
            r8 = r21
            goto L67
        L64:
            r5 = r5 | 2
            goto L61
        L67:
            F1.i r2 = r8.c(r2)
            F1.i r9 = F1.i.f10164b
            if (r2 != r9) goto L71
            r5 = r5 | 4
        L71:
            r16 = r5
            float r12 = r7.getLeft()
            float r13 = r7.getTop()
            float r14 = r7.l()
            float r15 = r7.i()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C18358d.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, z1.E, u1.v, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, InterfaceC18354E interfaceC18354E, TextLayoutResult textLayoutResult, Rect rect) {
        if (i10 < 0) {
            return builder;
        }
        int iB = interfaceC18354E.b(i10);
        Rect rectE = textLayoutResult.e(iB);
        float fN = RangesKt.n(rectE.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zC = c(rect, fN, rectE.getTop());
        boolean zC2 = c(rect, fN, rectE.i());
        boolean z10 = textLayoutResult.c(iB) == F1.i.f10164b;
        int i11 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i11 |= 2;
        }
        if (z10) {
            i11 |= 4;
        }
        builder.setInsertionMarkerLocation(fN, rectE.getTop(), rectE.i(), rectE.i(), i11);
        return builder;
    }

    @Deprecated
    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, boolean z13) {
        int iL;
        builder.reset();
        builder.setMatrix(matrix);
        int iL2 = androidx.compose.ui.text.y.l(textFieldValue.getSelection());
        builder.setSelectionRange(iL2, androidx.compose.ui.text.y.k(textFieldValue.getSelection()));
        if (z10) {
            d(builder, iL2, interfaceC18354E, textLayoutResult, rect);
        }
        if (z11) {
            androidx.compose.ui.text.y composition = textFieldValue.getComposition();
            int iK = -1;
            if (composition != null) {
                iL = androidx.compose.ui.text.y.l(composition.getPackedValue());
            } else {
                iL = -1;
            }
            androidx.compose.ui.text.y composition2 = textFieldValue.getComposition();
            if (composition2 != null) {
                iK = androidx.compose.ui.text.y.k(composition2.getPackedValue());
            }
            int i10 = iK;
            if (iL >= 0 && iL < i10) {
                builder.setComposingText(iL, textFieldValue.h().subSequence(iL, i10));
                a(builder, iL, i10, interfaceC18354E, textLayoutResult, rect);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z12) {
            C18356b.a(builder, rect2);
        }
        if (i11 >= 34 && z13) {
            C18357c.a(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final boolean c(Rect rect, float f10, float f11) {
        float left = rect.getLeft();
        if (f10 <= rect.l() && left <= f10) {
            float top = rect.getTop();
            if (f11 <= rect.i() && top <= f11) {
                return true;
            }
            return false;
        }
        return false;
    }
}
