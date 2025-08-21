package Bu;

import android.content.Context;
import android.content.SharedPreferences;
import gv.InterfaceC14411a;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class e implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final c f3673a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Context> f3674b;

    public static e a(c cVar, InterfaceC14411a<Context> interfaceC14411a) {
        return new e(cVar, interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f3673a, this.f3674b.get());
    }

    public e(c cVar, InterfaceC14411a<Context> interfaceC14411a) {
        this.f3673a = cVar;
        this.f3674b = interfaceC14411a;
    }

    public static SharedPreferences c(c cVar, Context context) {
        return (SharedPreferences) C18225c.d(cVar.b(context));
    }
}
