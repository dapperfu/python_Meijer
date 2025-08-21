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
/* renamed from: androidx.compose.foundation.text.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5819i {

    /* renamed from: a, reason: collision with root package name */
    public static final C5819i f49773a = new C5819i();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49774b = ComposableLambdaKt.composableLambdaInstance(-813639903, false, a.f49775f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "a", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.i$a */
    static final class a extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49775f = new a();

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
                ComposerKt.U(-813639903, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
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
        return f49774b;
    }
}
