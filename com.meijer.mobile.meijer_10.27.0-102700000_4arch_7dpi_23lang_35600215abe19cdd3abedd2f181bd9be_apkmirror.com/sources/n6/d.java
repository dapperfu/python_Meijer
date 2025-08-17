package n6;

import java.util.List;
import p6.q;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List<q> f151040a;

    /* renamed from: b, reason: collision with root package name */
    private final char f151041b;

    /* renamed from: c, reason: collision with root package name */
    private final double f151042c;

    /* renamed from: d, reason: collision with root package name */
    private final double f151043d;

    /* renamed from: e, reason: collision with root package name */
    private final String f151044e;

    /* renamed from: f, reason: collision with root package name */
    private final String f151045f;

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f151040a;
    }

    public double b() {
        return this.f151043d;
    }

    public int hashCode() {
        return c(this.f151041b, this.f151045f, this.f151044e);
    }

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f151040a = list;
        this.f151041b = c10;
        this.f151042c = d10;
        this.f151043d = d11;
        this.f151044e = str;
        this.f151045f = str2;
    }
}
