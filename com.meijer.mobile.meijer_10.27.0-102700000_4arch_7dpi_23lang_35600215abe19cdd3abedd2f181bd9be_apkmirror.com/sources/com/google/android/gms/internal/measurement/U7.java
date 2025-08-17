package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U7 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    final boolean f82012c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f82013d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ V7 f82014e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC10498q b(com.google.android.gms.internal.measurement.U1 r12, java.util.List r13) {
        /*
            r11 = this;
            java.lang.String r0 = "log"
            r1 = 1
            com.google.android.gms.internal.measurement.C10545v2.b(r0, r1, r13)
            int r0 = r13.size()
            r2 = 0
            if (r0 != r1) goto L2e
            com.google.android.gms.internal.measurement.V7 r0 = r11.f82014e
            java.lang.Object r13 = r13.get(r2)
            com.google.android.gms.internal.measurement.q r13 = (com.google.android.gms.internal.measurement.InterfaceC10498q) r13
            com.google.android.gms.internal.measurement.q r12 = r12.a(r13)
            java.lang.String r3 = r12.zzc()
            boolean r5 = r11.f82012c
            boolean r6 = r11.f82013d
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.internal.measurement.A7 r1 = r0.d()
            r2 = 3
            r1.a(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.measurement.q r12 = com.google.android.gms.internal.measurement.InterfaceC10498q.f82342i3
            return r12
        L2e:
            java.lang.Object r0 = r13.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.InterfaceC10498q) r0
            com.google.android.gms.internal.measurement.q r0 = r12.a(r0)
            java.lang.Double r0 = r0.zzd()
            double r2 = r0.doubleValue()
            int r0 = com.google.android.gms.internal.measurement.C10545v2.g(r2)
            r2 = 5
            r3 = 2
            if (r0 == r3) goto L58
            r4 = 3
            if (r0 == r4) goto L56
            if (r0 == r2) goto L54
            r5 = 6
            if (r0 == r5) goto L52
        L50:
            r6 = r4
            goto L5a
        L52:
            r6 = r3
            goto L5a
        L54:
            r6 = r2
            goto L5a
        L56:
            r6 = r1
            goto L5a
        L58:
            r4 = 4
            goto L50
        L5a:
            java.lang.Object r0 = r13.get(r1)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.InterfaceC10498q) r0
            com.google.android.gms.internal.measurement.q r0 = r12.a(r0)
            java.lang.String r7 = r0.zzc()
            int r0 = r13.size()
            if (r0 != r3) goto L80
            com.google.android.gms.internal.measurement.V7 r12 = r11.f82014e
            boolean r9 = r11.f82012c
            boolean r10 = r11.f82013d
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.internal.measurement.A7 r5 = r12.d()
            r5.a(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.measurement.q r12 = com.google.android.gms.internal.measurement.InterfaceC10498q.f82342i3
            return r12
        L80:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L85:
            int r0 = r13.size()
            int r0 = java.lang.Math.min(r0, r2)
            if (r3 >= r0) goto La3
            java.lang.Object r0 = r13.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.InterfaceC10498q) r0
            com.google.android.gms.internal.measurement.q r0 = r12.a(r0)
            java.lang.String r0 = r0.zzc()
            r8.add(r0)
            int r3 = r3 + 1
            goto L85
        La3:
            com.google.android.gms.internal.measurement.V7 r12 = r11.f82014e
            boolean r9 = r11.f82012c
            boolean r10 = r11.f82013d
            com.google.android.gms.internal.measurement.A7 r5 = r12.d()
            r5.a(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.measurement.q r12 = com.google.android.gms.internal.measurement.InterfaceC10498q.f82342i3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.U7.b(com.google.android.gms.internal.measurement.U1, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(V7 v72, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(v72);
        this.f82014e = v72;
        this.f82012c = z10;
        this.f82013d = z11;
    }
}
