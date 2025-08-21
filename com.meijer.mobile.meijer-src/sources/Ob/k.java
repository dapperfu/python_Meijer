package Ob;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class k implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private Long f23284a;

    /* renamed from: b, reason: collision with root package name */
    private Long f23285b;

    /* renamed from: c, reason: collision with root package name */
    private String f23286c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f23287d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f23288e;

    public k() {
    }

    public k(k kVar) {
        o(kVar.h());
        m(kVar.f());
        p(kVar.i());
        n(kVar.g());
        l(kVar.e());
    }

    public void a(long j10, String str) {
        Long l10 = this.f23284a;
        if (l10 == null) {
            o(Long.valueOf(j10));
            m(Long.valueOf(j10));
            p(str);
        } else if (j10 < l10.longValue()) {
            o(Long.valueOf(j10));
            p(str);
        } else if (j10 > this.f23285b.longValue()) {
            m(Long.valueOf(j10));
        }
        c();
    }

    public Integer e() {
        return this.f23288e;
    }

    public Long f() {
        return this.f23285b;
    }

    public Integer g() {
        return this.f23287d;
    }

    public Long h() {
        return this.f23284a;
    }

    public String i() {
        return this.f23286c;
    }

    void l(Integer num) {
        this.f23288e = num;
    }

    protected void m(Long l10) {
        this.f23285b = l10;
    }

    void n(Integer num) {
        this.f23287d = num;
    }

    protected void o(Long l10) {
        this.f23284a = l10;
    }

    protected void p(String str) {
        this.f23286c = str;
    }

    private int b(long j10, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j10);
        return (((((((calendar.get(7) + 5) % 7) * 24) + calendar.get(11)) * 60) + calendar.get(12)) * 60) + calendar.get(13);
    }

    private void c() {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(i());
        n(Integer.valueOf(b(h().longValue(), timeZone)));
        l(Integer.valueOf(b(f().longValue(), timeZone)));
    }

    public Long d() {
        if (k()) {
            return Long.valueOf(f().longValue() - h().longValue());
        }
        Integer numG = g();
        Integer numE = e();
        if (numG != null && numE != null) {
            return Long.valueOf((numE.intValue() - numG.intValue()) * 1000);
        }
        return null;
    }

    public Integer j() {
        if (i() == null) {
            return null;
        }
        return Integer.valueOf(DesugarTimeZone.getTimeZone(i()).getOffset(h().longValue()));
    }

    public boolean k() {
        if (h() != null && f() != null) {
            return true;
        }
        return false;
    }
}
