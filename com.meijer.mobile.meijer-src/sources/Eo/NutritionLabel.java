package Eo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R#\u00102\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R#\u00106\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010/R#\u0010:\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b7\u0010-\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010/R#\u0010>\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b;\u0010-\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010/R#\u0010A\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b8\u0010-\u0012\u0004\b@\u00101\u001a\u0004\b?\u0010/R\u001d\u0010F\u001a\u00020\u001b8\u0006¢\u0006\u0012\n\u0004\b?\u0010B\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"LEo/g;", "Landroid/os/Parcelable;", "LEo/h;", "header", "", "LEo/a;", "nutrients", "vitamins", "minerals", "micronutrients", "<init>", "(LEo/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEo/h;", "q", "()LEo/h;", "b", "Ljava/util/List;", "t", "()Ljava/util/List;", "c", "w", "d", "s", "e", "r", "f", "Lkotlin/Lazy;", "o", "()LEo/a;", "getFat$annotations", "()V", "fat", "g", "n", "getCarbohydrates$annotations", "carbohydrates", "h", "j", "getCalories$annotations", "calories", "i", "v", "getProtein$annotations", "protein", "k", "getCaloriesFromFat$annotations", "caloriesFromFat", "Z", "x", "()Z", "isEmpty$annotations", "isEmpty", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Eo.g, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class NutritionLabel implements Parcelable {
    public static final Parcelable.Creator<NutritionLabel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NutritionLabelHeader header;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Nutrient> nutrients;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Nutrient> vitamins;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Nutrient> minerals;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Nutrient> micronutrients;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy fat;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy carbohydrates;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy calories;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy protein;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy caloriesFromFat;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmpty;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eo.g$a */
    public static final class a implements Parcelable.Creator<NutritionLabel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NutritionLabel createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            NutritionLabelHeader hVarCreateFromParcel = NutritionLabelHeader.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Nutrient.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Nutrient.CREATOR.createFromParcel(parcel));
            }
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList3.add(Nutrient.CREATOR.createFromParcel(parcel));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList4.add(Nutrient.CREATOR.createFromParcel(parcel));
            }
            return new NutritionLabel(hVarCreateFromParcel, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NutritionLabel[] newArray(int i10) {
            return new NutritionLabel[i10];
        }
    }

    public NutritionLabel() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NutritionLabel)) {
            return false;
        }
        NutritionLabel nutritionLabel = (NutritionLabel) other;
        return Intrinsics.e(this.header, nutritionLabel.header) && Intrinsics.e(this.nutrients, nutritionLabel.nutrients) && Intrinsics.e(this.vitamins, nutritionLabel.vitamins) && Intrinsics.e(this.minerals, nutritionLabel.minerals) && Intrinsics.e(this.micronutrients, nutritionLabel.micronutrients);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        this.header.writeToParcel(dest, flags);
        List<Nutrient> list = this.nutrients;
        dest.writeInt(list.size());
        Iterator<Nutrient> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<Nutrient> list2 = this.vitamins;
        dest.writeInt(list2.size());
        Iterator<Nutrient> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        List<Nutrient> list3 = this.minerals;
        dest.writeInt(list3.size());
        Iterator<Nutrient> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
        List<Nutrient> list4 = this.micronutrients;
        dest.writeInt(list4.size());
        Iterator<Nutrient> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(dest, flags);
        }
    }

    public NutritionLabel(NutritionLabelHeader header, List<Nutrient> nutrients, List<Nutrient> vitamins, List<Nutrient> minerals, List<Nutrient> micronutrients) {
        Intrinsics.j(header, "header");
        Intrinsics.j(nutrients, "nutrients");
        Intrinsics.j(vitamins, "vitamins");
        Intrinsics.j(minerals, "minerals");
        Intrinsics.j(micronutrients, "micronutrients");
        this.header = header;
        this.nutrients = nutrients;
        this.vitamins = vitamins;
        this.minerals = minerals;
        this.micronutrients = micronutrients;
        this.fat = LazyKt.b(new Function0() { // from class: Eo.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NutritionLabel.i(this.f8071a);
            }
        });
        this.carbohydrates = LazyKt.b(new Function0() { // from class: Eo.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NutritionLabel.h(this.f8072a);
            }
        });
        this.calories = LazyKt.b(new Function0() { // from class: Eo.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NutritionLabel.g(this.f8073a);
            }
        });
        this.protein = LazyKt.b(new Function0() { // from class: Eo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NutritionLabel.y(this.f8074a);
            }
        });
        this.caloriesFromFat = LazyKt.b(new Function0() { // from class: Eo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NutritionLabel.f(this.f8075a);
            }
        });
        this.isEmpty = CollectionsKt.P0(CollectionsKt.P0(CollectionsKt.P0(nutrients, vitamins), minerals), micronutrients).isEmpty() && header.getIsEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nutrient f(NutritionLabel nutritionLabel) {
        Object next;
        Iterator<T> it = nutritionLabel.header.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Nutrient) next).getName(), "Calories from Fat")) {
                break;
            }
        }
        return (Nutrient) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nutrient g(NutritionLabel nutritionLabel) {
        Object next;
        Iterator<T> it = nutritionLabel.header.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Nutrient) next).getName(), "Calories")) {
                break;
            }
        }
        return (Nutrient) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nutrient h(NutritionLabel nutritionLabel) {
        Object next;
        Iterator<T> it = nutritionLabel.nutrients.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Nutrient) next).getName(), "Total Carbohydrate")) {
                break;
            }
        }
        return (Nutrient) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nutrient i(NutritionLabel nutritionLabel) {
        Object next;
        Iterator<T> it = nutritionLabel.nutrients.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Nutrient) next).getName(), "Total Fat")) {
                break;
            }
        }
        return (Nutrient) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nutrient y(NutritionLabel nutritionLabel) {
        Object next;
        Iterator<T> it = nutritionLabel.nutrients.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((Nutrient) next).getName(), "Protein")) {
                break;
            }
        }
        return (Nutrient) next;
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.nutrients.hashCode()) * 31) + this.vitamins.hashCode()) * 31) + this.minerals.hashCode()) * 31) + this.micronutrients.hashCode();
    }

    public final Nutrient j() {
        return (Nutrient) this.calories.getValue();
    }

    public final Nutrient k() {
        return (Nutrient) this.caloriesFromFat.getValue();
    }

    public final Nutrient n() {
        return (Nutrient) this.carbohydrates.getValue();
    }

    public final Nutrient o() {
        return (Nutrient) this.fat.getValue();
    }

    /* renamed from: q, reason: from getter */
    public final NutritionLabelHeader getHeader() {
        return this.header;
    }

    public final List<Nutrient> r() {
        return this.micronutrients;
    }

    public final List<Nutrient> s() {
        return this.minerals;
    }

    public final List<Nutrient> t() {
        return this.nutrients;
    }

    public String toString() {
        return "NutritionLabel(header=" + this.header + ", nutrients=" + this.nutrients + ", vitamins=" + this.vitamins + ", minerals=" + this.minerals + ", micronutrients=" + this.micronutrients + ')';
    }

    public final Nutrient v() {
        return (Nutrient) this.protein.getValue();
    }

    public final List<Nutrient> w() {
        return this.vitamins;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public /* synthetic */ NutritionLabel(NutritionLabelHeader hVar, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new NutritionLabelHeader(null, null, null, null, 15, null) : hVar, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? CollectionsKt.m() : list3, (i10 & 16) != 0 ? CollectionsKt.m() : list4);
    }
}
