package oi;

import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.C17958M;
import kotlin.C17960N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Loi/I1;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "LV0/q0;", "tint", "<init>", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oi.I1, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class IconTemplate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Modifier modifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Composer, Integer, C5489q0> tint;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: oi.I1$a */
    static final class a implements Function2<Composer, Integer, C5489q0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f153924a = new a();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C5489q0 invoke(Composer composer, Integer num) {
            return C5489q0.m(a(composer, num.intValue()));
        }

        a() {
        }

        public final long a(Composer composer, int i10) {
            composer.startReplaceGroup(547244743);
            if (ComposerKt.M()) {
                ComposerKt.U(547244743, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.IconTemplate.<init>.<anonymous> (Buttons.kt:188)");
            }
            long jQ = C5489q0.q(((C5489q0) composer.o(C17960N.a())).getValue(), ((Number) composer.o(C17958M.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return jQ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IconTemplate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconTemplate)) {
            return false;
        }
        IconTemplate iconTemplate = (IconTemplate) other;
        return Intrinsics.e(this.modifier, iconTemplate.modifier) && Intrinsics.e(this.tint, iconTemplate.tint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IconTemplate(Modifier modifier, Function2<? super Composer, ? super Integer, C5489q0> tint) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(tint, "tint");
        this.modifier = modifier;
        this.tint = tint;
    }

    /* renamed from: a, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Function2<Composer, Integer, C5489q0> b() {
        return this.tint;
    }

    public int hashCode() {
        return (this.modifier.hashCode() * 31) + this.tint.hashCode();
    }

    public String toString() {
        return "IconTemplate(modifier=" + this.modifier + ", tint=" + this.tint + ')';
    }

    public /* synthetic */ IconTemplate(Modifier modifier, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? a.f153924a : function2);
    }
}
