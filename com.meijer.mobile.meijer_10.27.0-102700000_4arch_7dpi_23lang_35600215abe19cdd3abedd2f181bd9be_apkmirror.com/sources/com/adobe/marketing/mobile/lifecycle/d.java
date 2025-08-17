package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
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
    private final DateFormat f62559a = new SimpleDateFormat("M/d/yyyy", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f62560b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5078j f62561c;

    /* renamed from: d, reason: collision with root package name */
    private final Q5.v f62562d;

    /* renamed from: e, reason: collision with root package name */
    private final long f62563e;

    d a() {
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding core data to lifecycle data map", new Object[0]);
        InterfaceC5078j interfaceC5078j = this.f62561c;
        if (interfaceC5078j != null) {
            String strQ = interfaceC5078j.q();
            if (!f6.i.a(strQ)) {
                this.f62560b.put("devicename", strQ);
            }
            String strL = this.f62561c.l();
            if (!f6.i.a(strL)) {
                this.f62560b.put("carriername", strL);
            }
            String strJ = j();
            if (!f6.i.a(strJ)) {
                this.f62560b.put("appid", strJ);
            }
            String str = this.f62561c.b() + " " + this.f62561c.d();
            if (!f6.i.a(str)) {
                this.f62560b.put("osversion", str);
            }
            String strK = k();
            if (!f6.i.a(strK)) {
                this.f62560b.put("resolution", strK);
            }
            String strC = h.c(this.f62561c.v());
            if (!f6.i.a(strC)) {
                this.f62560b.put("locale", strC);
            }
            String strC2 = h.c(this.f62561c.i());
            if (!f6.i.a(strC2)) {
                this.f62560b.put("systemlocale", strC2);
            }
            String strK2 = this.f62561c.k();
            if (!f6.i.a(strK2)) {
                this.f62560b.put("runmode", strK2);
            }
        }
        return this;
    }

    d b(boolean z10) {
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding crash data to lifecycle data map", new Object[0]);
        if (z10) {
            this.f62560b.put("crashevent", "CrashEvent");
        }
        return this;
    }

    d c() {
        int i10;
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding generic data to the lifecycle data map", new Object[0]);
        Q5.v vVar = this.f62562d;
        if (vVar != null && (i10 = vVar.getInt("Launches", -1)) != -1) {
            this.f62560b.put("launches", Integer.toString(i10));
        }
        Calendar calendarI = i(this.f62563e);
        this.f62560b.put("dayofweek", Integer.toString(calendarI.get(7)));
        this.f62560b.put("hourofday", Integer.toString(calendarI.get(11)));
        this.f62560b.put("launchevent", "LaunchEvent");
        return this;
    }

    d d() {
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding install data to lifecycle data map", new Object[0]);
        this.f62560b.put("dailyenguserevent", "DailyEngUserEvent");
        this.f62560b.put("monthlyenguserevent", "MonthlyEngUserEvent");
        this.f62560b.put("installevent", "InstallEvent");
        this.f62560b.put("installdate", l(this.f62563e));
        return this;
    }

    d e() {
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding launch data to the lifecycle data map", new Object[0]);
        Q5.v vVar = this.f62562d;
        if (vVar != null) {
            long j10 = vVar.getLong("LastDateUsed", 0L);
            long j11 = this.f62562d.getLong("InstallDate", 0L);
            Calendar calendarI = i(this.f62563e);
            Calendar calendarI2 = i(j10);
            int iH = h(j10, this.f62563e);
            int iH2 = h(j11, this.f62563e);
            if (calendarI.get(2) != calendarI2.get(2) || calendarI.get(1) != calendarI2.get(1)) {
                this.f62560b.put("dailyenguserevent", "DailyEngUserEvent");
                this.f62560b.put("monthlyenguserevent", "MonthlyEngUserEvent");
            } else if (calendarI.get(5) != calendarI2.get(5)) {
                this.f62560b.put("dailyenguserevent", "DailyEngUserEvent");
            }
            if (iH >= 0) {
                this.f62560b.put("dayssincelastuse", Integer.toString(iH));
            }
            if (iH2 >= 0) {
                this.f62560b.put("dayssincefirstuse", Integer.toString(iH2));
            }
        }
        return this;
    }

    d f(boolean z10) {
        Q5.t.e("Lifecycle", "LifecycleMetricsBuilder", "Adding upgrade data to lifecycle data map", new Object[0]);
        if (z10) {
            this.f62560b.put("upgradeevent", "UpgradeEvent");
        }
        Q5.v vVar = this.f62562d;
        if (vVar != null) {
            long j10 = vVar.getLong("UpgradeDate", 0L);
            if (z10) {
                this.f62562d.b("UpgradeDate", this.f62563e);
                this.f62562d.c("LaunchesAfterUpgrade", 0);
                return this;
            }
            if (j10 > 0) {
                int iH = h(j10, this.f62563e);
                int i10 = this.f62562d.getInt("LaunchesAfterUpgrade", 0) + 1;
                this.f62562d.c("LaunchesAfterUpgrade", i10);
                this.f62560b.put("launchessinceupgrade", Integer.toString(i10));
                if (iH >= 0) {
                    this.f62560b.put("dayssincelastupgrade", Integer.toString(iH));
                }
            }
        }
        return this;
    }

    private int h(long j10, long j11) {
        long j12 = a.f62556b;
        if (j10 < j12 || j11 < j12) {
            Q5.t.a("Lifecycle", "LifecycleMetricsBuilder", "Invalid timestamp - startTimestampInSeconds (%d), endTimestampInSeconds (%d)", Long.valueOf(j10), Long.valueOf(j11));
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
        InterfaceC5078j interfaceC5078j = this.f62561c;
        if (interfaceC5078j == null) {
            return null;
        }
        String strC = interfaceC5078j.c();
        String strG = this.f62561c.g();
        String strR = this.f62561c.r();
        return String.format("%s%s%s", strC, !f6.i.a(strG) ? String.format(" %s", strG) : "", f6.i.a(strR) ? "" : String.format(" (%s)", strR));
    }

    private String k() {
        InterfaceC5078j interfaceC5078j = this.f62561c;
        if (interfaceC5078j == null) {
            return null;
        }
        InterfaceC5078j.b bVarN = interfaceC5078j.n();
        if (bVarN != null) {
            return String.format(Locale.US, "%dx%d", Integer.valueOf(bVarN.b()), Integer.valueOf(bVarN.a()));
        }
        Q5.t.a("Lifecycle", "LifecycleMetricsBuilder", "Failed to get resolution %s for DisplayInformation", "Unexpected Null Value");
        return null;
    }

    private String l(long j10) {
        String str;
        synchronized (this.f62559a) {
            str = this.f62559a.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j10)));
        }
        return str;
    }

    Map<String, String> g() {
        return this.f62560b;
    }

    d(InterfaceC5078j interfaceC5078j, Q5.v vVar, long j10) {
        this.f62561c = interfaceC5078j;
        this.f62562d = vVar;
        this.f62563e = j10;
        if (vVar == null) {
            Q5.t.a("Lifecycle", "LifecycleMetricsBuilder", "%s (Data Store), while creating LifecycleExtension Metrics Builder.", "Unexpected Null Value");
        }
        if (interfaceC5078j == null) {
            Q5.t.a("Lifecycle", "LifecycleMetricsBuilder", "%s (Device Info Services), while creating LifecycleExtension Metrics Builder", "Unexpected Null Value");
        }
    }

    private Calendar i(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(j10));
        return calendar;
    }
}
