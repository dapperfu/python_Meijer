package com.flipp.sfml.views;

import Ra.f;
import Ra.i;
import Ra.n;
import Ra.v;
import Ra.w;
import Sa.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.flipp.sfml.views.ZoomScrollView;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q2.y;
import x2.AbstractC17992a;

/* loaded from: classes4.dex */
public class SourceImageView extends AppCompatImageView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ZoomScrollView.f {

    /* renamed from: a, reason: collision with root package name */
    private float f64234a;

    /* renamed from: b, reason: collision with root package name */
    private float f64235b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f64236c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f64237d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<c> f64238e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<d> f64239f;

    /* renamed from: g, reason: collision with root package name */
    public List<WeakReference<e>> f64240g;

    /* renamed from: h, reason: collision with root package name */
    private GestureDetector f64241h;

    /* renamed from: i, reason: collision with root package name */
    private b f64242i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f64243j;

    /* renamed from: k, reason: collision with root package name */
    private RectF f64244k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f64245l;

    /* renamed from: m, reason: collision with root package name */
    private List<v> f64246m;

    /* renamed from: n, reason: collision with root package name */
    private v f64247n;

    /* renamed from: o, reason: collision with root package name */
    private RectF f64248o;

    /* renamed from: p, reason: collision with root package name */
    private RectF f64249p;

    /* renamed from: q, reason: collision with root package name */
    private float f64250q;

    /* renamed from: r, reason: collision with root package name */
    private AbstractC17992a f64251r;

    class a extends AbstractC17992a {
        @Override // x2.AbstractC17992a
        protected boolean L(int i10, int i11, Bundle bundle) {
            return false;
        }

        a(View view) {
            super(view);
        }

        @Override // x2.AbstractC17992a
        protected int B(float f10, float f11) {
            return SourceImageView.this.B(f10, f11);
        }

        @Override // x2.AbstractC17992a
        protected void C(List<Integer> list) {
            SourceImageView.this.z(list);
        }

        @Override // x2.AbstractC17992a
        protected void N(int i10, AccessibilityEvent accessibilityEvent) {
            SourceImageView.this.m(i10, accessibilityEvent);
        }

        @Override // x2.AbstractC17992a
        protected void P(int i10, y yVar) {
            SourceImageView.this.n(i10, yVar);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SourceImageView.this.invalidate();
        }
    }

    public interface c {
        boolean a(Ra.b bVar);
    }

    public interface d {
        Drawable E0(Ra.b bVar);

        boolean o(Ra.b bVar);
    }

    public interface e {
        void L(View view, w wVar);

        void Y0(View view, w wVar);
    }

    public SourceImageView(Context context) throws Resources.NotFoundException {
        super(context);
        this.f64250q = 1.0f;
        a();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B(float f10, float f11) {
        v vVar = this.f64247n;
        if (!(vVar instanceof n)) {
            return -1;
        }
        List<w> listP = ((n) vVar).p();
        if (listP.isEmpty()) {
            return -1;
        }
        float fQ = ((n) this.f64247n).q();
        float width = getWidth() / fQ;
        float height = getHeight() / ((n) this.f64247n).l();
        float f12 = (f10 / width) + ((n) this.f64247n).n().left;
        float f13 = (f11 / height) + ((n) this.f64247n).n().top;
        Iterator<w> it = listP.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().k().contains(f12, f13)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private String C(boolean z10) {
        return z10 ? getResources().getText(i.f32007e).toString() : getResources().getText(i.f32008f).toString();
    }

    private void D(w wVar) {
        Iterator<WeakReference<e>> it = this.f64240g.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null) {
                eVar.Y0(this, wVar);
            } else {
                it.remove();
            }
        }
    }

    private void E(Canvas canvas) {
        WeakReference<d> weakReference;
        d dVar;
        float fWidth = this.f64248o.width();
        float fHeight = this.f64248o.height();
        RectF rectF = this.f64249p;
        RectF rectF2 = this.f64248o;
        if (!rectF.intersects(rectF2.left - fWidth, rectF2.top - fHeight, rectF2.right + fWidth, rectF2.bottom + fHeight) || (weakReference = this.f64239f) == null || (dVar = weakReference.get()) == null) {
            return;
        }
        v vVar = this.f64247n;
        if (vVar instanceof n) {
            t(canvas, (n) vVar, dVar);
        } else if (vVar instanceof Ra.y) {
            v(canvas, (Ra.y) vVar, dVar);
        }
    }

