package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import d0.InterfaceC13560A;
import d0.InterfaceC13561B;
import d0.InterfaceC13591z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lh0/j;", "interactionSource", "Ld0/z;", "indication", "b", "(Landroidx/compose/ui/Modifier;Lh0/j;Ld0/z;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/F0;", "a", "Landroidx/compose/runtime/F0;", "()Landroidx/compose/runtime/F0;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<InterfaceC13591z> f48602a = r.f(a.f48603f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld0/z;", "c", "()Ld0/z;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<InterfaceC13591z> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48603f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13591z invoke() {
            return f.f48317a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.j f48604f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f48605g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0.j jVar, InterfaceC13591z interfaceC13591z) {
            super(1);
            this.f48604f = jVar;
            this.f48605g = interfaceC13591z;
        }

        public final void a(N0 n02) {
            n02.b("indication");
            n02.getProperties().c("interactionSource", this.f48604f);
            n02.getProperties().c("indication", this.f48605g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f48606f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.j f48607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC13591z interfaceC13591z, h0.j jVar) {
            super(3);
            this.f48606f = interfaceC13591z;
            this.f48607g = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-353972293);
            if (ComposerKt.M()) {
                ComposerKt.U(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
            }
            InterfaceC13560A interfaceC13560AB = this.f48606f.b(this.f48607g, composer, 0);
            boolean zV = composer.V(interfaceC13560AB);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new k(interfaceC13560AB);
                composer.t(objB);
            }
            k kVar = (k) objB;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return kVar;
        }
    }

    public static final F0<InterfaceC13591z> a() {
        return f48602a;
    }

    public static final Modifier b(Modifier modifier, h0.j jVar, InterfaceC13591z interfaceC13591z) {
        if (interfaceC13591z == null) {
            return modifier;
        }
        if (interfaceC13591z instanceof InterfaceC13561B) {
            return modifier.then(new IndicationModifierElement(jVar, (InterfaceC13561B) interfaceC13591z));
        }
        return androidx.compose.ui.b.b(modifier, L0.b() ? new b(jVar, interfaceC13591z) : L0.a(), new c(interfaceC13591z, jVar));
    }
}
