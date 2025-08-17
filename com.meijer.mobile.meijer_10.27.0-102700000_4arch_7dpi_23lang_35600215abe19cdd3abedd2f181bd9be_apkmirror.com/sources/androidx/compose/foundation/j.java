package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import d0.InterfaceC13427A;
import d0.InterfaceC13428B;
import d0.InterfaceC13458z;
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
    private static final F0<InterfaceC13458z> f48378a = r.f(a.f48379f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld0/z;", "c", "()Ld0/z;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<InterfaceC13458z> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48379f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13458z invoke() {
            return f.f48093a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.j f48380f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13458z f48381g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0.j jVar, InterfaceC13458z interfaceC13458z) {
            super(1);
            this.f48380f = jVar;
            this.f48381g = interfaceC13458z;
        }

        public final void a(N0 n02) {
            n02.b("indication");
            n02.getProperties().c("interactionSource", this.f48380f);
            n02.getProperties().c("indication", this.f48381g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13458z f48382f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.j f48383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC13458z interfaceC13458z, h0.j jVar) {
            super(3);
            this.f48382f = interfaceC13458z;
            this.f48383g = jVar;
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
            InterfaceC13427A interfaceC13427AB = this.f48382f.b(this.f48383g, composer, 0);
            boolean zV = composer.V(interfaceC13427AB);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new k(interfaceC13427AB);
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

    public static final F0<InterfaceC13458z> a() {
        return f48378a;
    }

    public static final Modifier b(Modifier modifier, h0.j jVar, InterfaceC13458z interfaceC13458z) {
        if (interfaceC13458z == null) {
            return modifier;
        }
        if (interfaceC13458z instanceof InterfaceC13428B) {
            return modifier.then(new IndicationModifierElement(jVar, (InterfaceC13428B) interfaceC13458z));
        }
        return androidx.compose.ui.b.b(modifier, L0.b() ? new b(jVar, interfaceC13458z) : L0.a(), new c(interfaceC13458z, jVar));
    }
}
