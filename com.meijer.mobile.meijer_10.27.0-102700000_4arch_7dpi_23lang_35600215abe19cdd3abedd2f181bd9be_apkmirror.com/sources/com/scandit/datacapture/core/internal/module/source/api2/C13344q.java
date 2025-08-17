package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.InterfaceC13374x;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2InfoProvider;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13344q implements InterfaceC13374x {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f124973a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraProfile f124974b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraApi2InfoProvider f124975c;

    public C13344q(CameraManager cameraManager) {
        CameraProfile cameraProfile = (CameraProfile) com.scandit.datacapture.core.internal.module.device.profiles.camera.d.f124223a.getValue();
        CameraApi2InfoProvider cameraInfoProvider = CameraApi2.INSTANCE.infoProvider(cameraManager);
        Intrinsics.j(cameraManager, "cameraManager");
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraInfoProvider, "cameraInfoProvider");
        this.f124973a = cameraManager;
        this.f124974b = cameraProfile;
        this.f124975c = cameraInfoProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.InterfaceC13374x
    public final NativeCameraDelegate a(CameraPosition position, CameraSettings cameraSettings, com.scandit.datacapture.core.internal.module.source.H frameCallback, com.scandit.datacapture.core.internal.module.source.I priorityCameraSwitchStateCallback) {
        CameraApi2Info next;
        CameraApi2Info cameraApi2Info;
        CameraApi2Info next2;
        Intrinsics.j(position, "position");
        Intrinsics.j(frameCallback, "frameCallback");
        Intrinsics.j(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        CameraPosition cameraPosition = CameraPosition.UNSPECIFIED;
        if (position == cameraPosition) {
            throw new IllegalStateException("Check failed.");
        }
        Object property = cameraSettings != null ? cameraSettings.getProperty("cameraId") : null;
        String str = property instanceof String ? (String) property : null;
        if (str != null) {
            Iterable<CameraApi2Info> iterableCameraInfos = this.f124975c.cameraInfos();
            Iterator<CameraApi2Info> it = iterableCameraInfos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.e(next2.getId(), str)) {
                    break;
                }
            }
            cameraApi2Info = next2;
            if (cameraApi2Info == null) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, "No suitable CameraInfo found for id ".concat(str), CollectionsKt.B0(iterableCameraInfos, ";", null, null, 0, null, null, 62, null), 2, null));
                Unit unit = Unit.f142422a;
            }
        } else {
            Intrinsics.j(position, "<this>");
            int i10 = r.f124977a[position.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new AssertionError("Unsupported CameraPosition " + cameraPosition);
            }
            Iterable<CameraApi2Info> iterableCameraInfos2 = this.f124975c.cameraInfos();
            Iterator<CameraApi2Info> it2 = iterableCameraInfos2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.getFacing() == i11) {
                    break;
                }
            }
            cameraApi2Info = next;
            if (cameraApi2Info == null) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, "No suitable CameraInfo found with facing " + i11, CollectionsKt.B0(iterableCameraInfos2, ";", null, null, 0, null, null, 62, null), 2, null));
                Unit unit2 = Unit.f142422a;
            }
        }
        if (cameraApi2Info == null) {
            return null;
        }
        U u10 = new U(this.f124973a);
        D d10 = new D();
        O o10 = new O(this.f124974b, cameraApi2Info, cameraSettings);
        return new C13343p(o10, frameCallback, priorityCameraSwitchStateCallback, u10, new z0(), d10, new o0(), new h0(o10), C13327b.f124884a);
    }
}
