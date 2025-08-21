package z;

import F.v0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18404u {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f172194a;

    public C18404u() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    C18404u(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f172194a = extraCroppingQuirk;
    }

    public List<Size> a(v0.b bVar, List<Size> list) {
        Size sizeC;
        ExtraCroppingQuirk extraCroppingQuirk = this.f172194a;
        if (extraCroppingQuirk == null || (sizeC = extraCroppingQuirk.c(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeC);
        for (Size size : list) {
            if (!size.equals(sizeC)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
