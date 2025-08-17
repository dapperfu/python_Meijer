package com.meijer.mobile.meijer.activity.settings.debug;

import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.settings.debug.C12505b;
import com.meijer.mobile.meijer.activity.settings.debug.p0;
import d0.C13439f;
import d0.C13442i;
import j0.InterfaceC14810b;
import java.util.List;
import ji.InterfaceC14917U;
import ji.J0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import oi.C16078d;
import r0.C16692i;
import yl.AbstractC18227f;
import yl.AbstractC18253g;
import yr.C18299z;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001au\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LJi/M;", "", "searchTerm", "Lkotlin/Function1;", "", "onValueChange", "g", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "featureFlags", "Landroidx/compose/ui/Modifier;", "modifier", "onSearchTerm", "Lkotlin/Function2;", "Lyl/f;", "Lyl/g;", "onFlagStateChange", "", "onBulkFlagChange", "i", "(LJi/M;Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14917U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112236c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, Function1<? super String, Unit> function1) {
            this.f112234a = localThemeScope;
            this.f112235b = str;
            this.f112236c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC14917U interfaceC14917U, final Function1 function1, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            H1.N(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.a.B.f15320e, "Search", null, 8, null);
            AdsInputField.i(interfaceC14917U.getLabels().getPlaceholder(), "Search for feature flag (e.g. low_stock)");
            AdsInputField.t0(interfaceC14917U.getIcons().getInnerIcon(), C.f.p.f15524e, "Clear search", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p0.a.g(function1);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1) {
            function1.invoke("");
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14917U Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(591537322, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.SearchBar.<anonymous> (SearchableFeatureFlags.kt:54)");
            }
            q1.f.TextInput textInputY = q1.f.TextInput.y(Assemble.getInputFields().getStatic(), C18299z.f(androidx.compose.ui.focus.A.a(C13439f.e(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.D(Assemble.getInputFields().getStatic().getModifier(), null, false, 3, null), this.f112234a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C13442i.a(this.f112234a.getAdsSpacing().getOne().getDp(), this.f112234a.getAdsColors().getAdsColorUIBackground01().getColor()), C16692i.c(this.f112234a.getAdsSpacing().getTwo().getDp())), new androidx.compose.ui.focus.y()), "searchBar", null, 2, null), false, null, null, null, null, null, false, 0, null, null, null, 4094, null);
            LocalThemeScope localThemeScope = this.f112234a;
            String str = this.f112235b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f112236c);
            final Function1<String, Unit> function1 = this.f112236c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p0.a.e(function1, (String) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function12 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f112236c);
            final Function1<String, Unit> function13 = this.f112236c;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p0.a.f(Assemble, function13, (H1) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInputY, null, function12, (Function1) objB2, composer, (q1.f.TextInput.f140038m << 6) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14917U interfaceC14917U, Composer composer, Integer num) {
            d(interfaceC14917U, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<AbstractC18253g, AbstractC18253g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<AbstractC18227f, AbstractC18253g, Unit> f112237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12505b.DebugFeatureFlag f112238b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super AbstractC18227f, ? super AbstractC18253g, Unit> function2, C12505b.DebugFeatureFlag debugFeatureFlag) {
            this.f112237a = function2;
            this.f112238b = debugFeatureFlag;
        }

        public final void a(AbstractC18253g abstractC18253g, AbstractC18253g newState) {
            Intrinsics.j(abstractC18253g, "<unused var>");
            Intrinsics.j(newState, "newState");
            this.f112237a.invoke(this.f112238b.getFeature(), newState);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18253g abstractC18253g, AbstractC18253g abstractC18253g2) {
            a(abstractC18253g, abstractC18253g2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112239a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112240a;

            a(LocalThemeScope localThemeScope) {
                this.f112240a = localThemeScope;
            }

            public final void a(InterfaceC14810b AdsBox, Composer composer, int i10) {
                Intrinsics.j(AdsBox, "$this$AdsBox");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1620248760, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.SearchableFeatureFlags.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableFeatureFlags.kt:157)");
                }
                LocalThemeScope localThemeScope = this.f112240a;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), H1.h.p(16)), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 374, null), "No results found.", null, composer, LocalThemeScope.f15770g | 384 | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
                a(interfaceC14810b, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope) {
            this.f112239a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(800672296, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.SearchableFeatureFlags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableFeatureFlags.kt:156)");
            }
            C16078d.c(this.f112239a, new q1.Box(null, P0.e.INSTANCE.e(), false, 5, null), ComposableLambdaKt.c(-1620248760, true, new a(this.f112239a), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Box.f139936d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f112241f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(1);
            this.f112241f = list;
        }

        public final Object a(int i10) {
            this.f112241f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f112242f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112243g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f112244h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f112245i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, LocalThemeScope localThemeScope, Function2 function2, List list2) {
            super(4);
            this.f112242f = list;
            this.f112243g = localThemeScope;
            this.f112244h = function2;
            this.f112245i = list2;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            C12505b.DebugFeatureFlag debugFeatureFlag = (C12505b.DebugFeatureFlag) this.f112242f.get(i10);
            composer.startReplaceGroup(1477938272);
            LocalThemeScope localThemeScope = this.f112243g;
            AbstractC18227f feature = debugFeatureFlag.getFeature();
            AbstractC18253g state = debugFeatureFlag.getState();
            boolean isEnabled = debugFeatureFlag.getIsEnabled();
            Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f112244h) | composer.D(debugFeatureFlag);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f112244h, debugFeatureFlag);
                composer.t(objB);
            }
            composer.P();
            C12522t.f(localThemeScope, feature, state, isEnabled, modifierD, (Function2) objB, composer, LocalThemeScope.f15770g | 24576, 0);
            composer.startReplaceGroup(-1060691139);
            if (i10 < CollectionsKt.o(this.f112245i)) {
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            }
            composer.P();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(1);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1) {
        function1.invoke(2);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(0);
        return Unit.f142422a;
    }

    public static final void g(final LocalThemeScope localThemeScope, final String searchTerm, final Function1<? super String, Unit> onValueChange, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504920114);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(searchTerm) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onValueChange) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1504920114, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.SearchBar (SearchableFeatureFlags.kt:52)");
            }
            Ji.Q.e(localThemeScope, J0.f139671a, ComposableLambdaKt.c(591537322, true, new a(localThemeScope, searchTerm, onValueChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (J0.f139672b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.h(localThemeScope, searchTerm, onValueChange, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, Function1 function1, int i10, Composer composer, int i11) {
        g(localThemeScope, str, function1, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0149  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r41, final java.lang.String r42, final java.util.List<com.meijer.mobile.meijer.activity.settings.debug.C12505b.DebugFeatureFlag> r43, androidx.compose.ui.Modifier r44, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r45, final kotlin.jvm.functions.Function2<? super yl.AbstractC18227f, ? super yl.AbstractC18253g, kotlin.Unit> r46, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.p0.i(Ji.M, java.lang.String, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(List list, LocalThemeScope localThemeScope, Function2 function2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new d(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new e(list, localThemeScope, function2, list)));
        if (list.isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(800672296, true, new c(localThemeScope)), 3, null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, String str, List list, Modifier modifier, Function1 function1, Function2 function2, Function1 function12, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, str, list, modifier, function1, function2, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
