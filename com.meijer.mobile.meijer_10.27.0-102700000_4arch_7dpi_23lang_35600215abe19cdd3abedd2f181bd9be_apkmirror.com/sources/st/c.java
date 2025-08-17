package st;

import android.content.Context;

/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final jb.b<C17043a> f161239a;

    @Override // st.b
    public final Long a(String str) {
        C17043a c17043aA = this.f161239a.a(str);
        if (c17043aA != null) {
            return c17043aA.a();
        }
        return null;
    }

    @Override // st.b
    public final void c(String str, Long l10) {
        C17043a c17043a = new C17043a();
        c17043a.b(l10);
        this.f161239a.c(str, c17043a);
    }

    public c(Context context) {
        this.f161239a = new jb.b<>(context, "com.qsl.faar.cache.KeyValue", C17043a.class);
    }
}
