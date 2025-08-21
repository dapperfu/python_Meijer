package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import com.scandit.datacapture.core.internal.sdk.ui.hint.GuidanceHint;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.ToastHint;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class E extends NativePlatformHintPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f126191a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f126192b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f126193c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f126194d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f126195e;

    /* renamed from: f, reason: collision with root package name */
    public final D f126196f;

    public E(HintHolderV2 hintHolder) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.j(hintHolder, "hintHolder");
        Intrinsics.j(handler, "handler");
        this.f126191a = handler;
        this.f126192b = new WeakReference(null);
        this.f126193c = new AtomicBoolean(false);
        this.f126194d = new AtomicLong(Long.MAX_VALUE);
        this.f126195e = new WeakReference(hintHolder);
        this.f126196f = new D(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideGuidance(NativeGuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f126195e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.hideGuidance(new GuidanceHint(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideToast(NativeToastHint toast) {
        Intrinsics.j(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f126195e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.hideToast(new ToastHint(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void setHintPresenter(NativeHintPresenterV2 presenter) {
        Intrinsics.j(presenter, "presenter");
        this.f126192b = new WeakReference(presenter);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showGuidance(NativeGuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f126195e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.showGuidance(new GuidanceHint(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showToast(NativeToastHint toast) {
        Intrinsics.j(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f126195e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.showToast(new ToastHint(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void startUpdateTimer(long j10) {
        this.f126193c.set(true);
        this.f126194d.set(j10);
        this.f126191a.removeCallbacks(this.f126196f);
        this.f126191a.post(this.f126196f);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void stopUpdateTimer() {
        this.f126193c.set(false);
        this.f126191a.removeCallbacks(this.f126196f);
    }
}