    private Boolean F(w wVar) {
        Ra.b bVarI;
        c cVar = this.f64238e.get();
        if (cVar == null || (bVarI = wVar.i()) == null) {
            return null;
        }
        return Boolean.valueOf(cVar.a(bVarI));
    }

    private void G() {
        if (this.f64242i == null) {
            this.f64242i = new b();
            Z2.a.b(getContext()).c(this.f64242i, new IntentFilter("com.flipp.sfml.CLIP_STATE_CHANGE_ACTION"));
        }
    }

    private void H() {
        if (this.f64242i != null) {
            Z2.a.b(getContext()).e(this.f64242i);
            this.f64242i = null;
        }
    }

    private boolean I() {
        if (this.f64247n instanceof n) {
            return !((n) r0).p().isEmpty();
        }
        return false;
    }

    private void J() {
        this.f64249p.set(this.f64243j[0], r1[1], r2 + getWidth(), this.f64243j[1] + getHeight());
        if (getDrawable() instanceof com.flipp.sfml.views.b) {
            ((com.flipp.sfml.views.b) getDrawable()).s(this.f64249p);
        }
        if (getDrawable() instanceof com.flipp.sfml.views.c) {
            ((com.flipp.sfml.views.c) getDrawable()).k(this.f64249p);
        }
    }

    private void a() throws Resources.NotFoundException {
        this.f64248o = new RectF();
        this.f64245l = new RectF();
        this.f64249p = new RectF();
        this.f64241h = new GestureDetector(getContext(), this);
        this.f64243j = new int[2];
        this.f64244k = new RectF();
        this.f64240g = new ArrayList();
        this.f64236c = FS.Resources_getDrawable(getResources(), f.f31984a);
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(getResources(), f.f31985b);
        this.f64237d = drawableResources_getDrawable;
        drawableResources_getDrawable.setAlpha(220);
        b();
    }

    private Drawable getDrawableForSource() {
        if (this.f64247n == null) {
            return null;
        }
        Drawable drawable = getDrawable();
        v vVar = this.f64247n;
        if (vVar instanceof n) {
            com.flipp.sfml.views.b bVar = drawable instanceof com.flipp.sfml.views.b ? (com.flipp.sfml.views.b) drawable : new com.flipp.sfml.views.b();
            bVar.r((n) this.f64247n);
            return bVar;
        }
        if (!(vVar instanceof Ra.y)) {
            return null;
        }
        com.flipp.sfml.views.c cVar = drawable instanceof com.flipp.sfml.views.c ? (com.flipp.sfml.views.c) drawable : new com.flipp.sfml.views.c();
        cVar.j((Ra.y) this.f64247n);
        return cVar;
    }

    private int h(float f10) {
        return (int) Math.max(64.0f, (1.0f - ((f10 - 1.0f) / 5.0f)) * 220.0f);
    }

    private w j(float f10, float f11) {
        List<w> listP;
        v vVar = this.f64247n;
        if ((vVar instanceof n) && vVar != null && (listP = ((n) vVar).p()) != null && !listP.isEmpty()) {
            for (w wVar : listP) {
                p(wVar, this.f64244k);
                if (this.f64244k.contains(f10, f11)) {
                    return wVar;
                }
            }
        }
        return null;
    }

