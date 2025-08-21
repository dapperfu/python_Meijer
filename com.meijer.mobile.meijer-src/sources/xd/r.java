package xd;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import dd.C13655c;
import dd.InterfaceC13654b;
import id.C14724g;

/* loaded from: classes6.dex */
public final class r implements InterfaceC13654b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13654b f170699a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13654b f170700b;

    @Override // dd.InterfaceC13654b
    public final AbstractC5516j<C13655c> h() {
        return this.f170699a.h().k(new InterfaceC5509c() { // from class: xd.q
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return r.a(this.f170698a, abstractC5516j);
            }
        });
    }

    public r(Context context) {
        this.f170699a = new C18172p(context, C14724g.f());
        this.f170700b = C18168l.c(context);
    }

    public static /* synthetic */ AbstractC5516j a(r rVar, AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.r() && !abstractC5516j.p()) {
            Exception excM = abstractC5516j.m();
            if (excM instanceof ApiException) {
                int iB = ((ApiException) excM).b();
                if (iB != 43001 && iB != 43002 && iB != 43003 && iB != 17) {
                    if (iB == 43000) {
                        return C5519m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (iB == 15) {
                        return C5519m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                } else {
                    return rVar.f170700b.h();
                }
            }
        }
        return abstractC5516j;
    }
}
