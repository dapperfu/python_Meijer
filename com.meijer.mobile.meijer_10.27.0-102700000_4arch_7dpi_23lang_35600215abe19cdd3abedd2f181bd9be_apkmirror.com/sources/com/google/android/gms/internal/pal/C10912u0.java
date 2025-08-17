package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10912u0 {

    /* renamed from: d, reason: collision with root package name */
    private static final C10912u0 f84059d = new C10912u0(true);

    /* renamed from: a, reason: collision with root package name */
    final G1 f84060a = new C10929v1(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f84061b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f84062c;

    private C10912u0() {
    }

    public static C10912u0 a() {
        throw null;
    }

    private C10912u0(boolean z10) {
        b();
        b();
    }

    public final void b() {
        if (this.f84061b) {
            return;
        }
        this.f84060a.a();
        this.f84061b = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C10912u0 c10912u0 = new C10912u0();
        for (int i10 = 0; i10 < this.f84060a.b(); i10++) {
            Map.Entry entryH = this.f84060a.h(i10);
            c10912u0.c((InterfaceC10896t0) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f84060a.c()) {
            c10912u0.c((InterfaceC10896t0) entry.getKey(), entry.getValue());
        }
        c10912u0.f84062c = this.f84062c;
        return c10912u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10912u0) {
            return this.f84060a.equals(((C10912u0) obj).f84060a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84060a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.pal.InterfaceC10896t0 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.pal.Z1 r0 = r2.zzb()
            com.google.android.gms.internal.pal.J0.e(r3)
            com.google.android.gms.internal.pal.Z1 r1 = com.google.android.gms.internal.pal.Z1.f82984b
            com.google.android.gms.internal.pal.a2 r1 = com.google.android.gms.internal.pal.EnumC10590a2.INT
            com.google.android.gms.internal.pal.a2 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.pal.InterfaceC10690g1
            if (r0 == 0) goto L42
            return
        L1c:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L24
            boolean r0 = r3 instanceof com.google.android.gms.internal.pal.E0
            if (r0 == 0) goto L42
        L24:
            return
        L25:
            boolean r0 = r3 instanceof com.google.android.gms.internal.pal.AbstractC10605b0
            if (r0 != 0) goto L2d
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L42
        L2d:
            return
        L2e:
            boolean r0 = r3 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r3 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r3 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r3 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r3 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.pal.Z1 r2 = r2.zzb()
            com.google.android.gms.internal.pal.a2 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.C10912u0.d(com.google.android.gms.internal.pal.t0, java.lang.Object):void");
    }

    public final void c(InterfaceC10896t0 interfaceC10896t0, Object obj) {
        if (interfaceC10896t0.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d(interfaceC10896t0, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(interfaceC10896t0, obj);
        }
        this.f84060a.put(interfaceC10896t0, obj);
    }
}
