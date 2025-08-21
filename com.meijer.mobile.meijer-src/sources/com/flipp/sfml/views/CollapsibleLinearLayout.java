package com.flipp.sfml.views;

import Ta.g;
import Ta.h;
import Ta.i;
import Ua.c;
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
    private static final String f65051j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f65052k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f65053l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f65054m;

    /* renamed from: n, reason: collision with root package name */
    private static final String f65055n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f65056o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f65057p;

    /* renamed from: a, reason: collision with root package name */
    private TextView f65058a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f65059b;

    /* renamed from: c, reason: collision with root package name */
    private d f65060c;

    /* renamed from: d, reason: collision with root package name */
    private String f65061d;

    /* renamed from: e, reason: collision with root package name */
    private String f65062e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f65063f;

    /* renamed from: g, reason: collision with root package name */
    private int f65064g;

    /* renamed from: h, reason: collision with root package name */
    private String f65065h;

    /* renamed from: i, reason: collision with root package name */
    private c.a f65066i;

    class a extends View.AccessibilityDelegate {
        a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
            CharSequence text;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            y yVar = new y((Object) accessibilityNodeInfo);
            if (!CollapsibleLinearLayout.this.f65059b) {
                text = CollapsibleLinearLayout.this.getResources().getText(i.f36004b);
            } else {
                text = CollapsibleLinearLayout.this.getResources().getText(i.f36003a);
            }
            yVar.b(new y.a(16, text));
        }
    }

    class b implements c.a {
        b() {
        }

        @Override // Ua.c.a
        public void a() {
            CollapsibleLinearLayout.this.f65066i = null;
            CollapsibleLinearLayout.this.f65065h = null;
        }

        @Override // Ua.c.a
        public void b(Bitmap bitmap) {
            CollapsibleLinearLayout.this.f65066i = null;
            CollapsibleLinearLayout.this.f65063f = new BitmapDrawable(CollapsibleLinearLayout.this.getResources(), bitmap);
            CollapsibleLinearLayout.this.j();
        }
    }

    private void d() {
        setOrientation(1);
        View.inflate(getContext(), h.f35998a, this);
        TextView textView = (TextView) findViewById(g.f35987b);
        this.f65058a = textView;
        textView.setOnClickListener(this);
        this.f65058a.setVisibility(0);
        FS.setAccessibilityDelegate(this.f65058a, new a());
        setLayoutTransition(new LayoutTransition());
    }

    private void i() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt == this.f65058a) {
                h();
                f();
            } else {
                childAt.setVisibility(this.f65059b ? 0 : 8);
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65069a;

        static {
            int[] iArr = new int[d.values().length];
            f65069a = iArr;
            try {
                iArr[d.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65069a[d.EXPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        REPLACE("replace"),
        EXPOSE("expose");


        /* renamed from: a, reason: collision with root package name */
        private String f65073a;

        d(String str) {
            this.f65073a = str;
        }

        public static d a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (d dVar : values()) {
                if (dVar.f65073a.equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            return null;
        }
    }

    static {
        String simpleName = CollapsibleLinearLayout.class.getSimpleName();
        f65051j = simpleName + ".SAVE_STATE_SUPER";
        f65052k = simpleName + ".SAVE_EXPOSE_STATE";
        f65053l = simpleName + ".SAVE_TRIGGER_TITLE_STATE";
        f65054m = simpleName + ".SAVE_EXPOSE_TRIGGER_TITLE_STATE";
        f65055n = simpleName + ".SAVE_COLLAPSE_TYPE_STATE";
        f65056o = simpleName + ".SAVE_ICON_STATE";
        f65057p = simpleName + ".SAVE_ICON_URL_STATE";
    }

    private void f() {
        if (this.f65058a == null) {
            return;
        }
        if (!this.f65059b || TextUtils.isEmpty(this.f65062e)) {
            this.f65058a.setText(this.f65061d);
        } else {
            this.f65058a.setText(this.f65062e);
        }
    }

    private void h() {
        if (this.f65058a == null) {
            return;
        }
        if (c.f65069a[this.f65060c.ordinal()] != 1) {
            this.f65058a.setVisibility(0);
        } else {
            this.f65058a.setVisibility(this.f65059b ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        TextView textView = this.f65058a;
        if (textView == null || this.f65063f == null) {
            return;
        }
        int textSize = (int) textView.getTextSize();
        this.f65063f.setBounds(0, 0, (int) (textSize * (this.f65063f.getIntrinsicWidth() / this.f65063f.getIntrinsicHeight())), textSize);
        this.f65058a.setCompoundDrawables(this.f65063f, null, null, null);
        f();
    }

    private void k() {
        if (this.f65058a == null) {
            return;
        }
        if (this.f65064g <= 0) {
            if (TextUtils.isEmpty(this.f65065h)) {
                return;
            }
            this.f65066i = new b();
            ((Ua.c) Sa.c.c(Ua.c.class)).b(this.f65065h, this.f65066i);
            return;
        }
        try {
            this.f65063f = FS.Resources_getDrawable(getResources(), this.f65064g);
            j();
        } catch (Resources.NotFoundException unused) {
            this.f65064g = -1;
            k();
        }
    }

    public void l(int i10, String str) {
        this.f65064g = i10;
        this.f65065h = str;
        k();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f65059b = !this.f65059b;
        CharSequence text = this.f65058a.getText();
        i();
        if (this.f65058a.getText().equals(text)) {
            return;
        }
        this.f65058a.sendAccessibilityEvent(32768);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f65059b = bundle.getBoolean(f65052k);
            String str = f65053l;
            this.f65061d = bundle.getString(str);
            this.f65062e = bundle.getString(str);
            this.f65060c = (d) bundle.get(f65055n);
            this.f65064g = bundle.getInt(f65056o, -1);
            this.f65065h = bundle.getString(f65057p);
            parcelable = bundle.getParcelable(f65051j);
        }
        super.onRestoreInstanceState(parcelable);
        l(this.f65064g, this.f65065h);
        i();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f65051j, super.onSaveInstanceState());
        bundle.putBoolean(f65052k, this.f65059b);
        bundle.putString(f65053l, this.f65061d);
        bundle.putString(f65054m, this.f65062e);
        bundle.putSerializable(f65055n, this.f65060c);
        bundle.putInt(f65056o, this.f65064g);
        bundle.putString(f65057p, this.f65065h);
        return bundle;
    }

    public void setCollapseType(d dVar) {
        if (dVar != null) {
            this.f65060c = dVar;
        } else {
            this.f65060c = d.EXPOSE;
        }
    }

    public void setExposeTriggerTitle(String str) {
        this.f65062e = str;
    }

    public void setTriggerTitle(String str) {
        this.f65061d = str;
    }

    public CollapsibleLinearLayout(Context context) {
        super(context);
        this.f65059b = false;
        this.f65060c = d.EXPOSE;
        d();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        i();
    }
}
