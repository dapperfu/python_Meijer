package pd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5515i;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import jd.AbstractC14995s;
import jd.C14987j;
import jd.C14988k;
import jd.C14992o;
import jd.InterfaceC14993p;
import od.C16106b;
import od.C16110f;
import od.C16111g;
import od.InterfaceC16105a;
import od.InterfaceC16108d;

/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.api.d implements InterfaceC16108d {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f156341a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1266a f156342b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f156343c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f156344d = 0;

    @Override // od.InterfaceC16108d
    public final AbstractC5516j<C16106b> n(com.google.android.gms.common.api.f... fVarArr) {
        final C16418a c16418aP = p(false, fVarArr);
        if (c16418aP.T().isEmpty()) {
            return C5519m.f(new C16106b(true, 0));
        }
        AbstractC14995s.a aVarA = AbstractC14995s.a();
        aVarA.d(yd.k.f171361a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC14993p() { // from class: pd.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // jd.InterfaceC14993p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).I2(new r(this.f156330a, (C5517k) obj2), c16418aP);
            }
        });
        return doRead(aVarA.a());
    }

    static {
        a.g gVar = new a.g();
        f156341a = gVar;
        q qVar = new q();
        f156342b = qVar;
        f156343c = new com.google.android.gms.common.api.a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f156343c, a.d.f65590a, d.a.f65591c);
    }

    static final C16418a p(boolean z10, com.google.android.gms.common.api.f... fVarArr) {
        com.google.android.gms.common.internal.r.m(fVarArr, "Requested APIs must not be null.");
        com.google.android.gms.common.internal.r.b(fVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.google.android.gms.common.api.f fVar : fVarArr) {
            com.google.android.gms.common.internal.r.m(fVar, "Requested API must not be null.");
        }
        return C16418a.b0(Arrays.asList(fVarArr), z10);
    }

    @Override // od.InterfaceC16108d
    public final AbstractC5516j<C16111g> j(C16110f c16110f) {
        C14987j c14987jB;
        final C16418a c16418aB = C16418a.B(c16110f);
        final InterfaceC16105a interfaceC16105aB = c16110f.b();
        Executor executorC = c16110f.c();
        if (c16418aB.T().isEmpty()) {
            return C5519m.f(new C16111g(0));
        }
        if (interfaceC16105aB == null) {
            AbstractC14995s.a aVarA = AbstractC14995s.a();
            aVarA.d(yd.k.f171361a);
            aVarA.c(true);
            aVarA.e(27304);
            aVarA.b(new InterfaceC14993p() { // from class: pd.p
                /* JADX WARN: Multi-variable type inference failed */
                @Override // jd.InterfaceC14993p
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((i) ((w) obj).getService()).Z3(new s(this.f156332a, (C5517k) obj2), c16418aB, null);
                }
            });
            return doRead(aVarA.a());
        }
        com.google.android.gms.common.internal.r.l(interfaceC16105aB);
        if (executorC == null) {
            c14987jB = registerListener(interfaceC16105aB, InterfaceC16105a.class.getSimpleName());
        } else {
            c14987jB = C14988k.b(interfaceC16105aB, executorC, InterfaceC16105a.class.getSimpleName());
        }
        final d dVar = new d(c14987jB);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC14993p interfaceC14993p = new InterfaceC14993p() { // from class: pd.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // jd.InterfaceC14993p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).Z3(new t(this.f156322a, atomicReference, (C5517k) obj2, interfaceC16105aB), c16418aB, dVar);
            }
        };
        InterfaceC14993p interfaceC14993p2 = new InterfaceC14993p() { // from class: pd.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // jd.InterfaceC14993p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((i) ((w) obj).getService()).m6(new u(this.f156327a, (C5517k) obj2), dVar);
            }
        };
        C14992o.a aVarA2 = C14992o.a();
        aVarA2.g(c14987jB);
        aVarA2.d(yd.k.f171361a);
        aVarA2.c(true);
        aVarA2.b(interfaceC14993p);
        aVarA2.f(interfaceC14993p2);
        aVarA2.e(27305);
        return doRegisterEventListener(aVarA2.a()).s(new InterfaceC5515i() { // from class: pd.n
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                int i10 = v.f156344d;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? C5519m.f((C16111g) atomicReference2.get()) : C5519m.e(new ApiException(Status.f65577h));
            }
        });
    }
}
