package androidx.compose.animation;

import H1.r;
import H1.t;
import Z.W;
import Z.i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.Y;
import kotlin.AbstractC6176q;
import kotlin.C6169i;
import kotlin.C6327j;
import kotlin.C6331n;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import kotlin.q0;
import kotlin.u;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u00109\u0014B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR1\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020 8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R,\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0)0(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R*\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00107\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u00106R\u0014\u00108\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<²\u0006\u0014\u0010;\u001a\u00020:\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/d;", "Lc0/k0;", "transition", "LP0/e;", "contentAlignment", "LH1/t;", "layoutDirection", "<init>", "(Lc0/k0;LP0/e;LH1/t;)V", "Lb0/i;", "contentTransform", "Landroidx/compose/ui/Modifier;", "d", "(Lb0/i;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "a", "Lc0/k0;", "getTransition$animation_release", "()Lc0/k0;", "b", "LP0/e;", "g", "()LP0/e;", "j", "(LP0/e;)V", "c", "LH1/t;", "getLayoutDirection$animation_release", "()LH1/t;", "k", "(LH1/t;)V", "LH1/r;", "<set-?>", "Landroidx/compose/runtime/l0;", "getMeasuredSize-YbymL2g$animation_release", "()J", "l", "(J)V", "measuredSize", "LZ/W;", "Landroidx/compose/runtime/z1;", "e", "LZ/W;", "h", "()LZ/W;", "targetSizeMap", "f", "Landroidx/compose/runtime/z1;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/z1;", "i", "(Landroidx/compose/runtime/z1;)V", "animatedSize", "()Ljava/lang/Object;", "initialState", "targetState", "SizeModifierElement", "", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements d<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0<S> transition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private P0.e contentAlignment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 measuredSize = t1.e(r.b(r.INSTANCE.a()), null, 2, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final W<S, z1<r>> targetSizeMap = i0.c();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z1<r> animatedSize;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "Lc0/k0$a;", "LH1/r;", "Lc0/n;", "Lc0/k0;", "sizeAnimation", "Landroidx/compose/runtime/z1;", "Lb0/u;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Lc0/k0$a;Landroidx/compose/runtime/z1;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "n", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "", "o", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;)V", "b", "Lc0/k0$a;", "getSizeAnimation", "()Lc0/k0$a;", "c", "Landroidx/compose/runtime/z1;", "getSizeTransform", "()Landroidx/compose/runtime/z1;", "d", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SizeModifierElement<S> extends Y<b<S>> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final k0<S>.a<r, C6331n> sizeAnimation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final z1<u> sizeTransform;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final AnimatedContentTransitionScopeImpl<S> scope;

        public boolean equals(Object other) {
            if (!(other instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) other;
            return Intrinsics.e(sizeModifierElement.sizeAnimation, this.sizeAnimation) && Intrinsics.e(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            k0<S>.a<r, C6331n> aVar = this.sizeAnimation;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public b<S> b() {
            return new b<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(b<S> node) {
            node.P2(this.sizeAnimation);
            node.Q2(this.sizeTransform);
            node.O2(this.scope);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(k0<S>.a<r, C6331n> aVar, z1<? extends u> z1Var, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = aVar;
            this.sizeTransform = z1Var;
            this.scope = animatedContentTransitionScopeImpl;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$a;", "Landroidx/compose/ui/layout/c0;", "", "isTarget", "<init>", "(Z)V", "LH1/d;", "", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()Z", "c", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements c0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 isTarget;

        @Override // androidx.compose.ui.layout.c0
        public Object R(H1.d dVar, Object obj) {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void c(boolean z10) {
            this.isTarget.setValue(Boolean.valueOf(z10));
        }

        public a(boolean z10) {
            this.isTarget = t1.e(Boolean.valueOf(z10), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "S", "Lb0/q;", "Lc0/k0$a;", "LH1/r;", "Lc0/n;", "Lc0/k0;", "sizeAnimation", "Landroidx/compose/runtime/z1;", "Lb0/u;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Lc0/k0$a;Landroidx/compose/runtime/z1;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "default", "N2", "(J)J", "", "v2", "()V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lc0/k0$a;", "getSizeAnimation", "()Lc0/k0$a;", "P2", "(Lc0/k0$a;)V", "p", "Landroidx/compose/runtime/z1;", "M2", "()Landroidx/compose/runtime/z1;", "Q2", "(Landroidx/compose/runtime/z1;)V", "q", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "L2", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "O2", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "r", "J", "lastSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b<S> extends AbstractC6176q {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private k0<S>.a<r, C6331n> sizeAnimation;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private z1<? extends u> sizeTransform;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private AnimatedContentTransitionScopeImpl<S> scope;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long lastSize = androidx.compose.animation.a.f47756a;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b<S> f47738f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ f0 f47739g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f47740h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b<S> bVar, f0 f0Var, long j10) {
                super(1);
                this.f47738f = bVar;
                this.f47739g = f0Var;
                this.f47740h = j10;
            }

            public final void a(f0.a aVar) {
                f0.a.j(aVar, this.f47739g, this.f47738f.L2().getContentAlignment().a(r.c((this.f47739g.getWidth() << 32) | (this.f47739g.getHeight() & 4294967295L)), this.f47740h, t.f12006a), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "LH1/r;", "a", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function1<S, r> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b<S> f47743f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f47744g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b<S> bVar, long j10) {
                super(1);
                this.f47743f = bVar;
                this.f47744g = j10;
            }

            public final long a(S s10) {
                if (Intrinsics.e(s10, this.f47743f.L2().b())) {
                    return this.f47743f.N2(this.f47744g);
                }
                z1<r> z1VarE = this.f47743f.L2().h().e(s10);
                return z1VarE != null ? z1VarE.getValue().getPackedValue() : r.INSTANCE.a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                return r.b(a(obj));
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Lc0/k0$b;", "Lc0/F;", "LH1/r;", "a", "(Lc0/k0$b;)Lc0/F;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$b, reason: collision with other inner class name */
        static final class C0968b extends Lambda implements Function1<k0.b<S>, InterfaceC6293F<r>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b<S> f47741f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f47742g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0968b(b<S> bVar, long j10) {
                super(1);
                this.f47741f = bVar;
                this.f47742g = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6293F<r> invoke(k0.b<S> bVar) {
                long jA;
                long jA2;
                InterfaceC6293F<r> interfaceC6293FB;
                if (Intrinsics.e(bVar.b(), this.f47741f.L2().b())) {
                    jA = this.f47741f.N2(this.f47742g);
                } else {
                    z1<r> z1VarE = this.f47741f.L2().h().e(bVar.b());
                    if (z1VarE != null) {
                        jA = z1VarE.getValue().getPackedValue();
                    } else {
                        jA = r.INSTANCE.a();
                    }
                }
                z1<r> z1VarE2 = this.f47741f.L2().h().e(bVar.a());
                if (z1VarE2 != null) {
                    jA2 = z1VarE2.getValue().getPackedValue();
                } else {
                    jA2 = r.INSTANCE.a();
                }
                u value = this.f47741f.M2().getValue();
                if (value != null && (interfaceC6293FB = value.b(jA, jA2)) != null) {
                    return interfaceC6293FB;
                }
                return C6327j.j(0.0f, 400.0f, null, 5, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long N2(long j10) {
            return r.e(this.lastSize, androidx.compose.animation.a.f47756a) ? j10 : this.lastSize;
        }

        public final AnimatedContentTransitionScopeImpl<S> L2() {
            return this.scope;
        }

        public final z1<u> M2() {
            return this.sizeTransform;
        }

        public final void O2(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void P2(k0<S>.a<r, C6331n> aVar) {
            this.sizeAnimation = aVar;
        }

        public final void Q2(z1<? extends u> z1Var) {
            this.sizeTransform = z1Var;
        }

        public b(k0<S>.a<r, C6331n> aVar, z1<? extends u> z1Var, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = aVar;
            this.sizeTransform = z1Var;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.D
        public J a(K k10, I i10, long j10) {
            long packedValue;
            f0 f0VarK0 = i10.k0(j10);
            if (k10.v0()) {
                packedValue = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                packedValue = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
                this.lastSize = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
            } else {
                long jC = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
                k0<S>.a<r, C6331n> aVar = this.sizeAnimation;
                Intrinsics.g(aVar);
                z1<r> z1VarA = aVar.a(new C0968b(this, jC), new c(this, jC));
                this.scope.i(z1VarA);
                packedValue = z1VarA.getValue().getPackedValue();
                this.lastSize = z1VarA.getValue().getPackedValue();
            }
            return K.G0(k10, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), null, new a(this, f0VarK0, packedValue), 4, null);
        }

        @Override // androidx.compose.ui.Modifier.c
        public void v2() {
            super.v2();
            this.lastSize = androidx.compose.animation.a.f47756a;
        }
    }

    @Override // c0.k0.b
    public S a() {
        return this.transition.m().a();
    }

    @Override // c0.k0.b
    public S b() {
        return this.transition.m().b();
    }

    /* renamed from: g, reason: from getter */
    public P0.e getContentAlignment() {
        return this.contentAlignment;
    }

    public final W<S, z1<r>> h() {
        return this.targetSizeMap;
    }

    public final void i(z1<r> z1Var) {
        this.animatedSize = z1Var;
    }

    public void j(P0.e eVar) {
        this.contentAlignment = eVar;
    }

    public final void k(t tVar) {
        this.layoutDirection = tVar;
    }

    public final void l(long j10) {
        this.measuredSize.setValue(r.b(j10));
    }

    public AnimatedContentTransitionScopeImpl(k0<S> k0Var, P0.e eVar, t tVar) {
        this.transition = k0Var;
        this.contentAlignment = eVar;
        this.layoutDirection = tVar;
    }

    private static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    public final Modifier d(C6169i c6169i, Composer composer, int i10) {
        Modifier modifier;
        Object objB;
        if (ComposerKt.M()) {
            ComposerKt.U(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean zV = composer.V(this);
        Object objB2 = composer.B();
        k0.a aVarE = null;
        if (zV || objB2 == Composer.INSTANCE.a()) {
            objB2 = t1.e(Boolean.FALSE, null, 2, null);
            composer.t(objB2);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
        z1 z1VarP = o1.p(c6169i.getSizeTransform(), composer, 0);
        if (Intrinsics.e(this.transition.h(), this.transition.o())) {
            f(interfaceC5730l0, false);
        } else if (z1VarP.getValue() != null) {
            f(interfaceC5730l0, true);
        }
        if (e(interfaceC5730l0)) {
            composer.startReplaceGroup(249676467);
            aVarE = l0.e(this.transition, q0.e(r.INSTANCE), null, composer, 0, 2);
            boolean zV2 = composer.V(aVarE);
            Object objB3 = composer.B();
            if (zV2 || objB3 == Composer.INSTANCE.a()) {
                u uVar = (u) z1VarP.getValue();
                if (uVar != null && !uVar.getClip()) {
                    objB = Modifier.INSTANCE;
                } else {
                    objB = T0.e.b(Modifier.INSTANCE);
                }
                objB3 = objB;
                composer.t(objB3);
            }
            modifier = (Modifier) objB3;
            composer.P();
        } else {
            composer.startReplaceGroup(249942509);
            composer.P();
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(new SizeModifierElement(aVarE, z1VarP, this));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return modifierThen;
    }
}
