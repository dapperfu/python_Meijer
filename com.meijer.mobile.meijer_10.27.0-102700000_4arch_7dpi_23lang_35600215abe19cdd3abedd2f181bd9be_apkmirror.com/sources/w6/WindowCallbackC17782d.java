package w6;

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

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class WindowCallbackC17782d extends Observable implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    private static final HandlerThread f165870b = new HandlerThread("CYFTouchManager");

    /* renamed from: c, reason: collision with root package name */
    private static boolean f165871c = false;

    /* renamed from: a, reason: collision with root package name */
    private final Window.Callback f165872a;

    /* renamed from: w6.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MotionEvent f165873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f165874b;

        @Override // java.lang.Runnable
        public final void run() {
            C17800w.f165955d = 1;
            C17800w.f165956e = 1;
            WindowCallbackC17782d.this.setChanged();
            WindowCallbackC17782d windowCallbackC17782d = WindowCallbackC17782d.this;
            MotionEvent motionEvent = this.f165873a;
            int i10 = this.f165874b;
            windowCallbackC17782d.notifyObservers(new C17784f(motionEvent, i10 != 1 ? 0 : 1, i10));
        }

        a(MotionEvent motionEvent, int i10) {
            this.f165873a = motionEvent;
            this.f165874b = i10;
        }
    }

    static void a() {
        f165871c = true;
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f165872a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f165872a.onWindowStartingActionMode(callback, i10);
    }

    private void b(MotionEvent motionEvent, int i10) {
        try {
            if (f165871c) {
                HandlerThread handlerThread = f165870b;
                if (handlerThread.isAlive()) {
                    new Handler(handlerThread.getLooper()).post(new a(motionEvent, i10));
                    return;
                }
            }
            int i11 = 1;
            C17800w.f165955d = 1;
            C17800w.f165956e = 1;
            setChanged();
            if (i10 != 1) {
                i11 = 0;
            }
            notifyObservers(new C17784f(motionEvent, i11, i10));
        } catch (Exception e10) {
            C17774A.a(e10);
        }
    }

    static boolean d() {
        return f165871c;
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f165872a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f165872a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f165872a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f165872a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f165872a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f165872a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f165872a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f165872a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f165872a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f165872a.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f165872a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f165872a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f165872a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f165872a.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        this.f165872a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f165872a.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f165872a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f165872a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f165872a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f165872a.onWindowStartingActionMode(callback);
    }

    WindowCallbackC17782d(Window.Callback callback) {
        this.f165872a = callback;
        if (f165871c) {
            HandlerThread handlerThread = f165870b;
            if (!handlerThread.isAlive()) {
                handlerThread.start();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & l3.f92484c;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action != 6) {
                            return this.f165872a.dispatchTouchEvent(motionEvent);
                        }
                        b(motionEventObtain, 3);
                        return this.f165872a.dispatchTouchEvent(motionEvent);
                    }
                    b(motionEventObtain, 2);
                    return this.f165872a.dispatchTouchEvent(motionEvent);
                }
                b(motionEventObtain, 1);
                return this.f165872a.dispatchTouchEvent(motionEvent);
            }
            b(motionEventObtain, 3);
            return this.f165872a.dispatchTouchEvent(motionEvent);
        }
        b(motionEventObtain, 2);
        return this.f165872a.dispatchTouchEvent(motionEvent);
    }
}
