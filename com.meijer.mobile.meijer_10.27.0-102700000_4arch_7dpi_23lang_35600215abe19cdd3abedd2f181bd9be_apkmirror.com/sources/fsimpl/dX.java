package fsimpl;

import com.fullstory.instrumentation.BuildConfig;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public class dX {

    /* renamed from: g, reason: collision with root package name */
    private static final C14101fs f132035g = new C14101fs(1, 62, 0, BuildConfig.PLUGIN_SUFFIX_VERSION);

    /* renamed from: h, reason: collision with root package name */
    private final C14049du f132042h;

    /* renamed from: i, reason: collision with root package name */
    private final C14030da f132043i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f132044j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f132045k;

    /* renamed from: l, reason: collision with root package name */
    private final C14101fs f132046l;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList[] f132036a = n();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList[] f132037b = n();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList[] f132038c = n();

    /* renamed from: d, reason: collision with root package name */
    final ArrayList[] f132039d = n();

    /* renamed from: e, reason: collision with root package name */
    final ArrayList[] f132040e = n();

    /* renamed from: f, reason: collision with root package name */
    final ArrayList[] f132041f = n();

    /* renamed from: m, reason: collision with root package name */
    private String[] f132047m = null;

    /* renamed from: n, reason: collision with root package name */
    private String[] f132048n = null;

    private dX(C14049du c14049du, C14030da c14030da, C14101fs c14101fs, boolean z10, boolean z11) {
        this.f132042h = c14049du;
        this.f132043i = c14030da;
        this.f132046l = c14101fs;
        this.f132044j = z10;
        this.f132045k = z11;
    }

    private static byte a(byte b10) {
        if (b10 < 0 || b10 >= ((byte) cZ.f131900a.length)) {
            return (byte) 0;
        }
        return b10;
    }

    private static dQ a(cJ cJVar, boolean z10) {
        try {
            dQ dQVarA = dQ.a(cJVar, z10);
            if (dQVarA != null) {
                return dQVarA;
            }
            Log.e("Failed to parse selector " + cJVar);
            return null;
        } catch (Throwable th2) {
            Log.e("Exception parsing selector " + cJVar, th2);
            return null;
        }
    }

    private static dQ a(List list, cF cFVar, boolean z10) {
        if (cFVar == null) {
            return null;
        }
        dQ dQVarA = a(list, cFVar.a(), z10);
        if (dQVarA == null) {
            Log.e("Failed to parse block rule");
        }
        return dQVarA;
    }

    private static dQ a(List list, cJ cJVar, boolean z10) {
        dQ dQVarA = a(cJVar, z10);
        if (dQVarA != null) {
            list.add(dQVarA);
        }
        return dQVarA;
    }

    private static dQ a(List list, C14039dj c14039dj, boolean z10) {
        if (c14039dj == null) {
            return null;
        }
        dQ dQVarA = a(list, c14039dj.b(), z10);
        if (dQVarA == null) {
            Log.e("Failed to parse keep rule");
        }
        return dQVarA;
    }

    static dX a(C14049du c14049du, C14030da c14030da, C14101fs c14101fs, boolean z10, boolean z11) {
        dX dXVar = new dX(c14049du, c14030da, c14101fs, z10, z11);
        dXVar.h();
        return dXVar;
    }

    public static dX a(C14049du c14049du, C14030da c14030da, boolean z10) {
        return a(c14049du, c14030da, f132035g, z10, c14030da.l());
    }

    private static C14056ea a(ArrayList[] arrayListArr) {
        return C14059ed.a(arrayListArr[0], arrayListArr[1], arrayListArr[2]);
    }

    private void a(RustInterface rustInterface, C14013ck c14013ck, byte b10, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        rustInterface.a(new C14094fl(b10, strArr));
        if (c14013ck.b()) {
            Log.logAlways(cZ.f131900a[b10] + " selectors found: " + Arrays.toString(strArr));
        }
    }

    private static void a(String str, Object... objArr) {
    }

    private void a(boolean z10) {
        char c10;
        for (int i10 = 0; i10 < this.f132043i.h(); i10++) {
            C14039dj c14039djB = this.f132043i.b(i10);
            if (c14039djB.a() == 1) {
                byte bC = c14039djB.c();
                if (bC == 1) {
                    c10 = 0;
                } else if (bC == 2) {
                    c10 = 1;
                } else if (bC == 3) {
                    c10 = 2;
                } else {
                    a("Keep selector status is invalid (value is %d) at index %d, skipping.", Byte.valueOf(bC), Integer.valueOf(i10));
                }
                dQ dQVarA = a(this.f132041f[c10], c14039djB, z10);
                if (dQVarA == null) {
                    a("Could not parse keep rule selector with status %d at index %d, skipping.", Byte.valueOf(bC), Integer.valueOf(i10));
                } else {
                    a("Added keep rule selector with status %d at index %d: %s.", Byte.valueOf(bC), Integer.valueOf(i10), dQVarA);
                }
            }
        }
    }

    private boolean a(byte b10, byte b11, dZ dZVar) {
        if (b10 == 3) {
            dZVar.f132049a = this.f132036a;
        } else if (b10 == 0) {
            dZVar.f132049a = this.f132037b;
        } else if (b10 == 1) {
            dZVar.f132049a = this.f132038c;
        } else if (b10 == 2) {
            dZVar.f132049a = this.f132039d;
        } else {
            if (b10 != 4) {
                a("Selector rule type is invalid (value is %d), skipping.", Byte.valueOf(b10));
                return false;
            }
            dZVar.f132049a = this.f132040e;
        }
        if (b11 == 1) {
            dZVar.f132050b = 0;
        } else if (b11 == 2) {
            dZVar.f132050b = 1;
        } else {
            if (b11 != 3) {
                a("Selector status is invalid (value is %d), skipping.", Byte.valueOf(b11));
                return false;
            }
            dZVar.f132050b = 2;
        }
        return true;
    }

    private boolean a(cJ cJVar, byte b10, byte b11) {
        if (this.f132044j && b10 == 1 && b11 == 1) {
            String strC = cJVar.c();
            if ("decorview".equals(strC)) {
                a("Selector tag is '%s', skipping.", strC);
                return true;
            }
        }
        return false;
    }

    private boolean a(cO cOVar) {
        if (cOVar == null) {
            return true;
        }
        return cOVar.a() == 0 && cOVar.b() == 0 && cOVar.c() == 0;
    }

    private void h() {
        k();
        l();
        m();
        if (this.f132045k) {
            j();
        } else {
            i();
        }
        a(this.f132045k);
    }

    private void i() {
        a("Parsing element rules.", new Object[0]);
        dZ dZVar = new dZ();
        int iF = this.f132043i.f();
        for (int i10 = 0; i10 < iF; i10++) {
            cF cFVarA = this.f132043i.a(i10);
            byte bC = cFVarA.c();
            if (bC == 0) {
                a("Selector at index %d is disabled, skipping.", Integer.valueOf(i10));
            } else {
                byte b10 = cFVarA.b();
                if (!a(cFVarA.a(), b10, bC)) {
                    if (a(b10, bC, dZVar)) {
                        dQ dQVarA = a((List) dZVar.f132049a[dZVar.f132050b], cFVarA, false);
                        if (dQVarA == null) {
                            a("Could not parse selector type %d and status %d at index %d, skipping.", Byte.valueOf(b10), Byte.valueOf(bC), Integer.valueOf(i10));
                        } else {
                            a("Added selector type %d and status %d at index %d: %s.", Byte.valueOf(b10), Byte.valueOf(bC), Integer.valueOf(i10), dQVarA);
                        }
                    } else {
                        a("Selector at index %d could not be fully parsed, skipping.", Integer.valueOf(i10));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.dX.j():void");
    }

    private void k() {
    }

    private void l() {
    }

    private void m() {
    }

    private static ArrayList[] n() {
        return new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public void a(RustInterface rustInterface, C14013ck c14013ck) {
        a(rustInterface, c14013ck, (byte) 1, this.f132048n);
        a(rustInterface, c14013ck, (byte) 0, this.f132047m);
    }

    public String[] a() {
        return this.f132047m;
    }

    public C14056ea b() {
        return a(this.f132036a);
    }

    public C14056ea c() {
        return a(this.f132037b);
    }

    public C14056ea d() {
        return a(this.f132038c);
    }

    public C14056ea e() {
        return a(this.f132039d);
    }

    public C14056ea f() {
        return a(this.f132040e);
    }

    public C14056ea g() {
        return a(this.f132041f);
    }
}
