package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C5892t0;
import kotlin.C6288A;
import kotlin.C6327j;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lf0/b;", "", "<init>", "()V", "T", "Lf0/c;", "state", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lc0/i;", "animationSpec", "Lf0/N;", "a", "(Lf0/c;Lkotlin/jvm/functions/Function1;Lc0/i;Landroidx/compose/runtime/Composer;II)Lf0/N;", "b", "Lc0/i;", "d", "()Lc0/i;", "SnapAnimationSpec", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "PositionalThreshold", "Lc0/y;", "Lc0/y;", "()Lc0/y;", "DecayAnimationSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13803b {

    /* renamed from: a, reason: collision with root package name */
    public static final C13803b f130302a = new C13803b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC6326i<Float> SnapAnimationSpec = C6327j.l(0, 0, null, 7, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Function1<Float, Float> PositionalThreshold = a.f130307f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC6342y<Float> DecayAnimationSpec = C6288A.c(0.0f, 0.0f, 3, null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f130306e = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "distance", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.b$a */
    static final class a extends Lambda implements Function1<Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f130307f = new a();

        a() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(f10 / 2.0f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    public final <T> InterfaceC13796N a(C13804c<T> c13804c, Function1<? super Float, Float> function1, InterfaceC6326i<Float> interfaceC6326i, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = PositionalThreshold;
        }
        if ((i11 & 4) != 0) {
            interfaceC6326i = SnapAnimationSpec;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-952742024, i10, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1520)");
        }
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(c13804c)) || (i10 & 6) == 4) | composer.V(dVar) | ((((i10 & 112) ^ 48) > 32 && composer.V(function1)) || (i10 & 48) == 32) | composer.V(interfaceC6326i);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = androidx.compose.foundation.gestures.a.n(c13804c, dVar, function1, interfaceC6326i);
            composer.t(objB);
        }
        InterfaceC13796N interfaceC13796N = (InterfaceC13796N) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC13796N;
    }

    public final InterfaceC6342y<Float> b() {
        return DecayAnimationSpec;
    }

    public final Function1<Float, Float> c() {
        return PositionalThreshold;
    }

    public final InterfaceC6326i<Float> d() {
        return SnapAnimationSpec;
    }

    private C13803b() {
    }
}
