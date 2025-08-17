package Do;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#¨\u0006,"}, d2 = {"LDo/b;", "Landroid/os/Parcelable;", "", "code", "", "comparable", "", "LDo/c;", "featureValues", "name", "range", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Z", "getComparable", "()Z", "c", "Ljava/util/List;", "getFeatureValues", "()Ljava/util/List;", "d", "getName", "e", "getRange", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Do.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ClassificationFeature implements Parcelable {
    public static final Parcelable.Creator<ClassificationFeature> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean comparable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClassificationFeatureValue> featureValues;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean range;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Do.b$a */
    public static final class a implements Parcelable.Creator<ClassificationFeature> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassificationFeature createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(ClassificationFeatureValue.CREATOR.createFromParcel(parcel));
            }
            return new ClassificationFeature(string, z11, arrayList, parcel.readString(), parcel.readInt() != 0 ? z10 : false);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClassificationFeature[] newArray(int i10) {
            return new ClassificationFeature[i10];
        }
    }

    public ClassificationFeature() {
        this(null, false, null, null, false, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassificationFeature)) {
            return false;
        }
        ClassificationFeature classificationFeature = (ClassificationFeature) other;
        return Intrinsics.e(this.code, classificationFeature.code) && this.comparable == classificationFeature.comparable && Intrinsics.e(this.featureValues, classificationFeature.featureValues) && Intrinsics.e(this.name, classificationFeature.name) && this.range == classificationFeature.range;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.code);
        dest.writeInt(this.comparable ? 1 : 0);
        List<ClassificationFeatureValue> list = this.featureValues;
        dest.writeInt(list.size());
        Iterator<ClassificationFeatureValue> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.name);
        dest.writeInt(this.range ? 1 : 0);
    }

    public ClassificationFeature(String code, boolean z10, List<ClassificationFeatureValue> featureValues, String name, boolean z11) {
        Intrinsics.j(code, "code");
        Intrinsics.j(featureValues, "featureValues");
        Intrinsics.j(name, "name");
        this.code = code;
        this.comparable = z10;
        this.featureValues = featureValues;
        this.name = name;
        this.range = z11;
    }

    public int hashCode() {
        return (((((((this.code.hashCode() * 31) + Boolean.hashCode(this.comparable)) * 31) + this.featureValues.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.range);
    }

    public String toString() {
        return "ClassificationFeature(code=" + this.code + ", comparable=" + this.comparable + ", featureValues=" + this.featureValues + ", name=" + this.name + ", range=" + this.range + ')';
    }

    public /* synthetic */ ClassificationFeature(String str, boolean z10, List list, String str2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? false : z11);
    }
}
