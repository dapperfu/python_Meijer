package Mb;

import Db.e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import hb.C14495b;

/* loaded from: classes4.dex */
public class a extends Ib.a {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f19717e = C13785b.a(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final C13786c f19718f = C13787d.a(a.class.getName());

    public a(e eVar, Context context) {
        super(eVar, context, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            try {
                C14495b.a().f135204A.b();
            } catch (Exception e10) {
                f19718f.f("User timezone failed: {}", e10.getMessage());
            }
        }
    }
}
