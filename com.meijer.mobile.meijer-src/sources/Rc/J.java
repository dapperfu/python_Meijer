package Rc;

import com.google.android.gms.internal.ads.Z6;
import com.google.android.gms.internal.ads.zzapv;

/* loaded from: classes4.dex */
final class J implements Z6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f32320a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f32321b;

    J(P p10, String str, L l10) {
        this.f32320a = str;
        this.f32321b = l10;
    }

    @Override // com.google.android.gms.internal.ads.Z6
    public final void a(zzapv zzapvVar) {
        Sc.p.g("Failed to load URL: " + this.f32320a + "\n" + zzapvVar.toString());
        this.f32321b.zza(null);
    }
}
