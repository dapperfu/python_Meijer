package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/ColorBorderDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "<init>", "()V", "", "start", "stop", "", "isRunning", "()Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "left", "top", "right", "bottom", "setBounds", "(IIII)V", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "com/scandit/datacapture/core/internal/sdk/ui/cardscarousel/u", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ColorBorderDrawable extends Drawable implements Animatable, FSDraw {

    @Deprecated
    public static final long ALPHA_ANIMATION_DURATION = 300;

    @Deprecated
    public static final int BLUR_EDGE_COLOR = -1426063361;

    @Deprecated
    public static final long COLOR_ANIMATION_DELAY = 200;

    @Deprecated
    public static final long COLOR_ANIMATION_DURATION = 8000;

    @Deprecated
    public static final float COLOR_GRADIENT_SPREAD = 3.0f;

    @Deprecated
    public static final long FPS = 16;

    /* renamed from: l, reason: collision with root package name */
    private static final Lazy f125592l = LazyKt.b(t.f125704a);

    /* renamed from: m, reason: collision with root package name */
    private static final Lazy f125593m = LazyKt.b(s.f125703a);

    /* renamed from: n, reason: collision with root package name */
    private static final List f125594n = CollectionsKt.p(-10085, -36975, -5937409, -10160385, -10085);

    /* renamed from: o, reason: collision with root package name */
    private static final List f125595o = CollectionsKt.p(Float.valueOf(0.0f), Float.valueOf(0.2f), Float.valueOf(0.45f), Float.valueOf(0.7f), Float.valueOf(1.0f));

    /* renamed from: a, reason: collision with root package name */
    private final Map f125596a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f125597b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f125598c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f125599d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f125600e;

    /* renamed from: f, reason: collision with root package name */
    private float f125601f;

    /* renamed from: g, reason: collision with root package name */
    private float f125602g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f125603h;

    /* renamed from: i, reason: collision with root package name */
    private long f125604i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f125605j;

    /* renamed from: k, reason: collision with root package name */
    private final ColorBorderDrawable$updater$1 f125606k;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                u uVar = u.f125705a;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                u uVar2 = u.f125705a;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                u uVar3 = u.f125705a;
                iArr[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                u uVar4 = u.f125705a;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                u uVar5 = u.f125705a;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                u uVar6 = u.f125705a;
                iArr[4] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                u uVar7 = u.f125705a;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        if (getBounds().isEmpty()) {
            return;
        }
        if (this.f125600e != null) {
            this.f125603h.reset();
            this.f125603h.setTranslate(this.f125601f * getBounds().width() * 3.0f, 0.0f);
            LinearGradient linearGradient = this.f125600e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(this.f125603h);
            }
        }
        for (u uVar : u.f125714j) {
            canvas.drawPath((Path) MapsKt.l(this.f125596a, uVar), (Paint) MapsKt.l(this.f125597b, uVar));
        }
        this.f125599d.setAlpha((int) (l3.f92484c * this.f125602g));
        canvas.drawPath(this.f125598c, this.f125599d);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f125605j;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Iterator it = this.f125597b.values().iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setAlpha(alpha);
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e0  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBounds(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ColorBorderDrawable.setBounds(int, int, int, int):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.f125597b.values().iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f125605j) {
            return;
        }
        this.f125605j = true;
        this.f125604i = AnimationUtils.currentAnimationTimeMillis();
        run();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f125605j) {
            unscheduleSelf(this.f125606k);
            this.f125605j = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ColorBorderDrawable$updater$1] */
    public ColorBorderDrawable() {
        Map mapD = MapsKt.d();
        Iterator<E> it = u.f125714j.iterator();
        while (it.hasNext()) {
            mapD.put((u) it.next(), new Path());
        }
        this.f125596a = MapsKt.c(mapD);
        Map mapD2 = MapsKt.d();
        for (u uVar : u.f125714j) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(((Number) f125593m.getValue()).floatValue());
            Unit unit = Unit.f142422a;
            mapD2.put(uVar, paint);
        }
        this.f125597b = MapsKt.c(mapD2);
        this.f125598c = new Path();
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(((Number) f125593m.getValue()).floatValue());
        paint2.setColor(-1);
        this.f125599d = paint2;
        this.f125603h = new Matrix();
        this.f125606k = new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ColorBorderDrawable$updater$1

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final AccelerateDecelerateInterpolator alphaInterpolator = new AccelerateDecelerateInterpolator();

            public final AccelerateDecelerateInterpolator getAlphaInterpolator() {
                return this.alphaInterpolator;
            }

            @Override // java.lang.Runnable
            public void run() {
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f125608b.f125604i;
                this.f125608b.f125602g = this.alphaInterpolator.getInterpolation(1.0f - (RangesKt.p(jCurrentAnimationTimeMillis, 0L, 300L) / 300.0f));
                this.f125608b.f125601f = (RangesKt.g(jCurrentAnimationTimeMillis - 200, 0L) % ColorBorderDrawable.COLOR_ANIMATION_DURATION) / 8000.0f;
                this.f125608b.scheduleSelf(this, SystemClock.uptimeMillis() + 16);
                this.f125608b.invalidateSelf();
            }
        };
    }
}
