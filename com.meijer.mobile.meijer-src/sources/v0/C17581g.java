package v0;

import V0.q1;
import androidx.compose.foundation.text.n0;
import androidx.compose.runtime.N0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import g1.C14320x;
import kotlin.C17795k;
import kotlin.InterfaceC17771J;
import kotlin.InterfaceC17798n;
import kotlin.Metadata;
import kotlin.Selection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0017\u0010(\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b \u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lv0/g;", "Landroidx/compose/runtime/N0;", "", "selectableId", "Lw0/J;", "selectionRegistrar", "LV0/q0;", "backgroundSelectionColor", "Lv0/i;", "params", "<init>", "(JLw0/J;JLv0/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "b", "()V", "f", "e", "Lu1/v;", "textLayoutResult", "h", "(Lu1/v;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "g", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "LX0/f;", "drawScope", "c", "(LX0/f;)V", "a", "J", "Lw0/J;", "d", "Lv0/i;", "Lw0/n;", "Lw0/n;", "selectable", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17581g implements N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17771J selectionRegistrar;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C17583i params;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17798n selectable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "c", "()Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.g$a */
    static final class a extends Lambda implements Function0<LayoutCoordinates> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LayoutCoordinates invoke() {
            return C17581g.this.params.getLayoutCoordinates();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "c", "()Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.g$b */
    static final class b extends Lambda implements Function0<LayoutCoordinates> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LayoutCoordinates invoke() {
            return C17581g.this.params.getLayoutCoordinates();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu1/v;", "c", "()Lu1/v;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.g$c */
    static final class c extends Lambda implements Function0<TextLayoutResult> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final TextLayoutResult invoke() {
            return C17581g.this.params.getTextLayoutResult();
        }
    }

    public /* synthetic */ C17581g(long j10, InterfaceC17771J interfaceC17771J, long j11, C17583i c17583i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, interfaceC17771J, j11, c17583i);
    }

    private C17581g(long j10, InterfaceC17771J interfaceC17771J, long j11, C17583i c17583i) {
        this.selectableId = j10;
        this.selectionRegistrar = interfaceC17771J;
        this.backgroundSelectionColor = j11;
        this.params = c17583i;
        this.modifier = C14320x.b(C17582h.b(interfaceC17771J, j10, new a()), n0.b(), false, 2, null);
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        this.selectable = this.selectionRegistrar.b(new C17795k(this.selectableId, new b(), new c()));
    }

    public final void c(X0.f drawScope) {
        Selection selectionB = this.selectionRegistrar.d().b(this.selectableId);
        if (selectionB == null) {
            return;
        }
        int offset = !selectionB.getHandlesCrossed() ? selectionB.getStart().getOffset() : selectionB.getEnd().getOffset();
        int offset2 = !selectionB.getHandlesCrossed() ? selectionB.getEnd().getOffset() : selectionB.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        InterfaceC17798n interfaceC17798n = this.selectable;
        int iG = interfaceC17798n != null ? interfaceC17798n.g() : 0;
        q1 q1VarE = this.params.e(RangesKt.k(offset, iG), RangesKt.k(offset2, iG));
        if (q1VarE == null) {
            return;
        }
        if (!this.params.f()) {
            X0.f.W1(drawScope, q1VarE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.b() & 4294967295L));
        int iB = androidx.compose.ui.graphics.b.INSTANCE.b();
        X0.d drawContext = drawScope.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
            X0.f.W1(drawScope, q1VarE, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.g().i();
            drawContext.h(jB);
        }
    }

    /* renamed from: d, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        InterfaceC17798n interfaceC17798n = this.selectable;
        if (interfaceC17798n != null) {
            this.selectionRegistrar.e(interfaceC17798n);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        InterfaceC17798n interfaceC17798n = this.selectable;
        if (interfaceC17798n != null) {
            this.selectionRegistrar.e(interfaceC17798n);
            this.selectable = null;
        }
    }

    public final void g(LayoutCoordinates coordinates) {
        this.params = C17583i.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.f(this.selectableId);
    }

    public final void h(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !Intrinsics.e(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.g(this.selectableId);
        }
        this.params = C17583i.c(this.params, null, textLayoutResult, 1, null);
    }

    public /* synthetic */ C17581g(long j10, InterfaceC17771J interfaceC17771J, long j11, C17583i c17583i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, interfaceC17771J, j11, (i10 & 8) != 0 ? C17583i.INSTANCE.a() : c17583i, null);
    }
}
