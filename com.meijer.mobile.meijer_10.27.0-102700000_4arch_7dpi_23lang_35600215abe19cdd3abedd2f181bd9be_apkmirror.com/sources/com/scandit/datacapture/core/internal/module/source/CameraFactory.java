package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class CameraFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final F f124772d = new F();

    /* renamed from: a, reason: collision with root package name */
    private final CameraProfile f124773a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f124774b;

    /* renamed from: c, reason: collision with root package name */
    private final D f124775c;

    public CameraFactory(CameraProfile cameraProfile) {
        C13375y cameraDelegateFactory = new C13375y();
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraDelegateFactory, "cameraDelegateFactory");
        this.f124773a = cameraProfile;
        this.f124774b = cameraDelegateFactory;
        this.f124775c = new D();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:40:0x00c8, B:9:0x0019, B:10:0x001e, B:13:0x0022, B:15:0x003a, B:29:0x0078, B:37:0x00ae, B:31:0x007e, B:35:0x0088, B:36:0x00a7, B:18:0x0041, B:20:0x0047, B:22:0x004f, B:23:0x0052, B:25:0x006a, B:27:0x0070), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:40:0x00c8, B:9:0x0019, B:10:0x001e, B:13:0x0022, B:15:0x003a, B:29:0x0078, B:37:0x00ae, B:31:0x007e, B:35:0x0088, B:36:0x00a7, B:18:0x0041, B:20:0x0047, B:22:0x004f, B:23:0x0052, B:25:0x006a, B:27:0x0070), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.scandit.datacapture.core.source.Camera a(com.scandit.datacapture.core.source.CameraPosition r6, com.scandit.datacapture.core.source.CameraSettings r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "position"
            kotlin.jvm.internal.Intrinsics.j(r6, r0)     // Catch: java.lang.Throwable -> L1f
            int[] r0 = com.scandit.datacapture.core.internal.module.source.G.f124779a     // Catch: java.lang.Throwable -> L1f
            int r1 = r6.ordinal()     // Catch: java.lang.Throwable -> L1f
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == r1) goto L22
            if (r0 == r2) goto L22
            r6 = 3
            if (r0 != r6) goto L19
            goto L84
        L19:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L1f
            r6.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r6     // Catch: java.lang.Throwable -> L1f
        L1f:
            r6 = move-exception
            goto Ld3
        L22:
            com.scandit.datacapture.core.internal.module.source.D r0 = r5.f124775c     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "position"
            kotlin.jvm.internal.Intrinsics.j(r6, r1)     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r0 = r0.f124776a     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.internal.module.source.B r1 = com.scandit.datacapture.core.internal.module.source.D.a(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera r0 = (com.scandit.datacapture.core.source.Camera) r0     // Catch: java.lang.Throwable -> L1f
            if (r7 == 0) goto L52
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = com.scandit.datacapture.core.source.CameraApiUtilsKt.getCameraApi(r7)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L41
            goto L76
        L41:
            boolean r1 = r7.isUsingApi2Features$scandit_capture_core()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L52
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r5.f124773a     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L52
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = com.scandit.datacapture.core.internal.module.source.NativeCameraApi.CAMERA2     // Catch: java.lang.Throwable -> L1f
            goto L76
        L52:
            com.scandit.datacapture.core.internal.module.source.D r1 = r5.f124775c     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "position"
            kotlin.jvm.internal.Intrinsics.j(r6, r4)     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r1 = r1.f124776a     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.internal.module.source.B r4 = com.scandit.datacapture.core.internal.module.source.D.a(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera r1 = (com.scandit.datacapture.core.source.Camera) r1     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L70
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = r1.getApi$scandit_capture_core()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L76
        L70:
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r5.f124773a     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = r1.k()     // Catch: java.lang.Throwable -> L1f
        L76:
            if (r0 == 0) goto L7e
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r4 = r0.getApi$scandit_capture_core()     // Catch: java.lang.Throwable -> L1f
            if (r4 == r1) goto Lae
        L7e:
            com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate r1 = r5.a(r6, r1, r7)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L86
        L84:
            r6 = r3
            goto Lc4
        L86:
            if (r0 != 0) goto La7
            com.scandit.datacapture.core.internal.module.source.D r0 = r5.f124775c     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera$Companion r4 = com.scandit.datacapture.core.source.Camera.INSTANCE     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera r1 = r4.create$scandit_capture_core(r1)     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "position"
            kotlin.jvm.internal.Intrinsics.j(r6, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "camera"
            kotlin.jvm.internal.Intrinsics.j(r1, r4)     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r0 = r0.f124776a     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.internal.module.source.B r4 = com.scandit.datacapture.core.internal.module.source.D.a(r6)     // Catch: java.lang.Throwable -> L1f
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L1f
            goto Lae
        La7:
            com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera r0 = r0.getF125871a()     // Catch: java.lang.Throwable -> L1f
            r0.setDelegateAsync(r1)     // Catch: java.lang.Throwable -> L1f
        Lae:
            com.scandit.datacapture.core.internal.module.source.D r0 = r5.f124775c     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "position"
            kotlin.jvm.internal.Intrinsics.j(r6, r1)     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r0 = r0.f124776a     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.internal.module.source.B r6 = com.scandit.datacapture.core.internal.module.source.D.a(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera r6 = (com.scandit.datacapture.core.source.Camera) r6     // Catch: java.lang.Throwable -> L1f
        Lc4:
            if (r6 == 0) goto Ld1
            if (r7 == 0) goto Ld0
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r0 = r5.f124773a     // Catch: java.lang.Throwable -> L1f
            r7.addDefaultPropertiesFromProfile$scandit_capture_core(r0)     // Catch: java.lang.Throwable -> L1f
            com.scandit.datacapture.core.source.Camera.applySettings$default(r6, r7, r3, r2, r3)     // Catch: java.lang.Throwable -> L1f
        Ld0:
            r3 = r6
        Ld1:
            monitor-exit(r5)
            return r3
        Ld3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.CameraFactory.a(com.scandit.datacapture.core.source.CameraPosition, com.scandit.datacapture.core.source.CameraSettings):com.scandit.datacapture.core.source.Camera");
    }

    public final NativeCameraDelegate a(CameraPosition position, NativeCameraApi api, CameraSettings cameraSettings) {
        Intrinsics.j(position, "position");
        Intrinsics.j(api, "api");
        H h10 = new H(this, position);
        I i10 = new I(this, position);
        InterfaceC13374x interfaceC13374x = (InterfaceC13374x) this.f124774b.invoke(api);
        if (interfaceC13374x != null) {
            return interfaceC13374x.a(position, cameraSettings, h10, i10);
        }
        return null;
    }
}
