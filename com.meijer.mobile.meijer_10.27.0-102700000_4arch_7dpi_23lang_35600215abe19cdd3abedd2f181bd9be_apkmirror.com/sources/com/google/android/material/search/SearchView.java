package com.google.android.material.search;

import ae.d;
import ae.e;
import ae.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.view.C5614b;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.t;
import d2.C13462a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k.C15085b;
import ke.C15140a;
import ne.InterfaceC15792b;
import ne.g;
import re.C16761i;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, InterfaceC15792b {

    /* renamed from: x, reason: collision with root package name */
    private static final int f87329x = k.f44804t;

    /* renamed from: a, reason: collision with root package name */
    final ClippableRoundedCornerLayout f87330a;

    /* renamed from: b, reason: collision with root package name */
    final View f87331b;

    /* renamed from: c, reason: collision with root package name */
    final View f87332c;

    /* renamed from: d, reason: collision with root package name */
    final FrameLayout f87333d;

    /* renamed from: e, reason: collision with root package name */
    final MaterialToolbar f87334e;

    /* renamed from: f, reason: collision with root package name */
    final TextView f87335f;

    /* renamed from: g, reason: collision with root package name */
    final EditText f87336g;

    /* renamed from: h, reason: collision with root package name */
    final TouchObserverFrameLayout f87337h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f87338i;

    /* renamed from: j, reason: collision with root package name */
    private final ne.c f87339j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f87340k;

    /* renamed from: l, reason: collision with root package name */
    private final C15140a f87341l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<b> f87342m;

    /* renamed from: n, reason: collision with root package name */
    private SearchBar f87343n;

    /* renamed from: o, reason: collision with root package name */
    private int f87344o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f87345p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f87346q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87347r;

    /* renamed from: s, reason: collision with root package name */
    private final int f87348s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f87349t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f87350u;

    /* renamed from: v, reason: collision with root package name */
    private c f87351v;

    /* renamed from: w, reason: collision with root package name */
    private Map<View, Integer> f87352w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (!searchView.g() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
                return false;
            }
            return false;
        }
    }

    static class a extends AbstractC17751a {
        public static final Parcelable.Creator<a> CREATOR = new C1274a();

        /* renamed from: c, reason: collision with root package name */
        String f87353c;

        /* renamed from: d, reason: collision with root package name */
        int f87354d;

        /* renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        class C1274a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            C1274a() {
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f87353c = parcel.readString();
            this.f87354d = parcel.readInt();
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f87353c);
            parcel.writeInt(this.f87354d);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(SearchView searchView, c cVar, c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    @SuppressLint({"InlinedApi"})
    private void i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f87330a.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f87352w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.w0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f87352w;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.w0(childAt, this.f87352w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f87333d, false));
        }
    }

    g getBackHelper() {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        this.f87336g.setHint(charSequence);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f87350u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f87336g.setText(charSequence);
    }

    void setTransitionState(c cVar) {
        h(cVar, true);
    }

    private boolean f() {
        return this.f87351v.equals(c.HIDDEN) || this.f87351v.equals(c.HIDING);
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f87343n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(d.f44565C);
    }

    private void h(c cVar, boolean z10) {
        if (this.f87351v.equals(cVar)) {
            return;
        }
        if (z10) {
            if (cVar == c.SHOWN) {
                setModalForAccessibility(true);
            } else if (cVar == c.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        c cVar2 = this.f87351v;
        this.f87351v = cVar;
        Iterator it = new LinkedHashSet(this.f87342m).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        j(cVar);
    }

    private void j(c cVar) {
        if (this.f87343n == null || !this.f87340k) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.f87339j.c();
        } else if (cVar.equals(c.HIDDEN)) {
            this.f87339j.f();
        }
    }

    private void k() {
        ImageButton imageButtonD = t.d(this.f87334e);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f87330a.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = C13462a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof C15085b) {
            ((C15085b) drawableQ).e(i10);
        }
        if (drawableQ instanceof f) {
            ((f) drawableQ).a(i10);
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f87332c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        C15140a c15140a = this.f87341l;
        if (c15140a == null || this.f87331b == null) {
            return;
        }
        this.f87331b.setBackgroundColor(c15140a.c(this.f87348s, f10));
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f87332c.getLayoutParams().height != i10) {
            this.f87332c.getLayoutParams().height = i10;
            this.f87332c.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f87338i) {
            this.f87337h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public void e(View view) {
        this.f87333d.addView(view);
        this.f87333d.setVisibility(0);
    }

    public boolean g() {
        return this.f87343n != null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f87351v;
    }

    protected int getDefaultNavigationIconResource() {
        return e.f44644b;
    }

    public EditText getEditText() {
        return this.f87336g;
    }

    public CharSequence getHint() {
        return this.f87336g.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f87335f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f87335f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f87344o;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f87336g.getText();
    }

    public Toolbar getToolbar() {
        return this.f87334e;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f87353c);
        setVisible(aVar.f87354d == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f87353c = text == null ? null : text.toString();
        aVar.f87354d = this.f87330a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f87345p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f87347r = z10;
    }

    public void setHint(int i10) {
        this.f87336g.setHint(i10);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f87346q = z10;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f87334e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f87335f.setText(charSequence);
        this.f87335f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setText(int i10) {
        this.f87336g.setText(i10);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f87334e.setTouchscreenBlocksFocus(z10);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f87349t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f87330a.getVisibility() == 0;
        this.f87330a.setVisibility(z10 ? 0 : 8);
        k();
        h(z10 ? c.SHOWN : c.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f87343n = searchBar;
        throw null;
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // ne.InterfaceC15792b
    public void a() {
        if (!f() && this.f87343n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // ne.InterfaceC15792b
    public void b(C5614b c5614b) {
        if (!f() && this.f87343n != null) {
            throw null;
        }
    }

    @Override // ne.InterfaceC15792b
    public void c(C5614b c5614b) {
        if (!f() && this.f87343n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // ne.InterfaceC15792b
    public void d() {
        if (f()) {
        } else {
            throw null;
        }
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f87344o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16761i.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f87352w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (!z10) {
            this.f87352w = null;
        }
    }
}
