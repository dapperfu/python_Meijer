package Xa;

import Bb.e;
import Za.g;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a extends Gb.a {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f39182g = C6381b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public final C0843a f39183e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39184f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Xa.a$a, reason: collision with other inner class name */
    public class C0843a extends g<b> {
        protected C0843a() {
        }
    }

    public a(Context context, e eVar) {
        super(eVar, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f39183e = new C0843a();
        this.f39184f = false;
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
            if (z10 != this.f39184f) {
                this.f39184f = z10;
                Iterator<b> it = this.f39183e.iterator();
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
