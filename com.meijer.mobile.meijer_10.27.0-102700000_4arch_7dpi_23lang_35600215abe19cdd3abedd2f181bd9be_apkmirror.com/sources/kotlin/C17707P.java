package kotlin;

import androidx.compose.foundation.text.h0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;
import z1.CommitTextCommand;
import z1.InterfaceC18354E;
import z1.InterfaceC18363i;
import z1.SetSelectionCommand;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Lw0/P;", "Lw0/b;", "Lz1/M;", "currentValue", "Lz1/E;", "offsetMapping", "Landroidx/compose/foundation/text/h0;", "layoutResultProxy", "Lw0/U;", "state", "<init>", "(Lz1/M;Lz1/E;Landroidx/compose/foundation/text/h0;Lw0/U;)V", "", "pagesAmount", "a0", "(Landroidx/compose/foundation/text/h0;I)I", "Lkotlin/Function1;", "Lz1/i;", "Lkotlin/ExtensionFunctionType;", "or", "", "Y", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "c0", "()Lw0/P;", "b0", "j", "Lz1/M;", "getCurrentValue", "()Lz1/M;", "k", "Landroidx/compose/foundation/text/h0;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/h0;", "Z", "value", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17707P extends AbstractC17716b<C17707P> {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue currentValue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h0 layoutResultProxy;

    public final TextFieldValue Z() {
        return TextFieldValue.c(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17707P(TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E, h0 h0Var, C17711U c17711u) {
        TextLayoutResult value;
        AnnotatedString text = textFieldValue.getText();
        long selection = textFieldValue.getSelection();
        if (h0Var != null) {
            value = h0Var.getValue();
        } else {
            value = null;
        }
        super(text, selection, value, interfaceC18354E, c17711u, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a0(androidx.compose.foundation.text.h0 r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r9.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r9.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.I(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$a r0 = androidx.compose.ui.geometry.Rect.INSTANCE
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L1b:
            z1.E r0 = r8.getOffsetMapping()
            z1.M r1 = r8.currentValue
            long r3 = r1.getSelection()
            int r1 = androidx.compose.ui.text.y.i(r3)
            int r0 = r0.b(r1)
            u1.v r1 = r9.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.e(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = (float) r10
            float r2 = r2 * r10
            float r0 = r0 + r2
            z1.E r10 = r8.getOffsetMapping()
            u1.v r9 = r9.getValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            r0 = 32
            long r0 = r1 << r0
            long r2 = r6 & r4
            long r0 = r0 | r2
            long r0 = U0.f.e(r0)
            int r9 = r9.x(r0)
            int r9 = r10.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17707P.a0(androidx.compose.foundation.text.h0, int):int");
    }

    public final List<InterfaceC18363i> Y(Function1<? super C17707P, ? extends InterfaceC18363i> or2) {
        if (y.h(getSelection())) {
            InterfaceC18363i interfaceC18363iInvoke = or2.invoke(this);
            if (interfaceC18363iInvoke != null) {
                return CollectionsKt.e(interfaceC18363iInvoke);
            }
            return null;
        }
        return CollectionsKt.p(new CommitTextCommand("", 0), new SetSelectionCommand(y.l(getSelection()), y.l(getSelection())));
    }

    public final C17707P b0() {
        h0 h0Var;
        if (w().length() > 0 && (h0Var = this.layoutResultProxy) != null) {
            T(a0(h0Var, 1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C17707P c0() {
        h0 h0Var;
        if (w().length() > 0 && (h0Var = this.layoutResultProxy) != null) {
            T(a0(h0Var, -1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
