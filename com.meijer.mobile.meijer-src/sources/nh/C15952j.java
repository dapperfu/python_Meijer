package nh;

import com.launchdarkly.sdk.android.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nh.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15952j {

    /* renamed from: a, reason: collision with root package name */
    private final int f152459a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f152460b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f152461c;

    public e0 c() {
        return null;
    }

    public int a() {
        return this.f152459a;
    }

    public Iterable<Map.Entry<String, String>> b() {
        return this.f152460b.entrySet();
    }

    public boolean d() {
        return this.f152461c;
    }

    public C15952j(int i10, Map<String, String> map, e0 e0Var, boolean z10) {
        Map<String, String> map2;
        this.f152459a = i10;
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap<>(map);
        }
        this.f152460b = map2;
        this.f152461c = z10;
    }
}
