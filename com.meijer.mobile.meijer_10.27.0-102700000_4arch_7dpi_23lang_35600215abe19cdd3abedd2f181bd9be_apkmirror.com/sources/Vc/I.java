package Vc;

import com.google.android.gms.internal.ads.InterfaceC10088yy0;
import com.google.android.gms.internal.ads.InterfaceC8377iy0;
import com.google.android.gms.internal.ads.InterfaceC9482tG;
import com.google.android.gms.internal.ads.U70;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.ZF;

/* loaded from: classes4.dex */
public final class I implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f37151a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f37152b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f37153c;

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC9482tG interfaceC9482tG = (t0) this.f37151a.zzb();
        InterfaceC9482tG interfaceC9482tG2 = (P) this.f37152b.zzb();
        Xj0 xj0B = U70.b();
        if (((Integer) this.f37153c.zzb()).intValue() == 2) {
            interfaceC9482tG = interfaceC9482tG2;
        }
        return new ZF(interfaceC9482tG, xj0B);
    }

    public I(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f37151a = interfaceC10088yy0;
        this.f37152b = interfaceC10088yy02;
        this.f37153c = interfaceC10088yy04;
    }
}
