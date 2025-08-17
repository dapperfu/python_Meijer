package cg;

import android.content.Context;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;

/* loaded from: classes7.dex */
public class h {

    public interface a<T> {
        String a(T t10);
    }

    public static C6245c<?> c(final String str, final a<Context> aVar) {
        return C6245c.m(f.class).b(q.l(Context.class)).f(new bf.g() { // from class: cg.g
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return f.a(str, aVar.a((Context) interfaceC6246d.a(Context.class)));
            }
        }).d();
    }

    public static C6245c<?> b(String str, String str2) {
        return C6245c.l(f.a(str, str2), f.class);
    }
}
