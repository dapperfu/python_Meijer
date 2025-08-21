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
/* loaded from: classes12.dex */
public final class C13500p implements InterfaceC13507x {

    /* renamed from: a, reason: collision with root package name */
    public final CameraProfile f126063a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13504u f126064b;

    public C13500p() {
        CameraProfile cameraProfile = (CameraProfile) com.scandit.datacapture.core.internal.module.device.profiles.camera.d.f125175a.getValue();
        c0 cameraInfoProvider = c0.f125971a;
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraInfoProvider, "cameraInfoProvider");
        this.f126063a = cameraProfile;
        this.f126064b = cameraInfoProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.InterfaceC13507x
    public final NativeCameraDelegate a(CameraPosition position, CameraSettings cameraSettings, H frameCallback, I priorityCameraSwitchStateCallback) {
        Object next;
        Intrinsics.j(position, "position");
        Intrinsics.j(frameCallback, "frameCallback");
        Intrinsics.j(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        CameraPosition cameraPosition = CameraPosition.UNSPECIFIED;
        if (position == cameraPosition) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = AbstractC13499o.f126062a[position.ordinal()];
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
        Iterator it = ((c0) this.f126064b).a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b0) ((InterfaceC13503t) next)).f125968c == i11) {
                break;
            }
        }
        InterfaceC13503t interfaceC13503t = (InterfaceC13503t) next;
        if (interfaceC13503t == null) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, 0, "No suitable CameraInfo found with facing " + i11, null, 10, null));
            Unit unit = Unit.f143329a;
        }
        if (interfaceC13503t == null) {
            return null;
        }
        return new C13498n(interfaceC13503t, this.f126063a, frameCallback);
    }
}
