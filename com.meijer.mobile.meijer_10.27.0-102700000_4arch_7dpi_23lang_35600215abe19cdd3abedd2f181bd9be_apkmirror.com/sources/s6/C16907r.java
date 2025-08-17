package s6;

import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16907r implements InterfaceC16889N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16907r f160264a = new C16907r();

    private C16907r() {
    }

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        return Integer.valueOf(Math.round(C16908s.g(abstractC17067c) * f10));
    }
}
