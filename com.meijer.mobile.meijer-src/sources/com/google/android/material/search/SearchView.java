package com.google.android.material.search;

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
import androidx.view.C5756b;
import ce.d;
import ce.e;
import ce.k;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.t;
import d2.C13595a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k.C15076b;
import me.C15711a;
import pe.InterfaceC16420b;
import pe.g;
import te.C17235i;
import w2.AbstractC17821a;

/* loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, InterfaceC16420b {

    /* renamed from: x, reason: collision with root package name */
    private static final int f88169x = k.f61819t;

    /* renamed from: a, reason: collision with root package name */
    final ClippableRoundedCornerLayout f88170a;

    /* renamed from: b, reason: collision with root package name */
    final View f88171b;

    /* renamed from: c, reason: collision with root package name */
    final View f88172c;

    /* renamed from: d, reason: collision with root package name */
    final FrameLayout f88173d;

    /* renamed from: e, reason: collision with root package name */
    final MaterialToolbar f88174e;

    /* renamed from: f, reason: collision with root package name */
    final TextView f88175f;

    /* renamed from: g, reason: collision with root package name */
    final EditText f88176g;

    /* renamed from: h, reason: collision with root package name */
    final TouchObserverFrameLayout f88177h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f88178i;

    /* renamed from: j, reason: collision with root package name */
    private final pe.c f88179j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f88180k;

    /* renamed from: l, reason: collision with root package name */
    private final C15711a f88181l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<b> f88182m;

    /* renamed from: n, reason: collision with root package name */
    private SearchBar f88183n;

    /* renamed from: o, reason: collision with root package name */
    private int f88184o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f88185p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f88186q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f88187r;

    /* renamed from: s, reason: collision with root package name */
    private final int f88188s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f88189t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f88190u;

    /* renamed from: v, reason: collision with root package name */
    private c f88191v;

    /* renamed from: w, reason: collision with root package name */
    private Map<View, Integer> f88192w;

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

    static class a extends AbstractC17821a {
        public static final Parcelable.Creator<a> CREATOR = new C1283a();

        /* renamed from: c, reason: collision with root package name */
        String f88193c;

        /* renamed from: d, reason: collision with root package name */
        int f88194d;

        /* renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        class C1283a implements Parcelable.ClassLoaderCreator<a> {
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

            C1283a() {
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f88193c = parcel.readString();
            this.f88194d = parcel.readInt();
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f88193c);
            parcel.writeInt(this.f88194d);
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
                if (childAt.findViewById(this.f88170a.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f88192w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.w0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f88192w;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.w0(childAt, this.f88192w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f88173d, false));
        }
    }

    g getBackHelper() {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        this.f88176g.setHint(charSequence);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f88190u = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f88176g.setText(charSequence);
    }

    void setTransitionState(c cVar) {
        h(cVar, true);
    }

    private boolean f() {
        return this.f88191v.equals(c.HIDDEN) || this.f88191v.equals(c.HIDING);
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f88183n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(d.f61580C);
    }

    private void h(c cVar, boolean z10) {
        if (this.f88191v.equals(cVar)) {
            return;
        }
        if (z10) {
            if (cVar == c.SHOWN) {
                setModalForAccessibility(true);
            } else if (cVar == c.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        c cVar2 = this.f88191v;
        this.f88191v = cVar;
        Iterator it = new LinkedHashSet(this.f88182m).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        j(cVar);
    }

    private void j(c cVar) {
        if (this.f88183n == null || !this.f88180k) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.f88179j.c();
        } else if (cVar.equals(c.HIDDEN)) {
            this.f88179j.f();
        }
    }

    private void k() {
        ImageButton imageButtonD = t.d(this.f88174e);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f88170a.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = C13595a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof C15076b) {
            ((C15076b) drawableQ).e(i10);
        }
        if (drawableQ instanceof f) {
            ((f) drawableQ).a(i10);
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f88172c.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        C15711a c15711a = this.f88181l;
        if (c15711a == null || this.f88171b == null) {
            return;
        }
        this.f88171b.setBackgroundColor(c15711a.c(this.f88188s, f10));
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f88172c.getLayoutParams().height != i10) {
            this.f88172c.getLayoutParams().height = i10;
            this.f88172c.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f88178i) {
            this.f88177h.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public void e(View view) {
        this.f88173d.addView(view);
        this.f88173d.setVisibility(0);
    }

    public boolean g() {
        return this.f88183n != null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f88191v;
    }

    protected int getDefaultNavigationIconResource() {
        return e.f61659b;
    }

    public EditText getEditText() {
        return this.f88176g;
    }

    public CharSequence getHint() {
        return this.f88176g.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f88175f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f88175f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f88184o;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f88176g.getText();
    }

    public Toolbar getToolbar() {
        return this.f88174e;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f88193c);
        setVisible(aVar.f88194d == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f88193c = text == null ? null : text.toString();
        aVar.f88194d = this.f88170a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f88185p = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f88187r = z10;
    }

    public void setHint(int i10) {
        this.f88176g.setHint(i10);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f88186q = z10;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f88174e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f88175f.setText(charSequence);
        this.f88175f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setText(int i10) {
        this.f88176g.setText(i10);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f88174e.setTouchscreenBlocksFocus(z10);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f88189t = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f88170a.getVisibility() == 0;
        this.f88170a.setVisibility(z10 ? 0 : 8);
        k();
        h(z10 ? c.SHOWN : c.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f88183n = searchBar;
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

    @Override // pe.InterfaceC16420b
    public void a() {
        if (!f() && this.f88183n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // pe.InterfaceC16420b
    public void b(C5756b c5756b) {
        if (!f() && this.f88183n != null) {
            throw null;
        }
    }

    @Override // pe.InterfaceC16420b
    public void c(C5756b c5756b) {
        if (!f() && this.f88183n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // pe.InterfaceC16420b
    public void d() {
        if (f()) {
        } else {
            throw null;
        }
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f88184o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17235i.e(this);
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
            this.f88192w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (!z10) {
            this.f88192w = null;
        }
    }
}
