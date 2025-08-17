package ia;

import fa.InterfaceC13862c;
import java.util.Map;

/* loaded from: classes4.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final e f137627a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13862c f137628b;

    @Override // ia.d
    public W9.a b() {
        return this.f137627a.b();
    }

    @Override // fa.InterfaceC13862c
    public String c(String str, Map<String, String> map, V8.a aVar) {
        G9.b.c(str, "EventName must not be null!");
        return this.f137628b.c(str, map, aVar);
    }

    @Override // fa.InterfaceC13862c
    public String e(String str, Map<String, String> map, V8.a aVar) {
        G9.b.c(str, "EventName must not be null!");
        return this.f137628b.e(str, map, aVar);
    }

    public c(e eVar, InterfaceC13862c interfaceC13862c) {
        this.f137627a = eVar;
        this.f137628b = interfaceC13862c;
    }

    @Override // fa.InterfaceC13862c
    public void a(String str, Map<String, String> map, V8.a aVar) {
        e(str, map, aVar);
    }

    @Override // fa.InterfaceC13862c
    public void d(String str, Map<String, String> map, V8.a aVar) {
        c(str, map, aVar);
    }
}
