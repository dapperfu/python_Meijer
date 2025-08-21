package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13538l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f127195a;

    /* renamed from: b, reason: collision with root package name */
    public int f127196b = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f127197c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicReferenceArray f127198d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC13539m f127199e;

    /* renamed from: f, reason: collision with root package name */
    public M f127200f;

    /* renamed from: g, reason: collision with root package name */
    public M f127201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f127202h;

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
            r3.f127200f = r0
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L22
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
        Ld:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L19
            goto Lb4
        L19:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
            goto Ld
        L22:
            int r0 = r3.f127196b
            if (r0 < 0) goto L5a
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f127198d
            int r2 = r0 + (-1)
            r3.f127196b = r2
            java.lang.Object r0 = r1.get(r0)
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m) r0
            r3.f127199e = r0
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L22
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
        L46:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L22
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L51
            goto Lb4
        L51:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
            goto L46
        L5a:
            int r0 = r3.f127195a
            if (r0 < 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.N r1 = r3.f127202h
            com.scandit.datacapture.tools.internal.module.mapmaker.r[] r1 = r1.f127174c
            int r2 = r0 + (-1)
            r3.f127195a = r2
            r0 = r1[r0]
            r3.f127197c = r0
            int r0 = r0.f127206b
            if (r0 == 0) goto L5a
            com.scandit.datacapture.tools.internal.module.mapmaker.r r0 = r3.f127197c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f127209e
            r3.f127198d = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.f127196b = r0
        L7c:
            int r0 = r3.f127196b
            if (r0 < 0) goto L5a
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.f127198d
            int r2 = r0 + (-1)
            r3.f127196b = r2
            java.lang.Object r0 = r1.get(r0)
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = (com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m) r0
            r3.f127199e = r0
            if (r0 == 0) goto L7c
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto Lb4
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L7c
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
        La0:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            if (r0 == 0) goto L7c
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto Lab
            goto Lb4
        Lab:
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r3.f127199e
            com.scandit.datacapture.tools.internal.module.mapmaker.m r0 = r0.b()
            r3.f127199e = r0
            goto La0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13538l.a():void");
    }

    public AbstractC13538l(N n10) {
        this.f127202h = n10;
        this.f127195a = n10.f127174c.length - 1;
        a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f127200f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        M m10 = this.f127201g;
        if (!(m10 != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f127202h.remove(m10.f127168a);
        this.f127201g = null;
    }

    public final boolean a(InterfaceC13539m interfaceC13539m) {
        try {
            Object key = interfaceC13539m.getKey();
            this.f127202h.getClass();
            Object value = interfaceC13539m.getKey() == null ? null : interfaceC13539m.getValue();
            if (value != null) {
                this.f127200f = new M(this.f127202h, key, value);
                this.f127197c.d();
                return true;
            }
            this.f127197c.d();
            return false;
        } catch (Throwable th2) {
            this.f127197c.d();
            throw th2;
        }
    }
}
