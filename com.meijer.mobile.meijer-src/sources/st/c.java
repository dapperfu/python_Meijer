package st;

import android.content.Context;

/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final lb.b<C17166a> f162148a;

    @Override // st.b
    public final Long a(String str) {
        C17166a c17166aA = this.f162148a.a(str);
        if (c17166aA != null) {
            return c17166aA.a();
        }
        return null;
    }

    @Override // st.b
    public final void c(String str, Long l10) {
        C17166a c17166a = new C17166a();
        c17166a.b(l10);
        this.f162148a.c(str, c17166a);
    }

    public c(Context context) {
        this.f162148a = new lb.b<>(context, "com.qsl.faar.cache.KeyValue", C17166a.class);
    }
}
