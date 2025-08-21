package wc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f167093c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f167094a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f167095b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f167096a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f167097b = new ArrayList();

        public d a() {
            return new d(this.f167096a, Collections.unmodifiableList(this.f167097b));
        }

        public a b(List<c> list) {
            this.f167097b = list;
            return this;
        }

        public a c(String str) {
            this.f167096a = str;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Gf.d(tag = 2)
    public List<c> a() {
        return this.f167095b;
    }

    @Gf.d(tag = 1)
    public String b() {
        return this.f167094a;
    }

    d(String str, List<c> list) {
        this.f167094a = str;
        this.f167095b = list;
    }
}
