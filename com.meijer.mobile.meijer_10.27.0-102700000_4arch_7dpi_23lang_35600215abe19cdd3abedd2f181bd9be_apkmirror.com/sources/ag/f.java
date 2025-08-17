package ag;

import android.os.Bundle;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Uf.a f45445b = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f45446a;

    public f() {
        this(new Bundle());
    }

    public f(Bundle bundle) {
        this.f45446a = (Bundle) bundle.clone();
    }

    public boolean a(String str) {
        return str != null && this.f45446a.containsKey(str);
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f45446a.get(str));
        } catch (ClassCastException e10) {
            f45445b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f45446a.get(str));
        } catch (ClassCastException e10) {
            f45445b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Double> c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f45446a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f45445b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g<Long> e(String str) {
        if (d(str).d()) {
            return g.e(Long.valueOf(r3.c().intValue()));
        }
        return g.a();
    }
}
