package Et;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes11.dex */
public class a extends Gb.a implements Dt.b {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f9795g = C6381b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private float f9796e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9797f;

    public a(Context context, Bb.e eVar) {
        super(eVar, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // Dt.b
    public final float a() {
        return this.f9796e;
    }

    @Override // Dt.b
    public final boolean b() {
        return this.f9797f && this.f9796e == 1.0f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
            this.f9797f = false;
            float intExtra = intent.getIntExtra("level", 0);
            float intExtra2 = intent.getIntExtra("scale", 100);
            if (intent.getIntExtra("status", 1) == 2) {
                this.f9797f = true;
            }
            this.f9796e = intExtra / intExtra2;
            return;
        }
        if ("android.intent.action.BATTERY_LOW".equals(action)) {
            this.f9796e = 0.1f;
        }
    }
}
