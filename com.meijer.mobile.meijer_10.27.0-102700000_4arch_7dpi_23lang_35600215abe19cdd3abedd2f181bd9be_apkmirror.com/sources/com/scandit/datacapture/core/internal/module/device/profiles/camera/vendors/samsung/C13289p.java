package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13289p extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13289p f124509d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124510e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124511f;

    static {
        C13289p c13289p = new C13289p();
        f124509d = c13289p;
        f124510e = "sm-g355.*";
        f124511f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13289p.f124224a, true, 0.0f, false, false, 0, BinsView.TOTE_HEIGHT_DP);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124511f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124510e;
    }
}
