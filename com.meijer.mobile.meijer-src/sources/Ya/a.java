package Ya;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements Xa.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f43035a = new HashMap();

    public final void a(String str, String str2) {
        this.f43035a.put(str, str2);
    }

    @Override // Xa.a
    public final String getValue(String str) {
        return this.f43035a.get(str);
    }
}
