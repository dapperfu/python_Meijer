package Oc;

import Lc.v;
import Mc.A;
import Pc.D0;
import Pc.p0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9812wN;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public final class a {
    public static final boolean b(Context context, l lVar, d dVar, b bVar, C9812wN c9812wN, String str) throws NumberFormatException {
        int i10 = 0;
        if (lVar == null) {
            Qc.p.g("No intent data for launcher overlay.");
            return false;
        }
        C8659lf.a(context);
        Intent intent = lVar.f23537h;
        if (intent != null) {
            return a(context, intent, dVar, bVar, lVar.f23539j, c9812wN, str);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(lVar.f23531b)) {
            Qc.p.g("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(lVar.f23532c)) {
            intent2.setData(Uri.parse(lVar.f23531b));
        } else {
            String str2 = lVar.f23531b;
            intent2.setDataAndType(Uri.parse(str2), lVar.f23532c);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(lVar.f23533d)) {
            intent2.setPackage(lVar.f23533d);
        }
        if (!TextUtils.isEmpty(lVar.f23534e)) {
            String[] strArrSplit = lVar.f23534e.split(q2.f92724c, 2);
            if (strArrSplit.length < 2) {
                Qc.p.g("Could not parse component name from open GMSG: ".concat(String.valueOf(lVar.f23534e)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str3 = lVar.f23535f;
        if (!TextUtils.isEmpty(str3)) {
            try {
                i10 = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                Qc.p.g("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) A.c().a(C8659lf.f75933D4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) A.c().a(C8659lf.f75919C4)).booleanValue()) {
                v.t();
                D0.U(context, intent2);
            }
        }
        return a(context, intent2, dVar, bVar, lVar.f23539j, c9812wN, str);
    }

    public static final boolean a(Context context, Intent intent, d dVar, b bVar, boolean z10, C9812wN c9812wN, String str) {
        if (z10) {
            return c(context, intent.getData(), dVar, bVar);
        }
        try {
            p0.k("Launching an intent: " + intent.toURI());
            if (((Boolean) A.c().a(C8659lf.f76193Vc)).booleanValue()) {
                v.t();
                D0.x(context, intent, c9812wN, str);
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
            Qc.p.g(e10.getMessage());
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
            Qc.p.g(e10.getMessage());
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
