package wa;

import ha.InterfaceC14492c;
import java.util.Map;

/* loaded from: classes4.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14492c f167027a;

    /* renamed from: b, reason: collision with root package name */
    private final String f167028b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f167029c;

    @Override // java.lang.Runnable
    public void run() {
        this.f167027a.c(this.f167028b, this.f167029c, null);
    }

    public d(InterfaceC14492c interfaceC14492c, String str, Map<String, String> map) {
        I9.b.c(interfaceC14492c, "EventServiceInternal must not be null!");
        I9.b.c(str, "EventName must not be null!");
        this.f167027a = interfaceC14492c;
        this.f167028b = str;
        this.f167029c = map;
    }
}
