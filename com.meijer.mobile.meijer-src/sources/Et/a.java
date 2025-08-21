package Et;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes12.dex */
public class a extends Ib.a implements Dt.b {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f8507g = C13785b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private float f8508e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8509f;

    public a(Context context, Db.e eVar) {
        super(eVar, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // Dt.b
    public final float a() {
        return this.f8508e;
    }

    @Override // Dt.b
    public final boolean b() {
        return this.f8509f && this.f8508e == 1.0f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
            this.f8509f = false;
            float intExtra = intent.getIntExtra("level", 0);
            float intExtra2 = intent.getIntExtra("scale", 100);
            if (intent.getIntExtra("status", 1) == 2) {
                this.f8509f = true;
            }
            this.f8508e = intExtra / intExtra2;
            return;
        }
        if ("android.intent.action.BATTERY_LOW".equals(action)) {
            this.f8508e = 0.1f;
        }
    }
}
