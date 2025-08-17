package Wc;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC10088yy0;
import com.google.android.gms.internal.ads.InterfaceC8377iy0;

/* loaded from: classes4.dex */
public final class b implements InterfaceC8377iy0<a> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f38640a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f38641b;

    public static b a(InterfaceC10088yy0<Context> interfaceC10088yy0, InterfaceC10088yy0<Qc.a> interfaceC10088yy02) {
        return new b(interfaceC10088yy0, interfaceC10088yy02);
    }

    public static a c(Context context, Qc.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return c((Context) this.f38640a.zzb(), (Qc.a) this.f38641b.zzb());
    }

    public b(InterfaceC10088yy0<Context> interfaceC10088yy0, InterfaceC10088yy0<Qc.a> interfaceC10088yy02) {
        this.f38640a = interfaceC10088yy0;
        this.f38641b = interfaceC10088yy02;
    }
}
