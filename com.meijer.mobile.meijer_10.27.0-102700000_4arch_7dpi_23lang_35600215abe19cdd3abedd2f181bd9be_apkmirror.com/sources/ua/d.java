package ua;

import fa.InterfaceC13862c;
import java.util.Map;

/* loaded from: classes4.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13862c f162818a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162819b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f162820c;

    @Override // java.lang.Runnable
    public void run() {
        this.f162818a.a(this.f162819b, this.f162820c, null);
    }

    public d(InterfaceC13862c interfaceC13862c, String str, Map<String, String> map) {
        G9.b.c(interfaceC13862c, "EventServiceInternal must not be null!");
        G9.b.c(str, "EventName must not be null!");
        this.f162818a = interfaceC13862c;
        this.f162819b = str;
        this.f162820c = map;
    }
}
