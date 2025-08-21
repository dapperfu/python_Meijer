package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18407x {

    /* renamed from: b, reason: collision with root package name */
    private static final Size f172197b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator<Size> f172198c = new G.d();

    /* renamed from: a, reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f172199a = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f172199a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.c()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f172198c.compare(size, f172197b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
