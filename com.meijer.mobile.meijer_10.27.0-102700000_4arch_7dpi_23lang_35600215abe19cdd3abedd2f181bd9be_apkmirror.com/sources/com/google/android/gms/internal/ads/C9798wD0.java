package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.wD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9798wD0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79456a;

    /* renamed from: b, reason: collision with root package name */
    public final C7453aF0 f79457b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f79458c;

    private C9798wD0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C7453aF0 c7453aF0) {
        this.f79458c = copyOnWriteArrayList;
        this.f79456a = 0;
        this.f79457b = c7453aF0;
    }

    public final C9798wD0 a(int i10, C7453aF0 c7453aF0) {
        return new C9798wD0(this.f79458c, 0, c7453aF0);
    }

    public C9798wD0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void b(Handler handler, InterfaceC9905xD0 interfaceC9905xD0) {
        this.f79458c.add(new C9584uD0(handler, interfaceC9905xD0));
    }

    public final void c(InterfaceC9905xD0 interfaceC9905xD0) {
        Iterator it = this.f79458c.iterator();
        while (it.hasNext()) {
            C9584uD0 c9584uD0 = (C9584uD0) it.next();
            if (c9584uD0.f78775a == interfaceC9905xD0) {
                this.f79458c.remove(c9584uD0);
            }
        }
    }
}
