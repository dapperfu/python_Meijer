package Qc;

import Nc.v;
import Oc.A;
import Rc.D0;
import Rc.p0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9937wN;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public final class a {
    public static final boolean b(Context context, l lVar, d dVar, b bVar, C9937wN c9937wN, String str) throws NumberFormatException {
        int i10 = 0;
        if (lVar == null) {
            Sc.p.g("No intent data for launcher overlay.");
            return false;
        }
        C8784lf.a(context);
        Intent intent = lVar.f28025h;
        if (intent != null) {
            return a(context, intent, dVar, bVar, lVar.f28027j, c9937wN, str);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(lVar.f28019b)) {
            Sc.p.g("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(lVar.f28020c)) {
            intent2.setData(Uri.parse(lVar.f28019b));
        } else {
            String str2 = lVar.f28019b;
            intent2.setDataAndType(Uri.parse(str2), lVar.f28020c);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(lVar.f28021d)) {
            intent2.setPackage(lVar.f28021d);
        }
        if (!TextUtils.isEmpty(lVar.f28022e)) {
            String[] strArrSplit = lVar.f28022e.split(q2.f93563c, 2);
            if (strArrSplit.length < 2) {
                Sc.p.g("Could not parse component name from open GMSG: ".concat(String.valueOf(lVar.f28022e)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str3 = lVar.f28023f;
        if (!TextUtils.isEmpty(str3)) {
            try {
                i10 = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                Sc.p.g("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) A.c().a(C8784lf.f76773D4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) A.c().a(C8784lf.f76759C4)).booleanValue()) {
                v.t();
                D0.U(context, intent2);
            }
        }
        return a(context, intent2, dVar, bVar, lVar.f28027j, c9937wN, str);
    }

    public static final boolean a(Context context, Intent intent, d dVar, b bVar, boolean z10, C9937wN c9937wN, String str) {
        if (z10) {
            return c(context, intent.getData(), dVar, bVar);
        }
        try {
            p0.k("Launching an intent: " + intent.toURI());
            if (((Boolean) A.c().a(C8784lf.f77033Vc)).booleanValue()) {
                v.t();
                D0.x(context, intent, c9937wN, str);
            } else {
                v.t();
                D0.t(context, intent);
            }
            if (dVar != null) {
                dVar.zzg();
            }
            if (bVar != null) {
                bVar.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            Sc.p.g(e10.getMessage());
            if (bVar != null) {
                bVar.a(false);
            }
            return false;
        }
    }

    private static final boolean c(Context context, Uri uri, d dVar, b bVar) {
        int iS;
        try {
            iS = v.t().S(context, uri);
            if (dVar != null) {
                dVar.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            Sc.p.g(e10.getMessage());
            iS = 6;
        }
        if (bVar != null) {
            bVar.zzb(iS);
        }
        if (iS != 5) {
            return false;
        }
        return true;
    }
}
