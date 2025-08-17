package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class O5 implements V5 {

    /* renamed from: a, reason: collision with root package name */
    private final K5 f81949a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC10415g6 f81950b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f81951c;

    /* renamed from: d, reason: collision with root package name */
    private final Q4 f81952d;

    private O5(AbstractC10415g6 abstractC10415g6, Q4 q42, K5 k52) {
        this.f81950b = abstractC10415g6;
        this.f81951c = k52 instanceof AbstractC10369b5;
        this.f81952d = q42;
        this.f81949a = k52;
    }

    static O5 e(AbstractC10415g6 abstractC10415g6, Q4 q42, K5 k52) {
        return new O5(abstractC10415g6, q42, k52);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void c(Object obj, byte[] bArr, int i10, int i11, C10538u4 c10538u4) throws IOException {
        AbstractC10396e5 abstractC10396e5 = (AbstractC10396e5) obj;
        if (abstractC10396e5.zzc == C10424h6.a()) {
            abstractC10396e5.zzc = C10424h6.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void d(Object obj, InterfaceC10531t6 interfaceC10531t6) throws IOException {
        Iterator itC = ((AbstractC10369b5) obj).zzb.c();
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            T4 t42 = (T4) entry.getKey();
            if (t42.zzc() != EnumC10522s6.MESSAGE || t42.zzd() || t42.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C10504q5) {
                interfaceC10531t6.zzv(t42.zza(), ((C10504q5) entry).a().c());
            } else {
                interfaceC10531t6.zzv(t42.zza(), entry.getValue());
            }
        }
        ((AbstractC10396e5) obj).zzc.f(interfaceC10531t6);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final boolean zzb(Object obj, Object obj2) {
        if (!((AbstractC10396e5) obj).zzc.equals(((AbstractC10396e5) obj2).zzc)) {
            return false;
        }
        if (this.f81951c) {
            return ((AbstractC10369b5) obj).zzb.equals(((AbstractC10369b5) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int zzc(Object obj) {
        int iHashCode = ((AbstractC10396e5) obj).zzc.hashCode();
        return this.f81951c ? (iHashCode * 53) + ((AbstractC10369b5) obj).zzb.f82005a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int zze(Object obj) {
        int iH = ((AbstractC10396e5) obj).zzc.h();
        return this.f81951c ? iH + ((AbstractC10369b5) obj).zzb.g() : iH;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final boolean a(Object obj) {
        return ((AbstractC10369b5) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void b(Object obj) {
        this.f81950b.b(obj);
        this.f81952d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final Object zza() {
        K5 k52 = this.f81949a;
        return k52 instanceof AbstractC10396e5 ? ((AbstractC10396e5) k52).m() : k52.d().zzbf();
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void zzd(Object obj, Object obj2) {
        X5.d(this.f81950b, obj, obj2);
        if (this.f81951c) {
            X5.c(this.f81952d, obj, obj2);
        }
    }
}
