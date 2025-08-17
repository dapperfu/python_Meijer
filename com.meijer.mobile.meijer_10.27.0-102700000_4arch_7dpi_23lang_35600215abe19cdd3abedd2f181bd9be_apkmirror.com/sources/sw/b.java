package sw;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class b implements tw.a {

    /* renamed from: a, reason: collision with root package name */
    private final p f161323a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal<Map<String, String>> f161324b = new a();

    class a extends InheritableThreadLocal<Map<String, String>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
