package Oi;

import Ji.LocalThemeScope;
import Ni.l;
import Oi.C4490p;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.EnumC17895N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15862t0;
import ni.P0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LOi/p;", "LNi/c;", "LNi/l$o;", "state", "<init>", "(LNi/l$o;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$o;", "D", "()LNi/l$o;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "LOi/p$c;", "modalToShow", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Oi.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4490p implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.o state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Oi.p$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23873a;

        a(LocalThemeScope localThemeScope) {
            this.f23873a = localThemeScope;
        }

        public final void a(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1675215364, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalShowcase.Content.<anonymous>.<anonymous> (ModalShowcase.kt:113)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            LocalThemeScope localThemeScope = this.f23873a;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null), "$", null, composer, 384, 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.p$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<c> f23875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<c> f23876c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Oi.p$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23877a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<c> f23878b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<c> f23879c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Oi.p$b$a$a, reason: collision with other inner class name */
            static final class C0412a implements Function0<Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f23880a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<c> f23881b;

                C0412a(c cVar, InterfaceC5730l0<c> interfaceC5730l0) {
                    this.f23880a = cVar;
                    this.f23881b = interfaceC5730l0;
                }

                public final void a() {
                    C4490p.z(this.f23881b, this.f23880a);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
            @SourceDebugExtension
            /* renamed from: Oi.p$b$a$b, reason: collision with other inner class name */
            public static final class C0413b extends Lambda implements Function1<Integer, Object> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List f23882f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0413b(List list) {
                    super(1);
                    this.f23882f = list;
                }

                public final Object a(int i10) {
                    this.f23882f.get(i10);
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return a(num.intValue());
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
            @SourceDebugExtension
            /* renamed from: Oi.p$b$a$c */
            public static final class c extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List f23883f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f23884g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0 f23885h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(List list, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0) {
                    super(4);
                    this.f23883f = list;
                    this.f23884g = localThemeScope;
                    this.f23885h = interfaceC5730l0;
                }

                public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                    int i12;
                    if ((i11 & 6) == 0) {
                        i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        i12 |= composer.d(i10) ? 32 : 16;
                    }
                    if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    c cVar = (c) this.f23883f.get(i10);
                    composer.startReplaceGroup(524120428);
                    C15862t0 c15862t0 = C15862t0.f151797a;
                    String type = cVar.getType();
                    String type2 = cVar.getType();
                    LocalThemeScope localThemeScope = this.f23884g;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.d(cVar.ordinal());
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C0412a(cVar, this.f23885h);
                        composer.t(objB);
                    }
                    composer.P();
                    P0.k(localThemeScope, c15862t0, type, (Function0) objB, null, type2, true, 0L, false, composer, 1572912, HttpResponseStatus.SUCCESS_OK);
                    composer.P();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                    a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                    return Unit.f142422a;
                }
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-175795138, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ModalShowcase.kt:125)");
                }
                C5658d.f fVarO = C5658d.f48555a.o(this.f23877a.getAdsSpacing().getFour().getDp());
                e.b bVarG = P0.e.INSTANCE.g();
                InterfaceC14794C interfaceC14794CA = androidx.compose.foundation.layout.D.a(this.f23877a.getAdsSpacing().getFour().getDp());
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f23877a);
                final List<c> list = this.f23878b;
                final LocalThemeScope localThemeScope = this.f23877a;
                final InterfaceC5730l0<c> interfaceC5730l0 = this.f23879c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Oi.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C4490p.b.a.c(list, localThemeScope, interfaceC5730l0, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15342b.a(modifierF, null, interfaceC14794CA, false, fVarO, bVarG, null, false, null, (Function1) objB, composer, 196614, 458);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, List<? extends c> list, InterfaceC5730l0<c> interfaceC5730l0) {
                this.f23877a = localThemeScope;
                this.f23878b = list;
                this.f23879c = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(List list, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, l0.w LazyColumn) {
                Intrinsics.j(LazyColumn, "$this$LazyColumn");
                LazyColumn.i(list.size(), null, new C0413b(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new c(list, localThemeScope, interfaceC5730l0)));
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, List<? extends c> list, InterfaceC5730l0<c> interfaceC5730l0) {
            this.f23874a = localThemeScope;
            this.f23875b = list;
            this.f23876c = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1041778219, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalShowcase.Content.<anonymous>.<anonymous> (ModalShowcase.kt:121)");
            }
            LocalThemeScope localThemeScope = this.f23874a;
            Ri.b.b(localThemeScope, null, "Modals", "2.0", null, ComposableLambdaKt.c(-175795138, true, new a(localThemeScope, this.f23875b, this.f23876c), composer, 54), composer, 200064, 9);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LOi/p$c;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.p$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f23886b = new c("SimpleModal", 0, "Simple Modal");

        /* renamed from: c, reason: collision with root package name */
        public static final c f23887c = new c("ModalWithWarningIcon", 1, "With Warning Icon");

        /* renamed from: d, reason: collision with root package name */
        public static final c f23888d = new c("ModalWithBullets", 2, "With Bullets");

        /* renamed from: e, reason: collision with root package name */
        public static final c f23889e = new c("ModalWithPhoto", 3, "With Photo");

        /* renamed from: f, reason: collision with root package name */
        public static final c f23890f = new c("ModalSuperSimple", 4, "Super Simple");

        /* renamed from: g, reason: collision with root package name */
        public static final c f23891g = new c("ModalWithIllustration", 5, "With Illustration");

        /* renamed from: h, reason: collision with root package name */
        public static final c f23892h = new c("ModalWithCustomComponent", 6, "With Custom Component");

        /* renamed from: i, reason: collision with root package name */
        public static final c f23893i = new c("NonDismissibleModal", 7, "Non Dismissible Modal");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ c[] f23894j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f23895k;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String type;

        static {
            c[] cVarArrA = a();
            f23894j = cVarArrA;
            f23895k = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f23886b, f23887c, f23888d, f23889e, f23890f, f23891g, f23892h, f23893i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f23894j.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        private c(String str, int i10, String str2) {
            this.type = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(InterfaceC5730l0 interfaceC5730l0) {
        z(interfaceC5730l0, null);
        return Unit.f142422a;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.p$d */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f23886b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f23887c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f23888d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f23889e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f23890f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.f23891g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.f23892h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.f23893i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4490p(l.o state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.name = "Modal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(C4490p c4490p, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4490p.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(C4490p c4490p, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4490p.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    /* renamed from: D, reason: from getter */
    public l.o getState() {
        return this.state;
    }

    @Override // Ni.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427385416);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1427385416, i11, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalShowcase.Content (ModalShowcase.kt:85)");
            }
            C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composerStartRestartGroup, 3078, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            List listP = CollectionsKt.p(c.f23886b, c.f23887c, c.f23888d, c.f23889e, c.f23890f, c.f23891g, c.f23892h, c.f23893i);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), localThemeScope.getAdsSpacing().getFour().getDp());
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            int i12 = i11;
            C17891L0.b(ComposableLambdaKt.c(1675215364, true, new a(localThemeScope), composerStartRestartGroup, 54), null, c17893m0J, false, null, 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(1041778219, true, new b(localThemeScope, listP, interfaceC5730l0), composerStartRestartGroup, 54), composerStartRestartGroup, (C17893M0.f167209e << 6) | 805306374, 506);
            composerStartRestartGroup = composerStartRestartGroup;
            c cVarQ = q(interfaceC5730l0);
            switch (cVarQ == null ? -1 : d.$EnumSwitchMapping$0[cVarQ.ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(1059480564);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB2 = composerStartRestartGroup.B();
                    if (objB2 == companion.a()) {
                        objB2 = new Function0() { // from class: Oi.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.w(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB2);
                    }
                    composerStartRestartGroup.P();
                    z.w(localThemeScope, (Function0) objB2, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit = Unit.f142422a;
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(1059483389);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB3 = composerStartRestartGroup.B();
                    if (objB3 == companion.a()) {
                        objB3 = new Function0() { // from class: Oi.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.x(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB3);
                    }
                    composerStartRestartGroup.P();
                    z.s(localThemeScope, (Function0) objB3, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit2 = Unit.f142422a;
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(1059486361);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB4 = composerStartRestartGroup.B();
                    if (objB4 == companion.a()) {
                        objB4 = new Function0() { // from class: Oi.h
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.y(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB4);
                    }
                    composerStartRestartGroup.P();
                    z.k(localThemeScope, (Function0) objB4, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit3 = Unit.f142422a;
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(1059489143);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB5 = composerStartRestartGroup.B();
                    if (objB5 == companion.a()) {
                        objB5 = new Function0() { // from class: Oi.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.r(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB5);
                    }
                    composerStartRestartGroup.P();
                    z.q(localThemeScope, (Function0) objB5, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit4 = Unit.f142422a;
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(1059491929);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB6 = composerStartRestartGroup.B();
                    if (objB6 == companion.a()) {
                        objB6 = new Function0() { // from class: Oi.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.s(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB6);
                    }
                    composerStartRestartGroup.P();
                    z.i(localThemeScope, (Function0) objB6, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit5 = Unit.f142422a;
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(1059494942);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB7 = composerStartRestartGroup.B();
                    if (objB7 == companion.a()) {
                        objB7 = new Function0() { // from class: Oi.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.t(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB7);
                    }
                    composerStartRestartGroup.P();
                    z.o(localThemeScope, (Function0) objB7, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit6 = Unit.f142422a;
                    break;
                case 7:
                    composerStartRestartGroup.startReplaceGroup(1059498245);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB8 = composerStartRestartGroup.B();
                    if (objB8 == companion.a()) {
                        objB8 = new Function0() { // from class: Oi.l
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.u(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB8);
                    }
                    composerStartRestartGroup.P();
                    z.m(localThemeScope, (Function0) objB8, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit7 = Unit.f142422a;
                    break;
                case 8:
                    composerStartRestartGroup.startReplaceGroup(1059502556);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objB9 = composerStartRestartGroup.B();
                    if (objB9 == companion.a()) {
                        objB9 = new Function0() { // from class: Oi.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4490p.v(interfaceC5730l0);
                            }
                        };
                        composerStartRestartGroup.t(objB9);
                    }
                    composerStartRestartGroup.P();
                    z.u(localThemeScope, (Function0) objB9, composerStartRestartGroup, (i12 & 14) | 48);
                    composerStartRestartGroup.P();
                    Unit unit8 = Unit.f142422a;
                    break;
                default:
                    composerStartRestartGroup.startReplaceGroup(1059504708);
                    composerStartRestartGroup.P();
                    z(interfaceC5730l0, null);
                    Unit unit9 = Unit.f142422a;
                    break;
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4490p.A(this.f23865a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1987497167);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1987497167, i10, -1, "com.meijer.mobile.androidacres.showcase.assemblies.ModalShowcase.Controls (ModalShowcase.kt:163)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Oi.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4490p.B(this.f23868a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return this.name;
    }

    private static final c q(InterfaceC5730l0<c> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(InterfaceC5730l0<c> interfaceC5730l0, c cVar) {
        interfaceC5730l0.setValue(cVar);
    }
}
