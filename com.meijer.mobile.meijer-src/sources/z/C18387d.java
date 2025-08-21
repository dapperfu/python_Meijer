package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18387d {

    /* renamed from: a, reason: collision with root package name */
    private final SmallDisplaySizeQuirk f172171a = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(SmallDisplaySizeQuirk.class);

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f172171a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.c();
        }
        return null;
    }
}
