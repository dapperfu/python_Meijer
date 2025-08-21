package Xc;

import android.os.Bundle;
import com.google.android.gms.internal.ads.B80;
import com.google.android.gms.internal.ads.BB;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8913mq;
import com.google.android.gms.internal.ads.C9358qy0;
import com.google.android.gms.internal.ads.C9928wG;
import com.google.android.gms.internal.ads.CB;
import com.google.android.gms.internal.ads.EnumC8014eN;
import com.google.android.gms.internal.ads.EnumC9806v80;
import com.google.android.gms.internal.ads.InterfaceC10213yy0;
import com.google.android.gms.internal.ads.InterfaceC8502iy0;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.QB;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class J implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f41866a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f41867b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f41868c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f41869d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f41870e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC10213yy0 f41871f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC10213yy0 f41872g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10213yy0 f41873h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC10213yy0 f41874i;

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        com.google.common.util.concurrent.q qVarA;
        BinderC5588w binderC5588w = (BinderC5588w) this.f41866a.zzb();
        B80 b80 = (B80) this.f41867b.zzb();
        L lZzb = ((M) this.f41868c).zzb();
        BB bbZzb = ((CB) this.f41869d).zzb();
        C9928wG c9928wG = (C9928wG) this.f41870e.zzb();
        C c10 = (C) this.f41871f.zzb();
        C8913mq c8913mq = (C8913mq) this.f41872g.zzb();
        int iIntValue = ((Integer) this.f41873h.zzb()).intValue();
        Bundle bundle = ((QB) this.f41874i).a().f79593s;
        N nA = null;
        if (iIntValue == 1 && c8913mq != null) {
            bundle.putLong(EnumC8014eN.READ_FROM_DISK_START.a(), Nc.v.c().a());
            nA = c10.a(c8913mq, binderC5588w, bundle);
            bundle.putLong(EnumC8014eN.READ_FROM_DISK_END.a(), Nc.v.c().a());
        }
        if (nA != null) {
            c9928wG.R0(nA);
            qVarA = Mj0.h(nA);
        } else {
            qVarA = b80.b(EnumC9806v80.GENERATE_SIGNALS, bbZzb.c()).f(lZzb).i(((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS).a();
            Mj0.r(qVarA, new C5590y(c9928wG), C7033Kq.f69014a);
        }
        C9358qy0.b(qVarA);
        return qVarA;
    }

    public J(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05, InterfaceC10213yy0 interfaceC10213yy06, InterfaceC10213yy0 interfaceC10213yy07, InterfaceC10213yy0 interfaceC10213yy08, InterfaceC10213yy0 interfaceC10213yy09) {
        this.f41866a = interfaceC10213yy0;
        this.f41867b = interfaceC10213yy02;
        this.f41868c = interfaceC10213yy03;
        this.f41869d = interfaceC10213yy04;
        this.f41870e = interfaceC10213yy05;
        this.f41871f = interfaceC10213yy06;
        this.f41872g = interfaceC10213yy07;
        this.f41873h = interfaceC10213yy08;
        this.f41874i = interfaceC10213yy09;
    }
}
