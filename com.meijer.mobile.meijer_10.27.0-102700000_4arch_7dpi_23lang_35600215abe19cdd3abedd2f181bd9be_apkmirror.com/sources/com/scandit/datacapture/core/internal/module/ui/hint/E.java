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

/* loaded from: classes11.dex */
public final class E extends NativePlatformHintPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f125239a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f125240b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f125241c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f125242d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f125243e;

    /* renamed from: f, reason: collision with root package name */
    public final D f125244f;

    public E(HintHolderV2 hintHolder) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.j(hintHolder, "hintHolder");
        Intrinsics.j(handler, "handler");
        this.f125239a = handler;
        this.f125240b = new WeakReference(null);
        this.f125241c = new AtomicBoolean(false);
        this.f125242d = new AtomicLong(Long.MAX_VALUE);
        this.f125243e = new WeakReference(hintHolder);
        this.f125244f = new D(this);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideGuidance(NativeGuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f125243e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.hideGuidance(new GuidanceHint(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void hideToast(NativeToastHint toast) {
        Intrinsics.j(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f125243e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.hideToast(new ToastHint(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void setHintPresenter(NativeHintPresenterV2 presenter) {
        Intrinsics.j(presenter, "presenter");
        this.f125240b = new WeakReference(presenter);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showGuidance(NativeGuidanceHint guidance) {
        Intrinsics.j(guidance, "guidance");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f125243e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.showGuidance(new GuidanceHint(guidance));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void showToast(NativeToastHint toast) {
        Intrinsics.j(toast, "toast");
        HintHolderV2 hintHolderV2 = (HintHolderV2) this.f125243e.get();
        if (hintHolderV2 != null) {
            hintHolderV2.showToast(new ToastHint(toast));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void startUpdateTimer(long j10) {
        this.f125241c.set(true);
        this.f125242d.set(j10);
        this.f125239a.removeCallbacks(this.f125244f);
        this.f125239a.post(this.f125244f);
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter
    public final void stopUpdateTimer() {
        this.f125241c.set(false);
        this.f125239a.removeCallbacks(this.f125244f);
    }
}
