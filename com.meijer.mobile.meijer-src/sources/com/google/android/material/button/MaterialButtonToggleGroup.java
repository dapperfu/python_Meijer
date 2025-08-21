package com.google.android.material.button;

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
import ce.C6503b;
import ce.k;
import ce.l;
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
import p2.C16381t;
import q2.y;
import te.C17227a;
import te.C17239m;
import te.InterfaceC17229c;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout implements FSDispatchDraw {

    /* renamed from: k, reason: collision with root package name */
    private static final int f87342k = k.f61793F;

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f87343a;

    /* renamed from: b, reason: collision with root package name */
    private final e f87344b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<d> f87345c;

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f87346d;

    /* renamed from: e, reason: collision with root package name */
    private Integer[] f87347e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87348f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87349g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f87350h;

    /* renamed from: i, reason: collision with root package name */
    private final int f87351i;

    /* renamed from: j, reason: collision with root package name */
    private Set<Integer> f87352j;

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
        private static final InterfaceC17229c f87355e = new C17227a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        InterfaceC17229c f87356a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC17229c f87357b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC17229c f87358c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC17229c f87359d;

        public static c a(c cVar) {
            InterfaceC17229c interfaceC17229c = f87355e;
            return new c(interfaceC17229c, cVar.f87359d, interfaceC17229c, cVar.f87358c);
        }

        public static c c(c cVar) {
            InterfaceC17229c interfaceC17229c = cVar.f87356a;
            InterfaceC17229c interfaceC17229c2 = cVar.f87359d;
            InterfaceC17229c interfaceC17229c3 = f87355e;
            return new c(interfaceC17229c, interfaceC17229c2, interfaceC17229c3, interfaceC17229c3);
        }

        public static c d(c cVar) {
            InterfaceC17229c interfaceC17229c = f87355e;
            return new c(interfaceC17229c, interfaceC17229c, cVar.f87357b, cVar.f87358c);
        }

        public static c f(c cVar) {
            InterfaceC17229c interfaceC17229c = cVar.f87356a;
            InterfaceC17229c interfaceC17229c2 = f87355e;
            return new c(interfaceC17229c, interfaceC17229c2, cVar.f87357b, interfaceC17229c2);
        }

        c(InterfaceC17229c interfaceC17229c, InterfaceC17229c interfaceC17229c2, InterfaceC17229c interfaceC17229c3, InterfaceC17229c interfaceC17229c4) {
            this.f87356a = interfaceC17229c;
            this.f87357b = interfaceC17229c3;
            this.f87358c = interfaceC17229c4;
            this.f87359d = interfaceC17229c2;
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
        this(context, attributeSet, C6503b.f61497D);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            FS.log_e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f87352j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f87349g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f87350h || hashSet.size() > 1) {
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
        materialButton.setOnPressedChangeListenerInternal(this.f87344b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setA11yClassName((this.f87349g ? RadioButton.class : ToggleButton.class).getName());
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
        if (this.f87349g != z10) {
            this.f87349g = z10;
            f();
        }
        t();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87342k;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87343a = new ArrayList();
        this.f87344b = new e(this, null);
        this.f87345c = new LinkedHashSet<>();
        this.f87346d = new a();
        this.f87348f = false;
        this.f87352j = new HashSet();
        TypedArray typedArrayI = s.i(getContext(), attributeSet, l.f62097X3, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(l.f62143b4, false));
        this.f87351i = typedArrayI.getResourceId(l.f62119Z3, -1);
        this.f87350h = typedArrayI.getBoolean(l.f62131a4, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(l.f62108Y3, true));
        typedArrayI.recycle();
        ViewCompat.w0(this, 1);
    }

    private void g(int i10, boolean z10) {
        Iterator<d> it = this.f87345c.iterator();
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
        c cVar = this.f87343a.get(i10);
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

    private static void p(C17239m.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.E(cVar.f87356a).w(cVar.f87359d).I(cVar.f87357b).A(cVar.f87358c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.f87352j;
        this.f87352j = new HashSet(set);
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
        TreeMap treeMap = new TreeMap(this.f87346d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f87347e = (Integer[]) treeMap.values().toArray(new Integer[0]);
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
        C17239m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f87343a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.m0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f87345c.add(dVar);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f87349g || this.f87352j.isEmpty()) {
            return -1;
        }
        return this.f87352j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f87352j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f87347e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        FS.log_w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f87349g;
    }

    void m(MaterialButton materialButton, boolean z10) {
        if (this.f87348f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    public void setSelectionRequired(boolean z10) {
        this.f87350h = z10;
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
                C16381t.c(layoutParamsD, 0);
                C16381t.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                C16381t.d(layoutParamsD, 0);
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
                C16381t.c(layoutParams, 0);
                C16381t.d(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f87348f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f87348f = false;
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
        int i10 = this.f87351i;
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
            this.f87343a.remove(iIndexOfChild);
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
                C17239m.b bVarV = materialButtonH.getShapeAppearanceModel().v();
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
