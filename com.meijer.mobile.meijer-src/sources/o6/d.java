package o6;

import java.util.List;
import q6.q;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List<q> f153642a;

    /* renamed from: b, reason: collision with root package name */
    private final char f153643b;

    /* renamed from: c, reason: collision with root package name */
    private final double f153644c;

    /* renamed from: d, reason: collision with root package name */
    private final double f153645d;

    /* renamed from: e, reason: collision with root package name */
    private final String f153646e;

    /* renamed from: f, reason: collision with root package name */
    private final String f153647f;

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f153642a;
    }

    public double b() {
        return this.f153645d;
    }

    public int hashCode() {
        return c(this.f153643b, this.f153647f, this.f153646e);
    }

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f153642a = list;
        this.f153643b = c10;
        this.f153644c = d10;
        this.f153645d = d11;
        this.f153646e = str;
        this.f153647f = str2;
    }
}
