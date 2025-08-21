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

/* loaded from: classes12.dex */
public final class SparkScanFeedbackManager {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f124075a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScanStateManager f124076b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f124077c;

    /* renamed from: d, reason: collision with root package name */
    private b f124078d;

    /* renamed from: e, reason: collision with root package name */
    private c f124079e;

    /* renamed from: f, reason: collision with root package name */
    private Feedback f124080f;

    /* renamed from: g, reason: collision with root package name */
    private Feedback f124081g;

    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f124077c = container;
        Vibration vibration = new Vibration();
        vibration.setDuration(TimeInterval.INSTANCE.millis(40L));
        ViewGroup viewGroup = null;
        this.f124081g = new Feedback(vibration, null, 2, null);
        ViewGroup viewGroup2 = this.f124077c;
        if (viewGroup2 == null) {
            Intrinsics.x("container");
            viewGroup2 = null;
        }
        viewGroup2.removeView(this.f124078d);
        ViewGroup viewGroup3 = this.f124077c;
        if (viewGroup3 == null) {
            Intrinsics.x("container");
            viewGroup3 = null;
        }
        viewGroup3.removeView(this.f124079e);
        ViewGroup viewGroup4 = this.f124077c;
        if (viewGroup4 == null) {
            Intrinsics.x("container");
            viewGroup4 = null;
        }
        Context context = viewGroup4.getContext();
        Intrinsics.i(context, "getContext(...)");
        this.f124078d = new b(context);
        ViewGroup viewGroup5 = this.f124077c;
        if (viewGroup5 == null) {
            Intrinsics.x("container");
            viewGroup5 = null;
        }
        Context context2 = viewGroup5.getContext();
        Intrinsics.i(context2, "getContext(...)");
        this.f124079e = new c(context2);
        ViewGroup viewGroup6 = this.f124077c;
        if (viewGroup6 == null) {
            Intrinsics.x("container");
            viewGroup6 = null;
        }
        viewGroup6.addView(this.f124078d);
        ViewGroup viewGroup7 = this.f124077c;
        if (viewGroup7 == null) {
            Intrinsics.x("container");
        } else {
            viewGroup = viewGroup7;
        }
        viewGroup.addView(this.f124079e);
    }

    public final void b(int i10) {
        c cVar;
        if (!this.f124075a.getVisualFeedbackEnabled() || (cVar = this.f124079e) == null) {
            return;
        }
        cVar.a(i10);
    }

    public SparkScanFeedbackManager(SparkScanViewSettings settings, SparkScanStateManager stateManager) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(stateManager, "stateManager");
        this.f124075a = settings;
        this.f124076b = stateManager;
    }

    public final void b() {
        Feedback feedback = this.f124081g;
        if (feedback != null) {
            feedback.release();
        }
        Feedback feedback2 = this.f124080f;
        if (feedback2 != null) {
            feedback2.release();
        }
        this.f124079e = null;
        this.f124078d = null;
    }

    public final void a() {
        Feedback feedback;
        if (this.f124076b.d() && (feedback = this.f124081g) != null) {
            feedback.emit();
        }
    }

    public final void a(int i10) {
        b bVar;
        if (!this.f124075a.getVisualFeedbackEnabled() || (bVar = this.f124078d) == null) {
            return;
        }
        bVar.a(i10);
    }

    public final void a(Feedback feedback) {
        boolean zD = this.f124076b.d();
        boolean zS = this.f124076b.s();
        Sound sound = null;
        Vibration vibration = (!zD || feedback == null) ? null : feedback.getVibration();
        if (zS && feedback != null) {
            sound = feedback.getSound();
        }
        Feedback feedback2 = new Feedback(vibration, sound);
        this.f124080f = feedback2;
        feedback2.emit();
    }
}
