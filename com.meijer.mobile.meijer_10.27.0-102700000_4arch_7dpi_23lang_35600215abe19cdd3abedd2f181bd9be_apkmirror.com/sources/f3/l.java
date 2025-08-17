package f3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f130699a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f130700b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f130700b == null) {
                this.f130700b = Collections.unmodifiableMap(new HashMap(this.f130699a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f130700b;
    }
}
