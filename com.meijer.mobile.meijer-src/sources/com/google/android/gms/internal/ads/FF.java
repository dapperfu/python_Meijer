package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes6.dex */
public final class FF extends WE implements HF {
    @Override // com.google.android.gms.internal.ads.HF
    public final void L(final String str) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.DF
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).L(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void a(final String str, final String str2) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.CF
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).a(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void p(final String str) {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.BF
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).p(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        J0(new VE(str2) { // from class: com.google.android.gms.internal.ads.zF

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f81227a = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).zza(this.f81227a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zze() {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.EF
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.HF
    public final void zzf() {
        J0(new VE() { // from class: com.google.android.gms.internal.ads.AF
            @Override // com.google.android.gms.internal.ads.VE
            public final void zza(Object obj) {
                ((HF) obj).zzf();
            }
        });
    }

    public FF(Set set) {
        super(set);
    }
}
