package M8;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class h implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final Window.Callback f19695a;

    /* renamed from: b, reason: collision with root package name */
    private final i f19696b;

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f19695a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f19695a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f19695a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Iterator<c> it = this.f19696b.a().iterator();
        while (it.hasNext()) {
            it.next().a(keyEvent);
        }
        return this.f19695a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f19695a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f19695a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<d> it = this.f19696b.b().iterator();
        while (it.hasNext()) {
            it.next().a(motionEvent);
        }
        return this.f19695a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f19695a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f19695a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f19695a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f19695a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f19695a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f19695a.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f19695a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f19695a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f19695a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f19695a.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f19695a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    @TargetApi(26)
    public void onPointerCaptureChanged(boolean z10) {
        this.f19695a.onPointerCaptureChanged(z10);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f19695a.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    @TargetApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f19695a.onProvideKeyboardShortcuts(list, menu, i10);
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f19695a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f19695a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f19695a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f19695a.onWindowStartingActionMode(callback, i10);
    }

    public h(Window.Callback callback, i iVar) {
        this.f19695a = callback;
        this.f19696b = iVar;
    }
}
