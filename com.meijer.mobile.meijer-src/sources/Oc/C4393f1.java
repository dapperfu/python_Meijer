package Oc;

import android.content.Context;
import android.os.Bundle;
import cd.C6501a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Oc.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4393f1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23431a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23432b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23433c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f23434d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f23435e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23436f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23437g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23438h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f23439i;

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f23440j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f23441k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23442l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23443m;

    /* renamed from: n, reason: collision with root package name */
    private final int f23444n;

    /* renamed from: o, reason: collision with root package name */
    private long f23445o = 0;

    public final C6501a g() {
        return null;
    }

    public final int a() {
        return this.f23444n;
    }

    public final int b() {
        return this.f23438h;
    }

    public final long c() {
        return this.f23445o;
    }

    public final Bundle d() {
        return this.f23440j;
    }

    public final Bundle e(Class cls) {
        return this.f23434d.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f23434d;
    }

    public final String h() {
        return this.f23443m;
    }

    public final String i() {
        return this.f23431a;
    }

    public final String j() {
        return this.f23436f;
    }

    public final String k() {
        return this.f23437g;
    }

    public final List l() {
        return new ArrayList(this.f23432b);
    }

    public final Set m() {
        return this.f23441k;
    }

    public final Set n() {
        return this.f23433c;
    }

    public final void o(long j10) {
        this.f23445o = j10;
    }

    @Deprecated
    public final boolean p() {
        return this.f23442l;
    }

    public C4393f1(C4390e1 c4390e1, C6501a c6501a) {
        this.f23431a = c4390e1.f23423g;
        this.f23432b = c4390e1.f23424h;
        this.f23433c = Collections.unmodifiableSet(c4390e1.f23417a);
        this.f23434d = c4390e1.f23418b;
        this.f23435e = Collections.unmodifiableMap(c4390e1.f23419c);
        this.f23436f = c4390e1.f23425i;
        this.f23437g = c4390e1.f23426j;
        this.f23438h = c4390e1.f23427k;
        this.f23439i = Collections.unmodifiableSet(c4390e1.f23420d);
        this.f23440j = c4390e1.f23421e;
        this.f23441k = Collections.unmodifiableSet(c4390e1.f23422f);
        this.f23442l = c4390e1.f23428l;
        this.f23443m = c4390e1.f23429m;
        this.f23444n = c4390e1.f23430n;
    }

    public final boolean q(Context context) {
        Gc.o oVarE = C4420o1.h().e();
        C4447y.b();
        Set set = this.f23439i;
        String strA = Sc.g.A(context);
        if (!set.contains(strA) && !oVarE.e().contains(strA)) {
            return false;
        }
        return true;
    }
}
