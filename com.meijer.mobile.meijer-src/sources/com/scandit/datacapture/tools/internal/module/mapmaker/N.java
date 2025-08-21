package com.scandit.datacapture.tools.internal.module.mapmaker;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes12.dex */
public final class N extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final C13533g f127171j = new C13533g();

    /* renamed from: a, reason: collision with root package name */
    public final transient int f127172a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f127173b;

    /* renamed from: c, reason: collision with root package name */
    public final transient r[] f127174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f127175d = Math.min(4, 65536);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC13531e f127176e;

    /* renamed from: f, reason: collision with root package name */
    public final transient InterfaceC13540n f127177f;

    /* renamed from: g, reason: collision with root package name */
    public transient C13542p f127178g;

    /* renamed from: h, reason: collision with root package name */
    public transient C f127179h;

    /* renamed from: i, reason: collision with root package name */
    public transient C13537k f127180i;

    public final int a(Object obj) {
        int iA;
        AbstractC13531e abstractC13531e = this.f127176e;
        if (obj == null) {
            abstractC13531e.getClass();
            iA = 0;
        } else {
            iA = abstractC13531e.a(obj);
        }
        int i10 = iA + ((iA << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        r rVarA = a(iA);
        rVarA.getClass();
        try {
            if (rVarA.f127206b == 0) {
                return false;
            }
            InterfaceC13539m interfaceC13539mA = rVarA.a(obj, iA);
            if (interfaceC13539mA != null) {
                if (interfaceC13539mA.getValue() != null) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            rVarA.d();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        r rVarA = a(iA);
        rVarA.getClass();
        try {
            InterfaceC13539m interfaceC13539mA = rVarA.a(obj, iA);
            if (interfaceC13539mA == null) {
                rVarA.d();
                return null;
            }
            Object value = interfaceC13539mA.getValue();
            if (value == null && rVarA.tryLock()) {
                try {
                    rVarA.c();
                    rVarA.unlock();
                } catch (Throwable th2) {
                    rVarA.unlock();
                    throw th2;
                }
            }
            rVarA.d();
            return value;
        } catch (Throwable th3) {
            rVarA.d();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r10 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r6.getValue() != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r2.f127207c++;
        r0 = r2.a(r5, r6);
        r1 = r2.f127206b - 1;
        r3.set(r4, r0);
        r2.f127206b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r10;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            com.scandit.datacapture.tools.internal.module.mapmaker.r r2 = r9.a(r1)
            r2.lock()
            r2.e()     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f127209e     // Catch: java.lang.Throwable -> L5e
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5e
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r5 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m) r5     // Catch: java.lang.Throwable -> L5e
            r6 = r5
        L22:
            if (r6 == 0) goto L65
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5e
            int r8 = r6.c()     // Catch: java.lang.Throwable -> L5e
            if (r8 != r1) goto L60
            if (r7 == 0) goto L60
            com.scandit.datacapture.tools.internal.module.mapmaker.N r8 = r2.f127205a     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.tools.internal.module.mapmaker.e r8 = r8.f127176e     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r8.b(r10, r7)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L60
            java.lang.Object r10 = r6.getValue()     // Catch: java.lang.Throwable -> L5e
            if (r10 == 0) goto L41
            goto L47
        L41:
            java.lang.Object r1 = r6.getValue()     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L65
        L47:
            int r0 = r2.f127207c     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 + 1
            r2.f127207c = r0     // Catch: java.lang.Throwable -> L5e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r2.a(r5, r6)     // Catch: java.lang.Throwable -> L5e
            int r1 = r2.f127206b     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L5e
            r2.f127206b = r1     // Catch: java.lang.Throwable -> L5e
            r2.unlock()
            return r10
        L5e:
            r10 = move-exception
            goto L69
        L60:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r6 = r6.b()     // Catch: java.lang.Throwable -> L5e
            goto L22
        L65:
            r2.unlock()
            return r0
        L69:
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.tools.internal.module.mapmaker.N.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r1.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replace(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            r9.getClass()
            r10.getClass()
            int r0 = r8.a(r9)
            com.scandit.datacapture.tools.internal.module.mapmaker.r r1 = r8.a(r0)
            r1.lock()
            r1.e()     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.f127209e     // Catch: java.lang.Throwable -> L5c
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5c
            int r3 = r3 + (-1)
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.m r4 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m) r4     // Catch: java.lang.Throwable -> L5c
            r5 = r4
        L24:
            if (r5 == 0) goto L78
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L5c
            int r7 = r5.c()     // Catch: java.lang.Throwable -> L5c
            if (r7 != r0) goto L73
            if (r6 == 0) goto L73
            com.scandit.datacapture.tools.internal.module.mapmaker.N r7 = r1.f127205a     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.e r7 = r7.f127176e     // Catch: java.lang.Throwable -> L5c
            boolean r6 = r7.b(r9, r6)     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L73
            java.lang.Object r9 = r5.getValue()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L5e
            java.lang.Object r9 = r5.getValue()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L78
            int r9 = r1.f127207c     // Catch: java.lang.Throwable -> L5c
            int r9 = r9 + 1
            r1.f127207c = r9     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.m r9 = r1.a(r4, r5)     // Catch: java.lang.Throwable -> L5c
            int r10 = r1.f127206b     // Catch: java.lang.Throwable -> L5c
            int r10 = r10 + (-1)
            r2.set(r3, r9)     // Catch: java.lang.Throwable -> L5c
            r1.f127206b = r10     // Catch: java.lang.Throwable -> L5c
            goto L78
        L5c:
            r9 = move-exception
            goto L7d
        L5e:
            int r0 = r1.f127207c     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
            r1.f127207c = r0     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.N r0 = r1.f127205a     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.n r0 = r0.f127177f     // Catch: java.lang.Throwable -> L5c
            com.scandit.datacapture.tools.internal.module.mapmaker.r r2 = r1.f()     // Catch: java.lang.Throwable -> L5c
            r0.a(r2, r5, r10)     // Catch: java.lang.Throwable -> L5c
            r1.unlock()
            return r9
        L73:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r5 = r5.b()     // Catch: java.lang.Throwable -> L5c
            goto L24
        L78:
            r1.unlock()
            r9 = 0
            return r9
        L7d:
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.tools.internal.module.mapmaker.N.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (r rVar : this.f127174c) {
            if (rVar.f127206b != 0) {
                rVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = rVar.f127209e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    rVar.b();
                    rVar.f127210f.set(0);
                    rVar.f127207c++;
                    rVar.f127206b = 0;
                    rVar.unlock();
                } catch (Throwable th2) {
                    rVar.unlock();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        r[] rVarArr = this.f127174c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = rVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                r rVar = rVarArr[r10];
                int i11 = rVar.f127206b;
                ?? r12 = rVar.f127209e;
                for (?? r13 = z10; r13 < r12.length(); r13++) {
                    InterfaceC13539m interfaceC13539mB = (InterfaceC13539m) r12.get(r13);
                    while (interfaceC13539mB != null) {
                        if (interfaceC13539mB.getKey() != null) {
                            value = interfaceC13539mB.getValue();
                            if (value == null) {
                                if (rVar.tryLock()) {
                                    try {
                                        rVar.c();
                                    } finally {
                                    }
                                }
                            }
                            boolean z11 = z10;
                            if (value == null && this.f127177f.a().a().b(obj, value)) {
                                return true;
                            }
                            interfaceC13539mB = interfaceC13539mB.b();
                            z10 = z11;
                        } else if (rVar.tryLock()) {
                            try {
                                rVar.c();
                            } finally {
                            }
                        }
                        value = null;
                        boolean z112 = z10;
                        if (value == null) {
                        }
                        interfaceC13539mB = interfaceC13539mB.b();
                        z10 = z112;
                    }
                }
                j11 += rVar.f127207c;
                z10 = z10;
            }
            boolean z12 = z10;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C13537k c13537k = this.f127180i;
        if (c13537k != null) {
            return c13537k;
        }
        C13537k c13537k2 = new C13537k(this);
        this.f127180i = c13537k2;
        return c13537k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        r[] rVarArr = this.f127174c;
        long j10 = 0;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10].f127206b != 0) {
                return false;
            }
            j10 += rVarArr[i10].f127207c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            if (rVarArr[i11].f127206b != 0) {
                return false;
            }
            j10 -= rVarArr[i11].f127207c;
        }
        return j10 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C13542p c13542p = this.f127178g;
        if (c13542p != null) {
            return c13542p;
        }
        C13542p c13542p2 = new C13542p(this);
        this.f127178g = c13542p2;
        return c13542p2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f127174c.length; i10++) {
            j10 += r0[i10].f127206b;
        }
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C c10 = this.f127179h;
        if (c10 != null) {
            return c10;
        }
        C c11 = new C(this);
        this.f127179h = c11;
        return c11;
    }

    public N(C13532f c13532f, InterfaceC13540n interfaceC13540n) {
        this.f127176e = (AbstractC13531e) P.a(null, ((u) P.a(c13532f.f127187a, u.f127211a)).a());
        this.f127177f = interfaceC13540n;
        int iMin = Math.min(16, 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f127175d) {
            i12++;
            i13 <<= 1;
        }
        this.f127173b = 32 - i12;
        this.f127172a = i13 - 1;
        this.f127174c = new r[i13];
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            r[] rVarArr = this.f127174c;
            if (i10 < rVarArr.length) {
                rVarArr[i10] = this.f127177f.a(this, i11);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return a(iA).a(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return a(iA).a(obj, iA, obj2, true);
    }

    public final r a(int i10) {
        return this.f127174c[(i10 >>> this.f127173b) & this.f127172a];
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r2.f127205a.f127177f.a().a().b(r12, r7.getValue()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7.getValue() != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r2.f127207c++;
        r11 = r2.a(r6, r7);
        r12 = r2.f127206b - 1;
        r3.set(r4, r11);
        r2.f127206b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r0;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7f
            if (r12 != 0) goto L7
            goto L7f
        L7:
            int r1 = r10.a(r11)
            com.scandit.datacapture.tools.internal.module.mapmaker.r r2 = r10.a(r1)
            r2.lock()
            r2.e()     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f127209e     // Catch: java.lang.Throwable -> L70
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L70
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.m r6 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m) r6     // Catch: java.lang.Throwable -> L70
            r7 = r6
        L25:
            if (r7 == 0) goto L77
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L70
            int r9 = r7.c()     // Catch: java.lang.Throwable -> L70
            if (r9 != r1) goto L72
            if (r8 == 0) goto L72
            com.scandit.datacapture.tools.internal.module.mapmaker.N r9 = r2.f127205a     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.e r9 = r9.f127176e     // Catch: java.lang.Throwable -> L70
            boolean r8 = r9.b(r11, r8)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.N r1 = r2.f127205a     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.n r1 = r1.f127177f     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.u r1 = r1.a()     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.e r1 = r1.a()     // Catch: java.lang.Throwable -> L70
            boolean r11 = r1.b(r12, r11)     // Catch: java.lang.Throwable -> L70
            if (r11 == 0) goto L55
            r0 = r5
            goto L5b
        L55:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L70
            if (r11 != 0) goto L77
        L5b:
            int r11 = r2.f127207c     // Catch: java.lang.Throwable -> L70
            int r11 = r11 + r5
            r2.f127207c = r11     // Catch: java.lang.Throwable -> L70
            com.scandit.datacapture.tools.internal.module.mapmaker.m r11 = r2.a(r6, r7)     // Catch: java.lang.Throwable -> L70
            int r12 = r2.f127206b     // Catch: java.lang.Throwable -> L70
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L70
            r2.f127206b = r12     // Catch: java.lang.Throwable -> L70
            r2.unlock()
            return r0
        L70:
            r11 = move-exception
            goto L7b
        L72:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r7 = r7.b()     // Catch: java.lang.Throwable -> L70
            goto L25
        L77:
            r2.unlock()
            return r0
        L7b:
            r2.unlock()
            throw r11
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.tools.internal.module.mapmaker.N.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        r rVarA = a(iA);
        rVarA.lock();
        try {
            rVarA.e();
            AtomicReferenceArray atomicReferenceArray = rVarA.f127209e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InterfaceC13539m interfaceC13539m = (InterfaceC13539m) atomicReferenceArray.get(length);
            InterfaceC13539m interfaceC13539mB = interfaceC13539m;
            while (true) {
                if (interfaceC13539mB == null) {
                    break;
                }
                Object key = interfaceC13539mB.getKey();
                if (interfaceC13539mB.c() == iA && key != null && rVarA.f127205a.f127176e.b(obj, key)) {
                    Object value = interfaceC13539mB.getValue();
                    if (value == null) {
                        if (interfaceC13539mB.getValue() == null) {
                            rVarA.f127207c++;
                            InterfaceC13539m interfaceC13539mA = rVarA.a(interfaceC13539m, interfaceC13539mB);
                            int i10 = rVarA.f127206b - 1;
                            atomicReferenceArray.set(length, interfaceC13539mA);
                            rVarA.f127206b = i10;
                        }
                    } else if (rVarA.f127205a.f127177f.a().a().b(obj2, value)) {
                        rVarA.f127207c++;
                        rVarA.f127205a.f127177f.a(rVarA.f(), interfaceC13539mB, obj3);
                        rVarA.unlock();
                        return true;
                    }
                } else {
                    interfaceC13539mB = interfaceC13539mB.b();
                }
            }
            rVarA.unlock();
            return false;
        } catch (Throwable th2) {
            rVarA.unlock();
            throw th2;
        }
    }
}
