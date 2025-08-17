package fsimpl;

import android.graphics.Shader;
import com.fullstory.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.bb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13977bb {

    /* renamed from: a, reason: collision with root package name */
    private aT f131814a;

    /* renamed from: b, reason: collision with root package name */
    private Set f131815b = new HashSet();

    public C13977bb(aT aTVar) {
        this.f131814a = aTVar;
    }

    public int a(Map map, gh ghVar) {
        int i10 = 0;
        if (map == null) {
            return 0;
        }
        int[] iArr = new int[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            Shader shader = (Shader) entry.getValue();
            int iA = this.f131814a.a(ghVar, shader);
            if (iA == 0 && this.f131815b.add(shader.getClass())) {
                Log.e("Encountered an unhandled shader: " + shader);
            }
            iArr[i10] = C14038di.a(ghVar, ((Integer) entry.getKey()).intValue(), iA);
            i10++;
        }
        return C14034de.c(ghVar, iArr);
    }
}
