package ji;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lji/J0;", "", "Lji/U;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/U;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class J0 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f139671a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f139672b = 0;

    public boolean equals(Object other) {
        return this == other || (other instanceof J0);
    }

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC14917U q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-446180344);
        if (ComposerKt.M()) {
            ComposerKt.U(-446180344, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.InputFields.Rectangle.Large.Search.generateAssembly (TextField.kt:445)");
        }
        InterfaceC14917U interfaceC14917UQ = new E0(new C14958r0(new Pair(C14954p0.f139920a, C14952o0.f139916a))).q(themeScope, composer, i10 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return interfaceC14917UQ;
    }

    public String toString() {
        return "Search";
    }

    private J0() {
    }

    public int hashCode() {
        return -552043014;
    }
}
