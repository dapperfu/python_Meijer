package R5;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f31903a;

    /* renamed from: b, reason: collision with root package name */
    private final b f31904b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f31905c;

    public InputStream a() {
        return this.f31903a;
    }

    public b b() {
        return this.f31904b;
    }

    public Map<String, String> c() {
        return this.f31905c;
    }

    public a(InputStream inputStream, b bVar, Map<String, String> map) {
        HashMap map2;
        this.f31903a = inputStream;
        this.f31904b = bVar;
        if (map == null) {
            map2 = new HashMap();
        } else {
            map2 = new HashMap(map);
        }
        this.f31905c = map2;
    }
}
