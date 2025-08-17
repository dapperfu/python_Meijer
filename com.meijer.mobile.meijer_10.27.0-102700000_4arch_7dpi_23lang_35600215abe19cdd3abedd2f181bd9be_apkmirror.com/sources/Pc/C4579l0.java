package Pc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.C8659lf;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: Pc.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4579l0 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f25156d;

    /* renamed from: e, reason: collision with root package name */
    private Context f25157e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25155c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25154b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f25153a = new C4577k0(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f25154b.entrySet()) {
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
            if (this.f25155c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f25157e = applicationContext;
            if (applicationContext == null) {
                this.f25157e = context;
            }
            C8659lf.a(this.f25157e);
            this.f25156d = ((Boolean) Mc.A.c().a(C8659lf.f76170U3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) Mc.A.c().a(C8659lf.f76149Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f25157e.registerReceiver(this.f25153a, intentFilter);
            } else {
                this.f25157e.registerReceiver(this.f25153a, intentFilter, 4);
            }
            this.f25155c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f25156d) {
            this.f25154b.put(broadcastReceiver, intentFilter);
            return;
        }
        C8659lf.a(context);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76149Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f25156d) {
            this.f25154b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
