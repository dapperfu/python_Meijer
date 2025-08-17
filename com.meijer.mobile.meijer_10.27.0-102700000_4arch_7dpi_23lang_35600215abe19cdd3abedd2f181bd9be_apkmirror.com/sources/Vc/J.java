package Vc;

import android.os.Bundle;
import com.google.android.gms.internal.ads.B80;
import com.google.android.gms.internal.ads.BB;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8788mq;
import com.google.android.gms.internal.ads.C9233qy0;
import com.google.android.gms.internal.ads.C9803wG;
import com.google.android.gms.internal.ads.CB;
import com.google.android.gms.internal.ads.EnumC7889eN;
import com.google.android.gms.internal.ads.EnumC9681v80;
import com.google.android.gms.internal.ads.InterfaceC10088yy0;
import com.google.android.gms.internal.ads.InterfaceC8377iy0;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.QB;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class J implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f37154a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f37155b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f37156c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f37157d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10088yy0 f37158e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC10088yy0 f37159f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC10088yy0 f37160g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10088yy0 f37161h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC10088yy0 f37162i;

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        com.google.common.util.concurrent.q qVarA;
        BinderC5385w binderC5385w = (BinderC5385w) this.f37154a.zzb();
        B80 b80 = (B80) this.f37155b.zzb();
        L lZzb = ((M) this.f37156c).zzb();
        BB bbZzb = ((CB) this.f37157d).zzb();
        C9803wG c9803wG = (C9803wG) this.f37158e.zzb();
        C c10 = (C) this.f37159f.zzb();
        C8788mq c8788mq = (C8788mq) this.f37160g.zzb();
        int iIntValue = ((Integer) this.f37161h.zzb()).intValue();
        Bundle bundle = ((QB) this.f37162i).a().f78753s;
        N nA = null;
        if (iIntValue == 1 && c8788mq != null) {
            bundle.putLong(EnumC7889eN.READ_FROM_DISK_START.a(), Lc.v.c().a());
            nA = c10.a(c8788mq, binderC5385w, bundle);
            bundle.putLong(EnumC7889eN.READ_FROM_DISK_END.a(), Lc.v.c().a());
        }
        if (nA != null) {
            c9803wG.R0(nA);
            qVarA = Mj0.h(nA);
        } else {
            qVarA = b80.b(EnumC9681v80.GENERATE_SIGNALS, bbZzb.c()).f(lZzb).i(((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS).a();
            Mj0.r(qVarA, new C5387y(c9803wG), C6908Kq.f68174a);
        }
        C9233qy0.b(qVarA);
        return qVarA;
    }

    public J(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05, InterfaceC10088yy0 interfaceC10088yy06, InterfaceC10088yy0 interfaceC10088yy07, InterfaceC10088yy0 interfaceC10088yy08, InterfaceC10088yy0 interfaceC10088yy09) {
        this.f37154a = interfaceC10088yy0;
        this.f37155b = interfaceC10088yy02;
        this.f37156c = interfaceC10088yy03;
        this.f37157d = interfaceC10088yy04;
        this.f37158e = interfaceC10088yy05;
        this.f37159f = interfaceC10088yy06;
        this.f37160g = interfaceC10088yy07;
        this.f37161h = interfaceC10088yy08;
        this.f37162i = interfaceC10088yy09;
    }
}
