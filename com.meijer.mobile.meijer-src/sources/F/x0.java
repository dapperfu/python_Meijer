package F;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    private static final x0 f8829b = new x0(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    protected final Map<String, Object> f8830a;

    public static x0 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new x0(arrayMap);
    }

    public static x0 b() {
        return f8829b;
    }

    public static x0 c(x0 x0Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : x0Var.e()) {
            arrayMap.put(str, x0Var.d(str));
        }
        return new x0(arrayMap);
    }

    public Object d(String str) {
        return this.f8830a.get(str);
    }

    public Set<String> e() {
        return this.f8830a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }

    protected x0(Map<String, Object> map) {
        this.f8830a = map;
    }
}
