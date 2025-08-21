package ka;

import ha.InterfaceC14492c;
import java.util.Map;

/* loaded from: classes4.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final e f141716a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14492c f141717b;

    @Override // ka.d
    public Y9.a a() {
        return this.f141716a.a();
    }

    @Override // ha.InterfaceC14492c
    public String b(String str, Map<String, String> map, X8.a aVar) {
        I9.b.c(str, "EventName must not be null!");
        return this.f141717b.b(str, map, aVar);
    }

    @Override // ha.InterfaceC14492c
    public String d(String str, Map<String, String> map, X8.a aVar) {
        I9.b.c(str, "EventName must not be null!");
        return this.f141717b.d(str, map, aVar);
    }

    public c(e eVar, InterfaceC14492c interfaceC14492c) {
        this.f141716a = eVar;
        this.f141717b = interfaceC14492c;
    }

    @Override // ha.InterfaceC14492c
    public void c(String str, Map<String, String> map, X8.a aVar) {
        d(str, map, aVar);
    }

    @Override // ha.InterfaceC14492c
    public void e(String str, Map<String, String> map, X8.a aVar) {
        b(str, map, aVar);
    }
}
