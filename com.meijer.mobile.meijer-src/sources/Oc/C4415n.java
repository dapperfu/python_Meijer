package Oc;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: Oc.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4415n extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23499b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f23500c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f23501d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4441w f23502e;

    C4415n(C4441w c4441w, Context context, d2 d2Var, String str) {
        this.f23499b = context;
        this.f23500c = d2Var;
        this.f23501d = str;
        this.f23502e = c4441w;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23499b, "search");
        return new C1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.B4(com.google.android.gms.dynamic.d.I2(this.f23499b), this.f23500c, this.f23501d, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f23502e.f23539a.a(this.f23499b, this.f23500c, this.f23501d, null, 3);
    }
}
