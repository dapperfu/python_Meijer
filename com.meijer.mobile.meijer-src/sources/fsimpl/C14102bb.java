package fsimpl;

import android.graphics.Shader;
import com.fullstory.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.bb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14102bb {

    /* renamed from: a, reason: collision with root package name */
    private aT f133064a;

    /* renamed from: b, reason: collision with root package name */
    private Set f133065b = new HashSet();

    public C14102bb(aT aTVar) {
        this.f133064a = aTVar;
    }

    public int a(Map map, gh ghVar) {
        int i10 = 0;
        if (map == null) {
            return 0;
        }
        int[] iArr = new int[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            Shader shader = (Shader) entry.getValue();
            int iA = this.f133064a.a(ghVar, shader);
            if (iA == 0 && this.f133065b.add(shader.getClass())) {
                Log.e("Encountered an unhandled shader: " + shader);
            }
            iArr[i10] = C14163di.a(ghVar, ((Integer) entry.getKey()).intValue(), iA);
            i10++;
        }
        return C14159de.c(ghVar, iArr);
    }
}
