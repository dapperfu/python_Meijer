package com.scandit.datacapture.core.internal.module.ui.control.camera;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class CameraControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Camera f126131a;

    /* renamed from: b, reason: collision with root package name */
    private final Camera f126132b;

    /* renamed from: c, reason: collision with root package name */
    private final a f126133c;

    /* renamed from: d, reason: collision with root package name */
    private b f126134d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f126135e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f126136f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f126137g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f126138h;

    public final void a(CameraSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f126134d = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126136f)) {
            return;
        }
        this.f126136f = value;
        b bVar = this.f126134d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f126131a, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126137g)) {
            return;
        }
        this.f126137g = value;
        b bVar = this.f126134d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f126132b, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126138h)) {
            return;
        }
        this.f126138h = value;
        b bVar = this.f126134d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f126132b, value, true);
        }
    }

    public CameraControlIconsHandler(Camera primaryCamera, Camera secondaryCamera) {
        a defaults = new a();
        Intrinsics.j(primaryCamera, "primaryCamera");
        Intrinsics.j(secondaryCamera, "secondaryCamera");
        Intrinsics.j(defaults, "defaults");
        this.f126131a = primaryCamera;
        this.f126132b = secondaryCamera;
        this.f126133c = defaults;
        this.f126135e = BitmapExtensionsKt.bitmapFromResource(defaults.f126139a);
        this.f126136f = BitmapExtensionsKt.bitmapFromResource(defaults.f126140b);
        this.f126137g = BitmapExtensionsKt.bitmapFromResource(defaults.f126141c);
        this.f126138h = BitmapExtensionsKt.bitmapFromResource(defaults.f126142d);
    }

    public final Bitmap a(Camera camera, boolean z10) {
        Intrinsics.j(camera, "camera");
        if (Intrinsics.e(camera, this.f126131a) && !z10) {
            return this.f126135e;
        }
        if (Intrinsics.e(camera, this.f126131a) && z10) {
            return this.f126136f;
        }
        if (Intrinsics.e(camera, this.f126132b) && !z10) {
            return this.f126137g;
        }
        if (Intrinsics.e(camera, this.f126132b) && z10) {
            return this.f126138h;
        }
        return null;
    }

    public final Bitmap e() {
        return this.f126135e;
    }

    public final Bitmap f() {
        return this.f126136f;
    }

    public final Bitmap g() {
        return this.f126137g;
    }

    public final Bitmap h() {
        return this.f126138h;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126133c.f126140b);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126133c.f126141c);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126133c.f126142d);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f126135e)) {
            return;
        }
        this.f126135e = value;
        b bVar = this.f126134d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f126131a, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f126133c.f126139a);
    }
}
