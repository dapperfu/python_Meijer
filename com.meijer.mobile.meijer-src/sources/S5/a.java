package S5;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f34441a;

    /* renamed from: b, reason: collision with root package name */
    private final b f34442b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f34443c;

    public InputStream a() {
        return this.f34441a;
    }

    public b b() {
        return this.f34442b;
    }

    public Map<String, String> c() {
        return this.f34443c;
    }

    public a(InputStream inputStream, b bVar, Map<String, String> map) {
        HashMap map2;
        this.f34441a = inputStream;
        this.f34442b = bVar;
        if (map == null) {
            map2 = new HashMap();
        } else {
            map2 = new HashMap(map);
        }
        this.f34443c = map2;
    }
}
