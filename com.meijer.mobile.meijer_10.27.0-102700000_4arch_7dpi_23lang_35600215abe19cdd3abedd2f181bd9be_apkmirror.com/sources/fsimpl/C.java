package fsimpl;

import android.app.Activity;
import android.content.ComponentName;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes14.dex */
public class C extends Activity implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final D f131369a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f131370b;

    public C(D d10, Activity activity) {
        this.f131369a = d10;
        this.f131370b = activity;
        super.attachBaseContext(activity);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f131369a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f131369a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f131369a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f131369a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f131369a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f131369a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.app.Activity
    public ComponentName getComponentName() {
        return this.f131370b.getComponentName();
    }

    @Override // android.app.Activity
    public String getLocalClassName() {
        return this.f131370b.getLocalClassName();
    }

    @Override // android.app.Activity
    public Window getWindow() {
        return this.f131370b.getWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f131369a.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f131369a.onActionModeStarted(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f131369a.onAttachedToWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        this.f131369a.onContentChanged();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f131369a.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.f131369a.onCreatePanelView(i10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f131369a.onDetachedFromWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f131369a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f131369a.onMenuOpened(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f131369a.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f131369a.onPreparePanel(i10, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f131369a.onSearchRequested();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f131369a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.f131369a.onWindowFocusChanged(z10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f131369a.onWindowStartingActionMode(callback);
    }
}
