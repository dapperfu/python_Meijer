package mh;

import com.launchdarkly.sdk.android.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mh.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15629j {

    /* renamed from: a, reason: collision with root package name */
    private final int f150101a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f150102b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f150103c;

    public e0 c() {
        return null;
    }

    public int a() {
        return this.f150101a;
    }

    public Iterable<Map.Entry<String, String>> b() {
        return this.f150102b.entrySet();
    }

    public boolean d() {
        return this.f150103c;
    }

    public C15629j(int i10, Map<String, String> map, e0 e0Var, boolean z10) {
        Map<String, String> map2;
        this.f150101a = i10;
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap<>(map);
        }
        this.f150102b = map2;
        this.f150103c = z10;
    }
}
