package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import j2.C14924d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class V {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f55176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f55177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f55178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f55179d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f55180e;

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f55176a; i10++) {
                ViewCompat.G0((View) this.f55177b.get(i10), (String) this.f55178c.get(i10));
                ViewCompat.G0((View) this.f55179d.get(i10), (String) this.f55180e.get(i10));
            }
        }

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f55176a = i10;
            this.f55177b = arrayList;
            this.f55178c = arrayList2;
            this.f55179d = arrayList3;
            this.f55180e = arrayList4;
        }
    }

    private static boolean i(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public boolean m() {
        if (!FragmentManager.isLoggingEnabled(4)) {
            return false;
        }
        FS.log_i(FragmentManager.TAG, "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public void t(Object obj, float f10) {
    }

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, C14924d c14924d, Runnable runnable) {
        x(fragment, obj, c14924d, null, runnable);
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    ArrayList<String> q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(ViewCompat.I(view));
            ViewCompat.G0(view, null);
        }
        return arrayList2;
    }

    protected static void f(List<View> list, View view) {
        int size = list.size();
        if (!i(list, view, size)) {
            if (ViewCompat.I(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!i(list, childAt, size) && ViewCompat.I(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public void x(Fragment fragment, Object obj, C14924d c14924d, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String strI = ViewCompat.I(view2);
            arrayList4.add(strI);
            if (strI != null) {
                ViewCompat.G0(view2, null);
                String str = map.get(strI);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        ViewCompat.G0(arrayList2.get(i11), strI);
                        break;
                    }
                    i11++;
                }
            }
        }
        p2.J.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }
}
