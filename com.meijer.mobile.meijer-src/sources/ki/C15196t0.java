package ki;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lki/t0;", "", "Lki/T;", "<init>", "()V", "LKi/M;", "themeScope", "a", "(LKi/M;Landroidx/compose/runtime/Composer;I)Lki/T;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C15196t0 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C15196t0 f142485a = new C15196t0();

    public boolean equals(Object other) {
        return this == other || (other instanceof C15196t0);
    }

    @Override // ki.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC15150T q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(452438724);
        if (ComposerKt.M()) {
            ComposerKt.U(452438724, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Circular.Small.QuantityInput.generateAssembly (TextField.kt:512)");
        }
        InterfaceC15150T interfaceC15150TQ = new D0(new C15192r0(new Pair(C15190q0.f142179a, C15182m0.f142152a))).q(themeScope, composer, i10 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return interfaceC15150TQ;
    }

    public String toString() {
        return "QuantityInput";
    }

    private C15196t0() {
    }

    public int hashCode() {
        return 2003802921;
    }
}
