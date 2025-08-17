package xg;

import Dd.N9;
import Dd.Z9;
import android.content.Context;
import gd.C14248g;
import sg.AbstractC16960e;
import sg.C16964i;
import ug.C17255b;

/* loaded from: classes7.dex */
public final class h extends AbstractC16960e {

    /* renamed from: b, reason: collision with root package name */
    private final C16964i f169616b;

    @Override // sg.AbstractC16960e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        C17255b c17255b = (C17255b) obj;
        Context contextB = this.f169616b.b();
        N9 n9B = Z9.b(C18046b.d());
        return new k(this.f169616b, c17255b, (n.b(contextB) || C14248g.f().a(contextB) >= 204500000) ? new n(contextB, c17255b, n9B) : new p(contextB, c17255b, n9B), n9B);
    }

    public h(C16964i c16964i) {
        this.f169616b = c16964i;
    }
}
