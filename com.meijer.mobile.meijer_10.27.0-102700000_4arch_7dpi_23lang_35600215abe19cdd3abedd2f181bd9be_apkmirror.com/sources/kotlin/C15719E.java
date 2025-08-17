package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.r;
import androidx.compose.ui.layout.d0;
import androidx.compose.ui.layout.e0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "", "index", "Ln0/F;", "pinnedItemList", "Lkotlin/Function0;", "", "content", "a", "(Ljava/lang/Object;ILn0/F;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15719E {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.E$a */
    static final class a extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15718D f150791f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n0/E$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: n0.E$a$a, reason: collision with other inner class name */
        public static final class C2323a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C15718D f150792a;

            public C2323a(C15718D c15718d) {
                this.f150792a = c15718d;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f150792a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C15718D c15718d) {
            super(1);
            this.f150791f = c15718d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new C2323a(this.f150791f);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.E$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f150793f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f150794g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C15720F f150795h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f150796i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f150797j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i10, C15720F c15720f, Function2<? super Composer, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f150793f = obj;
            this.f150794g = i10;
            this.f150795h = c15720f;
            this.f150796i = function2;
            this.f150797j = i11;
        }

        public final void a(Composer composer, int i10) {
            C15719E.a(this.f150793f, this.f150794g, this.f150795h, this.f150796i, composer, J0.a(this.f150797j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Object obj, int i10, C15720F c15720f, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079116560);
        if ((i11 & 6) == 0) {
            if (composerStartRestartGroup.D(obj)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (composerStartRestartGroup.D(c15720f)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i13 = RecyclerView.m.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zV = composerStartRestartGroup.V(obj) | composerStartRestartGroup.V(c15720f);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C15718D(obj, c15720f);
                composerStartRestartGroup.t(objB);
            }
            C15718D c15718d = (C15718D) objB;
            c15718d.e(i10);
            c15718d.f((d0) composerStartRestartGroup.o(e0.a()));
            boolean zV2 = composerStartRestartGroup.V(c15718d);
            Object objB2 = composerStartRestartGroup.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new a(c15718d);
                composerStartRestartGroup.t(objB2);
            }
            J.c(c15718d, (Function1) objB2, composerStartRestartGroup, 0);
            r.a(e0.a().d(c15718d), function2, composerStartRestartGroup, ((i12 >> 6) & 112) | G0.f49976i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(obj, i10, c15720f, function2, i11));
        }
    }
}
