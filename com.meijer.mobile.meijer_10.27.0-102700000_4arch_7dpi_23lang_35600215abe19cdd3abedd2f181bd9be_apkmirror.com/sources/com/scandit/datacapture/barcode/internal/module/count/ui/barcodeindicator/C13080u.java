package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13080u extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f121483a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f121484b;

    public final void a(Integer num, Integer num2, NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        Intrinsics.j(colorScheme, "colorScheme");
        Y y10 = null;
        if (num == null || num2 == null) {
            ImageView imageView = this.f121483a;
            if (imageView == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
                imageView = null;
            }
            imageView.setImageBitmap(null);
            ImageView imageView2 = this.f121483a;
            if (imageView2 == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
                imageView2 = null;
            }
            imageView2.clearColorFilter();
        } else {
            ImageView imageView3 = this.f121483a;
            if (imageView3 == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
                imageView3 = null;
            }
            FS.Resources_setImageResource(imageView3, num.intValue());
            ImageView imageView4 = this.f121483a;
            if (imageView4 == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
                imageView4 = null;
            }
            imageView4.setColorFilter(new LightingColorFilter(-1, num2.intValue()));
        }
        Y y11 = this.f121484b;
        if (y11 == null) {
            Intrinsics.y("warningBackground");
        } else {
            y10 = y11;
        }
        y10.getClass();
        Intrinsics.j(colorScheme, "<set-?>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13080u(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setClickable(true);
        setFocusable(true);
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        Y y10 = new Y(context2);
        this.f121484b = y10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(y10, layoutParams);
        ImageView imageView = new ImageView(getContext());
        FS.Resources_setImageResource(imageView, R.drawable.sc_ic_barcode_scanned);
        imageView.setAdjustViewBounds(true);
        this.f121483a = imageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(imageView, layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y y10 = this.f121484b;
        if (y10 == null) {
            Intrinsics.y("warningBackground");
            y10 = null;
        }
        y10.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Y y10 = this.f121484b;
        if (y10 == null) {
            Intrinsics.y("warningBackground");
            y10 = null;
        }
        y10.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.Y] */
    public final void a(Integer num, NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        Intrinsics.j(colorScheme, "colorScheme");
        ImageView imageView = null;
        if (num == null) {
            ImageView imageView2 = this.f121483a;
            if (imageView2 == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
                imageView2 = null;
            }
            imageView2.setImageBitmap(null);
            ImageView imageView3 = this.f121483a;
            if (imageView3 == null) {
                Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
            } else {
                imageView = imageView3;
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView4 = this.f121483a;
        if (imageView4 == null) {
            Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
            imageView4 = null;
        }
        FS.Resources_setImageResource(imageView4, num.intValue());
        ImageView imageView5 = this.f121483a;
        if (imageView5 == null) {
            Intrinsics.y(BarcodePickDeserializer.FIELD_ICON);
            imageView5 = null;
        }
        imageView5.clearColorFilter();
        ?? r42 = this.f121484b;
        if (r42 == 0) {
            Intrinsics.y("warningBackground");
        } else {
            imageView = r42;
        }
        imageView.getClass();
        Intrinsics.j(colorScheme, "<set-?>");
    }

    public final void a(int i10, String str, int i11) {
        setContentDescription(getResources().getString(i10, str, getResources().getString(i11)));
    }
}
