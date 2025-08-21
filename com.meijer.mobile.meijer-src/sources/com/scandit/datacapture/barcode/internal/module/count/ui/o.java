package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f122709e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final m f122710a;

    /* renamed from: b, reason: collision with root package name */
    public final i f122711b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f122712c;

    /* renamed from: d, reason: collision with root package name */
    public final PulsingView f122713d;

    public o(Context context, int i10, int i11, m mVar) {
        super(context);
        this.f122710a = mVar;
        this.f122711b = new i();
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(i11, (Context) null, 1, (Object) null);
        int iPxFromDp$default2 = PixelExtensionsKt.pxFromDp$default(i10, (Context) null, 1, (Object) null);
        setClickable(true);
        setFocusable(true);
        Intrinsics.j(this, "container");
        int[] gradientColors = {com.scandit.datacapture.barcode.internal.module.extensions.a.a(-1, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(-1, 0), -1};
        Intrinsics.j(this, "container");
        Intrinsics.j(gradientColors, "gradientColors");
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        PulsingView pulsingView = new PulsingView(context2, iPxFromDp$default, iPxFromDp$default2, gradientColors);
        addView(pulsingView, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iPxFromDp$default, iPxFromDp$default);
        layoutParams.gravity = 17;
        pulsingView.setLayoutParams(layoutParams);
        this.f122713d = pulsingView;
        ImageView imageView = new ImageView(getContext());
        FS.Resources_setImageResource(imageView, R.drawable.sc_button_shutter);
        imageView.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iPxFromDp$default2, iPxFromDp$default2);
        layoutParams2.gravity = 17;
        addView(imageView, layoutParams2);
        this.f122712c = imageView;
        addOnAttachStateChangeListener(new n(this));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        setClickable(z10);
        setFocusable(z10);
        ImageView imageView = this.f122712c;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView.setAlpha(f10);
    }
}
