package androidx.compose.foundation.selection;

import androidx.compose.foundation.j;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.semantics.Role;
import com.fullstory.compose.FullStoryAnnotationsKt;
import d0.InterfaceC13561B;
import d0.InterfaceC13591z;
import h0.k;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import t1.EnumC17174a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a@\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aT\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "", "onValueChange", "b", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lh0/l;", "interactionSource", "Ld0/z;", "indication", "a", "(Landroidx/compose/ui/Modifier;ZLh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lt1/a;", "state", "Lkotlin/Function0;", "onClick", "triStateToggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;Lt1/a;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "triStateToggleable", "triStateToggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Lt1/a;Lh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ToggleableKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f49158f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49159g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49160h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f49161i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
            super(3);
            this.f49158f = z10;
            this.f49159g = z11;
            this.f49160h = role;
            this.f49161i = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            l lVar;
            composer.startReplaceGroup(290332169);
            if (ComposerKt.M()) {
                ComposerKt.U(290332169, i10, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
            }
            InterfaceC13591z interfaceC13591z = (InterfaceC13591z) composer.o(j.a());
            if (interfaceC13591z instanceof InterfaceC13561B) {
                composer.startReplaceGroup(-2130062114);
                composer.P();
                lVar = null;
            } else {
                composer.startReplaceGroup(-2129929496);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = k.a();
                    composer.t(objB);
                }
                lVar = (l) objB;
                composer.P();
            }
            Modifier modifierA = ToggleableKt.a(Modifier.INSTANCE, this.f49158f, lVar, interfaceC13591z, this.f49159g, this.f49160h, this.f49161i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierA;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f49162f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49163g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49164h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f49165i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f49166j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13591z interfaceC13591z, boolean z10, boolean z11, Role role, Function1 function1) {
            super(3);
            this.f49162f = interfaceC13591z;
            this.f49163g = z10;
            this.f49164h = z11;
            this.f49165i = role;
            this.f49166j = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-1525724089);
            if (ComposerKt.M()) {
                ComposerKt.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
            }
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = k.a();
                composer.t(objB);
            }
            l lVar = (l) objB;
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f49162f).then(new ToggleableElement(this.f49163g, lVar, null, this.f49164h, this.f49165i, this.f49166j, null));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierThen;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f49167f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49168g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49169h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f49170i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, Role role, Function1 function1) {
            super(1);
            this.f49167f = z10;
            this.f49168g = z11;
            this.f49169h = role;
            this.f49170i = function1;
        }

        public final void a(N0 n02) {
            n02.b("toggleable");
            n02.getProperties().c("value", Boolean.valueOf(this.f49167f));
            n02.getProperties().c("enabled", Boolean.valueOf(this.f49168g));
            n02.getProperties().c("role", this.f49169h);
            n02.getProperties().c("onValueChange", this.f49170i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17174a f49171f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49172g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49173h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f49174i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EnumC17174a enumC17174a, boolean z10, Role role, Function0<Unit> function0) {
            super(3);
            this.f49171f = enumC17174a;
            this.f49172g = z10;
            this.f49173h = role;
            this.f49174i = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            l lVar;
            composer.startReplaceGroup(-1808118329);
            if (ComposerKt.M()) {
                ComposerKt.U(-1808118329, i10, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:308)");
            }
            InterfaceC13591z interfaceC13591z = (InterfaceC13591z) composer.o(j.a());
            if (interfaceC13591z instanceof InterfaceC13561B) {
                composer.startReplaceGroup(-1060119816);
                composer.P();
                lVar = null;
            } else {
                composer.startReplaceGroup(-1059987198);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = k.a();
                    composer.t(objB);
                }
                lVar = (l) objB;
                composer.P();
            }
            Modifier modifierM6triStateToggleableO2vRcR0 = ToggleableKt.m6triStateToggleableO2vRcR0(Modifier.INSTANCE, this.f49171f, lVar, interfaceC13591z, this.f49172g, this.f49173h, this.f49174i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierM6triStateToggleableO2vRcR0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f49175f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC17174a f49176g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49177h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f49178i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f49179j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13591z interfaceC13591z, EnumC17174a enumC17174a, boolean z10, Role role, Function0 function0) {
            super(3);
            this.f49175f = interfaceC13591z;
            this.f49176g = enumC17174a;
            this.f49177h = z10;
            this.f49178i = role;
            this.f49179j = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-1525724089);
            if (ComposerKt.M()) {
                ComposerKt.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
            }
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = k.a();
                composer.t(objB);
            }
            l lVar = (l) objB;
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f49175f).then(new TriStateToggleableElement(this.f49176g, lVar, null, this.f49177h, this.f49178i, this.f49179j, null));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierThen;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17174a f49180f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49181g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49182h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f49183i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC17174a enumC17174a, boolean z10, Role role, Function0 function0) {
            super(1);
            this.f49180f = enumC17174a;
            this.f49181g = z10;
            this.f49182h = role;
            this.f49183i = function0;
        }

        public final void a(N0 n02) {
            n02.b("triStateToggleable");
            n02.getProperties().c("state", this.f49180f);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f49181g));
            n02.getProperties().c("role", this.f49182h);
            n02.getProperties().c("onClick", this.f49183i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    public static final Modifier a(Modifier modifier, boolean z10, l lVar, InterfaceC13591z interfaceC13591z, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
        return modifier.then(interfaceC13591z instanceof InterfaceC13561B ? new ToggleableElement(z10, lVar, (InterfaceC13561B) interfaceC13591z, z11, role, function1, null) : interfaceC13591z == null ? new ToggleableElement(z10, lVar, null, z11, role, function1, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new ToggleableElement(z10, lVar, null, z11, role, function1, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new b(interfaceC13591z, z10, z11, role, function1), 1, null));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, boolean z10, boolean z11, Role role, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return b(modifier, z10, z11, role, function1);
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m6triStateToggleableO2vRcR0(Modifier modifier, EnumC17174a enumC17174a, l lVar, InterfaceC13591z interfaceC13591z, boolean z10, Role role, Function0<Unit> function0) {
        Modifier modifier__triStateToggleable7_Modifier = FullStoryAnnotationsKt.__triStateToggleable7_Modifier(modifier, enumC17174a, lVar, interfaceC13591z, z10, role, function0);
        Function0<Unit> function0__triStateToggleable7_onClick = FullStoryAnnotationsKt.__triStateToggleable7_onClick(modifier__triStateToggleable7_Modifier, enumC17174a, lVar, interfaceC13591z, z10, role, function0);
        return modifier__triStateToggleable7_Modifier.then(interfaceC13591z instanceof InterfaceC13561B ? new TriStateToggleableElement(enumC17174a, lVar, (InterfaceC13561B) interfaceC13591z, z10, role, function0__triStateToggleable7_onClick, null) : interfaceC13591z == null ? new TriStateToggleableElement(enumC17174a, lVar, null, z10, role, function0__triStateToggleable7_onClick, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new TriStateToggleableElement(enumC17174a, lVar, null, z10, role, function0__triStateToggleable7_onClick, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new e(interfaceC13591z, enumC17174a, z10, role, function0__triStateToggleable7_onClick), 1, null));
    }

    public static final Modifier b(Modifier modifier, boolean z10, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new c(z10, z11, role, function1);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new a(z10, z11, role, function1));
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m7triStateToggleableXHw0xAI(Modifier modifier, EnumC17174a enumC17174a, boolean z10, Role role, Function0<Unit> function0) {
        Function1 function1A;
        Modifier modifier__triStateToggleable5_Modifier = FullStoryAnnotationsKt.__triStateToggleable5_Modifier(modifier, enumC17174a, z10, role, function0);
        Function0<Unit> function0__triStateToggleable5_onClick = FullStoryAnnotationsKt.__triStateToggleable5_onClick(modifier__triStateToggleable5_Modifier, enumC17174a, z10, role, function0);
        if (L0.b()) {
            function1A = new f(enumC17174a, z10, role, function0__triStateToggleable5_onClick);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier__triStateToggleable5_Modifier, function1A, new d(enumC17174a, z10, role, function0__triStateToggleable5_onClick));
    }
}
