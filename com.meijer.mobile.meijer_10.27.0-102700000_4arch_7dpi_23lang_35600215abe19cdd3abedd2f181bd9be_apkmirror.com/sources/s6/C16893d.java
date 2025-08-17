package s6;

import g6.C14209i;
import java.io.IOException;
import java.util.List;
import o6.C15997a;
import o6.C15998b;
import o6.C15999c;
import o6.C16000d;
import t6.AbstractC17067c;
import v6.C17512a;

/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16893d {
    private static <T> List<C17512a<T>> a(AbstractC17067c abstractC17067c, float f10, C14209i c14209i, InterfaceC16889N<T> interfaceC16889N) throws IOException {
        return u.a(abstractC17067c, c14209i, f10, interfaceC16889N, false);
    }

    public static C15998b e(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return f(abstractC17067c, c14209i, true);
    }

    private static <T> List<C17512a<T>> b(AbstractC17067c abstractC17067c, C14209i c14209i, InterfaceC16889N<T> interfaceC16889N) throws IOException {
        return u.a(abstractC17067c, c14209i, 1.0f, interfaceC16889N, false);
    }

    static C15997a c(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new C15997a(b(abstractC17067c, c14209i, C16896g.f160238a));
    }

    static o6.j d(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new o6.j(a(abstractC17067c, u6.q.e(), c14209i, C16898i.f160240a));
    }

    public static C15998b f(AbstractC17067c abstractC17067c, C14209i c14209i, boolean z10) throws IOException {
        return new C15998b(a(abstractC17067c, z10 ? u6.q.e() : 1.0f, c14209i, C16901l.f160254a));
    }

    static C15999c g(AbstractC17067c abstractC17067c, C14209i c14209i, int i10) throws IOException {
        return new C15999c(b(abstractC17067c, c14209i, new C16904o(i10)));
    }

    static C16000d h(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new C16000d(b(abstractC17067c, c14209i, C16907r.f160264a));
    }

    static o6.f i(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new o6.f(u.a(abstractC17067c, c14209i, u6.q.e(), C16877B.f160215a, true));
    }

    static o6.g j(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new o6.g(b(abstractC17067c, c14209i, C16882G.f160220a));
    }

    static o6.h k(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        return new o6.h(a(abstractC17067c, u6.q.e(), c14209i, C16883H.f160221a));
    }
}
