package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import e1.C13750b;
import kotlin.C17778Q;
import kotlin.C17781U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import z1.InterfaceC18417E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/B;", "state", "Lw0/Q;", "manager", "Lz1/M;", "value", "Lkotlin/Function1;", "", "onValueChange", "", "editable", "singleLine", "Lz1/E;", "offsetMapping", "Landroidx/compose/foundation/text/s0;", "undoManager", "Landroidx/compose/ui/text/input/a;", "imeAction", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lw0/Q;Lz1/M;Lkotlin/jvm/functions/Function1;ZZLz1/E;Landroidx/compose/foundation/text/s0;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49519f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17778Q f49520g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49521h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49522i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49523j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49524k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ s0 f49525l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49526m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f49527n;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.Y$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1027a extends FunctionReferenceImpl implements Function1<C13750b, Boolean> {
            C1027a(Object obj) {
                super(1, obj, X.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean a(KeyEvent keyEvent) {
                return Boolean.valueOf(((X) this.receiver).l(keyEvent));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(C13750b c13750b) {
                return a(c13750b.getNativeKeyEvent());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(B b10, C17778Q c17778q, TextFieldValue textFieldValue, boolean z10, boolean z11, InterfaceC18417E interfaceC18417E, s0 s0Var, Function1<? super TextFieldValue, Unit> function1, int i10) {
            super(3);
            this.f49519f = b10;
            this.f49520g = c17778q;
            this.f49521h = textFieldValue;
            this.f49522i = z10;
            this.f49523j = z11;
            this.f49524k = interfaceC18417E;
            this.f49525l = s0Var;
            this.f49526m = function1;
            this.f49527n = i10;
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(851809892);
            if (ComposerKt.M()) {
                ComposerKt.U(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:252)");
            }
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17781U();
                composer.t(objB);
            }
            C17781U c17781u = (C17781U) objB;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new C5822l();
                composer.t(objB2);
            }
            X x10 = new X(this.f49519f, this.f49520g, this.f49521h, this.f49522i, this.f49523j, c17781u, this.f49524k, this.f49525l, (C5822l) objB2, null, this.f49526m, this.f49527n, 512, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean zD = composer.D(x10);
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C1027a(x10);
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

    public static final Modifier a(Modifier modifier, B b10, C17778Q c17778q, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, boolean z10, boolean z11, InterfaceC18417E interfaceC18417E, s0 s0Var, int i10) {
        return androidx.compose.ui.b.c(modifier, null, new a(b10, c17778q, textFieldValue, z10, z11, interfaceC18417E, s0Var, function1, i10), 1, null);
    }
}
