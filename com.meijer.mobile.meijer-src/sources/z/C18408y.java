package z;

import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;

/* renamed from: z.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18408y {
    public int a(String str, w.B b10) {
        Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (Nexus4AndroidLTargetAspectRatioQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(Nexus4AndroidLTargetAspectRatioQuirk.class);
        if (nexus4AndroidLTargetAspectRatioQuirk != null) {
            return nexus4AndroidLTargetAspectRatioQuirk.c();
        }
        AspectRatioLegacyApi21Quirk aspectRatioLegacyApi21Quirk = (AspectRatioLegacyApi21Quirk) androidx.camera.camera2.internal.compat.quirk.a.a(str, b10).b(AspectRatioLegacyApi21Quirk.class);
        if (aspectRatioLegacyApi21Quirk != null) {
            return aspectRatioLegacyApi21Quirk.c();
        }
        return 3;
    }
}
