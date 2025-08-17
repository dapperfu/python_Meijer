package Et;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class o implements Dt.h {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f9869b = C6381b.a(o.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final C6382c f9870c = C6383d.a(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f9871a;

    @Override // Dt.h
    public final List<m> a() {
        List<ScanResult> scanResults;
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f9871a.isWifiEnabled() && (scanResults = this.f9871a.getScanResults()) != null) {
                for (ScanResult scanResult : scanResults) {
                    arrayList.add(new m(scanResult.SSID, scanResult.BSSID, scanResult.frequency, scanResult.level, System.currentTimeMillis()));
                }
            }
            return arrayList;
        } catch (Exception e10) {
            f9870c.f("Wifi hotspot matching failed: ", e10);
            return arrayList;
        }
    }

    public o(WifiManager wifiManager) {
        this.f9871a = wifiManager;
    }
}
