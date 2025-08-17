package com.google.android.material.chip;

import ae.C5597b;
import ae.k;
import ae.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.a;
import com.google.android.material.internal.s;
import java.util.List;
import java.util.Set;
import q2.y;
import ue.C17250a;

/* loaded from: classes4.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: k, reason: collision with root package name */
    private static final int f86702k = k.f44810z;

    /* renamed from: e, reason: collision with root package name */
    private int f86703e;

    /* renamed from: f, reason: collision with root package name */
    private int f86704f;

    /* renamed from: g, reason: collision with root package name */
    private e f86705g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.a<Chip> f86706h;

    /* renamed from: i, reason: collision with root package name */
    private final int f86707i;

    /* renamed from: j, reason: collision with root package name */
    private final f f86708j;

    class a implements a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.f86705g != null) {
                e eVar = ChipGroup.this.f86705g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f86706h.j(ChipGroup.this));
            }
        }
    }

    class b implements e {
        b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List<Integer> list) {
            if (ChipGroup.this.f86706h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    @Deprecated
    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List<Integer> list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f86711a;

        private f() {
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.l());
                }
                ChipGroup.this.f86706h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f86711a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f86706h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f86711a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44519h);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && h(i11)) {
                i10++;
            }
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f86706h.q(z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f86702k;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a<Chip> aVar = new com.google.android.material.internal.a<>();
        this.f86706h = aVar;
        f fVar = new f(this, null);
        this.f86708j = fVar;
        TypedArray typedArrayI = s.i(getContext(), attributeSet, l.f44861E1, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(l.f44885G1, 0);
        setChipSpacingHorizontal(typedArrayI.getDimensionPixelOffset(l.f44897H1, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayI.getDimensionPixelOffset(l.f44909I1, dimensionPixelOffset));
        setSingleLine(typedArrayI.getBoolean(l.f44933K1, false));
        setSingleSelection(typedArrayI.getBoolean(l.f44945L1, false));
        setSelectionRequired(typedArrayI.getBoolean(l.f44921J1, false));
        this.f86707i = typedArrayI.getResourceId(l.f44873F1, -1);
        typedArrayI.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        ViewCompat.w0(this, 1);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && h(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f86706h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f86706h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f86703e;
    }

    public int getChipSpacingVertical() {
        return this.f86704f;
    }

    public boolean i() {
        return this.f86706h.l();
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f86703e != i10) {
            this.f86703e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f86704f != i10) {
            this.f86704f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f86705g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f86708j.f86711a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f86706h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    private boolean h(int i10) {
        if (getChildAt(i10).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof c)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f86707i;
        if (i10 != -1) {
            this.f86706h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int visibleChipCount;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y yVarG1 = y.g1(accessibilityNodeInfo);
        if (c()) {
            visibleChipCount = getVisibleChipCount();
        } else {
            visibleChipCount = -1;
        }
        int rowCount = getRowCount();
        if (i()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        yVarG1.r0(y.e.b(rowCount, visibleChipCount, false, i10));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }
}
