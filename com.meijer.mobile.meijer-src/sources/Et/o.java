package Et;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class o implements Dt.h {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f8581b = C13785b.a(o.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final C13786c f8582c = C13787d.a(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f8583a;

    @Override // Dt.h
    public final List<m> a() {
        List<ScanResult> scanResults;
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f8583a.isWifiEnabled() && (scanResults = this.f8583a.getScanResults()) != null) {
                for (ScanResult scanResult : scanResults) {
                    arrayList.add(new m(scanResult.SSID, scanResult.BSSID, scanResult.frequency, scanResult.level, System.currentTimeMillis()));
                }
            }
            return arrayList;
        } catch (Exception e10) {
            f8582c.f("Wifi hotspot matching failed: ", e10);
            return arrayList;
        }
    }

    public o(WifiManager wifiManager) {
        this.f8583a = wifiManager;
    }
}
