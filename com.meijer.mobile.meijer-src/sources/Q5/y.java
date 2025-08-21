package Q5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class y implements A {

    /* renamed from: a, reason: collision with root package name */
    Map<String, z<?>> f27848a = new HashMap();

    @Override // Q5.A
    public Object a(String str, Object obj) {
        z<?> zVar = this.f27848a.get(str);
        return zVar == null ? obj : zVar.a(obj);
    }

    public void b(String str, z<?> zVar) {
        this.f27848a.put(str, zVar);
    }
}
