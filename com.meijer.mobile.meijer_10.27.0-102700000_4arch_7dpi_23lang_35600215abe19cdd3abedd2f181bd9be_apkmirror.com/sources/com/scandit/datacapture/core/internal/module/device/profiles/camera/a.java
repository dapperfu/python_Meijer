package com.scandit.datacapture.core.internal.module.device.profiles.camera;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f124219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124220b;

    /* renamed from: c, reason: collision with root package name */
    public final String f124221c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.e(this.f124219a, aVar.f124219a) && Intrinsics.e(this.f124220b, aVar.f124220b) && Intrinsics.e(this.f124221c, aVar.f124221c);
    }

    public final int hashCode() {
        return this.f124221c.hashCode() + ((this.f124220b.hashCode() + (this.f124219a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CameraParametersKeys(focusModeContinuousPicture=" + this.f124219a + ", focusModeContinuousVideo=" + this.f124220b + ", focusModeAuto=" + this.f124221c + ')';
    }

    public a(String focusModeContinuousPicture, String focusModeContinuousVideo, String focusModeAuto) {
        Intrinsics.j(focusModeContinuousPicture, "focusModeContinuousPicture");
        Intrinsics.j(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.j(focusModeAuto, "focusModeAuto");
        this.f124219a = focusModeContinuousPicture;
        this.f124220b = focusModeContinuousVideo;
        this.f124221c = focusModeAuto;
    }
}
