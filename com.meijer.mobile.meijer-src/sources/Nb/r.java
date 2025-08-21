package Nb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f20787a = C13785b.a(r.class.getName());

    public static void a(String str, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
