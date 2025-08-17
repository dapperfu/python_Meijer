package Lb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f17967a = C6381b.a(r.class.getName());

    public static void a(String str, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
