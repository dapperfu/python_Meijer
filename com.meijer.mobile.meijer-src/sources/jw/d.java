package jw;

import java.io.IOException;

/* loaded from: classes14.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Appendable f141299a;

    public d() {
        this(new StringBuilder());
    }

    public d(Appendable appendable) {
        this.f141299a = appendable;
    }

    public static String l(c cVar) {
        return new d().e(cVar).toString();
    }

    @Override // jw.a
    protected void c(char c10) throws IOException {
        try {
            this.f141299a.append(c10);
        } catch (IOException e10) {
            throw new RuntimeException("Could not write description", e10);
        }
    }

    @Override // jw.a
    protected void d(String str) throws IOException {
        try {
            this.f141299a.append(str);
        } catch (IOException e10) {
            throw new RuntimeException("Could not write description", e10);
        }
    }

    public String toString() {
        return this.f141299a.toString();
    }

    public static String k(c cVar) {
        return l(cVar);
    }
}
