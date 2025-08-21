package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13422p extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13422p f125461d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125462e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125463f;

    static {
        C13422p c13422p = new C13422p();
        f125461d = c13422p;
        f125462e = "sm-g355.*";
        f125463f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13422p.f125176a, true, 0.0f, false, false, 0, BinsView.TOTE_HEIGHT_DP);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125463f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125462e;
    }
}
