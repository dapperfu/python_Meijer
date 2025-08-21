package kotlin;

import Z.S;
import Z.a0;
import Z.b0;
import i0.C14592e;
import kotlin.AbstractC15880m;
import kotlin.InterfaceC15872e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Ln0/Q;", "Ln0/u;", "Lkotlin/ranges/IntRange;", "nearestRange", "Ln0/m;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Ln0/m;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "d", "(I)Ljava/lang/Object;", "LZ/a0;", "a", "LZ/a0;", "map", "", "b", "[Ljava/lang/Object;", "keys", "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15858Q implements InterfaceC15888u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0<Object> map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/e$a;", "Ln0/m$a;", "it", "", "a", "(Ln0/e$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n0.Q$a */
    static final class a extends Lambda implements Function1<InterfaceC15872e.a<? extends AbstractC15880m.a>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f151894f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f151895g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ S<Object> f151896h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C15858Q f151897i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, S<Object> s10, C15858Q c15858q) {
            super(1);
            this.f151894f = i10;
            this.f151895g = i11;
            this.f151896h = s10;
            this.f151897i = c15858q;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15872e.a<? extends AbstractC15880m.a> aVar) {
            a(aVar);
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(kotlin.InterfaceC15872e.a<? extends kotlin.AbstractC15880m.a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                n0.m$a r0 = (kotlin.AbstractC15880m.a) r0
                kotlin.jvm.functions.Function1 r0 = r0.getKey()
                int r1 = r6.f151894f
                int r2 = r7.getStartIndex()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f151895g
                int r3 = r7.getStartIndex()
                int r4 = r7.getSize()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.getStartIndex()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = kotlin.C15856O.a(r1)
            L3d:
                Z.S<java.lang.Object> r4 = r6.f151896h
                r4.u(r3, r1)
                n0.Q r4 = r6.f151897i
                java.lang.Object[] r4 = kotlin.C15858Q.a(r4)
                n0.Q r5 = r6.f151897i
                int r5 = kotlin.C15858Q.b(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C15858Q.a.a(n0.e$a):void");
        }
    }

    @Override // kotlin.InterfaceC15888u
    public int c(Object key) {
        a0<Object> a0Var = this.map;
        int iB = a0Var.b(key);
        if (iB >= 0) {
            return a0Var.values[iB];
        }
        return -1;
    }

    @Override // kotlin.InterfaceC15888u
    public Object d(int index) {
        Object[] objArr = this.keys;
        int i10 = index - this.keysStartIndex;
        if (i10 < 0 || i10 > ArraysKt.m0(objArr)) {
            return null;
        }
        return objArr[i10];
    }

    public C15858Q(IntRange intRange, AbstractC15880m<?> abstractC15880m) {
        boolean z10;
        InterfaceC15872e<Interval> interfaceC15872eK = abstractC15880m.k();
        int first = intRange.getFirst();
        if (first >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14592e.c("negative nearestRange.first");
        }
        int iMin = Math.min(intRange.getLast(), interfaceC15872eK.getSize() - 1);
        if (iMin < first) {
            this.map = b0.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i10 = (iMin - first) + 1;
            this.keys = new Object[i10];
            this.keysStartIndex = first;
            S s10 = new S(i10);
            interfaceC15872eK.a(first, iMin, new a(first, iMin, s10, this));
            this.map = s10;
        }
    }
}
