package Kb;

import Bb.e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import fb.C13865b;

/* loaded from: classes4.dex */
public class a extends Gb.a {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f16358e = C6381b.a(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final C6382c f16359f = C6383d.a(a.class.getName());

    public a(e eVar, Context context) {
        super(eVar, context, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            try {
                C13865b.a().f130858A.b();
            } catch (Exception e10) {
                f16359f.f("User timezone failed: {}", e10.getMessage());
            }
        }
    }
}
