package Wa;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements Va.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f38636a = new HashMap();

    public final void a(String str, String str2) {
        this.f38636a.put(str, str2);
    }

    @Override // Va.a
    public final String getValue(String str) {
        return this.f38636a.get(str);
    }
}
