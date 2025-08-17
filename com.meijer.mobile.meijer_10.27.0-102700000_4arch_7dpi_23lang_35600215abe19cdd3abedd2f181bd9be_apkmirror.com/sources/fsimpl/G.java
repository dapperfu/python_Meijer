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

/* loaded from: classes14.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f131385a = new String();

    /* renamed from: b, reason: collision with root package name */
    private final C14013ck f131386b;

    /* renamed from: c, reason: collision with root package name */
    private final C14060ee f131387c;

    /* renamed from: d, reason: collision with root package name */
    private final C14124v f131388d;

    /* renamed from: e, reason: collision with root package name */
    private final C14115m f131389e;

    /* renamed from: f, reason: collision with root package name */
    private final RustInterface f131390f;

    /* renamed from: g, reason: collision with root package name */
    private final List f131391g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f131392h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final Set f131393i = new HashSet();

    public G(C14013ck c14013ck, C14115m c14115m, RustInterface rustInterface, C14060ee c14060ee, C14124v c14124v) {
        this.f131386b = c14013ck;
        this.f131389e = c14115m;
        this.f131390f = rustInterface;
        this.f131387c = c14060ee;
        this.f131388d = c14124v;
    }

    private String a(FSComposeLayoutNode fSComposeLayoutNode) {
        if (this.f131388d.e(fSComposeLayoutNode).b()) {
            return C13974az.a(fSComposeLayoutNode, this.f131387c.a((Object) fSComposeLayoutNode), this.f131386b);
        }
        return null;
    }

    private String a(Object obj) {
        String strE = obj instanceof View ? e((View) obj) : obj instanceof FSComposeLayoutNode ? a((FSComposeLayoutNode) obj) : null;
        if (strE == f131385a) {
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
        this.f131389e.b(view);
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
        if (this.f131388d.b(obj)) {
            Log.d("Omitting " + i10 + " event of blocked " + Long.toHexString(jC) + " (" + obj.getClass() + ")");
            return;
        }
        this.f131390f.a(s10, jC, a(obj));
        boolean z10 = s10 == 2 || s10 == 3 || s10 == 4 || s10 == 5;
        if (this.f131388d.c(obj) && z10) {
            this.f131390f.a((short) 1, jC);
        }
    }

    private boolean a(MotionEvent motionEvent, M m10, Window.Callback callback, Window window) {
        boolean zDispatchGenericMotionEvent;
        if (callback == null) {
            switch (H.f131394a[m10.ordinal()]) {
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
        switch (H.f131394a[m10.ordinal()]) {
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
            this.f131389e.a(window.peekDecorView());
            return a(motionEvent, m10, callback, window);
        }
        a(window.peekDecorView(), this.f131391g, this.f131392h);
        boolean zA = a(motionEvent, m10, callback, window);
        if (z10) {
            for (View view : this.f131392h) {
                if (view.isPressed()) {
                    a(view, I.DOWN);
                    return zA;
                }
            }
        }
        if (z11) {
            for (View view2 : this.f131391g) {
                if (!view2.isPressed()) {
                    this.f131393i.add(view2.getParent());
                }
            }
            for (View view3 : this.f131391g) {
                if (!view3.isPressed() && !this.f131393i.contains(view3)) {
                    Log.d("Detected up touch: " + view3);
                    b(view3, I.UP);
                    return zA;
                }
            }
            Iterator it = this.f131392h.iterator();
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
            return (!this.f131388d.e(view).b() || (text = ((TextView) view).getText()) == null) ? f131385a : text.toString();
        }
        if (!(view instanceof ViewGroup) || !C13993br.e(view)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!this.f131388d.b(childAt) && (strE = e(childAt)) != null) {
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
        this.f131389e.a(this);
    }

    public void a(View view) {
        c(view, I.TIMER);
    }

    public void a(FSComposeLayoutNode fSComposeLayoutNode, boolean z10) {
        a(fSComposeLayoutNode, I.TIMER, z10);
    }

    public boolean a(MotionEvent motionEvent, M m10, Window window, Window.Callback callback, int i10) throws IllegalAccessException, IllegalArgumentException {
        this.f131391g.clear();
        this.f131392h.clear();
        this.f131393i.clear();
        boolean zB = b(motionEvent, m10, window, callback, i10);
        this.f131391g.clear();
        this.f131392h.clear();
        this.f131393i.clear();
        return zB;
    }

    public void b() {
        this.f131389e.a((G) null);
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
