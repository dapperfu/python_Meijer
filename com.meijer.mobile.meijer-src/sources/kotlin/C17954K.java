package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17954K {

    /* renamed from: a, reason: collision with root package name */
    public static final C17954K f168183a = new C17954K();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f168184b = ComposableLambdaKt.composableLambdaInstance(182187156, false, a.f168186f);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f168185c = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, b.f168187f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.K$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168186f = new a();

        a() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(182187156, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:143)");
            }
            C1.f167869a.a(null, 0.0f, 0L, composer, 3072, 7);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.K$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f168187f = new b();

        b() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1480449365, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:234)");
            }
            C1.f167869a.a(null, 0.0f, 0L, composer, 3072, 7);
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

    public final Function2<Composer, Integer, Unit> a() {
        return f168184b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f168185c;
    }
}
