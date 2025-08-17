package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public abstract class r extends ReentrantLock {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f126252g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final N f126253a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f126254b;

    /* renamed from: c, reason: collision with root package name */
    public int f126255c;

    /* renamed from: d, reason: collision with root package name */
    public int f126256d;

    /* renamed from: e, reason: collision with root package name */
    public volatile AtomicReferenceArray f126257e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f126258f = new AtomicInteger();

    public final void a(ReferenceQueue referenceQueue) {
        int i10 = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            InterfaceC13406m interfaceC13406m = (InterfaceC13406m) objPoll;
            N n10 = this.f126253a;
            n10.getClass();
            int iC = interfaceC13406m.c();
            r rVarA = n10.a(iC);
            rVarA.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = rVarA.f126257e;
                int length = iC & (atomicReferenceArray.length() - 1);
                InterfaceC13406m interfaceC13406m2 = (InterfaceC13406m) atomicReferenceArray.get(length);
                InterfaceC13406m interfaceC13406mB = interfaceC13406m2;
                while (true) {
                    if (interfaceC13406mB == null) {
                        break;
                    }
                    if (interfaceC13406mB == interfaceC13406m) {
                        rVarA.f126255c++;
                        InterfaceC13406m interfaceC13406mA = rVarA.a(interfaceC13406m2, interfaceC13406mB);
                        int i11 = rVarA.f126254b - 1;
                        atomicReferenceArray.set(length, interfaceC13406mA);
                        rVarA.f126254b = i11;
                        break;
                    }
                    interfaceC13406mB = interfaceC13406mB.b();
                }
                i10++;
            } finally {
                rVarA.unlock();
            }
        } while (i10 != 16);
    }

    public void b() {
    }

    public void c() {
    }

    public abstract r f();

    public final void b(ReferenceQueue referenceQueue) {
        int i10 = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            K k10 = (K) objPoll;
            N n10 = this.f126253a;
            n10.getClass();
            InterfaceC13406m interfaceC13406mA = k10.a();
            int iC = interfaceC13406mA.c();
            r rVarA = n10.a(iC);
            Object key = interfaceC13406mA.getKey();
            rVarA.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = rVarA.f126257e;
                int length = (atomicReferenceArray.length() - 1) & iC;
                InterfaceC13406m interfaceC13406m = (InterfaceC13406m) atomicReferenceArray.get(length);
                InterfaceC13406m interfaceC13406mB = interfaceC13406m;
                while (true) {
                    if (interfaceC13406mB == null) {
                        break;
                    }
                    Object key2 = interfaceC13406mB.getKey();
                    if (interfaceC13406mB.c() != iC || key2 == null || !rVarA.f126253a.f126224e.b(key, key2)) {
                        interfaceC13406mB = interfaceC13406mB.b();
                    } else if (((J) interfaceC13406mB).a() == k10) {
                        rVarA.f126255c++;
                        InterfaceC13406m interfaceC13406mA2 = rVarA.a(interfaceC13406m, interfaceC13406mB);
                        int i11 = rVarA.f126254b - 1;
                        atomicReferenceArray.set(length, interfaceC13406mA2);
                        rVarA.f126254b = i11;
                    }
                }
                i10++;
            } finally {
                rVarA.unlock();
            }
        } while (i10 != 16);
    }

    public final void d() {
        if ((this.f126258f.incrementAndGet() & 63) == 0) {
            e();
        }
    }

    public r(N n10, int i10) {
        this.f126253a = n10;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i10);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f126256d = length;
        if (length == -1) {
            this.f126256d = length + 1;
        }
        this.f126257e = atomicReferenceArray;
    }

    public final void e() {
        if (tryLock()) {
            try {
                c();
                this.f126258f.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final InterfaceC13406m a(Object obj, int i10) {
        if (this.f126254b == 0) {
            return null;
        }
        for (InterfaceC13406m interfaceC13406mB = (InterfaceC13406m) this.f126257e.get((r0.length() - 1) & i10); interfaceC13406mB != null; interfaceC13406mB = interfaceC13406mB.b()) {
            if (interfaceC13406mB.c() == i10) {
                Object key = interfaceC13406mB.getKey();
                if (key == null) {
                    if (tryLock()) {
                        try {
                            c();
                        } finally {
                            unlock();
                        }
                    } else {
                        continue;
                    }
                } else if (this.f126253a.f126224e.b(obj, key)) {
                    return interfaceC13406mB;
                }
            }
        }
        return null;
    }

    public final Object a(Object obj, int i10, Object obj2, boolean z10) {
        lock();
        try {
            e();
            int i11 = this.f126254b + 1;
            if (i11 > this.f126256d) {
                a();
                i11 = this.f126254b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f126257e;
            int length = (atomicReferenceArray.length() - 1) & i10;
            InterfaceC13406m interfaceC13406m = (InterfaceC13406m) atomicReferenceArray.get(length);
            for (InterfaceC13406m interfaceC13406mB = interfaceC13406m; interfaceC13406mB != null; interfaceC13406mB = interfaceC13406mB.b()) {
                Object key = interfaceC13406mB.getKey();
                if (interfaceC13406mB.c() == i10 && key != null && this.f126253a.f126224e.b(obj, key)) {
                    Object value = interfaceC13406mB.getValue();
                    if (value == null) {
                        this.f126255c++;
                        this.f126253a.f126225f.a(f(), interfaceC13406mB, obj2);
                        this.f126254b = this.f126254b;
                        unlock();
                        return null;
                    }
                    if (z10) {
                        unlock();
                        return value;
                    }
                    this.f126255c++;
                    this.f126253a.f126225f.a(f(), interfaceC13406mB, obj2);
                    unlock();
                    return value;
                }
            }
            this.f126255c++;
            InterfaceC13406m interfaceC13406mA = this.f126253a.f126225f.a(f(), obj, i10, interfaceC13406m);
            this.f126253a.f126225f.a(f(), interfaceC13406mA, obj2);
            atomicReferenceArray.set(length, interfaceC13406mA);
            this.f126254b = i11;
            unlock();
            return null;
        } catch (Throwable th2) {
            unlock();
            throw th2;
        }
    }

    public final void a() {
        AtomicReferenceArray atomicReferenceArray = this.f126257e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i10 = this.f126254b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f126256d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC13406m interfaceC13406mB = (InterfaceC13406m) atomicReferenceArray.get(i11);
            if (interfaceC13406mB != null) {
                InterfaceC13406m interfaceC13406mB2 = interfaceC13406mB.b();
                int iC = interfaceC13406mB.c() & length2;
                if (interfaceC13406mB2 == null) {
                    atomicReferenceArray2.set(iC, interfaceC13406mB);
                } else {
                    InterfaceC13406m interfaceC13406m = interfaceC13406mB;
                    while (interfaceC13406mB2 != null) {
                        int iC2 = interfaceC13406mB2.c() & length2;
                        if (iC2 != iC) {
                            interfaceC13406m = interfaceC13406mB2;
                            iC = iC2;
                        }
                        interfaceC13406mB2 = interfaceC13406mB2.b();
                    }
                    atomicReferenceArray2.set(iC, interfaceC13406m);
                    while (interfaceC13406mB != interfaceC13406m) {
                        int iC3 = interfaceC13406mB.c() & length2;
                        InterfaceC13406m interfaceC13406mA = this.f126253a.f126225f.a(f(), interfaceC13406mB, (InterfaceC13406m) atomicReferenceArray2.get(iC3));
                        if (interfaceC13406mA != null) {
                            atomicReferenceArray2.set(iC3, interfaceC13406mA);
                        } else {
                            i10--;
                        }
                        interfaceC13406mB = interfaceC13406mB.b();
                    }
                }
            }
        }
        this.f126257e = atomicReferenceArray2;
        this.f126254b = i10;
    }

    public final InterfaceC13406m a(InterfaceC13406m interfaceC13406m, InterfaceC13406m interfaceC13406m2) {
        int i10 = this.f126254b;
        InterfaceC13406m interfaceC13406mB = interfaceC13406m2.b();
        while (interfaceC13406m != interfaceC13406m2) {
            InterfaceC13406m interfaceC13406mA = this.f126253a.f126225f.a(f(), interfaceC13406m, interfaceC13406mB);
            if (interfaceC13406mA != null) {
                interfaceC13406mB = interfaceC13406mA;
            } else {
                i10--;
            }
            interfaceC13406m = interfaceC13406m.b();
        }
        this.f126254b = i10;
        return interfaceC13406mB;
    }
}
