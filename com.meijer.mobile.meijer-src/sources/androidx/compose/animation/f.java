package androidx.compose.animation;

import P0.e;
import V0.L1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.C6446d0;
import kotlin.C6453j;
import kotlin.C6457n;
import kotlin.ChangeSize;
import kotlin.E0;
import kotlin.EnumC6311k;
import kotlin.Fade;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Scale;
import kotlin.Slide;
import kotlin.TransitionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import kotlin.o0;
import kotlin.q0;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001aB\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aB\u0010\u0015\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b!\u0010\"\u001aX\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b%\u0010&\u001aX\u0010+\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010*\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b+\u0010,\u001aX\u0010.\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b.\u0010/\u001aD\u00102\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b2\u0010\u0013\u001aD\u00104\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b4\u0010\u0013\u001aD\u00106\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b6\u0010\u0016\u001aD\u00108\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b8\u0010\u0016\u001a\u0013\u00109\u001a\u00020\u001c*\u00020'H\u0002¢\u0006\u0004\b9\u0010:\u001aA\u0010D\u001a\u00020C*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\b2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010E\u001a!\u0010F\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u0004H\u0001¢\u0006\u0004\bF\u0010G\u001a!\u0010H\u001a\u00020\b*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010>\u001a\u00020\bH\u0001¢\u0006\u0004\bH\u0010I\u001a1\u0010K\u001a\u00020J*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\b2\u0006\u0010B\u001a\u00020AH\u0003¢\u0006\u0004\bK\u0010L\" \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P\"\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\"\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000b0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010T\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\r0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\²\u0006\u000e\u0010Z\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010[\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lc0/F;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/h;", "l", "(Lc0/F;F)Landroidx/compose/animation/h;", "targetAlpha", "Landroidx/compose/animation/j;", "n", "(Lc0/F;F)Landroidx/compose/animation/j;", "LH1/n;", "Lkotlin/Function1;", "LH1/r;", "Lkotlin/ParameterName;", "name", "fullSize", "initialOffset", "v", "(Lc0/F;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;", "targetOffset", "A", "(Lc0/F;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;", "initialScale", "Landroidx/compose/ui/graphics/i;", "transformOrigin", "p", "(Lc0/F;FJ)Landroidx/compose/animation/h;", "LP0/e;", "expandFrom", "", "clip", "initialSize", "h", "(Lc0/F;LP0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;", "shrinkTowards", "targetSize", "r", "(Lc0/F;LP0/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;", "LP0/e$c;", "", "fullHeight", "initialHeight", "j", "(Lc0/F;LP0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/h;", "targetHeight", "t", "(Lc0/F;LP0/e$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/j;", "fullWidth", "initialOffsetX", "w", "initialOffsetY", "y", "targetOffsetX", "B", "targetOffsetY", "D", "F", "(LP0/e$c;)LP0/e;", "Lc0/k0;", "Lb0/k;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/Modifier;", "g", "(Lc0/k0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "G", "(Lc0/k0;Landroidx/compose/animation/h;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/h;", "J", "(Lc0/k0;Landroidx/compose/animation/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/j;", "Lb0/p;", "e", "(Lc0/k0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lb0/p;", "Lc0/o0;", "Lc0/n;", "a", "Lc0/o0;", "TransformOriginVectorConverter", "Lc0/d0;", "b", "Lc0/d0;", "DefaultAlphaAndScaleSpring", "c", "DefaultOffsetAnimationSpec", "d", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final o0<androidx.compose.ui.graphics.i, C6457n> f48031a = q0.a(a.f48035f, b.f48036f);

    /* renamed from: b, reason: collision with root package name */
    private static final C6446d0<Float> f48032b = C6453j.j(0.0f, 400.0f, null, 5, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C6446d0<H1.n> f48033c = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);

    /* renamed from: d, reason: collision with root package name */
    private static final C6446d0<H1.r> f48034d = C6453j.j(0.0f, 400.0f, H1.r.b(E0.d(H1.r.INSTANCE)), 1, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/i;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<androidx.compose.ui.graphics.i, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48035f = new a();

        a() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n(androidx.compose.ui.graphics.i.f(j10), androidx.compose.ui.graphics.i.g(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(androidx.compose.ui.graphics.i iVar) {
            return a(iVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "Landroidx/compose/ui/graphics/i;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<C6457n, androidx.compose.ui.graphics.i> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f48036f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.i invoke(C6457n c6457n) {
            return androidx.compose.ui.graphics.i.b(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            return L1.a(c6457n.getV1(), c6457n.getV2());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<k0.b<EnumC6311k>, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f48037f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f48038g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f48037f = hVar;
            this.f48038g = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6419F<Float> invoke(k0.b<EnumC6311k> bVar) {
            InterfaceC6419F<Float> interfaceC6419FB;
            InterfaceC6419F<Float> interfaceC6419FB2;
            EnumC6311k enumC6311k = EnumC6311k.f59822a;
            EnumC6311k enumC6311k2 = EnumC6311k.f59823b;
            if (bVar.c(enumC6311k, enumC6311k2)) {
                Fade fade = this.f48037f.getData().getFade();
                return (fade == null || (interfaceC6419FB2 = fade.b()) == null) ? f.f48032b : interfaceC6419FB2;
            }
            if (!bVar.c(enumC6311k2, EnumC6311k.f59824c)) {
                return f.f48032b;
            }
            Fade fade2 = this.f48038g.getData().getFade();
            return (fade2 == null || (interfaceC6419FB = fade2.b()) == null) ? f.f48032b : interfaceC6419FB;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "", "a", "(Lb0/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<EnumC6311k, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f48039f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f48040g;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6311k.values().length];
                try {
                    iArr[EnumC6311k.f59823b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6311k.f59822a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6311k.f59824c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f48039f = hVar;
            this.f48040g = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(EnumC6311k enumC6311k) {
            int i10 = a.$EnumSwitchMapping$0[enumC6311k.ordinal()];
            float alpha = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    Fade fade = this.f48039f.getData().getFade();
                    if (fade != null) {
                        alpha = fade.getAlpha();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade2 = this.f48040g.getData().getFade();
                    if (fade2 != null) {
                        alpha = fade2.getAlpha();
                    }
                }
            }
            return Float.valueOf(alpha);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Float> f48041f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f48042g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1<androidx.compose.ui.graphics.i> f48043h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z1<Float> z1Var, z1<Float> z1Var2, z1<androidx.compose.ui.graphics.i> z1Var3) {
            super(1);
            this.f48041f = z1Var;
            this.f48042g = z1Var2;
            this.f48043h = z1Var3;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            z1<Float> z1Var = this.f48041f;
            eVar.d(z1Var != null ? z1Var.getValue().floatValue() : 1.0f);
            z1<Float> z1Var2 = this.f48042g;
            eVar.h(z1Var2 != null ? z1Var2.getValue().floatValue() : 1.0f);
            z1<Float> z1Var3 = this.f48042g;
            eVar.m(z1Var3 != null ? z1Var3.getValue().floatValue() : 1.0f);
            z1<androidx.compose.ui.graphics.i> z1Var4 = this.f48043h;
            eVar.F0(z1Var4 != null ? z1Var4.getValue().getPackedValue() : androidx.compose.ui.graphics.i.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.animation.f$f, reason: collision with other inner class name */
    static final class C0987f extends Lambda implements Function1<k0.b<EnumC6311k>, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f48044f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f48045g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0987f(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f48044f = hVar;
            this.f48045g = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6419F<Float> invoke(k0.b<EnumC6311k> bVar) {
            InterfaceC6419F<Float> interfaceC6419FA;
            InterfaceC6419F<Float> interfaceC6419FA2;
            EnumC6311k enumC6311k = EnumC6311k.f59822a;
            EnumC6311k enumC6311k2 = EnumC6311k.f59823b;
            if (bVar.c(enumC6311k, enumC6311k2)) {
                Scale scale = this.f48044f.getData().getScale();
                return (scale == null || (interfaceC6419FA2 = scale.a()) == null) ? f.f48032b : interfaceC6419FA2;
            }
            if (!bVar.c(enumC6311k2, EnumC6311k.f59824c)) {
                return f.f48032b;
            }
            Scale scale2 = this.f48045g.getData().getScale();
            return (scale2 == null || (interfaceC6419FA = scale2.a()) == null) ? f.f48032b : interfaceC6419FA;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "", "a", "(Lb0/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<EnumC6311k, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f48046f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f48047g;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6311k.values().length];
                try {
                    iArr[EnumC6311k.f59823b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6311k.f59822a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6311k.f59824c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f48046f = hVar;
            this.f48047g = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(EnumC6311k enumC6311k) {
            int i10 = a.$EnumSwitchMapping$0[enumC6311k.ordinal()];
            float scale = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    Scale scale2 = this.f48046f.getData().getScale();
                    if (scale2 != null) {
                        scale = scale2.getScale();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale3 = this.f48047g.getData().getScale();
                    if (scale3 != null) {
                        scale = scale3.getScale();
                    }
                }
            }
            return Float.valueOf(scale);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lb0/k;", "Lc0/F;", "Landroidx/compose/ui/graphics/i;", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<k0.b<EnumC6311k>, InterfaceC6419F<androidx.compose.ui.graphics.i>> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f48048f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6419F<androidx.compose.ui.graphics.i> invoke(k0.b<EnumC6311k> bVar) {
            return C6453j.j(0.0f, 0.0f, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/k;", "it", "Landroidx/compose/ui/graphics/i;", "a", "(Lb0/k;)J"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function1<EnumC6311k, androidx.compose.ui.graphics.i> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.i f48049f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f48050g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f48051h;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6311k.values().length];
                try {
                    iArr[EnumC6311k.f59823b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6311k.f59822a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6311k.f59824c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.i iVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f48049f = iVar;
            this.f48050g = hVar;
            this.f48051h = jVar;
        }

        public final long a(EnumC6311k enumC6311k) {
            androidx.compose.ui.graphics.i iVarB;
            int i10 = a.$EnumSwitchMapping$0[enumC6311k.ordinal()];
            if (i10 != 1) {
                iVarB = null;
                if (i10 == 2) {
                    Scale scale = this.f48050g.getData().getScale();
                    if (scale != null || (scale = this.f48051h.getData().getScale()) != null) {
                        iVarB = androidx.compose.ui.graphics.i.b(scale.getTransformOrigin());
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale2 = this.f48051h.getData().getScale();
                    if (scale2 != null || (scale2 = this.f48050g.getData().getScale()) != null) {
                        iVarB = androidx.compose.ui.graphics.i.b(scale2.getTransformOrigin());
                    }
                }
            } else {
                iVarB = this.f48049f;
            }
            return iVarB != null ? iVarB.getPackedValue() : androidx.compose.ui.graphics.i.INSTANCE.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.i invoke(EnumC6311k enumC6311k) {
            return androidx.compose.ui.graphics.i.b(a(enumC6311k));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f48052f = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f48053f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f48054g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, Function0<Boolean> function0) {
            super(1);
            this.f48053f = z10;
            this.f48054g = function0;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            eVar.D(!this.f48053f && this.f48054g.invoke().booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class l extends Lambda implements Function1<H1.r, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f48055f = new l();

        l() {
            super(1);
        }

        public final long a(long j10) {
            long j11 = 0;
            return H1.r.c((j11 & 4294967295L) | (j11 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(H1.r rVar) {
            return H1.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class m extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f48056f = new m();

        m() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class n extends Lambda implements Function1<H1.r, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48057f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48057f = function1;
        }

        public final long a(long j10) {
            return H1.r.c((this.f48057f.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue() & 4294967295L) | (((int) (j10 >> 32)) << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(H1.r rVar) {
            return H1.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class o extends Lambda implements Function1<H1.r, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        public static final o f48058f = new o();

        o() {
            super(1);
        }

        public final long a(long j10) {
            long j11 = 0;
            return H1.r.c((j11 & 4294967295L) | (j11 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(H1.r rVar) {
            return H1.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class p extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final p f48059f = new p();

        p() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class q extends Lambda implements Function1<H1.r, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48060f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48060f = function1;
        }

        public final long a(long j10) {
            return H1.r.c((this.f48060f.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue() & 4294967295L) | (((int) (j10 >> 32)) << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(H1.r rVar) {
            return H1.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class r extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final r f48061f = new r();

        r() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "LH1/n;", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class s extends Lambda implements Function1<H1.r, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48062f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48062f = function1;
        }

        public final long a(long j10) {
            return H1.n.f((this.f48062f.invoke(Integer.valueOf((int) (j10 >> 32))).intValue() << 32) | (0 & 4294967295L));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar) {
            return H1.n.c(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class t extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final t f48063f = new t();

        t() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "LH1/n;", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class u extends Lambda implements Function1<H1.r, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48064f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48064f = function1;
        }

        public final long a(long j10) {
            return H1.n.f((this.f48064f.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue() & 4294967295L) | (0 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar) {
            return H1.n.c(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class v extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final v f48065f = new v();

        v() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "LH1/n;", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class w extends Lambda implements Function1<H1.r, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48066f = function1;
        }

        public final long a(long j10) {
            return H1.n.f((this.f48066f.invoke(Integer.valueOf((int) (j10 >> 32))).intValue() << 32) | (0 & 4294967295L));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar) {
            return H1.n.c(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class x extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final x f48067f = new x();

        x() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "LH1/n;", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class y extends Lambda implements Function1<H1.r, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f48068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f48068f = function1;
        }

        public final long a(long j10) {
            return H1.n.f((this.f48068f.invoke(Integer.valueOf((int) (j10 & 4294967295L))).intValue() & 4294967295L) | (0 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar) {
            return H1.n.c(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function1 f(c0.k0.a r3, c0.k0.a r4, kotlin.k0 r5, androidx.compose.animation.h r6, androidx.compose.animation.j r7, c0.k0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.f$c r1 = new androidx.compose.animation.f$c
            r1.<init>(r6, r7)
            androidx.compose.animation.f$d r2 = new androidx.compose.animation.f$d
            r2.<init>(r6, r7)
            androidx.compose.runtime.z1 r3 = r3.a(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.f$f r1 = new androidx.compose.animation.f$f
            r1.<init>(r6, r7)
            androidx.compose.animation.f$g r2 = new androidx.compose.animation.f$g
            r2.<init>(r6, r7)
            androidx.compose.runtime.z1 r4 = r4.a(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.h()
            b0.k r1 = kotlin.EnumC6311k.f59822a
            if (r5 != r1) goto L4d
            b0.z r5 = r6.getData()
            b0.s r5 = r5.getScale()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.getTransformOrigin()
            androidx.compose.ui.graphics.i r5 = androidx.compose.ui.graphics.i.b(r1)
            goto L6b
        L40:
            b0.z r5 = r7.getData()
            b0.s r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            b0.z r5 = r7.getData()
            b0.s r5 = r5.getScale()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.getTransformOrigin()
            androidx.compose.ui.graphics.i r5 = androidx.compose.ui.graphics.i.b(r1)
            goto L6b
        L60:
            b0.z r5 = r6.getData()
            b0.s r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.f$h r0 = androidx.compose.animation.f.h.f48048f
            androidx.compose.animation.f$i r1 = new androidx.compose.animation.f$i
            r1.<init>(r5, r6, r7)
            androidx.compose.runtime.z1 r0 = r8.a(r0, r1)
        L78:
            androidx.compose.animation.f$e r5 = new androidx.compose.animation.f$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.f(c0.k0$a, c0.k0$a, c0.k0, androidx.compose.animation.h, androidx.compose.animation.j, c0.k0$a):kotlin.jvm.functions.Function1");
    }

    public static final androidx.compose.animation.j A(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super H1.r, H1.n> function1) {
        return new androidx.compose.animation.k(new TransitionData(null, new Slide(function1, interfaceC6419F), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.j B(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super Integer, Integer> function1) {
        return A(interfaceC6419F, new w(function1));
    }

    public static /* synthetic */ androidx.compose.animation.j C(InterfaceC6419F interfaceC6419F, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = v.f48065f;
        }
        return B(interfaceC6419F, function1);
    }

    public static final androidx.compose.animation.j D(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super Integer, Integer> function1) {
        return A(interfaceC6419F, new y(function1));
    }

    public static /* synthetic */ androidx.compose.animation.j E(InterfaceC6419F interfaceC6419F, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = x.f48067f;
        }
        return D(interfaceC6419F, function1);
    }

    private static final P0.e F(e.c cVar) {
        e.Companion companion = P0.e.INSTANCE;
        return Intrinsics.e(cVar, companion.l()) ? companion.m() : Intrinsics.e(cVar, companion.a()) ? companion.b() : companion.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[PHI: r1
      0x011e: PHI (r1v11 androidx.compose.animation.h) = (r1v9 androidx.compose.animation.h), (r1v12 androidx.compose.animation.h) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[PHI: r2
      0x0139: PHI (r2v10 androidx.compose.animation.j) = (r2v8 androidx.compose.animation.j), (r2v11 androidx.compose.animation.j) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.p e(final kotlin.k0<kotlin.EnumC6311k> r19, androidx.compose.animation.h r20, androidx.compose.animation.j r21, java.lang.String r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.e(c0.k0, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, androidx.compose.runtime.Composer, int):b0.p");
    }

    public static final Modifier g(k0<EnumC6311k> k0Var, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function0<Boolean> function0, String str, Composer composer, int i10, int i11) {
        k0.a aVar;
        k0.a aVar2;
        ChangeSize changeSize;
        Function0<Boolean> function02 = (i11 & 4) != 0 ? j.f48052f : function0;
        if (ComposerKt.M()) {
            ComposerKt.U(28261782, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i12 = i10 & 14;
        androidx.compose.animation.h hVarG = G(k0Var, hVar, composer, i10 & 126);
        int i13 = i10 >> 3;
        androidx.compose.animation.j jVarJ = J(k0Var, jVar, composer, (i13 & 112) | i12);
        boolean z10 = true;
        boolean z11 = (hVarG.getData().getSlide() == null && jVarJ.getData().getSlide() == null) ? false : true;
        boolean z12 = (hVarG.getData().getChangeSize() == null && jVarJ.getData().getChangeSize() == null) ? false : true;
        k0.a aVarE = null;
        if (z11) {
            composer.startReplaceGroup(-821159459);
            o0<H1.n, C6457n> o0VarD = q0.d(H1.n.INSTANCE);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = str + " slide";
                composer.t(objB);
            }
            k0.a aVarE2 = l0.e(k0Var, o0VarD, (String) objB, composer, i12 | 384, 0);
            composer.P();
            aVar = aVarE2;
        } else {
            composer.startReplaceGroup(-821053656);
            composer.P();
            aVar = null;
        }
        if (z12) {
            composer.startReplaceGroup(-820961865);
            o0<H1.r, C6457n> o0VarE = q0.e(H1.r.INSTANCE);
            Object objB2 = composer.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = str + " shrink/expand";
                composer.t(objB2);
            }
            k0.a aVarE3 = l0.e(k0Var, o0VarE, (String) objB2, composer, i12 | 384, 0);
            composer.P();
            aVar2 = aVarE3;
        } else {
            composer.startReplaceGroup(-820851041);
            composer.P();
            aVar2 = null;
        }
        if (z12) {
            composer.startReplaceGroup(-820777446);
            o0<H1.n, C6457n> o0VarD2 = q0.d(H1.n.INSTANCE);
            Object objB3 = composer.B();
            if (objB3 == Composer.INSTANCE.a()) {
                objB3 = str + " InterruptionHandlingOffset";
                composer.t(objB3);
            }
            aVarE = l0.e(k0Var, o0VarD2, (String) objB3, composer, i12 | 384, 0);
            composer.P();
        } else {
            composer.startReplaceGroup(-820608001);
            composer.P();
        }
        ChangeSize changeSize2 = hVarG.getData().getChangeSize();
        boolean z13 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = jVarJ.getData().getChangeSize()) == null || changeSize.getClip()) && z12) ? false : true;
        kotlin.p pVarE = e(k0Var, hVarG, jVarJ, str, composer, i12 | (i13 & 7168));
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean zA = composer.a(z13);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !composer.V(function02)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = zA | z10;
        Object objB4 = composer.B();
        if (z14 || objB4 == Composer.INSTANCE.a()) {
            objB4 = new k(z13, function02);
            composer.t(objB4);
        }
        Modifier modifierThen = androidx.compose.ui.graphics.d.a(companion, (Function1) objB4).then(new EnterExitTransitionElement(k0Var, aVar2, aVarE, aVar, hVarG, jVarJ, function02, pVarE));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return modifierThen;
    }

    public static final androidx.compose.animation.h h(InterfaceC6419F<H1.r> interfaceC6419F, P0.e eVar, boolean z10, Function1<? super H1.r, H1.r> function1) {
        return new androidx.compose.animation.i(new TransitionData(null, null, new ChangeSize(eVar, function1, interfaceC6419F, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.h i(InterfaceC6419F interfaceC6419F, P0.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.r.b(E0.d(H1.r.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = P0.e.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = l.f48055f;
        }
        return h(interfaceC6419F, eVar, z10, function1);
    }

    public static /* synthetic */ androidx.compose.animation.h k(InterfaceC6419F interfaceC6419F, e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.r.b(E0.d(H1.r.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = P0.e.INSTANCE.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = m.f48056f;
        }
        return j(interfaceC6419F, cVar, z10, function1);
    }

    public static final androidx.compose.animation.h l(InterfaceC6419F<Float> interfaceC6419F, float f10) {
        return new androidx.compose.animation.i(new TransitionData(new Fade(f10, interfaceC6419F), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.h m(InterfaceC6419F interfaceC6419F, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return l(interfaceC6419F, f10);
    }

    public static final androidx.compose.animation.j n(InterfaceC6419F<Float> interfaceC6419F, float f10) {
        return new androidx.compose.animation.k(new TransitionData(new Fade(f10, interfaceC6419F), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.j o(InterfaceC6419F interfaceC6419F, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(interfaceC6419F, f10);
    }

    public static final androidx.compose.animation.h p(InterfaceC6419F<Float> interfaceC6419F, float f10, long j10) {
        return new androidx.compose.animation.i(new TransitionData(null, null, null, new Scale(f10, j10, interfaceC6419F, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.h q(InterfaceC6419F interfaceC6419F, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.i.INSTANCE.a();
        }
        return p(interfaceC6419F, f10, j10);
    }

    public static final androidx.compose.animation.j r(InterfaceC6419F<H1.r> interfaceC6419F, P0.e eVar, boolean z10, Function1<? super H1.r, H1.r> function1) {
        return new androidx.compose.animation.k(new TransitionData(null, null, new ChangeSize(eVar, function1, interfaceC6419F, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.j s(InterfaceC6419F interfaceC6419F, P0.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.r.b(E0.d(H1.r.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = P0.e.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = o.f48058f;
        }
        return r(interfaceC6419F, eVar, z10, function1);
    }

    public static /* synthetic */ androidx.compose.animation.j u(InterfaceC6419F interfaceC6419F, e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.r.b(E0.d(H1.r.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = P0.e.INSTANCE.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = p.f48059f;
        }
        return t(interfaceC6419F, cVar, z10, function1);
    }

    public static final androidx.compose.animation.h v(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super H1.r, H1.n> function1) {
        return new androidx.compose.animation.i(new TransitionData(null, new Slide(function1, interfaceC6419F), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.h w(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super Integer, Integer> function1) {
        return v(interfaceC6419F, new s(function1));
    }

    public static /* synthetic */ androidx.compose.animation.h x(InterfaceC6419F interfaceC6419F, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = r.f48061f;
        }
        return w(interfaceC6419F, function1);
    }

    public static final androidx.compose.animation.h y(InterfaceC6419F<H1.n> interfaceC6419F, Function1<? super Integer, Integer> function1) {
        return v(interfaceC6419F, new u(function1));
    }

    public static /* synthetic */ androidx.compose.animation.h z(InterfaceC6419F interfaceC6419F, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = t.f48063f;
        }
        return y(interfaceC6419F, function1);
    }

    public static final androidx.compose.animation.h G(k0<EnumC6311k> k0Var, androidx.compose.animation.h hVar, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        if ((((i10 & 14) ^ 6) > 4 && composer.V(k0Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = t1.e(hVar, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        if (k0Var.h() == k0Var.o() && k0Var.h() == EnumC6311k.f59823b) {
            if (k0Var.t()) {
                I(interfaceC5872l0, hVar);
            } else {
                I(interfaceC5872l0, androidx.compose.animation.h.INSTANCE.a());
            }
        } else if (k0Var.o() == EnumC6311k.f59823b) {
            I(interfaceC5872l0, H(interfaceC5872l0).c(hVar));
        }
        androidx.compose.animation.h hVarH = H(interfaceC5872l0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return hVarH;
    }

    private static final androidx.compose.animation.h H(InterfaceC5872l0<androidx.compose.animation.h> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void I(InterfaceC5872l0<androidx.compose.animation.h> interfaceC5872l0, androidx.compose.animation.h hVar) {
        interfaceC5872l0.setValue(hVar);
    }

    public static final androidx.compose.animation.j J(k0<EnumC6311k> k0Var, androidx.compose.animation.j jVar, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        if ((((i10 & 14) ^ 6) > 4 && composer.V(k0Var)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = t1.e(jVar, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        if (k0Var.h() == k0Var.o() && k0Var.h() == EnumC6311k.f59823b) {
            if (k0Var.t()) {
                L(interfaceC5872l0, jVar);
            } else {
                L(interfaceC5872l0, androidx.compose.animation.j.INSTANCE.a());
            }
        } else if (k0Var.o() != EnumC6311k.f59823b) {
            L(interfaceC5872l0, K(interfaceC5872l0).c(jVar));
        }
        androidx.compose.animation.j jVarK = K(interfaceC5872l0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jVarK;
    }

    private static final androidx.compose.animation.j K(InterfaceC5872l0<androidx.compose.animation.j> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void L(InterfaceC5872l0<androidx.compose.animation.j> interfaceC5872l0, androidx.compose.animation.j jVar) {
        interfaceC5872l0.setValue(jVar);
    }

    public static final androidx.compose.animation.h j(InterfaceC6419F<H1.r> interfaceC6419F, e.c cVar, boolean z10, Function1<? super Integer, Integer> function1) {
        return h(interfaceC6419F, F(cVar), z10, new n(function1));
    }

    public static final androidx.compose.animation.j t(InterfaceC6419F<H1.r> interfaceC6419F, e.c cVar, boolean z10, Function1<? super Integer, Integer> function1) {
        return r(interfaceC6419F, F(cVar), z10, new q(function1));
    }
}
