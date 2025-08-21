package Oc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C9232pp;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4382c extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23395b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f23396c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23397d;

    C4382c(C4441w c4441w, Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23395b = context;
        this.f23396c = str;
        this.f23397d = interfaceC6756Cl;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23395b, "rewarded");
        return new H1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.G2(com.google.android.gms.dynamic.d.I2(this.f23395b), this.f23396c, this.f23397d, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return C9232pp.a(this.f23395b, this.f23396c, this.f23397d);
    }
}
