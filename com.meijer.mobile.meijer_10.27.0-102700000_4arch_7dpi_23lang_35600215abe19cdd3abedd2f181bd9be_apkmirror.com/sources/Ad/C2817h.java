package Ad;

import Td.C5233k;
import android.os.RemoteException;
import hd.C14409j;
import hd.InterfaceC14415p;

/* renamed from: Ad.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2817h implements InterfaceC14415p, K {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2815g f255a;

    /* renamed from: b, reason: collision with root package name */
    private C14409j f256b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f257c = true;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2819i f258d;

    @Override // Ad.K
    public final synchronized void a(C14409j c14409j) {
        C14409j c14409j2 = this.f256b;
        if (c14409j2 != c14409j) {
            c14409j2.a();
            this.f256b = c14409j;
        }
    }

    @Override // Ad.K
    public final synchronized C14409j zza() {
        return this.f256b;
    }

    @Override // Ad.K
    public final void zzc() {
        C14409j.a<?> aVarB;
        synchronized (this) {
            this.f257c = false;
            aVarB = this.f256b.b();
        }
        if (aVarB != null) {
            this.f258d.doUnregisterEventListener(aVarB, 2441);
        }
    }

    C2817h(C2819i c2819i, C14409j c14409j, InterfaceC2815g interfaceC2815g) {
        this.f258d = c2819i;
        this.f256b = c14409j;
        this.f255a = interfaceC2815g;
    }

    @Override // hd.InterfaceC14415p
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        C14409j.a aVarB;
        boolean z10;
        P p10 = (P) obj;
        C5233k c5233k = (C5233k) obj2;
        synchronized (this) {
            aVarB = this.f256b.b();
            z10 = this.f257c;
            this.f256b.a();
        }
        if (aVarB == null) {
            c5233k.c(Boolean.FALSE);
        } else {
            this.f255a.a(p10, aVarB, z10, c5233k);
        }
    }
}
