package Yc;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC10213yy0;
import com.google.android.gms.internal.ads.InterfaceC8502iy0;

/* loaded from: classes4.dex */
public final class b implements InterfaceC8502iy0<a> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f43039a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f43040b;

    public static b a(InterfaceC10213yy0<Context> interfaceC10213yy0, InterfaceC10213yy0<Sc.a> interfaceC10213yy02) {
        return new b(interfaceC10213yy0, interfaceC10213yy02);
    }

    public static a c(Context context, Sc.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return c((Context) this.f43039a.zzb(), (Sc.a) this.f43040b.zzb());
    }

    public b(InterfaceC10213yy0<Context> interfaceC10213yy0, InterfaceC10213yy0<Sc.a> interfaceC10213yy02) {
        this.f43039a = interfaceC10213yy0;
        this.f43040b = interfaceC10213yy02;
    }
}
