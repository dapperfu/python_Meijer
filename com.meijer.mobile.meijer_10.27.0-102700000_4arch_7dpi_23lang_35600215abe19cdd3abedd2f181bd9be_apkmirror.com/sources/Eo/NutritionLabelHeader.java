package Eo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010*\u001a\u00020\u001a8\u0006¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010'¨\u0006+"}, d2 = {"LEo/h;", "Landroid/os/Parcelable;", "", "name", "servingsPerContainer", "", "LEo/i;", "servingSizes", "LEo/a;", "nutrients", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "Z", "()Z", "isEmpty$annotations", "()V", "isEmpty", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eo.h, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class NutritionLabelHeader implements Parcelable {
    public static final Parcelable.Creator<NutritionLabelHeader> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String servingsPerContainer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ServingSize> servingSizes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Nutrient> nutrients;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmpty;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eo.h$a */
    public static final class a implements Parcelable.Creator<NutritionLabelHeader> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NutritionLabelHeader createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(ServingSize.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Nutrient.CREATOR.createFromParcel(parcel));
            }
            return new NutritionLabelHeader(string, string2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NutritionLabelHeader[] newArray(int i10) {
            return new NutritionLabelHeader[i10];
        }
    }

    public NutritionLabelHeader() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NutritionLabelHeader)) {
            return false;
        }
        NutritionLabelHeader nutritionLabelHeader = (NutritionLabelHeader) other;
        return Intrinsics.e(this.name, nutritionLabelHeader.name) && Intrinsics.e(this.servingsPerContainer, nutritionLabelHeader.servingsPerContainer) && Intrinsics.e(this.servingSizes, nutritionLabelHeader.servingSizes) && Intrinsics.e(this.nutrients, nutritionLabelHeader.nutrients);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.servingsPerContainer);
        List<ServingSize> list = this.servingSizes;
        dest.writeInt(list.size());
        Iterator<ServingSize> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<Nutrient> list2 = this.nutrients;
        dest.writeInt(list2.size());
        Iterator<Nutrient> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public NutritionLabelHeader(String name, String servingsPerContainer, List<ServingSize> servingSizes, List<Nutrient> nutrients) {
        Intrinsics.j(name, "name");
        Intrinsics.j(servingsPerContainer, "servingsPerContainer");
        Intrinsics.j(servingSizes, "servingSizes");
        Intrinsics.j(nutrients, "nutrients");
        this.name = name;
        this.servingsPerContainer = servingsPerContainer;
        this.servingSizes = servingSizes;
        this.nutrients = nutrients;
        this.isEmpty = StringsKt.r0(name) && StringsKt.r0(servingsPerContainer) && CollectionsKt.P0(servingSizes, nutrients).isEmpty();
    }

    public final List<Nutrient> a() {
        return this.nutrients;
    }

    public final List<ServingSize> b() {
        return this.servingSizes;
    }

    /* renamed from: c, reason: from getter */
    public final String getServingsPerContainer() {
        return this.servingsPerContainer;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.servingsPerContainer.hashCode()) * 31) + this.servingSizes.hashCode()) * 31) + this.nutrients.hashCode();
    }

    public String toString() {
        return "NutritionLabelHeader(name=" + this.name + ", servingsPerContainer=" + this.servingsPerContainer + ", servingSizes=" + this.servingSizes + ", nutrients=" + this.nutrients + ')';
    }

    public /* synthetic */ NutritionLabelHeader(String str, String str2, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? CollectionsKt.m() : list2);
    }
}
