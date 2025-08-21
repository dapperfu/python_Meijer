package android.view;

import Ta.A;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.ViewCompat;
import com.flipp.sfml.views.CategoryStateWrapper;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q2.y;

/* loaded from: classes.dex */
public class WayfinderView extends FrameLayout implements PopupMenu.c, View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    private PopupMenu f45824A;

    /* renamed from: a, reason: collision with root package name */
    private View f45825a;

    /* renamed from: b, reason: collision with root package name */
    private int f45826b;

    /* renamed from: c, reason: collision with root package name */
    private View f45827c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f45828d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<CategoryStateWrapper> f45829e;

    /* renamed from: f, reason: collision with root package name */
    private View f45830f;

    /* renamed from: g, reason: collision with root package name */
    private GestureDetector f45831g;

    /* renamed from: h, reason: collision with root package name */
    private GestureDetector f45832h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f45833i;

    /* renamed from: j, reason: collision with root package name */
    private CategoryStateWrapper f45834j;

    /* renamed from: k, reason: collision with root package name */
    private int f45835k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f45836l;

    /* renamed from: m, reason: collision with root package name */
    private int f45837m;

    /* renamed from: n, reason: collision with root package name */
    private int f45838n;

    /* renamed from: o, reason: collision with root package name */
    private long f45839o;

    /* renamed from: p, reason: collision with root package name */
    private int f45840p;

    /* renamed from: q, reason: collision with root package name */
    private OverScroller f45841q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<k> f45842r;

    /* renamed from: s, reason: collision with root package name */
    private List<A.a> f45843s;

    /* renamed from: t, reason: collision with root package name */
    private HashMap<View, View> f45844t;

    /* renamed from: u, reason: collision with root package name */
    private HashMap<View, A.a> f45845u;

    /* renamed from: v, reason: collision with root package name */
    private View f45846v;

    /* renamed from: w, reason: collision with root package name */
    private int f45847w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f45848x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f45849y;

    /* renamed from: z, reason: collision with root package name */
    private HashMap<View, Pair<Integer, Integer>> f45850z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            WayfinderView.this.f45828d.setVisibility(4);
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
            CharSequence text;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            y yVar = new y((Object) accessibilityNodeInfo);
            if (WayfinderView.this.f45829e.isEmpty()) {
                text = WayfinderView.this.getResources().getText(Ta.i.f36010h);
            } else {
                text = WayfinderView.this.getResources().getText(Ta.i.f36009g);
            }
            yVar.b(new y.a(16, text));
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WayfinderView.this.z();
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return WayfinderView.this.f45848x;
        }
    }

    class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f45855a = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f45855a = true;
            return false;
        }

        e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            WayfinderView.this.f45838n = -1;
            WayfinderView.this.f45839o = System.currentTimeMillis();
            WayfinderView.this.k();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (this.f45855a) {
                WayfinderView.this.E();
                this.f45855a = false;
            }
            WayfinderView.this.t();
            WayfinderView.this.f45839o = 0L;
            return false;
        }
    }

    class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f45857a = false;

        /* renamed from: b, reason: collision with root package name */
        double f45858b;

        /* renamed from: c, reason: collision with root package name */
        double f45859c;

        /* renamed from: d, reason: collision with root package name */
        double f45860d;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f45857a = true;
            return true;
        }

        f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            WayfinderView.this.t();
            if (this.f45857a) {
                this.f45857a = false;
                this.f45858b = WayfinderView.this.getScrollExtend();
                this.f45859c = WayfinderView.this.getScrollRange();
                this.f45860d = WayfinderView.this.getScrollOffset();
            }
            double y10 = motionEvent2.getY();
            double d10 = this.f45858b;
            WayfinderView.this.f45825a.scrollTo(WayfinderView.this.f45825a.getScrollX(), (int) ((y10 / d10) * (this.f45859c - d10)));
            return true;
        }
    }

    class g implements Comparator<Pair<View, Integer>> {
        g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<View, Integer> pair, Pair<View, Integer> pair2) {
            Object obj = pair.second;
            int iIntValue = obj == null ? 0 : ((Integer) obj).intValue();
            Object obj2 = pair2.second;
            int iIntValue2 = obj2 == null ? 0 : ((Integer) obj2).intValue();
            if (iIntValue < iIntValue2) {
                return -1;
            }
            return iIntValue == iIntValue2 ? 0 : 1;
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WayfinderView.this.k();
        }
    }

    class i extends View.AccessibilityDelegate {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WayfinderView.this.t();
            }
        }

        i() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            WayfinderView.this.post(new a());
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            WayfinderView.this.f45828d.getChildAt(0).sendAccessibilityEvent(8);
        }
    }

    public interface k {
        void a(boolean z10, A.a aVar);

        void b(A.a aVar);
    }

    public WayfinderView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public void A(double d10) {
        CategoryStateWrapper categoryStateWrapper;
        for (int i10 = 0; i10 < this.f45829e.size(); i10++) {
            this.f45829e.get(i10).setHighlighted(false);
        }
        int size = this.f45829e.size() - 1;
        while (true) {
            if (size < 0) {
                categoryStateWrapper = null;
                break;
            } else {
                if (i(this.f45829e.get(size), d10)) {
                    categoryStateWrapper = this.f45829e.get(size);
                    this.f45829e.get(size).setHighlighted(true);
                    break;
                }
                size--;
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45828d.getLayoutParams();
        int iMax = Math.max(((ViewGroup.MarginLayoutParams) this.f45827c.getLayoutParams()).topMargin, this.f45840p);
        this.f45846v = categoryStateWrapper;
        marginLayoutParams.topMargin = categoryStateWrapper == null ? Math.max(this.f45840p, (iMax + (this.f45827c.getHeight() / 2)) - (this.f45828d.getHeight() / 2)) : (this.f45827c.getHeight() / 2) + ((-categoryStateWrapper.getTop()) - (categoryStateWrapper.getHeight() / 2)) + Math.min(iMax, (this.f45825a.getHeight() - categoryStateWrapper.getHeight()) - this.f45840p);
        this.f45828d.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
    }

    public WayfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private CategoryStateWrapper c(LayoutInflater layoutInflater, String str) {
        CategoryStateWrapper categoryStateWrapper = new CategoryStateWrapper(getContext());
        TextView textView = (TextView) layoutInflater.inflate(this.f45847w, (ViewGroup) categoryStateWrapper, false);
        textView.setClickable(false);
        textView.setText(str);
        categoryStateWrapper.setOnClickListener(this);
        categoryStateWrapper.addView(textView);
        return categoryStateWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        Pair pair;
        HashMap<View, View> map = this.f45844t;
        if (map == null || map.isEmpty() || this.f45829e.isEmpty()) {
            return;
        }
        float scaleY = this.f45825a.getScaleY();
        if (scaleY == 0.0f) {
            scaleY = 1.0f;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CategoryStateWrapper> it = this.f45829e.iterator();
        while (it.hasNext()) {
            CategoryStateWrapper next = it.next();
            View view = this.f45844t.get(next);
            if (view != null) {
                view.getLocationInWindow(this.f45836l);
                int[] iArr = this.f45836l;
                iArr[1] = (iArr[1] - this.f45837m) + this.f45825a.getScrollY();
                this.f45836l[1] = (int) (r4[1] / scaleY);
                arrayList.add(new Pair(next, Integer.valueOf(this.f45836l[1])));
            }
        }
        Collections.sort(arrayList, new g());
        this.f45850z = new HashMap<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Pair pair2 = (Pair) arrayList.get(i10);
            i10++;
            if (i10 < arrayList.size()) {
                pair = new Pair(pair2.second, ((Pair) arrayList.get(i10)).second);
            } else {
                pair = new Pair(pair2.second, Integer.valueOf(a.e.API_PRIORITY_OTHER));
            }
            this.f45850z.put(pair2.first, pair);
        }
    }

    private void f(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45827c.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        this.f45827c.setLayoutParams(marginLayoutParams);
    }

    private void g(AttributeSet attributeSet) {
        this.f45845u = new HashMap<>();
        this.f45844t = new HashMap<>();
        this.f45842r = new ArrayList<>();
        this.f45833i = new Handler();
        this.f45841q = new OverScroller(getContext());
        this.f45840p = ((Sa.e) Sa.c.c(Sa.e.class)).a(24.0f);
        this.f45829e = new ArrayList<>();
        View.inflate(getContext(), Ta.h.f36002e, this);
        View viewFindViewById = findViewById(Ta.g.f35997l);
        this.f45827c = viewFindViewById;
        FS.setAccessibilityDelegate(viewFindViewById, new b());
        this.f45848x = false;
        this.f45828d = (LinearLayout) findViewById(Ta.g.f35996k);
        View viewFindViewById2 = findViewById(Ta.g.f35986a);
        this.f45830f = viewFindViewById2;
        viewFindViewById2.setOnTouchListener(new d());
        this.f45831g = new GestureDetector(getContext(), new e());
        this.f45832h = new GestureDetector(getContext(), new f());
        l(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double getScrollExtend() {
        return this.f45825a.computeVerticalScrollExtent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double getScrollOffset() {
        return this.f45825a.computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double getScrollRange() {
        return this.f45825a.computeVerticalScrollRange();
    }

    private boolean h(float f10, float f11) {
        return f10 > ((float) this.f45827c.getLeft()) && f10 < ((float) this.f45827c.getRight()) && f11 > ((float) this.f45827c.getTop()) && f11 < ((float) this.f45827c.getBottom());
    }

    private boolean i(View view, double d10) {
        HashMap<View, Pair<Integer, Integer>> map;
        Pair<Integer, Integer> pair;
        return (this.f45825a == null || (map = this.f45850z) == null || (pair = map.get(view)) == null || ((double) (((float) ((Integer) pair.first).intValue()) * this.f45825a.getScaleY())) > d10 || d10 >= ((double) (((float) ((Integer) pair.second).intValue()) * this.f45825a.getScaleY()))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f45825a == null) {
            return;
        }
        t();
        int scrollY = this.f45825a.getScrollY();
        if (System.currentTimeMillis() - this.f45839o < 1000) {
            this.f45838n = scrollY;
            post(new h());
        }
        if (scrollY != this.f45838n) {
            this.f45839o = System.currentTimeMillis();
        }
    }

    private void l(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, Ta.j.f36026P, 0, 0);
        try {
            Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Ta.j.f36027Q);
            if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
                this.f45830f.setBackground(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
            }
            this.f45847w = typedArrayObtainStyledAttributes.getResourceId(Ta.j.f36028R, Ta.h.f36001d);
            Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Ta.j.f36030T);
            if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 != null) {
                ((ImageView) this.f45827c).setImageDrawable(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602);
                this.f45827c.setBackground(null);
            }
            Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Ta.j.f36029S);
            if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 != null) {
                this.f45827c.setBackground(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void n() {
        if (this.f45849y) {
            PopupMenu popupMenu = new PopupMenu(getContext(), this.f45827c);
            popupMenu.c(this);
            Menu menuB = popupMenu.b();
            for (int i10 = 0; i10 < this.f45829e.size(); i10++) {
                menuB.add(0, i10, i10, ((TextView) this.f45829e.get(i10).getChildAt(0)).getText());
            }
            popupMenu.d();
            this.f45824A = popupMenu;
        }
    }

    private boolean q() {
        View view = this.f45825a;
        if (view == null) {
            return false;
        }
        int iComputeVerticalScrollOffset = view.computeVerticalScrollOffset();
        return iComputeVerticalScrollOffset > 0 || iComputeVerticalScrollOffset < (this.f45825a.computeVerticalScrollRange() - this.f45825a.computeVerticalScrollExtent()) - 1;
    }

    private void setThumbFadeTimer(long j10) {
        this.f45833i.removeCallbacksAndMessages(null);
        this.f45833i.postDelayed(new c(), j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        f((int) ((getHeight() - this.f45827c.getHeight()) * (this.f45825a.computeVerticalScrollOffset() / (this.f45825a.computeVerticalScrollRange() - this.f45825a.computeVerticalScrollExtent()))));
        A(r0 + this.f45825a.getScrollY());
    }

    private void v() {
        this.f45833i.removeCallbacksAndMessages(null);
    }

    public boolean C(k kVar) {
        return this.f45842r.remove(kVar);
    }

    protected void D() {
        if (this.f45849y && this.f45829e.size() != 0) {
            if (this.f45828d.getVisibility() != 0) {
                Iterator<k> it = this.f45842r.iterator();
                while (it.hasNext()) {
                    it.next().a(true, this.f45845u.get(this.f45846v));
                }
            }
            if (((Sa.a) Sa.c.c(Sa.a.class)).a(getContext()) || !this.f45849y) {
                n();
                return;
            }
            this.f45828d.setVisibility(0);
            this.f45848x = true;
            float f10 = 0;
            this.f45828d.animate().alpha(1.0f).setListener(new j()).translationX(f10);
            this.f45830f.animate().alpha(1.0f).translationX(f10);
            this.f45826b = this.f45825a.getImportantForAccessibility();
            ViewCompat.w0(this.f45825a, 4);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.f45825a;
        if (view2 != null) {
            FS.setAccessibilityDelegate(view2, null);
        }
        this.f45825a = view;
        if (view != null) {
            this.f45826b = view.getImportantForAccessibility();
            FS.setAccessibilityDelegate(this.f45825a, new i());
        }
        setWayfinderDelegates(this.f45843s);
        super.addView(view, i10, layoutParams);
    }

    public boolean getIsWayfinderEnabled() {
        return this.f45849y;
    }

    public void j(k kVar) {
        if (kVar == null) {
            return;
        }
        this.f45842r.add(kVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!((Sa.a) Sa.c.c(Sa.a.class)).a(getContext()) || !this.f45849y) {
            setThumbFadeTimer(300L);
        }
        if (this.f45850z.get(view) != null) {
            int scrollX = this.f45825a.getScrollX();
            int scrollY = this.f45825a.getScrollY();
            this.f45841q.startScroll(scrollX, scrollY, scrollX, (int) ((((Integer) r0.first).intValue() * this.f45825a.getScaleY()) - scrollY));
            f((int) ((getHeight() - this.f45827c.getHeight()) * (((Integer) r0.first).intValue() / (this.f45825a.computeVerticalScrollRange() - this.f45825a.computeVerticalScrollExtent()))));
            A(((Integer) r0.first).intValue());
        }
        Iterator<k> it = this.f45842r.iterator();
        while (it.hasNext()) {
            it.next().b(this.f45845u.get(view));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zH;
        View view = this.f45825a;
        if (view == null || !view.isVerticalScrollBarEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f45831g.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                setThumbFadeTimer(1500L);
            }
            zH = false;
        } else {
            zH = h(motionEvent.getX(), motionEvent.getY());
        }
        return zH || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.PopupMenu.c
    public boolean onMenuItemClick(MenuItem menuItem) {
        onClick(this.f45829e.get(menuItem.getItemId()));
        return true;
    }

    public void setWayfinderDelegates(List<A.a> list) {
        this.f45845u.clear();
        this.f45844t.clear();
        LinearLayout linearLayout = this.f45828d;
        if (linearLayout == null || this.f45825a == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.f45829e.clear();
        this.f45843s = list;
        if (list == null) {
            return;
        }
        Sa.g gVar = (Sa.g) Sa.c.c(Sa.g.class);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        boolean z10 = ((Sa.a) Sa.c.c(Sa.a.class)).a(getContext()) || !this.f45849y;
        for (int i10 = 0; i10 < list.size(); i10++) {
            A.a aVar = this.f45843s.get(i10);
            String strJ = aVar.j();
            View viewA = !TextUtils.isEmpty(strJ) ? gVar.a(this.f45825a, aVar.i(), Ta.g.f35995j) : null;
            if (viewA != null) {
                CategoryStateWrapper categoryStateWrapperC = c(layoutInflaterFrom, strJ);
                this.f45834j = categoryStateWrapperC;
                this.f45828d.addView(categoryStateWrapperC);
                if (z10) {
                    this.f45834j.setVisibility(8);
                }
                this.f45829e.add(this.f45834j);
                this.f45844t.put(this.f45834j, viewA);
                this.f45845u.put(this.f45834j, aVar);
            }
        }
    }

    public void setWayfinderEnabled(boolean z10) {
        this.f45849y = z10;
        View view = this.f45827c;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            this.f45827c.setFocusable(z10);
        }
        CategoryStateWrapper categoryStateWrapper = this.f45834j;
        if (categoryStateWrapper != null) {
            categoryStateWrapper.setVisibility(z10 ? 0 : 8);
            this.f45834j.setFocusable(z10);
        }
        View view2 = this.f45830f;
        if (view2 != null) {
            view2.setVisibility(z10 ? 0 : 8);
            this.f45830f.setFocusable(z10);
        }
        LinearLayout linearLayout = this.f45828d;
        if (linearLayout != null) {
            linearLayout.setVisibility(z10 ? 0 : 8);
            this.f45828d.setFocusable(z10);
        }
    }

    protected void y() {
        if (!this.f45845u.isEmpty() && this.f45828d.getVisibility() == 0) {
            Iterator<k> it = this.f45842r.iterator();
            while (it.hasNext()) {
                it.next().a(false, this.f45845u.get(this.f45846v));
            }
        }
        PopupMenu popupMenu = this.f45824A;
        if (popupMenu != null) {
            popupMenu.a();
            this.f45824A = null;
        }
        float width = this.f45830f.getWidth() + this.f45827c.getWidth();
        this.f45830f.animate().alpha(0.0f).translationX(width);
        this.f45848x = false;
        this.f45828d.animate().alpha(0.0f).setListener(new a()).translationX(width);
        this.f45825a.setImportantForAccessibility(this.f45826b);
    }

    public void z() {
        if (((Sa.a) Sa.c.c(Sa.a.class)).a(getContext()) || !this.f45849y) {
            return;
        }
        this.f45827c.animate().alpha(0.0f).translationX(this.f45827c.getWidth());
        y();
    }

    public WayfinderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45836l = new int[2];
        this.f45837m = 0;
        this.f45838n = -1;
        this.f45840p = 0;
        this.f45846v = null;
        this.f45847w = Ta.h.f36001d;
        this.f45849y = true;
        g(attributeSet);
    }

    protected void E() {
        if (q() && this.f45849y) {
            this.f45827c.setVisibility(0);
            this.f45827c.animate().alpha(1.0f).translationX(0.0f);
            v();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f45841q.computeScrollOffset()) {
            this.f45825a.scrollTo(this.f45841q.getCurrX(), this.f45841q.getCurrY());
            ViewCompat.d0(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iComputeVerticalScrollRange;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f45825a;
        boolean z11 = false;
        if (view != null) {
            iComputeVerticalScrollRange = view.computeVerticalScrollRange();
        } else {
            iComputeVerticalScrollRange = 0;
        }
        if (this.f45835k != iComputeVerticalScrollRange) {
            z11 = true;
        }
        this.f45835k = iComputeVerticalScrollRange;
        View view2 = this.f45825a;
        if (view2 != null && z10) {
            view2.getLocationOnScreen(this.f45836l);
            this.f45837m = this.f45836l[1];
        }
        if (this.f45850z == null || z10 || z11) {
            e();
        }
        if (z10) {
            this.f45827c.setAlpha(0.0f);
            this.f45830f.setAlpha(0.0f);
            this.f45828d.setVisibility(4);
            z();
        }
        if (!((Sa.a) Sa.c.c(Sa.a.class)).a(getContext()) && this.f45849y) {
            return;
        }
        E();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                setThumbFadeTimer(1500L);
            }
        } else {
            v();
            t();
            D();
        }
        return this.f45832h.onTouchEvent(motionEvent);
    }
}
