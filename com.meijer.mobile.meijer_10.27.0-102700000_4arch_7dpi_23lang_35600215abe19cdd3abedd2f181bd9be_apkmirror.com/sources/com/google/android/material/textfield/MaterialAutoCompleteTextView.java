package com.google.android.material.textfield;

import ae.C5597b;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.core.view.ViewCompat;
import d2.C13462a;
import ie.C14718a;
import java.util.List;
import oe.C16026c;
import re.C16760h;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    private final androidx.appcompat.widget.B f87721e;

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f87722f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f87723g;

    /* renamed from: h, reason: collision with root package name */
    private final int f87724h;

    /* renamed from: i, reason: collision with root package name */
    private final float f87725i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f87726j;

    /* renamed from: k, reason: collision with root package name */
    private int f87727k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f87728l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.l(i10 < 0 ? materialAutoCompleteTextView.f87721e.u() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f87721e.x();
                    i10 = MaterialAutoCompleteTextView.this.f87721e.w();
                    j10 = MaterialAutoCompleteTextView.this.f87721e.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f87721e.getListView(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f87721e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name */
        private ColorStateList f87730a;

        /* renamed from: b, reason: collision with root package name */
        private ColorStateList f87731b;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f87727k != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f87728l != null;
        }

        private ColorStateList a() {
            if (c() && d()) {
                int[] iArr = {R.attr.state_hovered, -16842919};
                int[] iArr2 = {R.attr.state_selected, -16842919};
                int colorForState = MaterialAutoCompleteTextView.this.f87728l.getColorForState(iArr2, 0);
                int colorForState2 = MaterialAutoCompleteTextView.this.f87728l.getColorForState(iArr, 0);
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C14718a.i(MaterialAutoCompleteTextView.this.f87727k, colorForState), C14718a.i(MaterialAutoCompleteTextView.this.f87727k, colorForState2), MaterialAutoCompleteTextView.this.f87727k});
            }
            return null;
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f87727k);
            if (this.f87731b != null) {
                C13462a.o(colorDrawable, this.f87730a);
                return new RippleDrawable(this.f87731b, colorDrawable, null);
            }
            return colorDrawable;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f87728l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f87731b = e();
            this.f87730a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            Drawable drawableB;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    drawableB = b();
                } else {
                    drawableB = null;
                }
                ViewCompat.q0(textView, drawableB);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44509c);
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C17250a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f87723g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.s.i(context2, attributeSet, ae.l.f45355u3, i10, ae.k.f44793i, new int[0]);
        if (typedArrayI.hasValue(ae.l.f45367v3) && typedArrayI.getInt(ae.l.f45367v3, 0) == 0) {
            setKeyListener(null);
        }
        this.f87724h = typedArrayI.getResourceId(ae.l.f45403y3, ae.h.f44734t);
        this.f87725i = typedArrayI.getDimensionPixelOffset(ae.l.f45379w3, ae.d.f44616m0);
        if (typedArrayI.hasValue(ae.l.f45391x3)) {
            this.f87726j = ColorStateList.valueOf(typedArrayI.getColor(ae.l.f45391x3, 0));
        }
        this.f87727k = typedArrayI.getColor(ae.l.f45415z3, 0);
        this.f87728l = C16026c.a(context2, typedArrayI, ae.l.f44815A3);
        this.f87722f = (AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(context2);
        this.f87721e = b10;
        b10.I(true);
        b10.C(this);
        b10.H(2);
        b10.n(getAdapter());
        b10.K(new a());
        if (typedArrayI.hasValue(ae.l.f44827B3)) {
            setSimpleItems(typedArrayI.getResourceId(ae.l.f44827B3, 0));
        }
        typedArrayI.recycle();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f87722f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f87722f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f87722f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f87726j;
    }

    public float getPopupElevation() {
        return this.f87725i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f87727k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f87728l;
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f87726j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C16760h) {
            ((C16760h) dropDownBackground).b0(this.f87726j);
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f87727k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f87728l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f87724h, strArr));
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        if (!i() && !h()) {
            return false;
        }
        return true;
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f87721e.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableH = this.f87721e.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f87723g);
            Rect rect = this.f87723g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f87721e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R()) {
            return textInputLayoutF.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && com.google.android.material.internal.h.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f87721e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f87721e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        androidx.appcompat.widget.B b10 = this.f87721e;
        if (b10 != null) {
            b10.c(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f87721e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f87721e.a();
        } else {
            super.showDropDown();
        }
    }
}
