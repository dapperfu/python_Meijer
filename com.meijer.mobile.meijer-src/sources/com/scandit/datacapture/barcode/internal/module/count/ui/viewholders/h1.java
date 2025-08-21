package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.SharedPreferences;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f122965a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b f122966b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f122967c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122968d;

    /* renamed from: e, reason: collision with root package name */
    public BarcodeCountToolbarSettings f122969e;

    /* renamed from: f, reason: collision with root package name */
    public BarcodeCountToolbarView f122970f;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        BarcodeCountToolbarView barcodeCountToolbarView;
        BarcodeCountToolbarView barcodeCountToolbarView2 = this.f122970f;
        if (barcodeCountToolbarView2 != null) {
            barcodeCountToolbarView2.setVisibility(this.f122968d ? 0 : 4);
        }
        if (!this.f122968d || (barcodeCountToolbarView = this.f122970f) == null) {
            return;
        }
        barcodeCountToolbarView.a();
    }

    public h1(FrameLayout container, SharedPreferences sharedPreferences) {
        Intrinsics.j(container, "container");
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        this.f122965a = sharedPreferences;
        this.f122967c = new z1(container);
        this.f122968d = BarcodeCountViewDefaults.INSTANCE.getShouldShowToolbar();
        this.f122969e = new BarcodeCountToolbarSettings();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122967c.b(this.f122970f, new f1(this));
        BarcodeCountToolbarView barcodeCountToolbarView = this.f122970f;
        if (barcodeCountToolbarView == null) {
            return;
        }
        barcodeCountToolbarView.setVisibility(4);
    }

    public static String a(a1 a1Var) {
        int iOrdinal = a1Var.ordinal();
        if (iOrdinal == 0) {
            return "barcode_count_toolbar_audio_feedback_key";
        }
        if (iOrdinal == 1) {
            return "barcode_count_toolbar_haptic_feedback_key";
        }
        if (iOrdinal == 2) {
            return "barcode_count_toolbar_strap_mode_key";
        }
        if (iOrdinal == 3) {
            return "barcode_count_toolbar_color_scheme_key";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(String key, boolean z10) {
        Intrinsics.j(key, "key");
        this.f122965a.edit().putBoolean(key, z10).apply();
        this.f122967c.a(new g1(this));
    }
}
