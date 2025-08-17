package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13405l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f126243a;

    /* renamed from: b, reason: collision with root package name */
    public int f126244b = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f126245c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicReferenceArray f126246d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC13406m f126247e;

    /* renamed from: f, reason: collision with root package name */
    public M f126248f;

    /* renamed from: g, reason: collision with root package name */
    public M f126249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f126250h;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r3 = this;
            r0 = 0
            r3.f126248f = r0
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L22
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
        Ld:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L19
            goto Lb4
        L19:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
            goto Ld
        L22:
            int r0 = r3.f126244b
            if (r0 < 0) goto L5a
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f126246d
            int r2 = r0 + (-1)
            r3.f126244b = r2
            java.lang.Object r0 = r1.get(r0)
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m) r0
            r3.f126247e = r0
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L22
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
        L46:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L51
            goto Lb4
        L51:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
            goto L46
        L5a:
            int r0 = r3.f126243a
            if (r0 < 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.N r1 = r3.f126250h
            com.scandit.datacapture.tools.internal.module.mapmaker.r[] r1 = r1.f126222c
            int r2 = r0 + (-1)
            r3.f126243a = r2
            r0 = r1[r0]
            r3.f126245c = r0
            int r0 = r0.f126254b
            if (r0 == 0) goto L5a
            com.scandit.datacapture.tools.internal.module.mapmaker.r r0 = r3.f126245c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f126257e
            r3.f126246d = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.f126244b = r0
        L7c:
            int r0 = r3.f126244b
            if (r0 < 0) goto L5a
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f126246d
            int r2 = r0 + (-1)
            r3.f126244b = r2
            java.lang.Object r0 = r1.get(r0)
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m) r0
            r3.f126247e = r0
            if (r0 == 0) goto L7c
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L7c
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
        La0:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            if (r0 == 0) goto L7c
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto Lab
            goto Lb4
        Lab:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f126247e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f126247e = r0
            goto La0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13405l.a():void");
    }

    public AbstractC13405l(N n10) {
        this.f126250h = n10;
        this.f126243a = n10.f126222c.length - 1;
        a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126248f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        M m10 = this.f126249g;
        if (!(m10 != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f126250h.remove(m10.f126216a);
        this.f126249g = null;
    }

    public final boolean a(InterfaceC13406m interfaceC13406m) {
        try {
            Object key = interfaceC13406m.getKey();
            this.f126250h.getClass();
            Object value = interfaceC13406m.getKey() == null ? null : interfaceC13406m.getValue();
            if (value != null) {
                this.f126248f = new M(this.f126250h, key, value);
                this.f126245c.d();
                return true;
            }
            this.f126245c.d();
            return false;
        } catch (Throwable th2) {
            this.f126245c.d();
            throw th2;
        }
    }
}
