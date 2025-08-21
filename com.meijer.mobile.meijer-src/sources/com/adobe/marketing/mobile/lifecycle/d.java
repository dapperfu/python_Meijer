package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f63398a = new SimpleDateFormat("M/d/yyyy", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f63399b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5123j f63400c;

    /* renamed from: d, reason: collision with root package name */
    private final R5.v f63401d;

    /* renamed from: e, reason: collision with root package name */
    private final long f63402e;

    d a() {
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding core data to lifecycle data map", new Object[0]);
        InterfaceC5123j interfaceC5123j = this.f63400c;
        if (interfaceC5123j != null) {
            String strQ = interfaceC5123j.q();
            if (!g6.i.a(strQ)) {
                this.f63399b.put("devicename", strQ);
            }
            String strL = this.f63400c.l();
            if (!g6.i.a(strL)) {
                this.f63399b.put("carriername", strL);
            }
            String strJ = j();
            if (!g6.i.a(strJ)) {
                this.f63399b.put("appid", strJ);
            }
            String str = this.f63400c.b() + " " + this.f63400c.d();
            if (!g6.i.a(str)) {
                this.f63399b.put("osversion", str);
            }
            String strK = k();
            if (!g6.i.a(strK)) {
                this.f63399b.put("resolution", strK);
            }
            String strC = h.c(this.f63400c.v());
            if (!g6.i.a(strC)) {
                this.f63399b.put("locale", strC);
            }
            String strC2 = h.c(this.f63400c.i());
            if (!g6.i.a(strC2)) {
                this.f63399b.put("systemlocale", strC2);
            }
            String strK2 = this.f63400c.k();
            if (!g6.i.a(strK2)) {
                this.f63399b.put("runmode", strK2);
            }
        }
        return this;
    }

    d b(boolean z10) {
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding crash data to lifecycle data map", new Object[0]);
        if (z10) {
            this.f63399b.put("crashevent", "CrashEvent");
        }
        return this;
    }

    d c() {
        int i10;
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding generic data to the lifecycle data map", new Object[0]);
        R5.v vVar = this.f63401d;
        if (vVar != null && (i10 = vVar.getInt("Launches", -1)) != -1) {
            this.f63399b.put("launches", Integer.toString(i10));
        }
        Calendar calendarI = i(this.f63402e);
        this.f63399b.put("dayofweek", Integer.toString(calendarI.get(7)));
        this.f63399b.put("hourofday", Integer.toString(calendarI.get(11)));
        this.f63399b.put("launchevent", "LaunchEvent");
        return this;
    }

    d d() {
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding install data to lifecycle data map", new Object[0]);
        this.f63399b.put("dailyenguserevent", "DailyEngUserEvent");
        this.f63399b.put("monthlyenguserevent", "MonthlyEngUserEvent");
        this.f63399b.put("installevent", "InstallEvent");
        this.f63399b.put("installdate", l(this.f63402e));
        return this;
    }

    d e() {
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding launch data to the lifecycle data map", new Object[0]);
        R5.v vVar = this.f63401d;
        if (vVar != null) {
            long j10 = vVar.getLong("LastDateUsed", 0L);
            long j11 = this.f63401d.getLong("InstallDate", 0L);
            Calendar calendarI = i(this.f63402e);
            Calendar calendarI2 = i(j10);
            int iH = h(j10, this.f63402e);
            int iH2 = h(j11, this.f63402e);
            if (calendarI.get(2) != calendarI2.get(2) || calendarI.get(1) != calendarI2.get(1)) {
                this.f63399b.put("dailyenguserevent", "DailyEngUserEvent");
                this.f63399b.put("monthlyenguserevent", "MonthlyEngUserEvent");
            } else if (calendarI.get(5) != calendarI2.get(5)) {
                this.f63399b.put("dailyenguserevent", "DailyEngUserEvent");
            }
            if (iH >= 0) {
                this.f63399b.put("dayssincelastuse", Integer.toString(iH));
            }
            if (iH2 >= 0) {
                this.f63399b.put("dayssincefirstuse", Integer.toString(iH2));
            }
        }
        return this;
    }

    d f(boolean z10) {
        R5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding upgrade data to lifecycle data map", new Object[0]);
        if (z10) {
            this.f63399b.put("upgradeevent", "UpgradeEvent");
        }
        R5.v vVar = this.f63401d;
        if (vVar != null) {
            long j10 = vVar.getLong("UpgradeDate", 0L);
            if (z10) {
                this.f63401d.b("UpgradeDate", this.f63402e);
                this.f63401d.c("LaunchesAfterUpgrade", 0);
                return this;
            }
            if (j10 > 0) {
                int iH = h(j10, this.f63402e);
                int i10 = this.f63401d.getInt("LaunchesAfterUpgrade", 0) + 1;
                this.f63401d.c("LaunchesAfterUpgrade", i10);
                this.f63399b.put("launchessinceupgrade", Integer.toString(i10));
                if (iH >= 0) {
                    this.f63399b.put("dayssincelastupgrade", Integer.toString(iH));
                }
            }
        }
        return this;
    }

    private int h(long j10, long j11) {
        long j12 = a.f63395b;
        if (j10 < j12 || j11 < j12) {
            R5.t.a("Lifecycle", "LifecycleMetricsBuilder", "Invalid timestamp - startTimestampInSeconds (%d), endTimestampInSeconds (%d)", Long.valueOf(j10), Long.valueOf(j11));
            return -1;
        }
        Calendar calendarI = i(j10);
        Calendar calendarI2 = i(j11);
        int i10 = calendarI2.get(1) - calendarI.get(1);
        int i11 = calendarI2.get(6) - calendarI.get(6);
        int i12 = calendarI2.get(1);
        if (i10 == 0) {
            return i11;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int i13 = 0;
        for (int i14 = calendarI.get(1); i14 < i12; i14++) {
            i13 = gregorianCalendar.isLeapYear(i14) ? i13 + 366 : i13 + 365;
        }
        return i11 + i13;
    }

    private String j() {
        InterfaceC5123j interfaceC5123j = this.f63400c;
        if (interfaceC5123j == null) {
            return null;
        }
        String strC = interfaceC5123j.c();
        String strG = this.f63400c.g();
        String strR = this.f63400c.r();
        return String.format("%s%s%s", strC, !g6.i.a(strG) ? String.format(" %s", strG) : "", g6.i.a(strR) ? "" : String.format(" (%s)", strR));
    }

    private String k() {
        InterfaceC5123j interfaceC5123j = this.f63400c;
        if (interfaceC5123j == null) {
            return null;
        }
        InterfaceC5123j.b bVarN = interfaceC5123j.n();
        if (bVarN != null) {
            return String.format(Locale.US, "%dx%d", Integer.valueOf(bVarN.b()), Integer.valueOf(bVarN.a()));
        }
        R5.t.a("Lifecycle", "LifecycleMetricsBuilder", "Failed to get resolution %s for DisplayInformation", "Unexpected Null Value");
        return null;
    }

    private String l(long j10) {
        String str;
        synchronized (this.f63398a) {
            str = this.f63398a.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j10)));
        }
        return str;
    }

    Map<String, String> g() {
        return this.f63399b;
    }

    d(InterfaceC5123j interfaceC5123j, R5.v vVar, long j10) {
        this.f63400c = interfaceC5123j;
        this.f63401d = vVar;
        this.f63402e = j10;
        if (vVar == null) {
            R5.t.a("Lifecycle", "LifecycleMetricsBuilder", "%s (Data Store), while creating LifecycleExtension Metrics Builder.", "Unexpected Null Value");
        }
        if (interfaceC5123j == null) {
            R5.t.a("Lifecycle", "LifecycleMetricsBuilder", "%s (Device Info Services), while creating LifecycleExtension Metrics Builder", "Unexpected Null Value");
        }
    }

    private Calendar i(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(j10));
        return calendar;
    }
}
