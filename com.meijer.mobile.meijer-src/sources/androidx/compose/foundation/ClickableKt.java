package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.semantics.Role;
import com.fullstory.compose.FullStoryAnnotationsKt;
import d0.InterfaceC13561B;
import d0.InterfaceC13591z;
import e1.C13749a;
import e1.C13751c;
import e1.C13752d;
import kotlin.C13898F;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aD\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001av\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0092\u0001\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008a\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u0001*\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0018\u0010$\u001a\u00020\u0001*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0018\u0010&\u001a\u00020\u0001*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0018\u0010(\u001a\u00020\u0001*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "clickable", "Lh0/l;", "interactionSource", "Ld0/z;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Lh0/l;Ld0/z;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-cJG_KMw", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "combinedClickable", "hapticFeedbackEnabled", "e", "(Landroidx/compose/ui/Modifier;Lh0/l;Ld0/z;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "combinedClickable-XVZzFYc", "(Landroidx/compose/ui/Modifier;Lh0/l;Ld0/z;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/B0;", "g", "(Landroidx/compose/ui/node/B0;)Z", "Le1/b;", "j", "(Landroid/view/KeyEvent;)Z", "isPress", "h", "isClick", "i", "isEnter", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClickableKt {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f48140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f48141g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48142h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48143i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, Role role, Function0<Unit> function0) {
            super(3);
            this.f48140f = z10;
            this.f48141g = str;
            this.f48142h = role;
            this.f48143i = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            h0.l lVar;
            composer.startReplaceGroup(-756081143);
            if (ComposerKt.M()) {
                ComposerKt.U(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
            }
            InterfaceC13591z interfaceC13591z = (InterfaceC13591z) composer.o(j.a());
            if (interfaceC13591z instanceof InterfaceC13561B) {
                composer.startReplaceGroup(617653824);
                composer.P();
                lVar = null;
            } else {
                composer.startReplaceGroup(617786442);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = h0.k.a();
                    composer.t(objB);
                }
                lVar = (h0.l) objB;
                composer.P();
            }
            Modifier modifierM0clickableO2vRcR0 = ClickableKt.m0clickableO2vRcR0(Modifier.INSTANCE, lVar, interfaceC13591z, this.f48140f, this.f48141g, this.f48142h, this.f48143i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierM0clickableO2vRcR0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f48144f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48145g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f48146h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48147i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48148j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, Function0 function0) {
            super(3);
            this.f48144f = interfaceC13591z;
            this.f48145g = z10;
            this.f48146h = str;
            this.f48147i = role;
            this.f48148j = function0;
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
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48144f).then(new ClickableElement(lVar, null, this.f48145g, this.f48146h, this.f48147i, this.f48148j, null));
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
        final /* synthetic */ boolean f48149f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f48150g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48151h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f48152i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, Role role, Function0 function0) {
            super(1);
            this.f48149f = z10;
            this.f48150g = str;
            this.f48151h = role;
            this.f48152i = function0;
        }

        public final void a(N0 n02) {
            n02.b("clickable");
            n02.getProperties().c("enabled", Boolean.valueOf(this.f48149f));
            n02.getProperties().c("onClickLabel", this.f48150g);
            n02.getProperties().c("role", this.f48151h);
            n02.getProperties().c("onClick", this.f48152i);
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
        final /* synthetic */ boolean f48153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f48154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48155h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f48156i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48157j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48158k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f48159l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            super(3);
            this.f48153f = z10;
            this.f48154g = str;
            this.f48155h = role;
            this.f48156i = str2;
            this.f48157j = function0;
            this.f48158k = function02;
            this.f48159l = function03;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            h0.l lVar;
            composer.startReplaceGroup(1969174843);
            if (ComposerKt.M()) {
                ComposerKt.U(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:312)");
            }
            InterfaceC13591z interfaceC13591z = (InterfaceC13591z) composer.o(j.a());
            if (interfaceC13591z instanceof InterfaceC13561B) {
                composer.startReplaceGroup(-1724200443);
                composer.P();
                lVar = null;
            } else {
                composer.startReplaceGroup(-1724067825);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = h0.k.a();
                    composer.t(objB);
                }
                lVar = (h0.l) objB;
                composer.P();
            }
            Modifier modifierE = ClickableKt.e(Modifier.INSTANCE, lVar, interfaceC13591z, this.f48153f, this.f48154g, this.f48155h, this.f48156i, this.f48157j, this.f48158k, true, this.f48159l);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f48160f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48161g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f48162h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48163i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48164j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f48165k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f48166l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f48167m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03) {
            super(3);
            this.f48160f = interfaceC13591z;
            this.f48161g = z10;
            this.f48162h = str;
            this.f48163i = role;
            this.f48164j = function0;
            this.f48165k = str2;
            this.f48166l = function02;
            this.f48167m = function03;
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
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48160f).then(new CombinedClickableElement(lVar, null, this.f48161g, this.f48162h, this.f48163i, this.f48164j, this.f48165k, this.f48166l, this.f48167m, true, null));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierThen;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13591z f48168f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48169g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f48170h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Role f48171i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48172j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f48173k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f48174l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f48175m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f48176n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, boolean z11) {
            super(3);
            this.f48168f = interfaceC13591z;
            this.f48169g = z10;
            this.f48170h = str;
            this.f48171i = role;
            this.f48172j = function0;
            this.f48173k = str2;
            this.f48174l = function02;
            this.f48175m = function03;
            this.f48176n = z11;
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
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            Modifier modifierThen = j.b(Modifier.INSTANCE, lVar, this.f48168f).then(new CombinedClickableElement(lVar, null, this.f48169g, this.f48170h, this.f48171i, this.f48172j, this.f48173k, this.f48174l, this.f48175m, this.f48176n, null));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierThen;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f48177f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f48178g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Role f48179h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f48180i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f48181j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f48182k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f48183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, String str, Role role, Function0 function0, Function0 function02, Function0 function03, String str2) {
            super(1);
            this.f48177f = z10;
            this.f48178g = str;
            this.f48179h = role;
            this.f48180i = function0;
            this.f48181j = function02;
            this.f48182k = function03;
            this.f48183l = str2;
        }

        public final void a(N0 n02) {
            n02.b("combinedClickable");
            n02.getProperties().c("enabled", Boolean.valueOf(this.f48177f));
            n02.getProperties().c("onClickLabel", this.f48178g);
            n02.getProperties().c("role", this.f48179h);
            n02.getProperties().c("onClick", this.f48180i);
            n02.getProperties().c("onDoubleClick", this.f48181j);
            n02.getProperties().c("onLongClick", this.f48182k);
            n02.getProperties().c("onLongClickLabel", this.f48183l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/B0;", "node", "", "a", "(Landroidx/compose/ui/node/B0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<B0, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f48184f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Ref.BooleanRef booleanRef) {
            super(1);
            this.f48184f = booleanRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(androidx.compose.ui.node.B0 r4) {
            /*
                r3 = this;
                kotlin.jvm.internal.Ref$BooleanRef r0 = r3.f48184f
                boolean r1 = r0.f143735a
                r2 = 1
                if (r1 != 0) goto L17
                java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"
                kotlin.jvm.internal.Intrinsics.h(r4, r1)
                f0.F r4 = (kotlin.C13898F) r4
                boolean r4 = r4.getEnabled()
                if (r4 == 0) goto L15
                goto L17
            L15:
                r4 = 0
                goto L18
            L17:
                r4 = r2
            L18:
                r0.f143735a = r4
                kotlin.jvm.internal.Ref$BooleanRef r4 = r3.f48184f
                boolean r4 = r4.f143735a
                r4 = r4 ^ r2
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.h.invoke(androidx.compose.ui.node.B0):java.lang.Boolean");
        }
    }

    public static /* synthetic */ Modifier c(Modifier modifier, h0.l lVar, InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m0clickableO2vRcR0(modifier, lVar, interfaceC13591z, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : role, function0);
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m0clickableO2vRcR0(Modifier modifier, h0.l lVar, InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, Function0<Unit> function0) {
        Modifier modifierC;
        Modifier modifier__clickable7_Modifier = FullStoryAnnotationsKt.__clickable7_Modifier(modifier, lVar, interfaceC13591z, z10, str, role, function0);
        Function0<Unit> function0__clickable7_onClick = FullStoryAnnotationsKt.__clickable7_onClick(modifier__clickable7_Modifier, lVar, interfaceC13591z, z10, str, role, function0);
        if (interfaceC13591z instanceof InterfaceC13561B) {
            modifierC = new ClickableElement(lVar, (InterfaceC13561B) interfaceC13591z, z10, str, role, function0__clickable7_onClick, null);
        } else if (interfaceC13591z == null) {
            modifierC = new ClickableElement(lVar, null, z10, str, role, function0__clickable7_onClick, null);
        } else if (lVar != null) {
            modifierC = j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new ClickableElement(lVar, null, z10, str, role, function0__clickable7_onClick, null));
        } else {
            modifierC = androidx.compose.ui.b.c(Modifier.INSTANCE, null, new b(interfaceC13591z, z10, str, role, function0__clickable7_onClick), 1, null);
        }
        return modifier__clickable7_Modifier.then(modifierC);
    }

    @Deprecated
    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m2combinedClickableXVZzFYc(Modifier modifier, h0.l lVar, InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03) {
        Modifier modifierC;
        Modifier modifier__combinedClickable10_Modifier = FullStoryAnnotationsKt.__combinedClickable10_Modifier(modifier, lVar, interfaceC13591z, z10, str, role, str2, function0, function02, function03);
        Function0<Unit> function0__combinedClickable10_onLongClick = FullStoryAnnotationsKt.__combinedClickable10_onLongClick(modifier__combinedClickable10_Modifier, lVar, interfaceC13591z, z10, str, role, str2, function0, function02, function03);
        Function0<Unit> function0__combinedClickable10_onClick = FullStoryAnnotationsKt.__combinedClickable10_onClick(modifier__combinedClickable10_Modifier, lVar, interfaceC13591z, z10, str, role, str2, function0__combinedClickable10_onLongClick, function02, function03);
        if (interfaceC13591z instanceof InterfaceC13561B) {
            modifierC = new CombinedClickableElement(lVar, (InterfaceC13561B) interfaceC13591z, z10, str, role, function0__combinedClickable10_onClick, str2, function0__combinedClickable10_onLongClick, function02, true, null);
        } else if (interfaceC13591z == null) {
            modifierC = new CombinedClickableElement(lVar, null, z10, str, role, function0__combinedClickable10_onClick, str2, function0__combinedClickable10_onLongClick, function02, true, null);
        } else if (lVar != null) {
            modifierC = j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new CombinedClickableElement(lVar, null, z10, str, role, function0__combinedClickable10_onClick, str2, function0__combinedClickable10_onLongClick, function02, true, null));
        } else {
            modifierC = androidx.compose.ui.b.c(Modifier.INSTANCE, null, new e(interfaceC13591z, z10, str, role, function0__combinedClickable10_onClick, str2, function0__combinedClickable10_onLongClick, function02), 1, null);
        }
        return modifier__combinedClickable10_Modifier.then(modifierC);
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m1clickableXHw0xAI(modifier, z10, str, role, function0);
    }

    public static final Modifier e(Modifier modifier, h0.l lVar, InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02, boolean z11, Function0<Unit> function03) {
        Modifier modifierC;
        if (interfaceC13591z instanceof InterfaceC13561B) {
            modifierC = new CombinedClickableElement(lVar, (InterfaceC13561B) interfaceC13591z, z10, str, role, function03, str2, function0, function02, z11, null);
        } else if (interfaceC13591z == null) {
            modifierC = new CombinedClickableElement(lVar, null, z10, str, role, function03, str2, function0, function02, z11, null);
        } else if (lVar != null) {
            modifierC = j.b(Modifier.INSTANCE, lVar, interfaceC13591z).then(new CombinedClickableElement(lVar, null, z10, str, role, function03, str2, function0, function02, z11, null));
        } else {
            modifierC = androidx.compose.ui.b.c(Modifier.INSTANCE, null, new f(interfaceC13591z, z10, str, role, function03, str2, function0, function02, z11), 1, null);
        }
        return modifier.then(modifierC);
    }

    public static /* synthetic */ Modifier f(Modifier modifier, h0.l lVar, InterfaceC13591z interfaceC13591z, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, boolean z11, Function0 function03, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            role = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        if ((i10 & 128) != 0) {
            function02 = null;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        }
        return e(modifier, lVar, interfaceC13591z, z10, str, role, str2, function0, function02, z11, function03);
    }

    public static final boolean g(B0 b02) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C0.c(b02, C13898F.INSTANCE, new h(booleanRef));
        return booleanRef.f143735a;
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m1clickableXHw0xAI(Modifier modifier, boolean z10, String str, Role role, Function0<Unit> function0) {
        Function1 function1A;
        Modifier modifier__clickable5_Modifier = FullStoryAnnotationsKt.__clickable5_Modifier(modifier, z10, str, role, function0);
        Function0<Unit> function0__clickable5_onClick = FullStoryAnnotationsKt.__clickable5_onClick(modifier__clickable5_Modifier, z10, str, role, function0);
        if (L0.b()) {
            function1A = new c(z10, str, role, function0__clickable5_onClick);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier__clickable5_Modifier, function1A, new a(z10, str, role, function0__clickable5_onClick));
    }

    @Deprecated
    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m3combinedClickablecJG_KMw(Modifier modifier, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03) {
        Function1 function1A;
        Modifier modifier__combinedClickable8_Modifier = FullStoryAnnotationsKt.__combinedClickable8_Modifier(modifier, z10, str, role, str2, function0, function02, function03);
        Function0<Unit> function0__combinedClickable8_onLongClick = FullStoryAnnotationsKt.__combinedClickable8_onLongClick(modifier__combinedClickable8_Modifier, z10, str, role, str2, function0, function02, function03);
        Function0<Unit> function0__combinedClickable8_onClick = FullStoryAnnotationsKt.__combinedClickable8_onClick(modifier__combinedClickable8_Modifier, z10, str, role, str2, function0__combinedClickable8_onLongClick, function02, function03);
        if (L0.b()) {
            function1A = new g(z10, str, role, function0__combinedClickable8_onClick, function02, function0__combinedClickable8_onLongClick, str2);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier__combinedClickable8_Modifier, function1A, new d(z10, str, role, str2, function0__combinedClickable8_onLongClick, function02, function0__combinedClickable8_onClick));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(KeyEvent keyEvent) {
        if (C13751c.e(C13752d.b(keyEvent), C13751c.INSTANCE.b()) && i(keyEvent)) {
            return true;
        }
        return false;
    }

    private static final boolean i(KeyEvent keyEvent) {
        boolean zQ;
        boolean zQ2;
        long jA = C13752d.a(keyEvent);
        C13749a.Companion companion = C13749a.INSTANCE;
        if (C13749a.q(jA, companion.b())) {
            zQ = true;
        } else {
            zQ = C13749a.q(jA, companion.g());
        }
        if (zQ) {
            zQ2 = true;
        } else {
            zQ2 = C13749a.q(jA, companion.k());
        }
        if (zQ2) {
            return true;
        }
        return C13749a.q(jA, companion.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(KeyEvent keyEvent) {
        if (C13751c.e(C13752d.b(keyEvent), C13751c.INSTANCE.a()) && i(keyEvent)) {
            return true;
        }
        return false;
    }
}
