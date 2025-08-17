package u0;

import V0.w1;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import kotlin.C17708Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import u1.C17207A;
import u1.TextLayoutResult;
import z1.CommitTextCommand;
import z1.DeleteSurroundingTextCommand;
import z1.InterfaceC18363i;
import z1.SetSelectionCommand;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u0015\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b1\u00102J8\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106J>\u00109\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020;2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020>*\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@JC\u0010A\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020;2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0000¢\u0006\u0004\bA\u0010BJ/\u0010F\u001a\u000207*\u00020\u00042\u0006\u0010\u0006\u001a\u00020C2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010E\u001a\u0004\u0018\u00010DH\u0000¢\u0006\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lu0/i0;", "", "<init>", "()V", "Landroidx/compose/foundation/text/B;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Lw0/Q;", "textSelectionManager", "Lkotlin/Function1;", "Lz1/i;", "", "editCommandConsumer", "", "k", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/SelectGesture;Lw0/Q;Lkotlin/jvm/functions/Function1;)I", "textFieldSelectionManager", "r", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/SelectGesture;Lw0/Q;)V", "Landroid/view/inputmethod/DeleteGesture;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "c", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "n", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/DeleteGesture;Lw0/Q;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "l", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/SelectRangeGesture;Lw0/Q;Lkotlin/jvm/functions/Function1;)I", "s", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/SelectRangeGesture;Lw0/Q;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "d", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "o", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/DeleteRangeGesture;Lw0/Q;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "i", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/Q1;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/InsertGesture;", "g", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/Q1;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "j", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/Q1;Lkotlin/jvm/functions/Function1;)I", "offset", "", "h", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/text/y;", "range", "m", "(JLw0/Q;Lkotlin/jvm/functions/Function1;)V", "", "adjustRange", "e", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/HandwritingGesture;", "b", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Lu1/p;", "t", "(I)I", "f", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/HandwritingGesture;Lw0/Q;Landroidx/compose/ui/platform/Q1;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "p", "(Landroidx/compose/foundation/text/B;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lw0/Q;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f162515a = new i0();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "it", "", "a", "(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<MatchResult, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f162516f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f162517g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(1);
            this.f162516f = intRef;
            this.f162517g = intRef2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult matchResult) {
            Ref.IntRef intRef = this.f162516f;
            if (intRef.f142833a == -1) {
                intRef.f142833a = matchResult.c().getFirst();
            }
            this.f162517g.f142833a = matchResult.c().getLast() + 1;
            return "";
        }
    }

    private final int t(int i10) {
        return i10 != 1 ? i10 != 2 ? u1.p.INSTANCE.a() : u1.p.INSTANCE.a() : u1.p.INSTANCE.b();
    }

    private final void e(long range, AnnotatedString text, boolean adjustRange, Function1<? super InterfaceC18363i, Unit> editCommandConsumer) {
        if (adjustRange) {
            range = j0.j(range, text);
        }
        editCommandConsumer.invoke(j0.k(new SetSelectionCommand(androidx.compose.ui.text.y.i(range), androidx.compose.ui.text.y.i(range)), new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.j(range), 0)));
    }

    private final int g(androidx.compose.foundation.text.B b10, InsertGesture insertGesture, Q1 q12, Function1<? super InterfaceC18363i, Unit> function1) {
        androidx.compose.foundation.text.h0 h0VarL;
        TextLayoutResult value;
        if (q12 == null) {
            return b(S.a(insertGesture), function1);
        }
        int iN = j0.n(b10, j0.z(insertGesture.getInsertionPoint()), q12);
        if (iN == -1 || !((h0VarL = b10.l()) == null || (value = h0VarL.getValue()) == null || !j0.t(value, iN))) {
            return b(S.a(insertGesture), function1);
        }
        h(iN, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final void h(int offset, String text, Function1<? super InterfaceC18363i, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(j0.k(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int i(androidx.compose.foundation.text.B b10, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, Q1 q12, Function1<? super InterfaceC18363i, Unit> function1) {
        androidx.compose.foundation.text.h0 h0VarL;
        TextLayoutResult value;
        if (q12 == null) {
            return b(S.a(joinOrSplitGesture), function1);
        }
        int iN = j0.n(b10, j0.z(joinOrSplitGesture.getJoinOrSplitPoint()), q12);
        if (iN == -1 || !((h0VarL = b10.l()) == null || (value = h0VarL.getValue()) == null || !j0.t(value, iN))) {
            return b(S.a(joinOrSplitGesture), function1);
        }
        long jY = j0.y(annotatedString, iN);
        if (androidx.compose.ui.text.y.h(jY)) {
            h(androidx.compose.ui.text.y.n(jY), " ", function1);
        } else {
            e(jY, annotatedString, false, function1);
        }
        return 1;
    }

    private final void m(long range, C17708Q textSelectionManager, Function1<? super InterfaceC18363i, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(androidx.compose.ui.text.y.n(range), androidx.compose.ui.text.y.i(range)));
        if (textSelectionManager != null) {
            textSelectionManager.x(true);
        }
    }

    private final void n(androidx.compose.foundation.text.B b10, DeleteGesture deleteGesture, C17708Q c17708q) {
        if (c17708q != null) {
            c17708q.e0(j0.r(b10, w1.f(deleteGesture.getDeletionArea()), t(deleteGesture.getGranularity()), u1.t.INSTANCE.h()));
        }
    }

    private final void o(androidx.compose.foundation.text.B b10, DeleteRangeGesture deleteRangeGesture, C17708Q c17708q) {
        if (c17708q != null) {
            c17708q.e0(j0.s(b10, w1.f(deleteRangeGesture.getDeletionStartArea()), w1.f(deleteRangeGesture.getDeletionEndArea()), t(deleteRangeGesture.getGranularity()), u1.t.INSTANCE.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C17708Q c17708q) {
        if (c17708q != null) {
            c17708q.p();
        }
    }

    private final void r(androidx.compose.foundation.text.B b10, SelectGesture selectGesture, C17708Q c17708q) {
        if (c17708q != null) {
            c17708q.o0(j0.r(b10, w1.f(selectGesture.getSelectionArea()), t(selectGesture.getGranularity()), u1.t.INSTANCE.h()));
        }
    }

    private final void s(androidx.compose.foundation.text.B b10, SelectRangeGesture selectRangeGesture, C17708Q c17708q) {
        if (c17708q != null) {
            c17708q.o0(j0.s(b10, w1.f(selectRangeGesture.getSelectionStartArea()), w1.f(selectRangeGesture.getSelectionEndArea()), t(selectRangeGesture.getGranularity()), u1.t.INSTANCE.h()));
        }
    }

    private i0() {
    }

    private final int b(HandwritingGesture gesture, Function1<? super InterfaceC18363i, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int c(androidx.compose.foundation.text.B b10, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super InterfaceC18363i, Unit> function1) {
        int iT = t(deleteGesture.getGranularity());
        long jR = j0.r(b10, w1.f(deleteGesture.getDeletionArea()), iT, u1.t.INSTANCE.h());
        if (androidx.compose.ui.text.y.h(jR)) {
            return f162515a.b(S.a(deleteGesture), function1);
        }
        e(jR, annotatedString, u1.p.d(iT, u1.p.INSTANCE.b()), function1);
        return 1;
    }

    private final int d(androidx.compose.foundation.text.B b10, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super InterfaceC18363i, Unit> function1) {
        int iT = t(deleteRangeGesture.getGranularity());
        long jS = j0.s(b10, w1.f(deleteRangeGesture.getDeletionStartArea()), w1.f(deleteRangeGesture.getDeletionEndArea()), iT, u1.t.INSTANCE.h());
        if (androidx.compose.ui.text.y.h(jS)) {
            return f162515a.b(S.a(deleteRangeGesture), function1);
        }
        e(jS, annotatedString, u1.p.d(iT, u1.p.INSTANCE.b()), function1);
        return 1;
    }

    private final int j(androidx.compose.foundation.text.B b10, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, Q1 q12, Function1<? super InterfaceC18363i, Unit> function1) {
        TextLayoutResult value;
        androidx.compose.foundation.text.h0 h0VarL = b10.l();
        if (h0VarL != null) {
            value = h0VarL.getValue();
        } else {
            value = null;
        }
        long jP = j0.p(value, j0.z(removeSpaceGesture.getStartPoint()), j0.z(removeSpaceGesture.getEndPoint()), b10.k(), q12);
        if (androidx.compose.ui.text.y.h(jP)) {
            return f162515a.b(S.a(removeSpaceGesture), function1);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f142833a = -1;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f142833a = -1;
        String strL = new Regex("\\s+").l(C17207A.e(annotatedString, jP), new a(intRef, intRef2));
        if (intRef.f142833a != -1 && intRef2.f142833a != -1) {
            int iN = androidx.compose.ui.text.y.n(jP) + intRef.f142833a;
            int iN2 = androidx.compose.ui.text.y.n(jP) + intRef2.f142833a;
            String strSubstring = strL.substring(intRef.f142833a, strL.length() - (androidx.compose.ui.text.y.j(jP) - intRef2.f142833a));
            Intrinsics.i(strSubstring, "substring(...)");
            function1.invoke(j0.k(new SetSelectionCommand(iN, iN2), new CommitTextCommand(strSubstring, 1)));
            return 1;
        }
        return b(S.a(removeSpaceGesture), function1);
    }

    private final int k(androidx.compose.foundation.text.B b10, SelectGesture selectGesture, C17708Q c17708q, Function1<? super InterfaceC18363i, Unit> function1) {
        long jR = j0.r(b10, w1.f(selectGesture.getSelectionArea()), t(selectGesture.getGranularity()), u1.t.INSTANCE.h());
        if (androidx.compose.ui.text.y.h(jR)) {
            return f162515a.b(S.a(selectGesture), function1);
        }
        m(jR, c17708q, function1);
        return 1;
    }

    private final int l(androidx.compose.foundation.text.B b10, SelectRangeGesture selectRangeGesture, C17708Q c17708q, Function1<? super InterfaceC18363i, Unit> function1) {
        long jS = j0.s(b10, w1.f(selectRangeGesture.getSelectionStartArea()), w1.f(selectRangeGesture.getSelectionEndArea()), t(selectRangeGesture.getGranularity()), u1.t.INSTANCE.h());
        if (androidx.compose.ui.text.y.h(jS)) {
            return f162515a.b(S.a(selectRangeGesture), function1);
        }
        m(jS, c17708q, function1);
        return 1;
    }

    public final int f(androidx.compose.foundation.text.B b10, HandwritingGesture handwritingGesture, C17708Q c17708q, Q1 q12, Function1<? super InterfaceC18363i, Unit> function1) {
        AnnotatedString text;
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = b10.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        androidx.compose.foundation.text.h0 h0VarL = b10.l();
        if (h0VarL != null && (value = h0VarL.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.e(untransformedText, text)) {
            return 3;
        }
        if (C17171B.a(handwritingGesture)) {
            return k(b10, M.a(handwritingGesture), c17708q, function1);
        }
        if (Y.a(handwritingGesture)) {
            return c(b10, a0.a(handwritingGesture), untransformedText, function1);
        }
        if (b0.a(handwritingGesture)) {
            return l(b10, c0.a(handwritingGesture), c17708q, function1);
        }
        if (d0.a(handwritingGesture)) {
            return d(b10, e0.a(handwritingGesture), untransformedText, function1);
        }
        if (C17179J.a(handwritingGesture)) {
            return i(b10, C17180K.a(handwritingGesture), untransformedText, q12, function1);
        }
        if (C17175F.a(handwritingGesture)) {
            return g(b10, C17176G.a(handwritingGesture), q12, function1);
        }
        if (C17177H.a(handwritingGesture)) {
            return j(b10, C17178I.a(handwritingGesture), untransformedText, q12, function1);
        }
        return 2;
    }

    public final boolean p(androidx.compose.foundation.text.B b10, PreviewableHandwritingGesture previewableHandwritingGesture, final C17708Q c17708q, CancellationSignal cancellationSignal) {
        AnnotatedString text;
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = b10.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        androidx.compose.foundation.text.h0 h0VarL = b10.l();
        if (h0VarL != null && (value = h0VarL.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.e(untransformedText, text)) {
            return false;
        }
        if (C17171B.a(previewableHandwritingGesture)) {
            r(b10, M.a(previewableHandwritingGesture), c17708q);
        } else if (Y.a(previewableHandwritingGesture)) {
            n(b10, a0.a(previewableHandwritingGesture), c17708q);
        } else if (b0.a(previewableHandwritingGesture)) {
            s(b10, c0.a(previewableHandwritingGesture), c17708q);
        } else {
            if (!d0.a(previewableHandwritingGesture)) {
                return false;
            }
            o(b10, e0.a(previewableHandwritingGesture), c17708q);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: u0.h0
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    i0.q(c17708q);
                }
            });
            return true;
        }
        return true;
    }
}
