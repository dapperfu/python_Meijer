package u0;

import V0.w1;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu0/m;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/geometry/Rect;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17321m {

    /* renamed from: a, reason: collision with root package name */
    public static final C17321m f163557a = new C17321m();

    private C17321m() {
    }

    @JvmStatic
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, Rect decorationBoxBounds) {
        return builder.setEditorBoundsInfo(C17320l.a().setEditorBounds(w1.c(decorationBoxBounds)).setHandwritingBounds(w1.c(decorationBoxBounds)).build());
    }
}
