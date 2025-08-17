package F;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 extends x0 {
    public static b0 g() {
        return new b0(new ArrayMap());
    }

    public static b0 h(x0 x0Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : x0Var.e()) {
            arrayMap.put(str, x0Var.d(str));
        }
        return new b0(arrayMap);
    }

    public void f(x0 x0Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f10063a;
        if (map2 == null || (map = x0Var.f10063a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f10063a.put(str, obj);
    }

    private b0(Map<String, Object> map) {
        super(map);
    }
}
