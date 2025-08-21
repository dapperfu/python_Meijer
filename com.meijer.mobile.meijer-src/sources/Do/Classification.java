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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LDo/a;", "Landroid/os/Parcelable;", "", "code", "", "LDo/b;", "features", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Do.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class Classification implements Parcelable {
    public static final Parcelable.Creator<Classification> CREATOR = new C0121a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClassificationFeature> features;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Do.a$a, reason: collision with other inner class name */
    public static final class C0121a implements Parcelable.Creator<Classification> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Classification createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(ClassificationFeature.CREATOR.createFromParcel(parcel));
            }
            return new Classification(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Classification[] newArray(int i10) {
            return new Classification[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Classification() {
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
        if (!(other instanceof Classification)) {
            return false;
        }
        Classification classification = (Classification) other;
        return Intrinsics.e(this.code, classification.code) && Intrinsics.e(this.features, classification.features);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.code);
        List<ClassificationFeature> list = this.features;
        dest.writeInt(list.size());
        Iterator<ClassificationFeature> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public Classification(String code, List<ClassificationFeature> features) {
        Intrinsics.j(code, "code");
        Intrinsics.j(features, "features");
        this.code = code;
        this.features = features;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.features.hashCode();
    }

    public String toString() {
        return "Classification(code=" + this.code + ", features=" + this.features + ')';
    }

    public /* synthetic */ Classification(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
