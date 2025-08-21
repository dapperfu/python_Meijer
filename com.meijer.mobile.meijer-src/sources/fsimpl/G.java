package fsimpl;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes15.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f132635a = new String();

    /* renamed from: b, reason: collision with root package name */
    private final C14138ck f132636b;

    /* renamed from: c, reason: collision with root package name */
    private final C14185ee f132637c;

    /* renamed from: d, reason: collision with root package name */
    private final C14249v f132638d;

    /* renamed from: e, reason: collision with root package name */
    private final C14240m f132639e;

    /* renamed from: f, reason: collision with root package name */
    private final RustInterface f132640f;

    /* renamed from: g, reason: collision with root package name */
    private final List f132641g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f132642h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final Set f132643i = new HashSet();

    public G(C14138ck c14138ck, C14240m c14240m, RustInterface rustInterface, C14185ee c14185ee, C14249v c14249v) {
        this.f132636b = c14138ck;
        this.f132639e = c14240m;
        this.f132640f = rustInterface;
        this.f132637c = c14185ee;
        this.f132638d = c14249v;
    }

    private String a(FSComposeLayoutNode fSComposeLayoutNode) {
        if (this.f132638d.e(fSComposeLayoutNode).b()) {
            return C14099az.a(fSComposeLayoutNode, this.f132637c.a((Object) fSComposeLayoutNode), this.f132636b);
        }
        return null;
    }

    private String a(Object obj) {
        String strE = obj instanceof View ? e((View) obj) : obj instanceof FSComposeLayoutNode ? a((FSComposeLayoutNode) obj) : null;
        if (strE == f132635a) {
            return null;
        }
        return strE;
    }

    private void a(View view, I i10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.isPressed() && childAt.getVisibility() == 0) {
                    a(childAt, i10);
                    return;
                }
            }
        }
        a(view, i10, (short) 0);
    }

    private void a(View view, I i10, short s10) {
        if (view == null) {
            Log.e("Unexpectedly captured a null view in " + i10);
        } else {
            a((Object) view, i10, s10);
        }
    }

    private void a(View view, List list, List list2) throws IllegalAccessException, IllegalArgumentException {
        if (view == null) {
            return;
        }
        this.f132639e.b(view);
        if (view.isPressed()) {
            list.add(view);
        } else {
            list2.add(view);
        }
        if (view instanceof ViewGroup) {
            a((ViewGroup) view, list, list2);
        }
    }

    private void a(ViewGroup viewGroup, List list, List list2) throws IllegalAccessException, IllegalArgumentException {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            a(viewGroup.getChildAt(i10), list, list2);
        }
    }

    private void a(FSComposeLayoutNode fSComposeLayoutNode, I i10, boolean z10) {
        a(fSComposeLayoutNode, i10, z10 ? (short) 3 : (short) 2);
    }

    private void a(Object obj, I i10, short s10) {
        long jC = gd.c(obj);
        if (this.f132638d.b(obj)) {
            Log.d("Omitting " + i10 + " event of blocked " + Long.toHexString(jC) + " (" + obj.getClass() + ")");
            return;
        }
        this.f132640f.a(s10, jC, a(obj));
        boolean z10 = s10 == 2 || s10 == 3 || s10 == 4 || s10 == 5;
        if (this.f132638d.c(obj) && z10) {
            this.f132640f.a((short) 1, jC);
        }
    }

    private boolean a(MotionEvent motionEvent, M m10, Window.Callback callback, Window window) {
        boolean zDispatchGenericMotionEvent;
        if (callback == null) {
            switch (H.f132644a[m10.ordinal()]) {
                case 1:
                    return window.superDispatchGenericMotionEvent(motionEvent);
                case 2:
                    return window.superDispatchTouchEvent(motionEvent);
                case 3:
                    return window.superDispatchTrackballEvent(motionEvent);
                default:
                    return false;
            }
        }
        switch (H.f132644a[m10.ordinal()]) {
            case 1:
                zDispatchGenericMotionEvent = callback.dispatchGenericMotionEvent(motionEvent);
                break;
            case 2:
                zDispatchGenericMotionEvent = callback.dispatchTouchEvent(motionEvent);
                break;
            case 3:
                zDispatchGenericMotionEvent = callback.dispatchTrackballEvent(motionEvent);
                break;
            default:
                return false;
        }
        return zDispatchGenericMotionEvent;
    }

    private void b(View view, I i10) {
        a(view, i10, (short) 1);
    }

    private boolean b(MotionEvent motionEvent, M m10, Window window, Window.Callback callback, int i10) throws IllegalAccessException, IllegalArgumentException {
        boolean z10 = i10 == 0 || i10 == 5;
        boolean z11 = i10 == 1 || i10 == 6;
        if (!z10 && !z11) {
            this.f132639e.a(window.peekDecorView());
            return a(motionEvent, m10, callback, window);
        }
        a(window.peekDecorView(), this.f132641g, this.f132642h);
        boolean zA = a(motionEvent, m10, callback, window);
        if (z10) {
            for (View view : this.f132642h) {
                if (view.isPressed()) {
                    a(view, I.DOWN);
                    return zA;
                }
            }
        }
        if (z11) {
            for (View view2 : this.f132641g) {
                if (!view2.isPressed()) {
                    this.f132643i.add(view2.getParent());
                }
            }
            for (View view3 : this.f132641g) {
                if (!view3.isPressed() && !this.f132643i.contains(view3)) {
                    Log.d("Detected up touch: " + view3);
                    b(view3, I.UP);
                    return zA;
                }
            }
            Iterator it = this.f132642h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view4 = (View) it.next();
                if (view4.isPressed()) {
                    a(view4, I.UP);
                    b(view4, I.UP);
                    break;
                }
            }
        }
        return zA;
    }

    private void c(View view, I i10) {
        a(view, i10, (short) 2);
    }

    private void d(View view, I i10) {
        a(view, i10, (short) 4);
    }

    private String e(View view) {
        String strE;
        CharSequence text;
        if (view instanceof TextView) {
            return (!this.f132638d.e(view).b() || (text = ((TextView) view).getText()) == null) ? f132635a : text.toString();
        }
        if (!(view instanceof ViewGroup) || !C14118br.e(view)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!this.f132638d.b(childAt) && (strE = e(childAt)) != null) {
                return strE;
            }
        }
        return null;
    }

    private void e(View view, I i10) {
        a(view, i10, (short) 3);
    }

    private void f(View view, I i10) {
        a(view, i10, (short) 5);
    }

    public void a() {
        this.f132639e.a(this);
    }

    public void a(View view) {
        c(view, I.TIMER);
    }

    public void a(FSComposeLayoutNode fSComposeLayoutNode, boolean z10) {
        a(fSComposeLayoutNode, I.TIMER, z10);
    }

    public boolean a(MotionEvent motionEvent, M m10, Window window, Window.Callback callback, int i10) throws IllegalAccessException, IllegalArgumentException {
        this.f132641g.clear();
        this.f132642h.clear();
        this.f132643i.clear();
        boolean zB = b(motionEvent, m10, window, callback, i10);
        this.f132641g.clear();
        this.f132642h.clear();
        this.f132643i.clear();
        return zB;
    }

    public void b() {
        this.f132639e.a((G) null);
    }

    public void b(View view) {
        d(view, I.TIMER);
    }

    public void c(View view) {
        e(view, I.TIMER);
    }

    public void d(View view) {
        f(view, I.TIMER);
    }
}
