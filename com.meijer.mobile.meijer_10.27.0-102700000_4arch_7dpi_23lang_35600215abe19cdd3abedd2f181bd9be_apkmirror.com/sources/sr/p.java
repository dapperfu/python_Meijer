package sr;

import Ji.I;
import Ji.LocalThemeScope;
import Ji.T;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import a3.B;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5728k0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import d0.C13439f;
import d0.C13457y;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import g1.InterfaceC14171c;
import g1.J;
import g1.U;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Arrays;
import java.util.Locale;
import ji.ProductCardTags;
import ji.q1;
import kotlin.C13821t;
import kotlin.C17986y0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import p1.C16190d;
import p1.C16193g;
import qv.InterfaceC16622O;
import qv.Z;
import r0.C16692i;
import s3.AbstractC16852D;
import s3.n;
import yr.Q;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a;\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010%\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0007¢\u0006\u0004\b%\u0010&\u001a1\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010'\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b(\u0010)¨\u0006-²\u0006\u000e\u0010*\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lfi/d;", "adData", "Lkotlin/Function1;", "Lfi/a;", "", "onAdClicked", "C", "(LJi/M;Landroidx/compose/ui/Modifier;Lfi/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "adManagerView", "o", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onLoadedAd", "S", "(Lfi/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "", "isVideoVisible", "", "videoPlaybackPosition", "Landroidx/compose/runtime/l0;", "isMuted", "onPlaybackPositionUpdate", "J", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/media3/exoplayer/ExoPlayer;ZJLandroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Lfi/k;", "imaAdHelper", "savedPlaybackPosition", "wasPlayingBeforePause", "isVideoAdReady", "F", "(LJi/M;Landroid/content/Context;Lfi/k;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/Composer;I)V", "player", "t", "(LJi/M;Landroidx/media3/exoplayer/ExoPlayer;Landroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "isAdLoaded", "isPlaying", "isCaptionsEnabled", "advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$AdView$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f160835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdManagerAdView adManagerAdView, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f160835b = adManagerAdView;
            this.f160836c = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f160835b, this.f160836c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f160834a == 0) {
                ResultKt.b(obj);
                if (!this.f160835b.b()) {
                    p.p(this.f160836c, true);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"sr/p$c", "LEc/c;", "", "J", "()V", "LEc/h;", "error", "q", "(LEc/h;)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Ec.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160837a;

        c(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f160837a = interfaceC5730l0;
        }

        @Override // Ec.c
        public void J() {
            p.p(this.f160837a, true);
        }

        @Override // Ec.c
        public void q(Ec.h error) {
            Intrinsics.j(error, "error");
            p.p(this.f160837a, false);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f160838a;

        d(L1.h hVar) {
            this.f160838a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f160838a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

        /* renamed from: h, reason: collision with root package name */
        public static final e f160839h = new e();

        e() {
            super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductCardTags invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new ProductCardTags(p02, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160840a;

        f(LocalThemeScope localThemeScope) {
            this.f160840a = localThemeScope;
        }

        public final void a(ProductCardTags Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-825805045, i10, -1, "com.meijer.mobile.ui.advertising.AdView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoogleAdView.kt:178)");
            }
            Hi.h.h(this.f160840a, Assemble.getTags().getSponsored(), C16193g.c(Q.f170989c0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags o1Var, Composer composer, Integer num) {
            a(o1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public static final g f160841a = new g();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$AdView$3$1$3$1$1", f = "GoogleAdView.kt", l = {191}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f160842b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f160843c;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f160843c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[LOOP:0: B:17:0x0055->B:19:0x005b, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r5.f160842b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.f160843c
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    kotlin.ResultKt.b(r6)
                    goto L2f
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f160843c
                    g1.c r6 = (g1.InterfaceC14171c) r6
                    r1 = r6
                L23:
                    r5.f160843c = r1
                    r5.f160842b = r2
                    r6 = 0
                    java.lang.Object r6 = g1.InterfaceC14171c.G1(r1, r6, r5, r2, r6)
                    if (r6 != r0) goto L2f
                    return r0
                L2f:
                    g1.q r6 = (g1.C14185q) r6
                    java.util.List r3 = r6.c()
                    int r3 = r3.size()
                    if (r3 <= r2) goto L23
                    int r3 = r6.getType()
                    g1.t$a r4 = g1.C14187t.INSTANCE
                    int r4 = r4.c()
                    boolean r3 = g1.C14187t.i(r3, r4)
                    if (r3 == 0) goto L23
                    java.util.List r6 = r6.c()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.Iterator r6 = r6.iterator()
                L55:
                    boolean r3 = r6.hasNext()
                    if (r3 == 0) goto L23
                    java.lang.Object r3 = r6.next()
                    g1.B r3 = (g1.PointerInputChange) r3
                    r3.a()
                    goto L55
                */
                throw new UnsupportedOperationException("Method not decompiled: sr.p.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objD = C13821t.d(j10, new a(null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
        }

        g() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f160844a;

        h(L1.h hVar) {
            this.f160844a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f160844a.getBottom(), H1.h.p(4), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<Context, AdManagerAdView> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f160845a;

        i(AdManagerAdView adManagerAdView) {
            this.f160845a = adManagerAdView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdManagerAdView invoke(Context it) {
            Intrinsics.j(it, "it");
            return this.f160845a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f160846a = new j();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        j() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sr/p$k", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class k implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f160847a;

        public k(AdManagerAdView adManagerAdView) {
            this.f160847a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f160847a.setAdListener(new b());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class l extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f160848f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(A a10) {
            super(1);
            this.f160848f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f160848f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f160849f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f160850g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f160851h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f160852i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f160853j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160854k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(L1.n nVar, int i10, Function0 function0, AdManagerAdView adManagerAdView, InterfaceC5730l0 interfaceC5730l0, LocalThemeScope localThemeScope) {
            super(2);
            this.f160850g = nVar;
            this.f160851h = function0;
            this.f160852i = adManagerAdView;
            this.f160853j = interfaceC5730l0;
            this.f160854k = localThemeScope;
            this.f160849f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f160850g.getHelpersHashCode();
            this.f160850g.i();
            L1.n nVar = this.f160850g;
            composer.startReplaceGroup(2094701389);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            if (p.s(this.f160853j)) {
                composer.startReplaceGroup(2094766333);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(hVarC);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new d(hVarC);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.c(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                LocalThemeScope localThemeScope = this.f160854k;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB2 == companion3.a()) {
                    objB2 = e.f160839h;
                    composer.t(objB2);
                }
                composer.P();
                Ji.Q.f(localThemeScope, (Function1) objB2, ComposableLambdaKt.c(-825805045, true, new f(this.f160854k), composer, 54), composer, LocalThemeScope.f15770g | 432);
                composer.v();
                Unit unit = Unit.f142422a;
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion3.a()) {
                    objB3 = g.f160841a;
                    composer.t(objB3);
                }
                composer.P();
                Modifier modifierF = androidx.compose.foundation.layout.J.F(U.c(companion, unit, (PointerInputEventHandler) objB3), null, false, 3, null);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(hVarA);
                Object objB4 = composer.B();
                if (zV2 || objB4 == companion3.a()) {
                    objB4 = new h(hVarA);
                    composer.t(objB4);
                }
                composer.P();
                Modifier modifierK2 = nVar.k(modifierF, hVarC, (Function1) objB4);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f160852i);
                Object objB5 = composer.B();
                if (zD || objB5 == companion3.a()) {
                    objB5 = new i(this.f160852i);
                    composer.t(objB5);
                }
                composer.P();
                androidx.compose.ui.viewinterop.e.a((Function1) objB5, modifierK2, null, composer, 0, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(2096367762);
                Modifier modifierI = androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(0));
                composer.startReplaceGroup(1849434622);
                Object objB6 = composer.B();
                if (objB6 == Composer.INSTANCE.a()) {
                    objB6 = j.f160846a;
                    composer.t(objB6);
                }
                composer.P();
                C14802K.a(nVar.k(modifierI, hVarD, (Function1) objB6), composer, 0);
                composer.P();
            }
            composer.P();
            if (this.f160850g.getHelpersHashCode() != helpersHashCode) {
                this.f160851h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$CustomPlayBackControls$1$1", f = "GoogleAdView.kt", l = {634}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5728k0 f160856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f160857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InterfaceC5728k0 interfaceC5728k0, ExoPlayer exoPlayer, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f160856b = interfaceC5728k0;
            this.f160857c = exoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new n(this.f160856b, this.f160857c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160855a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            do {
                this.f160856b.I(this.f160857c.g0());
                this.f160855a = 1;
            } while (Z.b(500L, this) != objF);
            return objF;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$CustomPlayBackControls$2$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f160859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160860c;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sr/p$o$a", "La3/B$d;", "", "isPlayingNow", "", "c1", "(Z)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements B.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f160861a;

            a(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f160861a = interfaceC5730l0;
            }

            @Override // a3.B.d
            public void c1(boolean isPlayingNow) {
                p.v(this.f160861a, isPlayingNow);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ExoPlayer exoPlayer, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f160859b = exoPlayer;
            this.f160860c = interfaceC5730l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new o(this.f160859b, this.f160860c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f160858a == 0) {
                ResultKt.b(obj);
                this.f160859b.l(new a(this.f160860c));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sr.p$p, reason: collision with other inner class name */
    static final class C2511p implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160862a;

        C2511p(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f160862a = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            String strC;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-588255742, i10, -1, "com.meijer.mobile.ui.advertising.CustomPlayBackControls.<anonymous>.<anonymous> (GoogleAdView.kt:687)");
            }
            Z0.c cVarC = C16190d.c(p.u(this.f160862a) ? Bj.i.f2711Y1 : Bj.i.f2690R1, composer, 0);
            if (p.u(this.f160862a)) {
                composer.startReplaceGroup(-1259891196);
                strC = C16193g.c(Q.f170995f0, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1259793949);
                strC = C16193g.c(Q.f170997g0, composer, 0);
                composer.P();
            }
            C13457y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
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
    static final class q implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160863a;

        q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f160863a = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            String strC;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(86264889, i10, -1, "com.meijer.mobile.ui.advertising.CustomPlayBackControls.<anonymous>.<anonymous> (GoogleAdView.kt:725)");
            }
            Z0.c cVarC = C16190d.c(this.f160863a.getValue().booleanValue() ? Bj.i.f2714Z1 : Bj.i.f2718a2, composer, 0);
            if (this.f160863a.getValue().booleanValue()) {
                composer.startReplaceGroup(1527232078);
                strC = C16193g.c(Q.f170985a0, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(1527328364);
                strC = C16193g.c(Q.f170987b0, composer, 0);
                composer.P();
            }
            C13457y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
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
    static final class r implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160864a;

        r(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f160864a = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            String strC;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2065218246, i10, -1, "com.meijer.mobile.ui.advertising.CustomPlayBackControls.<anonymous>.<anonymous> (GoogleAdView.kt:769)");
            }
            Z0.c cVarC = C16190d.c(p.w(this.f160864a) ? Bj.i.f2705W1 : Bj.i.f2708X1, composer, 0);
            if (p.w(this.f160864a)) {
                composer.startReplaceGroup(490137480);
                strC = C16193g.c(Q.f170998h, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(490238695);
                strC = C16193g.c(Q.f170996g, composer, 0);
                composer.P();
            }
            C13457y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$SetupVideoAdPlayer$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<ExoPlayer> f160866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fi.k f160867c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f160868d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Long> f160869e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160870f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160871g;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sr/p$s$a", "La3/B$d;", "", "playbackState", "", "H0", "(I)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements B.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ fi.k f160872a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExoPlayer f160873b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f160874c;

            @Override // a3.B.d
            public void H0(int playbackState) {
                if (playbackState == 1) {
                    this.f160872a.f(this.f160873b, Uri.parse(""));
                }
                if (playbackState != 3 || this.f160873b.F()) {
                    return;
                }
                this.f160873b.q(true);
                this.f160874c.setValue(Boolean.TRUE);
            }

            a(fi.k kVar, ExoPlayer exoPlayer, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f160872a = kVar;
                this.f160873b = exoPlayer;
                this.f160874c = interfaceC5730l0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(InterfaceC5730l0<ExoPlayer> interfaceC5730l0, fi.k kVar, Context context, InterfaceC5730l0<Long> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f160866b = interfaceC5730l0;
            this.f160867c = kVar;
            this.f160868d = context;
            this.f160869e = interfaceC5730l02;
            this.f160870f = interfaceC5730l03;
            this.f160871g = interfaceC5730l04;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new s(this.f160866b, this.f160867c, this.f160868d, this.f160869e, this.f160870f, this.f160871g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            IntrinsicsKt.f();
            if (this.f160865a == 0) {
                ResultKt.b(obj);
                ExoPlayer value = this.f160866b.getValue();
                if (value != null) {
                    value.release();
                }
                InterfaceC5730l0<ExoPlayer> interfaceC5730l0 = this.f160866b;
                ExoPlayer exoPlayerC = this.f160867c.c(new PlayerView(this.f160868d), Uri.parse(""));
                InterfaceC5730l0<Long> interfaceC5730l02 = this.f160869e;
                InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f160870f;
                fi.k kVar = this.f160867c;
                InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f160871g;
                exoPlayerC.q(false);
                exoPlayerC.P(interfaceC5730l02.getValue().longValue());
                if (interfaceC5730l03.getValue().booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                exoPlayerC.h(f10);
                exoPlayerC.l(new a(kVar, exoPlayerC, interfaceC5730l04));
                interfaceC5730l0.setValue(exoPlayerC);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sr/p$t", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class t implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6030s f160875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6027p f160876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f160877c;

        public t(InterfaceC6030s interfaceC6030s, InterfaceC6027p interfaceC6027p, InterfaceC5730l0 interfaceC5730l0) {
            this.f160875a = interfaceC6030s;
            this.f160876b = interfaceC6027p;
            this.f160877c = interfaceC5730l0;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f160875a.getLifecycle().d(this.f160876b);
            ExoPlayer exoPlayer = (ExoPlayer) this.f160877c.getValue();
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            this.f160877c.setValue(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$VideoAdsView$1$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f160879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f160880c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f160881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f160882e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f160883f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super Long, Unit> function1, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f160879b = exoPlayer;
            this.f160880c = z10;
            this.f160881d = j10;
            this.f160882e = interfaceC5730l0;
            this.f160883f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new u(this.f160879b, this.f160880c, this.f160881d, this.f160882e, this.f160883f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            IntrinsicsKt.f();
            if (this.f160878a == 0) {
                ResultKt.b(obj);
                ExoPlayer exoPlayer = this.f160879b;
                if (exoPlayer != null) {
                    boolean z10 = this.f160880c;
                    long j10 = this.f160881d;
                    InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f160882e;
                    Function1<Long, Unit> function1 = this.f160883f;
                    if (z10) {
                        exoPlayer.q(true);
                        exoPlayer.P(j10);
                        if (interfaceC5730l0.getValue().booleanValue()) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        exoPlayer.h(f10);
                    } else {
                        function1.invoke(Boxing.e(exoPlayer.g0()));
                        exoPlayer.q(false);
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$googleAdView$4$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f160885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f160886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<AdManagerAdView> f160887d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160888e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f160889f;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"sr/p$w$a", "LEc/c;", "", "J", "()V", "v", "LEc/h;", "error", "q", "(LEc/h;)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends Ec.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f160890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<AdManagerAdView> f160891b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f160892c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f160893d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ GoogleAdData f160894e;

            /* JADX WARN: Multi-variable type inference failed */
            a(AdManagerAdView adManagerAdView, InterfaceC5730l0<AdManagerAdView> interfaceC5730l0, Function0<Unit> function0, Function1<? super GoogleAdAnalytics, Unit> function1, GoogleAdData googleAdData) {
                this.f160890a = adManagerAdView;
                this.f160891b = interfaceC5730l0;
                this.f160892c = function0;
                this.f160893d = function1;
                this.f160894e = googleAdData;
            }

            @Override // Ec.c
            public void J() {
                uw.a.INSTANCE.a("Ad loaded: " + this.f160890a.getAdUnitId(), new Object[0]);
                this.f160891b.setValue(this.f160890a);
                Function0<Unit> function0 = this.f160892c;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // Ec.c
            public void q(Ec.h error) {
                Intrinsics.j(error, "error");
                uw.a.INSTANCE.d("Ad failed to load: " + this.f160890a.getAdUnitId() + ", Code: " + error.a() + ", Message: " + error.c(), new Object[0]);
                this.f160891b.setValue(null);
            }

            @Override // Ec.c
            public void v() {
                uw.a.INSTANCE.a("Ad clicked: " + this.f160890a.getAdUnitId(), new Object[0]);
                this.f160893d.invoke(this.f160894e.getAnalytics());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(GoogleAdData googleAdData, Context context, InterfaceC5730l0<AdManagerAdView> interfaceC5730l0, Function0<Unit> function0, Function1<? super GoogleAdAnalytics, Unit> function1, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f160885b = googleAdData;
            this.f160886c = context;
            this.f160887d = interfaceC5730l0;
            this.f160888e = function0;
            this.f160889f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f160885b, this.f160886c, this.f160887d, this.f160888e, this.f160889f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:10:0x002a, B:12:0x0030, B:16:0x0037, B:18:0x003a, B:21:0x004f, B:23:0x0055, B:26:0x007d), top: B:34:0x002a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r8.f160884a
                if (r0 != 0) goto Lb4
                kotlin.ResultKt.b(r9)
                fi.d r9 = r8.f160885b
                r1 = 0
                if (r9 == 0) goto La8
                java.lang.String r9 = r9.getAdUnitId()
                boolean r9 = kotlin.text.StringsKt.r0(r9)
                if (r9 == 0) goto L1b
                goto La8
            L1b:
                com.google.android.gms.ads.admanager.AdManagerAdView r3 = new com.google.android.gms.ads.admanager.AdManagerAdView
                android.content.Context r9 = r8.f160886c
                r3.<init>(r9)
                fi.d r7 = r8.f160885b
                androidx.compose.runtime.l0<com.google.android.gms.ads.admanager.AdManagerAdView> r4 = r8.f160887d
                kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.f160888e
                kotlin.jvm.functions.Function1<fi.a, kotlin.Unit> r6 = r8.f160889f
                Ec.e[] r9 = r7.getAdSizes()     // Catch: java.lang.Exception -> L4c
                if (r9 == 0) goto L4f
                int r9 = r9.length     // Catch: java.lang.Exception -> L4c
                r0 = 1
                if (r9 != 0) goto L36
                r9 = r0
                goto L37
            L36:
                r9 = r1
            L37:
                r9 = r9 ^ r0
                if (r9 != r0) goto L4f
                Ec.e[] r9 = r7.getAdSizes()     // Catch: java.lang.Exception -> L4c
                kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Exception -> L4c
                int r0 = r9.length     // Catch: java.lang.Exception -> L4c
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)     // Catch: java.lang.Exception -> L4c
                Ec.e[] r9 = (Ec.e[]) r9     // Catch: java.lang.Exception -> L4c
                r3.setAdSizes(r9)     // Catch: java.lang.Exception -> L4c
                goto L5f
            L4c:
                r0 = move-exception
                r9 = r0
                goto L89
            L4f:
                Ec.e r9 = r7.getAdSize()     // Catch: java.lang.Exception -> L4c
                if (r9 == 0) goto L7d
                Ec.e r9 = r7.getAdSize()     // Catch: java.lang.Exception -> L4c
                kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Exception -> L4c
                r3.setAdSize(r9)     // Catch: java.lang.Exception -> L4c
            L5f:
                java.lang.String r9 = r7.getAdUnitId()
                r3.setAdUnitId(r9)
                sr.p$w$a r2 = new sr.p$w$a
                r2.<init>(r3, r4, r5, r6, r7)
                r3.setAdListener(r2)
                Fc.a r9 = r7.getAdRequest()
                r3.f(r9)
                androidx.compose.runtime.l0<com.google.android.gms.ads.admanager.AdManagerAdView> r9 = r8.f160887d
                r9.setValue(r3)
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            L7d:
                uw.a$a r9 = uw.a.INSTANCE     // Catch: java.lang.Exception -> L4c
                java.lang.String r0 = "Ad not loaded: No adSize or adSizes provided."
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4c
                r9.d(r0, r2)     // Catch: java.lang.Exception -> L4c
                kotlin.Unit r9 = kotlin.Unit.f142422a     // Catch: java.lang.Exception -> L4c
                return r9
            L89:
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to set ad size(s) for "
                r2.append(r3)
                java.lang.String r3 = r7.getAdUnitId()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.f(r9, r2, r1)
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            La8:
                uw.a$a r9 = uw.a.INSTANCE
                java.lang.String r0 = "Ad not loaded: adData is null or adUnitId is blank."
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r9.d(r0, r1)
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            Lb4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: sr.p.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sr/p$b", "LEc/c;", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Ec.c {
        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class v {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC6023l.a.values().length];
            try {
                iArr[AbstractC6023l.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC6023l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC6023l.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, ExoPlayer exoPlayer, InterfaceC5730l0 interfaceC5730l0, Modifier modifier, int i10, Composer composer, int i11) {
        t(localThemeScope, exoPlayer, interfaceC5730l0, modifier, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void C(final LocalThemeScope localThemeScope, Modifier modifier, final GoogleAdData googleAdData, final Function1<? super GoogleAdAnalytics, Unit> onAdClicked, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composer2;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onAdClicked, "onAdClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(758599631);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(googleAdData) : composerStartRestartGroup.D(googleAdData) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onAdClicked) ? 2048 : 1024;
        }
        int i14 = i12;
        if ((i14 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(758599631, i14, -1, "com.meijer.mobile.ui.advertising.GoogleAdView (GoogleAdView.kt:102)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i14 & 7168) == 2048;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: sr.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.D(onAdClicked, (GoogleAdAnalytics) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            AdManagerAdView adManagerAdViewS = S(googleAdData, (Function1) objB, null, composer2, ((i14 >> 6) & 14) | GoogleAdData.f131149f, 4);
            if (adManagerAdViewS == null) {
                modifier2 = modifier4;
            } else {
                modifier2 = modifier4;
                o(localThemeScope, modifier2, adManagerAdViewS, composer2, LocalThemeScope.f15770g | (i14 & 14) | (i14 & 112), 0);
                composer2 = composer2;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier2;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: sr.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.E(localThemeScope, modifier3, googleAdData, onAdClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1, GoogleAdAnalytics it) {
        Intrinsics.j(it, "it");
        function1.invoke(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, Modifier modifier, GoogleAdData googleAdData, Function1 function1, int i10, int i11, Composer composer, int i12) {
        C(localThemeScope, modifier, googleAdData, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void F(final LocalThemeScope localThemeScope, final Context context, final fi.k imaAdHelper, final InterfaceC5730l0<ExoPlayer> exoPlayer, final InterfaceC5730l0<Long> savedPlaybackPosition, final InterfaceC5730l0<Boolean> wasPlayingBeforePause, final InterfaceC5730l0<Boolean> isVideoAdReady, final InterfaceC5730l0<Boolean> isMuted, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(context, "context");
        Intrinsics.j(imaAdHelper, "imaAdHelper");
        Intrinsics.j(exoPlayer, "exoPlayer");
        Intrinsics.j(savedPlaybackPosition, "savedPlaybackPosition");
        Intrinsics.j(wasPlayingBeforePause, "wasPlayingBeforePause");
        Intrinsics.j(isVideoAdReady, "isVideoAdReady");
        Intrinsics.j(isMuted, "isMuted");
        Composer composerStartRestartGroup = composer.startRestartGroup(1860489047);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.D(context) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(imaAdHelper) : composerStartRestartGroup.D(imaAdHelper) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(exoPlayer) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.V(savedPlaybackPosition) ? 16384 : 8192;
        }
        int i15 = i11;
        if ((196608 & i10) == 0) {
            i12 = i15 | (composerStartRestartGroup.V(wasPlayingBeforePause) ? 131072 : 65536);
        } else {
            i12 = i15;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.V(isVideoAdReady) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.V(isMuted) ? 8388608 : 4194304;
        }
        if ((i12 & 4793489) == 4793488 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1860489047, i12, -1, "com.meijer.mobile.ui.advertising.SetupVideoAdPlayer (GoogleAdView.kt:494)");
            }
            Unit unit = Unit.f142422a;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i16 = i12 & 7168;
            int i17 = 57344 & i12;
            int i18 = 29360128 & i12;
            boolean zD = (i16 == 2048) | ((i12 & 896) == 256 || ((i12 & 512) != 0 && composerStartRestartGroup.D(imaAdHelper))) | composerStartRestartGroup.D(context) | (i17 == 16384) | (i18 == 8388608) | ((i12 & 3670016) == 1048576);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                i13 = i16;
                i14 = -1224400529;
                s sVar = new s(exoPlayer, imaAdHelper, context, savedPlaybackPosition, isMuted, isVideoAdReady, null);
                composerStartRestartGroup.t(sVar);
                objB = sVar;
            } else {
                i13 = i16;
                i14 = -1224400529;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB, composerStartRestartGroup, 6);
            final InterfaceC6030s interfaceC6030s = (InterfaceC6030s) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(i14);
            boolean zD2 = (i13 == 2048) | (i17 == 16384) | ((458752 & i12) == 131072) | (i18 == 8388608) | composerStartRestartGroup.D(interfaceC6030s);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: sr.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.G(interfaceC6030s, exoPlayer, savedPlaybackPosition, wasPlayingBeforePause, isMuted, (F) obj);
                    }
                };
                composerStartRestartGroup.t(function1);
                objB2 = function1;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.c(interfaceC6030s, (Function1) objB2, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: sr.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.I(localThemeScope, context, imaAdHelper, exoPlayer, savedPlaybackPosition, wasPlayingBeforePause, isVideoAdReady, isMuted, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E G(InterfaceC6030s interfaceC6030s, final InterfaceC5730l0 interfaceC5730l0, final InterfaceC5730l0 interfaceC5730l02, final InterfaceC5730l0 interfaceC5730l03, final InterfaceC5730l0 interfaceC5730l04, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        InterfaceC6027p interfaceC6027p = new InterfaceC6027p() { // from class: sr.l
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s2, AbstractC6023l.a aVar) {
                p.H(interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04, interfaceC6030s2, aVar);
            }
        };
        interfaceC6030s.getLifecycle().a(interfaceC6027p);
        return new t(interfaceC6030s, interfaceC6027p, interfaceC5730l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
        Intrinsics.j(interfaceC6030s, "<unused var>");
        Intrinsics.j(event, "event");
        int i10 = v.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            ExoPlayer exoPlayer = (ExoPlayer) interfaceC5730l0.getValue();
            if (exoPlayer != null) {
                interfaceC5730l02.setValue(Long.valueOf(exoPlayer.g0()));
                interfaceC5730l03.setValue(Boolean.valueOf(exoPlayer.F()));
                exoPlayer.q(false);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) interfaceC5730l0.getValue();
            if (exoPlayer2 != null) {
                exoPlayer2.release();
            }
            interfaceC5730l0.setValue(null);
            return;
        }
        ExoPlayer exoPlayer3 = (ExoPlayer) interfaceC5730l0.getValue();
        if (exoPlayer3 != null) {
            exoPlayer3.P(((Number) interfaceC5730l02.getValue()).longValue());
            exoPlayer3.q(((Boolean) interfaceC5730l03.getValue()).booleanValue());
            exoPlayer3.h(((Boolean) interfaceC5730l04.getValue()).booleanValue() ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Context context, fi.k kVar, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04, InterfaceC5730l0 interfaceC5730l05, int i10, Composer composer, int i11) {
        F(localThemeScope, context, kVar, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04, interfaceC5730l05, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    public static final void J(final LocalThemeScope localThemeScope, final Modifier modifier, final ExoPlayer exoPlayer, final boolean z10, final long j10, final InterfaceC5730l0<Boolean> isMuted, final Function1<? super Long, Unit> onPlaybackPositionUpdate, Composer composer, final int i10) {
        int i11;
        boolean z11;
        Object uVar;
        ?? r12;
        e.c cVar;
        final ExoPlayer exoPlayer2;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(isMuted, "isMuted");
        Intrinsics.j(onPlaybackPositionUpdate, "onPlaybackPositionUpdate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-512528914);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(exoPlayer) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            z11 = z10;
            i11 |= composerStartRestartGroup.a(z11) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            z11 = z10;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.e(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(isMuted) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(onPlaybackPositionUpdate) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-512528914, i11, -1, "com.meijer.mobile.ui.advertising.VideoAdsView (GoogleAdView.kt:416)");
            }
            Modifier modifierK = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), H1.h.p(320)), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.b(), P0.e.INSTANCE.k(), composerStartRestartGroup, 6);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            Boolean boolValueOf = Boolean.valueOf(z11);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(exoPlayer) | ((i11 & 7168) == 2048) | ((57344 & i11) == 16384) | ((458752 & i11) == 131072) | ((3670016 & i11) == 1048576);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                r12 = 0;
                cVar = null;
                uVar = new u(exoPlayer, z11, j10, isMuted, onPlaybackPositionUpdate, null);
                exoPlayer2 = exoPlayer;
                composerStartRestartGroup.t(uVar);
            } else {
                uVar = objB;
                exoPlayer2 = exoPlayer;
                r12 = 0;
                cVar = null;
            }
            composerStartRestartGroup.P();
            int i12 = i11 >> 9;
            androidx.compose.runtime.J.g(boolValueOf, (Function2) uVar, composerStartRestartGroup, i12 & 14);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD2 = composerStartRestartGroup.D(exoPlayer2);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: sr.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.K(exoPlayer2, (Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composerStartRestartGroup.P();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierK2 = androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, cVar), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, cVar);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: sr.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.L((PlayerView) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            androidx.compose.ui.viewinterop.e.b(function1, modifierK2, null, (Function1) objB3, null, composer2, 3072, 20);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, r12);
            composer2.startReplaceGroup(227364518);
            if (exoPlayer2 != null) {
                t(localThemeScope, exoPlayer2, isMuted, androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, cVar), cVar, r12, 3, cVar), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, cVar), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), composer2, LocalThemeScope.f15770g | (i11 & 14) | (i12 & 896));
            }
            composer2.P();
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: sr.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.M(localThemeScope, modifier, exoPlayer, z10, j10, isMuted, onPlaybackPositionUpdate, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView K(ExoPlayer exoPlayer, Context ctx) {
        Intrinsics.j(ctx, "ctx");
        PlayerView playerView = new PlayerView(ctx);
        playerView.setPlayer(exoPlayer);
        playerView.setUseController(false);
        playerView.setControllerShowTimeoutMs(3000);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(PlayerView playerView) {
        Intrinsics.j(playerView, "playerView");
        playerView.setPlayer(null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5730l0 interfaceC5730l0, Function1 function1, int i10, Composer composer, int i11) {
        J(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5730l0, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final AdManagerAdView S(GoogleAdData googleAdData, Function1<? super GoogleAdAnalytics, Unit> onAdClicked, Function0<Unit> function0, Composer composer, int i10, int i11) {
        GoogleAdData googleAdData2;
        Intrinsics.j(onAdClicked, "onAdClicked");
        composer.startReplaceGroup(818910410);
        Function0<Unit> function02 = (i11 & 4) != 0 ? null : function0;
        if (ComposerKt.M()) {
            ComposerKt.U(818910410, i10, -1, "com.meijer.mobile.ui.advertising.googleAdView (GoogleAdView.kt:300)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(null, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
        composer.P();
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.startReplaceGroup(-1224400529);
        int i12 = i10 & 14;
        boolean zD = (((i12 ^ 6) > 4 && composer.D(googleAdData)) || (i10 & 6) == 4) | composer.D(context) | ((((i10 & 896) ^ 384) > 256 && composer.V(function02)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && composer.V(onAdClicked)) || (i10 & 48) == 32);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            googleAdData2 = googleAdData;
            Object wVar = new w(googleAdData2, context, interfaceC5730l0, function02, onAdClicked, null);
            composer.t(wVar);
            objB2 = wVar;
        } else {
            googleAdData2 = googleAdData;
        }
        composer.P();
        androidx.compose.runtime.J.g(googleAdData2, (Function2) objB2, composer, GoogleAdData.f131149f | i12);
        AdManagerAdView adManagerAdView = (AdManagerAdView) interfaceC5730l0.getValue();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return adManagerAdView;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final com.google.android.gms.ads.admanager.AdManagerAdView r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.p.o(Ji.M, androidx.compose.ui.Modifier, com.google.android.gms.ads.admanager.AdManagerAdView, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E q(AdManagerAdView adManagerAdView, InterfaceC5730l0 interfaceC5730l0, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        adManagerAdView.setAdListener(new c(interfaceC5730l0));
        return new k(adManagerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, AdManagerAdView adManagerAdView, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, adManagerAdView, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final ExoPlayer player, final InterfaceC5730l0<Boolean> isMuted, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        final InterfaceC5730l0 interfaceC5730l0;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(player, "player");
        Intrinsics.j(isMuted, "isMuted");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(908882957);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(player) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(isMuted) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(908882957, i12, -1, "com.meijer.mobile.ui.advertising.CustomPlayBackControls (GoogleAdView.kt:625)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.valueOf(player.V()), null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = f1.a(0L);
                composerStartRestartGroup.t(objB3);
            }
            InterfaceC5728k0 interfaceC5728k0 = (InterfaceC5728k0) objB3;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(player);
            Object objB4 = composerStartRestartGroup.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new n(interfaceC5728k0, player, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            int i13 = (i12 >> 3) & 14;
            androidx.compose.runtime.J.g(player, (Function2) objB4, composerStartRestartGroup, i13);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD2 = composerStartRestartGroup.D(player);
            Object objB5 = composerStartRestartGroup.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new o(player, interfaceC5730l02, null);
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(player, (Function2) objB5, composerStartRestartGroup, i13);
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.i(), composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            I one = localThemeScope.getAdsTypography().getBodyCompact().getOne();
            T adsColorText02 = localThemeScope.getAdsColors().getAdsColorText02();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 8;
            float f11 = 4;
            q1.Label label = new q1.Label(c14801j.c(androidx.compose.foundation.layout.D.j(androidx.compose.foundation.b.c(companion3, localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius02().getDp())), H1.h.p(f10), H1.h.p(f11))), adsColorText02, null, null, 0, false, 0, one, null, 380, null);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
            Locale locale = Locale.US;
            long jC = interfaceC5728k0.c();
            long j10 = 1000;
            long j11 = jC / j10;
            long j12 = 60;
            String str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf((interfaceC5728k0.c() / j10) % j12)}, 2));
            Intrinsics.i(str, "format(...)");
            ri.j.h(localThemeScope, label, str, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (q1.Label.f140080j << 3), 4);
            C14802K.a(InterfaceC14800I.b(c14801j, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean zU = u(interfaceC5730l02);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD3 = composerStartRestartGroup.D(player);
            Object objB6 = composerStartRestartGroup.B();
            if (zD3 || objB6 == companion.a()) {
                objB6 = new Function1() { // from class: sr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.y(player, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB6);
            }
            composerStartRestartGroup.P();
            float f12 = 36;
            float f13 = 2;
            C17986y0.b(zU, (Function1) objB6, c14801j.c(androidx.compose.foundation.layout.D.i(C13439f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(-588255742, true, new C2511p(interfaceC5730l02), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 24);
            C14802K.a(c14801j.c(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(f10))), composerStartRestartGroup, 0);
            boolean zBooleanValue = isMuted.getValue().booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD4 = ((i12 & 896) == 256) | composerStartRestartGroup.D(player);
            Object objB7 = composerStartRestartGroup.B();
            if (zD4 || objB7 == companion.a()) {
                objB7 = new Function1() { // from class: sr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.z(isMuted, player, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB7);
            }
            composerStartRestartGroup.P();
            C17986y0.b(zBooleanValue, (Function1) objB7, c14801j.c(androidx.compose.foundation.layout.D.i(C13439f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(86264889, true, new q(isMuted), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 24);
            C14802K.a(c14801j.c(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(f10))), composerStartRestartGroup, 0);
            boolean zW = w(interfaceC5730l03);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD5 = composerStartRestartGroup.D(player);
            Object objB8 = composerStartRestartGroup.B();
            if (zD5 || objB8 == companion.a()) {
                interfaceC5730l0 = interfaceC5730l03;
                objB8 = new Function1() { // from class: sr.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.A(player, interfaceC5730l0, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB8);
            } else {
                interfaceC5730l0 = interfaceC5730l03;
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C17986y0.b(zW, (Function1) objB8, c14801j.c(androidx.compose.foundation.layout.D.i(C13439f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(-2065218246, true, new r(interfaceC5730l0), composerStartRestartGroup, 54), composer2, 196608, 24);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: sr.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.B(localThemeScope, player, isMuted, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ExoPlayer exoPlayer, boolean z10) {
        if (z10) {
            exoPlayer.i();
        } else {
            exoPlayer.pause();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(ExoPlayer exoPlayer, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
        s3.n nVar;
        x(interfaceC5730l0, z10);
        AbstractC16852D abstractC16852DA = exoPlayer.a();
        if (abstractC16852DA instanceof s3.n) {
            nVar = (s3.n) abstractC16852DA;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            return Unit.f142422a;
        }
        n.e eVarC = nVar.c();
        Intrinsics.i(eVarC, "getParameters(...)");
        nVar.m(eVarC.a().r0(3, !w(interfaceC5730l0)).F());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void x(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(InterfaceC5730l0 interfaceC5730l0, ExoPlayer exoPlayer, boolean z10) {
        float f10;
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
        if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        exoPlayer.h(f10);
        return Unit.f142422a;
    }
}
