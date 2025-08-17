package androidx.compose.ui.focus;

import Z.W;
import Z.i0;
import j1.C14832a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010%\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/focus/J;", "", "<init>", "()V", "", "e", "g", "f", "LZ/W;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/F;", "a", "LZ/W;", "states", "LD0/c;", "Lkotlin/Function0;", "b", "LD0/c;", "cancellationListener", "", "<set-?>", "c", "Z", "i", "()Z", "ongoingTransaction", "", "d", "I", "h", "()I", "generation", "value", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/F;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/F;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<FocusTargetNode, F> states = i0.c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Function0<Unit>> cancellationListener = new D0.c<>(new Function0[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ongoingTransaction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int generation;

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.states.k();
        this.ongoingTransaction = false;
        D0.c<Function0<Unit>> cVar = this.cancellationListener;
        Function0<Unit>[] function0Arr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            function0Arr[i10].invoke();
        }
        this.cancellationListener.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r14 = this;
            Z.W<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.F> r0 = r14.states
            java.lang.Object[] r1 = r0.keys
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            r10.O2()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            Z.W<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.F> r0 = r14.states
            r0.k()
            r14.ongoingTransaction = r3
            D0.c<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r14.cancellationListener
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.J.g():void");
    }

    /* renamed from: h, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }

    public final F j(FocusTargetNode focusTargetNode) {
        if (P0.h.isTrackFocusEnabled) {
            throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
        }
        return this.states.e(focusTargetNode);
    }

    public final void k(FocusTargetNode focusTargetNode, F f10) {
        if (P0.h.isTrackFocusEnabled) {
            return;
        }
        F fE = this.states.e(focusTargetNode);
        if (fE == null) {
            fE = F.f50579d;
        }
        if (fE != f10) {
            this.generation++;
        }
        W<FocusTargetNode, F> w10 = this.states;
        if (f10 != null) {
            w10.x(focusTargetNode, f10);
        } else {
            C14832a.c("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }
}
