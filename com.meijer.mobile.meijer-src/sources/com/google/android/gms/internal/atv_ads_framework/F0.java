package com.google.android.gms.internal.atv_ads_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class F0 {

    /* renamed from: d, reason: collision with root package name */
    private static final F0 f81596d = new F0(true);

    /* renamed from: a, reason: collision with root package name */
    final N1 f81597a = new D1(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f81598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f81599c;

    private F0() {
    }

    public static F0 a() {
        throw null;
    }

    private F0(boolean z10) {
        b();
        b();
    }

    public final void b() {
        if (this.f81598b) {
            return;
        }
        for (int i10 = 0; i10 < this.f81597a.b(); i10++) {
            Map.Entry entryH = this.f81597a.h(i10);
            if (entryH.getValue() instanceof K0) {
                ((K0) entryH.getValue()).m();
            }
        }
        this.f81597a.a();
        this.f81598b = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        F0 f02 = new F0();
        for (int i10 = 0; i10 < this.f81597a.b(); i10++) {
            Map.Entry entryH = this.f81597a.h(i10);
            f02.c((E0) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f81597a.c()) {
            f02.c((E0) entry.getKey(), entry.getValue());
        }
        f02.f81599c = this.f81599c;
        return f02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F0) {
            return this.f81597a.equals(((F0) obj).f81597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f81597a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.atv_ads_framework.E0 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.atv_ads_framework.g2 r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.atv_ads_framework.S0.f81715d
            r3.getClass()
            com.google.android.gms.internal.atv_ads_framework.g2 r1 = com.google.android.gms.internal.atv_ads_framework.g2.f81820b
            com.google.android.gms.internal.atv_ads_framework.h2 r1 = com.google.android.gms.internal.atv_ads_framework.h2.INT
            com.google.android.gms.internal.atv_ads_framework.h2 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.atv_ads_framework.InterfaceC10372p1
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r3 instanceof com.google.android.gms.internal.atv_ads_framework.M0
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.atv_ads_framework.AbstractC10374q0
            if (r0 != 0) goto L2f
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L44
        L2f:
            return
        L30:
            boolean r0 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r3 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.atv_ads_framework.g2 r2 = r2.zzb()
            com.google.android.gms.internal.atv_ads_framework.h2 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.F0.d(com.google.android.gms.internal.atv_ads_framework.E0, java.lang.Object):void");
    }

    public final void c(E0 e02, Object obj) {
        if (e02.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d(e02, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(e02, obj);
        }
        this.f81597a.put(e02, obj);
    }
}
