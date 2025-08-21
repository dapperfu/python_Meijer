package m1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm1/a;", "Landroid/view/ActionMode$Callback2;", "Lm1/c;", "callback", "<init>", "(Lm1/c;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", "menu", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "a", "Lm1/c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15652a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15654c callback;

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return this.callback.d(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return this.callback.e(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
        this.callback.f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode mode, View view, Rect outRect) {
        androidx.compose.ui.geometry.Rect rect = this.callback.getRect();
        if (outRect != null) {
            outRect.set((int) rect.getLeft(), (int) rect.getTop(), (int) rect.l(), (int) rect.i());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return this.callback.g(mode, menu);
    }

    public C15652a(C15654c c15654c) {
        this.callback = c15654c;
    }
}
