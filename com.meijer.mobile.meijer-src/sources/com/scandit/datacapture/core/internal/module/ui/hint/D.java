package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;

/* loaded from: classes12.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f126190a;

    public D(E e10) {
        this.f126190a = e10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeHintPresenterV2 nativeHintPresenterV2 = (NativeHintPresenterV2) this.f126190a.f126192b.get();
        if (nativeHintPresenterV2 != null) {
            E e10 = this.f126190a;
            if (e10.f126193c.get()) {
                nativeHintPresenterV2.update();
                e10.f126191a.postDelayed(this, e10.f126194d.get());
            }
        }
    }
}
