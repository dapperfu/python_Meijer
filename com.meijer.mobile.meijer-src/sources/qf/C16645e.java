package qf;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: qf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16645e {

    /* renamed from: a, reason: collision with root package name */
    private final Float f158349a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f158350b;

    public static C16645e a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            nf.g.f().e("An error occurred getting battery state.", e10);
        }
        return new C16645e(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f158349a;
    }

    public int c() {
        Float f10;
        if (!this.f158350b || (f10 = this.f158349a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }

    private C16645e(Float f10, boolean z10) {
        this.f158350b = z10;
        this.f158349a = f10;
    }
}
