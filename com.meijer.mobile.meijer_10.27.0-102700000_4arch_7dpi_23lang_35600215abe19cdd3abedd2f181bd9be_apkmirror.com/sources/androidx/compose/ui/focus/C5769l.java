package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.C5768k;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/f;", "d", "(I)Landroidx/compose/ui/focus/f;", "c", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "LH1/t;", "e", "(I)LH1/t;", "Landroid/view/View;", "view", "Landroidx/compose/ui/geometry/Rect;", "a", "(Landroid/view/View;Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5769l {
    public static final C5763f d(int i10) {
        if (i10 == 1) {
            return C5763f.i(C5763f.INSTANCE.f());
        }
        if (i10 == 2) {
            return C5763f.i(C5763f.INSTANCE.e());
        }
        if (i10 == 17) {
            return C5763f.i(C5763f.INSTANCE.d());
        }
        if (i10 == 33) {
            return C5763f.i(C5763f.INSTANCE.h());
        }
        if (i10 == 66) {
            return C5763f.i(C5763f.INSTANCE.g());
        }
        if (i10 != 130) {
            return null;
        }
        return C5763f.i(C5763f.INSTANCE.a());
    }

    public static final Rect a(View view, View view2) {
        C5768k.Companion companion = C5768k.INSTANCE;
        view.getLocationInWindow(companion.a());
        int i10 = companion.a()[0];
        int i11 = companion.a()[1];
        view2.getLocationInWindow(companion.a());
        float f10 = i10 - companion.a()[0];
        float f11 = i11 - companion.a()[1];
        return new Rect(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean b(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        C5763f.Companion companion = C5763f.INSTANCE;
        if (C5763f.l(i10, companion.h())) {
            return 33;
        }
        if (C5763f.l(i10, companion.a())) {
            return 130;
        }
        if (C5763f.l(i10, companion.d())) {
            return 17;
        }
        if (C5763f.l(i10, companion.g())) {
            return 66;
        }
        if (C5763f.l(i10, companion.e())) {
            return 2;
        }
        return C5763f.l(i10, companion.f()) ? 1 : null;
    }

    public static final H1.t e(int i10) {
        if (i10 == 0) {
            return H1.t.f12006a;
        }
        if (i10 != 1) {
            return null;
        }
        return H1.t.f12007b;
    }
}
