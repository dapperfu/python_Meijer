package com.google.android.gms.common.api.internal;

import Z.C5603a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import jd.C14985h;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Map f65618a = Collections.synchronizedMap(new C5603a());

    /* renamed from: b, reason: collision with root package name */
    private int f65619b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f65620c;

    final void g(Bundle bundle) {
        this.f65619b = 1;
        this.f65620c = bundle;
        for (Map.Entry entry : this.f65618a.entrySet()) {
            ((C14985h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f65619b = 5;
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).g();
        }
    }

    final void i() {
        this.f65619b = 3;
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).h();
        }
    }

    final void k() {
        this.f65619b = 2;
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).j();
        }
    }

    final void l() {
        this.f65619b = 4;
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).k();
        }
    }

    final C14985h c(String str, Class cls) {
        return (C14985h) cls.cast(this.f65618a.get(str));
    }

    final void d(String str, C14985h c14985h) {
        if (this.f65618a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f65618a.put(str, c14985h);
        if (this.f65619b > 0) {
            new Ad.e(Looper.getMainLooper()).post(new e(this, c14985h, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f65618a.values().iterator();
        while (it.hasNext()) {
            ((C14985h) it.next()).e(i10, i11, intent);
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f65618a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C14985h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    f() {
    }
}
