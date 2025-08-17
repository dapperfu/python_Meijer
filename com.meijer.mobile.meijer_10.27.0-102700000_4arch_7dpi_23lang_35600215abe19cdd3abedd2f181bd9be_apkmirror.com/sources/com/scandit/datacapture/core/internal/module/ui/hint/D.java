package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;

/* loaded from: classes11.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f125238a;

    public D(E e10) {
        this.f125238a = e10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeHintPresenterV2 nativeHintPresenterV2 = (NativeHintPresenterV2) this.f125238a.f125240b.get();
        if (nativeHintPresenterV2 != null) {
            E e10 = this.f125238a;
            if (e10.f125241c.get()) {
                nativeHintPresenterV2.update();
                e10.f125239a.postDelayed(this, e10.f125242d.get());
            }
        }
    }
}
