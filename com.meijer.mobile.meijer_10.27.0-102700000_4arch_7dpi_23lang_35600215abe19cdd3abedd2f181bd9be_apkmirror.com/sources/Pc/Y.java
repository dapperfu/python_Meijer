package Pc;

import android.content.Context;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.G90;
import com.google.android.gms.internal.ads.H90;

/* loaded from: classes4.dex */
public final class Y extends B {

    /* renamed from: c, reason: collision with root package name */
    private final Qc.u f25122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25123d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.v f25124e;

    @Override // Pc.B
    public final void a() {
        Qc.v vVar = this.f25124e;
        if (vVar == null) {
            this.f25122c.zza(this.f25123d);
        } else {
            new G90(vVar.b(), this.f25122c, C6908Kq.f68178e, null).d(this.f25123d);
        }
    }

    public Y(Context context, String str, String str2, H90 h90, Qc.v vVar) {
        this.f25122c = new Qc.u(Lc.v.t().H(context, str));
        this.f25123d = str2;
        this.f25124e = vVar;
    }
}
