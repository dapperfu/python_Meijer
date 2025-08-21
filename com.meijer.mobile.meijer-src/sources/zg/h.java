package zg;

import Fd.N9;
import Fd.Z9;
import android.content.Context;
import id.C14724g;
import ug.AbstractC17407e;
import ug.C17411i;
import wg.C17872b;

/* loaded from: classes8.dex */
public final class h extends AbstractC17407e {

    /* renamed from: b, reason: collision with root package name */
    private final C17411i f172765b;

    @Override // ug.AbstractC17407e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        C17872b c17872b = (C17872b) obj;
        Context contextB = this.f172765b.b();
        N9 n9B = Z9.b(C18483b.d());
        return new k(this.f172765b, c17872b, (n.b(contextB) || C14724g.f().a(contextB) >= 204500000) ? new n(contextB, c17872b, n9B) : new p(contextB, c17872b, n9B), n9B);
    }

    public h(C17411i c17411i) {
        this.f172765b = c17411i;
    }
}
