package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.i70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8416i70 implements InterfaceC8309h70 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f75725a;

    /* renamed from: b, reason: collision with root package name */
    private final C9163p70 f75726b;

    /* renamed from: c, reason: collision with root package name */
    private final C8628k70 f75727c = new C8628k70();

    @Override // com.google.android.gms.internal.ads.InterfaceC8309h70
    public final synchronized boolean a(InterfaceC9483s70 interfaceC9483s70) {
        C8202g70 c8202g70 = (C8202g70) this.f75725a.get(interfaceC9483s70);
        if (c8202g70 == null) {
            return true;
        }
        return c8202g70.b() < this.f75726b.f78344f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8309h70
    public final synchronized C9376r70 b(InterfaceC9483s70 interfaceC9483s70) {
        C9376r70 c9376r70E;
        try {
            C8202g70 c8202g70 = (C8202g70) this.f75725a.get(interfaceC9483s70);
            if (c8202g70 != null) {
                c9376r70E = c8202g70.e();
                if (c9376r70E == null) {
                    this.f75727c.e();
                }
                F70 f70F = c8202g70.f();
                if (c9376r70E != null) {
                    C7420Wd c7420WdD0 = C7929de.d0();
                    C7354Ud c7354UdH0 = C7387Vd.h0();
                    c7354UdH0.u(EnumC7453Xd.IN_MEMORY);
                    C7519Zd c7519ZdD0 = C7609ae.d0();
                    c7519ZdD0.u(f70F.f67584a);
                    c7519ZdD0.v(f70F.f67585b);
                    c7354UdH0.v(c7519ZdD0);
                    c7420WdD0.u(c7354UdH0);
                    c9376r70E.f78783a.zzb().c().w0(c7420WdD0.p());
                }
                e();
            } else {
                this.f75727c.f();
                e();
                c9376r70E = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c9376r70E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8309h70
    public final synchronized boolean d(InterfaceC9483s70 interfaceC9483s70, C9376r70 c9376r70) {
        boolean zH;
        try {
            C8202g70 c8202g70 = (C8202g70) this.f75725a.get(interfaceC9483s70);
            c9376r70.f78786d = Nc.v.c().a();
            if (c8202g70 == null) {
                C9163p70 c9163p70 = this.f75726b;
                C8202g70 c8202g702 = new C8202g70(c9163p70.f78344f, c9163p70.f78345g * 1000);
                if (this.f75725a.size() == this.f75726b.f78343e) {
                    int i10 = this.f75726b.f78351m;
                    int i11 = i10 - 1;
                    InterfaceC9483s70 interfaceC9483s702 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long jC = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : this.f75725a.entrySet()) {
                            if (((C8202g70) entry.getValue()).c() < jC) {
                                jC = ((C8202g70) entry.getValue()).c();
                                interfaceC9483s702 = (InterfaceC9483s70) entry.getKey();
                            }
                        }
                        if (interfaceC9483s702 != null) {
                            this.f75725a.remove(interfaceC9483s702);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : this.f75725a.entrySet()) {
                            if (((C8202g70) entry2.getValue()).d() < jC) {
                                jC = ((C8202g70) entry2.getValue()).d();
                                interfaceC9483s702 = (InterfaceC9483s70) entry2.getKey();
                            }
                        }
                        if (interfaceC9483s702 != null) {
                            this.f75725a.remove(interfaceC9483s702);
                        }
                    } else if (i11 == 2) {
                        int iA = a.e.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.f75725a.entrySet()) {
                            if (((C8202g70) entry3.getValue()).a() < iA) {
                                iA = ((C8202g70) entry3.getValue()).a();
                                interfaceC9483s702 = (InterfaceC9483s70) entry3.getKey();
                            }
                        }
                        if (interfaceC9483s702 != null) {
                            this.f75725a.remove(interfaceC9483s702);
                        }
                    }
                    this.f75727c.g();
                }
                this.f75725a.put(interfaceC9483s70, c8202g702);
                this.f75727c.d();
                c8202g70 = c8202g702;
            }
            zH = c8202g70.h(c9376r70);
            this.f75727c.c();
            C8521j70 c8521j70A = this.f75727c.a();
            F70 f70F = c8202g70.f();
            C7420Wd c7420WdD0 = C7929de.d0();
            C7354Ud c7354UdH0 = C7387Vd.h0();
            c7354UdH0.u(EnumC7453Xd.IN_MEMORY);
            C7716be c7716beH0 = C7822ce.h0();
            c7716beH0.u(c8521j70A.f76180a);
            c7716beH0.v(c8521j70A.f76181b);
            c7716beH0.w(f70F.f67585b);
            c7354UdH0.x(c7716beH0);
            c7420WdD0.u(c7354UdH0);
            c9376r70.f78783a.zzb().c().s(c7420WdD0.p());
            e();
        } catch (Throwable th2) {
            throw th2;
        }
        return zH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8309h70
    public final C9163p70 zza() {
        return this.f75726b;
    }

    private final void e() {
        Parcelable.Creator<C9163p70> creator = C9163p70.CREATOR;
        if (((Boolean) Oc.A.c().a(C8784lf.f77194h6)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f75726b.f78342d);
            sb2.append(" PoolCollection");
            sb2.append(this.f75727c.b());
            int i10 = 0;
            for (Map.Entry entry : this.f75725a.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((InterfaceC9483s70) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((C8202g70) entry.getValue()).b(); i11++) {
                    sb2.append("[O]");
                }
                for (int iB = ((C8202g70) entry.getValue()).b(); iB < this.f75726b.f78344f; iB++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((C8202g70) entry.getValue()).g());
                sb2.append("\n");
            }
            while (i10 < this.f75726b.f78343e) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            Sc.p.b(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8309h70
    @Deprecated
    public final InterfaceC9483s70 c(Oc.Y1 y12, String str, Oc.j2 j2Var) {
        return new C9590t70(y12, str, new C10299zo(this.f75726b.f78340b).a().f66023j, this.f75726b.f78346h, j2Var);
    }

    public C8416i70(C9163p70 c9163p70) {
        this.f75725a = new ConcurrentHashMap(c9163p70.f78344f);
        this.f75726b = c9163p70;
    }
}
