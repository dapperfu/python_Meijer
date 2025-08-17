package Fu;

import android.content.SharedPreferences;
import io.constructor.data.local.PreferencesHelper;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class g implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f11081a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<SharedPreferences> f11082b;

    public static g a(c cVar, InterfaceC15323a<SharedPreferences> interfaceC15323a) {
        return new g(cVar, interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PreferencesHelper get() {
        return c(this.f11081a, this.f11082b.get());
    }

    public g(c cVar, InterfaceC15323a<SharedPreferences> interfaceC15323a) {
        this.f11081a = cVar;
        this.f11082b = interfaceC15323a;
    }

    public static PreferencesHelper c(c cVar, SharedPreferences sharedPreferences) {
        return (PreferencesHelper) Bu.c.d(cVar.d(sharedPreferences));
    }
}
