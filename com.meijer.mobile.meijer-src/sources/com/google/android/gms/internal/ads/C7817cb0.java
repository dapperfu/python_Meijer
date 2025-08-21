package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.cb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7817cb0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C7817cb0 f74048c = new C7817cb0();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f74049a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f74050b = new ArrayList();

    public static C7817cb0 a() {
        return f74048c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.f74050b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f74049a);
    }

    public final void d(C7010Ka0 c7010Ka0) {
        this.f74049a.add(c7010Ka0);
    }

    public final void e(C7010Ka0 c7010Ka0) {
        ArrayList arrayList = this.f74049a;
        boolean zG = g();
        arrayList.remove(c7010Ka0);
        this.f74050b.remove(c7010Ka0);
        if (!zG || g()) {
            return;
        }
        C8670kb0.b().f();
    }

    public final void f(C7010Ka0 c7010Ka0) {
        ArrayList arrayList = this.f74050b;
        boolean zG = g();
        arrayList.add(c7010Ka0);
        if (zG) {
            return;
        }
        C8670kb0.b().e();
    }

    public final boolean g() {
        return this.f74050b.size() > 0;
    }

    private C7817cb0() {
    }
}
