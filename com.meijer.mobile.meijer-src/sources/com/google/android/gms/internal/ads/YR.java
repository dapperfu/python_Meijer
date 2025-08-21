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
    private static final SparseArray f72388h;

    /* renamed from: c, reason: collision with root package name */
    private final Context f72389c;

    /* renamed from: d, reason: collision with root package name */
    private final BB f72390d;

    /* renamed from: e, reason: collision with root package name */
    private final TelephonyManager f72391e;

    /* renamed from: f, reason: collision with root package name */
    private final QR f72392f;

    /* renamed from: g, reason: collision with root package name */
    private EnumC6881Ge f72393g;

    static {
        SparseArray sparseArray = new SparseArray();
        f72388h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC9849vd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC9849vd enumC9849vd = EnumC9849vd.CONNECTING;
        sparseArray.put(iOrdinal, enumC9849vd);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC9849vd);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC9849vd);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC9849vd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC9849vd enumC9849vd2 = EnumC9849vd.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC9849vd2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC9849vd2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC9849vd2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC9849vd2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC9849vd2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC9849vd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC9849vd);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC9849vd);
    }

    static /* bridge */ /* synthetic */ EnumC9849vd c(YR yr2, Bundle bundle) {
        return (EnumC9849vd) f72388h.get(H60.a(H60.a(bundle, "device"), "network").getInt("active_network_state", -1), EnumC9849vd.UNSPECIFIED);
    }

    private static final EnumC6881Ge g(boolean z10) {
        return z10 ? EnumC6881Ge.ENUM_TRUE : EnumC6881Ge.ENUM_FALSE;
    }

    public final void e(boolean z10) {
        Mj0.r(this.f72390d.b(new Bundle()), new XR(this, z10), C7033Kq.f69020g);
    }

    YR(Context context, BB bb2, QR qr2, MR mr2, Rc.r0 r0Var) {
        super(mr2, r0Var);
        this.f72389c = context;
        this.f72390d = bb2;
        this.f72392f = qr2;
        this.f72391e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ C9208pd b(YR yr2, Bundle bundle) {
        EnumC8780ld enumC8780ld;
        C8673kd c8673kdD0 = C9208pd.d0();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            yr2.f72393g = EnumC6881Ge.ENUM_TRUE;
        } else {
            yr2.f72393g = EnumC6881Ge.ENUM_FALSE;
            if (i10 != 0) {
                if (i10 != 1) {
                    c8673kdD0.v(EnumC8994nd.NETWORKTYPE_UNSPECIFIED);
                } else {
                    c8673kdD0.v(EnumC8994nd.WIFI);
                }
            } else {
                c8673kdD0.v(EnumC8994nd.CELL);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC8780ld = EnumC8780ld.TWO_G;
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
                    enumC8780ld = EnumC8780ld.THREE_G;
                    break;
                case 13:
                    enumC8780ld = EnumC8780ld.LTE;
                    break;
                default:
                    enumC8780ld = EnumC8780ld.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            c8673kdD0.u(enumC8780ld);
        }
        return c8673kdD0.p();
    }

    static /* bridge */ /* synthetic */ byte[] f(YR yr2, boolean z10, ArrayList arrayList, C9208pd c9208pd, EnumC9849vd enumC9849vd) {
        boolean z11;
        C9635td c9635tdE0 = C9528sd.E0();
        c9635tdE0.J(arrayList);
        boolean z12 = false;
        if (Settings.Global.getInt(yr2.f72389c.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c9635tdE0.u(g(z11));
        c9635tdE0.v(Nc.v.u().f(yr2.f72389c, yr2.f72391e));
        c9635tdE0.E(yr2.f72392f.e());
        c9635tdE0.D(yr2.f72392f.b());
        c9635tdE0.w(yr2.f72392f.a());
        c9635tdE0.x(enumC9849vd);
        c9635tdE0.y(c9208pd);
        c9635tdE0.z(yr2.f72393g);
        c9635tdE0.F(g(z10));
        c9635tdE0.H(yr2.f72392f.d());
        c9635tdE0.G(Nc.v.c().a());
        if (Settings.Global.getInt(yr2.f72389c.getContentResolver(), "wifi_on", 0) != 0) {
            z12 = true;
        }
        c9635tdE0.I(g(z12));
        return c9635tdE0.p().j();
    }
}
