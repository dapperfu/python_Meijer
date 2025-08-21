package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5818h {

    /* renamed from: a, reason: collision with root package name */
    public static final C5818h f49757a = new C5818h();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49758b = ComposableLambdaKt.composableLambdaInstance(997835932, false, a.f49762f);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49759c = ComposableLambdaKt.composableLambdaInstance(2105616367, false, b.f49763f);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49760d = ComposableLambdaKt.composableLambdaInstance(434140383, false, c.f49764f);

    /* renamed from: e, reason: collision with root package name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49761e = ComposableLambdaKt.composableLambdaInstance(-34833998, false, d.f49765f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.h$a */
    static final class a extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49762f = new a();

        a() {
            super(3);
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.D(function2) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(997835932, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:708)");
            }
            function2.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.h$b */
    static final class b extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f49763f = new b();

        b() {
            super(3);
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.D(function2) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2105616367, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:865)");
            }
            function2.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.h$c */
    static final class c extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f49764f = new c();

        c() {
            super(3);
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.D(function2) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(434140383, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:909)");
            }
            function2.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.h$d */
    static final class d extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f49765f = new d();

        d() {
            super(3);
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.D(function2) ? 4 : 2;
            }
            if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-34833998, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-4.<anonymous> (BasicTextField.kt:949)");
            }
            function2.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> a() {
        return f49758b;
    }

    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> b() {
        return f49759c;
    }
}
