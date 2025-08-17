package com.google.android.gms.common.api.internal;

import Z.C5503a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import hd.C14407h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Map f64778a = Collections.synchronizedMap(new C5503a());

    /* renamed from: b, reason: collision with root package name */
    private int f64779b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f64780c;

    final void g(Bundle bundle) {
        this.f64779b = 1;
        this.f64780c = bundle;
        for (Map.Entry entry : this.f64778a.entrySet()) {
            ((C14407h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f64779b = 5;
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).g();
        }
    }

    final void i() {
        this.f64779b = 3;
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).h();
        }
    }

    final void k() {
        this.f64779b = 2;
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).j();
        }
    }

    final void l() {
        this.f64779b = 4;
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).k();
        }
    }

    final C14407h c(String str, Class cls) {
        return (C14407h) cls.cast(this.f64778a.get(str));
    }

    final void d(String str, C14407h c14407h) {
        if (this.f64778a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f64778a.put(str, c14407h);
        if (this.f64779b > 0) {
            new yd.e(Looper.getMainLooper()).post(new e(this, c14407h, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f64778a.values().iterator();
        while (it.hasNext()) {
            ((C14407h) it.next()).e(i10, i11, intent);
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f64778a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C14407h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    f() {
    }
}
