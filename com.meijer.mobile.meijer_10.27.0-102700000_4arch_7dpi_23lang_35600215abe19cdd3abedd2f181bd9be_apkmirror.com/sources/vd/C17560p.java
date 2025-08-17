package vd;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import android.content.Context;
import android.os.RemoteException;
import bd.C6224c;
import bd.C6225d;
import bd.C6229h;
import bd.InterfaceC6223b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import gd.C14248g;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;

/* renamed from: vd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17560p extends com.google.android.gms.common.api.d<a.d.c> implements InterfaceC6223b {

    /* renamed from: c, reason: collision with root package name */
    private static final a.g<C17548d> f164657c;

    /* renamed from: d, reason: collision with root package name */
    private static final a.AbstractC1257a<C17548d, a.d.c> f164658d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a<a.d.c> f164659e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f164660a;

    /* renamed from: b, reason: collision with root package name */
    private final C14248g f164661b;

    static {
        a.g<C17548d> gVar = new a.g<>();
        f164657c = gVar;
        C17558n c17558n = new C17558n();
        f164658d = c17558n;
        f164659e = new com.google.android.gms.common.api.a<>("AppSet.API", c17558n, gVar);
    }

    C17560p(Context context, C14248g c14248g) {
        super(context, f164659e, a.d.f64750a, d.a.f64751c);
        this.f164660a = context;
        this.f164661b = c14248g;
    }

    @Override // bd.InterfaceC6223b
    public final AbstractC5232j<C6224c> g() {
        return this.f164661b.h(this.f164660a, 212800000) == 0 ? doRead(AbstractC14417s.a().d(C6229h.f60113a).b(new InterfaceC14415p() { // from class: vd.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // hd.InterfaceC14415p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((C17551g) ((C17548d) obj).getService()).b2(new C6225d(null, null), new BinderC17559o(this.f164655a, (C5233k) obj2));
            }
        }).c(false).e(27601).a()) : C5235m.e(new ApiException(new Status(17)));
    }
}
