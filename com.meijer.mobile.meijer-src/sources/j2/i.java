package j2;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f139766b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final j f139767a;

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f139768a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return f139766b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f139767a.get(i10);
    }

    public boolean e() {
        return this.f139767a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f139767a.equals(((i) obj).f139767a);
    }

    public int f() {
        return this.f139767a.size();
    }

    public String g() {
        return this.f139767a.a();
    }

    public Object h() {
        return this.f139767a.b();
    }

    public int hashCode() {
        return this.f139767a.hashCode();
    }

    public String toString() {
        return this.f139767a.toString();
    }

    private i(j jVar) {
        this.f139767a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }
}
