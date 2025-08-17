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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "selectable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "selectable", "Lh0/l;", "interactionSource", "Ld0/z;", "indication", "selectable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLh0/l;Ld0/z;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SelectableKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f48915f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48916g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48917h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48918i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, Role role, Function0<Unit> function0) {
            super(3);
            this.f48915f = z10;
            this.f48916g = z11;
            this.f48917h = role;
            this.f48918i = function0;
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
            InterfaceC13458z interfaceC13458z = (InterfaceC13458z) composer.o(j.a());
            if (interfaceC13458z instanceof InterfaceC13428B) {
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
            Modifier modifierM4selectableO2vRcR0 = SelectableKt.m4selectableO2vRcR0(Modifier.INSTANCE, this.f48915f, lVar, interfaceC13458z, this.f48916g, this.f48917h, this.f48918i);
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
        final /* synthetic */ InterfaceC13458z f48919f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48920g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f48921h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48922i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48923j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13458z interfaceC13458z, boolean z10, boolean z11, Role role, Function0 function0) {
            super(3);
            this.f48919f = interfaceC13458z;
            this.f48920g = z10;
            this.f48921h = z11;
            this.f48922i = role;
            this.f48923j = function0;
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
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48919f).then(new SelectableElement(this.f48920g, lVar, null, this.f48921h, this.f48922i, this.f48923j, null));
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
        final /* synthetic */ boolean f48924f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48925g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48926h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f48927i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, Role role, Function0 function0) {
            super(1);
            this.f48924f = z10;
            this.f48925g = z11;
            this.f48926h = role;
            this.f48927i = function0;
        }

        public final void a(N0 n02) {
            n02.b("selectable");
            n02.getProperties().c("selected", Boolean.valueOf(this.f48924f));
            n02.getProperties().c("enabled", Boolean.valueOf(this.f48925g));
            n02.getProperties().c("role", this.f48926h);
            n02.getProperties().c("onClick", this.f48927i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    public static /* synthetic */ Modifier a(Modifier modifier, boolean z10, l lVar, InterfaceC13458z interfaceC13458z, boolean z11, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m4selectableO2vRcR0(modifier, z10, lVar, interfaceC13458z, z12, role, function0);
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
    public static final Modifier m4selectableO2vRcR0(Modifier modifier, boolean z10, l lVar, InterfaceC13458z interfaceC13458z, boolean z11, Role role, Function0<Unit> function0) {
        Modifier modifier__selectable7_Modifier = FullStoryAnnotationsKt.__selectable7_Modifier(modifier, z10, lVar, interfaceC13458z, z11, role, function0);
        Function0<Unit> function0__selectable7_onClick = FullStoryAnnotationsKt.__selectable7_onClick(modifier__selectable7_Modifier, z10, lVar, interfaceC13458z, z11, role, function0);
        return modifier__selectable7_Modifier.then(interfaceC13458z instanceof InterfaceC13428B ? new SelectableElement(z10, lVar, (InterfaceC13428B) interfaceC13458z, z11, role, function0__selectable7_onClick, null) : interfaceC13458z == null ? new SelectableElement(z10, lVar, null, z11, role, function0__selectable7_onClick, null) : lVar != null ? j.b(Modifier.INSTANCE, lVar, interfaceC13458z).then(new SelectableElement(z10, lVar, null, z11, role, function0__selectable7_onClick, null)) : androidx.compose.ui.b.c(Modifier.INSTANCE, null, new b(interfaceC13458z, z10, z11, role, function0__selectable7_onClick), 1, null));
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
