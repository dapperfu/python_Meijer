package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13423q extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final C13423q f125464c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125465d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125466e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125466e.f125181d, -1.0f));
    }

    static {
        C13423q c13423q = new C13423q();
        f125464c = c13423q;
        f125465d = "sm-g350.*";
        f125466e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13423q.f125176a, false, 0.0f, false, false, 0, 123);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125465d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125466e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Range a(android.util.Range[] r10, float r11) {
        /*
            r9 = this;
            java.lang.String r0 = "frameRateRanges"
            kotlin.jvm.internal.Intrinsics.j(r10, r0)
            int r0 = r10.length
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r10.length
            r2 = 0
            r3 = r1
        Ld:
            if (r2 >= r0) goto L8f
            r4 = r10[r2]
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L23
            int r5 = r5.intValue()
            float r5 = (float) r5
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L24
        L23:
            r5 = r1
        L24:
            float r5 = r5.floatValue()
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L2d
            goto L8b
        L2d:
            java.lang.Comparable r5 = r4.getLower()
            java.lang.String r6 = "getLower(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r7 = 16000(0x3e80, float:2.2421E-41)
            if (r5 >= r7) goto L8b
            if (r3 == 0) goto L8a
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.String r7 = "getUpper(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Comparable r8 = r3.getUpper()
            kotlin.jvm.internal.Intrinsics.i(r8, r7)
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            if (r5 > r7) goto L8a
            java.lang.Comparable r5 = r4.getUpper()
            java.lang.Comparable r7 = r3.getUpper()
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r7)
            if (r5 == 0) goto L8b
            java.lang.Comparable r5 = r4.getLower()
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Comparable r7 = r3.getLower()
            kotlin.jvm.internal.Intrinsics.i(r7, r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            if (r5 <= r6) goto L8b
        L8a:
            r3 = r4
        L8b:
            int r2 = r2 + 1
            goto Ld
        L8f:
            if (r3 == 0) goto L92
            return r3
        L92:
            android.util.Range r10 = com.scandit.datacapture.core.internal.module.source.N.b(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.C13423q.a(android.util.Range[], float):android.util.Range");
    }
}
