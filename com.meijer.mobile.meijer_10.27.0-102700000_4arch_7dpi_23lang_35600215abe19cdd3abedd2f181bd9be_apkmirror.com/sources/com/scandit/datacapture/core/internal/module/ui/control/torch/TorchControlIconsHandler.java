package com.scandit.datacapture.core.internal.module.ui.control.torch;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class TorchControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final b f125206a;

    /* renamed from: b, reason: collision with root package name */
    private c f125207b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f125208c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f125209d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f125210e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f125211f;

    public final void a(TorchSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f125207b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125211f)) {
            return;
        }
        this.f125211f = value;
        c cVar = this.f125207b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.OFF, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125208c)) {
            return;
        }
        this.f125208c = value;
        c cVar = this.f125207b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.ON, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125209d)) {
            return;
        }
        this.f125209d = value;
        c cVar = this.f125207b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.ON, value, true);
        }
    }

    public TorchControlIconsHandler() {
        b defaults = new b();
        Intrinsics.j(defaults, "defaults");
        this.f125206a = defaults;
        this.f125208c = BitmapExtensionsKt.bitmapFromResource(defaults.f125214a);
        this.f125209d = BitmapExtensionsKt.bitmapFromResource(defaults.f125215b);
        this.f125210e = BitmapExtensionsKt.bitmapFromResource(defaults.f125216c);
        this.f125211f = BitmapExtensionsKt.bitmapFromResource(defaults.f125217d);
    }

    public final Bitmap a(TorchState torchState, boolean z10) {
        Intrinsics.j(torchState, "torchState");
        int i10 = d.f125218a[torchState.ordinal()];
        if (i10 == 1) {
            return !z10 ? this.f125208c : this.f125209d;
        }
        if (i10 == 2) {
            return !z10 ? this.f125210e : this.f125211f;
        }
        if (i10 == 3) {
            return !z10 ? this.f125210e : this.f125211f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Bitmap e() {
        return this.f125210e;
    }

    public final Bitmap f() {
        return this.f125211f;
    }

    public final Bitmap g() {
        return this.f125208c;
    }

    public final Bitmap h() {
        return this.f125209d;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125206a.f125217d);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125206a.f125214a);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125206a.f125215b);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125210e)) {
            return;
        }
        this.f125210e = value;
        c cVar = this.f125207b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.OFF, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125206a.f125216c);
    }
}
