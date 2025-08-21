package d4;

import De.C3106c;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private int f127984f;

    /* renamed from: h, reason: collision with root package name */
    private int f127986h;

    /* renamed from: o, reason: collision with root package name */
    private float f127993o;

    /* renamed from: a, reason: collision with root package name */
    private String f127979a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f127980b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f127981c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f127982d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f127983e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f127985g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f127987i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f127988j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f127989k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f127990l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f127991m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f127992n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f127994p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f127995q = false;

    public c A(boolean z10) {
        this.f127989k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f127987i) {
            return this.f127986h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f127995q;
    }

    public int c() {
        if (this.f127985g) {
            return this.f127984f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f127983e;
    }

    public float e() {
        return this.f127993o;
    }

    public int f() {
        return this.f127992n;
    }

    public int g() {
        return this.f127994p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f127979a.isEmpty() && this.f127980b.isEmpty() && this.f127981c.isEmpty() && this.f127982d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f127979a, str, 1073741824), this.f127980b, str2, 2), this.f127982d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f127981c)) {
            return 0;
        }
        return iB + (this.f127981c.size() * 4);
    }

    public int i() {
        int i10 = this.f127990l;
        if (i10 == -1 && this.f127991m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f127991m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f127987i;
    }

    public boolean k() {
        return this.f127985g;
    }

    public boolean l() {
        return this.f127988j == 1;
    }

    public boolean m() {
        return this.f127989k == 1;
    }

    public c n(int i10) {
        this.f127986h = i10;
        this.f127987i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f127990l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f127995q = z10;
        return this;
    }

    public c q(int i10) {
        this.f127984f = i10;
        this.f127985g = true;
        return this;
    }

    public c r(String str) {
        this.f127983e = str == null ? null : C3106c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f127993o = f10;
        return this;
    }

    public c t(int i10) {
        this.f127992n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f127991m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f127994p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f127981c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f127979a = str;
    }

    public void y(String str) {
        this.f127980b = str;
    }

    public void z(String str) {
        this.f127982d = str;
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
