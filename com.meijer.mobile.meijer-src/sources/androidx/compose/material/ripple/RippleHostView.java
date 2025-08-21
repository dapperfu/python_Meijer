package androidx.compose.material.ripple;

import U0.f;
import U0.k;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import h0.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"JN\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u001eJ0\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u001eR\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lh0/n$b;", "interaction", "LU0/k;", "size", "radius", "LV0/q0;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Lh0/n$b;ZJIJFLkotlin/jvm/functions/Function0;)V", "e", "f", "(JIJF)V", "d", "Landroidx/compose/material/ripple/b;", "a", "Landroidx/compose/material/ripple/b;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/jvm/functions/Function0;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleHostView extends View implements FSDraw {

    /* renamed from: g, reason: collision with root package name */
    public static final int f50086g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f50087h = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f50088i = new int[0];

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b ripple;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Boolean bounded;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long lastRippleStateChangeTimeMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Runnable resetRippleRunnable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onInvalidateRipple;

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            Intrinsics.g(runnable2);
            runnable2.run();
        } else {
            b bVar = this.ripple;
            if (bVar != null) {
                bVar.setState(f50088i);
            }
        }
        b bVar2 = this.ripple;
        if (bVar2 == null) {
            return;
        }
        bVar2.setVisible(false, false);
        unscheduleDrawable(bVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public void fsSuperDraw_9305815ee54e2df6e7cd4565d55457f2(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    private final void c(boolean bounded) {
        b bVar = new b(bounded);
        setBackground(bVar);
        this.ripple = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        b bVar = rippleHostView.ripple;
        if (bVar != null) {
            bVar.setState(f50088i);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    public final void b(n.b interaction, boolean bounded, long size, int radius, long color, float alpha, Function0<Unit> onInvalidateRipple) {
        if (this.ripple == null || !Intrinsics.e(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        b bVar = this.ripple;
        Intrinsics.g(bVar);
        this.onInvalidateRipple = onInvalidateRipple;
        f(size, radius, color, alpha);
        if (bounded) {
            bVar.setHotspot(f.m(interaction.getPressPosition()), f.n(interaction.getPressPosition()));
        } else {
            bVar.setHotspot(bVar.getBounds().centerX(), bVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void f(long size, int radius, long color, float alpha) {
        b bVar = this.ripple;
        if (bVar == null) {
            return;
        }
        bVar.c(radius);
        bVar.b(color, alpha);
        Rect rect = new Rect(0, 0, MathKt.d(k.i(size)), MathKt.d(k.g(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        bVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Function0<Unit> function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean pressed) {
        long jLongValue;
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.lastRippleStateChangeTimeMillis;
        if (l10 != null) {
            jLongValue = l10.longValue();
        } else {
            jLongValue = 0;
        }
        long j10 = jCurrentAnimationTimeMillis - jLongValue;
        if (!pressed && j10 < 5) {
            Runnable runnable2 = new Runnable() { // from class: B0.e
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f2155a);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            if (pressed) {
                iArr = f50087h;
            } else {
                iArr = f50088i;
            }
            b bVar = this.ripple;
            if (bVar != null) {
                bVar.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            d();
        } else {
            fsSuperDraw_9305815ee54e2df6e7cd4565d55457f2(canvas);
        }
    }
}
