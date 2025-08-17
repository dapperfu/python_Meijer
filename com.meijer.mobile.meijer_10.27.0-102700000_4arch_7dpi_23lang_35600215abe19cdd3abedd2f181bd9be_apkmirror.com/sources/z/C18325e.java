package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18325e {

    /* renamed from: a, reason: collision with root package name */
    private final String f171376a;

    public List<Size> a(int i10) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.c(this.f171376a, i10);
    }

    public C18325e(String str) {
        this.f171376a = str;
    }
}
