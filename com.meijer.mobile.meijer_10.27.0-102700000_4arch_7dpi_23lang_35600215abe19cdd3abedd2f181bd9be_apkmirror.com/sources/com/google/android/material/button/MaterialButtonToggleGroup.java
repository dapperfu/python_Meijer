package com.google.android.material.button;

import ae.C5597b;
import ae.k;
import ae.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p2.C16236t;
import q2.y;
import re.C16753a;
import re.C16765m;
import re.InterfaceC16755c;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout implements FSDispatchDraw {

    /* renamed from: k, reason: collision with root package name */
    private static final int f86502k = k.f44778F;

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f86503a;

    /* renamed from: b, reason: collision with root package name */
    private final e f86504b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<d> f86505c;

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f86506d;

    /* renamed from: e, reason: collision with root package name */
    private Integer[] f86507e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86508f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f86509g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f86510h;

    /* renamed from: i, reason: collision with root package name */
    private final int f86511i;

    /* renamed from: j, reason: collision with root package name */
    private Set<Integer> f86512j;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.s0(y.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final InterfaceC16755c f86515e = new C16753a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        InterfaceC16755c f86516a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC16755c f86517b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC16755c f86518c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC16755c f86519d;

        public static c a(c cVar) {
            InterfaceC16755c interfaceC16755c = f86515e;
            return new c(interfaceC16755c, cVar.f86519d, interfaceC16755c, cVar.f86518c);
        }

        public static c c(c cVar) {
            InterfaceC16755c interfaceC16755c = cVar.f86516a;
            InterfaceC16755c interfaceC16755c2 = cVar.f86519d;
            InterfaceC16755c interfaceC16755c3 = f86515e;
            return new c(interfaceC16755c, interfaceC16755c2, interfaceC16755c3, interfaceC16755c3);
        }

        public static c d(c cVar) {
            InterfaceC16755c interfaceC16755c = f86515e;
            return new c(interfaceC16755c, interfaceC16755c, cVar.f86517b, cVar.f86518c);
        }

        public static c f(c cVar) {
            InterfaceC16755c interfaceC16755c = cVar.f86516a;
            InterfaceC16755c interfaceC16755c2 = f86515e;
            return new c(interfaceC16755c, interfaceC16755c2, cVar.f86517b, interfaceC16755c2);
        }

        c(InterfaceC16755c interfaceC16755c, InterfaceC16755c interfaceC16755c2, InterfaceC16755c interfaceC16755c3, InterfaceC16755c interfaceC16755c4) {
            this.f86516a = interfaceC16755c;
            this.f86517b = interfaceC16755c3;
            this.f86518c = interfaceC16755c4;
            this.f86519d = interfaceC16755c2;
        }

        public static c b(c cVar, View view) {
            if (x.k(view)) {
                return c(cVar);
            }
            return d(cVar);
        }

        public static c e(c cVar, View view) {
            if (x.k(view)) {
                return d(cVar);
            }
            return c(cVar);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    private class e implements MaterialButton.b {
        private e() {
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44482D);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            FS.log_e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f86512j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f86509g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f86510h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f86504b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setA11yClassName((this.f86509g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_9c162b1d9016c9cda9019457fd1be7bf(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_9c162b1d9016c9cda9019457fd1be7bf(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_9c162b1d9016c9cda9019457fd1be7bf(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setSingleSelection(boolean z10) {
        if (this.f86509g != z10) {
            this.f86509g = z10;
            f();
        }
        t();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f86502k;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86503a = new ArrayList();
        this.f86504b = new e(this, null);
        this.f86505c = new LinkedHashSet<>();
        this.f86506d = new a();
        this.f86508f = false;
        this.f86512j = new HashSet();
        TypedArray typedArrayI = s.i(getContext(), attributeSet, l.f45082X3, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(l.f45128b4, false));
        this.f86511i = typedArrayI.getResourceId(l.f45104Z3, -1);
        this.f86510h = typedArrayI.getBoolean(l.f45116a4, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(l.f45093Y3, true));
        typedArrayI.recycle();
        ViewCompat.w0(this, 1);
    }

    private void g(int i10, boolean z10) {
        Iterator<d> it = this.f86505c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = this.f86503a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private static void p(C16765m.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.E(cVar.f86516a).w(cVar.f86519d).I(cVar.f86517b).A(cVar.f86518c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.f86512j;
        this.f86512j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f86506d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f86507e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            FS.log_e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        C16765m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f86503a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.m0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f86505c.add(dVar);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f86509g || this.f86512j.isEmpty()) {
            return -1;
        }
        return this.f86512j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f86512j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f86507e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        FS.log_w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f86509g;
    }

    void m(MaterialButton materialButton, boolean z10) {
        if (this.f86508f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    public void setSelectionRequired(boolean z10) {
        this.f86510h = z10;
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonH = h(i10);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                C16236t.c(layoutParamsD, 0);
                C16236t.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                C16236t.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    private boolean k(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void n(int i10) {
        if (getChildCount() != 0 && i10 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                C16236t.c(layoutParams, 0);
                C16236t.d(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f86508f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f86508f = false;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.l());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        fsSuperDispatchDraw_9c162b1d9016c9cda9019457fd1be7bf(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f86511i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y yVarG1 = y.g1(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (l()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        yVarG1.r0(y.e.b(1, visibleButtonCount, false, i10));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f86503a.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonH = h(i10);
            if (materialButtonH.getVisibility() != 8) {
                C16765m.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setEnabled(z10);
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
