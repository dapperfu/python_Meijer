package u0;

import android.graphics.PointF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Q1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17207A;
import u1.TextLayoutResult;
import z1.C18366l;
import z1.InterfaceC18363i;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0017\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001b\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a&\u0010#\u001a\u00020\u0005*\u00020\u00102\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020\u0006*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'\u001a:\u0010+\u001a\u00020\u0000*\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a2\u0010-\u001a\u00020\u0005*\u00020(2\u0006\u0010 \u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a<\u00101\u001a\u00020\u0000*\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a(\u00104\u001a\u00020\u0005*\u00020(2\u0006\u00103\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a#\u00109\u001a\u0002072\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020706\"\u000207H\u0002¢\u0006\u0004\b9\u0010:\u001a\"\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/y;", "", "text", "j", "(JLjava/lang/CharSequence;)J", "", "", "u", "(I)Z", "w", "x", "v", "Landroid/graphics/PointF;", "LU0/f;", "z", "(Landroid/graphics/PointF;)J", "Landroidx/compose/foundation/text/B;", "Landroidx/compose/ui/geometry/Rect;", "rectInScreen", "Lu1/p;", "granularity", "Lu1/t;", "inclusionStrategy", "r", "(Landroidx/compose/foundation/text/B;Landroidx/compose/ui/geometry/Rect;ILu1/t;)J", "startRectInScreen", "endRectInScreen", "s", "(Landroidx/compose/foundation/text/B;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILu1/t;)J", "offset", "y", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "n", "(Landroidx/compose/foundation/text/B;JLandroidx/compose/ui/platform/Q1;)I", "Lu1/v;", "t", "(Lu1/v;I)Z", "Landroidx/compose/ui/text/g;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "q", "(Landroidx/compose/ui/text/g;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILu1/t;)J", "o", "(Landroidx/compose/ui/text/g;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/Q1;)I", "startPointInScreen", "endPointerInScreen", "p", "(Lu1/v;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/Q1;)J", "localPoint", "m", "(Landroidx/compose/ui/text/g;JLandroidx/compose/ui/platform/Q1;)I", "", "Lz1/i;", "editCommands", "k", "([Lz1/i;)Lz1/i;", "a", "b", "l", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j0 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"u0/j0$a", "Lz1/i;", "Lz1/l;", "buffer", "", "a", "(Lz1/l;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC18363i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18363i[] f162518a;

        a(InterfaceC18363i[] interfaceC18363iArr) {
            this.f162518a = interfaceC18363iArr;
        }

        @Override // z1.InterfaceC18363i
        public void a(C18366l buffer) {
            for (InterfaceC18363i interfaceC18363i : this.f162518a) {
                interfaceC18363i.a(buffer);
            }
        }
    }

    private static final int o(androidx.compose.ui.text.g gVar, long j10, LayoutCoordinates layoutCoordinates, Q1 q12) {
        long jQ;
        int iM;
        if (layoutCoordinates == null || (iM = m(gVar, (jQ = layoutCoordinates.q(j10)), q12)) == -1) {
            return -1;
        }
        return gVar.x(U0.f.g(jQ, 0.0f, (gVar.v(iM) + gVar.l(iM)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iC = C17187f.c(charSequence, iCharCount);
            if (!w(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i10 < charSequence.length()) {
            int iB = C17187f.b(charSequence, i10);
            if (!w(iB)) {
                break;
            }
            i10 += C17187f.a(iB);
        }
        return C17207A.b(iCharCount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC18363i k(InterfaceC18363i... interfaceC18363iArr) {
        return new a(interfaceC18363iArr);
    }

    private static final int m(androidx.compose.ui.text.g gVar, long j10, Q1 q12) {
        float fH = q12 != null ? q12.h() : 0.0f;
        int i10 = (int) (4294967295L & j10);
        int iQ = gVar.q(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) >= gVar.v(iQ) - fH && Float.intBitsToFloat(i10) <= gVar.l(iQ) + fH) {
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) >= (-fH) && Float.intBitsToFloat(i11) <= gVar.getWidth() + fH) {
                return iQ;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(TextLayoutResult textLayoutResult, long j10, long j11, LayoutCoordinates layoutCoordinates, Q1 q12) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return androidx.compose.ui.text.y.INSTANCE.a();
        }
        long jQ = layoutCoordinates.q(j10);
        long jQ2 = layoutCoordinates.q(j11);
        int iM = m(textLayoutResult.getMultiParagraph(), jQ, q12);
        int iM2 = m(textLayoutResult.getMultiParagraph(), jQ2, q12);
        if (iM != -1) {
            if (iM2 != -1) {
                iM = Math.min(iM, iM2);
            }
            iM2 = iM;
        } else if (iM2 == -1) {
            return androidx.compose.ui.text.y.INSTANCE.a();
        }
        float fV = (textLayoutResult.v(iM2) + textLayoutResult.m(iM2)) / 2;
        int i10 = (int) (jQ >> 32);
        int i11 = (int) (jQ2 >> 32);
        return textLayoutResult.getMultiParagraph().C(new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fV - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fV + 0.1f), u1.p.INSTANCE.a(), u1.t.INSTANCE.g());
    }

    private static final long q(androidx.compose.ui.text.g gVar, Rect rect, LayoutCoordinates layoutCoordinates, int i10, u1.t tVar) {
        return (gVar == null || layoutCoordinates == null) ? androidx.compose.ui.text.y.INSTANCE.a() : gVar.C(rect.t(layoutCoordinates.q(U0.f.INSTANCE.c())), i10, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return U0.f.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10, CharSequence charSequence) {
        int iCodePointBefore;
        int iN = androidx.compose.ui.text.y.n(j10);
        int i10 = androidx.compose.ui.text.y.i(j10);
        int iCodePointAt = 10;
        if (iN > 0) {
            iCodePointBefore = Character.codePointBefore(charSequence, iN);
        } else {
            iCodePointBefore = 10;
        }
        if (i10 < charSequence.length()) {
            iCodePointAt = Character.codePointAt(charSequence, i10);
        }
        if (x(iCodePointBefore) && (w(iCodePointAt) || v(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (x(iCodePointBefore));
            return C17207A.b(iN, i10);
        }
        if (x(iCodePointAt)) {
            if (w(iCodePointBefore) || v(iCodePointBefore)) {
                do {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 == charSequence.length()) {
                        break;
                    }
                    iCodePointAt = Character.codePointAt(charSequence, i10);
                } while (x(iCodePointAt));
                return C17207A.b(iN, i10);
            }
            return j10;
        }
        return j10;
    }

    private static final long l(long j10, long j11) {
        return C17207A.b(Math.min(androidx.compose.ui.text.y.n(j10), androidx.compose.ui.text.y.n(j10)), Math.max(androidx.compose.ui.text.y.i(j11), androidx.compose.ui.text.y.i(j11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(androidx.compose.foundation.text.B b10, long j10, Q1 q12) {
        TextLayoutResult value;
        androidx.compose.ui.text.g multiParagraph;
        androidx.compose.foundation.text.h0 h0VarL = b10.l();
        if (h0VarL != null && (value = h0VarL.getValue()) != null && (multiParagraph = value.getMultiParagraph()) != null) {
            return o(multiParagraph, j10, b10.k(), q12);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(androidx.compose.foundation.text.B b10, Rect rect, int i10, u1.t tVar) {
        androidx.compose.ui.text.g multiParagraph;
        TextLayoutResult value;
        androidx.compose.foundation.text.h0 h0VarL = b10.l();
        if (h0VarL != null && (value = h0VarL.getValue()) != null) {
            multiParagraph = value.getMultiParagraph();
        } else {
            multiParagraph = null;
        }
        return q(multiParagraph, rect, b10.k(), i10, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long s(androidx.compose.foundation.text.B b10, Rect rect, Rect rect2, int i10, u1.t tVar) {
        long jR = r(b10, rect, i10, tVar);
        if (androidx.compose.ui.text.y.h(jR)) {
            return androidx.compose.ui.text.y.INSTANCE.a();
        }
        long jR2 = r(b10, rect2, i10, tVar);
        if (androidx.compose.ui.text.y.h(jR2)) {
            return androidx.compose.ui.text.y.INSTANCE.a();
        }
        return l(jR, jR2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(TextLayoutResult textLayoutResult, int i10) {
        int iQ = textLayoutResult.q(i10);
        if (i10 != textLayoutResult.u(iQ) && i10 != TextLayoutResult.p(textLayoutResult, iQ, false, 2, null)) {
            if (textLayoutResult.c(i10) != textLayoutResult.c(i10 - 1)) {
                return true;
            }
            return false;
        }
        if (textLayoutResult.y(i10) != textLayoutResult.c(i10)) {
            return true;
        }
        return false;
    }

    private static final boolean u(int i10) {
        int type = Character.getType(i10);
        if (type != 14 && type != 13 && i10 != 10) {
            return false;
        }
        return true;
    }

    private static final boolean v(int i10) {
        int type = Character.getType(i10);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    private static final boolean w(int i10) {
        if (!Character.isWhitespace(i10) && i10 != 160) {
            return false;
        }
        return true;
    }

    private static final boolean x(int i10) {
        if (w(i10) && !u(i10)) {
            return true;
        }
        return false;
    }
}
