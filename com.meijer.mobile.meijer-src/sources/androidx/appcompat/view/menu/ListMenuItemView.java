package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.M;
import i.C14578a;
import i.C14583f;
import i.C14584g;
import i.C14587j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private h f46374a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f46375b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f46376c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f46377d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f46378e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f46379f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f46380g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f46381h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f46382i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f46383j;

    /* renamed from: k, reason: collision with root package name */
    private int f46384k;

    /* renamed from: l, reason: collision with root package name */
    private Context f46385l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f46386m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f46387n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f46388o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f46389p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46390q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136267G);
    }

    private void a(View view) {
        c(view, -1);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        M mV = M.v(getContext(), attributeSet, C14587j.f136564b2, i10, 0);
        this.f46383j = mV.g(C14587j.f136574d2);
        this.f46384k = mV.n(C14587j.f136569c2, -1);
        this.f46386m = mV.a(C14587j.f136579e2, false);
        this.f46385l = context;
        this.f46387n = mV.g(C14587j.f136584f2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C14578a.f136263C, 0);
        this.f46388o = typedArrayObtainStyledAttributes.hasValue(0);
        mV.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(View view, int i10) {
        LinearLayout linearLayout = this.f46382i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private LayoutInflater getInflater() {
        if (this.f46389p == null) {
            this.f46389p = LayoutInflater.from(getContext());
        }
        return this.f46389p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f46380g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f46381h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f46381h.getLayoutParams();
        rect.top += this.f46381h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(h hVar, int i10) {
        this.f46374a = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.i(this));
        setCheckable(hVar.isCheckable());
        h(hVar.A(), hVar.g());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f46374a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f46374a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f46379f.setText(this.f46374a.h());
        }
        if (this.f46379f.getVisibility() != i10) {
            this.f46379f.setVisibility(i10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f46375b != null && this.f46386m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f46375b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f46376c == null && this.f46378e == null) {
            return;
        }
        if (this.f46374a.m()) {
            if (this.f46376c == null) {
                g();
            }
            compoundButton = this.f46376c;
            view = this.f46378e;
        } else {
            if (this.f46378e == null) {
                d();
            }
            compoundButton = this.f46378e;
            view = this.f46376c;
        }
        if (z10) {
            compoundButton.setChecked(this.f46374a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f46378e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f46376c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f46374a.m()) {
            if (this.f46376c == null) {
                g();
            }
            compoundButton = this.f46376c;
        } else {
            if (this.f46378e == null) {
                d();
            }
            compoundButton = this.f46378e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f46390q = z10;
        this.f46386m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f46381h;
        if (imageView != null) {
            imageView.setVisibility((this.f46388o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f46374a.z() || this.f46390q;
        if (z10 || this.f46386m) {
            ImageView imageView = this.f46375b;
            if (imageView == null && drawable == null && !this.f46386m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f46386m) {
                this.f46375b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f46375b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f46375b.getVisibility() != 0) {
                this.f46375b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f46377d.getVisibility() != 8) {
                this.f46377d.setVisibility(8);
            }
        } else {
            this.f46377d.setText(charSequence);
            if (this.f46377d.getVisibility() != 0) {
                this.f46377d.setVisibility(0);
            }
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C14584g.f136412h, (ViewGroup) this, false);
        this.f46378e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(C14584g.f136413i, (ViewGroup) this, false);
        this.f46375b = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C14584g.f136415k, (ViewGroup) this, false);
        this.f46376c = radioButton;
        a(radioButton);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f46383j);
        TextView textView = (TextView) findViewById(C14583f.f136375D);
        this.f46377d = textView;
        int i10 = this.f46384k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f46385l, i10);
        }
        this.f46379f = (TextView) findViewById(C14583f.f136402x);
        ImageView imageView = (ImageView) findViewById(C14583f.f136372A);
        this.f46380g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f46387n);
        }
        this.f46381h = (ImageView) findViewById(C14583f.f136396r);
        this.f46382i = (LinearLayout) findViewById(C14583f.f136390l);
    }
}
