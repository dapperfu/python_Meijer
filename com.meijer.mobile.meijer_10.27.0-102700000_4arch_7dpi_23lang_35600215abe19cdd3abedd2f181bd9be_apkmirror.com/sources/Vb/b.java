package Vb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b extends Gb.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f37063f = C6381b.a(b.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private a f37064e;

    protected class a extends Bb.g<i> {
        protected a() {
        }
    }

    public b(Bb.e eVar, Context context) {
        super(eVar, context, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f37064e = new a();
    }

    public final void e(i iVar) {
        this.f37064e.a(iVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10 || intExtra == 12) {
                Iterator<i> it = this.f37064e.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(intExtra);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
