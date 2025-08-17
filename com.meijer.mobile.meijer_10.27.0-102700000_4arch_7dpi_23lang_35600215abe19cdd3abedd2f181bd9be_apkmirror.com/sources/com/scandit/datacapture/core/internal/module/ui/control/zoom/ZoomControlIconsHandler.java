package com.scandit.datacapture.core.internal.module.ui.control.zoom;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ZoomControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f125219a;

    /* renamed from: b, reason: collision with root package name */
    private b f125220b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f125221c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f125222d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f125223e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f125224f;

    public final void a(ZoomSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f125220b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125224f)) {
            return;
        }
        this.f125224f = value;
        b bVar = this.f125220b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125221c)) {
            return;
        }
        this.f125221c = value;
        b bVar = this.f125220b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125222d)) {
            return;
        }
        this.f125222d = value;
        b bVar = this.f125220b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, true);
        }
    }

    public ZoomControlIconsHandler() {
        a defaults = new a();
        Intrinsics.j(defaults, "defaults");
        this.f125219a = defaults;
        this.f125221c = BitmapExtensionsKt.bitmapFromResource(defaults.f125225a);
        this.f125222d = BitmapExtensionsKt.bitmapFromResource(defaults.f125226b);
        this.f125223e = BitmapExtensionsKt.bitmapFromResource(defaults.f125227c);
        this.f125224f = BitmapExtensionsKt.bitmapFromResource(defaults.f125228d);
    }

    public final Bitmap a(ZoomSwitchControl.ZoomState state, boolean z10) {
        Intrinsics.j(state, "state");
        boolean z11 = state instanceof ZoomSwitchControl.ZoomState.ZoomedOut;
        if (z11 && !z10) {
            return this.f125221c;
        }
        if (z11 && z10) {
            return this.f125222d;
        }
        boolean z12 = state instanceof ZoomSwitchControl.ZoomState.ZoomedIn;
        if (z12 && !z10) {
            return this.f125223e;
        }
        if (z12 && z10) {
            return this.f125224f;
        }
        return null;
    }

    public final Bitmap e() {
        return this.f125223e;
    }

    public final Bitmap f() {
        return this.f125224f;
    }

    public final Bitmap g() {
        return this.f125221c;
    }

    public final Bitmap h() {
        return this.f125222d;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125219a.f125228d);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125219a.f125225a);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125219a.f125226b);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125223e)) {
            return;
        }
        this.f125223e = value;
        b bVar = this.f125220b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125219a.f125227c);
    }
}