    private String l(boolean z10) {
        return z10 ? getResources().getText(i.f32006d).toString() : getResources().getText(i.f32005c).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(((n) this.f64247n).p().get(i10).j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i10, y yVar) {
        w wVar = ((n) this.f64247n).p().get(i10);
        Boolean boolF = F(wVar);
        String strJ = wVar.j();
        if (boolF != null && boolF.booleanValue()) {
            strJ = C(boolF.booleanValue()) + ". " + strJ;
        }
        yVar.t0(strJ);
        if (boolF != null) {
            yVar.b(new y.a(16, l(boolF.booleanValue())));
        } else {
            yVar.a(16);
        }
        yVar.a(32);
        p(wVar, this.f64245l);
        RectF rectF = this.f64245l;
        float f10 = rectF.left;
        float f11 = this.f64250q;
        rectF.set(f10 * f11, rectF.top * f11, rectF.right * f11, rectF.bottom * f11);
        Rect rect = new Rect();
        this.f64245l.roundOut(rect);
        yVar.l0(rect);
    }

    private void o(w wVar) {
        Iterator<WeakReference<e>> it = this.f64240g.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null) {
                if (F(wVar) != null) {
                    String strC = C(!r3.booleanValue());
                    if (!z10) {
                        z10 = !z10;
                        K(this, 16384, strC);
                    }
                }
                eVar.L(this, wVar);
            } else {
                it.remove();
            }
        }
    }

    private void p(w wVar, RectF rectF) {
        ((Sa.e) Qa.c.c(Sa.e.class)).f(this, this.f64247n, wVar, rectF);
    }

    private void q(Canvas canvas) {
        WeakReference<c> weakReference;
        c cVar;
        float fWidth = this.f64248o.width();
        float fHeight = this.f64248o.height();
        RectF rectF = this.f64249p;
        RectF rectF2 = this.f64248o;
        if (!rectF.intersects(rectF2.left - fWidth, rectF2.top - fHeight, rectF2.right + fWidth, rectF2.bottom + fHeight) || (weakReference = this.f64238e) == null || (cVar = weakReference.get()) == null) {
            return;
        }
        v vVar = this.f64247n;
        if (vVar instanceof n) {
            r(canvas, (n) vVar, cVar);
        } else if (vVar instanceof Ra.y) {
            u(canvas, (Ra.y) vVar, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(List<Integer> list) {
        v vVar = this.f64247n;
        if (vVar instanceof n) {
            Iterator<w> it = ((n) vVar).p().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                p(it.next(), this.f64245l);
                RectF rectF = this.f64245l;
                RectF rectF2 = this.f64249p;
                rectF.offset(rectF2.left, rectF2.top);
                if (RectF.intersects(this.f64245l, this.f64249p)) {
                    list.add(Integer.valueOf(i10));
                }
                i10++;
            }
        }
    }

    public void A(e eVar) {
        if (eVar == null) {
            return;
        }
        this.f64240g.add(new WeakReference<>(eVar));
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void c() {
        ((Sa.e) Qa.c.c(Sa.e.class)).v(this, this.f64243j);
        J();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AbstractC17992a abstractC17992a = this.f64251r;
        if (abstractC17992a == null || !abstractC17992a.v(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void e(boolean z10, boolean z11, float f10, float f11, float f12, float f13) {
        this.f64248o.set(f10, f11, f12, f13);
        Object drawable = getDrawable();
        if (drawable instanceof ZoomScrollView.f) {
            ((ZoomScrollView.f) drawable).e(z10, z11, f10, f11, f12, f13);
        }
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void g(float f10) {
        this.f64250q = f10;
        Object drawable = getDrawable();
        if (drawable instanceof ZoomScrollView.f) {
            ((ZoomScrollView.f) drawable).g(f10);
        }
    }

    public v getCurrentSource() {
        return this.f64247n;
    }

    public void setClipStateDelegate(c cVar) {
        this.f64238e = new WeakReference<>(cVar);
    }

    public void setMatchupDelegate(d dVar) {
        this.f64239f = new WeakReference<>(dVar);
    }

    public void setSources(List<v> list) {
        this.f64246m = list;
        if (list != null && !list.isEmpty()) {
            this.f64247n = list.get(0);
        }
        setImageDrawable(getDrawableForSource());
    }

    public static void K(View view, int i10, String str) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    private void b() {
        int importantForAccessibility = getImportantForAccessibility();
        if (importantForAccessibility != 0 && importantForAccessibility != 1) {
            return;
        }
        a aVar = new a(this);
        this.f64251r = aVar;
        ViewCompat.m0(this, aVar);
    }

    private Drawable k(d dVar, Ra.b bVar) {
        Drawable drawableE0 = dVar.E0(bVar);
        if (drawableE0 != null) {
            return drawableE0;
        }
        return this.f64237d;
    }

    private void r(Canvas canvas, n nVar, c cVar) {
        for (w wVar : nVar.p()) {
            if (cVar.a(wVar.i())) {
                p(wVar, this.f64244k);
                Drawable drawable = this.f64236c;
                RectF rectF = this.f64244k;
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f64236c.draw(canvas);
            }
        }
    }

    private void t(Canvas canvas, n nVar, d dVar) {
        for (w wVar : nVar.p()) {
            if (dVar.o(wVar.i())) {
                p(wVar, this.f64244k);
                Drawable drawableK = k(dVar, wVar.i());
                int iRound = Math.round(drawableK.getIntrinsicWidth());
                int iRound2 = Math.round(drawableK.getIntrinsicHeight());
                int iRound3 = ((int) this.f64244k.right) - Math.round(iRound * 0.85f);
                int iRound4 = ((int) this.f64244k.top) - Math.round(iRound2 * 0.14999998f);
                drawableK.setAlpha(h(this.f64250q));
                drawableK.setBounds(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
                drawableK.draw(canvas);
            }
        }
    }

    private void u(Canvas canvas, Ra.y yVar, c cVar) {
        if (cVar.a(yVar.j())) {
            this.f64236c.setBounds(getDrawable().getBounds());
            Matrix imageMatrix = getImageMatrix();
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            if (imageMatrix == null && paddingTop == 0 && paddingLeft == 0) {
                this.f64236c.draw(canvas);
                return;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (getCropToPadding()) {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                canvas.clipRect(scrollX + paddingLeft, scrollY + paddingTop, ((scrollX + getRight()) - getLeft()) - getPaddingRight(), ((scrollY + getBottom()) - getTop()) - getPaddingBottom());
            }
            canvas.translate(paddingLeft, paddingTop);
            if (imageMatrix != null) {
                canvas.concat(imageMatrix);
            }
            this.f64236c.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
    }

    private void v(Canvas canvas, Ra.y yVar, d dVar) {
        if (!dVar.o(yVar.j())) {
            return;
        }
        Rect bounds = getDrawable().getBounds();
        Drawable drawableK = k(dVar, yVar.j());
        int iRound = Math.round(drawableK.getIntrinsicWidth() / this.f64250q);
        int iRound2 = Math.round(drawableK.getIntrinsicHeight() / this.f64250q);
        int i10 = bounds.right - iRound;
        int i11 = bounds.top;
        drawableK.setBounds(i10, i11, iRound + i10, iRound2 + i11);
        Matrix imageMatrix = getImageMatrix();
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        if (imageMatrix == null && paddingTop == 0 && paddingLeft == 0) {
            drawableK.draw(canvas);
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        if (getCropToPadding()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            canvas.clipRect(scrollX + paddingLeft, scrollY + paddingTop, ((scrollX + getRight()) - getLeft()) - getPaddingRight(), ((scrollY + getBottom()) - getTop()) - getPaddingBottom());
        }
        canvas.translate(paddingLeft, paddingTop);
        if (imageMatrix != null) {
            canvas.concat(imageMatrix);
        }
        drawableK.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
        setImageDrawable(getDrawableForSource());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        H();
        if (getDrawable() instanceof h.a) {
            ((h.a) getDrawable()).b();
            setImageDrawable(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f64247n == null) {
            return;
        }
        q(canvas);
        E(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new y((Object) accessibilityNodeInfo).p0(SourceImageView.class.getName());
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            c();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        D(j(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f64234a = motionEvent.getX();
        this.f64235b = motionEvent.getY();
        w wVarJ = j(motionEvent.getX(), motionEvent.getY());
        if (wVarJ != null) {
            o(wVarJ);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (I()) {
            zOnTouchEvent = this.f64241h.onTouchEvent(motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        if (!super.onTouchEvent(motionEvent) && !zOnTouchEvent) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        if (drawable != drawable2 && (drawable2 instanceof com.flipp.sfml.views.b)) {
            ((com.flipp.sfml.views.b) drawable2).r(null);
        }
        super.setImageDrawable(drawable);
        J();
    }

    public SourceImageView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f64250q = 1.0f;
        a();
    }
}
