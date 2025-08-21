package Rc;

import android.content.Context;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.G90;
import com.google.android.gms.internal.ads.H90;

/* loaded from: classes4.dex */
public final class Y extends B {

    /* renamed from: c, reason: collision with root package name */
    private final Sc.u f32336c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32337d;

    /* renamed from: e, reason: collision with root package name */
    private final Sc.v f32338e;

    @Override // Rc.B
    public final void a() {
        Sc.v vVar = this.f32338e;
        if (vVar == null) {
            this.f32336c.zza(this.f32337d);
        } else {
            new G90(vVar.b(), this.f32336c, C7033Kq.f69018e, null).d(this.f32337d);
        }
    }

    public Y(Context context, String str, String str2, H90 h90, Sc.v vVar) {
        this.f32336c = new Sc.u(Nc.v.t().H(context, str));
        this.f32337d = str2;
        this.f32338e = vVar;
    }
}
