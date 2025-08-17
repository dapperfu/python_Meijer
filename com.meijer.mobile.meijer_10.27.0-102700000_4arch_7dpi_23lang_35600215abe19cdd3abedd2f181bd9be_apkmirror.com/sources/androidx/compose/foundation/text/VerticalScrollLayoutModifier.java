package androidx.compose.foundation.text;

import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.TransformedText;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text/x0;", "Landroidx/compose/ui/layout/B;", "Landroidx/compose/foundation/text/d0;", "scrollerPosition", "", "cursorOffset", "Lz1/U;", "transformedText", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/h0;", "textLayoutResultProvider", "<init>", "(Landroidx/compose/foundation/text/d0;ILz1/U;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/text/d0;", "c", "()Landroidx/compose/foundation/text/d0;", "I", "d", "Lz1/U;", "o", "()Lz1/U;", "e", "Lkotlin/jvm/functions/Function0;", "n", "()Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.x0, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class VerticalScrollLayoutModifier implements androidx.compose.ui.layout.B {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 scrollerPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cursorOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<h0> textLayoutResultProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.x0$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f49798f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ VerticalScrollLayoutModifier f49799g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.f0 f49800h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49801i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.K k10, VerticalScrollLayoutModifier verticalScrollLayoutModifier, androidx.compose.ui.layout.f0 f0Var, int i10) {
            super(1);
            this.f49798f = k10;
            this.f49799g = verticalScrollLayoutModifier;
            this.f49800h = f0Var;
            this.f49801i = i10;
        }

        public final void a(f0.a aVar) {
            androidx.compose.ui.layout.K k10 = this.f49798f;
            int cursorOffset = this.f49799g.getCursorOffset();
            TransformedText transformedText = this.f49799g.getTransformedText();
            h0 h0VarInvoke = this.f49799g.n().invoke();
            this.f49799g.getScrollerPosition().k(EnumC13827z.f130585a, b0.c(k10, cursorOffset, transformedText, h0VarInvoke != null ? h0VarInvoke.getValue() : null, false, this.f49800h.getWidth()), this.f49801i, this.f49800h.getHeight());
            f0.a.l(aVar, this.f49800h, 0, Math.round(-this.f49799g.getScrollerPosition().d()), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.ui.layout.B
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        androidx.compose.ui.layout.f0 f0VarK0 = i10.k0(H1.b.d(j10, 0, 0, 0, a.e.API_PRIORITY_OTHER, 7, null));
        int iMin = Math.min(f0VarK0.getHeight(), H1.b.k(j10));
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), iMin, null, new a(k10, this, f0VarK0, iMin), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) other;
        return Intrinsics.e(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && Intrinsics.e(this.transformedText, verticalScrollLayoutModifier.transformedText) && Intrinsics.e(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }

    /* renamed from: b, reason: from getter */
    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    /* renamed from: c, reason: from getter */
    public final d0 getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final Function0<h0> n() {
        return this.textLayoutResultProvider;
    }

    /* renamed from: o, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public VerticalScrollLayoutModifier(d0 d0Var, int i10, TransformedText transformedText, Function0<h0> function0) {
        this.scrollerPosition = d0Var;
        this.cursorOffset = i10;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = function0;
    }
}
