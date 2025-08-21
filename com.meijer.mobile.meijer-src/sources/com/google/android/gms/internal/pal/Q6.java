package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class Q6 extends J6 {

    /* renamed from: g, reason: collision with root package name */
    static final J6 f83682g = new Q6(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f83683d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f83684e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f83685f;

    private Q6(Object obj, Object[] objArr, int i10) {
        this.f83683d = obj;
        this.f83684e = objArr;
        this.f83685f = i10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f83685f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Type inference failed for: r16v10 */
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
    static com.google.android.gms.internal.pal.Q6 n(int r19, java.lang.Object[] r20, com.google.android.gms.internal.pal.I6 r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.Q6.n(int, java.lang.Object[], com.google.android.gms.internal.pal.I6):com.google.android.gms.internal.pal.Q6");
    }

    @Override // com.google.android.gms.internal.pal.J6
    final C6 a() {
        return new P6(this.f83684e, 1, this.f83685f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.pal.J6, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f83683d
            java.lang.Object[] r1 = r9.f83684e
            int r2 = r9.f83685f
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.pal.B6.a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.pal.B6.a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.pal.B6.a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.Q6.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.pal.J6
    final K6 h() {
        return new N6(this, this.f83684e, 0, this.f83685f);
    }

    @Override // com.google.android.gms.internal.pal.J6
    final K6 i() {
        return new O6(this, new P6(this.f83684e, 0, this.f83685f));
    }
}
