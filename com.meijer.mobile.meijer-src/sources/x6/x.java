package x6;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: f, reason: collision with root package name */
    private static final String f170604f = x.class.toString();

    /* renamed from: b, reason: collision with root package name */
    private final Application f170606b;

    /* renamed from: d, reason: collision with root package name */
    private a f170608d;

    /* renamed from: a, reason: collision with root package name */
    String[] f170605a = null;

    /* renamed from: c, reason: collision with root package name */
    String f170607c = null;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f170609e = Boolean.TRUE;

    public interface a {
        void a();
    }

    @JavascriptInterface
    public String adbStatus() {
        try {
            return String.valueOf(T.a(this.f170606b));
        } catch (Exception e10) {
            C18095A.a(e10);
            return "-1";
        }
    }

    @JavascriptInterface
    public String androidId() {
        return T.e(this.f170606b);
    }

    @JavascriptInterface
    public String appIdentifier() {
        return this.f170606b.getPackageName();
    }

    @JavascriptInterface
    public String buildId() {
        return Build.ID;
    }

    @JavascriptInterface
    public String carrierName() {
        return "-1";
    }

    @JavascriptInterface
    public String cpuABI() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr.length > 0 ? strArr[0] : "Default_ABI";
    }

    @JavascriptInterface
    public String defaultBuildFingerPrintProperties() throws InterruptedException, IOException {
        String strA = a("getprop ro.build.fingerprint");
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public String deviceProperties() throws InterruptedException, IOException {
        String strA = a("getprop");
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public void done() {
        this.f170608d.a();
    }

    @JavascriptInterface
    public String getServerSignals() {
        return C18127w.f170597a + ", " + sdkVersion() + ", " + androidId() + ", " + buildId() + ", " + systemVersion() + ", " + model() + ", " + host();
    }

    @JavascriptInterface
    public String hardWareType() {
        return S.c(Build.HARDWARE);
    }

    @JavascriptInterface
    public String host() {
        return Build.HOST;
    }

    @JavascriptInterface
    public String isDebugEnabled() {
        try {
            return Settings.Secure.getInt(this.f170606b.getContentResolver(), "adb_enabled", 0) == 1 ? "true" : "false";
        } catch (Exception e10) {
            C18095A.a(e10);
            return "debug";
        }
    }

    @JavascriptInterface
    public String model() {
        return Build.MODEL;
    }

    @JavascriptInterface
    public String mountFileProperties() throws InterruptedException, IOException {
        String strA = a("cat /proc/mounts");
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public String qemuProperties() throws InterruptedException, IOException {
        String strA = a("getprop ro.kernel.qemu");
        return strA == null ? "default-qemu" : strA;
    }

    @JavascriptInterface
    public String screenHeight() {
        return String.valueOf(this.f170606b.getResources().getDisplayMetrics().heightPixels);
    }

    @JavascriptInterface
    public String screenWidth() {
        return String.valueOf(this.f170606b.getResources().getDisplayMetrics().widthPixels);
    }

    @JavascriptInterface
    public String sdkVersion() {
        return "3.3.9";
    }

    @JavascriptInterface
    public void setOrder(String str) {
        if (str != null) {
            try {
                if (str.contains(",")) {
                    this.f170605a = str.split(",");
                }
            } catch (Exception e10) {
                this.f170605a = null;
                C18095A.a(e10);
            }
        }
    }

    @JavascriptInterface
    public void setSignal(String str) {
        this.f170607c = str;
        done();
    }

    @JavascriptInterface
    public String startTime() {
        return Long.toString(C18127w.f170597a);
    }

    @JavascriptInterface
    public String systemVersion() {
        return Build.VERSION.RELEASE;
    }

    public x(Application application, a aVar) {
        this.f170606b = application;
        this.f170608d = aVar;
    }

    private static String a(String str) throws InterruptedException, IOException {
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line + "\n");
                } else {
                    return sb2.toString();
                }
            }
        } catch (Exception e10) {
            C18095A.a(e10);
            return null;
        }
    }

    @JavascriptInterface
    public void setDCIDisabled(Boolean bool) {
        this.f170609e = Boolean.valueOf(!bool.booleanValue());
    }
}
