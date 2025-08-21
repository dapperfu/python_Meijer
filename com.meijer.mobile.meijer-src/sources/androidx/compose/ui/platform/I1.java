package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/I1;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "a", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I1 f52046a = new I1();

    private I1() {
    }

    public final ActionMode a(View view, ActionMode.Callback actionModeCallback, int type) {
        return view.startActionMode(actionModeCallback, type);
    }
}
