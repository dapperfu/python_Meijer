package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.core.view.i;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p2.C16203c;
import p2.C16218j0;
import p2.G;
import p2.H;
import p2.I;
import p2.K;
import q2.InterfaceC16438B;
import q2.y;
import t2.C17057b;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ViewCompat {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, androidx.core.view.h> f53895a;

    /* renamed from: b, reason: collision with root package name */
    private static Field f53896b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f53897c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f53898d = {Y1.e.f39992b, Y1.e.f39993c, Y1.e.f40004n, Y1.e.f40015y, Y1.e.f39972B, Y1.e.f39973C, Y1.e.f39974D, Y1.e.f39975E, Y1.e.f39976F, Y1.e.f39977G, Y1.e.f39994d, Y1.e.f39995e, Y1.e.f39996f, Y1.e.f39997g, Y1.e.f39998h, Y1.e.f39999i, Y1.e.f40000j, Y1.e.f40001k, Y1.e.f40002l, Y1.e.f40003m, Y1.e.f40005o, Y1.e.f40006p, Y1.e.f40007q, Y1.e.f40008r, Y1.e.f40009s, Y1.e.f40010t, Y1.e.f40011u, Y1.e.f40012v, Y1.e.f40013w, Y1.e.f40014x, Y1.e.f40016z, Y1.e.f39971A};

    /* renamed from: e, reason: collision with root package name */
    private static final I f53899e = new I() { // from class: p2.X
        @Override // p2.I
        public final C16203c a(C16203c c16203c) {
            return ViewCompat.a(c16203c);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f53900f = new e();

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f53901a = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        void a(View view) {
            this.f53901a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f53901a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f53901a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            boolean z10;
            int i10;
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            if (key.isShown() && key.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zBooleanValue != z10) {
                if (z10) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                ViewCompat.W(key, i10);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }
    }

    static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f53902a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f53903b;

        /* renamed from: c, reason: collision with root package name */
        private final int f53904c;

        /* renamed from: d, reason: collision with root package name */
        private final int f53905d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t10);

        abstract boolean g(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f53902a = i10;
            this.f53903b = cls;
            this.f53905d = i11;
            this.f53904c = i12;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f53904c;
        }

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t10 = (T) view.getTag(this.f53902a);
            if (this.f53903b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                ViewCompat.k(view);
                view.setTag(this.f53902a, t10);
                ViewCompat.W(view, this.f53905d);
            }
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return androidx.core.view.g.f53929b ? androidx.core.view.g.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            androidx.core.view.j f53906a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f53907b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f53908c;

            a(View view, G g10) {
                this.f53907b = view;
                this.f53908c = g10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                androidx.core.view.j jVarC = androidx.core.view.j.C(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f53907b);
                    if (jVarC.equals(this.f53906a)) {
                        return this.f53908c.onApplyWindowInsets(view, jVarC).A();
                    }
                }
                this.f53906a = jVarC;
                androidx.core.view.j jVarOnApplyWindowInsets = this.f53908c.onApplyWindowInsets(view, jVarC);
                if (i10 >= 30) {
                    return jVarOnApplyWindowInsets.A();
                }
                ViewCompat.j0(view);
                return jVarOnApplyWindowInsets.A();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(Y1.e.f39990T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static void m(View view, G g10) {
            a aVar = g10 != null ? new a(view, g10) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(Y1.e.f39983M, aVar);
            }
            if (view.getTag(Y1.e.f39982L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(Y1.e.f39990T));
            }
        }

        static androidx.core.view.j b(View view, androidx.core.view.j jVar, Rect rect) {
            WindowInsets windowInsetsA = jVar.A();
            if (windowInsetsA != null) {
                return androidx.core.view.j.C(view.computeSystemWindowInsets(windowInsetsA, rect), view);
            }
            rect.setEmpty();
            return jVar;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f10) {
            view.setElevation(f10);
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void p(View view, float f10) {
            view.setZ(f10);
        }

        static void q(View view) {
            view.stopNestedScroll();
        }
    }

    public interface p {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class q {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f53909d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f53910a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f53911b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f53912c = null;

        static q a(View view) {
            q qVar = (q) view.getTag(Y1.e.f39988R);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(Y1.e.f39988R, qVar2);
            return qVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f53910a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f53911b == null) {
                this.f53911b = new SparseArray<>();
            }
            return this.f53911b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(Y1.e.f39989S);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f53910a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f53909d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f53910a == null) {
                        this.f53910a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f53909d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f53910a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f53910a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f53912c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f53912c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        q() {
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            if (viewC != null) {
                return true;
            }
            return false;
        }
    }

    public static /* synthetic */ C16203c a(C16203c c16203c) {
        return c16203c;
    }

    public static C16203c c0(View view, C16203c c16203c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            FS.log_d("ViewCompat", "performReceiveContent: " + c16203c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c16203c);
        }
        H h10 = (H) view.getTag(Y1.e.f39984N);
        if (h10 == null) {
            return v(view).a(c16203c);
        }
        C16203c c16203cA = h10.a(view, c16203c);
        if (c16203cA == null) {
            return null;
        }
        return v(view).a(c16203cA);
    }

    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    private static class i {
        public static androidx.core.view.j a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.j jVarB = androidx.core.view.j.B(rootWindowInsets);
            jVarB.x(jVarB);
            jVarB.d(view.getRootView());
            return jVarB;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return FS.getAccessibilityDelegate(view);
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static androidx.core.view.k c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return androidx.core.view.k.e(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C16203c b(View view, C16203c c16203c) {
            ContentInfo contentInfoF = c16203c.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            if (contentInfoPerformReceiveContent == contentInfoF) {
                return c16203c;
            }
            return C16203c.g(contentInfoPerformReceiveContent);
        }
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(Y1.e.f39985O);
    }

    public static void C0(View view, K k10) {
        j.a(view, (PointerIcon) (k10 != null ? k10.a() : null));
    }

    @Deprecated
    public static androidx.core.view.k K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C16218j0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    private static f<CharSequence> K0() {
        return new c(Y1.e.f39987Q, CharSequence.class, 64, 30);
    }

    private static f<Boolean> b() {
        return new d(Y1.e.f39980J, Boolean.class, 28);
    }

    private static f<CharSequence> b0() {
        return new b(Y1.e.f39981K, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static androidx.core.view.h f(View view) {
        if (f53895a == null) {
            f53895a = new WeakHashMap<>();
        }
        androidx.core.view.h hVar = f53895a.get(view);
        if (hVar != null) {
            return hVar;
        }
        androidx.core.view.h hVar2 = new androidx.core.view.h(view);
        f53895a.put(view, hVar2);
        return hVar2;
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static androidx.core.view.j h(View view, androidx.core.view.j jVar) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsA = jVar.A();
        if (windowInsetsA != null) {
            WindowInsets windowInsetsA2 = i10 >= 30 ? n.a(view, windowInsetsA) : g.a(view, windowInsetsA);
            if (!windowInsetsA2.equals(windowInsetsA)) {
                return androidx.core.view.j.C(windowInsetsA2, view);
            }
        }
        return jVar;
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    public static void i0(View view, y.a aVar, CharSequence charSequence, InterfaceC16438B interfaceC16438B) {
        if (interfaceC16438B == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, interfaceC16438B));
        }
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    public static void k0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> l0() {
        return new a(Y1.e.f39986P, Boolean.class, 28);
    }

    public static void m0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (FS.getAccessibilityDelegate(view) instanceof a.C1096a)) {
            aVar = new androidx.core.view.a();
        }
        x0(view);
        FS.setAccessibilityDelegate(view, aVar == null ? null : aVar.d());
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f53897c) {
            return null;
        }
        if (f53896b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f53896b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f53897c = true;
                return null;
            }
        }
        try {
            Object obj = f53896b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f53897c = true;
            return null;
        }
    }

    private static List<y.a> p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(Y1.e.f39978H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(Y1.e.f39978H, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static I v(View view) {
        return view instanceof I ? (I) view : f53899e;
    }

    @SuppressLint({"InlinedApi"})
    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void y0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, G g10) {
        h.m(view, g10);
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    public static void B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z10) {
        l0().f(view, Boolean.valueOf(z10));
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    @Deprecated
    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view, CharSequence charSequence) {
        K0().f(view, charSequence);
    }

    public static androidx.core.view.j G(View view) {
        return i.a(view);
    }

    public static void G0(View view, String str) {
        h.n(view, str);
    }

    public static CharSequence H(View view) {
        return K0().e(view);
    }

    public static void H0(View view, float f10) {
        h.o(view, f10);
    }

    public static String I(View view) {
        return h.f(view);
    }

    public static void I0(View view, i.b bVar) {
        androidx.core.view.i.d(view, bVar);
    }

    public static float J(View view) {
        return h.g(view);
    }

    public static void J0(View view, float f10) {
        h.p(view, f10);
    }

    @Deprecated
    public static int L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void L0(View view) {
        h.q(view);
    }

    public static float M(View view) {
        return h.h(view);
    }

    public static boolean N(View view) {
        if (FS.getAccessibilityDelegate(view) != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean P(View view) {
        return view.hasTransientState();
    }

    public static boolean Q(View view) {
        Boolean boolE = b().e(view);
        if (boolE != null && boolE.booleanValue()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean S(View view) {
        return view.isLaidOut();
    }

    public static boolean T(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean U(View view) {
        return view.isPaddingRelative();
    }

    public static boolean V(View view) {
        Boolean boolE = l0().e(view);
        if (boolE != null && boolE.booleanValue()) {
            return true;
        }
        return false;
    }

    static void W(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (o(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z10) {
                if (i10 == 32) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.setEventType(32);
                    accessibilityEventObtain.setContentChangeTypes(i10);
                    accessibilityEventObtain.setSource(view);
                    view.onPopulateAccessibilityEvent(accessibilityEventObtain);
                    accessibilityEventObtain.getText().add(o(view));
                    accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        FS.log_e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            if (!z10) {
                i11 = RecyclerView.m.FLAG_MOVED;
            }
            accessibilityEventObtain2.setEventType(i11);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            if (z10) {
                accessibilityEventObtain2.getText().add(o(view));
                x0(view);
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain2);
        }
    }

    public static void X(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Y(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static androidx.core.view.j Z(View view, androidx.core.view.j jVar) {
        WindowInsets windowInsetsA = jVar.A();
        if (windowInsetsA != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsA);
            if (!windowInsetsB.equals(windowInsetsA)) {
                return androidx.core.view.j.C(windowInsetsB, view);
            }
        }
        return jVar;
    }

    @Deprecated
    public static void a0(View view, y yVar) {
        view.onInitializeAccessibilityNodeInfo(yVar.f1());
    }

    public static int c(View view, CharSequence charSequence, InterfaceC16438B interfaceC16438B) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new y.a(iQ, charSequence, interfaceC16438B));
        }
        return iQ;
    }

    private static void d(View view, y.a aVar) {
        k(view);
        h0(aVar.b(), view);
        p(view).add(aVar);
        W(view, 0);
    }

    @Deprecated
    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void e(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        C17057b.b((View) view.getParent(), viewGroup);
    }

    @Deprecated
    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static androidx.core.view.j g(View view, androidx.core.view.j jVar, Rect rect) {
        return h.b(view, jVar, rect);
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        W(view, 0);
    }

    private static void h0(int i10, View view) {
        List<y.a> listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (listP.get(i11).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    public static void j0(View view) {
        g.c(view);
    }

    static void k(View view) {
        androidx.core.view.a aVarM = m(view);
        if (aVarM == null) {
            aVarM = new androidx.core.view.a();
        }
        m0(view, aVarM);
    }

    @Deprecated
    public static int l() {
        return View.generateViewId();
    }

    public static androidx.core.view.a m(View view) {
        View.AccessibilityDelegate accessibilityDelegate = FS.getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            return null;
        }
        if (accessibilityDelegate instanceof a.C1096a) {
            return ((a.C1096a) accessibilityDelegate).f53916a;
        }
        return new androidx.core.view.a(accessibilityDelegate);
    }

    public static void n0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static CharSequence o(View view) {
        return b0().e(view);
    }

    @Deprecated
    public static void o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static void p0(View view, CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f53900f.a(view);
        } else {
            f53900f.d(view);
        }
    }

    private static int q(View view, CharSequence charSequence) {
        boolean z10;
        List<y.a> listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, listP.get(i10).c())) {
                return listP.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f53898d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z11 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                if (listP.get(i14).b() != i13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 &= z10;
            }
            if (z11) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @Deprecated
    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    @Deprecated
    public static void t0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, float f10) {
        h.l(view, f10);
    }

    @Deprecated
    public static void v0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @Deprecated
    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void w0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    @Deprecated
    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    private static void x0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int z(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static void z0(View view, int i10) {
        view.setLabelFor(i10);
    }
}
