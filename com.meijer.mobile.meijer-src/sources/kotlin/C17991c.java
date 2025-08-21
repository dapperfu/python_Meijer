package kotlin;

import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17991c extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<Composer, Integer, Unit> f168806f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Modifier f168807g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function2<Composer, Integer, Unit> f168808h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function2<Composer, Integer, Unit> f168809i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ D1 f168810j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f168811k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ long f168812l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17991c(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, D1 d12, long j10, long j11) {
        super(2);
        this.f168806f = function2;
        this.f168807g = modifier;
        this.f168808h = function22;
        this.f168809i = function23;
        this.f168810j = d12;
        this.f168811k = j10;
        this.f168812l = j11;
    }

    public final void a(Composer composer, int i10) {
        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
            composer.K();
            return;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-66632952, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:183)");
        }
        C17985a.b(this.f168806f, this.f168807g, this.f168808h, this.f168809i, this.f168810j, this.f168811k, this.f168812l, composer, 0, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        a(composer, num.intValue());
        return Unit.f143329a;
    }
}
