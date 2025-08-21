package li;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f149691a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> f149692b = ComposableLambdaKt.composableLambdaInstance(159315653, false, a.f149693a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f149693a = new a();

        public final void a(InterfaceC14888I interfaceC14888I, int i10, Composer composer, int i11) {
            Intrinsics.j(interfaceC14888I, "<this>");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(159315653, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.ComposableSingletons$AccordionItemKt.lambda$159315653.<anonymous> (AccordionItem.kt:116)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Integer num, Composer composer, Integer num2) {
            a(interfaceC14888I, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    public final Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> a() {
        return f149692b;
    }
}
