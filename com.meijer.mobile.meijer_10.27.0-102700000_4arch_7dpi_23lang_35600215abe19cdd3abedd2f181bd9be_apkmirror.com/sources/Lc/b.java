package Lc;

import Pc.D0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C7717co;
import com.google.android.gms.internal.ads.InterfaceC6805Hp;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17972a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17973b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6805Hp f17974c;

    /* renamed from: d, reason: collision with root package name */
    private final C7717co f17975d = new C7717co(false, Collections.EMPTY_LIST);

    public final void a() {
        this.f17973b = true;
    }

    private final boolean d() {
        InterfaceC6805Hp interfaceC6805Hp = this.f17974c;
        return (interfaceC6805Hp != null && interfaceC6805Hp.zza().f66521f) || this.f17975d.f73260a;
    }

    public b(Context context, InterfaceC6805Hp interfaceC6805Hp, C7717co c7717co) {
        this.f17972a = context;
        this.f17974c = interfaceC6805Hp;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            InterfaceC6805Hp interfaceC6805Hp = this.f17974c;
            if (interfaceC6805Hp != null) {
                interfaceC6805Hp.a(str, null, 3);
                return;
            }
            C7717co c7717co = this.f17975d;
            if (c7717co.f73260a && (list = c7717co.f73261b) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.f17972a;
                        v.t();
                        D0.m(context, "", strReplace);
                    }
                }
            }
        }
    }

    public final boolean c() {
        if (d() && !this.f17973b) {
            return false;
        }
        return true;
    }
}
