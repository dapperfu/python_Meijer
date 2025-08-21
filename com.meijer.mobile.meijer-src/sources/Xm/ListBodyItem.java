package Xm;

import androidx.compose.runtime.Composer;
import com.meijer.mobile.meijer.activity.find.filter.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"LXm/j;", "", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "item", "", "key", "semanticName", "Lkotlin/Function1;", "", "view", "", "accessibilityAction", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/filter/s;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "b", "()Lcom/meijer/mobile/meijer/activity/find/filter/s;", "Ljava/lang/String;", "c", "d", "Lkotlin/jvm/functions/Function3;", "e", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xm.j, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ListBodyItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s item;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semanticName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function3<s, Composer, Integer, Unit> view;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<s, Boolean> accessibilityAction;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListBodyItem)) {
            return false;
        }
        ListBodyItem listBodyItem = (ListBodyItem) other;
        return Intrinsics.e(this.item, listBodyItem.item) && Intrinsics.e(this.key, listBodyItem.key) && Intrinsics.e(this.semanticName, listBodyItem.semanticName) && Intrinsics.e(this.view, listBodyItem.view) && Intrinsics.e(this.accessibilityAction, listBodyItem.accessibilityAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListBodyItem(s item, String key, String semanticName, Function3<? super s, ? super Composer, ? super Integer, Unit> view, Function1<? super s, Boolean> accessibilityAction) {
        Intrinsics.j(item, "item");
        Intrinsics.j(key, "key");
        Intrinsics.j(semanticName, "semanticName");
        Intrinsics.j(view, "view");
        Intrinsics.j(accessibilityAction, "accessibilityAction");
        this.item = item;
        this.key = key;
        this.semanticName = semanticName;
        this.view = view;
        this.accessibilityAction = accessibilityAction;
    }

    public final Function1<s, Boolean> a() {
        return this.accessibilityAction;
    }

    /* renamed from: b, reason: from getter */
    public final s getItem() {
        return this.item;
    }

    /* renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: d, reason: from getter */
    public final String getSemanticName() {
        return this.semanticName;
    }

    public final Function3<s, Composer, Integer, Unit> e() {
        return this.view;
    }

    public int hashCode() {
        return (((((((this.item.hashCode() * 31) + this.key.hashCode()) * 31) + this.semanticName.hashCode()) * 31) + this.view.hashCode()) * 31) + this.accessibilityAction.hashCode();
    }

    public String toString() {
        return "ListBodyItem(item=" + this.item + ", key=" + this.key + ", semanticName=" + this.semanticName + ", view=" + this.view + ", accessibilityAction=" + this.accessibilityAction + ')';
    }
}
