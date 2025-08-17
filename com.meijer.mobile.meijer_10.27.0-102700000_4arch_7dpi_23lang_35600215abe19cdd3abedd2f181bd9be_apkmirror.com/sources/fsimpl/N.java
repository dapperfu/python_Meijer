package fsimpl;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.fullstory.rust.RustInterface;

/* loaded from: classes14.dex */
public class N implements L {

    /* renamed from: a, reason: collision with root package name */
    private final G f131408a;

    /* renamed from: b, reason: collision with root package name */
    private final C14123u f131409b;

    /* renamed from: c, reason: collision with root package name */
    private final RustInterface f131410c;

    public N(RustInterface rustInterface, G g10, C14123u c14123u) {
        this.f131410c = rustInterface;
        this.f131408a = g10;
        this.f131409b = c14123u;
    }

    private boolean a(float f10, float f11) {
        C14123u c14123u = this.f131409b;
        return c14123u == null || !c14123u.a((int) f10, (int) f11);
    }

    @Override // fsimpl.L
    public void a() {
        this.f131410c.g();
    }

    @Override // fsimpl.L
    public boolean a(KeyEvent keyEvent, boolean z10, Window window, Window.Callback callback) {
        boolean zSuperDispatchKeyShortcutEvent = callback == null ? z10 ? window.superDispatchKeyShortcutEvent(keyEvent) : window.superDispatchKeyEvent(keyEvent) : z10 ? callback.dispatchKeyShortcutEvent(keyEvent) : callback.dispatchKeyEvent(keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 || keyCode == 82 || keyCode == 84 || keyCode == 24 || keyCode == 25 || keyCode == 164) {
            this.f131410c.a(keyCode, keyEvent.getAction());
        }
        return zSuperDispatchKeyShortcutEvent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // fsimpl.L
    public boolean a(MotionEvent motionEvent, M m10, Window window, Window.Callback callback) throws IllegalAccessException, IllegalArgumentException {
        int i10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        boolean zA = this.f131408a.a(motionEvent, m10, window, callback, actionMasked);
        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
        int i12 = 0;
        if (viewPeekDecorView != null) {
            int[] iArr = new int[2];
            viewPeekDecorView.getLocationOnScreen(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        switch (actionMasked) {
            case 0:
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                float x10 = i10 + motionEvent.getX(actionIndex);
                float y10 = i11 + motionEvent.getY(actionIndex);
                if (a(x10, y10)) {
                    this.f131410c.a(pointerId, x10, y10);
                }
                return zA;
            case 1:
            case 3:
                while (i12 < motionEvent.getPointerCount()) {
                    int pointerId2 = motionEvent.getPointerId(i12);
                    float x11 = i10 + motionEvent.getX(i12);
                    float y11 = i11 + motionEvent.getY(i12);
                    if (a(x11, y11)) {
                        this.f131410c.a(pointerId2, x11, y11);
                    }
                    i12++;
                }
                this.f131410c.g();
                return zA;
            case 2:
                while (i12 < motionEvent.getPointerCount()) {
                    int pointerId3 = motionEvent.getPointerId(i12);
                    float x12 = i10 + motionEvent.getX(i12);
                    float y12 = i11 + motionEvent.getY(i12);
                    if (a(x12, y12)) {
                        this.f131410c.a(pointerId3, x12, y12);
                    }
                    i12++;
                }
                return zA;
            case 4:
            default:
                return zA;
            case 6:
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId4 = motionEvent.getPointerId(actionIndex2);
                float x13 = i10 + motionEvent.getX(actionIndex2);
                float y13 = i11 + motionEvent.getY(actionIndex2);
                if (a(x13, y13)) {
                    this.f131410c.b(pointerId4, x13, y13);
                } else {
                    this.f131410c.b(pointerId4);
                }
                return zA;
        }
    }

    public void b() {
        aA.a(this);
    }

    public void c() {
        aA.a((L) null);
    }
}
