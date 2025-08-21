package Bu;

import android.content.SharedPreferences;
import gv.InterfaceC14411a;
import io.constructor.data.local.PreferencesHelper;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class g implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final c f3676a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<SharedPreferences> f3677b;

    public static g a(c cVar, InterfaceC14411a<SharedPreferences> interfaceC14411a) {
        return new g(cVar, interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PreferencesHelper get() {
        return c(this.f3676a, this.f3677b.get());
    }

    public g(c cVar, InterfaceC14411a<SharedPreferences> interfaceC14411a) {
        this.f3676a = cVar;
        this.f3677b = interfaceC14411a;
    }

    public static PreferencesHelper c(c cVar, SharedPreferences sharedPreferences) {
        return (PreferencesHelper) C18225c.d(cVar.d(sharedPreferences));
    }
}
