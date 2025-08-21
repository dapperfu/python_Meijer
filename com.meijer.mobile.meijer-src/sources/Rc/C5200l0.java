package Rc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.C8784lf;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: Rc.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5200l0 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f32370d;

    /* renamed from: e, reason: collision with root package name */
    private Context f32371e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32369c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f32368b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f32367a = new C5198k0(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f32368b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void b(Context context) {
        try {
            if (this.f32369c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f32371e = applicationContext;
            if (applicationContext == null) {
                this.f32371e = context;
            }
            C8784lf.a(this.f32371e);
            this.f32370d = ((Boolean) Oc.A.c().a(C8784lf.f77010U3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) Oc.A.c().a(C8784lf.f76989Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f32371e.registerReceiver(this.f32367a, intentFilter);
            } else {
                this.f32371e.registerReceiver(this.f32367a, intentFilter, 4);
            }
            this.f32369c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f32370d) {
            this.f32368b.put(broadcastReceiver, intentFilter);
            return;
        }
        C8784lf.a(context);
        if (!((Boolean) Oc.A.c().a(C8784lf.f76989Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f32370d) {
            this.f32368b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
