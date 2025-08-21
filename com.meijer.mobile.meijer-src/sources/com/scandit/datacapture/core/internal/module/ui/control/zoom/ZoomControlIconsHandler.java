package com.scandit.datacapture.core.internal.module.ui.control.zoom;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ZoomControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f126171a;

    /* renamed from: b, reason: collision with root package name */
    private b f126172b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f126173c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f126174d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f126175e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f126176f;

    public final void a(ZoomSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f126172b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126176f)) {
            return;
        }
        this.f126176f = value;
        b bVar = this.f126172b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126173c)) {
            return;
        }
        this.f126173c = value;
        b bVar = this.f126172b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126174d)) {
            return;
        }
        this.f126174d = value;
        b bVar = this.f126172b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE, true);
        }
    }

    public ZoomControlIconsHandler() {
        a defaults = new a();
        Intrinsics.j(defaults, "defaults");
        this.f126171a = defaults;
        this.f126173c = BitmapExtensionsKt.bitmapFromResource(defaults.f126177a);
        this.f126174d = BitmapExtensionsKt.bitmapFromResource(defaults.f126178b);
        this.f126175e = BitmapExtensionsKt.bitmapFromResource(defaults.f126179c);
        this.f126176f = BitmapExtensionsKt.bitmapFromResource(defaults.f126180d);
    }

    public final Bitmap a(ZoomSwitchControl.ZoomState state, boolean z10) {
        Intrinsics.j(state, "state");
        boolean z11 = state instanceof ZoomSwitchControl.ZoomState.ZoomedOut;
        if (z11 && !z10) {
            return this.f126173c;
        }
        if (z11 && z10) {
            return this.f126174d;
        }
        boolean z12 = state instanceof ZoomSwitchControl.ZoomState.ZoomedIn;
        if (z12 && !z10) {
            return this.f126175e;
        }
        if (z12 && z10) {
            return this.f126176f;
        }
        return null;
    }

    public final Bitmap e() {
        return this.f126175e;
    }

    public final Bitmap f() {
        return this.f126176f;
    }

    public final Bitmap g() {
        return this.f126173c;
    }

    public final Bitmap h() {
        return this.f126174d;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126171a.f126180d);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126171a.f126177a);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126171a.f126178b);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126175e)) {
            return;
        }
        this.f126175e = value;
        b bVar = this.f126172b;
        if (bVar != null) {
            bVar.onIconsChanged(ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126171a.f126179c);
    }
}
