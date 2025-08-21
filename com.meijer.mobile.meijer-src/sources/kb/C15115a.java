package kb;

import Db.b;
import Nb.c;
import Nb.s;
import android.app.AlarmManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import eb.C13784a;
import eb.C13785b;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15115a {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f141753e = C13785b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public Context f141754a;

    /* renamed from: b, reason: collision with root package name */
    private c f141755b;

    /* renamed from: c, reason: collision with root package name */
    private s f141756c;

    /* renamed from: d, reason: collision with root package name */
    private b f141757d;

    public final LocationManager a() {
        try {
            if (this.f141755b.b()) {
                return (LocationManager) this.f141754a.getSystemService("location");
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public final PowerManager b() {
        return (PowerManager) this.f141754a.getSystemService("power");
    }

    public final WifiManager c() {
        return (WifiManager) this.f141754a.getSystemService("wifi");
    }

    public final AlarmManager d() {
        return (AlarmManager) this.f141754a.getSystemService("alarm");
    }

    public final BluetoothManager e() {
        if (this.f141756c.e()) {
            try {
                if (this.f141755b.b()) {
                    return (BluetoothManager) this.f141754a.getSystemService("bluetooth");
                }
                return null;
            } catch (SecurityException unused) {
            }
        } else if (this.f141756c.b(this.f141757d.l())) {
            return (BluetoothManager) this.f141754a.getSystemService("bluetooth");
        }
        return null;
    }

    public C15115a(Context context, c cVar, s sVar, b bVar) {
        this.f141754a = context;
        this.f141755b = cVar;
        this.f141756c = sVar;
        this.f141757d = bVar;
    }
}
