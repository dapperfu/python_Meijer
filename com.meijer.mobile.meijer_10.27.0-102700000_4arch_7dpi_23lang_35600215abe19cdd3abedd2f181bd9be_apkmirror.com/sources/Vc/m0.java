package Vc;

import android.util.Pair;
import com.google.android.gms.internal.ads.C9302rg;
import com.google.android.gms.internal.ads.CN;

/* loaded from: classes4.dex */
public final class m0 extends Xc.b {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f37270a;

    /* renamed from: b, reason: collision with root package name */
    private final CN f37271b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37272c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37273d;

    /* renamed from: e, reason: collision with root package name */
    private final long f37274e = Lc.v.c().a();

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f37275f;

    @Override // Xc.b
    public final void a(String str) {
        C5366c.d(this.f37271b, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", Ec.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f37273d)), new Pair("sgpc_lsu", String.valueOf(this.f37275f)), new Pair("tpc", true != this.f37272c ? "0" : "1"));
        this.f37270a.f(this.f37272c, new n0(null, str, c(), this.f37273d));
    }

    @Override // Xc.b
    public final void b(Xc.a aVar) {
        C5366c.d(this.f37271b, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", Ec.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f37273d)), new Pair("sgpc_lsu", String.valueOf(this.f37275f)), new Pair("tpc", true != this.f37272c ? "0" : "1"));
        this.f37270a.f(this.f37272c, new n0(aVar, "", c(), this.f37273d));
    }

    public m0(l0 l0Var, boolean z10, int i10, Boolean bool, CN cn2) {
        this.f37270a = l0Var;
        this.f37272c = z10;
        this.f37273d = i10;
        this.f37275f = bool;
        this.f37271b = cn2;
    }

    private static long c() {
        return Lc.v.c().a() + ((Long) C9302rg.f78054f.e()).longValue();
    }

    private final long d() {
        return Lc.v.c().a() - this.f37274e;
    }
}
