package ib;

import Bb.b;
import Lb.c;
import Lb.s;
import android.app.AlarmManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import cb.C6380a;
import cb.C6381b;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14712a {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f137664e = C6381b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public Context f137665a;

    /* renamed from: b, reason: collision with root package name */
    private c f137666b;

    /* renamed from: c, reason: collision with root package name */
    private s f137667c;

    /* renamed from: d, reason: collision with root package name */
    private b f137668d;

    public final LocationManager a() {
        try {
            if (this.f137666b.b()) {
                return (LocationManager) this.f137665a.getSystemService("location");
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public final PowerManager b() {
        return (PowerManager) this.f137665a.getSystemService("power");
    }

    public final WifiManager c() {
        return (WifiManager) this.f137665a.getSystemService("wifi");
    }

    public final AlarmManager d() {
        return (AlarmManager) this.f137665a.getSystemService("alarm");
    }

    public final BluetoothManager e() {
        if (this.f137667c.e()) {
            try {
                if (this.f137666b.b()) {
                    return (BluetoothManager) this.f137665a.getSystemService("bluetooth");
                }
                return null;
            } catch (SecurityException unused) {
            }
        } else if (this.f137667c.b(this.f137668d.l())) {
            return (BluetoothManager) this.f137665a.getSystemService("bluetooth");
        }
        return null;
    }

    public C14712a(Context context, c cVar, s sVar, b bVar) {
        this.f137665a = context;
        this.f137666b = cVar;
        this.f137667c = sVar;
        this.f137668d = bVar;
    }
}
