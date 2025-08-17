package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/AnimatedGradientTextView;", "Landroid/widget/TextView;", "Landroid/graphics/drawable/Animatable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "start", "()V", "stop", "", "isRunning", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AnimatedGradientTextView extends TextView implements Animatable {

    @Deprecated
    public static final long ANIMATION_DURATION = 2500;

    @Deprecated
    public static final long FPS = 16;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f125550a;

    /* renamed from: b, reason: collision with root package name */
    private LinearGradient f125551b;

    /* renamed from: c, reason: collision with root package name */
    private float f125552c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f125553d;

    /* renamed from: e, reason: collision with root package name */
    private long f125554e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f125555f;

    /* renamed from: g, reason: collision with root package name */
    private final AnimatedGradientTextView$updater$1 f125556g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimatedGradientTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimatedGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f125555f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        CharSequence text = getText();
        if (text == null || text.length() == 0 || this.f125551b == null) {
            return;
        }
        this.f125553d.reset();
        this.f125553d.setTranslate(this.f125552c * getWidth(), 0.0f);
        LinearGradient linearGradient = this.f125551b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.f125553d);
        }
        canvas.drawText(getText().toString(), 0.0f, getBaseline(), this.f125550a);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f125555f) {
            return;
        }
        this.f125555f = true;
        this.f125554e = AnimationUtils.currentAnimationTimeMillis();
        this.f125556g.run();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f125555f) {
            removeCallbacks(this.f125556g);
            this.f125555f = false;
        }
    }

    public /* synthetic */ AnimatedGradientTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        float width = getWidth();
        int currentTextColor = getCurrentTextColor();
        int iArgb = Color.argb(64, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor));
        int currentTextColor2 = getCurrentTextColor();
        int iArgb2 = Color.argb(l3.f92484c, Color.red(currentTextColor2), Color.green(currentTextColor2), Color.blue(currentTextColor2));
        int currentTextColor3 = getCurrentTextColor();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{iArgb, iArgb2, Color.argb(64, Color.red(currentTextColor3), Color.green(currentTextColor3), Color.blue(currentTextColor3))}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.f125551b = linearGradient;
        this.f125550a.setShader(linearGradient);
        this.f125550a.setTextSize(getTextSize());
        this.f125550a.setTypeface(getTypeface());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimatedGradientTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.f125550a = new Paint(1);
        this.f125553d = new Matrix();
        setWillNotDraw(false);
        this.f125556g = new AnimatedGradientTextView$updater$1(this);
    }
}
