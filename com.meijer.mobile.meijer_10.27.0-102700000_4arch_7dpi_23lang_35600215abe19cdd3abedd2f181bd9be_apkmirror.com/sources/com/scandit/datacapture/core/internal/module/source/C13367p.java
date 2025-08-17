package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13367p implements InterfaceC13374x {

    /* renamed from: a, reason: collision with root package name */
    public final CameraProfile f125111a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13371u f125112b;

    public C13367p() {
        CameraProfile cameraProfile = (CameraProfile) com.scandit.datacapture.core.internal.module.device.profiles.camera.d.f124223a.getValue();
        c0 cameraInfoProvider = c0.f125019a;
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraInfoProvider, "cameraInfoProvider");
        this.f125111a = cameraProfile;
        this.f125112b = cameraInfoProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.InterfaceC13374x
    public final NativeCameraDelegate a(CameraPosition position, CameraSettings cameraSettings, H frameCallback, I priorityCameraSwitchStateCallback) {
        Object next;
        Intrinsics.j(position, "position");
        Intrinsics.j(frameCallback, "frameCallback");
        Intrinsics.j(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        CameraPosition cameraPosition = CameraPosition.UNSPECIFIED;
        if (position == cameraPosition) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = AbstractC13366o.f125110a[position.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new AssertionError("Unsupported CameraPosition " + cameraPosition);
            }
            i11 = 0;
        }
        Iterator it = ((c0) this.f125112b).a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b0) ((InterfaceC13370t) next)).f125016c == i11) {
                break;
            }
        }
        InterfaceC13370t interfaceC13370t = (InterfaceC13370t) next;
        if (interfaceC13370t == null) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, 0, "No suitable CameraInfo found with facing " + i11, null, 10, null));
            Unit unit = Unit.f142422a;
        }
        if (interfaceC13370t == null) {
            return null;
        }
        return new C13365n(interfaceC13370t, this.f125111a, frameCallback);
    }
}
