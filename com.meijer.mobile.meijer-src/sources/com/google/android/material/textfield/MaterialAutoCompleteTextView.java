package com.google.android.material.textfield;

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
import ce.C6503b;
import d2.C13595a;
import java.util.List;
import ke.C15121a;
import qe.C16634c;
import te.C17234h;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    private final androidx.appcompat.widget.B f88561e;

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f88562f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f88563g;

    /* renamed from: h, reason: collision with root package name */
    private final int f88564h;

    /* renamed from: i, reason: collision with root package name */
    private final float f88565i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f88566j;

    /* renamed from: k, reason: collision with root package name */
    private int f88567k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f88568l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.l(i10 < 0 ? materialAutoCompleteTextView.f88561e.u() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f88561e.x();
                    i10 = MaterialAutoCompleteTextView.this.f88561e.w();
                    j10 = MaterialAutoCompleteTextView.this.f88561e.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f88561e.getListView(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f88561e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name */
        private ColorStateList f88570a;

        /* renamed from: b, reason: collision with root package name */
        private ColorStateList f88571b;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f88567k != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f88568l != null;
        }

        private ColorStateList a() {
            if (c() && d()) {
                int[] iArr = {R.attr.state_hovered, -16842919};
                int[] iArr2 = {R.attr.state_selected, -16842919};
                int colorForState = MaterialAutoCompleteTextView.this.f88568l.getColorForState(iArr2, 0);
                int colorForState2 = MaterialAutoCompleteTextView.this.f88568l.getColorForState(iArr, 0);
                return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C15121a.i(MaterialAutoCompleteTextView.this.f88567k, colorForState), C15121a.i(MaterialAutoCompleteTextView.this.f88567k, colorForState2), MaterialAutoCompleteTextView.this.f88567k});
            }
            return null;
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f88567k);
            if (this.f88571b != null) {
                C13595a.o(colorDrawable, this.f88570a);
                return new RippleDrawable(this.f88571b, colorDrawable, null);
            }
            return colorDrawable;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f88568l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f88571b = e();
            this.f88570a = a();
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
        this(context, attributeSet, C6503b.f61524c);
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C17867a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f88563g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.s.i(context2, attributeSet, ce.l.f62370u3, i10, ce.k.f61808i, new int[0]);
        if (typedArrayI.hasValue(ce.l.f62382v3) && typedArrayI.getInt(ce.l.f62382v3, 0) == 0) {
            setKeyListener(null);
        }
        this.f88564h = typedArrayI.getResourceId(ce.l.f62418y3, ce.h.f61749t);
        this.f88565i = typedArrayI.getDimensionPixelOffset(ce.l.f62394w3, ce.d.f61631m0);
        if (typedArrayI.hasValue(ce.l.f62406x3)) {
            this.f88566j = ColorStateList.valueOf(typedArrayI.getColor(ce.l.f62406x3, 0));
        }
        this.f88567k = typedArrayI.getColor(ce.l.f62430z3, 0);
        this.f88568l = C16634c.a(context2, typedArrayI, ce.l.f61830A3);
        this.f88562f = (AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(context2);
        this.f88561e = b10;
        b10.I(true);
        b10.C(this);
        b10.H(2);
        b10.n(getAdapter());
        b10.K(new a());
        if (typedArrayI.hasValue(ce.l.f61842B3)) {
            setSimpleItems(typedArrayI.getResourceId(ce.l.f61842B3, 0));
        }
        typedArrayI.recycle();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f88562f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f88562f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f88562f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f88566j;
    }

    public float getPopupElevation() {
        return this.f88565i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f88567k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f88568l;
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f88566j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C17234h) {
            ((C17234h) dropDownBackground).b0(this.f88566j);
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f88567k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f88568l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f88564h, strArr));
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
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f88561e.w()) + 15);
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
        Drawable drawableH = this.f88561e.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f88563g);
            Rect rect = this.f88563g;
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
            this.f88561e.dismiss();
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
        this.f88561e.dismiss();
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
        this.f88561e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        androidx.appcompat.widget.B b10 = this.f88561e;
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
        this.f88561e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f88561e.a();
        } else {
            super.showDropDown();
        }
    }
}
