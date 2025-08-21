package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public abstract class r extends ReentrantLock {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f127204g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final N f127205a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f127206b;

    /* renamed from: c, reason: collision with root package name */
    public int f127207c;

    /* renamed from: d, reason: collision with root package name */
    public int f127208d;

    /* renamed from: e, reason: collision with root package name */
    public volatile AtomicReferenceArray f127209e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f127210f = new AtomicInteger();

    public final void a(ReferenceQueue referenceQueue) {
        int i10 = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            InterfaceC13539m interfaceC13539m = (InterfaceC13539m) objPoll;
            N n10 = this.f127205a;
            n10.getClass();
            int iC = interfaceC13539m.c();
            r rVarA = n10.a(iC);
            rVarA.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = rVarA.f127209e;
                int length = iC & (atomicReferenceArray.length() - 1);
                InterfaceC13539m interfaceC13539m2 = (InterfaceC13539m) atomicReferenceArray.get(length);
                InterfaceC13539m interfaceC13539mB = interfaceC13539m2;
                while (true) {
                    if (interfaceC13539mB == null) {
                        break;
                    }
                    if (interfaceC13539mB == interfaceC13539m) {
                        rVarA.f127207c++;
                        InterfaceC13539m interfaceC13539mA = rVarA.a(interfaceC13539m2, interfaceC13539mB);
                        int i11 = rVarA.f127206b - 1;
                        atomicReferenceArray.set(length, interfaceC13539mA);
                        rVarA.f127206b = i11;
                        break;
                    }
                    interfaceC13539mB = interfaceC13539mB.b();
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
            N n10 = this.f127205a;
            n10.getClass();
            InterfaceC13539m interfaceC13539mA = k10.a();
            int iC = interfaceC13539mA.c();
            r rVarA = n10.a(iC);
            Object key = interfaceC13539mA.getKey();
            rVarA.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = rVarA.f127209e;
                int length = (atomicReferenceArray.length() - 1) & iC;
                InterfaceC13539m interfaceC13539m = (InterfaceC13539m) atomicReferenceArray.get(length);
                InterfaceC13539m interfaceC13539mB = interfaceC13539m;
                while (true) {
                    if (interfaceC13539mB == null) {
                        break;
                    }
                    Object key2 = interfaceC13539mB.getKey();
                    if (interfaceC13539mB.c() != iC || key2 == null || !rVarA.f127205a.f127176e.b(key, key2)) {
                        interfaceC13539mB = interfaceC13539mB.b();
                    } else if (((J) interfaceC13539mB).a() == k10) {
                        rVarA.f127207c++;
                        InterfaceC13539m interfaceC13539mA2 = rVarA.a(interfaceC13539m, interfaceC13539mB);
                        int i11 = rVarA.f127206b - 1;
                        atomicReferenceArray.set(length, interfaceC13539mA2);
                        rVarA.f127206b = i11;
                    }
                }
                i10++;
            } finally {
                rVarA.unlock();
            }
        } while (i10 != 16);
    }

    public final void d() {
        if ((this.f127210f.incrementAndGet() & 63) == 0) {
            e();
        }
    }

    public r(N n10, int i10) {
        this.f127205a = n10;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i10);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f127208d = length;
        if (length == -1) {
            this.f127208d = length + 1;
        }
        this.f127209e = atomicReferenceArray;
    }

    public final void e() {
        if (tryLock()) {
            try {
                c();
                this.f127210f.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final InterfaceC13539m a(Object obj, int i10) {
        if (this.f127206b == 0) {
            return null;
        }
        for (InterfaceC13539m interfaceC13539mB = (InterfaceC13539m) this.f127209e.get((r0.length() - 1) & i10); interfaceC13539mB != null; interfaceC13539mB = interfaceC13539mB.b()) {
            if (interfaceC13539mB.c() == i10) {
                Object key = interfaceC13539mB.getKey();
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
                } else if (this.f127205a.f127176e.b(obj, key)) {
                    return interfaceC13539mB;
                }
            }
        }
        return null;
    }

    public final Object a(Object obj, int i10, Object obj2, boolean z10) {
        lock();
        try {
            e();
            int i11 = this.f127206b + 1;
            if (i11 > this.f127208d) {
                a();
                i11 = this.f127206b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f127209e;
            int length = (atomicReferenceArray.length() - 1) & i10;
            InterfaceC13539m interfaceC13539m = (InterfaceC13539m) atomicReferenceArray.get(length);
            for (InterfaceC13539m interfaceC13539mB = interfaceC13539m; interfaceC13539mB != null; interfaceC13539mB = interfaceC13539mB.b()) {
                Object key = interfaceC13539mB.getKey();
                if (interfaceC13539mB.c() == i10 && key != null && this.f127205a.f127176e.b(obj, key)) {
                    Object value = interfaceC13539mB.getValue();
                    if (value == null) {
                        this.f127207c++;
                        this.f127205a.f127177f.a(f(), interfaceC13539mB, obj2);
                        this.f127206b = this.f127206b;
                        unlock();
                        return null;
                    }
                    if (z10) {
                        unlock();
                        return value;
                    }
                    this.f127207c++;
                    this.f127205a.f127177f.a(f(), interfaceC13539mB, obj2);
                    unlock();
                    return value;
                }
            }
            this.f127207c++;
            InterfaceC13539m interfaceC13539mA = this.f127205a.f127177f.a(f(), obj, i10, interfaceC13539m);
            this.f127205a.f127177f.a(f(), interfaceC13539mA, obj2);
            atomicReferenceArray.set(length, interfaceC13539mA);
            this.f127206b = i11;
            unlock();
            return null;
        } catch (Throwable th2) {
            unlock();
            throw th2;
        }
    }

    public final void a() {
        AtomicReferenceArray atomicReferenceArray = this.f127209e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i10 = this.f127206b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f127208d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC13539m interfaceC13539mB = (InterfaceC13539m) atomicReferenceArray.get(i11);
            if (interfaceC13539mB != null) {
                InterfaceC13539m interfaceC13539mB2 = interfaceC13539mB.b();
                int iC = interfaceC13539mB.c() & length2;
                if (interfaceC13539mB2 == null) {
                    atomicReferenceArray2.set(iC, interfaceC13539mB);
                } else {
                    InterfaceC13539m interfaceC13539m = interfaceC13539mB;
                    while (interfaceC13539mB2 != null) {
                        int iC2 = interfaceC13539mB2.c() & length2;
                        if (iC2 != iC) {
                            interfaceC13539m = interfaceC13539mB2;
                            iC = iC2;
                        }
                        interfaceC13539mB2 = interfaceC13539mB2.b();
                    }
                    atomicReferenceArray2.set(iC, interfaceC13539m);
                    while (interfaceC13539mB != interfaceC13539m) {
                        int iC3 = interfaceC13539mB.c() & length2;
                        InterfaceC13539m interfaceC13539mA = this.f127205a.f127177f.a(f(), interfaceC13539mB, (InterfaceC13539m) atomicReferenceArray2.get(iC3));
                        if (interfaceC13539mA != null) {
                            atomicReferenceArray2.set(iC3, interfaceC13539mA);
                        } else {
                            i10--;
                        }
                        interfaceC13539mB = interfaceC13539mB.b();
                    }
                }
            }
        }
        this.f127209e = atomicReferenceArray2;
        this.f127206b = i10;
    }

    public final InterfaceC13539m a(InterfaceC13539m interfaceC13539m, InterfaceC13539m interfaceC13539m2) {
        int i10 = this.f127206b;
        InterfaceC13539m interfaceC13539mB = interfaceC13539m2.b();
        while (interfaceC13539m != interfaceC13539m2) {
            InterfaceC13539m interfaceC13539mA = this.f127205a.f127177f.a(f(), interfaceC13539m, interfaceC13539mB);
            if (interfaceC13539mA != null) {
                interfaceC13539mB = interfaceC13539mA;
            } else {
                i10--;
            }
            interfaceC13539m = interfaceC13539m.b();
        }
        this.f127206b = i10;
        return interfaceC13539mB;
    }
}
