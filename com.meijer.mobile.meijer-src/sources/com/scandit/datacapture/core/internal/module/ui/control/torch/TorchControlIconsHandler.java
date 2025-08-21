package com.scandit.datacapture.core.internal.module.ui.control.torch;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class TorchControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final b f126158a;

    /* renamed from: b, reason: collision with root package name */
    private c f126159b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f126160c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f126161d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f126162e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f126163f;

    public final void a(TorchSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f126159b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126163f)) {
            return;
        }
        this.f126163f = value;
        c cVar = this.f126159b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.OFF, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126160c)) {
            return;
        }
        this.f126160c = value;
        c cVar = this.f126159b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.ON, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126161d)) {
            return;
        }
        this.f126161d = value;
        c cVar = this.f126159b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.ON, value, true);
        }
    }

    public TorchControlIconsHandler() {
        b defaults = new b();
        Intrinsics.j(defaults, "defaults");
        this.f126158a = defaults;
        this.f126160c = BitmapExtensionsKt.bitmapFromResource(defaults.f126166a);
        this.f126161d = BitmapExtensionsKt.bitmapFromResource(defaults.f126167b);
        this.f126162e = BitmapExtensionsKt.bitmapFromResource(defaults.f126168c);
        this.f126163f = BitmapExtensionsKt.bitmapFromResource(defaults.f126169d);
    }

    public final Bitmap a(TorchState torchState, boolean z10) {
        Intrinsics.j(torchState, "torchState");
        int i10 = d.f126170a[torchState.ordinal()];
        if (i10 == 1) {
            return !z10 ? this.f126160c : this.f126161d;
        }
        if (i10 == 2) {
            return !z10 ? this.f126162e : this.f126163f;
        }
        if (i10 == 3) {
            return !z10 ? this.f126162e : this.f126163f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Bitmap e() {
        return this.f126162e;
    }

    public final Bitmap f() {
        return this.f126163f;
    }

    public final Bitmap g() {
        return this.f126160c;
    }

    public final Bitmap h() {
        return this.f126161d;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126158a.f126169d);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126158a.f126166a);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126158a.f126167b);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126162e)) {
            return;
        }
        this.f126162e = value;
        c cVar = this.f126159b;
        if (cVar != null) {
            cVar.onIconsChanged(TorchState.OFF, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126158a.f126168c);
    }
}
