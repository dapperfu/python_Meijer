package uc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f162884c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f162885a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f162886b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f162887a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<c> f162888b = new ArrayList();

        public d a() {
            return new d(this.f162887a, Collections.unmodifiableList(this.f162888b));
        }

        public a b(List<c> list) {
            this.f162888b = list;
            return this;
        }

        public a c(String str) {
            this.f162887a = str;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Ef.d(tag = 2)
    public List<c> a() {
        return this.f162886b;
    }

    @Ef.d(tag = 1)
    public String b() {
        return this.f162885a;
    }

    d(String str, List<c> list) {
        this.f162885a = str;
        this.f162886b = list;
    }
}
