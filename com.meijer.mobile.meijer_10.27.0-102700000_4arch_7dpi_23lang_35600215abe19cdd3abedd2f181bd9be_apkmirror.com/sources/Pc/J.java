package Pc;

import com.google.android.gms.internal.ads.Z6;
import com.google.android.gms.internal.ads.zzapv;

/* loaded from: classes4.dex */
final class J implements Z6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f25107b;

    J(P p10, String str, L l10) {
        this.f25106a = str;
        this.f25107b = l10;
    }

    @Override // com.google.android.gms.internal.ads.Z6
    public final void a(zzapv zzapvVar) {
        Qc.p.g("Failed to load URL: " + this.f25106a + "\n" + zzapvVar.toString());
        this.f25107b.zza(null);
    }
}
