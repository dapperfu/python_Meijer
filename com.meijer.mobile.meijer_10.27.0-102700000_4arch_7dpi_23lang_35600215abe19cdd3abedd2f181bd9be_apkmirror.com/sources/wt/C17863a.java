package wt;

import Bb.e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import ut.InterfaceC17319e;

/* renamed from: wt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C17863a extends Gb.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f166569f = C6381b.a(C17863a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC17319e f166570e;

    public C17863a(e eVar, Context context, InterfaceC17319e interfaceC17319e) {
        super(eVar, context, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        this.f166570e = interfaceC17319e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.AIRPLANE_MODE".equals(intent.getAction()) || intent.getExtras() == null || this.f166570e == null) {
            return;
        }
        if (intent.getExtras().getBoolean("state")) {
            this.f166570e.a();
        } else {
            this.f166570e.b();
        }
    }
}
