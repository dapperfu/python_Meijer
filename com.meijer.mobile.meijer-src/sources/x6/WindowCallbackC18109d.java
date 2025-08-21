package x6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
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
import com.medallia.digital.mobilesdk.l3;
import java.util.Observable;

/* renamed from: x6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class WindowCallbackC18109d extends Observable implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    private static final HandlerThread f170515b = new HandlerThread("CYFTouchManager");

    /* renamed from: c, reason: collision with root package name */
    private static boolean f170516c = false;

    /* renamed from: a, reason: collision with root package name */
    private final Window.Callback f170517a;

    /* renamed from: x6.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MotionEvent f170518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f170519b;

        @Override // java.lang.Runnable
        public final void run() {
            C18127w.f170600d = 1;
            C18127w.f170601e = 1;
            WindowCallbackC18109d.this.setChanged();
            WindowCallbackC18109d windowCallbackC18109d = WindowCallbackC18109d.this;
            MotionEvent motionEvent = this.f170518a;
            int i10 = this.f170519b;
            windowCallbackC18109d.notifyObservers(new C18111f(motionEvent, i10 != 1 ? 0 : 1, i10));
        }

        a(MotionEvent motionEvent, int i10) {
            this.f170518a = motionEvent;
            this.f170519b = i10;
        }
    }

    static void a() {
        f170516c = true;
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f170517a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f170517a.onWindowStartingActionMode(callback, i10);
    }

    private void b(MotionEvent motionEvent, int i10) {
        try {
            if (f170516c) {
                HandlerThread handlerThread = f170515b;
                if (handlerThread.isAlive()) {
                    new Handler(handlerThread.getLooper()).post(new a(motionEvent, i10));
                    return;
                }
            }
            int i11 = 1;
            C18127w.f170600d = 1;
            C18127w.f170601e = 1;
            setChanged();
            if (i10 != 1) {
                i11 = 0;
            }
            notifyObservers(new C18111f(motionEvent, i11, i10));
        } catch (Exception e10) {
            C18095A.a(e10);
        }
    }

    static boolean d() {
        return f170516c;
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f170517a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f170517a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f170517a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f170517a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f170517a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f170517a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f170517a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f170517a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f170517a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f170517a.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f170517a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f170517a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f170517a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f170517a.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        this.f170517a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f170517a.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f170517a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f170517a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f170517a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f170517a.onWindowStartingActionMode(callback);
    }

    WindowCallbackC18109d(Window.Callback callback) {
        this.f170517a = callback;
        if (f170516c) {
            HandlerThread handlerThread = f170515b;
            if (!handlerThread.isAlive()) {
                handlerThread.start();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & l3.f93323c;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action != 6) {
                            return this.f170517a.dispatchTouchEvent(motionEvent);
                        }
                        b(motionEventObtain, 3);
                        return this.f170517a.dispatchTouchEvent(motionEvent);
                    }
                    b(motionEventObtain, 2);
                    return this.f170517a.dispatchTouchEvent(motionEvent);
                }
                b(motionEventObtain, 1);
                return this.f170517a.dispatchTouchEvent(motionEvent);
            }
            b(motionEventObtain, 3);
            return this.f170517a.dispatchTouchEvent(motionEvent);
        }
        b(motionEventObtain, 2);
        return this.f170517a.dispatchTouchEvent(motionEvent);
    }
}
