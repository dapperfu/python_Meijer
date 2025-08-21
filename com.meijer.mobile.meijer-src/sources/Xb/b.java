package Xb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b extends Ib.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f41775f = C13785b.a(b.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private a f41776e;

    protected class a extends Db.g<i> {
        protected a() {
        }
    }

    public b(Db.e eVar, Context context) {
        super(eVar, context, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f41776e = new a();
    }

    public final void e(i iVar) {
        this.f41776e.a(iVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10 || intExtra == 12) {
                Iterator<i> it = this.f41776e.iterator();
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
