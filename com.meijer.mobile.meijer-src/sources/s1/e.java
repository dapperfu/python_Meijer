package s1;

import H1.n;
import Z.K;
import Z.r;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.LayoutNode;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\u0012\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0015\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\"R!\u0010)\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000%8\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R(\u0010/\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00104\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\"R(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u0010\"R(\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u0010\"R*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Ls1/e;", "", "<init>", "()V", "Ls1/e$a;", "entry", "", "topLeft", "bottomRight", "currentMillis", "", "f", "(Ls1/e$a;JJJ)V", "LH1/n;", "windowOffset", "screenOffset", "LV0/k1;", "viewToWindowMatrix", "b", "(Ls1/e$a;JJ[FJ)V", "minDeadline", "a", "(Ls1/e$a;JJ[FJJ)J", "screen", "window", "matrix", "", "i", "(JJ[F)Z", "", PreferencesHelper.PREF_ID, "e", "(IJJJ)V", "d", "(J)V", "c", "h", "LZ/K;", "LZ/K;", "getRectChangedMap", "()LZ/K;", "rectChangedMap", "Ls1/e$a;", "getGlobalChangeEntries", "()Ls1/e$a;", "setGlobalChangeEntries", "(Ls1/e$a;)V", "globalChangeEntries", "J", "g", "()J", "setMinDebounceDeadline", "minDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a globalChangeEntries;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long windowOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long screenOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float[] viewToWindowMatrix;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final K<a> rectChangedMap = r.c();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long minDebounceDeadline = -1;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0018\u00010\u0000R\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b+\u0010*R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b,\u0010*R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b!\u0010\u000f\"\u0004\b.\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Ls1/e$a;", "", "", "topLeft", "bottomRight", "LH1/n;", "windowOffset", "screenOffset", "LV0/k1;", "viewToWindowMatrix", "", "a", "(JJJJ[F)V", "J", "h", "()J", "throttleMillis", "b", "c", "debounceMillis", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/j;", "g", "()Landroidx/compose/ui/node/j;", "node", "Lkotlin/Function1;", "Ls1/d;", "d", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "callback", "Ls1/e;", "e", "Ls1/e$a;", "f", "()Ls1/e$a;", "setNext", "(Ls1/e$a;)V", "next", "i", "m", "(J)V", "j", "k", "lastInvokeMillis", "l", "lastUninvokedFireMillis", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long throttleMillis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long debounceMillis;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5956j node;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Function1<d, Unit> callback;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private a next;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long topLeft;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long bottomRight;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long lastInvokeMillis;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long lastUninvokedFireMillis;

        public final void a(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            d dVarA = f.a(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (dVarA == null) {
                return;
            }
            this.callback.invoke(dVarA);
        }

        /* renamed from: b, reason: from getter */
        public final long getBottomRight() {
            return this.bottomRight;
        }

        /* renamed from: c, reason: from getter */
        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        /* renamed from: d, reason: from getter */
        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        /* renamed from: e, reason: from getter */
        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        /* renamed from: f, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        /* renamed from: g, reason: from getter */
        public final InterfaceC5956j getNode() {
            return this.node;
        }

        /* renamed from: h, reason: from getter */
        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        /* renamed from: i, reason: from getter */
        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void j(long j10) {
            this.bottomRight = j10;
        }

        public final void k(long j10) {
            this.lastInvokeMillis = j10;
        }

        public final void l(long j10) {
            this.lastUninvokedFireMillis = j10;
        }

        public final void m(long j10) {
            this.topLeft = j10;
        }
    }

    private final long a(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.k(currentMillis);
        entry.l(-1L);
        entry.a(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    private final void b(a entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        boolean z10 = currentMillis - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z11 = entry.getDebounceMillis() == 0;
        entry.l(currentMillis);
        if (z10 && z11) {
            entry.k(currentMillis);
            entry.a(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z11) {
            return;
        }
        long j10 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j10 <= 0 || debounceMillis >= j10) {
            return;
        }
        this.minDebounceDeadline = j10;
    }

    private final void f(a entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z10 = currentMillis - lastInvokeMillis >= throttleMillis;
        boolean z11 = debounceMillis == 0;
        boolean z12 = throttleMillis == 0;
        entry.m(topLeft);
        entry.j(bottomRight);
        boolean z13 = !(z11 || z12) || z11;
        if (z10 && z13) {
            entry.l(-1L);
            entry.k(currentMillis);
            entry.a(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z11) {
                return;
            }
            entry.l(currentMillis);
            long j10 = this.minDebounceDeadline;
            long j11 = currentMillis + debounceMillis;
            if (j10 <= 0 || j11 >= j10) {
                return;
            }
            this.minDebounceDeadline = j10;
        }
    }

    public final void c(long currentMillis) {
        long j10 = this.windowOffset;
        long j11 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        a aVar = this.globalChangeEntries;
        if (aVar != null) {
            for (a next = aVar; next != null; next = next.getNext()) {
                LayoutNode layoutNodeO = C5957k.o(next.getNode());
                long offsetFromRoot = layoutNodeO.getOffsetFromRoot();
                long lastSize = layoutNodeO.getLastSize();
                next.m(offsetFromRoot);
                next.j(((n.k(offsetFromRoot) + ((int) (lastSize >> 32))) << 32) | ((n.l(offsetFromRoot) + ((int) (lastSize & 4294967295L))) & 4294967295L));
                b(next, j10, j11, fArr, currentMillis);
            }
        }
    }

    public final void d(long currentMillis) {
        e eVar = this;
        long j10 = eVar.windowOffset;
        long j11 = eVar.screenOffset;
        float[] fArr = eVar.viewToWindowMatrix;
        K<a> k10 = eVar.rectChangedMap;
        Object[] objArr = k10.values;
        long[] jArr = k10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j12 = jArr[i10];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                long j13 = j12;
                int i12 = 0;
                while (i12 < i11) {
                    if ((j13 & 255) < 128) {
                        a next = (a) objArr[(i10 << 3) + i12];
                        while (next != null) {
                            int i13 = i12;
                            a aVar = next;
                            eVar.b(aVar, j10, j11, fArr, currentMillis);
                            next = aVar.getNext();
                            eVar = this;
                            i12 = i13;
                        }
                    }
                    j13 >>= 8;
                    i12++;
                    eVar = this;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            }
            i10++;
            eVar = this;
        }
    }

    public final void e(int id2, long topLeft, long bottomRight, long currentMillis) {
        for (a aVarB = this.rectChangedMap.b(id2); aVarB != null; aVarB = aVarB.getNext()) {
            f(aVarB, topLeft, bottomRight, currentMillis);
        }
    }

    /* renamed from: g, reason: from getter */
    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r27) {
        /*
            r26 = this;
            r0 = r26
            long r1 = r0.minDebounceDeadline
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L9
            return
        L9:
            long r2 = r0.windowOffset
            long r4 = r0.screenOffset
            float[] r6 = r0.viewToWindowMatrix
            Z.K<s1.e$a> r1 = r0.rectChangedMap
            java.lang.Object[] r11 = r1.values
            long[] r12 = r1.metadata
            int r1 = r12.length
            int r13 = r1 + (-2)
            if (r13 < 0) goto L8f
            r16 = 0
            r1 = r16
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L23:
            r9 = r12[r1]
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = ~r9
            r19 = 7
            long r14 = r14 << r19
            long r14 = r14 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = r1 - r13
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r19 = r9
            r9 = r16
        L48:
            if (r9 >= r14) goto L84
            r21 = 255(0xff, double:1.26E-321)
            long r21 = r19 & r21
            r23 = 128(0x80, double:6.3E-322)
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 >= 0) goto L7a
            int r10 = r1 << 3
            int r10 = r10 + r9
            r10 = r11[r10]
            s1.e$a r10 = (s1.e.a) r10
        L5b:
            if (r10 == 0) goto L74
            r25 = r1
            r21 = r9
            r1 = r10
            r9 = r7
            r7 = r27
            long r9 = r0.a(r1, r2, r4, r6, r7, r9)
            s1.e$a r1 = r1.getNext()
            r7 = r9
            r9 = r21
            r10 = r1
            r1 = r25
            goto L5b
        L74:
            r21 = r9
            r9 = r7
        L77:
            r25 = r1
            goto L7d
        L7a:
            r21 = r9
            goto L77
        L7d:
            long r19 = r19 >> r15
            int r9 = r21 + 1
            r1 = r25
            goto L48
        L84:
            r25 = r1
            if (r14 != r15) goto L96
            r1 = r25
        L8a:
            if (r1 == r13) goto L96
            int r1 = r1 + 1
            goto L23
        L8f:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r17
        L96:
            s1.e$a r1 = r0.globalChangeEntries
            if (r1 == 0) goto La9
            r9 = r7
        L9b:
            if (r1 == 0) goto La8
            r7 = r27
            long r9 = r0.a(r1, r2, r4, r6, r7, r9)
            s1.e$a r1 = r1.getNext()
            goto L9b
        La8:
            r7 = r9
        La9:
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 != 0) goto Laf
            r7 = -1
        Laf:
            r0.minDebounceDeadline = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e.h(long):void");
    }

    public final boolean i(long screen, long window, float[] matrix) {
        boolean z10;
        if (n.j(window, this.windowOffset)) {
            z10 = false;
        } else {
            this.windowOffset = window;
            z10 = true;
        }
        if (!n.j(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z10 = true;
        }
        if (matrix == null) {
            return z10;
        }
        this.viewToWindowMatrix = matrix;
        return true;
    }

    public e() {
        n.Companion companion = n.INSTANCE;
        this.windowOffset = companion.b();
        this.screenOffset = companion.b();
    }
}
