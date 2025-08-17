package F;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.AbstractC5650a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3625w {

    /* renamed from: F.w$a */
    public interface a {
        InterfaceC3625w a(Context context, Object obj, Set<String> set) throws InitializationException;
    }

    Pair<Map<androidx.camera.core.impl.D<?>, androidx.camera.core.impl.x>, Map<AbstractC5650a, androidx.camera.core.impl.x>> a(int i10, String str, List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, List<Size>> map, boolean z10, boolean z11);

    v0 b(int i10, String str, int i11, Size size);
}
