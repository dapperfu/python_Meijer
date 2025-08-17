package com.meijer.mobile.mperks.ux.rewards;

import H1.h;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.T;
import Vl.HomeMperksClippedReward;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bo.ClippedReward;
import bo.RewardDetail;
import bo.g;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import com.meijer.mobile.mperks.ux.f0;
import com.meijer.mobile.mperks.ux.j0;
import com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity;
import e.C13589e;
import hi.C14476c;
import hi.TrackingData;
import j$.time.ZonedDateTime;
import j0.InterfaceC14794C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.q1;
import kotlin.C17921a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import l0.InterfaceC15343c;
import l0.w;
import p1.C16193g;
import pi.C16307b;
import qo.C16569c;
import ri.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n*\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewards/ViewAllRewardsActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "LJi/M;", "", "Lbo/d;", "rewards", "Landroidx/compose/ui/Modifier;", "modifier", "", "B1", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lbo/g;", "navigationRequest", "J1", "(Lbo/g;)V", "reward", "", "mperksPoints", "L1", "(Lbo/d;Ljava/lang/String;)V", "E1", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lbo/j;", "rewardDetail", "K1", "(Lbo/j;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "C", "Ljava/lang/String;", "getMperksPoints", "()Ljava/lang/String;", "setMperksPoints", "(Ljava/lang/String;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ViewAllRewardsActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String mperksPoints;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<bo.g, Unit> {
        a(Object obj) {
            super(1, obj, ViewAllRewardsActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/mperks/model/common/MperksNavigationRequest;)V", 0);
        }

        public final void a(bo.g p02) {
            Intrinsics.j(p02, "p0");
            ((ViewAllRewardsActivity) this.receiver).J1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(bo.g gVar) {
            a(gVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f114625f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ClippedReward clippedReward) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f114626f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f114627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f114626f = function1;
            this.f114627g = list;
        }

        public final Object a(int i10) {
            return this.f114626f.invoke(this.f114627g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f114628f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114629g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ViewAllRewardsActivity f114630h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, ViewAllRewardsActivity viewAllRewardsActivity) {
            super(4);
            this.f114628f = list;
            this.f114629g = localThemeScope;
            this.f114630h = viewAllRewardsActivity;
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
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ClippedReward clippedReward = (ClippedReward) this.f114628f.get(i10);
            composer.startReplaceGroup(-102480332);
            LocalThemeScope localThemeScope = this.f114629g;
            Modifier modifierH = J.h(J.D(Modifier.INSTANCE, null, false, 3, null), 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f114630h);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(this.f114630h);
                composer.t(objB);
            }
            composer.P();
            C16569c.c(localThemeScope, clippedReward, modifierH, false, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | 384, 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114631a;

        e(LocalThemeScope localThemeScope) {
            this.f114631a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1290838067, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.ViewAllRewardsTopBar.<anonymous> (ViewAllRewardsActivity.kt:178)");
            }
            LocalThemeScope localThemeScope = this.f114631a;
            j.h(localThemeScope, new q1.Label(null, this.f114631a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null), C16193g.c(j0.f114133I1, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f114632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewAllRewardsActivity f114633b;

        f(LocalThemeScope localThemeScope, ViewAllRewardsActivity viewAllRewardsActivity) {
            this.f114632a = localThemeScope;
            this.f114633b = viewAllRewardsActivity;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1939430837, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.ViewAllRewardsTopBar.<anonymous> (ViewAllRewardsActivity.kt:188)");
            }
            LocalThemeScope localThemeScope = this.f114632a;
            C.f.d dVar = C.f.d.f15507e;
            T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f114633b);
            final ViewAllRewardsActivity viewAllRewardsActivity = this.f114633b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.rewards.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ViewAllRewardsActivity.f.c(viewAllRewardsActivity);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(dVar, C16193g.c(j0.f114269w, composer, 0), null, null, 0.0f, adsColorInverse, D.m(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), h.p(8), 0.0f, 0.0f, 0.0f, 14, null), 28, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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
        public static final Unit c(ViewAllRewardsActivity viewAllRewardsActivity) {
            viewAllRewardsActivity.finish();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ClippedReward> f114635b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewAllRewardsActivity f114636a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<ClippedReward> f114637b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity$g$a$a, reason: collision with other inner class name */
            static final class C1818a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ViewAllRewardsActivity f114638a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114639b;

                C1818a(ViewAllRewardsActivity viewAllRewardsActivity, LocalThemeScope localThemeScope) {
                    this.f114638a = viewAllRewardsActivity;
                    this.f114639b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(912973128, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ViewAllRewardsActivity.kt:85)");
                    }
                    this.f114638a.E1(this.f114639b, null, composer, LocalThemeScope.f15770g, 1);
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
            static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<ClippedReward> f114640a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ViewAllRewardsActivity f114641b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f114642c;

                b(List<ClippedReward> list, ViewAllRewardsActivity viewAllRewardsActivity, LocalThemeScope localThemeScope) {
                    this.f114640a = list;
                    this.f114641b = viewAllRewardsActivity;
                    this.f114642c = localThemeScope;
                }

                public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-974547345, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ViewAllRewardsActivity.kt:87)");
                    }
                    if (!this.f114640a.isEmpty()) {
                        this.f114641b.B1(this.f114642c, this.f114640a, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer, LocalThemeScope.f15770g, 0);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    a(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(ViewAllRewardsActivity viewAllRewardsActivity, List<ClippedReward> list) {
                this.f114636a = viewAllRewardsActivity;
                this.f114637b = list;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1002689683, i11, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.onCreate.<anonymous>.<anonymous> (ViewAllRewardsActivity.kt:83)");
                }
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(912973128, true, new C1818a(this.f114636a, AdsTheme), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-974547345, true, new b(this.f114637b, this.f114636a, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        g(List<ClippedReward> list) {
            this.f114635b = list;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1027895068, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.onCreate.<anonymous> (ViewAllRewardsActivity.kt:82)");
            }
            K.b(null, ComposableLambdaKt.c(-1002689683, true, new a(ViewAllRewardsActivity.this, this.f114635b), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(final Ji.LocalThemeScope r20, final java.util.List<bo.ClippedReward> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.B1(Ji.M, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(List list, LocalThemeScope localThemeScope, ViewAllRewardsActivity viewAllRewardsActivity, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new c(b.f114625f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope, viewAllRewardsActivity)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(ViewAllRewardsActivity viewAllRewardsActivity, LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        viewAllRewardsActivity.B1(localThemeScope, list, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r4 = r21
            r0 = 896724335(0x3572ed6f, float:9.0497537E-7)
            r3 = r20
            androidx.compose.runtime.Composer r14 = r3.startRestartGroup(r0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r22 & r3
            if (r3 == 0) goto L18
            r3 = r4 | 6
            goto L31
        L18:
            r3 = r4 & 6
            if (r3 != 0) goto L30
            r3 = r4 & 8
            if (r3 != 0) goto L25
            boolean r3 = r14.V(r2)
            goto L29
        L25:
            boolean r3 = r14.D(r2)
        L29:
            if (r3 == 0) goto L2d
            r3 = 4
            goto L2e
        L2d:
            r3 = 2
        L2e:
            r3 = r3 | r4
            goto L31
        L30:
            r3 = r4
        L31:
            r5 = r22 & 1
            if (r5 == 0) goto L3a
            r3 = r3 | 48
        L37:
            r6 = r19
            goto L4c
        L3a:
            r6 = r4 & 48
            if (r6 != 0) goto L37
            r6 = r19
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L49
            r7 = 32
            goto L4b
        L49:
            r7 = 16
        L4b:
            r3 = r3 | r7
        L4c:
            r7 = r22 & 2
            if (r7 == 0) goto L53
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L63
        L53:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L63
            boolean r7 = r14.D(r1)
            if (r7 == 0) goto L60
            r7 = 256(0x100, float:3.59E-43)
            goto L62
        L60:
            r7 = 128(0x80, float:1.8E-43)
        L62:
            r3 = r3 | r7
        L63:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L75
            boolean r7 = r14.j()
            if (r7 != 0) goto L70
            goto L75
        L70:
            r14.K()
        L73:
            r3 = r6
            goto Lc4
        L75:
            if (r5 == 0) goto L7a
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            r6 = r5
        L7a:
            boolean r5 = androidx.compose.runtime.ComposerKt.M()
            if (r5 == 0) goto L86
            r5 = -1
            java.lang.String r7 = "com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.ViewAllRewardsTopBar (ViewAllRewardsActivity.kt:174)"
            androidx.compose.runtime.ComposerKt.U(r0, r3, r5, r7)
        L86:
            Ji.z r0 = r2.getAdsColors()
            Ji.T r0 = r0.getAdsColorBrandPrimary()
            long r9 = r0.getColor()
            com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity$e r0 = new com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity$e
            r0.<init>(r2)
            r5 = 1290838067(0x4cf0a033, float:1.2615721E8)
            r7 = 1
            r8 = 54
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r5, r7, r0, r14, r8)
            com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity$f r0 = new com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity$f
            r0.<init>(r2, r1)
            r11 = 1939430837(0x73995db5, float:2.430182E31)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r11, r7, r0, r14, r8)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r15 = r0 | 390(0x186, float:5.47E-43)
            r16 = 104(0x68, float:1.46E-43)
            r8 = 0
            r11 = 0
            r13 = 0
            kotlin.C17943i.d(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.M()
            if (r0 == 0) goto L73
            androidx.compose.runtime.ComposerKt.T()
            goto L73
        Lc4:
            androidx.compose.runtime.T0 r6 = r14.l()
            if (r6 == 0) goto Ld4
            qo.P r0 = new qo.P
            r5 = r22
            r0.<init>()
            r6.a(r0)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewards.ViewAllRewardsActivity.E1(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(ViewAllRewardsActivity viewAllRewardsActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        viewAllRewardsActivity.E1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(bo.g navigationRequest) {
        if (navigationRequest instanceof g.OnClippedRewardCardClicked) {
            g.OnClippedRewardCardClicked onClippedRewardCardClicked = (g.OnClippedRewardCardClicked) navigationRequest;
            K1(onClippedRewardCardClicked.getClippedReward().i());
            L1(onClippedRewardCardClicked.getClippedReward(), this.mperksPoints);
        }
    }

    private final void K1(RewardDetail rewardDetail) {
        startActivity(f0.f114022a.e(this, rewardDetail, "MPERKS_REWARDS_TAB", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ClippedReward clippedReward, String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Rewards");
        track.h("rewardID", clippedReward.getRewardId() + ": " + clippedReward.getName());
        ZonedDateTime endDate = clippedReward.getEndDate();
        if (endDate != null) {
            track.h("rewardValidThroughDate", endDate.format(C17590a.DATE_FORMAT_MM_DD_YYYY).toString());
        }
        track.h("daysLeftToApply", String.valueOf(clippedReward.getDaysLeft()));
        track.h("mperksPoints", String.valueOf(str));
        track.h("previousTrackAction", "View All Rewards: Reward Clicked");
        return Unit.f142422a;
    }

    private final void L1(final ClippedReward reward, final String mperksPoints) {
        o1().h(C14476c.h("mPerks:Reward Details Page"), new Function1() { // from class: qo.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewAllRewardsActivity.M1(reward, mperksPoints, (TrackingData) obj);
            }
        });
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        boolean zContainsKey;
        ArrayList parcelableArrayListExtra;
        List listM;
        ArrayList parcelableArrayListExtra2;
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            zContainsKey = extras.containsKey("com.meijer.intent.extra.EXTRA_REWARD_COUPON_LIST");
        } else {
            zContainsKey = false;
        }
        if (zContainsKey) {
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_LIST", HomeMperksClippedReward.class);
            } else {
                parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_LIST");
            }
            if (parcelableArrayListExtra2 != null) {
                listM = new ArrayList(CollectionsKt.x(parcelableArrayListExtra2, 10));
                Iterator it = parcelableArrayListExtra2.iterator();
                while (it.hasNext()) {
                    listM.add(no.e.b((HomeMperksClippedReward) it.next()));
                }
            } else {
                listM = null;
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
        } else {
            Intent intent2 = getIntent();
            Intrinsics.i(intent2, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_lIST_FROM_MPERKS_DASHBOARD", ClippedReward.class);
            } else {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_REWARD_COUPON_lIST_FROM_MPERKS_DASHBOARD");
            }
            listM = parcelableArrayListExtra;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
        }
        this.mperksPoints = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_REWARD_MPERKS_BALANCE");
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1027895068, true, new g(listM)), 1, null);
    }
}
