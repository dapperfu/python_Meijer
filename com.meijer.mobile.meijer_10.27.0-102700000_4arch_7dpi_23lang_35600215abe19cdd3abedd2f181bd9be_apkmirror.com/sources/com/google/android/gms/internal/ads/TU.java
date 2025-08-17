package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class TU implements InterfaceC8323iT {
    protected abstract com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60);

    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        return !TextUtils.isEmpty(z50.f72063v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(C8608l60 c8608l60, Z50 z50) {
        String strOptString = z50.f72063v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        C9356s60 c9356s60 = new C9356s60();
        c9356s60.M(c9570u60);
        c9356s60.P(strOptString);
        Bundle bundleD = d(c9570u60.f78738d.f19179m);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = z50.f72063v.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = z50.f72063v.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = z50.f71998D.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = z50.f71998D.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        Mc.Y1 y12 = c9570u60.f78738d;
        Bundle bundle = y12.f19180n;
        List list = y12.f19181o;
        String str = y12.f19182p;
        String str2 = y12.f19183q;
        boolean z10 = y12.f19184r;
        Mc.X x10 = y12.f19185s;
        int i10 = y12.f19186t;
        String str3 = y12.f19187u;
        List list2 = y12.f19188v;
        int i11 = y12.f19189w;
        String str4 = y12.f19190x;
        int i12 = y12.f19191y;
        long j10 = y12.f19192z;
        c9356s60.h(new Mc.Y1(y12.f19167a, y12.f19168b, bundleD2, y12.f19170d, y12.f19171e, y12.f19172f, y12.f19173g, y12.f19174h, y12.f19175i, y12.f19176j, y12.f19177k, y12.f19178l, bundleD, bundle, list, str, str2, z10, x10, i10, str3, list2, i11, str4, i12, j10));
        C9570u60 c9570u60J = c9356s60.j();
        Bundle bundle2 = new Bundle();
        C7648c60 c7648c60 = c8608l60.f75749b.f75337b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(c7648c60.f73102a));
        bundle3.putInt("refresh_interval", c7648c60.f73104c);
        bundle3.putString("gws_query_id", c7648c60.f73103b);
        bundle2.putBundle("parent_common_config", bundle3);
        C9570u60 c9570u602 = c8608l60.f75748a.f74605a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", c9570u602.f78740f);
        bundle4.putString("allocation_id", z50.f72065w);
        bundle4.putString("ad_source_name", z50.f72000F);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(z50.f72025c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(z50.f72027d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(z50.f72051p));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(z50.f72045m));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(z50.f72033g));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(z50.f72035h));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(z50.f72037i));
        bundle4.putString("transaction_id", z50.f72039j);
        bundle4.putString("valid_from_timestamp", z50.f72041k);
        bundle4.putBoolean("is_closable_area_disabled", z50.f72010P);
        bundle4.putString("recursive_server_response_data", z50.f72050o0);
        bundle4.putBoolean("is_analytics_logging_enabled", z50.f72017W);
        if (z50.f72043l != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", z50.f72043l.f70929b);
            bundle5.putString("rb_type", z50.f72043l.f70928a);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return c(c9570u60J, bundle2, z50, c8608l60);
    }
}
