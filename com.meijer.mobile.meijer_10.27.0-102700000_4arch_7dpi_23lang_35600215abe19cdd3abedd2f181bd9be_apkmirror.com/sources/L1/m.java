package L1;

import androidx.compose.ui.layout.InterfaceC5797y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LL1/m;", "Landroidx/compose/ui/layout/y;", "LL1/h;", "ref", "Lkotlin/Function1;", "LL1/g;", "", "Lkotlin/ExtensionFunctionType;", "constrain", "<init>", "(LL1/h;Lkotlin/jvm/functions/Function1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LL1/h;", "b", "()LL1/h;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Ljava/lang/Object;", "d1", "()Ljava/lang/Object;", "layoutId", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class m implements InterfaceC5797y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h ref;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<C4039g, Unit> constrain;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object layoutId;

    /* JADX WARN: Multi-variable type inference failed */
    public m(h ref, Function1<? super C4039g, Unit> constrain) {
        Intrinsics.j(ref, "ref");
        Intrinsics.j(constrain, "constrain");
        this.ref = ref;
        this.constrain = constrain;
        this.layoutId = ref.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
    }

    public final Function1<C4039g, Unit> a() {
        return this.constrain;
    }

    /* renamed from: b, reason: from getter */
    public final h getRef() {
        return this.ref;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5797y
    /* renamed from: d1, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public boolean equals(Object other) {
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.e(this.ref.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), mVar.ref.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) && Intrinsics.e(this.constrain, mVar.constrain);
    }

    public int hashCode() {
        return (this.ref.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().hashCode() * 31) + this.constrain.hashCode();
    }
}
