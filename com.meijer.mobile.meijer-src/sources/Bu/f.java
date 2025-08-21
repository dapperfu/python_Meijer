package Bu;

import android.content.Context;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class f implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final c f3675a;

    public static f a(c cVar) {
        return new f(cVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f3675a);
    }

    public f(c cVar) {
        this.f3675a = cVar;
    }

    public static Context c(c cVar) {
        return (Context) C18225c.d(cVar.getApplication());
    }
}
