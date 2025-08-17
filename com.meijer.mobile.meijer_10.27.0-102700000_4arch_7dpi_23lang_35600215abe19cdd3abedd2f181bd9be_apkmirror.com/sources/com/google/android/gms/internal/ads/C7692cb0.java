package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.cb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7692cb0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C7692cb0 f73208c = new C7692cb0();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f73209a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f73210b = new ArrayList();

    public static C7692cb0 a() {
        return f73208c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.f73210b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f73209a);
    }

    public final void d(C6885Ka0 c6885Ka0) {
        this.f73209a.add(c6885Ka0);
    }

    public final void e(C6885Ka0 c6885Ka0) {
        ArrayList arrayList = this.f73209a;
        boolean zG = g();
        arrayList.remove(c6885Ka0);
        this.f73210b.remove(c6885Ka0);
        if (!zG || g()) {
            return;
        }
        C8545kb0.b().f();
    }

    public final void f(C6885Ka0 c6885Ka0) {
        ArrayList arrayList = this.f73210b;
        boolean zG = g();
        arrayList.add(c6885Ka0);
        if (zG) {
            return;
        }
        C8545kb0.b().e();
    }

    public final boolean g() {
        return this.f73210b.size() > 0;
    }

    private C7692cb0() {
    }
}
