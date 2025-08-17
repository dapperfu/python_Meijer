package Fu;

import android.content.Context;
import android.content.SharedPreferences;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class e implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f11078a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Context> f11079b;

    public static e a(c cVar, InterfaceC15323a<Context> interfaceC15323a) {
        return new e(cVar, interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f11078a, this.f11079b.get());
    }

    public e(c cVar, InterfaceC15323a<Context> interfaceC15323a) {
        this.f11078a = cVar;
        this.f11079b = interfaceC15323a;
    }

    public static SharedPreferences c(c cVar, Context context) {
        return (SharedPreferences) Bu.c.d(cVar.b(context));
    }
}
