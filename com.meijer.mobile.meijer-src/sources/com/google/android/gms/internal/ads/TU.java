package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class TU implements InterfaceC8448iT {
    protected abstract com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60);

    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        return !TextUtils.isEmpty(z50.f72903v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(C8733l60 c8733l60, Z50 z50) {
        String strOptString = z50.f72903v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        C9481s60 c9481s60 = new C9481s60();
        c9481s60.M(c9695u60);
        c9481s60.P(strOptString);
        Bundle bundleD = d(c9695u60.f79578d.f23366m);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = z50.f72903v.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = z50.f72903v.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = z50.f72838D.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = z50.f72838D.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        Oc.Y1 y12 = c9695u60.f79578d;
        Bundle bundle = y12.f23367n;
        List list = y12.f23368o;
        String str = y12.f23369p;
        String str2 = y12.f23370q;
        boolean z10 = y12.f23371r;
        Oc.X x10 = y12.f23372s;
        int i10 = y12.f23373t;
        String str3 = y12.f23374u;
        List list2 = y12.f23375v;
        int i11 = y12.f23376w;
        String str4 = y12.f23377x;
        int i12 = y12.f23378y;
        long j10 = y12.f23379z;
        c9481s60.h(new Oc.Y1(y12.f23354a, y12.f23355b, bundleD2, y12.f23357d, y12.f23358e, y12.f23359f, y12.f23360g, y12.f23361h, y12.f23362i, y12.f23363j, y12.f23364k, y12.f23365l, bundleD, bundle, list, str, str2, z10, x10, i10, str3, list2, i11, str4, i12, j10));
        C9695u60 c9695u60J = c9481s60.j();
        Bundle bundle2 = new Bundle();
        C7773c60 c7773c60 = c8733l60.f76589b.f76177b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(c7773c60.f73942a));
        bundle3.putInt("refresh_interval", c7773c60.f73944c);
        bundle3.putString("gws_query_id", c7773c60.f73943b);
        bundle2.putBundle("parent_common_config", bundle3);
        C9695u60 c9695u602 = c8733l60.f76588a.f75445a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", c9695u602.f79580f);
        bundle4.putString("allocation_id", z50.f72905w);
        bundle4.putString("ad_source_name", z50.f72840F);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(z50.f72865c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(z50.f72867d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(z50.f72891p));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(z50.f72885m));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(z50.f72873g));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(z50.f72875h));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(z50.f72877i));
        bundle4.putString("transaction_id", z50.f72879j);
        bundle4.putString("valid_from_timestamp", z50.f72881k);
        bundle4.putBoolean("is_closable_area_disabled", z50.f72850P);
        bundle4.putString("recursive_server_response_data", z50.f72890o0);
        bundle4.putBoolean("is_analytics_logging_enabled", z50.f72857W);
        if (z50.f72883l != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", z50.f72883l.f71769b);
            bundle5.putString("rb_type", z50.f72883l.f71768a);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return c(c9695u60J, bundle2, z50, c8733l60);
    }
}
