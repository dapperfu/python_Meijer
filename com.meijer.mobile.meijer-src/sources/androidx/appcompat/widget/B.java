package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import i.C14578a;
import i.C14587j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class B implements ShowableListMenu {

    /* renamed from: G, reason: collision with root package name */
    private static Method f46780G;

    /* renamed from: H, reason: collision with root package name */
    private static Method f46781H;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f46782A;

    /* renamed from: B, reason: collision with root package name */
    final Handler f46783B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f46784C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f46785D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f46786E;

    /* renamed from: F, reason: collision with root package name */
    PopupWindow f46787F;

    /* renamed from: a, reason: collision with root package name */
    private Context f46788a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f46789b;

    /* renamed from: c, reason: collision with root package name */
    DropDownListView f46790c;

    /* renamed from: d, reason: collision with root package name */
    private int f46791d;

    /* renamed from: e, reason: collision with root package name */
    private int f46792e;

    /* renamed from: f, reason: collision with root package name */
    private int f46793f;

    /* renamed from: g, reason: collision with root package name */
    private int f46794g;

    /* renamed from: h, reason: collision with root package name */
    private int f46795h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46796i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46797j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f46798k;

    /* renamed from: l, reason: collision with root package name */
    private int f46799l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f46800m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46801n;

    /* renamed from: o, reason: collision with root package name */
    int f46802o;

    /* renamed from: p, reason: collision with root package name */
    private View f46803p;

    /* renamed from: q, reason: collision with root package name */
    private int f46804q;

    /* renamed from: r, reason: collision with root package name */
    private DataSetObserver f46805r;

    /* renamed from: s, reason: collision with root package name */
    private View f46806s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f46807t;

    /* renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f46808u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f46809v;

    /* renamed from: w, reason: collision with root package name */
    final i f46810w;

    /* renamed from: x, reason: collision with root package name */
    private final h f46811x;

    /* renamed from: y, reason: collision with root package name */
    private final g f46812y;

    /* renamed from: z, reason: collision with root package name */
    private final e f46813z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = B.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            B.this.a();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            DropDownListView dropDownListView;
            if (i10 == -1 || (dropDownListView = B.this.f46790c) == null) {
                return;
            }
            dropDownListView.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        b() {
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.q();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (B.this.b()) {
                B.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            B.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || B.this.z() || B.this.f46787F.getContentView() == null) {
                return;
            }
            B b10 = B.this;
            b10.f46783B.removeCallbacks(b10.f46810w);
            B.this.f46810w.run();
        }

        g() {
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = B.this.f46787F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < B.this.f46787F.getWidth() && y10 >= 0 && y10 < B.this.f46787F.getHeight()) {
                B b10 = B.this;
                b10.f46783B.postDelayed(b10.f46810w, 250L);
                return false;
            }
            if (action == 1) {
                B b11 = B.this;
                b11.f46783B.removeCallbacks(b11.f46810w);
                return false;
            }
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = B.this.f46790c;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || B.this.f46790c.getCount() <= B.this.f46790c.getChildCount()) {
                return;
            }
            int childCount = B.this.f46790c.getChildCount();
            B b10 = B.this;
            if (childCount <= b10.f46802o) {
                b10.f46787F.setInputMethodMode(2);
                B.this.a();
            }
        }
    }

    public B(Context context) {
        this(context, null, C14578a.f136268H);
    }

    public void M(boolean z10) {
        this.f46798k = true;
        this.f46797j = z10;
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f46780G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                FS.log_i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f46781H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                FS.log_i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void B() {
        View view = this.f46803p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f46803p);
            }
        }
    }

    private void N(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f46787F, z10);
            return;
        }
        Method method = f46780G;
        if (method != null) {
            try {
                method.invoke(this.f46787F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                FS.log_i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        int i11;
        if (this.f46790c == null) {
            Context context = this.f46788a;
            this.f46782A = new a();
            DropDownListView dropDownListViewR = r(context, !this.f46786E);
            this.f46790c = dropDownListViewR;
            Drawable drawable = this.f46807t;
            if (drawable != null) {
                dropDownListViewR.setSelector(drawable);
            }
            this.f46790c.setAdapter(this.f46789b);
            this.f46790c.setOnItemClickListener(this.f46808u);
            this.f46790c.setFocusable(true);
            this.f46790c.setFocusableInTouchMode(true);
            this.f46790c.setOnItemSelectedListener(new b());
            this.f46790c.setOnScrollListener(this.f46812y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f46809v;
            if (onItemSelectedListener != null) {
                this.f46790c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f46790c;
            View view2 = this.f46803p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f46804q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i12 != 1) {
                    FS.log_e("ListPopupWindow", "Invalid hint position " + this.f46804q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f46792e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.f46787F.setContentView(view);
        } else {
            View view3 = this.f46803p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f46787F.getBackground();
        if (background != null) {
            background.getPadding(this.f46784C);
            Rect rect = this.f46784C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f46796i) {
                this.f46794g = -i14;
            }
        } else {
            this.f46784C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f46794g, this.f46787F.getInputMethodMode() == 2);
        if (this.f46800m || this.f46791d == -1) {
            return iT + i10;
        }
        int i15 = this.f46792e;
        if (i15 == -2) {
            int i16 = this.f46788a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f46784C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f46788a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f46784C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f46790c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f46790c.getPaddingTop() + this.f46790c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int t(View view, int i10, boolean z10) {
        return c.a(this.f46787F, view, i10, z10);
    }

    public boolean A() {
        return this.f46786E;
    }

    public void C(View view) {
        this.f46806s = view;
    }

    public void D(int i10) {
        this.f46787F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.f46787F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.f46784C);
        Rect rect = this.f46784C;
        this.f46792e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f46799l = i10;
    }

    public void G(Rect rect) {
        this.f46785D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.f46787F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.f46786E = z10;
        this.f46787F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.f46787F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f46808u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f46809v = onItemSelectedListener;
    }

    public void O(int i10) {
        this.f46804q = i10;
    }

    public void P(int i10) {
        DropDownListView dropDownListView = this.f46790c;
        if (!b() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i10);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f46792e = i10;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return this.f46787F.isShowing();
    }

    public void c(Drawable drawable) {
        this.f46787F.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f46793f;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.f46787F.dismiss();
        B();
        this.f46787F.setContentView(null);
        this.f46790c = null;
        this.f46783B.removeCallbacks(this.f46810w);
    }

    public void f(int i10) {
        this.f46793f = i10;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        return this.f46790c;
    }

    public Drawable h() {
        return this.f46787F.getBackground();
    }

    public void j(int i10) {
        this.f46794g = i10;
        this.f46796i = true;
    }

    public int m() {
        if (this.f46796i) {
            return this.f46794g;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f46805r;
        if (dataSetObserver == null) {
            this.f46805r = new f();
        } else {
            ListAdapter listAdapter2 = this.f46789b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f46789b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f46805r);
        }
        DropDownListView dropDownListView = this.f46790c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f46789b);
        }
    }

    public void q() {
        DropDownListView dropDownListView = this.f46790c;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    DropDownListView r(Context context, boolean z10) {
        return new DropDownListView(context, z10);
    }

    public View s() {
        return this.f46806s;
    }

    public int y() {
        return this.f46792e;
    }

    public boolean z() {
        return this.f46787F.getInputMethodMode() == 2;
    }

    public B(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f46791d = -2;
        this.f46792e = -2;
        this.f46795h = 1002;
        this.f46799l = 0;
        this.f46800m = false;
        this.f46801n = false;
        this.f46802o = a.e.API_PRIORITY_OTHER;
        this.f46804q = 0;
        this.f46810w = new i();
        this.f46811x = new h();
        this.f46812y = new g();
        this.f46813z = new e();
        this.f46784C = new Rect();
        this.f46788a = context;
        this.f46783B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136653t1, i10, i11);
        this.f46793f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14587j.f136658u1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14587j.f136663v1, 0);
        this.f46794g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f46796i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C5776j c5776j = new C5776j(context, attributeSet, i10, i11);
        this.f46787F = c5776j;
        c5776j.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int iP = p();
        boolean z10 = z();
        androidx.core.widget.j.b(this.f46787F, this.f46795h);
        boolean z11 = true;
        if (this.f46787F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f46792e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i14 = this.f46791d;
                if (i14 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        PopupWindow popupWindow = this.f46787F;
                        if (this.f46792e == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        popupWindow.setWidth(i13);
                        this.f46787F.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.f46787F;
                        if (this.f46792e == -1) {
                            i12 = -1;
                        } else {
                            i12 = 0;
                        }
                        popupWindow2.setWidth(i12);
                        this.f46787F.setHeight(-1);
                    }
                } else if (i14 != -2) {
                    iP = i14;
                }
                PopupWindow popupWindow3 = this.f46787F;
                if (this.f46801n || this.f46800m) {
                    z11 = false;
                }
                popupWindow3.setOutsideTouchable(z11);
                PopupWindow popupWindow4 = this.f46787F;
                View viewS = s();
                int i15 = this.f46793f;
                int i16 = this.f46794g;
                if (width < 0) {
                    i10 = -1;
                } else {
                    i10 = width;
                }
                if (iP < 0) {
                    i11 = -1;
                } else {
                    i11 = iP;
                }
                popupWindow4.update(viewS, i15, i16, i10, i11);
                return;
            }
            return;
        }
        int width2 = this.f46792e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i17 = this.f46791d;
        if (i17 == -1) {
            iP = -1;
        } else if (i17 != -2) {
            iP = i17;
        }
        this.f46787F.setWidth(width2);
        this.f46787F.setHeight(iP);
        N(true);
        PopupWindow popupWindow5 = this.f46787F;
        if (this.f46801n || this.f46800m) {
            z11 = false;
        }
        popupWindow5.setOutsideTouchable(z11);
        this.f46787F.setTouchInterceptor(this.f46811x);
        if (this.f46798k) {
            androidx.core.widget.j.a(this.f46787F, this.f46797j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f46781H;
            if (method != null) {
                try {
                    method.invoke(this.f46787F, this.f46785D);
                } catch (Exception e10) {
                    FS.log_e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f46787F, this.f46785D);
        }
        androidx.core.widget.j.c(this.f46787F, s(), this.f46793f, this.f46794g, this.f46799l);
        this.f46790c.setSelection(-1);
        if (!this.f46786E || this.f46790c.isInTouchMode()) {
            q();
        }
        if (!this.f46786E) {
            this.f46783B.post(this.f46813z);
        }
    }

    public Object u() {
        if (!b()) {
            return null;
        }
        return this.f46790c.getSelectedItem();
    }

    public long v() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f46790c.getSelectedItemId();
    }

    public int w() {
        if (!b()) {
            return -1;
        }
        return this.f46790c.getSelectedItemPosition();
    }

    public View x() {
        if (!b()) {
            return null;
        }
        return this.f46790c.getSelectedView();
    }
}
