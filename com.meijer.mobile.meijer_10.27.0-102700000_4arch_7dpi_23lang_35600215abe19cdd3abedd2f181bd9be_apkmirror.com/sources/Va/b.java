package Va;

/* loaded from: classes4.dex */
public class b implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f37005a;

    /* renamed from: b, reason: collision with root package name */
    private String f37006b;

    /* renamed from: c, reason: collision with root package name */
    private String f37007c;

    /* renamed from: d, reason: collision with root package name */
    private a f37008d;

    /* renamed from: e, reason: collision with root package name */
    private int f37009e;

    public enum a {
        LOW,
        MEDIUM_LOW,
        MEDIUM_HIGH,
        HIGH
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f37005a.equals(((b) obj).f37005a);
    }

    public String a() {
        return this.f37005a;
    }

    public String toString() {
        if (this.f37009e == Integer.MAX_VALUE) {
            return "Beacon [identifier=" + this.f37005a + ", name=" + this.f37006b + ", iconURL=" + this.f37007c + ", batteryLevel=" + this.f37008d + ", temperature=N/A]";
        }
        return "Beacon [identifier=" + this.f37005a + ", name=" + this.f37006b + ", iconURL=" + this.f37007c + ", batteryLevel=" + this.f37008d + ", temperature=" + this.f37009e + "]";
    }
}
