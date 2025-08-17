package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import h4.C14349D;

/* loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final c f57318a;

    /* renamed from: b, reason: collision with root package name */
    private float f57319b;

    /* renamed from: c, reason: collision with root package name */
    private int f57320c;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f57321a;

        /* renamed from: b, reason: collision with root package name */
        private float f57322b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f57323c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f57324d;

        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57324d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }

        public void a(float f10, float f11, boolean z10) {
            this.f57321a = f10;
            this.f57322b = f11;
            this.f57323c = z10;
            if (this.f57324d) {
                return;
            }
            this.f57324d = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public int getResizeMode() {
        return this.f57320c;
    }

    public void setAspectRatio(float f10) {
        if (this.f57319b != f10) {
            this.f57319b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f57320c != i10) {
            this.f57320c = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57320c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C14349D.f134306a, 0, 0);
            try {
                this.f57320c = typedArrayObtainStyledAttributes.getInt(C14349D.f134308b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f57318a = new c();
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
        if (this.f57319b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f57319b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f57318a.a(this.f57319b, f14, false);
            return;
        }
        int i12 = this.f57320c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f15 > 0.0f) {
                            f10 = this.f57319b;
                        } else {
                            f11 = this.f57319b;
                        }
                    }
                } else {
                    f10 = this.f57319b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f57319b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f57319b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f57319b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f57318a.a(this.f57319b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
