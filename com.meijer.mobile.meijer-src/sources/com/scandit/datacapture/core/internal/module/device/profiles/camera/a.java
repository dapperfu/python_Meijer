package com.scandit.datacapture.core.internal.module.device.profiles.camera;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f125171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125173c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.e(this.f125171a, aVar.f125171a) && Intrinsics.e(this.f125172b, aVar.f125172b) && Intrinsics.e(this.f125173c, aVar.f125173c);
    }

    public final int hashCode() {
        return this.f125173c.hashCode() + ((this.f125172b.hashCode() + (this.f125171a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CameraParametersKeys(focusModeContinuousPicture=" + this.f125171a + ", focusModeContinuousVideo=" + this.f125172b + ", focusModeAuto=" + this.f125173c + ')';
    }

    public a(String focusModeContinuousPicture, String focusModeContinuousVideo, String focusModeAuto) {
        Intrinsics.j(focusModeContinuousPicture, "focusModeContinuousPicture");
        Intrinsics.j(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.j(focusModeAuto, "focusModeAuto");
        this.f125171a = focusModeContinuousPicture;
        this.f125172b = focusModeContinuousVideo;
        this.f125173c = focusModeAuto;
    }
}
