package Za;

import Db.e;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bb.g;
import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a extends Ib.a {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f43660g = C13785b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public final C0928a f43661e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43662f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Za.a$a, reason: collision with other inner class name */
    public class C0928a extends g<b> {
        protected C0928a() {
        }
    }

    public a(Context context, e eVar) {
        super(eVar, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f43661e = new C0928a();
        this.f43662f = false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            boolean z10 = false;
            int intExtra = intent.getIntExtra("plugged", 0);
            if (intExtra == 2 || intExtra == 1) {
                z10 = true;
            }
            if (z10 != this.f43662f) {
                this.f43662f = z10;
                Iterator<b> it = this.f43661e.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(z10);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
