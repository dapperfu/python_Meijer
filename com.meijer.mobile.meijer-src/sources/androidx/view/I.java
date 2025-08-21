package androidx.view;

import androidx.view.InterfaceC6172s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/G;", "Landroidx/lifecycle/s;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/F;", "", "Lkotlin/ExtensionFunctionType;", "onBackPressed", "a", "(Landroidx/activity/G;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;)Landroidx/activity/F;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/I$a", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<F, Unit> f45915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, Function1<? super F, Unit> function1) {
            super(z10);
            this.f45915a = function1;
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            this.f45915a.invoke(this);
        }
    }

    public static final F a(G g10, InterfaceC6172s interfaceC6172s, boolean z10, Function1<? super F, Unit> onBackPressed) {
        Intrinsics.j(g10, "<this>");
        Intrinsics.j(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (interfaceC6172s != null) {
            g10.i(interfaceC6172s, aVar);
            return aVar;
        }
        g10.h(aVar);
        return aVar;
    }

    public static /* synthetic */ F b(G g10, InterfaceC6172s interfaceC6172s, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6172s = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(g10, interfaceC6172s, z10, function1);
    }
}
