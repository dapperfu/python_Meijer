package com.scandit.datacapture.core.internal.module.source;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class P extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeCameraApi f125765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraProfile f125766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Range[] f125767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NativePreferredFrameRateRange f125768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(NativeCameraApi nativeCameraApi, CameraProfile cameraProfile, Range[] rangeArr, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        super(1);
        this.f125765a = nativeCameraApi;
        this.f125766b = cameraProfile;
        this.f125767c = rangeArr;
        this.f125768d = nativePreferredFrameRateRange;
    }

    public final Range a(float f10) {
        int i10;
        Range rangeA;
        NativeCameraApi nativeCameraApi = this.f125765a;
        Intrinsics.j(nativeCameraApi, "<this>");
        int[] iArr = O.f125763a;
        int i11 = iArr[nativeCameraApi.ordinal()];
        if (i11 == 1) {
            i10 = 1000;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        float f11 = f10 * i10;
        CameraProfile cameraProfile = this.f125766b;
        NativeCameraApi nativeCameraApi2 = this.f125765a;
        Range[] rangeArr = this.f125767c;
        int i12 = iArr[nativeCameraApi2.ordinal()];
        if (i12 == 1) {
            rangeA = cameraProfile.a(rangeArr, f11);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rangeA = cameraProfile.b(rangeArr, f11);
        }
        if (rangeA != null) {
            return rangeA;
        }
        NativePreferredFrameRateRange nativePreferredFrameRateRange = this.f125768d;
        Range[] rangeArr2 = this.f125767c;
        int i13 = nativePreferredFrameRateRange == null ? -1 : O.f125764b[nativePreferredFrameRateRange.ordinal()];
        return i13 != 1 ? i13 != 2 ? N.b(rangeArr2, f11) : N.b(rangeArr2, f11) : N.c(rangeArr2, f11);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
