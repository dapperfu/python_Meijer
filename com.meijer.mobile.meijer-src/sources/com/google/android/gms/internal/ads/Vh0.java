package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Vh0 extends AbstractC8363hh0 {

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC8363hh0 f71743g = new Vh0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f71744d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f71745e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f71746f;

    private Vh0(Object obj, Object[] objArr, int i10) {
        this.f71744d = obj;
        this.f71745e = objArr;
        this.f71746f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.AbstractC8363hh0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f71746f
            java.lang.Object[] r2 = r9.f71745e
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.f71744d
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.C7427Wg0.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.C7427Wg0.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.C7427Wg0.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vh0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f71746f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.Vh0 k(int r19, java.lang.Object[] r20, com.google.android.gms.internal.ads.C8256gh0 r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vh0.k(int, java.lang.Object[], com.google.android.gms.internal.ads.gh0):com.google.android.gms.internal.ads.Vh0");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8363hh0
    final AbstractC7526Zg0 a() {
        return new Uh0(this.f71745e, 1, this.f71746f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8363hh0
    final AbstractC8575jh0 g() {
        return new C7295Sh0(this, this.f71745e, 0, this.f71746f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8363hh0
    final AbstractC8575jh0 h() {
        return new C7329Th0(this, new Uh0(this.f71745e, 0, this.f71746f));
    }
}
