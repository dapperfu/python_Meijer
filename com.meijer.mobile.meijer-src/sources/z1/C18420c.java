package z1;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz1/c;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lu1/v;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lu1/v;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C18420c {

    /* renamed from: a, reason: collision with root package name */
    public static final C18420c f172245a = new C18420c();

    private C18420c() {
    }

    @JvmStatic
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds) {
        int iR;
        int iR2;
        if (!innerTextFieldBounds.q() && (iR = textLayoutResult.r(innerTextFieldBounds.getTop())) <= (iR2 = textLayoutResult.r(innerTextFieldBounds.i()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.s(iR), textLayoutResult.v(iR), textLayoutResult.t(iR), textLayoutResult.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
