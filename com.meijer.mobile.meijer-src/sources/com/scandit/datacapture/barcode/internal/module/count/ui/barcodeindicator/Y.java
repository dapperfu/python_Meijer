package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.Y;
import com.scandit.datacapture.core.internal.sdk.ui.interpolators.EaseInOutSineInterpolator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Y extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f122377a;

    public final void a() {
        animate().setInterpolator(new EaseInOutSineInterpolator()).setDuration(1000L).scaleX(1.0f).scaleY(1.0f).withEndAction(new Runnable() { // from class: Kt.f
            @Override // java.lang.Runnable
            public final void run() {
                Y.a(this.f17719a);
            }
        }).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Context context) {
        int i10;
        super(context);
        Intrinsics.j(context, "context");
        int i11 = X.f122376a[NativeBarcodeCountBasicOverlayColorScheme.DEFAULT.ordinal()];
        if (i11 == 1) {
            i10 = R.drawable.sc_ic_barcode_unscanned_background;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.drawable.sc_ic_barcode_unscanned_background_alt;
        }
        setBackgroundResource(i10);
    }

    public final void b() {
        onAttachedToWindow();
        if (!this.f122377a) {
            this.f122377a = true;
            setScaleX(0.667f);
            setScaleY(0.667f);
            a();
        }
    }

    public final void c() {
        onDetachedFromWindow();
        clearAnimation();
        this.f122377a = false;
    }

    public static final void a(Y this$0) {
        Intrinsics.j(this$0, "this$0");
        if (this$0.f122377a) {
            this$0.f122377a = true;
            this$0.setScaleX(0.667f);
            this$0.setScaleY(0.667f);
            this$0.a();
        }
    }
}
