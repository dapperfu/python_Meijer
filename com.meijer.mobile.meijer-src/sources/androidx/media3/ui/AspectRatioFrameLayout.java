package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final c f57542a;

    /* renamed from: b, reason: collision with root package name */
    private float f57543b;

    /* renamed from: c, reason: collision with root package name */
    private int f57544c;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f57545a;

        /* renamed from: b, reason: collision with root package name */
        private float f57546b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f57547c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f57548d;

        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57548d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }

        public void a(float f10, float f11, boolean z10) {
            this.f57545a = f10;
            this.f57546b = f11;
            this.f57547c = z10;
            if (this.f57548d) {
                return;
            }
            this.f57548d = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public int getResizeMode() {
        return this.f57544c;
    }

    public void setAspectRatio(float f10) {
        if (this.f57543b != f10) {
            this.f57543b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f57544c != i10) {
            this.f57544c = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57544c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h4.D.f134777a, 0, 0);
            try {
                this.f57544c = typedArrayObtainStyledAttributes.getInt(h4.D.f134779b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f57542a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f57543b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f57543b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f57542a.a(this.f57543b, f14, false);
            return;
        }
        int i12 = this.f57544c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f15 > 0.0f) {
                            f10 = this.f57543b;
                        } else {
                            f11 = this.f57543b;
                        }
                    }
                } else {
                    f10 = this.f57543b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f57543b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f57543b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f57543b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f57542a.a(this.f57543b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
