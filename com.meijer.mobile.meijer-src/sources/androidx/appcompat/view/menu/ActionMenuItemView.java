package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.S;
import i.C14587j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h, reason: collision with root package name */
    h f46359h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f46360i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f46361j;

    /* renamed from: k, reason: collision with root package name */
    f.b f46362k;

    /* renamed from: l, reason: collision with root package name */
    private A f46363l;

    /* renamed from: m, reason: collision with root package name */
    b f46364m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46365n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f46366o;

    /* renamed from: p, reason: collision with root package name */
    private int f46367p;

    /* renamed from: q, reason: collision with root package name */
    private int f46368q;

    /* renamed from: r, reason: collision with root package name */
    private int f46369r;

    private class a extends A {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.A
        public ShowableListMenu d() {
            b bVar = ActionMenuItemView.this.f46364m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.A
        protected boolean e() {
            ShowableListMenu showableListMenuD;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f46362k;
            return bVar != null && bVar.c(actionMenuItemView.f46359h) && (showableListMenuD = d()) != null && showableListMenuD.b();
        }
    }

    public static abstract class b {
        public abstract ShowableListMenu a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f46365n = u();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136661v, i10, 0);
        this.f46367p = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136666w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f46369r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f46368q = -1;
        setSaveEnabled(false);
    }

    private void v() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f46360i);
        if (this.f46361j != null && (!this.f46359h.B() || (!this.f46365n && !this.f46366o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f46360i : null);
        CharSequence contentDescription = this.f46359h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f46359h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f46359h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            S.a(this, z12 ? null : this.f46359h.getTitle());
        } else {
            S.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(h hVar, int i10) {
        this.f46359h = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.i(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f46363l == null) {
            this.f46363l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f46359h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        f.b bVar = this.f46362k;
        if (bVar != null) {
            bVar.c(this.f46359h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        A a10;
        if (this.f46359h.hasSubMenu() && (a10 = this.f46363l) != null && a10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f46366o != z10) {
            this.f46366o = z10;
            h hVar = this.f46359h;
            if (hVar != null) {
                hVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f46361j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f46369r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        v();
    }

    public void setItemInvoker(f.b bVar) {
        this.f46362k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f46368q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f46364m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f46360i = charSequence;
        v();
    }

    private boolean u() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            if ((i10 < 640 || i11 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean d() {
        return t();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean f() {
        if (t() && this.f46359h.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f46365n = u();
        v();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMin;
        int i12;
        boolean zT = t();
        if (zT && (i12 = this.f46368q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, this.f46367p);
        } else {
            iMin = this.f46367p;
        }
        if (mode != 1073741824 && this.f46367p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zT && this.f46361j != null) {
            super.setPadding((getMeasuredWidth() - this.f46361j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean t() {
        return !TextUtils.isEmpty(getText());
    }
}
