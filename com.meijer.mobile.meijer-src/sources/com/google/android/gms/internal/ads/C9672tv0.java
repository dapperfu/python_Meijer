package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9672tv0 implements Hv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9245pv0 f79520a;

    /* renamed from: b, reason: collision with root package name */
    private final Uv0 f79521b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f79522c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC9456ru0 f79523d;

    private C9672tv0(Uv0 uv0, AbstractC9456ru0 abstractC9456ru0, InterfaceC9245pv0 interfaceC9245pv0) {
        this.f79521b = uv0;
        this.f79522c = interfaceC9245pv0 instanceof Cu0;
        this.f79523d = abstractC9456ru0;
        this.f79520a = interfaceC9245pv0;
    }

    static C9672tv0 d(Uv0 uv0, AbstractC9456ru0 abstractC9456ru0, InterfaceC9245pv0 interfaceC9245pv0) {
        return new C9672tv0(uv0, abstractC9456ru0, interfaceC9245pv0);
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
    public final void c(Object obj, InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        Iterator itF = ((Cu0) obj).zza.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            InterfaceC9777uu0 interfaceC9777uu0 = (InterfaceC9777uu0) entry.getKey();
            if (interfaceC9777uu0.zzc() != EnumC8498iw0.MESSAGE || interfaceC9777uu0.zze() || interfaceC9777uu0.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof Wu0) {
                interfaceC8605jw0.zzw(interfaceC9777uu0.zza(), ((Wu0) entry).a().b());
            } else {
                interfaceC8605jw0.zzw(interfaceC9777uu0.zza(), entry.getValue());
            }
        }
        ((Gu0) obj).zzt.k(interfaceC8605jw0);
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final int zza(Object obj) {
        int iB = ((Gu0) obj).zzt.b();
        return this.f79522c ? iB + ((Cu0) obj).zza.d() : iB;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final int zzb(Object obj) {
        int iHashCode = ((Gu0) obj).zzt.hashCode();
        return this.f79522c ? (iHashCode * 53) + ((Cu0) obj).zza.f79989a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final boolean zzk(Object obj, Object obj2) {
        if (!((Gu0) obj).zzt.equals(((Gu0) obj2).zzt)) {
            return false;
        }
        if (this.f79522c) {
            return ((Cu0) obj).zza.equals(((Cu0) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void b(Object obj, Bv0 bv0, C9350qu0 c9350qu0) throws IOException {
        this.f79521b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final Object zze() {
        InterfaceC9245pv0 interfaceC9245pv0 = this.f79520a;
        return interfaceC9245pv0 instanceof Gu0 ? ((Gu0) interfaceC9245pv0).K() : interfaceC9245pv0.b().P1();
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void zzf(Object obj) {
        this.f79521b.i(obj);
        this.f79523d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void zzg(Object obj, Object obj2) {
        Jv0.A(this.f79521b, obj, obj2);
        if (this.f79522c) {
            Jv0.z(this.f79523d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final boolean zzl(Object obj) {
        return ((Cu0) obj).zza.i();
    }
}
