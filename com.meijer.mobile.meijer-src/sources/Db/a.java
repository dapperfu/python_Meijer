package Db;

import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class a implements Pb.a {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f6058e = C13785b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private int f6059a;

    /* renamed from: b, reason: collision with root package name */
    private int f6060b;

    /* renamed from: c, reason: collision with root package name */
    private int f6061c;

    /* renamed from: d, reason: collision with root package name */
    private int f6062d;

    public a() {
    }

    public a(String str) {
        if (str == null || str.length() == 0 || !str.contains("-") || !str.contains(":")) {
            return;
        }
        String[] strArrSplit = str.trim().split("-");
        String[] strArrSplit2 = strArrSplit[0].split(":");
        String[] strArrSplit3 = strArrSplit[1].split(":");
        this.f6059a = Integer.parseInt(strArrSplit2[0]);
        this.f6061c = Integer.parseInt(strArrSplit2[1]);
        this.f6060b = Integer.parseInt(strArrSplit3[0]);
        this.f6062d = Integer.parseInt(strArrSplit3[1]);
    }

    public int a() {
        return this.f6060b;
    }

    public int b() {
        return this.f6062d;
    }

    public int c() {
        return this.f6059a;
    }

    public int d() {
        return this.f6061c;
    }

    public String toString() {
        return "ThirdPartyScanSchedule [startHour=" + this.f6059a + ", endHour=" + this.f6060b + ", startMinute=" + this.f6061c + ", endMinute=" + this.f6062d + "]";
    }
}
