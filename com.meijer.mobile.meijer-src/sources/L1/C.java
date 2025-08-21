package L1;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"5\u0010\u0010\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00018@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\t\u0010\u0003\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "LL1/u;", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "DesignInfoDataKey", "Lr1/u;", "<set-?>", "c", "getDesignInfoProvider", "(Lr1/u;)LL1/u;", "a", "(Lr1/u;LL1/u;)V", "getDesignInfoProvider$annotations", "(Lr1/u;)V", "designInfoProvider", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f17793a = {Reflection.f(new MutablePropertyReference1Impl(Reflection.d(C.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};

    /* renamed from: b, reason: collision with root package name */
    private static final SemanticsPropertyKey<u> f17794b;

    /* renamed from: c, reason: collision with root package name */
    private static final SemanticsPropertyKey f17795c;

    static {
        SemanticsPropertyKey<u> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);
        f17794b = semanticsPropertyKey;
        f17795c = semanticsPropertyKey;
    }

    public static final void a(r1.u uVar, u uVar2) {
        Intrinsics.j(uVar, "<this>");
        Intrinsics.j(uVar2, "<set-?>");
        f17795c.d(uVar, f17793a[0], uVar2);
    }
}
