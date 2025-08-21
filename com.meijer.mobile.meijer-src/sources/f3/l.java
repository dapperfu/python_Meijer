package f3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f131533a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f131534b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f131534b == null) {
                this.f131534b = Collections.unmodifiableMap(new HashMap(this.f131533a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f131534b;
    }
}
