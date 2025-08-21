package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.count.ui.q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.V0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122722a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122724c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f122725d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f122726e;

    public static final void a(q this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122722a.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, V0 onStatusButtonTapped) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(onStatusButtonTapped, "onStatusButtonTapped");
        this.f122722a = onStatusButtonTapped;
        ImageView imageView = new ImageView(context);
        FS.Resources_setImageResource(imageView, R.drawable.sc_button_status_enabled);
        imageView.setAdjustViewBounds(true);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        this.f122725d = imageView;
        ImageView imageView2 = new ImageView(context);
        FS.Resources_setImageResource(imageView2, R.drawable.sc_button_status_active);
        imageView2.setAdjustViewBounds(true);
        imageView2.setAlpha(0.0f);
        addView(imageView2, new FrameLayout.LayoutParams(-1, -1));
        this.f122726e = imageView2;
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getStatusModeButtonContentDescription());
        setOnClickListener(new View.OnClickListener() { // from class: Jt.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.a(this.f16231a, view);
            }
        });
    }

    public final void a(boolean z10) {
        synchronized (this) {
            try {
                if (!this.f122724c) {
                    this.f122724c = true;
                    this.f122723b = z10;
                    float f10 = 1.0f;
                    this.f122725d.animate().setDuration(300L).alpha(this.f122723b ? 0.0f : 1.0f).withEndAction(new Runnable() { // from class: Jt.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            q.a(this.f16230a);
                        }
                    }).start();
                    ViewPropertyAnimator duration = this.f122726e.animate().setDuration(300L);
                    if (!this.f122723b) {
                        f10 = 0.0f;
                    }
                    duration.alpha(f10).start();
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        int i10;
        float f10;
        super.setEnabled(z10);
        if (this.f122723b) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            setAlpha(f10);
            return;
        }
        ImageView imageView = this.f122725d;
        if (z10) {
            i10 = R.drawable.sc_button_status_enabled;
        } else {
            i10 = R.drawable.sc_button_status_disabled;
        }
        FS.Resources_setImageResource(imageView, i10);
    }

    public static final void a(q this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122724c = false;
    }
}
