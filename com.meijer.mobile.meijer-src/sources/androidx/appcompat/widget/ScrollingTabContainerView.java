package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import i.C14578a;

/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j, reason: collision with root package name */
    private static final Interpolator f46966j = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Runnable f46967a;

    /* renamed from: b, reason: collision with root package name */
    private c f46968b;

    /* renamed from: c, reason: collision with root package name */
    LinearLayoutCompat f46969c;

    /* renamed from: d, reason: collision with root package name */
    private Spinner f46970d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46971e;

    /* renamed from: f, reason: collision with root package name */
    int f46972f;

    /* renamed from: g, reason: collision with root package name */
    int f46973g;

    /* renamed from: h, reason: collision with root package name */
    private int f46974h;

    /* renamed from: i, reason: collision with root package name */
    private int f46975i;

    private class TabView extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f46976a;

        /* renamed from: b, reason: collision with root package name */
        private a.c f46977b;

        /* renamed from: c, reason: collision with root package name */
        private TextView f46978c;

        /* renamed from: d, reason: collision with root package name */
        private ImageView f46979d;

        /* renamed from: e, reason: collision with root package name */
        private View f46980e;

        public TabView(Context context, a.c cVar, boolean z10) {
            super(context, null, C14578a.f136282d);
            int[] iArr = {R.attr.background};
            this.f46976a = iArr;
            this.f46977b = cVar;
            M mV = M.v(context, null, iArr, C14578a.f136282d, 0);
            if (mV.s(0)) {
                setBackgroundDrawable(mV.g(0));
            }
            mV.x();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f46977b = cVar;
            c();
        }

        public a.c b() {
            return this.f46977b;
        }

        public void c() {
            a.c cVar = this.f46977b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f46980e = viewB;
                TextView textView = this.f46978c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f46979d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f46979d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f46980e;
            if (view != null) {
                removeView(view);
                this.f46980e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f46979d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f46979d = appCompatImageView;
                }
                this.f46979d.setImageDrawable(drawableC);
                this.f46979d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f46979d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f46979d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f46978c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f46978c.setText((CharSequence) null);
                }
            } else {
                if (this.f46978c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C14578a.f136283e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f46978c = appCompatTextView;
                }
                this.f46978c.setText(charSequenceD);
                this.f46978c.setVisibility(0);
            }
            ImageView imageView3 = this.f46979d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            S.a(this, zIsEmpty ? cVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.f46972f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = ScrollingTabContainerView.this.f46972f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11;
            if (isSelected() != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f46982a;

        a(View view) {
            this.f46982a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f46982a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f46982a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f46967a = null;
        }
    }

    private class b extends BaseAdapter {
        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f46969c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((TabView) ScrollingTabContainerView.this.f46969c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.c((a.c) getItem(i10), true);
            }
            ((TabView) view).a((a.c) getItem(i10));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).b().e();
            int childCount = ScrollingTabContainerView.this.f46969c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ScrollingTabContainerView.this.f46969c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }

        c() {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C14578a.f136286h);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f46970d;
        return spinner != null && spinner.getParent() == this;
    }

    public void a(int i10) {
        View childAt = this.f46969c.getChildAt(i10);
        Runnable runnable = this.f46967a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f46967a = aVar;
        post(aVar);
    }

    TabView c(a.c cVar, boolean z10) {
        TabView tabView = new TabView(getContext(), cVar, z10);
        if (z10) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f46974h));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.f46968b == null) {
            this.f46968b = new c();
        }
        tabView.setOnClickListener(this.f46968b);
        return tabView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((TabView) view).b().e();
    }

    public void setAllowCollapse(boolean z10) {
        this.f46971e = z10;
    }

    public void setContentHeight(int i10) {
        this.f46974h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f46975i = i10;
        int childCount = this.f46969c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f46969c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f46970d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f46970d == null) {
            this.f46970d = b();
        }
        removeView(this.f46969c);
        addView(this.f46970d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f46970d.getAdapter() == null) {
            this.f46970d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f46967a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f46967a = null;
        }
        this.f46970d.setSelection(this.f46975i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f46970d);
        addView(this.f46969c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f46970d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f46967a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f46973g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f46967a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        setFillViewport(z10);
        int childCount = this.f46969c.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f46972f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f46972f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f46972f = Math.min(this.f46972f, this.f46973g);
        } else {
            this.f46972f = -1;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f46974h, 1073741824);
        if (!z10 && this.f46971e) {
            this.f46969c.measure(0, iMakeMeasureSpec);
            if (this.f46969c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f46975i);
        }
    }
}
