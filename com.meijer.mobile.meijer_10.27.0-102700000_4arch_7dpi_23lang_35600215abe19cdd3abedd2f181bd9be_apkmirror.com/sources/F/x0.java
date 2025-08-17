package F;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    private static final x0 f10062b = new x0(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    protected final Map<String, Object> f10063a;

    public static x0 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new x0(arrayMap);
    }

    public static x0 b() {
        return f10062b;
    }

    public static x0 c(x0 x0Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : x0Var.e()) {
            arrayMap.put(str, x0Var.d(str));
        }
        return new x0(arrayMap);
    }

    public Object d(String str) {
        return this.f10063a.get(str);
    }

    public Set<String> e() {
        return this.f10063a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }

    protected x0(Map<String, Object> map) {
        this.f10063a = map;
    }
}
