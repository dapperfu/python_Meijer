package Bb;

import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class a implements Nb.a {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f2113e = C6381b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private int f2114a;

    /* renamed from: b, reason: collision with root package name */
    private int f2115b;

    /* renamed from: c, reason: collision with root package name */
    private int f2116c;

    /* renamed from: d, reason: collision with root package name */
    private int f2117d;

    public a() {
    }

    public a(String str) {
        if (str == null || str.length() == 0 || !str.contains("-") || !str.contains(":")) {
            return;
        }
        String[] strArrSplit = str.trim().split("-");
        String[] strArrSplit2 = strArrSplit[0].split(":");
        String[] strArrSplit3 = strArrSplit[1].split(":");
        this.f2114a = Integer.parseInt(strArrSplit2[0]);
        this.f2116c = Integer.parseInt(strArrSplit2[1]);
        this.f2115b = Integer.parseInt(strArrSplit3[0]);
        this.f2117d = Integer.parseInt(strArrSplit3[1]);
    }

    public int a() {
        return this.f2115b;
    }

    public int b() {
        return this.f2117d;
    }

    public int c() {
        return this.f2114a;
    }

    public int d() {
        return this.f2116c;
    }

    public String toString() {
        return "ThirdPartyScanSchedule [startHour=" + this.f2114a + ", endHour=" + this.f2115b + ", startMinute=" + this.f2116c + ", endMinute=" + this.f2117d + "]";
    }
}
