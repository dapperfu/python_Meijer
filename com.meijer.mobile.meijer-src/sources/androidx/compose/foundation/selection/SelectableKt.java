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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "selectable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "selectable", "Lh0/l;", "interactionSource", "Ld0/z;", "indication", "selectable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SelectableKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f49139f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49140g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49141h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f49142i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, Role role, Function0<Unit> function0) {
            super(3);
            this.f49139f = z10;
            this.f49140g = z11;
            this.f49141h = role;
            this.f49142i = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            l lVar;
            composer.startReplaceGroup(-2124609672);
            if (ComposerKt.M()) {
                ComposerKt.U(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
            }
            InterfaceC13591z interfaceC13591z = (InterfaceC13591z) composer.o(j.a());
            if (interfaceC13591z instanceof InterfaceC13561B) {
                composer.startReplaceGroup(-1412174474);
                composer.P();
                lVar = null;
            } else {
                composer.startReplaceGroup(-1412041856);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = k.a();
                    composer.t(objB);
                }
                lVar = (l) objB;
                composer.P();
            }
            Modifier modifierM4selectableO2vRcR0 = SelectableKt.m4selectableO2vRcR0(Modifier.INSTANCE, this.f49139f, lVar, interfaceC13591z, this.f49140g, this.f49141h, this.f49142i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierM4selectableO2vRcR0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f49143f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49144g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49145h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f49146i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f49147j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13591z interfaceC13591z, boolean z10, boolean z11, Role role, Function0 function0) {
            super(3);
            this.f49143f = interfaceC13591z;
            this.f49144g = z10;
            this.f49145h = z11;
            this.f49146i = role;
            this.f49147j = function0;
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
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f49143f).then(new SelectableElement(this.f49144g, lVar, null, this.f49145h, this.f49146i, this.f49147j, null));
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
        final /* synthetic */ boolean f49148f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49149g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f49150h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f49151i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, Role role, Function0 function0) {
            super(1);
            this.f49148f = z10;
            this.f49149g = z11;
            this.f49150h = role;
            this.f49151i = function0;
        }

        public final void a(N0 n02) {
            n02.b("selectable");
            n02.getProperties().c("selected", Boolean.valueOf(this.f49148f));
            n02.getProperties().c("enabled", Boolean.valueOf(this.f49149g));
            n02.getProperties().c("role", this.f49150h);
            n02.getProperties().c("onClick", this.f49151i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    public static /* synthetic */ Modifier a(Modifier modifier, boolean z10, l lVar, InterfaceC13591z interfaceC13591z, boolean z11, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m4selectableO2vRcR0(modifier, z10, lVar, interfaceC13591z, z12, role, function0);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, boolean z10, boolean z11, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m5selectableXHw0xAI(modifier, z10, z11, role, function0);
    }

    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m4selectableO2vRcR0(Modifier modifier, boolean z10, l lVar, InterfaceC13591z interfaceC13591z, boolean z11, Role role, Function0<Unit> function0) {
        Modifier modifier__selectable7_Modifier = FullStoryAnnotationsKt.__selectable7_Modifier(modifier, z10, lVar, interfaceC13591z, z11, role, function0);
        Function0<Unit> function0__selectable7_onClick = FullStoryAnnotationsKt.__selectable7_onClick(modifier__selectable7_Modifier, z10, lVar, interfaceC13591z, z11, role, function0);
        return modifier__selectable7_Modifier.then(interfaceC13591z instanceof InterfaceC13561B ? new SelectableElement(z10, lVar, (InterfaceC13561B) interfaceC13591z, z11, role, function0__selectable7_onClick, null) : interfaceC13591z == null ? new SelectableElement(z10, lVar, null, z11, role, function0__selectable7_onClick, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new SelectableElement(z10, lVar, null, z11, role, function0__selectable7_onClick, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new b(interfaceC13591z, z10, z11, role, function0__selectable7_onClick), 1, null));
    }

    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m5selectableXHw0xAI(Modifier modifier, boolean z10, boolean z11, Role role, Function0<Unit> function0) {
        Function1 function1A;
        Modifier modifier__selectable5_Modifier = FullStoryAnnotationsKt.__selectable5_Modifier(modifier, z10, z11, role, function0);
        Function0<Unit> function0__selectable5_onClick = FullStoryAnnotationsKt.__selectable5_onClick(modifier__selectable5_Modifier, z10, z11, role, function0);
        if (L0.b()) {
            function1A = new c(z10, z11, role, function0__selectable5_onClick);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier__selectable5_Modifier, function1A, new a(z10, z11, role, function0__selectable5_onClick));
    }
}
