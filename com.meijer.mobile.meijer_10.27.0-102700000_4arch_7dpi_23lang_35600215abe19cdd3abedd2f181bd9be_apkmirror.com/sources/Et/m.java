package Et;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f9856a;

    /* renamed from: b, reason: collision with root package name */
    private String f9857b;

    /* renamed from: c, reason: collision with root package name */
    public int f9858c;

    /* renamed from: d, reason: collision with root package name */
    private int f9859d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9860e;

    /* renamed from: f, reason: collision with root package name */
    public long f9861f;

    public m() {
    }

    public m(String str, String str2, int i10, int i11, long j10) {
        this.f9857b = str;
        this.f9856a = str2;
        this.f9860e = false;
        this.f9859d = i10;
        this.f9858c = i11;
        this.f9861f = j10;
    }

    public final String toString() {
        return "WifiHotspot [BSSID: " + this.f9856a + ", SSID: " + this.f9857b + ", connected: " + this.f9860e + ", frequency: " + this.f9859d + ", signalStrength: " + this.f9858c + ", timestamp: " + this.f9861f + "]";
    }
}
