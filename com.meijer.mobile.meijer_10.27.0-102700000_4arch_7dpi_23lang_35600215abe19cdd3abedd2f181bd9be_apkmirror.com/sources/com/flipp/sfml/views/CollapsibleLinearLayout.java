package com.flipp.sfml.views;

import Ra.g;
import Ra.h;
import Ra.i;
import Sa.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fullstory.FS;
import q2.y;

/* loaded from: classes4.dex */
public class CollapsibleLinearLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    private static final String f64211j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f64212k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f64213l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f64214m;

    /* renamed from: n, reason: collision with root package name */
    private static final String f64215n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f64216o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f64217p;

    /* renamed from: a, reason: collision with root package name */
    private TextView f64218a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f64219b;

    /* renamed from: c, reason: collision with root package name */
    private d f64220c;

    /* renamed from: d, reason: collision with root package name */
    private String f64221d;

    /* renamed from: e, reason: collision with root package name */
    private String f64222e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f64223f;

    /* renamed from: g, reason: collision with root package name */
    private int f64224g;

    /* renamed from: h, reason: collision with root package name */
    private String f64225h;

    /* renamed from: i, reason: collision with root package name */
    private c.a f64226i;

    class a extends View.AccessibilityDelegate {
        a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
            CharSequence text;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            y yVar = new y((Object) accessibilityNodeInfo);
            if (!CollapsibleLinearLayout.this.f64219b) {
                text = CollapsibleLinearLayout.this.getResources().getText(i.f32004b);
            } else {
                text = CollapsibleLinearLayout.this.getResources().getText(i.f32003a);
            }
            yVar.b(new y.a(16, text));
        }
    }

    class b implements c.a {
        b() {
        }

        @Override // Sa.c.a
        public void a() {
            CollapsibleLinearLayout.this.f64226i = null;
            CollapsibleLinearLayout.this.f64225h = null;
        }

        @Override // Sa.c.a
        public void b(Bitmap bitmap) {
            CollapsibleLinearLayout.this.f64226i = null;
            CollapsibleLinearLayout.this.f64223f = new BitmapDrawable(CollapsibleLinearLayout.this.getResources(), bitmap);
            CollapsibleLinearLayout.this.j();
        }
    }

    private void d() {
        setOrientation(1);
        View.inflate(getContext(), h.f31998a, this);
        TextView textView = (TextView) findViewById(g.f31987b);
        this.f64218a = textView;
        textView.setOnClickListener(this);
        this.f64218a.setVisibility(0);
        FS.setAccessibilityDelegate(this.f64218a, new a());
        setLayoutTransition(new LayoutTransition());
    }

    private void i() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt == this.f64218a) {
                h();
                f();
            } else {
                childAt.setVisibility(this.f64219b ? 0 : 8);
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64229a;

        static {
            int[] iArr = new int[d.values().length];
            f64229a = iArr;
            try {
                iArr[d.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64229a[d.EXPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        REPLACE("replace"),
        EXPOSE("expose");


        /* renamed from: a, reason: collision with root package name */
        private String f64233a;

        d(String str) {
            this.f64233a = str;
        }

        public static d a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (d dVar : values()) {
                if (dVar.f64233a.equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            return null;
        }
    }

    static {
        String simpleName = CollapsibleLinearLayout.class.getSimpleName();
        f64211j = simpleName + ".SAVE_STATE_SUPER";
        f64212k = simpleName + ".SAVE_EXPOSE_STATE";
        f64213l = simpleName + ".SAVE_TRIGGER_TITLE_STATE";
        f64214m = simpleName + ".SAVE_EXPOSE_TRIGGER_TITLE_STATE";
        f64215n = simpleName + ".SAVE_COLLAPSE_TYPE_STATE";
        f64216o = simpleName + ".SAVE_ICON_STATE";
        f64217p = simpleName + ".SAVE_ICON_URL_STATE";
    }

    private void f() {
        if (this.f64218a == null) {
            return;
        }
        if (!this.f64219b || TextUtils.isEmpty(this.f64222e)) {
            this.f64218a.setText(this.f64221d);
        } else {
            this.f64218a.setText(this.f64222e);
        }
    }

    private void h() {
        if (this.f64218a == null) {
            return;
        }
        if (c.f64229a[this.f64220c.ordinal()] != 1) {
            this.f64218a.setVisibility(0);
        } else {
            this.f64218a.setVisibility(this.f64219b ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        TextView textView = this.f64218a;
        if (textView == null || this.f64223f == null) {
            return;
        }
        int textSize = (int) textView.getTextSize();
        this.f64223f.setBounds(0, 0, (int) (textSize * (this.f64223f.getIntrinsicWidth() / this.f64223f.getIntrinsicHeight())), textSize);
        this.f64218a.setCompoundDrawables(this.f64223f, null, null, null);
        f();
    }

    private void k() {
        if (this.f64218a == null) {
            return;
        }
        if (this.f64224g <= 0) {
            if (TextUtils.isEmpty(this.f64225h)) {
                return;
            }
            this.f64226i = new b();
            ((Sa.c) Qa.c.c(Sa.c.class)).b(this.f64225h, this.f64226i);
            return;
        }
        try {
            this.f64223f = FS.Resources_getDrawable(getResources(), this.f64224g);
            j();
        } catch (Resources.NotFoundException unused) {
            this.f64224g = -1;
            k();
        }
    }

    public void l(int i10, String str) {
        this.f64224g = i10;
        this.f64225h = str;
        k();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f64219b = !this.f64219b;
        CharSequence text = this.f64218a.getText();
        i();
        if (this.f64218a.getText().equals(text)) {
            return;
        }
        this.f64218a.sendAccessibilityEvent(32768);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f64219b = bundle.getBoolean(f64212k);
            String str = f64213l;
            this.f64221d = bundle.getString(str);
            this.f64222e = bundle.getString(str);
            this.f64220c = (d) bundle.get(f64215n);
            this.f64224g = bundle.getInt(f64216o, -1);
            this.f64225h = bundle.getString(f64217p);
            parcelable = bundle.getParcelable(f64211j);
        }
        super.onRestoreInstanceState(parcelable);
        l(this.f64224g, this.f64225h);
        i();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f64211j, super.onSaveInstanceState());
        bundle.putBoolean(f64212k, this.f64219b);
        bundle.putString(f64213l, this.f64221d);
        bundle.putString(f64214m, this.f64222e);
        bundle.putSerializable(f64215n, this.f64220c);
        bundle.putInt(f64216o, this.f64224g);
        bundle.putString(f64217p, this.f64225h);
        return bundle;
    }

    public void setCollapseType(d dVar) {
        if (dVar != null) {
            this.f64220c = dVar;
        } else {
            this.f64220c = d.EXPOSE;
        }
    }

    public void setExposeTriggerTitle(String str) {
        this.f64222e = str;
    }

    public void setTriggerTitle(String str) {
        this.f64221d = str;
    }

    public CollapsibleLinearLayout(Context context) {
        super(context);
        this.f64219b = false;
        this.f64220c = d.EXPOSE;
        d();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        i();
    }
}
