package Xa;

/* loaded from: classes4.dex */
public class b implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f41717a;

    /* renamed from: b, reason: collision with root package name */
    private String f41718b;

    /* renamed from: c, reason: collision with root package name */
    private String f41719c;

    /* renamed from: d, reason: collision with root package name */
    private a f41720d;

    /* renamed from: e, reason: collision with root package name */
    private int f41721e;

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
        return obj != null && getClass() == obj.getClass() && this.f41717a.equals(((b) obj).f41717a);
    }

    public String a() {
        return this.f41717a;
    }

    public String toString() {
        if (this.f41721e == Integer.MAX_VALUE) {
            return "Beacon [identifier=" + this.f41717a + ", name=" + this.f41718b + ", iconURL=" + this.f41719c + ", batteryLevel=" + this.f41720d + ", temperature=N/A]";
        }
        return "Beacon [identifier=" + this.f41717a + ", name=" + this.f41718b + ", iconURL=" + this.f41719c + ", batteryLevel=" + this.f41720d + ", temperature=" + this.f41721e + "]";
    }
}
