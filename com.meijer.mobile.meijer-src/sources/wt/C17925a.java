package wt;

import Db.e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import ut.InterfaceC17471e;

/* renamed from: wt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C17925a extends Ib.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f167637f = C13785b.a(C17925a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC17471e f167638e;

    public C17925a(e eVar, Context context, InterfaceC17471e interfaceC17471e) {
        super(eVar, context, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        this.f167638e = interfaceC17471e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.AIRPLANE_MODE".equals(intent.getAction()) || intent.getExtras() == null || this.f167638e == null) {
            return;
        }
        if (intent.getExtras().getBoolean("state")) {
            this.f167638e.a();
        } else {
            this.f167638e.b();
        }
    }
}
