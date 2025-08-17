package Dj;

import U0.f;
import V0.AbstractC5324i0;
import V0.C5346q0;
import androidx.compose.foundation.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.C6292E;
import kotlin.C6300M;
import kotlin.C6301N;
import kotlin.C6302O;
import kotlin.C6327j;
import kotlin.EnumC6311Y;
import kotlin.InterfaceC6290C;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "LV0/q0;", "color", "Lc0/C;", "easing", "", "durationMillis", "Lc0/Y;", "repeatMode", "a", "(Landroidx/compose/ui/Modifier;JLc0/C;ILc0/Y;)Landroidx/compose/ui/Modifier;", "", "translateAnim", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Dj.a$a, reason: collision with other inner class name */
    static final class C0099a implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6290C f6703c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC6311Y f6704d;

        C0099a(long j10, int i10, InterfaceC6290C interfaceC6290C, EnumC6311Y enumC6311Y) {
            this.f6701a = j10;
            this.f6702b = i10;
            this.f6703c = interfaceC6290C;
            this.f6704d = enumC6311Y;
        }

        public final Modifier a(Modifier composed, Composer composer, int i10) {
            Intrinsics.j(composed, "$this$composed");
            composer.startReplaceGroup(1583364788);
            if (ComposerKt.M()) {
                ComposerKt.U(1583364788, i10, -1, "com.meijer.mobile.core.design.compose.modifier.skeletonLoader.<anonymous> (SkeletonLoader.kt:37)");
            }
            List listP = CollectionsKt.p(C5346q0.m(C5346q0.q(this.f6701a, 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), C5346q0.m(C5346q0.q(this.f6701a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), C5346q0.m(C5346q0.q(this.f6701a, 0.9f, 0.0f, 0.0f, 0.0f, 14, null)));
            z1<Float> z1VarA = C6302O.a(C6302O.c(null, composer, 0, 1), 0.0f, 1000.0f, C6327j.e(C6327j.l(this.f6702b, 0, this.f6703c, 2, null), this.f6704d, 0L, 4, null), null, composer, C6301N.f60910f | 432 | (C6300M.f60906d << 9), 8);
            AbstractC5324i0.Companion companion = AbstractC5324i0.INSTANCE;
            long jE = f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            float fB = b(z1VarA);
            float fB2 = b(z1VarA);
            Modifier modifierB = b.b(composed, AbstractC5324i0.Companion.b(companion, listP, jE, f.e((Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L)), 0, 8, null), null, 0.0f, 6, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierB;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        private static final float b(z1<Float> z1Var) {
            return z1Var.getValue().floatValue();
        }
    }

    public static final Modifier a(Modifier skeletonLoader, long j10, InterfaceC6290C easing, int i10, EnumC6311Y repeatMode) {
        Intrinsics.j(skeletonLoader, "$this$skeletonLoader");
        Intrinsics.j(easing, "easing");
        Intrinsics.j(repeatMode, "repeatMode");
        return androidx.compose.ui.b.c(skeletonLoader, null, new C0099a(j10, i10, easing, repeatMode), 1, null);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, long j10, InterfaceC6290C interfaceC6290C, int i10, EnumC6311Y enumC6311Y, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC6290C = C6292E.c();
        }
        InterfaceC6290C interfaceC6290C2 = interfaceC6290C;
        if ((i11 & 4) != 0) {
            i10 = 1200;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            enumC6311Y = EnumC6311Y.f60976a;
        }
        return a(modifier, j10, interfaceC6290C2, i12, enumC6311Y);
    }
}
