package Ec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: f, reason: collision with root package name */
    public static final List f7794f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f7795a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7796b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7797c;

    /* renamed from: d, reason: collision with root package name */
    private final List f7798d;

    /* renamed from: e, reason: collision with root package name */
    private final b f7799e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f7800a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f7801b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f7802c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f7803d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f7804e = b.DEFAULT;

        public o a() {
            return new o(this.f7800a, this.f7801b, this.f7802c, this.f7803d, this.f7804e, null);
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f7809a;

        public int a() {
            return this.f7809a;
        }

        b(int i10) {
            this.f7809a = i10;
        }
    }

    public String a() {
        String str = this.f7797c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f7799e;
    }

    public int c() {
        return this.f7795a;
    }

    public int d() {
        return this.f7796b;
    }

    public List<String> e() {
        return new ArrayList(this.f7798d);
    }

    /* synthetic */ o(int i10, int i11, String str, List list, b bVar, v vVar) {
        this.f7795a = i10;
        this.f7796b = i11;
        this.f7797c = str;
        this.f7798d = list;
        this.f7799e = bVar;
    }
}
