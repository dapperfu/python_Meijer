package z;

import C.P;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18334n {

    /* renamed from: a, reason: collision with root package name */
    private final String f171384a;

    /* renamed from: b, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f171385b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: c, reason: collision with root package name */
    private final C18325e f171386c;

    private void a(List<Size> list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f171385b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrC = extraSupportedOutputSizeQuirk.c(i10);
        if (sizeArrC.length > 0) {
            list.addAll(Arrays.asList(sizeArrC));
        }
    }

    private void c(List<Size> list, int i10) {
        List<Size> listA = this.f171386c.a(i10);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            P.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public C18334n(String str) {
        this.f171384a = str;
        this.f171386c = new C18325e(str);
    }
}
