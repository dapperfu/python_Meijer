package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class O5 implements V5 {

    /* renamed from: a, reason: collision with root package name */
    private final K5 f82789a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC10540g6 f82790b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82791c;

    /* renamed from: d, reason: collision with root package name */
    private final Q4 f82792d;

    private O5(AbstractC10540g6 abstractC10540g6, Q4 q42, K5 k52) {
        this.f82790b = abstractC10540g6;
        this.f82791c = k52 instanceof AbstractC10494b5;
        this.f82792d = q42;
        this.f82789a = k52;
    }

    static O5 e(AbstractC10540g6 abstractC10540g6, Q4 q42, K5 k52) {
        return new O5(abstractC10540g6, q42, k52);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void c(Object obj, byte[] bArr, int i10, int i11, C10663u4 c10663u4) throws IOException {
        AbstractC10521e5 abstractC10521e5 = (AbstractC10521e5) obj;
        if (abstractC10521e5.zzc == C10549h6.a()) {
            abstractC10521e5.zzc = C10549h6.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void d(Object obj, InterfaceC10656t6 interfaceC10656t6) throws IOException {
        Iterator itC = ((AbstractC10494b5) obj).zzb.c();
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            T4 t42 = (T4) entry.getKey();
            if (t42.zzc() != EnumC10647s6.MESSAGE || t42.zzd() || t42.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C10629q5) {
                interfaceC10656t6.zzv(t42.zza(), ((C10629q5) entry).a().c());
            } else {
                interfaceC10656t6.zzv(t42.zza(), entry.getValue());
            }
        }
        ((AbstractC10521e5) obj).zzc.f(interfaceC10656t6);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final boolean zzb(Object obj, Object obj2) {
        if (!((AbstractC10521e5) obj).zzc.equals(((AbstractC10521e5) obj2).zzc)) {
            return false;
        }
        if (this.f82791c) {
            return ((AbstractC10494b5) obj).zzb.equals(((AbstractC10494b5) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int zzc(Object obj) {
        int iHashCode = ((AbstractC10521e5) obj).zzc.hashCode();
        return this.f82791c ? (iHashCode * 53) + ((AbstractC10494b5) obj).zzb.f82845a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int zze(Object obj) {
        int iH = ((AbstractC10521e5) obj).zzc.h();
        return this.f82791c ? iH + ((AbstractC10494b5) obj).zzb.g() : iH;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final boolean a(Object obj) {
        return ((AbstractC10494b5) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void b(Object obj) {
        this.f82790b.b(obj);
        this.f82792d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final Object zza() {
        K5 k52 = this.f82789a;
        return k52 instanceof AbstractC10521e5 ? ((AbstractC10521e5) k52).m() : k52.d().zzbf();
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void zzd(Object obj, Object obj2) {
        X5.d(this.f82790b, obj, obj2);
        if (this.f82791c) {
            X5.c(this.f82792d, obj, obj2);
        }
    }
}
