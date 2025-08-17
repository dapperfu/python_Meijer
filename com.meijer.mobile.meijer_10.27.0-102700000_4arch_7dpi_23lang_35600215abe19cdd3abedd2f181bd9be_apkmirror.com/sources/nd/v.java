package nd;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5231i;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import hd.AbstractC14417s;
import hd.C14409j;
import hd.C14410k;
import hd.C14414o;
import hd.InterfaceC14415p;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import md.C15596b;
import md.C15600f;
import md.C15601g;
import md.InterfaceC15595a;
import md.InterfaceC15598d;

/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.api.d implements InterfaceC15598d {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f151210a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1257a f151211b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f151212c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f151213d = 0;

    @Override // md.InterfaceC15598d
    public final AbstractC5232j<C15596b> n(com.google.android.gms.common.api.f... fVarArr) {
        final C15790a c15790aP = p(false, fVarArr);
        if (c15790aP.T().isEmpty()) {
            return C5235m.f(new C15596b(true, 0));
        }
        AbstractC14417s.a aVarA = AbstractC14417s.a();
        aVarA.d(wd.k.f166039a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC14415p() { // from class: nd.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // hd.InterfaceC14415p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).F2(new r(this.f151199a, (C5233k) obj2), c15790aP);
            }
        });
        return doRead(aVarA.a());
    }

    static {
        a.g gVar = new a.g();
        f151210a = gVar;
        q qVar = new q();
        f151211b = qVar;
        f151212c = new com.google.android.gms.common.api.a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f151212c, a.d.f64750a, d.a.f64751c);
    }

    static final C15790a p(boolean z10, com.google.android.gms.common.api.f... fVarArr) {
        com.google.android.gms.common.internal.r.m(fVarArr, "Requested APIs must not be null.");
        com.google.android.gms.common.internal.r.b(fVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.google.android.gms.common.api.f fVar : fVarArr) {
            com.google.android.gms.common.internal.r.m(fVar, "Requested API must not be null.");
        }
        return C15790a.c0(Arrays.asList(fVarArr), z10);
    }

    @Override // md.InterfaceC15598d
    public final AbstractC5232j<C15601g> c(C15600f c15600f) {
        C14409j c14409jB;
        final C15790a c15790aB = C15790a.B(c15600f);
        final InterfaceC15595a interfaceC15595aB = c15600f.b();
        Executor executorC = c15600f.c();
        if (c15790aB.T().isEmpty()) {
            return C5235m.f(new C15601g(0));
        }
        if (interfaceC15595aB == null) {
            AbstractC14417s.a aVarA = AbstractC14417s.a();
            aVarA.d(wd.k.f166039a);
            aVarA.c(true);
            aVarA.e(27304);
            aVarA.b(new InterfaceC14415p() { // from class: nd.p
                /* JADX WARN: Multi-variable type inference failed */
                @Override // hd.InterfaceC14415p
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((i) ((w) obj).getService()).N3(new s(this.f151201a, (C5233k) obj2), c15790aB, null);
                }
            });
            return doRead(aVarA.a());
        }
        com.google.android.gms.common.internal.r.l(interfaceC15595aB);
        if (executorC == null) {
            c14409jB = registerListener(interfaceC15595aB, InterfaceC15595a.class.getSimpleName());
        } else {
            c14409jB = C14410k.b(interfaceC15595aB, executorC, InterfaceC15595a.class.getSimpleName());
        }
        final d dVar = new d(c14409jB);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC14415p interfaceC14415p = new InterfaceC14415p() { // from class: nd.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // hd.InterfaceC14415p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).N3(new t(this.f151191a, atomicReference, (C5233k) obj2, interfaceC15595aB), c15790aB, dVar);
            }
        };
        InterfaceC14415p interfaceC14415p2 = new InterfaceC14415p() { // from class: nd.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // hd.InterfaceC14415p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).W5(new u(this.f151196a, (C5233k) obj2), dVar);
            }
        };
        C14414o.a aVarA2 = C14414o.a();
        aVarA2.g(c14409jB);
        aVarA2.d(wd.k.f166039a);
        aVarA2.c(true);
        aVarA2.b(interfaceC14415p);
        aVarA2.f(interfaceC14415p2);
        aVarA2.e(27305);
        return doRegisterEventListener(aVarA2.a()).s(new InterfaceC5231i() { // from class: nd.n
            @Override // Td.InterfaceC5231i
            public final AbstractC5232j then(Object obj) {
                int i10 = v.f151213d;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? C5235m.f((C15601g) atomicReference2.get()) : C5235m.e(new ApiException(Status.f64737h));
            }
        });
    }
}
