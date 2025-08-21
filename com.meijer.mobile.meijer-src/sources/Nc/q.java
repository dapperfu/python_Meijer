package Nc;

import com.google.android.gms.internal.ads.I9;
import com.google.android.gms.internal.ads.K9;
import com.google.android.gms.internal.ads.M9;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f20835a;

    q(u uVar) {
        this.f20835a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        u uVar = this.f20835a;
        return new M9(K9.t(uVar.f20846d, new I9(uVar.f20843a.f34479a, false)));
    }
}
