package t6;

import h6.C14478i;
import java.io.IOException;
import java.util.List;
import p6.C16406a;
import p6.C16407b;
import p6.C16408c;
import p6.C16409d;
import u6.AbstractC17353c;
import w6.C17845a;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17191d {
    private static <T> List<C17845a<T>> a(AbstractC17353c abstractC17353c, float f10, C14478i c14478i, N<T> n10) throws IOException {
        return u.a(abstractC17353c, c14478i, f10, n10, false);
    }

    public static C16407b e(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return f(abstractC17353c, c14478i, true);
    }

    private static <T> List<C17845a<T>> b(AbstractC17353c abstractC17353c, C14478i c14478i, N<T> n10) throws IOException {
        return u.a(abstractC17353c, c14478i, 1.0f, n10, false);
    }

    static C16406a c(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new C16406a(b(abstractC17353c, c14478i, C17194g.f162299a));
    }

    static p6.j d(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new p6.j(a(abstractC17353c, v6.q.e(), c14478i, C17196i.f162301a));
    }

    public static C16407b f(AbstractC17353c abstractC17353c, C14478i c14478i, boolean z10) throws IOException {
        return new C16407b(a(abstractC17353c, z10 ? v6.q.e() : 1.0f, c14478i, C17199l.f162315a));
    }

    static C16408c g(AbstractC17353c abstractC17353c, C14478i c14478i, int i10) throws IOException {
        return new C16408c(b(abstractC17353c, c14478i, new o(i10)));
    }

    static C16409d h(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new C16409d(b(abstractC17353c, c14478i, r.f162325a));
    }

    static p6.f i(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new p6.f(u.a(abstractC17353c, c14478i, v6.q.e(), C17187B.f162276a, true));
    }

    static p6.g j(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new p6.g(b(abstractC17353c, c14478i, G.f162281a));
    }

    static p6.h k(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        return new p6.h(a(abstractC17353c, v6.q.e(), c14478i, H.f162282a));
    }
}
