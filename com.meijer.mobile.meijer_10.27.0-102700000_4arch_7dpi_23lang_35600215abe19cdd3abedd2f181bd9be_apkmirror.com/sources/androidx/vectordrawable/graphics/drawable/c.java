package androidx.vectordrawable.graphics.drawable;

import Z.C5503a;
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
import b2.C6187h;
import b2.C6190k;
import com.fullstory.instrumentation.FSDraw;
import d2.C13462a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class c extends e implements Animatable, FSDraw {

    /* renamed from: b, reason: collision with root package name */
    private C1153c f58826b;

    /* renamed from: c, reason: collision with root package name */
    private Context f58827c;

    /* renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f58828d;

    /* renamed from: e, reason: collision with root package name */
    d f58829e;

    /* renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f58830f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f58831g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable.Callback f58832h;

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
            ArrayList arrayList = new ArrayList(c.this.f58831g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f58831g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C1153c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f58835a;

        /* renamed from: b, reason: collision with root package name */
        f f58836b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f58837c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f58838d;

        /* renamed from: e, reason: collision with root package name */
        C5503a<Animator, String> f58839e;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public void a() {
            if (this.f58837c == null) {
                this.f58837c = new AnimatorSet();
            }
            this.f58837c.playTogether(this.f58838d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f58835a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public C1153c(Context context, C1153c c1153c, Drawable.Callback callback, Resources resources) {
            if (c1153c != null) {
                this.f58835a = c1153c.f58835a;
                f fVar = c1153c.f58836b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f58836b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f58836b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f58836b.mutate();
                    this.f58836b = fVar2;
                    fVar2.setCallback(callback);
                    this.f58836b.setBounds(c1153c.f58836b.getBounds());
                    this.f58836b.g(false);
                }
                ArrayList<Animator> arrayList = c1153c.f58838d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f58838d = new ArrayList<>(size);
                    this.f58839e = new C5503a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c1153c.f58838d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c1153c.f58839e.get(animator);
                        animatorClone.setTarget(this.f58836b.c(str));
                        this.f58838d.add(animatorClone);
                        this.f58839e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f58840a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f58840a.newDrawable();
            cVar.f58841a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f58832h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f58840a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f58840a.getChangingConfigurations();
        }

        public d(Drawable.ConstantState constantState) {
            this.f58840a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f58840a.newDrawable(resources);
            cVar.f58841a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f58832h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f58840a.newDrawable(resources, theme);
            cVar.f58841a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f58832h);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58816e);
                    int resourceId = typedArrayQ.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f58832h);
                        f fVar = this.f58826b.f58836b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f58826b.f58836b = fVarB;
                    }
                    typedArrayQ.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f58817f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f58827c;
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
        this.f58826b.a();
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
        Drawable drawableF = C6187h.f(context.getResources(), i10, context.getTheme());
        cVar.f58841a = drawableF;
        drawableF.setCallback(cVar.f58832h);
        cVar.f58829e = new d(cVar.f58841a.getConstantState());
        return cVar;
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f58830f;
        if (animatorListener != null) {
            this.f58826b.f58837c.removeListener(animatorListener);
            this.f58830f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f58826b.f58836b.c(str));
        C1153c c1153c = this.f58826b;
        if (c1153c.f58838d == null) {
            c1153c.f58838d = new ArrayList<>();
            this.f58826b.f58839e = new C5503a<>();
        }
        this.f58826b.f58838d.add(animator);
        this.f58826b.f58839e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f58831g == null) {
            this.f58831g = new ArrayList<>();
        }
        if (this.f58831g.contains(bVar)) {
            return;
        }
        this.f58831g.add(bVar);
        if (this.f58830f == null) {
            this.f58830f = new b();
        }
        this.f58826b.f58837c.addListener(this.f58830f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            return C13462a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f58826b.f58836b.draw(canvas);
        if (this.f58826b.f58837c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f58831g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f58831g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.d(drawable) : this.f58826b.f58836b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f58826b.f58835a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.e(drawable) : this.f58826b.f58836b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f58841a != null) {
            return new d(this.f58841a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f58826b.f58836b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f58826b.f58836b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getOpacity() : this.f58826b.f58836b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.h(drawable) : this.f58826b.f58836b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f58841a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f58826b.f58837c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.isStateful() : this.f58826b.f58836b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f58826b.f58836b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.setLevel(i10) : this.f58826b.f58836b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.setState(iArr) : this.f58826b.f58836b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f58826b.f58836b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.j(drawable, z10);
        } else {
            this.f58826b.f58836b.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f58826b.f58836b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.n(drawable, i10);
        } else {
            this.f58826b.f58836b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.o(drawable, colorStateList);
        } else {
            this.f58826b.f58836b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.p(drawable, mode);
        } else {
            this.f58826b.f58836b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f58826b.f58836b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f58826b.f58837c.isStarted()) {
                return;
            }
            this.f58826b.f58837c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f58826b.f58837c.end();
        }
    }

    private c(Context context, C1153c c1153c, Resources resources) {
        this.f58828d = null;
        this.f58830f = null;
        this.f58831g = null;
        a aVar = new a();
        this.f58832h = aVar;
        this.f58827c = context;
        if (c1153c != null) {
            this.f58826b = c1153c;
        } else {
            this.f58826b = new C1153c(context, c1153c, aVar, resources);
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
