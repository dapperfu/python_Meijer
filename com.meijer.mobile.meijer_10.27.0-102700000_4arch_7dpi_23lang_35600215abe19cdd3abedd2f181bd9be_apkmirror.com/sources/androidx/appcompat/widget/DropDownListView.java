package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import d2.C13462a;
import i.C14575a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C15084a;

/* loaded from: classes.dex */
class DropDownListView extends ListView implements FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f46618a;

    /* renamed from: b, reason: collision with root package name */
    private int f46619b;

    /* renamed from: c, reason: collision with root package name */
    private int f46620c;

    /* renamed from: d, reason: collision with root package name */
    private int f46621d;

    /* renamed from: e, reason: collision with root package name */
    private int f46622e;

    /* renamed from: f, reason: collision with root package name */
    private int f46623f;

    /* renamed from: g, reason: collision with root package name */
    private d f46624g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46625h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46626i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46627j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.core.view.h f46628k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.widget.h f46629l;

    /* renamed from: m, reason: collision with root package name */
    f f46630m;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f46631a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f46632b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f46633c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f46634d;

        @SuppressLint({"BanUncheckedReflection"})
        static void b(DropDownListView dropDownListView, int i10, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f46631a.invoke(dropDownListView, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f46632b.invoke(dropDownListView, Integer.valueOf(i10));
                f46633c.invoke(dropDownListView, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f46631a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f46632b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f46633c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f46634d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f46634d;
        }
    }

    private static class d extends C15084a implements FSDraw {

        /* renamed from: b, reason: collision with root package name */
        private boolean f46635b;

        void b(boolean z10) {
            this.f46635b = z10;
        }

        @Override // k.C15084a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f46635b) {
                super.draw(canvas);
            }
        }

        @Override // k.C15084a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f46635b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // k.C15084a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f46635b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // k.C15084a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f46635b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.C15084a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f46635b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }

        d(Drawable drawable) {
            super(drawable);
            this.f46635b = true;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f46636a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f46636a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f46636a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) throws IllegalAccessException, IllegalArgumentException {
            Field field = f46636a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f46630m = null;
            dropDownListView.removeCallbacks(this);
        }

        public void b() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f46630m = null;
            dropDownListView.drawableStateChanged();
        }
    }

    DropDownListView(Context context, boolean z10) {
        super(context, null, C14575a.f136506C);
        this.f46618a = new Rect();
        this.f46619b = 0;
        this.f46620c = 0;
        this.f46621d = 0;
        this.f46622e = 0;
        this.f46626i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f46627j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f46623f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.h hVar = this.f46628k;
        if (hVar != null) {
            hVar.c();
            this.f46628k = null;
        }
    }

    private void i(View view, int i10, float f10, float f11) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f46627j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f46623f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f46623f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_e72353112e9c29f096427b84cb635d68(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_e72353112e9c29f096427b84cb635d68(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_e72353112e9c29f096427b84cb635d68(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f46630m = null;
        super.onDetachedFromWindow();
    }

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f46618a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f46618a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f46618a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f46619b;
        rect.top -= this.f46620c;
        rect.right += this.f46621d;
        rect.bottom += this.f46622e;
        boolean zJ = j();
        if (view.isEnabled() != zJ) {
            k(!zJ);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private boolean j() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void k(boolean z10) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean l() {
        return this.f46627j;
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f46624g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f46630m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f46626i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f46626i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f46626i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f46626i && this.f46625h) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f46630m == null) {
            f fVar = new f();
            this.f46630m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            m();
        }
        return zOnHoverEvent;
    }

    void setListSelectionHidden(boolean z10) {
        this.f46625h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f46624g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f46619b = rect.left;
        this.f46620c = rect.top;
        this.f46621d = rect.right;
        this.f46622e = rect.bottom;
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void g(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        boolean z10;
        Drawable selector = getSelector();
        boolean z11 = true;
        if (selector != null && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f46618a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z11 = false;
            }
            selector.setVisible(z11, false);
            C13462a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) throws IllegalAccessException, IllegalArgumentException {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector != null && i10 != -1) {
            C13462a.k(selector, f10, f11);
        }
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        View view = null;
        for (int i17 = 0; i17 < count; i17++) {
            int itemViewType = adapter.getItemViewType(i17);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i17, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            if (i18 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, iMakeMeasureSpec);
            view.forceLayout();
            if (i17 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                if (i14 >= 0 && i17 > i14 && i16 > 0 && measuredHeight != i13) {
                    return i16;
                }
                return i13;
            }
            if (i14 >= 0 && i17 >= i14) {
                i16 = measuredHeight;
            }
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        fsSuperDispatchDraw_e72353112e9c29f096427b84cb635d68(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f46629l
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f46629l = r9
        L5a:
            androidx.core.widget.h r9 = r7.f46629l
            r9.m(r1)
            androidx.core.widget.h r9 = r7.f46629l
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.h r8 = r7.f46629l
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f46623f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f46630m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }
}
