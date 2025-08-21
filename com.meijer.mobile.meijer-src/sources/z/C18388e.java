package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18388e {

    /* renamed from: a, reason: collision with root package name */
    private final String f172172a;

    public List<Size> a(int i10) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.c(this.f172172a, i10);
    }

    public C18388e(String str) {
        this.f172172a = str;
    }
}
