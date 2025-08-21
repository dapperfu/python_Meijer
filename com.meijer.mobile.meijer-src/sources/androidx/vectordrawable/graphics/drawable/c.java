package androidx.vectordrawable.graphics.drawable;

import Z.C5603a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b2.C6327h;
import b2.C6330k;
import com.fullstory.instrumentation.FSDraw;
import d2.C13595a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class c extends e implements Animatable, FSDraw {

    /* renamed from: b, reason: collision with root package name */
    private C1163c f59012b;

    /* renamed from: c, reason: collision with root package name */
    private Context f59013c;

    /* renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f59014d;

    /* renamed from: e, reason: collision with root package name */
    d f59015e;

    /* renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f59016f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f59017g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable.Callback f59018h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f59017g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f59017g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C1163c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f59021a;

        /* renamed from: b, reason: collision with root package name */
        f f59022b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f59023c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f59024d;

        /* renamed from: e, reason: collision with root package name */
        C5603a<Animator, String> f59025e;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public void a() {
            if (this.f59023c == null) {
                this.f59023c = new AnimatorSet();
            }
            this.f59023c.playTogether(this.f59024d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f59021a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public C1163c(Context context, C1163c c1163c, Drawable.Callback callback, Resources resources) {
            if (c1163c != null) {
                this.f59021a = c1163c.f59021a;
                f fVar = c1163c.f59022b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f59022b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f59022b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f59022b.mutate();
                    this.f59022b = fVar2;
                    fVar2.setCallback(callback);
                    this.f59022b.setBounds(c1163c.f59022b.getBounds());
                    this.f59022b.g(false);
                }
                ArrayList<Animator> arrayList = c1163c.f59024d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f59024d = new ArrayList<>(size);
                    this.f59025e = new C5603a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c1163c.f59024d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c1163c.f59025e.get(animator);
                        animatorClone.setTarget(this.f59022b.c(str));
                        this.f59024d.add(animatorClone);
                        this.f59025e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f59026a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f59026a.newDrawable();
            cVar.f59027a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f59018h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f59026a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f59026a.getChangingConfigurations();
        }

        public d(Drawable.ConstantState constantState) {
            this.f59026a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f59026a.newDrawable(resources);
            cVar.f59027a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f59018h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f59026a.newDrawable(resources, theme);
            cVar.f59027a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f59018h);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayQ = C6330k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f59002e);
                    int resourceId = typedArrayQ.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f59018h);
                        f fVar = this.f59012b.f59022b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f59012b.f59022b = fVarB;
                    }
                    typedArrayQ.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f59003f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f59013c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f59012b.a();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    private c(Context context) {
        this(context, null, null);
    }

    public static c a(Context context, int i10) throws Resources.NotFoundException {
        c cVar = new c(context);
        Drawable drawableF = C6327h.f(context.getResources(), i10, context.getTheme());
        cVar.f59027a = drawableF;
        drawableF.setCallback(cVar.f59018h);
        cVar.f59015e = new d(cVar.f59027a.getConstantState());
        return cVar;
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f59016f;
        if (animatorListener != null) {
            this.f59012b.f59023c.removeListener(animatorListener);
            this.f59016f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f59012b.f59022b.c(str));
        C1163c c1163c = this.f59012b;
        if (c1163c.f59024d == null) {
            c1163c.f59024d = new ArrayList<>();
            this.f59012b.f59025e = new C5603a<>();
        }
        this.f59012b.f59024d.add(animator);
        this.f59012b.f59025e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f59017g == null) {
            this.f59017g = new ArrayList<>();
        }
        if (this.f59017g.contains(bVar)) {
            return;
        }
        this.f59017g.add(bVar);
        if (this.f59016f == null) {
            this.f59016f = new b();
        }
        this.f59012b.f59023c.addListener(this.f59016f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            return C13595a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f59012b.f59022b.draw(canvas);
        if (this.f59012b.f59023c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f59017g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f59017g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.d(drawable) : this.f59012b.f59022b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f59012b.f59021a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.e(drawable) : this.f59012b.f59022b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f59027a != null) {
            return new d(this.f59027a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f59012b.f59022b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f59012b.f59022b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getOpacity() : this.f59012b.f59022b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.h(drawable) : this.f59012b.f59022b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f59027a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f59012b.f59023c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.isStateful() : this.f59012b.f59022b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f59012b.f59022b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.setLevel(i10) : this.f59012b.f59022b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.setState(iArr) : this.f59012b.f59022b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f59012b.f59022b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.j(drawable, z10);
        } else {
            this.f59012b.f59022b.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f59012b.f59022b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.n(drawable, i10);
        } else {
            this.f59012b.f59022b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.o(drawable, colorStateList);
        } else {
            this.f59012b.f59022b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.p(drawable, mode);
        } else {
            this.f59012b.f59022b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f59012b.f59022b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f59012b.f59023c.isStarted()) {
                return;
            }
            this.f59012b.f59023c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f59012b.f59023c.end();
        }
    }

    private c(Context context, C1163c c1163c, Resources resources) {
        this.f59014d = null;
        this.f59016f = null;
        this.f59017g = null;
        a aVar = new a();
        this.f59018h = aVar;
        this.f59013c = context;
        if (c1163c != null) {
            this.f59012b = c1163c;
        } else {
            this.f59012b = new C1163c(context, c1163c, aVar, resources);
        }
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
