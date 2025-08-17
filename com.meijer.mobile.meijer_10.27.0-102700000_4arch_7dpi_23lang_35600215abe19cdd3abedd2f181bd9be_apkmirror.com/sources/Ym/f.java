package Ym;

import H1.h;
import V0.C5346q0;
import Ym.f;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.k;
import com.meijer.mobile.meijer.activity.find.filter.o;
import j0.InterfaceC14800I;
import kotlin.C17877E0;
import kotlin.C17943i;
import kotlin.C17979v;
import kotlin.C17983x;
import kotlin.C17986y0;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y0.C18106a;
import z0.C18347a;
import z0.C18349c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\u000f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "state", "", "e", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/k;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "upArrow", "", "upArrowText", "title", "onReset", "", "showCloseButton", "i", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40434a;

        a(String str) {
            this.f40434a = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(595139118, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.StatelessFilterAppBar.<anonymous> (TopBar.kt:71)");
            }
            N1.b(this.f40434a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f40435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40437c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40438a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f40439b;

            a(boolean z10, String str) {
                this.f40438a = z10;
                this.f40439b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1377587148, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.StatelessFilterAppBar.<anonymous>.<anonymous> (TopBar.kt:63)");
                }
                if (this.f40438a) {
                    composer.startReplaceGroup(1286252873);
                    C17988z0.b(C18349c.a(C18106a.C2738a.f170014a), this.f40439b, null, 0L, composer, 0, 12);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1286351205);
                    C17988z0.b(C18347a.a(C18106a.C2738a.f170014a), this.f40439b, null, 0L, composer, 0, 12);
                    composer.P();
                }
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

        b(Function0<Unit> function0, boolean z10, String str) {
            this.f40435a = function0;
            this.f40436b = z10;
            this.f40437c = str;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(685199408, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.StatelessFilterAppBar.<anonymous> (TopBar.kt:62)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f40435a);
            final Function0<Unit> function0 = this.f40435a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.b.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17986y0.a((Function0) objB, null, false, null, ComposableLambdaKt.c(1377587148, true, new a(this.f40436b, this.f40437c), composer, 54), composer, 24576, 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f40440a;

        c(Function0<Unit> function0) {
            this.f40440a = function0;
        }

        public final void a(InterfaceC14800I TopAppBar, Composer composer, int i10) {
            Intrinsics.j(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1245094183, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.StatelessFilterAppBar.<anonymous> (TopBar.kt:75)");
            }
            C17983x.d(this.f40440a, D.i(Modifier.INSTANCE, h.p(8)), true, null, null, null, null, C17979v.f168713a.i(0L, C5346q0.INSTANCE.k(), 0L, composer, (C17979v.f168724l << 9) | 48, 5), null, Ym.a.f40420a.a(), composer, 805306800, 376);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final com.meijer.mobile.meijer.activity.find.filter.o r8, final com.meijer.mobile.meijer.activity.find.filter.k r9, androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ym.f.e(com.meijer.mobile.meijer.activity.find.filter.o, com.meijer.mobile.meijer.activity.find.filter.k, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(o oVar) {
        oVar.u(j.c.f106722a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(o oVar) {
        oVar.u(j.d.f106723a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(o oVar, k kVar, int i10, Composer composer, int i11) {
        e(oVar, kVar, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void i(final Function0<Unit> upArrow, final String upArrowText, final String title, final Function0<Unit> onReset, final boolean z10, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(upArrow, "upArrow");
        Intrinsics.j(upArrowText, "upArrowText");
        Intrinsics.j(title, "title");
        Intrinsics.j(onReset, "onReset");
        Composer composerStartRestartGroup = composer.startRestartGroup(-714766742);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(upArrow) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(upArrowText) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(title) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onReset) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-714766742, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.topbar.StatelessFilterAppBar (TopBar.kt:59)");
            }
            composer2 = composerStartRestartGroup;
            C17943i.d(ComposableLambdaKt.c(595139118, true, new a(title), composerStartRestartGroup, 54), null, ComposableLambdaKt.c(685199408, true, new b(upArrow, z10, upArrowText), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1245094183, true, new c(onReset), composerStartRestartGroup, 54), C17877E0.f166879a.a(composerStartRestartGroup, C17877E0.f166880b).j(), 0L, 0.0f, composer2, 3462, 98);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.j(upArrow, upArrowText, title, onReset, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0, String str, String str2, Function0 function02, boolean z10, int i10, Composer composer, int i11) {
        i(function0, str, str2, function02, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
