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

/* loaded from: classes15.dex */
public class C extends Activity implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f132620a;
    public final D callback;

    public C(D d10, Activity activity) {
        this.callback = d10;
        this.f132620a = activity;
        super.attachBaseContext(activity);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.app.Activity
    public ComponentName getComponentName() {
        return this.f132620a.getComponentName();
    }

    @Override // android.app.Activity
    public String getLocalClassName() {
        return this.f132620a.getLocalClassName();
    }

    public Window.Callback getOriginalCallback() {
        return this.callback.getOriginalCallback();
    }

    @Override // android.app.Activity
    public Window getWindow() {
        return this.f132620a.getWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.callback.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.callback.onActionModeStarted(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.callback.onAttachedToWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        this.callback.onContentChanged();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.callback.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        return this.callback.onCreatePanelView(i10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.callback.onDetachedFromWindow();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.callback.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.callback.onMenuOpened(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.callback.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.callback.onPreparePanel(i10, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.callback.onSearchRequested();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.callback.onWindowFocusChanged(z10);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.callback.onWindowStartingActionMode(callback);
    }
}
