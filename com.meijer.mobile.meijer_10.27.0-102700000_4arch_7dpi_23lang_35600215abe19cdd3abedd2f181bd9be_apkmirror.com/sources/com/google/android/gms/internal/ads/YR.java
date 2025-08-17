package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class YR extends ZR {

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray f71548h;

    /* renamed from: c, reason: collision with root package name */
    private final Context f71549c;

    /* renamed from: d, reason: collision with root package name */
    private final BB f71550d;

    /* renamed from: e, reason: collision with root package name */
    private final TelephonyManager f71551e;

    /* renamed from: f, reason: collision with root package name */
    private final QR f71552f;

    /* renamed from: g, reason: collision with root package name */
    private EnumC6756Ge f71553g;

    static {
        SparseArray sparseArray = new SparseArray();
        f71548h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC9724vd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC9724vd enumC9724vd = EnumC9724vd.CONNECTING;
        sparseArray.put(iOrdinal, enumC9724vd);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC9724vd);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC9724vd);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC9724vd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC9724vd enumC9724vd2 = EnumC9724vd.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC9724vd2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC9724vd2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC9724vd2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC9724vd2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC9724vd2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC9724vd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC9724vd);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC9724vd);
    }

    static /* bridge */ /* synthetic */ EnumC9724vd c(YR yr2, Bundle bundle) {
        return (EnumC9724vd) f71548h.get(H60.a(H60.a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC9724vd.UNSPECIFIED);
    }

    private static final EnumC6756Ge g(boolean z10) {
        return z10 ? EnumC6756Ge.ENUM_TRUE : EnumC6756Ge.ENUM_FALSE;
    }

    public final void e(boolean z10) {
        Mj0.r(this.f71550d.b(new Bundle()), new XR(this, z10), C6908Kq.f68180g);
    }

    YR(Context context, BB bb2, QR qr2, MR mr2, Pc.r0 r0Var) {
        super(mr2, r0Var);
        this.f71549c = context;
        this.f71550d = bb2;
        this.f71552f = qr2;
        this.f71551e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ C9083pd b(YR yr2, Bundle bundle) {
        EnumC8655ld enumC8655ld;
        C8548kd c8548kdD0 = C9083pd.d0();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            yr2.f71553g = EnumC6756Ge.ENUM_TRUE;
        } else {
            yr2.f71553g = EnumC6756Ge.ENUM_FALSE;
            if (i10 != 0) {
                if (i10 != 1) {
                    c8548kdD0.v(EnumC8869nd.NETWORKTYPE_UNSPECIFIED);
                } else {
                    c8548kdD0.v(EnumC8869nd.WIFI);
                }
            } else {
                c8548kdD0.v(EnumC8869nd.CELL);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC8655ld = EnumC8655ld.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    enumC8655ld = EnumC8655ld.THREE_G;
                    break;
                case 13:
                    enumC8655ld = EnumC8655ld.LTE;
                    break;
                default:
                    enumC8655ld = EnumC8655ld.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            c8548kdD0.u(enumC8655ld);
        }
        return c8548kdD0.p();
    }

    static /* bridge */ /* synthetic */ byte[] f(YR yr2, boolean z10, ArrayList arrayList, C9083pd c9083pd, EnumC9724vd enumC9724vd) {
        boolean z11;
        C9510td c9510tdE0 = C9403sd.E0();
        c9510tdE0.J(arrayList);
        boolean z12 = false;
        if (Settings.Global.getInt(yr2.f71549c.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c9510tdE0.u(g(z11));
        c9510tdE0.v(Lc.v.u().f(yr2.f71549c, yr2.f71551e));
        c9510tdE0.E(yr2.f71552f.e());
        c9510tdE0.D(yr2.f71552f.b());
        c9510tdE0.w(yr2.f71552f.a());
        c9510tdE0.x(enumC9724vd);
        c9510tdE0.y(c9083pd);
        c9510tdE0.z(yr2.f71553g);
        c9510tdE0.F(g(z10));
        c9510tdE0.H(yr2.f71552f.d());
        c9510tdE0.G(Lc.v.c().a());
        if (Settings.Global.getInt(yr2.f71549c.getContentResolver(), "wifi_on", 0) != 0) {
            z12 = true;
        }
        c9510tdE0.I(g(z12));
        return c9510tdE0.p().j();
    }
}
