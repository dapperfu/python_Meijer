package Xc;

import com.google.android.gms.internal.ads.InterfaceC10213yy0;
import com.google.android.gms.internal.ads.InterfaceC8502iy0;
import com.google.android.gms.internal.ads.InterfaceC9607tG;
import com.google.android.gms.internal.ads.U70;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.ZF;

/* loaded from: classes4.dex */
public final class I implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f41863a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f41864b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f41865c;

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceC9607tG interfaceC9607tG = (t0) this.f41863a.zzb();
        InterfaceC9607tG interfaceC9607tG2 = (P) this.f41864b.zzb();
        Xj0 xj0B = U70.b();
        if (((Integer) this.f41865c.zzb()).intValue() == 2) {
            interfaceC9607tG = interfaceC9607tG2;
        }
        return new ZF(interfaceC9607tG, xj0B);
    }

    public I(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f41863a = interfaceC10213yy0;
        this.f41864b = interfaceC10213yy02;
        this.f41865c = interfaceC10213yy04;
    }
}
