package Mc;

import ad.C5595a;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Mc.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4115f1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19244a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19245b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f19246c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f19247d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f19248e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19249f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19250g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19251h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f19252i;

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f19253j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f19254k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f19255l;

    /* renamed from: m, reason: collision with root package name */
    private final String f19256m;

    /* renamed from: n, reason: collision with root package name */
    private final int f19257n;

    /* renamed from: o, reason: collision with root package name */
    private long f19258o = 0;

    public final C5595a g() {
        return null;
    }

    public final int a() {
        return this.f19257n;
    }

    public final int b() {
        return this.f19251h;
    }

    public final long c() {
        return this.f19258o;
    }

    public final Bundle d() {
        return this.f19253j;
    }

    public final Bundle e(Class cls) {
        return this.f19247d.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f19247d;
    }

    public final String h() {
        return this.f19256m;
    }

    public final String i() {
        return this.f19244a;
    }

    public final String j() {
        return this.f19249f;
    }

    public final String k() {
        return this.f19250g;
    }

    public final List l() {
        return new ArrayList(this.f19245b);
    }

    public final Set m() {
        return this.f19254k;
    }

    public final Set n() {
        return this.f19246c;
    }

    public final void o(long j10) {
        this.f19258o = j10;
    }

    @Deprecated
    public final boolean p() {
        return this.f19255l;
    }

    public C4115f1(C4112e1 c4112e1, C5595a c5595a) {
        this.f19244a = c4112e1.f19236g;
        this.f19245b = c4112e1.f19237h;
        this.f19246c = Collections.unmodifiableSet(c4112e1.f19230a);
        this.f19247d = c4112e1.f19231b;
        this.f19248e = Collections.unmodifiableMap(c4112e1.f19232c);
        this.f19249f = c4112e1.f19238i;
        this.f19250g = c4112e1.f19239j;
        this.f19251h = c4112e1.f19240k;
        this.f19252i = Collections.unmodifiableSet(c4112e1.f19233d);
        this.f19253j = c4112e1.f19234e;
        this.f19254k = Collections.unmodifiableSet(c4112e1.f19235f);
        this.f19255l = c4112e1.f19241l;
        this.f19256m = c4112e1.f19242m;
        this.f19257n = c4112e1.f19243n;
    }

    public final boolean q(Context context) {
        Ec.o oVarE = C4142o1.h().e();
        C4169y.b();
        Set set = this.f19252i;
        String strA = Qc.g.A(context);
        if (!set.contains(strA) && !oVarE.e().contains(strA)) {
            return false;
        }
        return true;
    }
}
