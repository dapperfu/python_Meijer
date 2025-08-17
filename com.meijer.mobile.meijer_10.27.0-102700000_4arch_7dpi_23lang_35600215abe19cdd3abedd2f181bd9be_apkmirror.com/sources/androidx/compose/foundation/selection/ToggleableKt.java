package androidx.compose.foundation.selection;

import androidx.compose.foundation.j;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.semantics.Role;
import com.fullstory.compose.FullStoryAnnotationsKt;
import d0.InterfaceC13428B;
import d0.InterfaceC13458z;
import h0.k;
import h0.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a@\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aT\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "", "onValueChange", "b", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lh0/l;", "interactionSource", "Ld0/z;", "indication", "a", "(Landroidx/compose/ui/Modifier;ZLh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lt1/a;", "state", "Lkotlin/Function0;", "onClick", "triStateToggleable-XHw0xAI", "(Landroidx/compose/ui/Modifier;Lt1/a;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "triStateToggleable", "triStateToggleable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Lt1/a;Lh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ToggleableKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f48934f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48935g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48936h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f48937i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
            super(3);
            this.f48934f = z10;
            this.f48935g = z11;
            this.f48936h = role;
            this.f48937i = function1;
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
            InterfaceC13458z interfaceC13458z = (InterfaceC13458z) composer.o(j.a());
            if (interfaceC13458z instanceof InterfaceC13428B) {
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
            Modifier modifierA = ToggleableKt.a(Modifier.INSTANCE, this.f48934f, lVar, interfaceC13458z, this.f48935g, this.f48936h, this.f48937i);
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
        final /* synthetic */ InterfaceC13458z f48938f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48939g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f48940h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48941i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f48942j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13458z interfaceC13458z, boolean z10, boolean z11, Role role, Function1 function1) {
            super(3);
            this.f48938f = interfaceC13458z;
            this.f48939g = z10;
            this.f48940h = z11;
            this.f48941i = role;
            this.f48942j = function1;
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
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48938f).then(new ToggleableElement(this.f48939g, lVar, null, this.f48940h, this.f48941i, this.f48942j, null));
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
        final /* synthetic */ boolean f48943f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48944g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48945h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f48946i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, Role role, Function1 function1) {
            super(1);
            this.f48943f = z10;
            this.f48944g = z11;
            this.f48945h = role;
            this.f48946i = function1;
        }

        public final void a(N0 n02) {
            n02.b("toggleable");
            n02.getProperties().c("value", Boolean.valueOf(this.f48943f));
            n02.getProperties().c("enabled", Boolean.valueOf(this.f48944g));
            n02.getProperties().c("role", this.f48945h);
            n02.getProperties().c("onValueChange", this.f48946i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17055a f48947f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48948g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48949h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48950i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EnumC17055a enumC17055a, boolean z10, Role role, Function0<Unit> function0) {
            super(3);
            this.f48947f = enumC17055a;
            this.f48948g = z10;
            this.f48949h = role;
            this.f48950i = function0;
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
            InterfaceC13458z interfaceC13458z = (InterfaceC13458z) composer.o(j.a());
            if (interfaceC13458z instanceof InterfaceC13428B) {
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
            Modifier modifierM6triStateToggleableO2vRcR0 = ToggleableKt.m6triStateToggleableO2vRcR0(Modifier.INSTANCE, this.f48947f, lVar, interfaceC13458z, this.f48948g, this.f48949h, this.f48950i);
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
        final /* synthetic */ InterfaceC13458z f48951f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC17055a f48952g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f48953h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48954i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48955j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13458z interfaceC13458z, EnumC17055a enumC17055a, boolean z10, Role role, Function0 function0) {
            super(3);
            this.f48951f = interfaceC13458z;
            this.f48952g = enumC17055a;
            this.f48953h = z10;
            this.f48954i = role;
            this.f48955j = function0;
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
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48951f).then(new TriStateToggleableElement(this.f48952g, lVar, null, this.f48953h, this.f48954i, this.f48955j, null));
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
        final /* synthetic */ EnumC17055a f48956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48957g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48958h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f48959i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC17055a enumC17055a, boolean z10, Role role, Function0 function0) {
            super(1);
            this.f48956f = enumC17055a;
            this.f48957g = z10;
            this.f48958h = role;
            this.f48959i = function0;
        }

        public final void a(N0 n02) {
            n02.b("triStateToggleable");
            n02.getProperties().c("state", this.f48956f);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f48957g));
            n02.getProperties().c("role", this.f48958h);
            n02.getProperties().c("onClick", this.f48959i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    public static final Modifier a(Modifier modifier, boolean z10, l lVar, InterfaceC13458z interfaceC13458z, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
        return modifier.then(interfaceC13458z instanceof InterfaceC13428B ? new ToggleableElement(z10, lVar, (InterfaceC13428B) interfaceC13458z, z11, role, function1, null) : interfaceC13458z == null ? new ToggleableElement(z10, lVar, null, z11, role, function1, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13458z).then(new ToggleableElement(z10, lVar, null, z11, role, function1, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new b(interfaceC13458z, z10, z11, role, function1), 1, null));
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
    public static final Modifier m6triStateToggleableO2vRcR0(Modifier modifier, EnumC17055a enumC17055a, l lVar, InterfaceC13458z interfaceC13458z, boolean z10, Role role, Function0<Unit> function0) {
        Modifier modifier__triStateToggleable7_Modifier = FullStoryAnnotationsKt.__triStateToggleable7_Modifier(modifier, enumC17055a, lVar, interfaceC13458z, z10, role, function0);
        Function0<Unit> function0__triStateToggleable7_onClick = FullStoryAnnotationsKt.__triStateToggleable7_onClick(modifier__triStateToggleable7_Modifier, enumC17055a, lVar, interfaceC13458z, z10, role, function0);
        return modifier__triStateToggleable7_Modifier.then(interfaceC13458z instanceof InterfaceC13428B ? new TriStateToggleableElement(enumC17055a, lVar, (InterfaceC13428B) interfaceC13458z, z10, role, function0__triStateToggleable7_onClick, null) : interfaceC13458z == null ? new TriStateToggleableElement(enumC17055a, lVar, null, z10, role, function0__triStateToggleable7_onClick, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13458z).then(new TriStateToggleableElement(enumC17055a, lVar, null, z10, role, function0__triStateToggleable7_onClick, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new e(interfaceC13458z, enumC17055a, z10, role, function0__triStateToggleable7_onClick), 1, null));
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
    public static final Modifier m7triStateToggleableXHw0xAI(Modifier modifier, EnumC17055a enumC17055a, boolean z10, Role role, Function0<Unit> function0) {
        Function1 function1A;
        Modifier modifier__triStateToggleable5_Modifier = FullStoryAnnotationsKt.__triStateToggleable5_Modifier(modifier, enumC17055a, z10, role, function0);
        Function0<Unit> function0__triStateToggleable5_onClick = FullStoryAnnotationsKt.__triStateToggleable5_onClick(modifier__triStateToggleable5_Modifier, enumC17055a, z10, role, function0);
        if (L0.b()) {
            function1A = new f(enumC17055a, z10, role, function0__triStateToggleable5_onClick);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier__triStateToggleable5_Modifier, function1A, new d(enumC17055a, z10, role, function0__triStateToggleable5_onClick));
    }
}
