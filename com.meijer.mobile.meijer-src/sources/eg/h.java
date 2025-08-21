package eg;

import android.content.Context;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;

/* loaded from: classes8.dex */
public class h {

    public interface a<T> {
        String a(T t10);
    }

    public static C13676c<?> c(final String str, final a<Context> aVar) {
        return C13676c.m(f.class).b(q.l(Context.class)).f(new df.g() { // from class: eg.g
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return f.a(str, aVar.a((Context) interfaceC13677d.a(Context.class)));
            }
        }).d();
    }

    public static C13676c<?> b(String str, String str2) {
        return C13676c.l(f.a(str, str2), f.class);
    }
}
