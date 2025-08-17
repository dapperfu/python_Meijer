package androidx.compose.foundation.selection;

import androidx.compose.foundation.d;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13428B;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/selection/b;", "Landroidx/compose/foundation/d;", "", "value", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "s3", "(ZLh0/l;Ld0/B;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)V", "Lr1/u;", "X2", "(Lr1/u;)V", "J", "Z", "K", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "L", "Lkotlin/jvm/functions/Function0;", "get_onClick", "()Lkotlin/jvm/functions/Function0;", "_onClick", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends d {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean value;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Boolean, Unit> onValueChange;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> _onClick;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f48970f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f48970f = function1;
            this.f48971g = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f48970f.invoke(Boolean.valueOf(!this.f48971g));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.selection.b$b, reason: collision with other inner class name */
    static final class C1003b extends Lambda implements Function0<Unit> {
        C1003b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b.this.onValueChange.invoke(Boolean.valueOf(!b.this.value));
        }
    }

    public /* synthetic */ b(boolean z10, l lVar, InterfaceC13428B interfaceC13428B, boolean z11, Role role, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, lVar, interfaceC13428B, z11, role, function1);
    }

    private b(boolean z10, l lVar, InterfaceC13428B interfaceC13428B, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
        super(lVar, interfaceC13428B, z11, null, role, new a(function1, z10), null);
        this.value = z10;
        this.onValueChange = function1;
        this._onClick = new C1003b();
    }

    @Override // androidx.compose.foundation.a
    public void X2(u uVar) {
        s.G0(uVar, t1.b.a(this.value));
    }

    public final void s3(boolean value, l interactionSource, InterfaceC13428B indicationNodeFactory, boolean enabled, Role role, Function1<? super Boolean, Unit> onValueChange) {
        if (this.value != value) {
            this.value = value;
            v0.b(this);
        }
        this.onValueChange = onValueChange;
        super.p3(interactionSource, indicationNodeFactory, enabled, null, role, this._onClick);
    }
}
