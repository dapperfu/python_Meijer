package Xj;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"LXj/u;", "", "", "updateLoadingVisible", "addButtonVisible", "updateEntryViewVisible", "deleteEntryBtnVisible", "decreaseQuantityBtnVisible", "entryCountBtnVisible", "incrementEnabled", "<init>", "(ZZZZZZZ)V", "a", "(ZZZZZZZ)LXj/u;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "i", "()Z", "b", "c", "h", "d", "e", "f", "g", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xj.u, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ViewVisibilityState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateLoadingVisible;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean addButtonVisible;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateEntryViewVisible;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean deleteEntryBtnVisible;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean decreaseQuantityBtnVisible;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean entryCountBtnVisible;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean incrementEnabled;

    public ViewVisibilityState() {
        this(false, false, false, false, false, false, false, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewVisibilityState)) {
            return false;
        }
        ViewVisibilityState viewVisibilityState = (ViewVisibilityState) other;
        return this.updateLoadingVisible == viewVisibilityState.updateLoadingVisible && this.addButtonVisible == viewVisibilityState.addButtonVisible && this.updateEntryViewVisible == viewVisibilityState.updateEntryViewVisible && this.deleteEntryBtnVisible == viewVisibilityState.deleteEntryBtnVisible && this.decreaseQuantityBtnVisible == viewVisibilityState.decreaseQuantityBtnVisible && this.entryCountBtnVisible == viewVisibilityState.entryCountBtnVisible && this.incrementEnabled == viewVisibilityState.incrementEnabled;
    }

    public ViewVisibilityState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.updateLoadingVisible = z10;
        this.addButtonVisible = z11;
        this.updateEntryViewVisible = z12;
        this.deleteEntryBtnVisible = z13;
        this.decreaseQuantityBtnVisible = z14;
        this.entryCountBtnVisible = z15;
        this.incrementEnabled = z16;
    }

    public static /* synthetic */ ViewVisibilityState b(ViewVisibilityState viewVisibilityState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = viewVisibilityState.updateLoadingVisible;
        }
        if ((i10 & 2) != 0) {
            z11 = viewVisibilityState.addButtonVisible;
        }
        if ((i10 & 4) != 0) {
            z12 = viewVisibilityState.updateEntryViewVisible;
        }
        if ((i10 & 8) != 0) {
            z13 = viewVisibilityState.deleteEntryBtnVisible;
        }
        if ((i10 & 16) != 0) {
            z14 = viewVisibilityState.decreaseQuantityBtnVisible;
        }
        if ((i10 & 32) != 0) {
            z15 = viewVisibilityState.entryCountBtnVisible;
        }
        if ((i10 & 64) != 0) {
            z16 = viewVisibilityState.incrementEnabled;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        boolean z19 = z14;
        boolean z20 = z12;
        return viewVisibilityState.a(z10, z11, z20, z13, z19, z17, z18);
    }

    public final ViewVisibilityState a(boolean updateLoadingVisible, boolean addButtonVisible, boolean updateEntryViewVisible, boolean deleteEntryBtnVisible, boolean decreaseQuantityBtnVisible, boolean entryCountBtnVisible, boolean incrementEnabled) {
        return new ViewVisibilityState(updateLoadingVisible, addButtonVisible, updateEntryViewVisible, deleteEntryBtnVisible, decreaseQuantityBtnVisible, entryCountBtnVisible, incrementEnabled);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAddButtonVisible() {
        return this.addButtonVisible;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getDecreaseQuantityBtnVisible() {
        return this.decreaseQuantityBtnVisible;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getDeleteEntryBtnVisible() {
        return this.deleteEntryBtnVisible;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getEntryCountBtnVisible() {
        return this.entryCountBtnVisible;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIncrementEnabled() {
        return this.incrementEnabled;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getUpdateEntryViewVisible() {
        return this.updateEntryViewVisible;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.updateLoadingVisible) * 31) + Boolean.hashCode(this.addButtonVisible)) * 31) + Boolean.hashCode(this.updateEntryViewVisible)) * 31) + Boolean.hashCode(this.deleteEntryBtnVisible)) * 31) + Boolean.hashCode(this.decreaseQuantityBtnVisible)) * 31) + Boolean.hashCode(this.entryCountBtnVisible)) * 31) + Boolean.hashCode(this.incrementEnabled);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getUpdateLoadingVisible() {
        return this.updateLoadingVisible;
    }

    public String toString() {
        return "ViewVisibilityState(updateLoadingVisible=" + this.updateLoadingVisible + ", addButtonVisible=" + this.addButtonVisible + ", updateEntryViewVisible=" + this.updateEntryViewVisible + ", deleteEntryBtnVisible=" + this.deleteEntryBtnVisible + ", decreaseQuantityBtnVisible=" + this.decreaseQuantityBtnVisible + ", entryCountBtnVisible=" + this.entryCountBtnVisible + ", incrementEnabled=" + this.incrementEnabled + ')';
    }

    public /* synthetic */ ViewVisibilityState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? true : z16);
    }
}
