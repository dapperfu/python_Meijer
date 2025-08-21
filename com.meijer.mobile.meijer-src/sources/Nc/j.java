package Nc;

import com.google.android.gms.internal.ads.InterfaceC6878Gc0;

/* loaded from: classes4.dex */
final class j implements InterfaceC6878Gc0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f20808a;

    j(k kVar) {
        this.f20808a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6878Gc0
    public final void zza(int i10, long j10) {
        this.f20808a.f20816h.d(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6878Gc0
    public final void zzb(int i10, long j10, String str) {
        this.f20808a.f20816h.e(i10, System.currentTimeMillis() - j10, str);
    }
}
