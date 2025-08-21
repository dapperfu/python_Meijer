package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9147p implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f78297a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f78298b;

    public C9147p(r rVar, DisplayManager displayManager) {
        this.f78298b = rVar;
        this.f78297a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    private final Display c() {
        return this.f78297a.getDisplay(0);
    }

    public final void a() {
        this.f78297a.registerDisplayListener(this, OV.Q(null));
        r.b(this.f78298b, c());
    }

    public final void b() {
        this.f78297a.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            r.b(this.f78298b, c());
        }
    }
}
