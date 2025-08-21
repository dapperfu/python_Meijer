package Xh;

import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LXh/a;", "", "Lbk/a;", "categoryTitle", "", "LXh/b;", "items", "<init>", "(Lbk/a;Ljava/util/List;)V", "a", "(Lbk/a;Ljava/util/List;)LXh/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "c", "()Lbk/a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xh.a, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PreferenceGroup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a categoryTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PreferenceItem> items;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceGroup)) {
            return false;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) other;
        return Intrinsics.e(this.categoryTitle, preferenceGroup.categoryTitle) && Intrinsics.e(this.items, preferenceGroup.items);
    }

    public PreferenceGroup(AbstractC6392a categoryTitle, List<PreferenceItem> items) {
        Intrinsics.j(categoryTitle, "categoryTitle");
        Intrinsics.j(items, "items");
        this.categoryTitle = categoryTitle;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreferenceGroup b(PreferenceGroup preferenceGroup, AbstractC6392a abstractC6392a, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC6392a = preferenceGroup.categoryTitle;
        }
        if ((i10 & 2) != 0) {
            list = preferenceGroup.items;
        }
        return preferenceGroup.a(abstractC6392a, list);
    }

    public final PreferenceGroup a(AbstractC6392a categoryTitle, List<PreferenceItem> items) {
        Intrinsics.j(categoryTitle, "categoryTitle");
        Intrinsics.j(items, "items");
        return new PreferenceGroup(categoryTitle, items);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getCategoryTitle() {
        return this.categoryTitle;
    }

    public final List<PreferenceItem> d() {
        return this.items;
    }

    public int hashCode() {
        return (this.categoryTitle.hashCode() * 31) + this.items.hashCode();
    }

    public String toString() {
        return "PreferenceGroup(categoryTitle=" + this.categoryTitle + ", items=" + this.items + ')';
    }
}
