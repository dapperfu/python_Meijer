package Fu;

import android.content.Context;

/* loaded from: classes7.dex */
public final class f implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f11080a;

    public static f a(c cVar) {
        return new f(cVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f11080a);
    }

    public f(c cVar) {
        this.f11080a = cVar;
    }

    public static Context c(c cVar) {
        return (Context) Bu.c.d(cVar.getApplication());
    }
}
