package fsimpl;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class D implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f131371a;

    /* renamed from: b, reason: collision with root package name */
    private final Window.Callback f131372b;

    D(Window window, Window.Callback callback) {
        this.f131371a = new WeakReference(window);
        this.f131372b = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        L lA;
        Window window = (Window) this.f131371a.get();
        if (window != null && (lA = aA.a()) != null) {
            return lA.a(motionEvent, M.MOTION, window, this.f131372b);
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        L lA;
        Window window = (Window) this.f131371a.get();
        if (window != null && (lA = aA.a()) != null) {
            return lA.a(keyEvent, false, window, this.f131372b);
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        L lA;
        Window window = (Window) this.f131371a.get();
        if (window != null && (lA = aA.a()) != null) {
            return lA.a(keyEvent, true, window, this.f131372b);
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchKeyShortcutEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        L lA;
        Window window = (Window) this.f131371a.get();
        if (window != null && (lA = aA.a()) != null) {
            return lA.a(motionEvent, M.TOUCH, window, this.f131372b);
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        L lA;
        Window window = (Window) this.f131371a.get();
        if (window != null && (lA = aA.a()) != null) {
            return lA.a(motionEvent, M.TRACKBALL, window, this.f131372b);
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.dispatchTrackballEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onCreatePanelView(i10);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        L lA = aA.a();
        if (lA != null) {
            lA.a();
        }
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onMenuItemSelected(i10, menuItem);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onMenuOpened(i10, menu);
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onPanelClosed(i10, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onPreparePanel(i10, view, menu);
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onSearchRequested();
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            return callback.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        Window.Callback callback = this.f131372b;
        if (callback != null) {
            callback.onWindowFocusChanged(z10);
        }
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f131372b;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        Window.Callback callback2 = this.f131372b;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback, i10);
        }
        return null;
    }
}
