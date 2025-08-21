package Et;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f8568a;

    /* renamed from: b, reason: collision with root package name */
    private String f8569b;

    /* renamed from: c, reason: collision with root package name */
    public int f8570c;

    /* renamed from: d, reason: collision with root package name */
    private int f8571d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8572e;

    /* renamed from: f, reason: collision with root package name */
    public long f8573f;

    public m() {
    }

    public m(String str, String str2, int i10, int i11, long j10) {
        this.f8569b = str;
        this.f8568a = str2;
        this.f8572e = false;
        this.f8571d = i10;
        this.f8570c = i11;
        this.f8573f = j10;
    }

    public final String toString() {
        return "WifiHotspot [BSSID: " + this.f8568a + ", SSID: " + this.f8569b + ", connected: " + this.f8572e + ", frequency: " + this.f8571d + ", signalStrength: " + this.f8570c + ", timestamp: " + this.f8573f + "]";
    }
}
