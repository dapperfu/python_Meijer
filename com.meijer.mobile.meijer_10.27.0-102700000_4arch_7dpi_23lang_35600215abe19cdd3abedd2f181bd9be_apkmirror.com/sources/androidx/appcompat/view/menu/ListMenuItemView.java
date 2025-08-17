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
import i.C14575a;
import i.C14580f;
import i.C14581g;
import i.C14584j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private h f46150a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f46151b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f46152c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f46153d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f46154e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f46155f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f46156g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f46157h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f46158i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f46159j;

    /* renamed from: k, reason: collision with root package name */
    private int f46160k;

    /* renamed from: l, reason: collision with root package name */
    private Context f46161l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f46162m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f46163n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f46164o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f46165p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46166q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136510G);
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
        M mV = M.v(getContext(), attributeSet, C14584j.f136807b2, i10, 0);
        this.f46159j = mV.g(C14584j.f136817d2);
        this.f46160k = mV.n(C14584j.f136812c2, -1);
        this.f46162m = mV.a(C14584j.f136822e2, false);
        this.f46161l = context;
        this.f46163n = mV.g(C14584j.f136827f2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C14575a.f136506C, 0);
        this.f46164o = typedArrayObtainStyledAttributes.hasValue(0);
        mV.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(View view, int i10) {
        LinearLayout linearLayout = this.f46158i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private LayoutInflater getInflater() {
        if (this.f46165p == null) {
            this.f46165p = LayoutInflater.from(getContext());
        }
        return this.f46165p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f46156g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f46157h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f46157h.getLayoutParams();
        rect.top += this.f46157h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(h hVar, int i10) {
        this.f46150a = hVar;
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
        return this.f46150a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f46150a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f46155f.setText(this.f46150a.h());
        }
        if (this.f46155f.getVisibility() != i10) {
            this.f46155f.setVisibility(i10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f46151b != null && this.f46162m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f46151b.getLayoutParams();
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
        if (!z10 && this.f46152c == null && this.f46154e == null) {
            return;
        }
        if (this.f46150a.m()) {
            if (this.f46152c == null) {
                g();
            }
            compoundButton = this.f46152c;
            view = this.f46154e;
        } else {
            if (this.f46154e == null) {
                d();
            }
            compoundButton = this.f46154e;
            view = this.f46152c;
        }
        if (z10) {
            compoundButton.setChecked(this.f46150a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f46154e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f46152c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f46150a.m()) {
            if (this.f46152c == null) {
                g();
            }
            compoundButton = this.f46152c;
        } else {
            if (this.f46154e == null) {
                d();
            }
            compoundButton = this.f46154e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f46166q = z10;
        this.f46162m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f46157h;
        if (imageView != null) {
            imageView.setVisibility((this.f46164o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f46150a.z() || this.f46166q;
        if (z10 || this.f46162m) {
            ImageView imageView = this.f46151b;
            if (imageView == null && drawable == null && !this.f46162m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f46162m) {
                this.f46151b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f46151b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f46151b.getVisibility() != 0) {
                this.f46151b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f46153d.getVisibility() != 8) {
                this.f46153d.setVisibility(8);
            }
        } else {
            this.f46153d.setText(charSequence);
            if (this.f46153d.getVisibility() != 0) {
                this.f46153d.setVisibility(0);
            }
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C14581g.f136655h, (ViewGroup) this, false);
        this.f46154e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(C14581g.f136656i, (ViewGroup) this, false);
        this.f46151b = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C14581g.f136658k, (ViewGroup) this, false);
        this.f46152c = radioButton;
        a(radioButton);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f46159j);
        TextView textView = (TextView) findViewById(C14580f.f136618D);
        this.f46153d = textView;
        int i10 = this.f46160k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f46161l, i10);
        }
        this.f46155f = (TextView) findViewById(C14580f.f136645x);
        ImageView imageView = (ImageView) findViewById(C14580f.f136615A);
        this.f46156g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f46163n);
        }
        this.f46157h = (ImageView) findViewById(C14580f.f136639r);
        this.f46158i = (LinearLayout) findViewById(C14580f.f136633l);
    }
}
