package Nc;

import Rc.D0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C7842co;
import com.google.android.gms.internal.ads.InterfaceC6930Hp;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20792a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20793b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6930Hp f20794c;

    /* renamed from: d, reason: collision with root package name */
    private final C7842co f20795d = new C7842co(false, Collections.EMPTY_LIST);

    public final void a() {
        this.f20793b = true;
    }

    private final boolean d() {
        InterfaceC6930Hp interfaceC6930Hp = this.f20794c;
        return (interfaceC6930Hp != null && interfaceC6930Hp.zza().f67361f) || this.f20795d.f74100a;
    }

    public b(Context context, InterfaceC6930Hp interfaceC6930Hp, C7842co c7842co) {
        this.f20792a = context;
        this.f20794c = interfaceC6930Hp;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            InterfaceC6930Hp interfaceC6930Hp = this.f20794c;
            if (interfaceC6930Hp != null) {
                interfaceC6930Hp.a(str, null, 3);
                return;
            }
            C7842co c7842co = this.f20795d;
            if (c7842co.f74100a && (list = c7842co.f74101b) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.f20792a;
                        v.t();
                        D0.m(context, "", strReplace);
                    }
                }
            }
        }
    }

    public final boolean c() {
        if (d() && !this.f20793b) {
            return false;
        }
        return true;
    }
}
