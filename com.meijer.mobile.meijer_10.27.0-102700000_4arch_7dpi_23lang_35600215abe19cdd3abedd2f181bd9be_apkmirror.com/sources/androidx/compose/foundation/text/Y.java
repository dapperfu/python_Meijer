package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import e1.C13602b;
import kotlin.C17708Q;
import kotlin.C17711U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import z1.InterfaceC18354E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/B;", "state", "Lw0/Q;", "manager", "Lz1/M;", "value", "Lkotlin/Function1;", "", "onValueChange", "", "editable", "singleLine", "Lz1/E;", "offsetMapping", "Landroidx/compose/foundation/text/s0;", "undoManager", "Landroidx/compose/ui/text/input/a;", "imeAction", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lw0/Q;Lz1/M;Lkotlin/jvm/functions/Function1;ZZLz1/E;Landroidx/compose/foundation/text/s0;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49295f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17708Q f49296g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49297h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49298i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49299j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49300k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ s0 f49301l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49302m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f49303n;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.Y$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1014a extends FunctionReferenceImpl implements Function1<C13602b, Boolean> {
            C1014a(Object obj) {
                super(1, obj, X.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean a(KeyEvent keyEvent) {
                return Boolean.valueOf(((X) this.receiver).l(keyEvent));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(C13602b c13602b) {
                return a(c13602b.getNativeKeyEvent());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(B b10, C17708Q c17708q, TextFieldValue textFieldValue, boolean z10, boolean z11, InterfaceC18354E interfaceC18354E, s0 s0Var, Function1<? super TextFieldValue, Unit> function1, int i10) {
            super(3);
            this.f49295f = b10;
            this.f49296g = c17708q;
            this.f49297h = textFieldValue;
            this.f49298i = z10;
            this.f49299j = z11;
            this.f49300k = interfaceC18354E;
            this.f49301l = s0Var;
            this.f49302m = function1;
            this.f49303n = i10;
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(851809892);
            if (ComposerKt.M()) {
                ComposerKt.U(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:252)");
            }
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17711U();
                composer.t(objB);
            }
            C17711U c17711u = (C17711U) objB;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new C5680l();
                composer.t(objB2);
            }
            X x10 = new X(this.f49295f, this.f49296g, this.f49297h, this.f49298i, this.f49299j, c17711u, this.f49300k, this.f49301l, (C5680l) objB2, null, this.f49302m, this.f49303n, 512, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean zD = composer.D(x10);
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C1014a(x10);
                composer.t(objB3);
            }
            Modifier modifierA = androidx.compose.ui.input.key.b.a(companion2, (Function1) ((KFunction) objB3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierA;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }
    }

    public static final Modifier a(Modifier modifier, B b10, C17708Q c17708q, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, boolean z10, boolean z11, InterfaceC18354E interfaceC18354E, s0 s0Var, int i10) {
        return androidx.compose.ui.b.c(modifier, null, new a(b10, c17708q, textFieldValue, z10, z11, interfaceC18354E, s0Var, function1, i10), 1, null);
    }
}
