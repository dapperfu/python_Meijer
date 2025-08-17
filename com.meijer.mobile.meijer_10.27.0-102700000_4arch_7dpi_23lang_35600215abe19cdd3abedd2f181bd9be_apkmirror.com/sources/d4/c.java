package d4;

import Be.C2957c;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private int f127182f;

    /* renamed from: h, reason: collision with root package name */
    private int f127184h;

    /* renamed from: o, reason: collision with root package name */
    private float f127191o;

    /* renamed from: a, reason: collision with root package name */
    private String f127177a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f127178b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f127179c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f127180d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f127181e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f127183g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f127185i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f127186j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f127187k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f127188l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f127189m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f127190n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f127192p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f127193q = false;

    public c A(boolean z10) {
        this.f127187k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f127185i) {
            return this.f127184h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f127193q;
    }

    public int c() {
        if (this.f127183g) {
            return this.f127182f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f127181e;
    }

    public float e() {
        return this.f127191o;
    }

    public int f() {
        return this.f127190n;
    }

    public int g() {
        return this.f127192p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f127177a.isEmpty() && this.f127178b.isEmpty() && this.f127179c.isEmpty() && this.f127180d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f127177a, str, 1073741824), this.f127178b, str2, 2), this.f127180d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f127179c)) {
            return 0;
        }
        return iB + (this.f127179c.size() * 4);
    }

    public int i() {
        int i10 = this.f127188l;
        if (i10 == -1 && this.f127189m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f127189m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f127185i;
    }

    public boolean k() {
        return this.f127183g;
    }

    public boolean l() {
        return this.f127186j == 1;
    }

    public boolean m() {
        return this.f127187k == 1;
    }

    public c n(int i10) {
        this.f127184h = i10;
        this.f127185i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f127188l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f127193q = z10;
        return this;
    }

    public c q(int i10) {
        this.f127182f = i10;
        this.f127183g = true;
        return this;
    }

    public c r(String str) {
        this.f127181e = str == null ? null : C2957c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f127191o = f10;
        return this;
    }

    public c t(int i10) {
        this.f127190n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f127189m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f127192p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f127179c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f127177a = str;
    }

    public void y(String str) {
        this.f127178b = str;
    }

    public void z(String str) {
        this.f127180d = str;
    }

    private static int B(int i10, String str, String str2, int i11) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
    }
}
