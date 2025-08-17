package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.z1;
import kotlin.C6301N;
import kotlin.C6301N.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Lc0/N;", "c", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lc0/N;", "T", "Lc0/q;", "V", "initialValue", "targetValue", "Lc0/o0;", "typeConverter", "Lc0/M;", "animationSpec", "Landroidx/compose/runtime/z1;", "b", "(Lc0/N;Ljava/lang/Object;Ljava/lang/Object;Lc0/o0;Lc0/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "", "a", "(Lc0/N;FFLc0/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6302O {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c0.O$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f60941f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6301N.a<T, V> f60942g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f60943h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C6300M<T> f60944i;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t10, C6301N.a<T, V> aVar, T t11, C6300M<T> c6300m) {
            super(0);
            this.f60941f = t10;
            this.f60942g = aVar;
            this.f60943h = t11;
            this.f60944i = c6300m;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (Intrinsics.e(this.f60941f, this.f60942g.f()) && Intrinsics.e(this.f60943h, this.f60942g.k())) {
                return;
            }
            this.f60942g.w(this.f60941f, this.f60943h, this.f60944i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: c0.O$b */
    static final class b extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6301N f60945f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6301N.a<T, V> f60946g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/O$b$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: c0.O$b$a */
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6301N f60947a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6301N.a f60948b;

            public a(C6301N c6301n, C6301N.a aVar) {
                this.f60947a = c6301n;
                this.f60948b = aVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f60947a.j(this.f60948b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6301N c6301n, C6301N.a<T, V> aVar) {
            super(1);
            this.f60945f = c6301n;
            this.f60946g = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            this.f60945f.f(this.f60946g);
            return new a(this.f60945f, this.f60946g);
        }
    }

    public static final z1<Float> a(C6301N c6301n, float f10, float f11, C6300M<Float> c6300m, String str, Composer composer, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (ComposerKt.M()) {
            ComposerKt.U(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i12 = i10 << 3;
        z1<Float> z1VarB = b(c6301n, Float.valueOf(f10), Float.valueOf(f11), q0.i(FloatCompanionObject.f142822a), c6300m, str2, composer, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarB;
    }

    public static final <T, V extends AbstractC6334q> z1<T> b(C6301N c6301n, T t10, T t11, o0<T, V> o0Var, C6300M<T> c6300m, String str, Composer composer, int i10, int i11) {
        C6301N c6301n2;
        Object obj;
        Object obj2;
        C6300M<T> c6300m2;
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (ComposerKt.M()) {
            ComposerKt.U(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            c6301n2 = c6301n;
            obj = t10;
            obj2 = t11;
            c6300m2 = c6300m;
            C6301N.a aVar = c6301n2.new a(obj, obj2, o0Var, c6300m2, str2);
            composer.t(aVar);
            objB = aVar;
        } else {
            c6301n2 = c6301n;
            obj = t10;
            obj2 = t11;
            c6300m2 = c6300m;
        }
        C6301N.a aVar2 = (C6301N.a) objB;
        boolean z10 = true;
        boolean z11 = ((((i10 & 112) ^ 48) > 32 && composer.D(obj)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.D(obj2)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !composer.D(c6300m2)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objB2 = composer.B();
        if (z12 || objB2 == companion.a()) {
            objB2 = new a(obj, aVar2, obj2, c6300m2);
            composer.t(objB2);
        }
        J.i((Function0) objB2, composer, 0);
        boolean zD = composer.D(c6301n2);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            objB3 = new b(c6301n2, aVar2);
            composer.t(objB3);
        }
        J.c(aVar2, (Function1) objB3, composer, 6);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return aVar2;
    }

    public static final C6301N c(String str, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new C6301N(str);
            composer.t(objB);
        }
        C6301N c6301n = (C6301N) objB;
        c6301n.k(composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c6301n;
    }
}
