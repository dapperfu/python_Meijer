package xd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import dd.C13655c;
import dd.C13656d;
import dd.C13660h;
import dd.InterfaceC13654b;
import id.C14724g;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* renamed from: xd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18172p extends com.google.android.gms.common.api.d<a.d.c> implements InterfaceC13654b {

    /* renamed from: c, reason: collision with root package name */
    private static final a.g<C18160d> f170693c;

    /* renamed from: d, reason: collision with root package name */
    private static final a.AbstractC1266a<C18160d, a.d.c> f170694d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a<a.d.c> f170695e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f170696a;

    /* renamed from: b, reason: collision with root package name */
    private final C14724g f170697b;

    static {
        a.g<C18160d> gVar = new a.g<>();
        f170693c = gVar;
        C18170n c18170n = new C18170n();
        f170694d = c18170n;
        f170695e = new com.google.android.gms.common.api.a<>("AppSet.API", c18170n, gVar);
    }

    C18172p(Context context, C14724g c14724g) {
        super(context, f170695e, a.d.f65590a, d.a.f65591c);
        this.f170696a = context;
        this.f170697b = c14724g;
    }

    @Override // dd.InterfaceC13654b
    public final AbstractC5516j<C13655c> h() {
        return this.f170697b.h(this.f170696a, 212800000) == 0 ? doRead(AbstractC14995s.a().d(C13660h.f128348a).b(new InterfaceC14993p() { // from class: xd.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // jd.InterfaceC14993p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((C18163g) ((C18160d) obj).getService()).c2(new C13656d(null, null), new BinderC18171o(this.f170691a, (C5517k) obj2));
            }
        }).c(false).e(27601).a()) : C5519m.e(new ApiException(new Status(17)));
    }
}
