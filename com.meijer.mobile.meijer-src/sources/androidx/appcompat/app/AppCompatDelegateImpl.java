package androidx.appcompat.app;

import Z.n0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C5771e;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC5784s;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.X;
import androidx.appcompat.widget.Y;
import androidx.core.view.ViewCompat;
import androidx.core.view.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6172s;
import b2.C6327h;
import com.fullstory.FS;
import i.C14578a;
import i.C14580c;
import i.C14583f;
import i.C14584g;
import i.C14586i;
import i.C14587j;
import j.C14879a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p2.C16359h0;
import p2.C16379s;
import p2.G;

/* loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.f implements f.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    private static final n0<String, Integer> f46061j0 = new n0<>();

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f46062k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    private static final int[] f46063l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    private static final boolean f46064m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    private boolean f46065A;

    /* renamed from: B, reason: collision with root package name */
    ViewGroup f46066B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f46067C;

    /* renamed from: D, reason: collision with root package name */
    private View f46068D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f46069E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f46070F;

    /* renamed from: G, reason: collision with root package name */
    boolean f46071G;

    /* renamed from: H, reason: collision with root package name */
    boolean f46072H;

    /* renamed from: I, reason: collision with root package name */
    boolean f46073I;

    /* renamed from: J, reason: collision with root package name */
    boolean f46074J;

    /* renamed from: K, reason: collision with root package name */
    boolean f46075K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f46076L;

    /* renamed from: M, reason: collision with root package name */
    private r[] f46077M;

    /* renamed from: N, reason: collision with root package name */
    private r f46078N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f46079O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f46080P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f46081Q;

    /* renamed from: R, reason: collision with root package name */
    boolean f46082R;

    /* renamed from: S, reason: collision with root package name */
    private Configuration f46083S;

    /* renamed from: T, reason: collision with root package name */
    private int f46084T;

    /* renamed from: U, reason: collision with root package name */
    private int f46085U;

    /* renamed from: V, reason: collision with root package name */
    private int f46086V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f46087W;

    /* renamed from: X, reason: collision with root package name */
    private p f46088X;

    /* renamed from: Y, reason: collision with root package name */
    private p f46089Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f46090Z;

    /* renamed from: a0, reason: collision with root package name */
    int f46091a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f46092b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f46093c0;

    /* renamed from: d0, reason: collision with root package name */
    private Rect f46094d0;

    /* renamed from: e0, reason: collision with root package name */
    private Rect f46095e0;

    /* renamed from: f0, reason: collision with root package name */
    private androidx.appcompat.app.r f46096f0;

    /* renamed from: g0, reason: collision with root package name */
    private t f46097g0;

    /* renamed from: h0, reason: collision with root package name */
    private OnBackInvokedDispatcher f46098h0;

    /* renamed from: i0, reason: collision with root package name */
    private OnBackInvokedCallback f46099i0;

    /* renamed from: j, reason: collision with root package name */
    final Object f46100j;

    /* renamed from: k, reason: collision with root package name */
    final Context f46101k;

    /* renamed from: l, reason: collision with root package name */
    Window f46102l;

    /* renamed from: m, reason: collision with root package name */
    private n f46103m;

    /* renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.d f46104n;

    /* renamed from: o, reason: collision with root package name */
    androidx.appcompat.app.a f46105o;

    /* renamed from: p, reason: collision with root package name */
    MenuInflater f46106p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f46107q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC5784s f46108r;

    /* renamed from: s, reason: collision with root package name */
    private h f46109s;

    /* renamed from: t, reason: collision with root package name */
    private s f46110t;

    /* renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f46111u;

    /* renamed from: v, reason: collision with root package name */
    ActionBarContextView f46112v;

    /* renamed from: w, reason: collision with root package name */
    PopupWindow f46113w;

    /* renamed from: x, reason: collision with root package name */
    Runnable f46114x;

    /* renamed from: y, reason: collision with root package name */
    androidx.core.view.h f46115y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f46116z;

    private class ListMenuDecorView extends ContentFrameLayout {
        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public ListMenuDecorView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.e0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C14879a.b(getContext(), i10));
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f46091a0 & 1) != 0) {
                appCompatDelegateImpl.l0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f46091a0 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                appCompatDelegateImpl2.l0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f46090Z = false;
            appCompatDelegateImpl3.f46091a0 = 0;
        }
    }

    class b implements G {
        b() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iM = jVar.m();
            int iH1 = AppCompatDelegateImpl.this.h1(jVar, null);
            if (iM != iH1) {
                jVar = jVar.u(jVar.k(), iH1, jVar.l(), jVar.j());
            }
            return ViewCompat.Z(view, jVar);
        }
    }

    class c implements ContentFrameLayout.a {
        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.j0();
        }
    }

    class d implements Runnable {

        class a extends C16359h0 {
            a() {
            }

            @Override // p2.InterfaceC16357g0
            public void b(View view) {
                AppCompatDelegateImpl.this.f46112v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f46115y.g(null);
                AppCompatDelegateImpl.this.f46115y = null;
            }

            @Override // p2.C16359h0, p2.InterfaceC16357g0
            public void c(View view) {
                AppCompatDelegateImpl.this.f46112v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f46113w.showAtLocation(appCompatDelegateImpl.f46112v, 55, 0, 0);
            AppCompatDelegateImpl.this.m0();
            if (!AppCompatDelegateImpl.this.X0()) {
                AppCompatDelegateImpl.this.f46112v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f46112v.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f46112v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f46115y = ViewCompat.f(appCompatDelegateImpl2.f46112v).b(1.0f);
                AppCompatDelegateImpl.this.f46115y.g(new a());
            }
        }
    }

    class e extends C16359h0 {
        e() {
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            AppCompatDelegateImpl.this.f46112v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f46115y.g(null);
            AppCompatDelegateImpl.this.f46115y = null;
        }

        @Override // p2.C16359h0, p2.InterfaceC16357g0
        public void c(View view) {
            AppCompatDelegateImpl.this.f46112v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f46112v.getParent() instanceof View) {
                ViewCompat.j0((View) AppCompatDelegateImpl.this.f46112v.getParent());
            }
        }
    }

    private class f implements b.InterfaceC0969b {
        f() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Context a() {
            return AppCompatDelegateImpl.this.r0();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public boolean b() {
            androidx.appcompat.app.a aVarU = AppCompatDelegateImpl.this.u();
            return (aVarU == null || (aVarU.i() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void c(Drawable drawable, int i10) {
            androidx.appcompat.app.a aVarU = AppCompatDelegateImpl.this.u();
            if (aVarU != null) {
                aVarU.y(drawable);
                aVarU.v(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void e(int i10) {
            androidx.appcompat.app.a aVarU = AppCompatDelegateImpl.this.u();
            if (aVarU != null) {
                aVarU.v(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Drawable d() {
            M mU = M.u(a(), null, new int[]{C14578a.f136265E});
            Drawable drawableG = mU.g(0);
            mU.x();
            return drawableG;
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            AppCompatDelegateImpl.this.c0(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callbackY0 = AppCompatDelegateImpl.this.y0();
            if (callbackY0 == null) {
                return true;
            }
            callbackY0.onMenuOpened(108, fVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f46126a;

        class a extends C16359h0 {
            a() {
            }

            @Override // p2.InterfaceC16357g0
            public void b(View view) {
                AppCompatDelegateImpl.this.f46112v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f46113w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f46112v.getParent() instanceof View) {
                    ViewCompat.j0((View) AppCompatDelegateImpl.this.f46112v.getParent());
                }
                AppCompatDelegateImpl.this.f46112v.k();
                AppCompatDelegateImpl.this.f46115y.g(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f46115y = null;
                ViewCompat.j0(appCompatDelegateImpl2.f46066B);
            }
        }

        public i(b.a aVar) {
            this.f46126a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f46126a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f46113w != null) {
                appCompatDelegateImpl.f46102l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f46114x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f46112v != null) {
                appCompatDelegateImpl2.m0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f46115y = ViewCompat.f(appCompatDelegateImpl3.f46112v).b(0.0f);
                AppCompatDelegateImpl.this.f46115y.g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.d dVar = appCompatDelegateImpl4.f46104n;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(appCompatDelegateImpl4.f46111u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f46111u = null;
            ViewCompat.j0(appCompatDelegateImpl5.f46066B);
            AppCompatDelegateImpl.this.f1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f46126a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f46126a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            ViewCompat.j0(AppCompatDelegateImpl.this.f46066B);
            return this.f46126a.d(bVar, menu);
        }
    }

    class n extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        private g f46129b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f46130c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f46131d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f46132e;

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f46131d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f46131d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f46130c = true;
                callback.onContentChanged();
            } finally {
                this.f46130c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f46132e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f46132e = false;
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        n(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f46131d ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        void e(g gVar) {
            this.f46129b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f46101k, callback);
            androidx.appcompat.view.b bVarS = AppCompatDelegateImpl.this.S(aVar);
            if (bVarS != null) {
                return aVar.e(bVarS);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f46130c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f46129b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f46132e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                AppCompatDelegateImpl.this.N0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f0(true);
            }
            g gVar = this.f46129b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (fVar != null) {
                fVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar;
            r rVarW0 = AppCompatDelegateImpl.this.w0(0, true);
            if (rVarW0 == null || (fVar = rVarW0.f46150j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (AppCompatDelegateImpl.this.E0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.J0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.M0(i10);
            return true;
        }
    }

    private class o extends p {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f46134c;

        o(Context context) {
            super();
            this.f46134c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return j.a(this.f46134c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.f();
        }
    }

    abstract class p {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f46136a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f46136a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f46101k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f46136a = null;
            }
        }

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB != null && intentFilterB.countActions() != 0) {
                if (this.f46136a == null) {
                    this.f46136a = new a();
                }
                AppCompatDelegateImpl.this.f46101k.registerReceiver(this.f46136a, intentFilterB);
            }
        }
    }

    private class q extends p {

        /* renamed from: c, reason: collision with root package name */
        private final y f46139c;

        q(y yVar) {
            super();
            this.f46139c = yVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return this.f46139c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.f();
        }
    }

    protected static final class r {

        /* renamed from: a, reason: collision with root package name */
        int f46141a;

        /* renamed from: b, reason: collision with root package name */
        int f46142b;

        /* renamed from: c, reason: collision with root package name */
        int f46143c;

        /* renamed from: d, reason: collision with root package name */
        int f46144d;

        /* renamed from: e, reason: collision with root package name */
        int f46145e;

        /* renamed from: f, reason: collision with root package name */
        int f46146f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f46147g;

        /* renamed from: h, reason: collision with root package name */
        View f46148h;

        /* renamed from: i, reason: collision with root package name */
        View f46149i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.f f46150j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.d f46151k;

        /* renamed from: l, reason: collision with root package name */
        Context f46152l;

        /* renamed from: m, reason: collision with root package name */
        boolean f46153m;

        /* renamed from: n, reason: collision with root package name */
        boolean f46154n;

        /* renamed from: o, reason: collision with root package name */
        boolean f46155o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f46156p;

        /* renamed from: q, reason: collision with root package name */
        boolean f46157q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f46158r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f46159s;

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f46150j == null) {
                return null;
            }
            if (this.f46151k == null) {
                androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this.f46152l, C14584g.f136414j);
                this.f46151k = dVar;
                dVar.e(aVar);
                this.f46150j.b(this.f46151k);
            }
            return this.f46151k.b(this.f46147g);
        }

        public boolean b() {
            if (this.f46148h == null) {
                return false;
            }
            return this.f46149i != null || this.f46151k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.d dVar;
            androidx.appcompat.view.menu.f fVar2 = this.f46150j;
            if (fVar == fVar2) {
                return;
            }
            if (fVar2 != null) {
                fVar2.R(this.f46151k);
            }
            this.f46150j = fVar;
            if (fVar == null || (dVar = this.f46151k) == null) {
                return;
            }
            fVar.b(dVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C14578a.f136279a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(C14578a.f136269I, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(C14586i.f136440e, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f46152l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(C14587j.f136677y0);
            this.f46142b = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136449B0, 0);
            this.f46146f = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136444A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        r(int i10) {
            this.f46141a = i10;
        }
    }

    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            boolean z11;
            androidx.appcompat.view.menu.f fVarF = fVar.F();
            if (fVarF != fVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                fVar = fVarF;
            }
            r rVarP0 = appCompatDelegateImpl.p0(fVar);
            if (rVarP0 != null) {
                if (z11) {
                    AppCompatDelegateImpl.this.b0(rVarP0.f46141a, rVarP0, fVarF);
                    AppCompatDelegateImpl.this.f0(rVarP0, true);
                } else {
                    AppCompatDelegateImpl.this.f0(rVarP0, z10);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callbackY0;
            if (fVar == fVar.F()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f46071G && (callbackY0 = appCompatDelegateImpl.y0()) != null && !AppCompatDelegateImpl.this.f46082R) {
                    callbackY0.onMenuOpened(108, fVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean V(boolean z10) {
        return W(z10, true);
    }

    private boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f46102l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private Configuration g0(Context context, int i10, j2.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.f
    public void D(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.f
    public void E() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        W(true, false);
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f46079O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean K0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    void O0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.view.menu.f.a
    public void b(androidx.appcompat.view.menu.f fVar) {
        T0(true);
    }

    void e0(int i10) {
        f0(w0(i10, true), true);
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return V(true);
    }

    final int h1(androidx.core.view.j jVar, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iM = jVar != null ? jVar.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f46112v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46112v.getLayoutParams();
            if (this.f46112v.isShown()) {
                if (this.f46094d0 == null) {
                    this.f46094d0 = new Rect();
                    this.f46095e0 = new Rect();
                }
                Rect rect2 = this.f46094d0;
                Rect rect3 = this.f46095e0;
                if (jVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(jVar.k(), jVar.m(), jVar.l(), jVar.j());
                }
                Y.a(this.f46066B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                androidx.core.view.j jVarG = ViewCompat.G(this.f46066B);
                int iK = jVarG == null ? 0 : jVarG.k();
                int iL = jVarG == null ? 0 : jVarG.l();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f46068D != null) {
                    View view = this.f46068D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.f46068D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f46101k);
                    this.f46068D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.f46066B.addView(this.f46068D, -1, layoutParams);
                }
                View view3 = this.f46068D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    i1(this.f46068D);
                }
                if (!this.f46073I && z) {
                    iM = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f46112v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f46068D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iM;
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        Context context2;
        this.f46080P = true;
        int iF0 = F0(context, a0());
        if (androidx.appcompat.app.f.x(context)) {
            androidx.appcompat.app.f.U(context);
        }
        j2.i iVarZ = Z(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(g0(context2, iF0, iVarZ, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(g0(context2, iF0, iVarZ, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f46064m0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationG0 = g0(context2, iF0, iVarZ, !configuration2.equals(configuration3) ? q0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, C14586i.f136441f);
        dVar.a(configurationG0);
        try {
            if (context2.getTheme() != null) {
                C6327h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void l0(int i10) {
        r rVarW0;
        r rVarW02 = w0(i10, true);
        if (rVarW02.f46150j != null) {
            Bundle bundle = new Bundle();
            rVarW02.f46150j.U(bundle);
            if (bundle.size() > 0) {
                rVarW02.f46159s = bundle;
            }
            rVarW02.f46150j.i0();
            rVarW02.f46150j.clear();
        }
        rVarW02.f46158r = true;
        rVarW02.f46157q = true;
        if ((i10 != 108 && i10 != 0) || this.f46108r == null || (rVarW0 = w0(0, false)) == null) {
            return;
        }
        rVarW0.f46153m = false;
        S0(rVarW0, null);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
        String strC;
        this.f46080P = true;
        V(false);
        o0();
        Object obj = this.f46100j;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.k.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarQ0 = Q0();
                if (aVarQ0 == null) {
                    this.f46093c0 = true;
                } else {
                    aVarQ0.r(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f46083S = new Configuration(this.f46101k.getResources().getConfiguration());
        this.f46081Q = true;
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static j2.i b(Configuration configuration) {
            return j2.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(j2.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        static void d(Configuration configuration, j2.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o
                public final void onBackInvoked() {
                    appCompatDelegateImpl.G0();
                }
            };
            androidx.appcompat.app.k.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.k.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.j.a(obj2));
        }
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private boolean A0(r rVar) {
        View view = rVar.f46149i;
        if (view != null) {
            rVar.f46148h = view;
            return true;
        }
        if (rVar.f46150j == null) {
            return false;
        }
        if (this.f46110t == null) {
            this.f46110t = new s();
        }
        View view2 = (View) rVar.a(this.f46110t);
        rVar.f46148h = view2;
        return view2 != null;
    }

    private boolean C0(r rVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f46101k;
        int i10 = rVar.f46141a;
        if ((i10 == 0 || i10 == 108) && this.f46108r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C14578a.f136284f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C14578a.f136285g, typedValue, true);
            } else {
                theme.resolveAttribute(C14578a.f136285g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        fVar.W(this);
        rVar.c(fVar);
        return true;
    }

    private void D0(int i10) {
        this.f46091a0 = (1 << i10) | this.f46091a0;
        if (this.f46090Z) {
            return;
        }
        ViewCompat.e0(this.f46102l.getDecorView(), this.f46092b0);
        this.f46090Z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean L0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f46111u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$r r2 = r4.w0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.s r5 = r4.f46108r
            if (r5 == 0) goto L43
            boolean r5 = r5.a()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f46101k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.s r5 = r4.f46108r
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f46082R
            if (r5 != 0) goto L62
            boolean r5 = r4.S0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.s r5 = r4.f46108r
            boolean r0 = r5.c()
            goto L68
        L3c:
            androidx.appcompat.widget.s r5 = r4.f46108r
            boolean r0 = r5.b()
            goto L68
        L43:
            boolean r5 = r2.f46155o
            if (r5 != 0) goto L64
            boolean r3 = r2.f46154n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f46153m
            if (r5 == 0) goto L62
            boolean r5 = r2.f46158r
            if (r5 == 0) goto L5b
            r2.f46153m = r1
            boolean r5 = r4.S0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.P0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.f0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f46101k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            com.fullstory.FS.log_w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.L0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P0(androidx.appcompat.app.AppCompatDelegateImpl.r r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.P0(androidx.appcompat.app.AppCompatDelegateImpl$r, android.view.KeyEvent):void");
    }

    private boolean S0(r rVar, KeyEvent keyEvent) {
        InterfaceC5784s interfaceC5784s;
        InterfaceC5784s interfaceC5784s2;
        InterfaceC5784s interfaceC5784s3;
        if (this.f46082R) {
            return false;
        }
        if (rVar.f46153m) {
            return true;
        }
        r rVar2 = this.f46078N;
        if (rVar2 != null && rVar2 != rVar) {
            f0(rVar2, false);
        }
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null) {
            rVar.f46149i = callbackY0.onCreatePanelView(rVar.f46141a);
        }
        int i10 = rVar.f46141a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC5784s3 = this.f46108r) != null) {
            interfaceC5784s3.f();
        }
        if (rVar.f46149i == null && (!z10 || !(Q0() instanceof w))) {
            androidx.appcompat.view.menu.f fVar = rVar.f46150j;
            if (fVar == null || rVar.f46158r) {
                if (fVar == null && (!C0(rVar) || rVar.f46150j == null)) {
                    return false;
                }
                if (z10 && this.f46108r != null) {
                    if (this.f46109s == null) {
                        this.f46109s = new h();
                    }
                    this.f46108r.d(rVar.f46150j, this.f46109s);
                }
                rVar.f46150j.i0();
                if (!callbackY0.onCreatePanelMenu(rVar.f46141a, rVar.f46150j)) {
                    rVar.c(null);
                    if (z10 && (interfaceC5784s = this.f46108r) != null) {
                        interfaceC5784s.d(null, this.f46109s);
                    }
                    return false;
                }
                rVar.f46158r = false;
            }
            rVar.f46150j.i0();
            Bundle bundle = rVar.f46159s;
            if (bundle != null) {
                rVar.f46150j.S(bundle);
                rVar.f46159s = null;
            }
            if (!callbackY0.onPreparePanel(0, rVar.f46149i, rVar.f46150j)) {
                if (z10 && (interfaceC5784s2 = this.f46108r) != null) {
                    interfaceC5784s2.d(null, this.f46109s);
                }
                rVar.f46150j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f46156p = z11;
            rVar.f46150j.setQwertyMode(z11);
            rVar.f46150j.h0();
        }
        rVar.f46153m = true;
        rVar.f46154n = false;
        this.f46078N = rVar;
        return true;
    }

    private void T0(boolean z10) {
        InterfaceC5784s interfaceC5784s = this.f46108r;
        if (interfaceC5784s == null || !interfaceC5784s.a() || (ViewConfiguration.get(this.f46101k).hasPermanentMenuKey() && !this.f46108r.g())) {
            r rVarW0 = w0(0, true);
            rVarW0.f46157q = true;
            f0(rVarW0, false);
            P0(rVarW0, null);
            return;
        }
        Window.Callback callbackY0 = y0();
        if (this.f46108r.e() && z10) {
            this.f46108r.b();
            if (this.f46082R) {
                return;
            }
            callbackY0.onPanelClosed(108, w0(0, true).f46150j);
            return;
        }
        if (callbackY0 == null || this.f46082R) {
            return;
        }
        if (this.f46090Z && (this.f46091a0 & 1) != 0) {
            this.f46102l.getDecorView().removeCallbacks(this.f46092b0);
            this.f46092b0.run();
        }
        r rVarW02 = w0(0, true);
        androidx.appcompat.view.menu.f fVar = rVarW02.f46150j;
        if (fVar == null || rVarW02.f46158r || !callbackY0.onPreparePanel(0, rVarW02.f46149i, fVar)) {
            return;
        }
        callbackY0.onMenuOpened(108, rVarW02.f46150j);
        this.f46108r.c();
    }

    private int U0(int i10) {
        if (i10 == 8) {
            FS.log_i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        FS.log_i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean W(boolean z10, boolean z11) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        if (this.f46082R) {
            return false;
        }
        int iA0 = a0();
        int iF0 = F0(this.f46101k, iA0);
        j2.i iVarZ = Build.VERSION.SDK_INT < 33 ? Z(this.f46101k) : null;
        if (!z11 && iVarZ != null) {
            iVarZ = v0(this.f46101k.getResources().getConfiguration());
        }
        boolean zE1 = e1(iF0, iVarZ, z10);
        if (iA0 == 0) {
            u0(this.f46101k).e();
        } else {
            p pVar = this.f46088X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iA0 == 3) {
            t0(this.f46101k).e();
            return zE1;
        }
        p pVar2 = this.f46089Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zE1;
    }

    private void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f46066B.findViewById(R.id.content);
        View decorView = this.f46102l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f46101k.obtainStyledAttributes(C14587j.f136677y0);
        typedArrayObtainStyledAttributes.getValue(C14587j.f136493K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C14587j.f136497L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(C14587j.f136484I0)) {
            typedArrayObtainStyledAttributes.getValue(C14587j.f136484I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C14587j.f136489J0)) {
            typedArrayObtainStyledAttributes.getValue(C14587j.f136489J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C14587j.f136474G0)) {
            typedArrayObtainStyledAttributes.getValue(C14587j.f136474G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(C14587j.f136479H0)) {
            typedArrayObtainStyledAttributes.getValue(C14587j.f136479H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void Y(Window window) {
        if (this.f46102l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback windowCallback = FS.getWindowCallback(window);
        if (windowCallback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(windowCallback);
        this.f46103m = nVar;
        FS.setWindowCallback(window, nVar);
        M mU = M.u(this.f46101k, null, f46063l0);
        Drawable drawableH = mU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        mU.x();
        this.f46102l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f46098h0 != null) {
            return;
        }
        O(null);
    }

    private int a0() {
        int i10 = this.f46084T;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.o();
    }

    private void b1() {
        if (this.f46065A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity c1() {
        for (Context baseContext = this.f46101k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void d0() {
        p pVar = this.f46088X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f46089Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d1(Configuration configuration) {
        Activity activity = (Activity) this.f46100j;
        if (activity instanceof InterfaceC6172s) {
            if (((InterfaceC6172s) activity).getLifecycle().getState().b(AbstractC6165l.b.f55501c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f46081Q || this.f46082R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e1(int r11, j2.i r12, boolean r13) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r10 = this;
            android.content.Context r1 = r10.f46101k
            r4 = 0
            r5 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            android.content.res.Configuration r11 = r0.g0(r1, r2, r3, r4, r5)
            android.content.Context r12 = r0.f46101k
            int r12 = r10.s0(r12)
            android.content.res.Configuration r1 = r0.f46083S
            if (r1 != 0) goto L1f
            android.content.Context r1 = r0.f46101k
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
        L1f:
            int r4 = r1.uiMode
            r4 = r4 & 48
            int r5 = r11.uiMode
            r5 = r5 & 48
            j2.i r1 = r10.v0(r1)
            r6 = 0
            if (r3 != 0) goto L30
            r7 = r6
            goto L34
        L30:
            j2.i r7 = r10.v0(r11)
        L34:
            r8 = 0
            if (r4 == r5) goto L3a
            r4 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r4 = r8
        L3b:
            if (r7 == 0) goto L45
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L45
            r4 = r4 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r1 = ~r12
            r1 = r1 & r4
            r9 = 1
            if (r1 == 0) goto L8c
            if (r13 == 0) goto L8c
            boolean r13 = r0.f46080P
            if (r13 == 0) goto L8c
            boolean r13 = androidx.appcompat.app.AppCompatDelegateImpl.f46064m0
            if (r13 != 0) goto L58
            boolean r13 = r0.f46081Q
            if (r13 == 0) goto L8c
        L58:
            java.lang.Object r13 = r0.f46100j
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 == 0) goto L8c
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L8c
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r13 < r1) goto L83
            r13 = r4 & 8192(0x2000, float:1.148E-41)
            if (r13 == 0) goto L83
            java.lang.Object r13 = r0.f46100j
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            int r11 = r11.getLayoutDirection()
            r13.setLayoutDirection(r11)
        L83:
            java.lang.Object r11 = r0.f46100j
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.u(r11)
            r11 = r9
            goto L8d
        L8c:
            r11 = r8
        L8d:
            if (r11 != 0) goto L9a
            if (r4 == 0) goto L9a
            r11 = r4 & r12
            if (r11 != r4) goto L96
            r8 = r9
        L96:
            r10.g1(r5, r7, r8, r6)
            goto L9b
        L9a:
            r9 = r11
        L9b:
            if (r9 == 0) goto Lb7
            java.lang.Object r11 = r0.f46100j
            boolean r12 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r12 == 0) goto Lb7
            r12 = r4 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto Lac
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.onNightModeChanged(r2)
        Lac:
            r11 = r4 & 4
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r0.f46100j
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.onLocalesChanged(r3)
        Lb7:
            if (r7 == 0) goto Lca
            android.content.Context r11 = r0.f46101k
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            j2.i r11 = r10.v0(r11)
            r10.W0(r11)
        Lca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.e1(int, j2.i, boolean):boolean");
    }

    private void g1(int i10, j2.i iVar, boolean z10, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Resources resources = this.f46101k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            V0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            v.a(resources);
        }
        int i11 = this.f46085U;
        if (i11 != 0) {
            this.f46101k.setTheme(i11);
            this.f46101k.getTheme().applyStyle(this.f46085U, true);
        }
        if (z10 && (this.f46100j instanceof Activity)) {
            d1(configuration2);
        }
    }

    private ViewGroup h0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f46101k.obtainStyledAttributes(C14587j.f136677y0);
        if (!typedArrayObtainStyledAttributes.hasValue(C14587j.f136459D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C14587j.f136501M0, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(C14587j.f136459D0, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C14587j.f136464E0, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C14587j.f136469F0, false)) {
            I(10);
        }
        this.f46074J = typedArrayObtainStyledAttributes.getBoolean(C14587j.f136682z0, false);
        typedArrayObtainStyledAttributes.recycle();
        o0();
        this.f46102l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f46101k);
        if (this.f46075K) {
            viewGroup = this.f46073I ? (ViewGroup) layoutInflaterFrom.inflate(C14584g.f136419o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C14584g.f136418n, (ViewGroup) null);
        } else if (this.f46074J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C14584g.f136410f, (ViewGroup) null);
            this.f46072H = false;
            this.f46071G = false;
        } else if (this.f46071G) {
            TypedValue typedValue = new TypedValue();
            this.f46101k.getTheme().resolveAttribute(C14578a.f136284f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f46101k, typedValue.resourceId) : this.f46101k).inflate(C14584g.f136420p, (ViewGroup) null);
            InterfaceC5784s interfaceC5784s = (InterfaceC5784s) viewGroup.findViewById(C14583f.f136394p);
            this.f46108r = interfaceC5784s;
            interfaceC5784s.setWindowCallback(y0());
            if (this.f46072H) {
                this.f46108r.h(109);
            }
            if (this.f46069E) {
                this.f46108r.h(2);
            }
            if (this.f46070F) {
                this.f46108r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f46071G + ", windowActionBarOverlay: " + this.f46072H + ", android:windowIsFloating: " + this.f46074J + ", windowActionModeOverlay: " + this.f46073I + ", windowNoTitle: " + this.f46075K + " }");
        }
        ViewCompat.A0(viewGroup, new b());
        if (this.f46108r == null) {
            this.f46067C = (TextView) viewGroup.findViewById(C14583f.f136375D);
        }
        Y.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C14583f.f136380b);
        ViewGroup viewGroup2 = (ViewGroup) this.f46102l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f46102l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void n0() {
        if (this.f46065A) {
            return;
        }
        this.f46066B = h0();
        CharSequence charSequenceX0 = x0();
        if (!TextUtils.isEmpty(charSequenceX0)) {
            InterfaceC5784s interfaceC5784s = this.f46108r;
            if (interfaceC5784s != null) {
                interfaceC5784s.setWindowTitle(charSequenceX0);
            } else if (Q0() != null) {
                Q0().C(charSequenceX0);
            } else {
                TextView textView = this.f46067C;
                if (textView != null) {
                    textView.setText(charSequenceX0);
                }
            }
        }
        X();
        O0(this.f46066B);
        this.f46065A = true;
        r rVarW0 = w0(0, false);
        if (this.f46082R) {
            return;
        }
        if (rVarW0 == null || rVarW0.f46150j == null) {
            D0(108);
        }
    }

    private void o0() {
        if (this.f46102l == null) {
            Object obj = this.f46100j;
            if (obj instanceof Activity) {
                Y(((Activity) obj).getWindow());
            }
        }
        if (this.f46102l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int s0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.f46087W && (this.f46100j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f46100j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f46086V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                FS.log_d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f46086V = 0;
            }
        }
        this.f46087W = true;
        return this.f46086V;
    }

    private p t0(Context context) {
        if (this.f46089Y == null) {
            this.f46089Y = new o(context);
        }
        return this.f46089Y;
    }

    private p u0(Context context) {
        if (this.f46088X == null) {
            this.f46088X = new q(y.a(context));
        }
        return this.f46088X;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f46100j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.G(r3)
        L9:
            boolean r0 = r3.f46090Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f46102l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f46092b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f46082R = r0
            int r0 = r3.f46084T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f46100j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            Z.n0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f46061j0
            java.lang.Object r1 = r3.f46100j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f46084T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            Z.n0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f46061j0
            java.lang.Object r1 = r3.f46100j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f46105o
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.A():void");
    }

    public boolean E0() {
        return this.f46116z;
    }

    int F0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return u0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return t0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    boolean G0() {
        boolean z10 = this.f46079O;
        this.f46079O = false;
        r rVarW0 = w0(0, false);
        if (rVarW0 != null && rVarW0.f46155o) {
            if (!z10) {
                f0(rVarW0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f46111u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarU = u();
        return aVarU != null && aVarU.g();
    }

    void M0(int i10) {
        androidx.appcompat.app.a aVarU;
        if (i10 != 108 || (aVarU = u()) == null) {
            return;
        }
        aVarU.h(true);
    }

    @Override // androidx.appcompat.app.f
    public void N(int i10) {
        if (this.f46084T != i10) {
            this.f46084T = i10;
            if (this.f46080P) {
                f();
            }
        }
    }

    void N0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarU = u();
            if (aVarU != null) {
                aVarU.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r rVarW0 = w0(i10, true);
            if (rVarW0.f46155o) {
                f0(rVarW0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void P(Toolbar toolbar) {
        if (this.f46100j instanceof Activity) {
            androidx.appcompat.app.a aVarU = u();
            if (aVarU instanceof z) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f46106p = null;
            if (aVarU != null) {
                aVarU.n();
            }
            this.f46105o = null;
            if (toolbar != null) {
                w wVar = new w(toolbar, x0(), this.f46103m);
                this.f46105o = wVar;
                this.f46103m.e(wVar.f46223c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f46103m.e(null);
            }
            w();
        }
    }

    @Override // androidx.appcompat.app.f
    public void Q(int i10) {
        this.f46085U = i10;
    }

    final androidx.appcompat.app.a Q0() {
        return this.f46105o;
    }

    @Override // androidx.appcompat.app.f
    public final void R(CharSequence charSequence) {
        this.f46107q = charSequence;
        InterfaceC5784s interfaceC5784s = this.f46108r;
        if (interfaceC5784s != null) {
            interfaceC5784s.setWindowTitle(charSequence);
            return;
        }
        if (Q0() != null) {
            Q0().C(charSequence);
            return;
        }
        TextView textView = this.f46067C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.view.b S(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f46111u;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarU = u();
        if (aVarU != null) {
            androidx.appcompat.view.b bVarD = aVarU.D(iVar);
            this.f46111u = bVarD;
            if (bVarD != null && (dVar = this.f46104n) != null) {
                dVar.onSupportActionModeStarted(bVarD);
            }
        }
        if (this.f46111u == null) {
            this.f46111u = a1(iVar);
        }
        f1();
        return this.f46111u;
    }

    final boolean X0() {
        ViewGroup viewGroup;
        return this.f46065A && (viewGroup = this.f46066B) != null && viewGroup.isLaidOut();
    }

    j2.i Z(Context context) {
        j2.i iVarT;
        if (Build.VERSION.SDK_INT >= 33 || (iVarT = androidx.appcompat.app.f.t()) == null) {
            return null;
        }
        j2.i iVarV0 = v0(context.getApplicationContext().getResources().getConfiguration());
        j2.i iVarB = u.b(iVarT, iVarV0);
        return iVarB.e() ? iVarV0 : iVarB;
    }

    boolean Z0() {
        if (this.f46098h0 == null) {
            return false;
        }
        r rVarW0 = w0(0, false);
        return (rVarW0 != null && rVarW0.f46155o) || this.f46111u != null;
    }

    void b0(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f46077M;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f46150j;
            }
        }
        if ((rVar == null || rVar.f46155o) && !this.f46082R) {
            this.f46103m.d(FS.getWindowCallback(this.f46102l), i10, menu);
        }
    }

    void c0(androidx.appcompat.view.menu.f fVar) {
        if (this.f46076L) {
            return;
        }
        this.f46076L = true;
        this.f46108r.l();
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null && !this.f46082R) {
            callbackY0.onPanelClosed(108, fVar);
        }
        this.f46076L = false;
    }

    void f0(r rVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC5784s interfaceC5784s;
        if (z10 && rVar.f46141a == 0 && (interfaceC5784s = this.f46108r) != null && interfaceC5784s.e()) {
            c0(rVar.f46150j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f46101k.getSystemService("window");
        if (windowManager != null && rVar.f46155o && (viewGroup = rVar.f46147g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                b0(rVar.f46141a, rVar, null);
            }
        }
        rVar.f46153m = false;
        rVar.f46154n = false;
        rVar.f46155o = false;
        rVar.f46148h = null;
        rVar.f46157q = true;
        if (this.f46078N == rVar) {
            this.f46078N = null;
        }
        if (rVar.f46141a == 0) {
            f1();
        }
    }

    void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zZ0 = Z0();
            if (zZ0 && this.f46099i0 == null) {
                this.f46099i0 = m.b(this.f46098h0, this);
            } else {
                if (zZ0 || (onBackInvokedCallback = this.f46099i0) == null) {
                    return;
                }
                m.c(this.f46098h0, onBackInvokedCallback);
                this.f46099i0 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f46096f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f46101k.obtainStyledAttributes(C14587j.f136677y0);
            String string = typedArrayObtainStyledAttributes.getString(C14587j.f136454C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f46096f0 = new androidx.appcompat.app.r();
            } else {
                try {
                    this.f46096f0 = (androidx.appcompat.app.r) this.f46101k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    FS.log_i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f46096f0 = new androidx.appcompat.app.r();
                }
            }
        }
        boolean z11 = f46062k0;
        boolean zY0 = false;
        if (z11) {
            if (this.f46097g0 == null) {
                this.f46097g0 = new t();
            }
            if (this.f46097g0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zY0 = Y0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zY0 = true;
                }
                z10 = zY0;
            }
        } else {
            z10 = zY0;
        }
        return this.f46096f0.r(view, str, context, attributeSet, z10, z11, true, X.c());
    }

    void j0() {
        androidx.appcompat.view.menu.f fVar;
        InterfaceC5784s interfaceC5784s = this.f46108r;
        if (interfaceC5784s != null) {
            interfaceC5784s.l();
        }
        if (this.f46113w != null) {
            this.f46102l.getDecorView().removeCallbacks(this.f46114x);
            if (this.f46113w.isShowing()) {
                try {
                    this.f46113w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f46113w = null;
        }
        m0();
        r rVarW0 = w0(0, false);
        if (rVarW0 == null || (fVar = rVarW0.f46150j) == null) {
            return;
        }
        fVar.close();
    }

    boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f46100j;
        if (((obj instanceof c.a) || (obj instanceof androidx.appcompat.app.q)) && (decorView = this.f46102l.getDecorView()) != null && androidx.core.view.c.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f46103m.b(FS.getWindowCallback(this.f46102l), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? H0(keyCode, keyEvent) : K0(keyCode, keyEvent);
    }

    void m0() {
        androidx.core.view.h hVar = this.f46115y;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f46101k;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public final b.InterfaceC0969b p() {
        return new f();
    }

    r p0(Menu menu) {
        r[] rVarArr = this.f46077M;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f46150j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public int q() {
        return this.f46084T;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater s() {
        if (this.f46106p == null) {
            z0();
            androidx.appcompat.app.a aVar = this.f46105o;
            this.f46106p = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f46101k);
        }
        return this.f46106p;
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f46101k);
        if (layoutInflaterFrom.getFactory() == null) {
            C16379s.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            FS.log_i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected r w0(int i10, boolean z10) {
        r[] rVarArr = this.f46077M;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f46077M = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    final CharSequence x0() {
        Object obj = this.f46100j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f46107q;
    }

    @Override // androidx.appcompat.app.f
    public void y(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        androidx.appcompat.app.a aVarU;
        if (this.f46071G && this.f46065A && (aVarU = u()) != null) {
            aVarU.m(configuration);
        }
        C5771e.b().g(this.f46101k);
        this.f46083S = new Configuration(this.f46101k.getResources().getConfiguration());
        W(false, false);
    }

    final Window.Callback y0() {
        return FS.getWindowCallback(this.f46102l);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        n0<String, Integer> n0Var;
        Integer num;
        AppCompatActivity appCompatActivityC1;
        this.f46115y = null;
        this.f46116z = true;
        this.f46084T = -100;
        this.f46092b0 = new a();
        this.f46101k = context;
        this.f46104n = dVar;
        this.f46100j = obj;
        if (this.f46084T == -100 && (obj instanceof Dialog) && (appCompatActivityC1 = c1()) != null) {
            this.f46084T = appCompatActivityC1.getDelegate().q();
        }
        if (this.f46084T == -100 && (num = (n0Var = f46061j0).get(obj.getClass().getName())) != null) {
            this.f46084T = num.intValue();
            n0Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            Y(window);
        }
        C5771e.h();
    }

    private boolean B0(r rVar) {
        rVar.d(r0());
        rVar.f46147g = new ListMenuDecorView(rVar.f46152l);
        rVar.f46143c = 81;
        return true;
    }

    private boolean I0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            r rVarW0 = w0(i10, true);
            if (!rVarW0.f46155o) {
                return S0(rVarW0, keyEvent);
            }
            return false;
        }
        return false;
    }

    private boolean R0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.f fVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f46153m || S0(rVar, keyEvent)) && (fVar = rVar.f46150j) != null) {
            zPerformShortcut = fVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f46108r == null) {
            f0(rVar, true);
        }
        return zPerformShortcut;
    }

    private void i1(View view) {
        int iC;
        if ((ViewCompat.L(view) & 8192) != 0) {
            iC = Z1.b.c(this.f46101k, C14580c.f136307b);
        } else {
            iC = Z1.b.c(this.f46101k, C14580c.f136306a);
        }
        view.setBackgroundColor(iC);
    }

    private void z0() {
        n0();
        if (this.f46071G && this.f46105o == null) {
            Object obj = this.f46100j;
            if (obj instanceof Activity) {
                this.f46105o = new z((Activity) this.f46100j, this.f46072H);
            } else if (obj instanceof Dialog) {
                this.f46105o = new z((Dialog) this.f46100j);
            }
            androidx.appcompat.app.a aVar = this.f46105o;
            if (aVar != null) {
                aVar.r(this.f46093c0);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void B(Bundle bundle) {
        n0();
    }

    @Override // androidx.appcompat.app.f
    public void C() {
        androidx.appcompat.app.a aVarU = u();
        if (aVarU != null) {
            aVarU.A(true);
        }
    }

    @Override // androidx.appcompat.app.f
    public void F() {
        androidx.appcompat.app.a aVarU = u();
        if (aVarU != null) {
            aVarU.A(false);
        }
    }

    @Override // androidx.appcompat.app.f
    public boolean I(int i10) {
        int iU0 = U0(i10);
        if (this.f46075K && iU0 == 108) {
            return false;
        }
        if (this.f46071G && iU0 == 1) {
            this.f46071G = false;
        }
        if (iU0 != 1) {
            if (iU0 != 2) {
                if (iU0 != 5) {
                    if (iU0 != 10) {
                        if (iU0 != 108) {
                            if (iU0 != 109) {
                                return this.f46102l.requestFeature(iU0);
                            }
                            b1();
                            this.f46072H = true;
                            return true;
                        }
                        b1();
                        this.f46071G = true;
                        return true;
                    }
                    b1();
                    this.f46073I = true;
                    return true;
                }
                b1();
                this.f46070F = true;
                return true;
            }
            b1();
            this.f46069E = true;
            return true;
        }
        b1();
        this.f46075K = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void J(int i10) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f46066B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f46101k).inflate(i10, viewGroup);
        this.f46103m.c(FS.getWindowCallback(this.f46102l));
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarU = u();
        if (aVarU != null && aVarU.o(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f46078N;
        if (rVar != null && R0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f46078N;
            if (rVar2 != null) {
                rVar2.f46154n = true;
            }
            return true;
        }
        if (this.f46078N == null) {
            r rVarW0 = w0(0, true);
            S0(rVarW0, keyEvent);
            boolean zR0 = R0(rVarW0, keyEvent.getKeyCode(), keyEvent, 1);
            rVarW0.f46153m = false;
            if (zR0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void K(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f46066B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f46103m.c(FS.getWindowCallback(this.f46102l));
    }

    @Override // androidx.appcompat.app.f
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.f46066B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f46103m.c(FS.getWindowCallback(this.f46102l));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.O(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f46098h0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f46099i0
            if (r1 == 0) goto L11
            androidx.appcompat.app.AppCompatDelegateImpl.m.c(r0, r1)
            r0 = 0
            r2.f46099i0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f46100j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f46100j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.AppCompatDelegateImpl.m.a(r3)
            r2.f46098h0 = r3
            goto L2e
        L2c:
            r2.f46098h0 = r3
        L2e:
            r2.f1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.O(android.window.OnBackInvokedDispatcher):void");
    }

    void V0(Configuration configuration, j2.i iVar) {
        k.d(configuration, iVar);
    }

    void W0(j2.i iVar) {
        k.c(iVar);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        r rVarP0;
        Window.Callback callbackY0 = y0();
        if (callbackY0 != null && !this.f46082R && (rVarP0 = p0(fVar.F())) != null) {
            return callbackY0.onMenuItemSelected(rVarP0.f46141a, menuItem);
        }
        return false;
    }

    androidx.appcompat.view.b a1(b.a aVar) {
        androidx.appcompat.view.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        m0();
        androidx.appcompat.view.b bVar = this.f46111u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f46104n;
        if (dVar3 != null && !this.f46082R) {
            try {
                bVarOnWindowStartingSupportActionMode = dVar3.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        } else {
            bVarOnWindowStartingSupportActionMode = null;
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f46111u = bVarOnWindowStartingSupportActionMode;
        } else {
            boolean z10 = true;
            if (this.f46112v == null) {
                if (this.f46074J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f46101k.getTheme();
                    theme.resolveAttribute(C14578a.f136284f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f46101k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f46101k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f46101k;
                    }
                    this.f46112v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, C14578a.f136287i);
                    this.f46113w = popupWindow;
                    androidx.core.widget.j.b(popupWindow, 2);
                    this.f46113w.setContentView(this.f46112v);
                    this.f46113w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(C14578a.f136280b, typedValue, true);
                    this.f46112v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f46113w.setHeight(-2);
                    this.f46114x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f46066B.findViewById(C14583f.f136386h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(r0()));
                        this.f46112v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f46112v != null) {
                m0();
                this.f46112v.k();
                Context context = this.f46112v.getContext();
                ActionBarContextView actionBarContextView = this.f46112v;
                if (this.f46113w != null) {
                    z10 = false;
                }
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(context, actionBarContextView, aVar, z10);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f46112v.h(eVar);
                    this.f46111u = eVar;
                    if (X0()) {
                        this.f46112v.setAlpha(0.0f);
                        androidx.core.view.h hVarB = ViewCompat.f(this.f46112v).b(1.0f);
                        this.f46115y = hVarB;
                        hVarB.g(new e());
                    } else {
                        this.f46112v.setAlpha(1.0f);
                        this.f46112v.setVisibility(0);
                        if (this.f46112v.getParent() instanceof View) {
                            ViewCompat.j0((View) this.f46112v.getParent());
                        }
                    }
                    if (this.f46113w != null) {
                        this.f46102l.getDecorView().post(this.f46114x);
                    }
                } else {
                    this.f46111u = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f46111u;
        if (bVar2 != null && (dVar2 = this.f46104n) != null) {
            dVar2.onSupportActionModeStarted(bVar2);
        }
        f1();
        return this.f46111u;
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.f46066B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f46103m.c(FS.getWindowCallback(this.f46102l));
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T l(int i10) {
        n0();
        return (T) this.f46102l.findViewById(i10);
    }

    final Context r0() {
        Context contextJ;
        androidx.appcompat.app.a aVarU = u();
        if (aVarU != null) {
            contextJ = aVarU.j();
        } else {
            contextJ = null;
        }
        if (contextJ == null) {
            return this.f46101k;
        }
        return contextJ;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a u() {
        z0();
        return this.f46105o;
    }

    j2.i v0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public void w() {
        if (Q0() != null && !u().l()) {
            D0(0);
        }
    }
}
