package vd;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.content.Context;
import bd.C6224c;
import bd.InterfaceC6223b;
import com.google.android.gms.common.api.ApiException;
import gd.C14248g;

/* loaded from: classes6.dex */
public final class r implements InterfaceC6223b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6223b f164663a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6223b f164664b;

    @Override // bd.InterfaceC6223b
    public final AbstractC5232j<C6224c> g() {
        return this.f164663a.g().k(new InterfaceC5225c() { // from class: vd.q
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return r.a(this.f164662a, abstractC5232j);
            }
        });
    }

    public r(Context context) {
        this.f164663a = new C17560p(context, C14248g.f());
        this.f164664b = C17556l.c(context);
    }

    public static /* synthetic */ AbstractC5232j a(r rVar, AbstractC5232j abstractC5232j) {
        if (!abstractC5232j.r() && !abstractC5232j.p()) {
            Exception excM = abstractC5232j.m();
            if (excM instanceof ApiException) {
                int iB = ((ApiException) excM).b();
                if (iB != 43001 && iB != 43002 && iB != 43003 && iB != 17) {
                    if (iB == 43000) {
                        return C5235m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (iB == 15) {
                        return C5235m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                } else {
                    return rVar.f164664b.g();
                }
            }
        }
        return abstractC5232j;
    }
}
