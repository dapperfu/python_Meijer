package kw;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lkw/C;", "Lkw/J;", "Lkw/g;", "upstream", "<init>", "(Lkw/g;)V", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "", "close", "()V", "a", "Lkw/g;", "b", "Lkw/e;", "buffer", "Lkw/F;", "c", "Lkw/F;", "expectedSegment", "", "d", "I", "expectedPos", "", "e", "Z", "closed", "f", "J", "pos", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class C implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g upstream;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15328e buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private F expectedSegment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int expectedPos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long pos;

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public C(InterfaceC15330g upstream) {
        Intrinsics.j(upstream, "upstream");
        this.upstream = upstream;
        C15328e c15328eE = upstream.e();
        this.buffer = c15328eE;
        F f10 = c15328eE.head;
        this.expectedSegment = f10;
        this.expectedPos = f10 != null ? f10.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // kw.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(kw.C15328e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.closed
            if (r3 != 0) goto L6c
            kw.F r3 = r8.expectedSegment
            if (r3 == 0) goto L2b
            kw.e r4 = r8.buffer
            kw.F r4 = r4.head
            if (r3 != r4) goto L23
            int r3 = r8.expectedPos
            kotlin.jvm.internal.Intrinsics.g(r4)
            int r4 = r4.pos
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            kw.g r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.t(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            kw.F r0 = r8.expectedSegment
            if (r0 != 0) goto L51
            kw.e r0 = r8.buffer
            kw.F r0 = r0.head
            if (r0 == 0) goto L51
            r8.expectedSegment = r0
            kotlin.jvm.internal.Intrinsics.g(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L51:
            kw.e r0 = r8.buffer
            long r0 = r0.getSize()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            kw.e r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r2.g(r3, r4, r6)
            long r9 = r8.pos
            long r9 = r9 + r6
            r8.pos = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.C.read(kw.e, long):long");
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getF148081a() {
        return this.upstream.getF148081a();
    }
}
