package ze;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.atv_ads_framework.B1;
import com.google.android.gms.internal.atv_ads_framework.C10212e;
import com.google.android.gms.internal.atv_ads_framework.EnumC10198a;
import com.google.android.gms.internal.atv_ads_framework.o2;
import com.google.android.gms.internal.atv_ads_framework.p2;
import com.google.android.tv.ads.controls.FallbackImageActivity;
import java.util.Iterator;

/* renamed from: ze.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18448c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f171805a;

    private final void b() {
        this.f171805a.startActivity(new Intent().setClassName(this.f171805a.getPackageName(), FallbackImageActivity.class.getName()).setFlags(268435456).putExtra("render_error_message", true));
    }

    public C18448c(Context context) {
        context.getClass();
        this.f171805a = context;
    }

    public void a(e eVar) {
        String strC;
        String queryParameter;
        eVar.getClass();
        Iterator<AbstractC18449d> it = eVar.b().iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC18449d next = it.next();
                String strC2 = next.c();
                if (strC2 != null && (queryParameter = Uri.parse(strC2).getQueryParameter("atvatc")) != null && queryParameter.equals("1")) {
                    strC = next.c();
                    break;
                }
            } else {
                strC = null;
                break;
            }
        }
        if (strC != null) {
            try {
                Intent intentPutExtra = new Intent().setAction("com.google.android.tv.ads.intent.action.LAUNCH_ATC_MENU").setFlags(268435456).putExtra("extra_atc_uri", strC).putExtra("extra_publisher_package", this.f171805a.getPackageName());
                EnumC10198a enumC10198a = EnumC10198a.TV_LAUNCHER;
                int iOrdinal = C10212e.a(this.f171805a).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                                return;
                            }
                            B1 b1A = B1.a(this.f171805a);
                            o2 o2VarQ = p2.q();
                            o2VarQ.g(2);
                            o2VarQ.j(3);
                            o2VarQ.i(3);
                            b1A.b((p2) o2VarQ.c());
                            b();
                            return;
                        }
                    } else {
                        B1 b1A2 = B1.a(this.f171805a);
                        o2 o2VarQ2 = p2.q();
                        o2VarQ2.g(2);
                        o2VarQ2.j(3);
                        b1A2.b((p2) o2VarQ2.c());
                        this.f171805a.startActivity(intentPutExtra.setPackage("com.google.android.apps.tv.launcherx"));
                        return;
                    }
                }
                B1 b1A3 = B1.a(this.f171805a);
                o2 o2VarQ3 = p2.q();
                o2VarQ3.g(2);
                o2VarQ3.j(3);
                b1A3.b((p2) o2VarQ3.c());
                this.f171805a.startActivity(intentPutExtra.setPackage("com.google.android.tvrecommendations"));
                return;
            } catch (ActivityNotFoundException unused) {
                B1 b1A4 = B1.a(this.f171805a);
                o2 o2VarQ4 = p2.q();
                o2VarQ4.g(2);
                o2VarQ4.j(3);
                o2VarQ4.i(2);
                b1A4.b((p2) o2VarQ4.c());
                b();
                return;
            }
        }
        if (eVar.b().isEmpty()) {
            B1 b1A5 = B1.a(this.f171805a);
            o2 o2VarQ5 = p2.q();
            o2VarQ5.g(2);
            o2VarQ5.j(2);
            o2VarQ5.i(6);
            b1A5.b((p2) o2VarQ5.c());
            b();
            return;
        }
        this.f171805a.startActivity(new Intent().setClassName(this.f171805a.getPackageName(), FallbackImageActivity.class.getName()).setFlags(268435456).putExtra("icon_click_fallback_images", eVar));
    }
}
