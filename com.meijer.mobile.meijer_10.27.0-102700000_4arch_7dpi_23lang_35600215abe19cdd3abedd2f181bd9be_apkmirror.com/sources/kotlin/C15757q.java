package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Ln0/r;", "itemProvider", "Ln0/Z;", "LL0/e;", "saveableStateHolder", "", "index", "", "key", "", "a", "(Ln0/r;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15757q {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n0.q$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15758r f150931f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f150932g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f150933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC15758r interfaceC15758r, int i10, Object obj) {
            super(2);
            this.f150931f = interfaceC15758r;
            this.f150932g = i10;
            this.f150933h = obj;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:129)");
            }
            this.f150931f.h(this.f150932g, this.f150933h, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.q$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15758r f150934f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f150935g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f150936h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f150937i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f150938j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC15758r interfaceC15758r, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f150934f = interfaceC15758r;
            this.f150935g = obj;
            this.f150936h = i10;
            this.f150937i = obj2;
            this.f150938j = i11;
        }

        public final void a(Composer composer, int i10) {
            C15757q.a(this.f150934f, this.f150935g, this.f150936h, this.f150937i, composer, J0.a(this.f150938j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC15758r interfaceC15758r, Object obj, int i10, Object obj2, Composer composer, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(1439843069);
        if ((i11 & 6) == 0) {
            if (composerStartRestartGroup.V(interfaceC15758r)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (composerStartRestartGroup.V(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (composerStartRestartGroup.d(i10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (composerStartRestartGroup.V(obj2)) {
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
                ComposerKt.U(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((L0.e) obj).d(obj2, ComposableLambdaKt.c(980966366, true, new a(interfaceC15758r, i10, obj2), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(interfaceC15758r, obj, i10, obj2, i11));
        }
    }
}
