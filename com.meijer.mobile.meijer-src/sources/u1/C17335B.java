package u1;

import F1.l;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/z;", "start", "stop", "", "fraction", "c", "(Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/z;F)Landroidx/compose/ui/text/z;", "style", "LH1/t;", "direction", "d", "(Landroidx/compose/ui/text/z;LH1/t;)Landroidx/compose/ui/text/z;", "layoutDirection", "LF1/l;", "textDirection", "e", "(LH1/t;I)I", "Lu1/k;", "platformSpanStyle", "Landroidx/compose/ui/text/p;", "platformParagraphStyle", "Lu1/m;", "b", "(Lu1/k;Landroidx/compose/ui/text/p;)Lu1/m;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: u1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17335B {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u1.B$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[H1.t.values().length];
            try {
                iArr[H1.t.f13338a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H1.t.f13339b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(k kVar, PlatformParagraphStyle platformParagraphStyle) {
        if (kVar == null && platformParagraphStyle == null) {
            return null;
        }
        return C17337b.a(kVar, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, TextStyle textStyle2, float f10) {
        return new TextStyle(n.c(textStyle.getSpanStyle(), textStyle2.getSpanStyle(), f10), androidx.compose.ui.text.o.b(textStyle.getParagraphStyle(), textStyle2.getParagraphStyle(), f10));
    }

    public static final TextStyle d(TextStyle textStyle, H1.t tVar) {
        return new TextStyle(n.h(textStyle.y()), androidx.compose.ui.text.o.e(textStyle.v(), tVar), textStyle.getPlatformStyle());
    }

    public static final int e(H1.t tVar, int i10) {
        l.Companion companion = F1.l.INSTANCE;
        if (F1.l.j(i10, companion.a())) {
            int i11 = a.$EnumSwitchMapping$0[tVar.ordinal()];
            if (i11 == 1) {
                return companion.b();
            }
            if (i11 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!F1.l.j(i10, companion.f())) {
            return i10;
        }
        int i12 = a.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i12 == 1) {
            return companion.d();
        }
        if (i12 == 2) {
            return companion.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
