package sr;

import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import a3.B;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5870k0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import d0.C13572f;
import d0.C13590y;
import g1.InterfaceC14300c;
import g1.J;
import g1.U;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Arrays;
import java.util.Locale;
import ki.ProductCardTags;
import ki.q1;
import kotlin.C13931t;
import kotlin.C18052y0;
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
import mv.InterfaceC15783O;
import mv.Z;
import p1.C16335d;
import p1.C16338g;
import r0.C16806i;
import s3.AbstractC16998D;
import s3.n;
import yr.Q;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a;\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010%\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0007¢\u0006\u0004\b%\u0010&\u001a1\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010'\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b(\u0010)¨\u0006-²\u0006\u000e\u0010*\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lgi/d;", "adData", "Lkotlin/Function1;", "Lgi/a;", "", "onAdClicked", "C", "(LKi/M;Landroidx/compose/ui/Modifier;Lgi/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "adManagerView", "o", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/google/android/gms/ads/admanager/AdManagerAdView;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onLoadedAd", "S", "(Lgi/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "", "isVideoVisible", "", "videoPlaybackPosition", "Landroidx/compose/runtime/l0;", "isMuted", "onPlaybackPositionUpdate", "J", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/media3/exoplayer/ExoPlayer;ZJLandroidx/compose/runtime/l0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Lgi/k;", "imaAdHelper", "savedPlaybackPosition", "wasPlayingBeforePause", "isVideoAdReady", "F", "(LKi/M;Landroid/content/Context;Lgi/k;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/Composer;I)V", "player", "t", "(LKi/M;Landroidx/media3/exoplayer/ExoPlayer;Landroidx/compose/runtime/l0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "isAdLoaded", "isPlaying", "isCaptionsEnabled", "advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$AdView$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f161692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdManagerAdView adManagerAdView, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f161692b = adManagerAdView;
            this.f161693c = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f161692b, this.f161693c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f161691a == 0) {
                ResultKt.b(obj);
                if (!this.f161692b.b()) {
                    p.p(this.f161693c, true);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"sr/p$c", "LGc/c;", "", "J", "()V", "LGc/h;", "error", "q", "(LGc/h;)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Gc.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161694a;

        c(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f161694a = interfaceC5872l0;
        }

        @Override // Gc.c
        public void J() {
            p.p(this.f161694a, true);
        }

        @Override // Gc.c
        public void q(Gc.h error) {
            Intrinsics.j(error, "error");
            p.p(this.f161694a, false);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f161695a;

        d(L1.h hVar) {
            this.f161695a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f161695a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

        /* renamed from: h, reason: collision with root package name */
        public static final e f161696h = new e();

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
        final /* synthetic */ LocalThemeScope f161697a;

        f(LocalThemeScope localThemeScope) {
            this.f161697a = localThemeScope;
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
            Ii.h.h(this.f161697a, Assemble.getTags().getSponsored(), C16338g.c(Q.f171764c0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Tag.f142423e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags o1Var, Composer composer, Integer num) {
            a(o1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public static final g f161698a = new g();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$AdView$3$1$3$1$1", f = "GoogleAdView.kt", l = {191}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f161699b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f161700c;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f161700c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
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
                    int r1 = r5.f161699b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.f161700c
                    g1.c r1 = (g1.InterfaceC14300c) r1
                    kotlin.ResultKt.b(r6)
                    goto L2f
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f161700c
                    g1.c r6 = (g1.InterfaceC14300c) r6
                    r1 = r6
                L23:
                    r5.f161700c = r1
                    r5.f161699b = r2
                    r6 = 0
                    java.lang.Object r6 = g1.InterfaceC14300c.G1(r1, r6, r5, r2, r6)
                    if (r6 != r0) goto L2f
                    return r0
                L2f:
                    g1.q r6 = (g1.C14314q) r6
                    java.util.List r3 = r6.c()
                    int r3 = r3.size()
                    if (r3 <= r2) goto L23
                    int r3 = r6.getType()
                    g1.t$a r4 = g1.C14316t.INSTANCE
                    int r4 = r4.c()
                    boolean r3 = g1.C14316t.i(r3, r4)
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
            Object objD = C13931t.d(j10, new a(null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
        }

        g() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f161701a;

        h(L1.h hVar) {
            this.f161701a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f161701a.getBottom(), H1.h.p(4), 0.0f, 4, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<Context, AdManagerAdView> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f161702a;

        i(AdManagerAdView adManagerAdView) {
            this.f161702a = adManagerAdView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdManagerAdView invoke(Context it) {
            Intrinsics.j(it, "it");
            return this.f161702a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f161703a = new j();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        j() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sr/p$k", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class k implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f161704a;

        public k(AdManagerAdView adManagerAdView) {
            this.f161704a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f161704a.setAdListener(new b());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class l extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f161705f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(A a10) {
            super(1);
            this.f161705f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f161705f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f161706f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f161707g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f161708h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f161709i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f161710j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161711k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(L1.n nVar, int i10, Function0 function0, AdManagerAdView adManagerAdView, InterfaceC5872l0 interfaceC5872l0, LocalThemeScope localThemeScope) {
            super(2);
            this.f161707g = nVar;
            this.f161708h = function0;
            this.f161709i = adManagerAdView;
            this.f161710j = interfaceC5872l0;
            this.f161711k = localThemeScope;
            this.f161706f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f161707g.getHelpersHashCode();
            this.f161707g.i();
            L1.n nVar = this.f161707g;
            composer.startReplaceGroup(2094701389);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            if (p.s(this.f161710j)) {
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
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.c(), P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                LocalThemeScope localThemeScope = this.f161711k;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB2 == companion3.a()) {
                    objB2 = e.f161696h;
                    composer.t(objB2);
                }
                composer.P();
                Ki.Q.f(localThemeScope, (Function1) objB2, ComposableLambdaKt.c(-825805045, true, new f(this.f161711k), composer, 54), composer, LocalThemeScope.f17314g | 432);
                composer.v();
                Unit unit = Unit.f143329a;
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion3.a()) {
                    objB3 = g.f161698a;
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
                boolean zD = composer.D(this.f161709i);
                Object objB5 = composer.B();
                if (zD || objB5 == companion3.a()) {
                    objB5 = new i(this.f161709i);
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
                    objB6 = j.f161703a;
                    composer.t(objB6);
                }
                composer.P();
                C14890K.a(nVar.k(modifierI, hVarD, (Function1) objB6), composer, 0);
                composer.P();
            }
            composer.P();
            if (this.f161707g.getHelpersHashCode() != helpersHashCode) {
                this.f161708h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$CustomPlayBackControls$1$1", f = "GoogleAdView.kt", l = {634}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5870k0 f161713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f161714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InterfaceC5870k0 interfaceC5870k0, ExoPlayer exoPlayer, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f161713b = interfaceC5870k0;
            this.f161714c = exoPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new n(this.f161713b, this.f161714c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161712a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            do {
                this.f161713b.I(this.f161714c.g0());
                this.f161712a = 1;
            } while (Z.b(500L, this) != objF);
            return objF;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$CustomPlayBackControls$2$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f161716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161717c;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sr/p$o$a", "La3/B$d;", "", "isPlayingNow", "", "f1", "(Z)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements B.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f161718a;

            a(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f161718a = interfaceC5872l0;
            }

            @Override // a3.B.d
            public void f1(boolean isPlayingNow) {
                p.v(this.f161718a, isPlayingNow);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ExoPlayer exoPlayer, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f161716b = exoPlayer;
            this.f161717c = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new o(this.f161716b, this.f161717c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f161715a == 0) {
                ResultKt.b(obj);
                this.f161716b.l(new a(this.f161717c));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sr.p$p, reason: collision with other inner class name */
    static final class C2529p implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161719a;

        C2529p(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f161719a = interfaceC5872l0;
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
            Z0.c cVarC = C16335d.c(p.u(this.f161719a) ? Cj.i.f4756Y1 : Cj.i.f4735R1, composer, 0);
            if (p.u(this.f161719a)) {
                composer.startReplaceGroup(-1259891196);
                strC = C16338g.c(Q.f171770f0, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-1259793949);
                strC = C16338g.c(Q.f171772g0, composer, 0);
                composer.P();
            }
            C13590y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class q implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161720a;

        q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f161720a = interfaceC5872l0;
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
            Z0.c cVarC = C16335d.c(this.f161720a.getValue().booleanValue() ? Cj.i.f4759Z1 : Cj.i.f4763a2, composer, 0);
            if (this.f161720a.getValue().booleanValue()) {
                composer.startReplaceGroup(1527232078);
                strC = C16338g.c(Q.f171760a0, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(1527328364);
                strC = C16338g.c(Q.f171762b0, composer, 0);
                composer.P();
            }
            C13590y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161721a;

        r(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f161721a = interfaceC5872l0;
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
            Z0.c cVarC = C16335d.c(p.w(this.f161721a) ? Cj.i.f4750W1 : Cj.i.f4753X1, composer, 0);
            if (p.w(this.f161721a)) {
                composer.startReplaceGroup(490137480);
                strC = C16338g.c(Q.f171773h, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(490238695);
                strC = C16338g.c(Q.f171771g, composer, 0);
                composer.P();
            }
            C13590y.a(cVarC, strC, null, null, null, 0.0f, null, composer, 0, 124);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$SetupVideoAdPlayer$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161722a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<ExoPlayer> f161723b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ gi.k f161724c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f161725d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Long> f161726e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161727f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161728g;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sr/p$s$a", "La3/B$d;", "", "playbackState", "", "K0", "(I)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements B.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ gi.k f161729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExoPlayer f161730b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f161731c;

            @Override // a3.B.d
            public void K0(int playbackState) {
                if (playbackState == 1) {
                    this.f161729a.f(this.f161730b, Uri.parse(""));
                }
                if (playbackState != 3 || this.f161730b.F()) {
                    return;
                }
                this.f161730b.q(true);
                this.f161731c.setValue(Boolean.TRUE);
            }

            a(gi.k kVar, ExoPlayer exoPlayer, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f161729a = kVar;
                this.f161730b = exoPlayer;
                this.f161731c = interfaceC5872l0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(InterfaceC5872l0<ExoPlayer> interfaceC5872l0, gi.k kVar, Context context, InterfaceC5872l0<Long> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f161723b = interfaceC5872l0;
            this.f161724c = kVar;
            this.f161725d = context;
            this.f161726e = interfaceC5872l02;
            this.f161727f = interfaceC5872l03;
            this.f161728g = interfaceC5872l04;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new s(this.f161723b, this.f161724c, this.f161725d, this.f161726e, this.f161727f, this.f161728g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            IntrinsicsKt.f();
            if (this.f161722a == 0) {
                ResultKt.b(obj);
                ExoPlayer value = this.f161723b.getValue();
                if (value != null) {
                    value.release();
                }
                InterfaceC5872l0<ExoPlayer> interfaceC5872l0 = this.f161723b;
                ExoPlayer exoPlayerC = this.f161724c.c(new PlayerView(this.f161725d), Uri.parse(""));
                InterfaceC5872l0<Long> interfaceC5872l02 = this.f161726e;
                InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f161727f;
                gi.k kVar = this.f161724c;
                InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f161728g;
                exoPlayerC.q(false);
                exoPlayerC.P(interfaceC5872l02.getValue().longValue());
                if (interfaceC5872l03.getValue().booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                exoPlayerC.h(f10);
                exoPlayerC.l(new a(kVar, exoPlayerC, interfaceC5872l04));
                interfaceC5872l0.setValue(exoPlayerC);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sr/p$t", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class t implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f161732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6169p f161733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f161734c;

        public t(InterfaceC6172s interfaceC6172s, InterfaceC6169p interfaceC6169p, InterfaceC5872l0 interfaceC5872l0) {
            this.f161732a = interfaceC6172s;
            this.f161733b = interfaceC6169p;
            this.f161734c = interfaceC5872l0;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f161732a.getLifecycle().d(this.f161733b);
            ExoPlayer exoPlayer = (ExoPlayer) this.f161734c.getValue();
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            this.f161734c.setValue(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$VideoAdsView$1$1$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f161736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f161737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f161738d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f161739e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f161740f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super Long, Unit> function1, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f161736b = exoPlayer;
            this.f161737c = z10;
            this.f161738d = j10;
            this.f161739e = interfaceC5872l0;
            this.f161740f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new u(this.f161736b, this.f161737c, this.f161738d, this.f161739e, this.f161740f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            IntrinsicsKt.f();
            if (this.f161735a == 0) {
                ResultKt.b(obj);
                ExoPlayer exoPlayer = this.f161736b;
                if (exoPlayer != null) {
                    boolean z10 = this.f161737c;
                    long j10 = this.f161738d;
                    InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f161739e;
                    Function1<Long, Unit> function1 = this.f161740f;
                    if (z10) {
                        exoPlayer.q(true);
                        exoPlayer.P(j10);
                        if (interfaceC5872l0.getValue().booleanValue()) {
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
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.advertising.GoogleAdViewKt$googleAdView$4$1", f = "GoogleAdView.kt", l = {}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f161742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f161743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<AdManagerAdView> f161744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161745e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f161746f;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"sr/p$w$a", "LGc/c;", "", "J", "()V", "v", "LGc/h;", "error", "q", "(LGc/h;)V", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends Gc.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AdManagerAdView f161747a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<AdManagerAdView> f161748b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161749c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f161750d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ GoogleAdData f161751e;

            /* JADX WARN: Multi-variable type inference failed */
            a(AdManagerAdView adManagerAdView, InterfaceC5872l0<AdManagerAdView> interfaceC5872l0, Function0<Unit> function0, Function1<? super GoogleAdAnalytics, Unit> function1, GoogleAdData googleAdData) {
                this.f161747a = adManagerAdView;
                this.f161748b = interfaceC5872l0;
                this.f161749c = function0;
                this.f161750d = function1;
                this.f161751e = googleAdData;
            }

            @Override // Gc.c
            public void J() {
                qw.a.INSTANCE.a("Ad loaded: " + this.f161747a.getAdUnitId(), new Object[0]);
                this.f161748b.setValue(this.f161747a);
                Function0<Unit> function0 = this.f161749c;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // Gc.c
            public void q(Gc.h error) {
                Intrinsics.j(error, "error");
                qw.a.INSTANCE.d("Ad failed to load: " + this.f161747a.getAdUnitId() + ", Code: " + error.a() + ", Message: " + error.c(), new Object[0]);
                this.f161748b.setValue(null);
            }

            @Override // Gc.c
            public void v() {
                qw.a.INSTANCE.a("Ad clicked: " + this.f161747a.getAdUnitId(), new Object[0]);
                this.f161750d.invoke(this.f161751e.getAnalytics());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(GoogleAdData googleAdData, Context context, InterfaceC5872l0<AdManagerAdView> interfaceC5872l0, Function0<Unit> function0, Function1<? super GoogleAdAnalytics, Unit> function1, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f161742b = googleAdData;
            this.f161743c = context;
            this.f161744d = interfaceC5872l0;
            this.f161745e = function0;
            this.f161746f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f161742b, this.f161743c, this.f161744d, this.f161745e, this.f161746f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r0 = r8.f161741a
                if (r0 != 0) goto Lb4
                kotlin.ResultKt.b(r9)
                gi.d r9 = r8.f161742b
                r1 = 0
                if (r9 == 0) goto La8
                java.lang.String r9 = r9.getAdUnitId()
                boolean r9 = kotlin.text.StringsKt.s0(r9)
                if (r9 == 0) goto L1b
                goto La8
            L1b:
                com.google.android.gms.ads.admanager.AdManagerAdView r3 = new com.google.android.gms.ads.admanager.AdManagerAdView
                android.content.Context r9 = r8.f161743c
                r3.<init>(r9)
                gi.d r7 = r8.f161742b
                androidx.compose.runtime.l0<com.google.android.gms.ads.admanager.AdManagerAdView> r4 = r8.f161744d
                kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.f161745e
                kotlin.jvm.functions.Function1<gi.a, kotlin.Unit> r6 = r8.f161746f
                Gc.e[] r9 = r7.getAdSizes()     // Catch: java.lang.Exception -> L4c
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
                Gc.e[] r9 = r7.getAdSizes()     // Catch: java.lang.Exception -> L4c
                kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Exception -> L4c
                int r0 = r9.length     // Catch: java.lang.Exception -> L4c
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)     // Catch: java.lang.Exception -> L4c
                Gc.e[] r9 = (Gc.e[]) r9     // Catch: java.lang.Exception -> L4c
                r3.setAdSizes(r9)     // Catch: java.lang.Exception -> L4c
                goto L5f
            L4c:
                r0 = move-exception
                r9 = r0
                goto L89
            L4f:
                Gc.e r9 = r7.getAdSize()     // Catch: java.lang.Exception -> L4c
                if (r9 == 0) goto L7d
                Gc.e r9 = r7.getAdSize()     // Catch: java.lang.Exception -> L4c
                kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Exception -> L4c
                r3.setAdSize(r9)     // Catch: java.lang.Exception -> L4c
            L5f:
                java.lang.String r9 = r7.getAdUnitId()
                r3.setAdUnitId(r9)
                sr.p$w$a r2 = new sr.p$w$a
                r2.<init>(r3, r4, r5, r6, r7)
                r3.setAdListener(r2)
                Hc.a r9 = r7.getAdRequest()
                r3.f(r9)
                androidx.compose.runtime.l0<com.google.android.gms.ads.admanager.AdManagerAdView> r9 = r8.f161744d
                r9.setValue(r3)
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            L7d:
                qw.a$a r9 = qw.a.INSTANCE     // Catch: java.lang.Exception -> L4c
                java.lang.String r0 = "Ad not loaded: No adSize or adSizes provided."
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4c
                r9.d(r0, r2)     // Catch: java.lang.Exception -> L4c
                kotlin.Unit r9 = kotlin.Unit.f143329a     // Catch: java.lang.Exception -> L4c
                return r9
            L89:
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to set ad size(s) for "
                r2.append(r3)
                java.lang.String r3 = r7.getAdUnitId()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.f(r9, r2, r1)
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            La8:
                qw.a$a r9 = qw.a.INSTANCE
                java.lang.String r0 = "Ad not loaded: adData is null or adUnitId is blank."
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r9.d(r0, r1)
                kotlin.Unit r9 = kotlin.Unit.f143329a
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sr/p$b", "LGc/c;", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Gc.c {
        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class v {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC6165l.a.values().length];
            try {
                iArr[AbstractC6165l.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC6165l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC6165l.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, ExoPlayer exoPlayer, InterfaceC5872l0 interfaceC5872l0, Modifier modifier, int i10, Composer composer, int i11) {
        t(localThemeScope, exoPlayer, interfaceC5872l0, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
            AdManagerAdView adManagerAdViewS = S(googleAdData, (Function1) objB, null, composer2, ((i14 >> 6) & 14) | GoogleAdData.f134248f, 4);
            if (adManagerAdViewS == null) {
                modifier2 = modifier4;
            } else {
                modifier2 = modifier4;
                o(localThemeScope, modifier2, adManagerAdViewS, composer2, LocalThemeScope.f17314g | (i14 & 14) | (i14 & 112), 0);
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, Modifier modifier, GoogleAdData googleAdData, Function1 function1, int i10, int i11, Composer composer, int i12) {
        C(localThemeScope, modifier, googleAdData, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void F(final LocalThemeScope localThemeScope, final Context context, final gi.k imaAdHelper, final InterfaceC5872l0<ExoPlayer> exoPlayer, final InterfaceC5872l0<Long> savedPlaybackPosition, final InterfaceC5872l0<Boolean> wasPlayingBeforePause, final InterfaceC5872l0<Boolean> isVideoAdReady, final InterfaceC5872l0<Boolean> isMuted, Composer composer, final int i10) {
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
            Unit unit = Unit.f143329a;
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
            final InterfaceC6172s interfaceC6172s = (InterfaceC6172s) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(i14);
            boolean zD2 = (i13 == 2048) | (i17 == 16384) | ((458752 & i12) == 131072) | (i18 == 8388608) | composerStartRestartGroup.D(interfaceC6172s);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: sr.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.G(interfaceC6172s, exoPlayer, savedPlaybackPosition, wasPlayingBeforePause, isMuted, (F) obj);
                    }
                };
                composerStartRestartGroup.t(function1);
                objB2 = function1;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.c(interfaceC6172s, (Function1) objB2, composerStartRestartGroup, 0);
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
    public static final E G(InterfaceC6172s interfaceC6172s, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5872l0 interfaceC5872l02, final InterfaceC5872l0 interfaceC5872l03, final InterfaceC5872l0 interfaceC5872l04, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        InterfaceC6169p interfaceC6169p = new InterfaceC6169p() { // from class: sr.l
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s2, AbstractC6165l.a aVar) {
                p.H(interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04, interfaceC6172s2, aVar);
            }
        };
        interfaceC6172s.getLifecycle().a(interfaceC6169p);
        return new t(interfaceC6172s, interfaceC6169p, interfaceC5872l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
        Intrinsics.j(interfaceC6172s, "<unused var>");
        Intrinsics.j(event, "event");
        int i10 = v.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            ExoPlayer exoPlayer = (ExoPlayer) interfaceC5872l0.getValue();
            if (exoPlayer != null) {
                interfaceC5872l02.setValue(Long.valueOf(exoPlayer.g0()));
                interfaceC5872l03.setValue(Boolean.valueOf(exoPlayer.F()));
                exoPlayer.q(false);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) interfaceC5872l0.getValue();
            if (exoPlayer2 != null) {
                exoPlayer2.release();
            }
            interfaceC5872l0.setValue(null);
            return;
        }
        ExoPlayer exoPlayer3 = (ExoPlayer) interfaceC5872l0.getValue();
        if (exoPlayer3 != null) {
            exoPlayer3.P(((Number) interfaceC5872l02.getValue()).longValue());
            exoPlayer3.q(((Boolean) interfaceC5872l03.getValue()).booleanValue());
            exoPlayer3.h(((Boolean) interfaceC5872l04.getValue()).booleanValue() ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Context context, gi.k kVar, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04, InterfaceC5872l0 interfaceC5872l05, int i10, Composer composer, int i11) {
        F(localThemeScope, context, kVar, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04, interfaceC5872l05, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    public static final void J(final LocalThemeScope localThemeScope, final Modifier modifier, final ExoPlayer exoPlayer, final boolean z10, final long j10, final InterfaceC5872l0<Boolean> isMuted, final Function1<? super Long, Unit> onPlaybackPositionUpdate, Composer composer, final int i10) {
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
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.k(), composerStartRestartGroup, 6);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
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
            C14890K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, r12);
            composer2.startReplaceGroup(227364518);
            if (exoPlayer2 != null) {
                t(localThemeScope, exoPlayer2, isMuted, androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, cVar), cVar, r12, 3, cVar), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, cVar), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), composer2, LocalThemeScope.f17314g | (i11 & 14) | (i12 & 896));
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, ExoPlayer exoPlayer, boolean z10, long j10, InterfaceC5872l0 interfaceC5872l0, Function1 function1, int i10, Composer composer, int i11) {
        J(localThemeScope, modifier, exoPlayer, z10, j10, interfaceC5872l0, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        composer.P();
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        composer.startReplaceGroup(-1224400529);
        int i12 = i10 & 14;
        boolean zD = (((i12 ^ 6) > 4 && composer.D(googleAdData)) || (i10 & 6) == 4) | composer.D(context) | ((((i10 & 896) ^ 384) > 256 && composer.V(function02)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && composer.V(onAdClicked)) || (i10 & 48) == 32);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            googleAdData2 = googleAdData;
            Object wVar = new w(googleAdData2, context, interfaceC5872l0, function02, onAdClicked, null);
            composer.t(wVar);
            objB2 = wVar;
        } else {
            googleAdData2 = googleAdData;
        }
        composer.P();
        androidx.compose.runtime.J.g(googleAdData2, (Function2) objB2, composer, GoogleAdData.f134248f | i12);
        AdManagerAdView adManagerAdView = (AdManagerAdView) interfaceC5872l0.getValue();
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
    public static final void o(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final com.google.android.gms.ads.admanager.AdManagerAdView r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.p.o(Ki.M, androidx.compose.ui.Modifier, com.google.android.gms.ads.admanager.AdManagerAdView, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E q(AdManagerAdView adManagerAdView, InterfaceC5872l0 interfaceC5872l0, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        adManagerAdView.setAdListener(new c(interfaceC5872l0));
        return new k(adManagerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, AdManagerAdView adManagerAdView, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, adManagerAdView, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final ExoPlayer player, final InterfaceC5872l0<Boolean> isMuted, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        final InterfaceC5872l0 interfaceC5872l0;
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
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = f1.a(0L);
                composerStartRestartGroup.t(objB3);
            }
            InterfaceC5870k0 interfaceC5870k0 = (InterfaceC5870k0) objB3;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(player);
            Object objB4 = composerStartRestartGroup.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new n(interfaceC5870k0, player, null);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            int i13 = (i12 >> 3) & 14;
            androidx.compose.runtime.J.g(player, (Function2) objB4, composerStartRestartGroup, i13);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD2 = composerStartRestartGroup.D(player);
            Object objB5 = composerStartRestartGroup.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new o(player, interfaceC5872l02, null);
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(player, (Function2) objB5, composerStartRestartGroup, i13);
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.i(), composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            I one = localThemeScope.getAdsTypography().getBodyCompact().getOne();
            T adsColorText02 = localThemeScope.getAdsColors().getAdsColorText02();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 8;
            float f11 = 4;
            q1.Label label = new q1.Label(c14889j.c(androidx.compose.foundation.layout.D.j(androidx.compose.foundation.b.c(companion3, localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor(), C16806i.c(localThemeScope.getAdsCornerRadii().getRadius02().getDp())), H1.h.p(f10), H1.h.p(f11))), adsColorText02, null, null, 0, false, 0, one, null, 380, null);
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            Locale locale = Locale.US;
            long jC = interfaceC5870k0.c();
            long j10 = 1000;
            long j11 = jC / j10;
            long j12 = 60;
            String str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf((interfaceC5870k0.c() / j10) % j12)}, 2));
            Intrinsics.i(str, "format(...)");
            si.j.h(localThemeScope, label, str, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (q1.Label.f142335j << 3), 4);
            C14890K.a(InterfaceC14888I.b(c14889j, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean zU = u(interfaceC5872l02);
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
            C18052y0.b(zU, (Function1) objB6, c14889j.c(androidx.compose.foundation.layout.D.i(C13572f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16806i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(-588255742, true, new C2529p(interfaceC5872l02), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 24);
            C14890K.a(c14889j.c(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(f10))), composerStartRestartGroup, 0);
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
            C18052y0.b(zBooleanValue, (Function1) objB7, c14889j.c(androidx.compose.foundation.layout.D.i(C13572f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16806i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(86264889, true, new q(isMuted), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 24);
            C14890K.a(c14889j.c(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(f10))), composerStartRestartGroup, 0);
            boolean zW = w(interfaceC5872l03);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD5 = composerStartRestartGroup.D(player);
            Object objB8 = composerStartRestartGroup.B();
            if (zD5 || objB8 == companion.a()) {
                interfaceC5872l0 = interfaceC5872l03;
                objB8 = new Function1() { // from class: sr.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.A(player, interfaceC5872l0, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB8);
            } else {
                interfaceC5872l0 = interfaceC5872l03;
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C18052y0.b(zW, (Function1) objB8, c14889j.c(androidx.compose.foundation.layout.D.i(C13572f.g(androidx.compose.foundation.layout.J.v(companion3, H1.h.p(f12)), H1.h.p(f13), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), C16806i.c(localThemeScope.getAdsCornerRadii().getRadius03().getDp())), H1.h.p(f11))), false, null, ComposableLambdaKt.c(-2065218246, true, new r(interfaceC5872l0), composerStartRestartGroup, 54), composer2, 196608, 24);
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(ExoPlayer exoPlayer, InterfaceC5872l0 interfaceC5872l0, boolean z10) {
        s3.n nVar;
        x(interfaceC5872l0, z10);
        AbstractC16998D abstractC16998DA = exoPlayer.a();
        if (abstractC16998DA instanceof s3.n) {
            nVar = (s3.n) abstractC16998DA;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            return Unit.f143329a;
        }
        n.e eVarC = nVar.c();
        Intrinsics.i(eVarC, "getParameters(...)");
        nVar.m(eVarC.a().r0(3, !w(interfaceC5872l0)).F());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void x(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(InterfaceC5872l0 interfaceC5872l0, ExoPlayer exoPlayer, boolean z10) {
        float f10;
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
        if (((Boolean) interfaceC5872l0.getValue()).booleanValue()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        exoPlayer.h(f10);
        return Unit.f143329a;
    }
}
