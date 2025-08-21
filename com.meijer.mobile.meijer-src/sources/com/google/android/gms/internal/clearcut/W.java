package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class W<FieldDescriptorType extends Z<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final W f82058d = new W(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f82060b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82061c = false;

    /* renamed from: a, reason: collision with root package name */
    private final C10413d1<FieldDescriptorType, Object> f82059a = C10413d1.g(16);

    private W() {
    }

    static int f(G1 g12, int i10, Object obj) {
        int iB0 = zzbn.B0(i10);
        if (g12 == G1.f81962l) {
            C10424h0.i((J0) obj);
            iB0 <<= 1;
        }
        return iB0 + o(g12, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f82059a.get(fielddescriptortype);
        return obj instanceof C10439m0 ? C10439m0.e() : obj;
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.s()) {
            j(fielddescriptortype.zzau(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                j(fielddescriptortype.zzau(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C10439m0) {
            this.f82061c = true;
        }
        this.f82059a.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(com.google.android.gms.internal.clearcut.G1 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.C10424h0.a(r3)
            int[] r0 = com.google.android.gms.internal.clearcut.X.f82064a
            com.google.android.gms.internal.clearcut.L1 r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L45
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.J0
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C10439m0
            if (r2 == 0) goto L27
            goto L28
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.InterfaceC10427i0
            if (r2 == 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            r1 = r0
            goto L45
        L2a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.A
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L27
            goto L28
        L33:
            boolean r0 = r3 instanceof java.lang.String
            goto L28
        L36:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L28
        L39:
            boolean r0 = r3 instanceof java.lang.Double
            goto L28
        L3c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L28
        L3f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L28
        L42:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L28
        L45:
            if (r1 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.W.j(com.google.android.gms.internal.clearcut.G1, java.lang.Object):void");
    }

    public static <T extends Z<T>> W<T> k() {
        return f82058d;
    }

    private static int n(Z<?> z10, Object obj) {
        G1 g1Zzau = z10.zzau();
        int iZzc = z10.zzc();
        if (!z10.s()) {
            return f(g1Zzau, iZzc, obj);
        }
        int iF = 0;
        List list = (List) obj;
        if (z10.zzax()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iF += o(g1Zzau, it.next());
            }
            return zzbn.B0(iZzc) + iF + zzbn.J0(iF);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iF += f(g1Zzau, iZzc, it2.next());
        }
        return iF;
    }

    private static int o(G1 g12, Object obj) {
        switch (X.f82065b[g12.ordinal()]) {
            case 1:
                return zzbn.w(((Double) obj).doubleValue());
            case 2:
                return zzbn.x(((Float) obj).floatValue());
            case 3:
                return zzbn.e0(((Long) obj).longValue());
            case 4:
                return zzbn.h0(((Long) obj).longValue());
            case 5:
                return zzbn.C0(((Integer) obj).intValue());
            case 6:
                return zzbn.p0(((Long) obj).longValue());
            case 7:
                return zzbn.F0(((Integer) obj).intValue());
            case 8:
                return zzbn.F(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.Z((J0) obj);
            case 10:
                return obj instanceof C10439m0 ? zzbn.e((C10439m0) obj) : zzbn.R((J0) obj);
            case 11:
                return obj instanceof A ? zzbn.D((A) obj) : zzbn.q0((String) obj);
            case 12:
                return obj instanceof A ? zzbn.D((A) obj) : zzbn.a0((byte[]) obj);
            case 13:
                return zzbn.D0(((Integer) obj).intValue());
            case 14:
                return zzbn.G0(((Integer) obj).intValue());
            case 15:
                return zzbn.s0(((Long) obj).longValue());
            case 16:
                return zzbn.E0(((Integer) obj).intValue());
            case 17:
                return zzbn.l0(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC10427i0 ? zzbn.H0(((InterfaceC10427i0) obj).zzc()) : zzbn.H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean p(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.q() == L1.MESSAGE) {
            boolean zS = key.s();
            Object value = entry.getValue();
            if (zS) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((J0) it.next()).a()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof J0)) {
                    if (value instanceof C10439m0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((J0) value).a()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C10439m0) {
            value = C10439m0.e();
        }
        if (key.s()) {
            Object objG = g(key);
            if (objG == null) {
                objG = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objG).add(s(it.next()));
            }
            this.f82059a.put(key, objG);
            return;
        }
        if (key.q() != L1.MESSAGE) {
            this.f82059a.put(key, s(value));
            return;
        }
        Object objG2 = g(key);
        if (objG2 == null) {
            this.f82059a.put(key, s(value));
        } else {
            this.f82059a.put(key, objG2 instanceof P0 ? key.v((P0) objG2, (P0) value) : key.y(((J0) objG2).j(), (J0) value).b0());
        }
    }

    private static int r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.q() != L1.MESSAGE || key.s() || key.zzax()) {
            return n(key, value);
        }
        boolean z10 = value instanceof C10439m0;
        int iZzc = entry.getKey().zzc();
        return z10 ? zzbn.A(iZzc, (C10439m0) value) : zzbn.Y(iZzc, (J0) value);
    }

    private static Object s(Object obj) {
        if (obj instanceof P0) {
            return ((P0) obj).U2();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        return this.f82061c ? new C10448p0(this.f82059a.s().iterator()) : this.f82059a.s().iterator();
    }

    final boolean b() {
        return this.f82059a.isEmpty();
    }

    public final boolean c() {
        return this.f82060b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        W w10 = new W();
        for (int i10 = 0; i10 < this.f82059a.q(); i10++) {
            Map.Entry<K, Object> entryH = this.f82059a.h(i10);
            w10.i((Z) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f82059a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w10.i((Z) entry.getKey(), entry.getValue());
        }
        w10.f82061c = this.f82061c;
        return w10;
    }

    public final boolean d() {
        for (int i10 = 0; i10 < this.f82059a.q(); i10++) {
            if (!p(this.f82059a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f82059a.r().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        return this.f82061c ? new C10448p0(this.f82059a.entrySet().iterator()) : this.f82059a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W) {
            return this.f82059a.equals(((W) obj).f82059a);
        }
        return false;
    }

    public final void h(W<FieldDescriptorType> w10) {
        for (int i10 = 0; i10 < w10.f82059a.q(); i10++) {
            q(w10.f82059a.h(i10));
        }
        Iterator it = w10.f82059a.r().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f82059a.hashCode();
    }

    public final int l() {
        int iN = 0;
        for (int i10 = 0; i10 < this.f82059a.q(); i10++) {
            Map.Entry<K, Object> entryH = this.f82059a.h(i10);
            iN += n((Z) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f82059a.r().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iN += n((Z) entry.getKey(), entry.getValue());
        }
        return iN;
    }

    public final int m() {
        int iR = 0;
        for (int i10 = 0; i10 < this.f82059a.q(); i10++) {
            iR += r(this.f82059a.h(i10));
        }
        Iterator it = this.f82059a.r().iterator();
        while (it.hasNext()) {
            iR += r((Map.Entry) it.next());
        }
        return iR;
    }

    public final void t() {
        if (this.f82060b) {
            return;
        }
        this.f82059a.w();
        this.f82060b = true;
    }

    private W(boolean z10) {
        t();
    }
}
