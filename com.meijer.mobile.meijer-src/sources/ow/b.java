package ow;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class b implements pw.a {

    /* renamed from: a, reason: collision with root package name */
    private final p f155907a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal<Map<String, String>> f155908b = new a();

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
