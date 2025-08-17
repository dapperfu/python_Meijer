package Lc;

import com.google.android.gms.internal.ads.InterfaceC6753Gc0;

/* loaded from: classes4.dex */
final class j implements InterfaceC6753Gc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f17988a;

    j(k kVar) {
        this.f17988a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6753Gc0
    public final void zza(int i10, long j10) {
        this.f17988a.f17996h.d(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6753Gc0
    public final void zzb(int i10, long j10, String str) {
        this.f17988a.f17996h.e(i10, System.currentTimeMillis() - j10, str);
    }
}
