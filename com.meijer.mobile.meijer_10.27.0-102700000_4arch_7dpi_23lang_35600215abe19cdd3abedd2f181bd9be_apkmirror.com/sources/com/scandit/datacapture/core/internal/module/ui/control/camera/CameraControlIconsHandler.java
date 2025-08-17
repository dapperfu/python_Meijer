package com.scandit.datacapture.core.internal.module.ui.control.camera;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class CameraControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Camera f125179a;

    /* renamed from: b, reason: collision with root package name */
    private final Camera f125180b;

    /* renamed from: c, reason: collision with root package name */
    private final a f125181c;

    /* renamed from: d, reason: collision with root package name */
    private b f125182d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f125183e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f125184f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f125185g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f125186h;

    public final void a(CameraSwitchControl.AnonymousClass1 anonymousClass1) {
        this.f125182d = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125184f)) {
            return;
        }
        this.f125184f = value;
        b bVar = this.f125182d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f125179a, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125185g)) {
            return;
        }
        this.f125185g = value;
        b bVar = this.f125182d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f125180b, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125186h)) {
            return;
        }
        this.f125186h = value;
        b bVar = this.f125182d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f125180b, value, true);
        }
    }

    public CameraControlIconsHandler(Camera primaryCamera, Camera secondaryCamera) {
        a defaults = new a();
        Intrinsics.j(primaryCamera, "primaryCamera");
        Intrinsics.j(secondaryCamera, "secondaryCamera");
        Intrinsics.j(defaults, "defaults");
        this.f125179a = primaryCamera;
        this.f125180b = secondaryCamera;
        this.f125181c = defaults;
        this.f125183e = BitmapExtensionsKt.bitmapFromResource(defaults.f125187a);
        this.f125184f = BitmapExtensionsKt.bitmapFromResource(defaults.f125188b);
        this.f125185g = BitmapExtensionsKt.bitmapFromResource(defaults.f125189c);
        this.f125186h = BitmapExtensionsKt.bitmapFromResource(defaults.f125190d);
    }

    public final Bitmap a(Camera camera, boolean z10) {
        Intrinsics.j(camera, "camera");
        if (Intrinsics.e(camera, this.f125179a) && !z10) {
            return this.f125183e;
        }
        if (Intrinsics.e(camera, this.f125179a) && z10) {
            return this.f125184f;
        }
        if (Intrinsics.e(camera, this.f125180b) && !z10) {
            return this.f125185g;
        }
        if (Intrinsics.e(camera, this.f125180b) && z10) {
            return this.f125186h;
        }
        return null;
    }

    public final Bitmap e() {
        return this.f125183e;
    }

    public final Bitmap f() {
        return this.f125184f;
    }

    public final Bitmap g() {
        return this.f125185g;
    }

    public final Bitmap h() {
        return this.f125186h;
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125181c.f125188b);
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125181c.f125189c);
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125181c.f125190d);
    }

    public final void a(Bitmap value) {
        Intrinsics.j(value, "value");
        if (Intrinsics.e(value, this.f125183e)) {
            return;
        }
        this.f125183e = value;
        b bVar = this.f125182d;
        if (bVar != null) {
            bVar.onIconsChanged(this.f125179a, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f125181c.f125187a);
    }
}
