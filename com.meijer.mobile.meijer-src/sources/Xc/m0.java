package Xc;

import android.util.Pair;
import com.google.android.gms.internal.ads.C9427rg;
import com.google.android.gms.internal.ads.CN;

/* loaded from: classes4.dex */
public final class m0 extends Zc.b {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f41982a;

    /* renamed from: b, reason: collision with root package name */
    private final CN f41983b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41984c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41985d;

    /* renamed from: e, reason: collision with root package name */
    private final long f41986e = Nc.v.c().a();

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f41987f;

    @Override // Zc.b
    public final void a(String str) {
        C5569c.d(this.f41983b, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", Gc.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f41985d)), new Pair("sgpc_lsu", String.valueOf(this.f41987f)), new Pair("tpc", true != this.f41984c ? "0" : "1"));
        this.f41982a.f(this.f41984c, new n0(null, str, c(), this.f41985d));
    }

    @Override // Zc.b
    public final void b(Zc.a aVar) {
        C5569c.d(this.f41983b, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", Gc.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f41985d)), new Pair("sgpc_lsu", String.valueOf(this.f41987f)), new Pair("tpc", true != this.f41984c ? "0" : "1"));
        this.f41982a.f(this.f41984c, new n0(aVar, "", c(), this.f41985d));
    }

    public m0(l0 l0Var, boolean z10, int i10, Boolean bool, CN cn2) {
        this.f41982a = l0Var;
        this.f41984c = z10;
        this.f41985d = i10;
        this.f41987f = bool;
        this.f41983b = cn2;
    }

    private static long c() {
        return Nc.v.c().a() + ((Long) C9427rg.f78894f.e()).longValue();
    }

    private final long d() {
        return Nc.v.c().a() - this.f41986e;
    }
}
