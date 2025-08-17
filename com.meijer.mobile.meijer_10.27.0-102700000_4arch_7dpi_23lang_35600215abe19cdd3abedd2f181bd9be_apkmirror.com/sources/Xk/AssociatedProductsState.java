package Xk;

import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"LXk/b;", "Landroid/os/Parcelable;", "LXk/a;", "loadingState", "", "LCo/h;", "products", "<init>", "(LXk/a;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXk/a;", "()LXk/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xk.b, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class AssociatedProductsState implements Parcelable {
    public static final Parcelable.Creator<AssociatedProductsState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Xk.a loadingState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> products;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xk.b$a */
    public static final class a implements Parcelable.Creator<AssociatedProductsState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssociatedProductsState createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            Xk.a aVarValueOf = Xk.a.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(AssociatedProductsState.class.getClassLoader()));
            }
            return new AssociatedProductsState(aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AssociatedProductsState[] newArray(int i10) {
            return new AssociatedProductsState[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssociatedProductsState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssociatedProductsState)) {
            return false;
        }
        AssociatedProductsState associatedProductsState = (AssociatedProductsState) other;
        return this.loadingState == associatedProductsState.loadingState && Intrinsics.e(this.products, associatedProductsState.products);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.loadingState.name());
        List<ProductFullDetails> list = this.products;
        dest.writeInt(list.size());
        Iterator<ProductFullDetails> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public AssociatedProductsState(Xk.a loadingState, List<ProductFullDetails> products) {
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(products, "products");
        this.loadingState = loadingState;
        this.products = products;
    }

    /* renamed from: a, reason: from getter */
    public final Xk.a getLoadingState() {
        return this.loadingState;
    }

    public final List<ProductFullDetails> b() {
        return this.products;
    }

    public int hashCode() {
        return (this.loadingState.hashCode() * 31) + this.products.hashCode();
    }

    public String toString() {
        return "AssociatedProductsState(loadingState=" + this.loadingState + ", products=" + this.products + ')';
    }

    public /* synthetic */ AssociatedProductsState(Xk.a aVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Xk.a.f39414f : aVar, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
