package com.scandit.datacapture.barcode.internal.module.spark.ui.feedback;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class SparkScanFeedbackManager {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f123123a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScanStateManager f123124b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f123125c;

    /* renamed from: d, reason: collision with root package name */
    private b f123126d;

    /* renamed from: e, reason: collision with root package name */
    private c f123127e;

    /* renamed from: f, reason: collision with root package name */
    private Feedback f123128f;

    /* renamed from: g, reason: collision with root package name */
    private Feedback f123129g;

    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f123125c = container;
        Vibration vibration = new Vibration();
        vibration.setDuration(TimeInterval.INSTANCE.millis(40L));
        ViewGroup viewGroup = null;
        this.f123129g = new Feedback(vibration, null, 2, null);
        ViewGroup viewGroup2 = this.f123125c;
        if (viewGroup2 == null) {
            Intrinsics.y("container");
            viewGroup2 = null;
        }
        viewGroup2.removeView(this.f123126d);
        ViewGroup viewGroup3 = this.f123125c;
        if (viewGroup3 == null) {
            Intrinsics.y("container");
            viewGroup3 = null;
        }
        viewGroup3.removeView(this.f123127e);
        ViewGroup viewGroup4 = this.f123125c;
        if (viewGroup4 == null) {
            Intrinsics.y("container");
            viewGroup4 = null;
        }
        Context context = viewGroup4.getContext();
        Intrinsics.i(context, "getContext(...)");
        this.f123126d = new b(context);
        ViewGroup viewGroup5 = this.f123125c;
        if (viewGroup5 == null) {
            Intrinsics.y("container");
            viewGroup5 = null;
        }
        Context context2 = viewGroup5.getContext();
        Intrinsics.i(context2, "getContext(...)");
        this.f123127e = new c(context2);
        ViewGroup viewGroup6 = this.f123125c;
        if (viewGroup6 == null) {
            Intrinsics.y("container");
            viewGroup6 = null;
        }
        viewGroup6.addView(this.f123126d);
        ViewGroup viewGroup7 = this.f123125c;
        if (viewGroup7 == null) {
            Intrinsics.y("container");
        } else {
            viewGroup = viewGroup7;
        }
        viewGroup.addView(this.f123127e);
    }

    public final void b(int i10) {
        c cVar;
        if (!this.f123123a.getVisualFeedbackEnabled() || (cVar = this.f123127e) == null) {
            return;
        }
        cVar.a(i10);
    }

    public SparkScanFeedbackManager(SparkScanViewSettings settings, SparkScanStateManager stateManager) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(stateManager, "stateManager");
        this.f123123a = settings;
        this.f123124b = stateManager;
    }

    public final void b() {
        Feedback feedback = this.f123129g;
        if (feedback != null) {
            feedback.release();
        }
        Feedback feedback2 = this.f123128f;
        if (feedback2 != null) {
            feedback2.release();
        }
        this.f123127e = null;
        this.f123126d = null;
    }

    public final void a() {
        Feedback feedback;
        if (this.f123124b.d() && (feedback = this.f123129g) != null) {
            feedback.emit();
        }
    }

    public final void a(int i10) {
        b bVar;
        if (!this.f123123a.getVisualFeedbackEnabled() || (bVar = this.f123126d) == null) {
            return;
        }
        bVar.a(i10);
    }

    public final void a(Feedback feedback) {
        boolean zD = this.f123124b.d();
        boolean zS = this.f123124b.s();
        Sound sound = null;
        Vibration vibration = (!zD || feedback == null) ? null : feedback.getVibration();
        if (zS && feedback != null) {
            sound = feedback.getSound();
        }
        Feedback feedback2 = new Feedback(vibration, sound);
        this.f123128f = feedback2;
        feedback2.emit();
    }
}
