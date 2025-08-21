package kotlin;

import androidx.compose.ui.text.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Selection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\b*\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lu1/v;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/y;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Lw0/C;", "c", "(Lu1/v;IIIJZZ)Lw0/C;", "Lw0/f;", "x", "y", "f", "(Lw0/f;Lw0/f;)Lw0/f;", "offset", "LF1/i;", "b", "(Lu1/v;I)LF1/i;", "e", "(Lu1/v;I)Z", "Lw0/p;", "layout", "d", "(Lw0/p;Lw0/C;)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17766E {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/o;", "it", "", "a", "(Lw0/o;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.E$b */
    static final class b extends Lambda implements Function1<C17799o, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f166470f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.BooleanRef booleanRef) {
            super(1);
            this.f166470f = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17799o c17799o) {
            a(c17799o);
            return Unit.f143329a;
        }

        public final void a(C17799o c17799o) {
            if (c17799o.c().length() > 0) {
                this.f166470f.f143735a = false;
            }
        }
    }

    public static final InterfaceC17764C c(TextLayoutResult textLayoutResult, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new SingleSelectionLayout(z11, 1, 1, z10 ? null : new Selection(new Selection.AnchorInfo(b(textLayoutResult, y.n(j10)), y.n(j10), 1L), new Selection.AnchorInfo(b(textLayoutResult, y.i(j10)), y.i(j10), 1L), y.m(j10)), new C17799o(1L, 1, i10, i11, i12, textLayoutResult));
    }

    public static final boolean d(Selection selection, InterfaceC17764C interfaceC17764C) {
        if (selection == null || interfaceC17764C == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (interfaceC17764C.c().l() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f143735a = true;
        interfaceC17764C.g(new b(booleanRef));
        return booleanRef.f143735a;
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.E$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17790f.values().length];
            try {
                iArr[EnumC17790f.f166727a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17790f.f166728b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17790f.f166729c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EnumC17790f f(EnumC17790f enumC17790f, EnumC17790f enumC17790f2) {
        int[] iArr = a.$EnumSwitchMapping$0;
        int i10 = iArr[enumC17790f2.ordinal()];
        if (i10 == 1) {
            return EnumC17790f.f166727a;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return EnumC17790f.f166729c;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i11 = iArr[enumC17790f.ordinal()];
        if (i11 == 1) {
            return EnumC17790f.f166727a;
        }
        if (i11 == 2) {
            return EnumC17790f.f166728b;
        }
        if (i11 == 3) {
            return EnumC17790f.f166729c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F1.i b(TextLayoutResult textLayoutResult, int i10) {
        if (e(textLayoutResult, i10)) {
            return textLayoutResult.y(i10);
        }
        return textLayoutResult.c(i10);
    }

    private static final boolean e(TextLayoutResult textLayoutResult, int i10) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int iQ = textLayoutResult.q(i10);
            if (i10 == 0 || iQ != textLayoutResult.q(i10 - 1)) {
                if (i10 != textLayoutResult.getLayoutInput().getText().length() && iQ == textLayoutResult.q(i10 + 1)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
