package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.focus.w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/viewinterop/h;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/focus/w;", "<init>", "()V", "Landroidx/compose/ui/focus/u;", "focusProperties", "", "j1", "(Landroidx/compose/ui/focus/u;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends Modifier.c implements w {
    @Override // androidx.compose.ui.focus.w
    public void j1(u focusProperties) {
        boolean z10;
        if (getNode().getIsAttached() && f.g(this).hasFocusable()) {
            z10 = true;
        } else {
            z10 = false;
        }
        focusProperties.g(z10);
    }
}
