package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.i70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8291i70 implements InterfaceC8184h70 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f74885a;

    /* renamed from: b, reason: collision with root package name */
    private final C9038p70 f74886b;

    /* renamed from: c, reason: collision with root package name */
    private final C8503k70 f74887c = new C8503k70();

    @Override // com.google.android.gms.internal.ads.InterfaceC8184h70
    public final synchronized boolean a(InterfaceC9358s70 interfaceC9358s70) {
        C8077g70 c8077g70 = (C8077g70) this.f74885a.get(interfaceC9358s70);
        if (c8077g70 == null) {
            return true;
        }
        return c8077g70.b() < this.f74886b.f77504f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8184h70
    public final synchronized C9251r70 b(InterfaceC9358s70 interfaceC9358s70) {
        C9251r70 c9251r70E;
        try {
            C8077g70 c8077g70 = (C8077g70) this.f74885a.get(interfaceC9358s70);
            if (c8077g70 != null) {
                c9251r70E = c8077g70.e();
                if (c9251r70E == null) {
                    this.f74887c.e();
                }
                F70 f70F = c8077g70.f();
                if (c9251r70E != null) {
                    C7295Wd c7295WdD0 = C7804de.d0();
                    C7229Ud c7229UdH0 = C7262Vd.h0();
                    c7229UdH0.u(EnumC7328Xd.IN_MEMORY);
                    C7394Zd c7394ZdD0 = C7484ae.d0();
                    c7394ZdD0.u(f70F.f66744a);
                    c7394ZdD0.v(f70F.f66745b);
                    c7229UdH0.v(c7394ZdD0);
                    c7295WdD0.u(c7229UdH0);
                    c9251r70E.f77943a.zzb().c().x0(c7295WdD0.p());
                }
                e();
            } else {
                this.f74887c.f();
                e();
                c9251r70E = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c9251r70E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8184h70
    public final synchronized boolean d(InterfaceC9358s70 interfaceC9358s70, C9251r70 c9251r70) {
        boolean zH;
        try {
            C8077g70 c8077g70 = (C8077g70) this.f74885a.get(interfaceC9358s70);
            c9251r70.f77946d = Lc.v.c().a();
            if (c8077g70 == null) {
                C9038p70 c9038p70 = this.f74886b;
                C8077g70 c8077g702 = new C8077g70(c9038p70.f77504f, c9038p70.f77505g * 1000);
                if (this.f74885a.size() == this.f74886b.f77503e) {
                    int i10 = this.f74886b.f77511m;
                    int i11 = i10 - 1;
                    InterfaceC9358s70 interfaceC9358s702 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long jC = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : this.f74885a.entrySet()) {
                            if (((C8077g70) entry.getValue()).c() < jC) {
                                jC = ((C8077g70) entry.getValue()).c();
                                interfaceC9358s702 = (InterfaceC9358s70) entry.getKey();
                            }
                        }
                        if (interfaceC9358s702 != null) {
                            this.f74885a.remove(interfaceC9358s702);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : this.f74885a.entrySet()) {
                            if (((C8077g70) entry2.getValue()).d() < jC) {
                                jC = ((C8077g70) entry2.getValue()).d();
                                interfaceC9358s702 = (InterfaceC9358s70) entry2.getKey();
                            }
                        }
                        if (interfaceC9358s702 != null) {
                            this.f74885a.remove(interfaceC9358s702);
                        }
                    } else if (i11 == 2) {
                        int iA = a.e.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.f74885a.entrySet()) {
                            if (((C8077g70) entry3.getValue()).a() < iA) {
                                iA = ((C8077g70) entry3.getValue()).a();
                                interfaceC9358s702 = (InterfaceC9358s70) entry3.getKey();
                            }
                        }
                        if (interfaceC9358s702 != null) {
                            this.f74885a.remove(interfaceC9358s702);
                        }
                    }
                    this.f74887c.g();
                }
                this.f74885a.put(interfaceC9358s70, c8077g702);
                this.f74887c.d();
                c8077g70 = c8077g702;
            }
            zH = c8077g70.h(c9251r70);
            this.f74887c.c();
            C8396j70 c8396j70A = this.f74887c.a();
            F70 f70F = c8077g70.f();
            C7295Wd c7295WdD0 = C7804de.d0();
            C7229Ud c7229UdH0 = C7262Vd.h0();
            c7229UdH0.u(EnumC7328Xd.IN_MEMORY);
            C7591be c7591beH0 = C7697ce.h0();
            c7591beH0.u(c8396j70A.f75340a);
            c7591beH0.v(c8396j70A.f75341b);
            c7591beH0.w(f70F.f66745b);
            c7229UdH0.x(c7591beH0);
            c7295WdD0.u(c7229UdH0);
            c9251r70.f77943a.zzb().c().s(c7295WdD0.p());
            e();
        } catch (Throwable th2) {
            throw th2;
        }
        return zH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8184h70
    public final C9038p70 zza() {
        return this.f74886b;
    }

    private final void e() {
        Parcelable.Creator<C9038p70> creator = C9038p70.CREATOR;
        if (((Boolean) Mc.A.c().a(C8659lf.f76354h6)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f74886b.f77502d);
            sb2.append(" PoolCollection");
            sb2.append(this.f74887c.b());
            int i10 = 0;
            for (Map.Entry entry : this.f74885a.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((InterfaceC9358s70) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((C8077g70) entry.getValue()).b(); i11++) {
                    sb2.append("[O]");
                }
                for (int iB = ((C8077g70) entry.getValue()).b(); iB < this.f74886b.f77504f; iB++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((C8077g70) entry.getValue()).g());
                sb2.append("\n");
            }
            while (i10 < this.f74886b.f77503e) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            Qc.p.b(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8184h70
    @Deprecated
    public final InterfaceC9358s70 c(Mc.Y1 y12, String str, Mc.j2 j2Var) {
        return new C9465t70(y12, str, new C10174zo(this.f74886b.f77500b).a().f65183j, this.f74886b.f77506h, j2Var);
    }

    public C8291i70(C9038p70 c9038p70) {
        this.f74885a = new ConcurrentHashMap(c9038p70.f77504f);
        this.f74886b = c9038p70;
    }
}
