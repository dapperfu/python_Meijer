package Gc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: f, reason: collision with root package name */
    public static final List f11346f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f11347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11348b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11349c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11350d;

    /* renamed from: e, reason: collision with root package name */
    private final b f11351e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f11352a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f11353b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f11354c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f11355d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f11356e = b.DEFAULT;

        public o a() {
            return new o(this.f11352a, this.f11353b, this.f11354c, this.f11355d, this.f11356e, null);
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f11361a;

        public int a() {
            return this.f11361a;
        }

        b(int i10) {
            this.f11361a = i10;
        }
    }

    public String a() {
        String str = this.f11349c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f11351e;
    }

    public int c() {
        return this.f11347a;
    }

    public int d() {
        return this.f11348b;
    }

    public List<String> e() {
        return new ArrayList(this.f11350d);
    }

    /* synthetic */ o(int i10, int i11, String str, List list, b bVar, v vVar) {
        this.f11347a = i10;
        this.f11348b = i11;
        this.f11349c = str;
        this.f11350d = list;
        this.f11351e = bVar;
    }
}
