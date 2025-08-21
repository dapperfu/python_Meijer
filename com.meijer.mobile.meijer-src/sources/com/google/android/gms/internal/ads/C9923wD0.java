package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.wD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9923wD0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f80296a;

    /* renamed from: b, reason: collision with root package name */
    public final C7578aF0 f80297b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f80298c;

    private C9923wD0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C7578aF0 c7578aF0) {
        this.f80298c = copyOnWriteArrayList;
        this.f80296a = 0;
        this.f80297b = c7578aF0;
    }

    public final C9923wD0 a(int i10, C7578aF0 c7578aF0) {
        return new C9923wD0(this.f80298c, 0, c7578aF0);
    }

    public C9923wD0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void b(Handler handler, InterfaceC10030xD0 interfaceC10030xD0) {
        this.f80298c.add(new C9709uD0(handler, interfaceC10030xD0));
    }

    public final void c(InterfaceC10030xD0 interfaceC10030xD0) {
        Iterator it = this.f80298c.iterator();
        while (it.hasNext()) {
            C9709uD0 c9709uD0 = (C9709uD0) it.next();
            if (c9709uD0.f79615a == interfaceC10030xD0) {
                this.f80298c.remove(c9709uD0);
            }
        }
    }
}
