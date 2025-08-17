package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9547tv0 implements Hv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9120pv0 f78680a;

    /* renamed from: b, reason: collision with root package name */
    private final Uv0 f78681b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f78682c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC9331ru0 f78683d;

    private C9547tv0(Uv0 uv0, AbstractC9331ru0 abstractC9331ru0, InterfaceC9120pv0 interfaceC9120pv0) {
        this.f78681b = uv0;
        this.f78682c = interfaceC9120pv0 instanceof Cu0;
        this.f78683d = abstractC9331ru0;
        this.f78680a = interfaceC9120pv0;
    }

    static C9547tv0 d(Uv0 uv0, AbstractC9331ru0 abstractC9331ru0, InterfaceC9120pv0 interfaceC9120pv0) {
        return new C9547tv0(uv0, abstractC9331ru0, interfaceC9120pv0);
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void a(Object obj, byte[] bArr, int i10, int i11, Mt0 mt0) throws IOException {
        Gu0 gu0 = (Gu0) obj;
        if (gu0.zzt == Vv0.c()) {
            gu0.zzt = Vv0.f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void c(Object obj, InterfaceC8480jw0 interfaceC8480jw0) throws IOException {
        Iterator itF = ((Cu0) obj).zza.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            InterfaceC9652uu0 interfaceC9652uu0 = (InterfaceC9652uu0) entry.getKey();
            if (interfaceC9652uu0.zzc() != EnumC8373iw0.MESSAGE || interfaceC9652uu0.zze() || interfaceC9652uu0.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof Wu0) {
                interfaceC8480jw0.zzw(interfaceC9652uu0.zza(), ((Wu0) entry).a().b());
            } else {
                interfaceC8480jw0.zzw(interfaceC9652uu0.zza(), entry.getValue());
            }
        }
        ((Gu0) obj).zzt.k(interfaceC8480jw0);
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final int zza(Object obj) {
        int iB = ((Gu0) obj).zzt.b();
        return this.f78682c ? iB + ((Cu0) obj).zza.d() : iB;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final int zzb(Object obj) {
        int iHashCode = ((Gu0) obj).zzt.hashCode();
        return this.f78682c ? (iHashCode * 53) + ((Cu0) obj).zza.f79149a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final boolean zzk(Object obj, Object obj2) {
        if (!((Gu0) obj).zzt.equals(((Gu0) obj2).zzt)) {
            return false;
        }
        if (this.f78682c) {
            return ((Cu0) obj).zza.equals(((Cu0) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void b(Object obj, Bv0 bv0, C9225qu0 c9225qu0) throws IOException {
        this.f78681b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final Object zze() {
        InterfaceC9120pv0 interfaceC9120pv0 = this.f78680a;
        return interfaceC9120pv0 instanceof Gu0 ? ((Gu0) interfaceC9120pv0).K() : interfaceC9120pv0.b().P1();
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void zzf(Object obj) {
        this.f78681b.i(obj);
        this.f78683d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void zzg(Object obj, Object obj2) {
        Jv0.A(this.f78681b, obj, obj2);
        if (this.f78682c) {
            Jv0.z(this.f78683d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final boolean zzl(Object obj) {
        return ((Cu0) obj).zza.i();
    }
}
