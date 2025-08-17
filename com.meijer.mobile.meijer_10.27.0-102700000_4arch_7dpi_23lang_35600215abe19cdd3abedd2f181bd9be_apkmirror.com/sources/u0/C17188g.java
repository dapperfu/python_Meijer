package u0;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.ImeOptions;
import java.util.List;
import kotlin.C17708Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import u1.C17207A;
import u1.TextLayoutResult;
import z1.C18360f;
import z1.C18368n;
import z1.CommitTextCommand;
import z1.InterfaceC18354E;
import z1.TextFieldValue;
import z1.TransformedText;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b\f\u00105\"\u0004\b<\u00107R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u00105¨\u0006W"}, d2 = {"Lu0/g;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/u0;", "Lz1/U;", "transformedText", "Lz1/M;", "value", "Landroidx/compose/foundation/text/B;", "state", "", "readOnly", "enabled", "isPassword", "Lz1/E;", "offsetMapping", "Lw0/Q;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/y;", "focusRequester", "<init>", "(Lz1/U;Lz1/M;Landroidx/compose/foundation/text/B;ZZZLz1/E;Lw0/Q;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/y;)V", "", "text", "", "Z2", "(Landroidx/compose/foundation/text/B;Ljava/lang/String;ZZ)V", "Lr1/u;", "T1", "(Lr1/u;)V", "a3", "q", "Lz1/U;", "getTransformedText", "()Lz1/U;", "setTransformedText", "(Lz1/U;)V", "r", "Lz1/M;", "Y2", "()Lz1/M;", "setValue", "(Lz1/M;)V", "s", "Landroidx/compose/foundation/text/B;", "X2", "()Landroidx/compose/foundation/text/B;", "setState", "(Landroidx/compose/foundation/text/B;)V", "t", "Z", "W2", "()Z", "setReadOnly", "(Z)V", "u", "R2", "setEnabled", "v", "setPassword", "w", "Lz1/E;", "V2", "()Lz1/E;", "setOffsetMapping", "(Lz1/E;)V", "x", "Lw0/Q;", "U2", "()Lw0/Q;", "setManager", "(Lw0/Q;)V", "y", "Landroidx/compose/ui/text/input/ImeOptions;", "T2", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "z", "Landroidx/compose/ui/focus/y;", "S2", "()Landroidx/compose/ui/focus/y;", "setFocusRequester", "(Landroidx/compose/ui/focus/y;)V", "Z1", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17188g extends AbstractC5817m implements androidx.compose.ui.node.u0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private TransformedText transformedText;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue value;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.text.B state;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean readOnly;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isPassword;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private InterfaceC18354E offsetMapping;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C17708Q manager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.focus.y focusRequester;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u0.g$a */
    static final class a extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        a() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5815k.i(C17188g.this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17188g.this.getManager().u();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$c */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17188g.this.getManager().Z();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$d */
    static final class d extends Lambda implements Function1<AnnotatedString, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString annotatedString) {
            C17188g.this.getState().I(true);
            C17188g.this.getState().C(true);
            C17188g c17188g = C17188g.this;
            c17188g.Z2(c17188g.getState(), annotatedString.getText(), C17188g.this.getReadOnly(), C17188g.this.getEnabled());
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lu1/v;", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$e */
    static final class e extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<TextLayoutResult> list) {
            boolean z10;
            if (C17188g.this.getState().l() != null) {
                androidx.compose.foundation.text.h0 h0VarL = C17188g.this.getState().l();
                Intrinsics.g(h0VarL);
                list.add(h0VarL.getValue());
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$f */
    static final class f extends Lambda implements Function1<AnnotatedString, Boolean> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString annotatedString) {
            C17188g c17188g = C17188g.this;
            c17188g.Z2(c17188g.getState(), annotatedString.getText(), C17188g.this.getReadOnly(), C17188g.this.getEnabled());
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$g, reason: collision with other inner class name */
    static final class C2565g extends Lambda implements Function1<AnnotatedString, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r1.u f162507g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2565g(r1.u uVar) {
            super(1);
            this.f162507g = uVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString annotatedString) {
            Unit unit;
            if (C17188g.this.getReadOnly() || !C17188g.this.getEnabled()) {
                return Boolean.FALSE;
            }
            z1.T inputSession = C17188g.this.getState().getInputSession();
            if (inputSession != null) {
                C17188g c17188g = C17188g.this;
                androidx.compose.foundation.text.T.INSTANCE.g(CollectionsKt.p(new C18368n(), new CommitTextCommand(annotatedString, 1)), c17188g.getState().getProcessor(), c17188g.getState().o(), inputSession);
                unit = Unit.f142422a;
            } else {
                unit = null;
            }
            if (unit == null) {
                C17188g c17188g2 = C17188g.this;
                c17188g2.getState().o().invoke(new TextFieldValue(StringsKt.U0(c17188g2.getValue().h(), androidx.compose.ui.text.y.n(c17188g2.getValue().getSelection()), androidx.compose.ui.text.y.i(c17188g2.getValue().getSelection()), annotatedString).toString(), C17207A.a(androidx.compose.ui.text.y.n(c17188g2.getValue().getSelection()) + annotatedString.length()), (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null));
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectionStart", "selectionEnd", "", "relativeToOriginalText", "a", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$h */
    static final class h extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {
        h() {
            super(3);
        }

        public final Boolean a(int i10, int i11, boolean z10) {
            if (!z10) {
                i10 = C17188g.this.getOffsetMapping().a(i10);
            }
            if (!z10) {
                i11 = C17188g.this.getOffsetMapping().a(i11);
            }
            boolean z11 = false;
            if (C17188g.this.getEnabled() && (i10 != androidx.compose.ui.text.y.n(C17188g.this.getValue().getSelection()) || i11 != androidx.compose.ui.text.y.i(C17188g.this.getValue().getSelection()))) {
                if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > C17188g.this.getValue().getText().length()) {
                    C17188g.this.getManager().z();
                } else {
                    if (z10 || i10 == i11) {
                        C17188g.this.getManager().z();
                    } else {
                        C17708Q.y(C17188g.this.getManager(), false, 1, null);
                    }
                    C17188g.this.getState().o().invoke(new TextFieldValue(C17188g.this.getValue().getText(), C17207A.b(i10, i11), (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null));
                    z11 = true;
                }
            }
            return Boolean.valueOf(z11);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
            return a(num.intValue(), num2.intValue(), bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$i */
    static final class i extends Lambda implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17188g.this.getState().n().invoke(androidx.compose.ui.text.input.a.j(C17188g.this.getImeOptions().getImeAction()));
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$j */
    static final class j extends Lambda implements Function0<Boolean> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            CoreTextFieldKt.q(C17188g.this.getState(), C17188g.this.getFocusRequester(), !C17188g.this.getReadOnly());
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$k */
    static final class k extends Lambda implements Function0<Boolean> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17708Q.y(C17188g.this.getManager(), false, 1, null);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u0.g$l */
    static final class l extends Lambda implements Function0<Boolean> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17708Q.r(C17188g.this.getManager(), false, 1, null);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u0.g$m */
    static final class m extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        m() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5815k.i(C17188g.this);
        }
    }

    @Override // androidx.compose.ui.node.u0
    /* renamed from: Z1 */
    public boolean getMergeDescendants() {
        return true;
    }

    public final void a3(TransformedText transformedText, TextFieldValue value, androidx.compose.foundation.text.B state, boolean readOnly, boolean enabled, boolean isPassword, InterfaceC18354E offsetMapping, C17708Q manager, ImeOptions imeOptions, androidx.compose.ui.focus.y focusRequester) {
        boolean z10 = this.enabled;
        boolean z11 = false;
        boolean z12 = z10 && !this.readOnly;
        boolean z13 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        C17708Q c17708q = this.manager;
        if (enabled && !readOnly) {
            z11 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z10 || z11 != z12 || !Intrinsics.e(imeOptions, imeOptions2) || isPassword != z13 || !androidx.compose.ui.text.y.h(value.getSelection())) {
            androidx.compose.ui.node.v0.b(this);
        }
        if (Intrinsics.e(manager, c17708q)) {
            return;
        }
        manager.n0(new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(androidx.compose.foundation.text.B state, String text, boolean readOnly, boolean enabled) {
        Unit unit;
        if (readOnly || !enabled) {
            return;
        }
        z1.T inputSession = state.getInputSession();
        if (inputSession != null) {
            androidx.compose.foundation.text.T.INSTANCE.g(CollectionsKt.p(new C18360f(), new CommitTextCommand(text, 1)), state.getProcessor(), state.o(), inputSession);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            state.o().invoke(new TextFieldValue(text, C17207A.a(text.length()), (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: R2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: S2, reason: from getter */
    public final androidx.compose.ui.focus.y getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        r1.s.m0(uVar, this.value.getText());
        r1.s.j0(uVar, this.transformedText.getText());
        r1.s.C0(uVar, this.value.getSelection());
        r1.s.f0(uVar, Q0.L.INSTANCE.a());
        r1.s.C(uVar, null, new d(), 1, null);
        if (!this.enabled) {
            r1.s.l(uVar);
        }
        if (this.isPassword) {
            r1.s.R(uVar);
        }
        boolean z10 = this.enabled && !this.readOnly;
        r1.s.i0(uVar, z10);
        r1.s.u(uVar, null, new e(), 1, null);
        if (z10) {
            r1.s.B0(uVar, null, new f(), 1, null);
            r1.s.z(uVar, null, new C2565g(uVar), 1, null);
        }
        r1.s.v0(uVar, null, new h(), 1, null);
        r1.s.G(uVar, this.imeOptions.getImeAction(), null, new i(), 2, null);
        r1.s.E(uVar, null, new j(), 1, null);
        r1.s.I(uVar, null, new k(), 1, null);
        if (!androidx.compose.ui.text.y.h(this.value.getSelection()) && !this.isPassword) {
            r1.s.h(uVar, null, new l(), 1, null);
            if (this.enabled && !this.readOnly) {
                r1.s.j(uVar, null, new b(), 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        r1.s.T(uVar, null, new c(), 1, null);
    }

    /* renamed from: T2, reason: from getter */
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    /* renamed from: U2, reason: from getter */
    public final C17708Q getManager() {
        return this.manager;
    }

    /* renamed from: V2, reason: from getter */
    public final InterfaceC18354E getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: W2, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: X2, reason: from getter */
    public final androidx.compose.foundation.text.B getState() {
        return this.state;
    }

    /* renamed from: Y2, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    public C17188g(TransformedText transformedText, TextFieldValue textFieldValue, androidx.compose.foundation.text.B b10, boolean z10, boolean z11, boolean z12, InterfaceC18354E interfaceC18354E, C17708Q c17708q, ImeOptions imeOptions, androidx.compose.ui.focus.y yVar) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = b10;
        this.readOnly = z10;
        this.enabled = z11;
        this.isPassword = z12;
        this.offsetMapping = interfaceC18354E;
        this.manager = c17708q;
        this.imeOptions = imeOptions;
        this.focusRequester = yVar;
        c17708q.n0(new a());
    }
}
