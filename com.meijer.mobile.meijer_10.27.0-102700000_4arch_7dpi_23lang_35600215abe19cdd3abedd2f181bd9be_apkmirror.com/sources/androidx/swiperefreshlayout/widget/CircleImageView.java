package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
class CircleImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f58705a;

    /* renamed from: b, reason: collision with root package name */
    private int f58706b;

    /* renamed from: c, reason: collision with root package name */
    private int f58707c;

    private static class a extends OvalShape {

        /* renamed from: a, reason: collision with root package name */
        private Paint f58708a = new Paint();

        /* renamed from: b, reason: collision with root package name */
        private int f58709b;

        /* renamed from: c, reason: collision with root package name */
        private CircleImageView f58710c;

        private void a(int i10) {
            float f10 = i10 / 2;
            this.f58708a.setShader(new RadialGradient(f10, f10, this.f58709b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f58710c.getWidth() / 2;
            float height = this.f58710c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f58708a);
            canvas.drawCircle(width, height, r0 - this.f58709b, paint);
        }

        a(CircleImageView circleImageView, int i10) {
            this.f58710c = circleImageView;
            this.f58709b = i10;
            a((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f58705a = animationListener;
    }

    CircleImageView(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f58706b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(E4.a.f7615f);
        this.f58707c = typedArrayObtainStyledAttributes.getColor(E4.a.f7616g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.u0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f58706b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f58706b, i11, i10, 503316480);
            int i12 = this.f58706b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f58707c);
        ViewCompat.q0(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f58705a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f58705a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f58706b * 2), getMeasuredHeight() + (this.f58706b * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f58707c = i10;
        }
    }
}
