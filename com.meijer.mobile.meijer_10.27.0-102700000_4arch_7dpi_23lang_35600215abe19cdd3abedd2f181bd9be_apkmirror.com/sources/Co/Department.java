package Co;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mk.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001aR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b \u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R\u001d\u00104\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b1\u0010!\u0012\u0004\b2\u00103\u001a\u0004\b%\u0010\u001aR\u0011\u00107\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b'\u00106¨\u00068"}, d2 = {"LCo/b;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/product/model/fulldetails/DepartmentCode;", "parentId", "type", PreferencesHelper.PREF_ID, "name", "url", "", "hide", "collectionId", "", "subcategories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "getType", "c", "getName", "e", "getUrl", "f", "Z", "getHide", "()Z", "g", "h", "Ljava/util/List;", "()Ljava/util/List;", "i", "getLevel$annotations", "()V", "level", "Lmk/l;", "()Lmk/l;", "productQueryIntent", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Co.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Department implements Parcelable {
    public static final Parcelable.Creator<Department> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hide;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collectionId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Department> subcategories;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String level;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.b$a */
    public static final class a implements Parcelable.Creator<Department> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Department createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Department.CREATOR.createFromParcel(parcel));
            }
            return new Department(string, string2, string3, string4, string5, z10, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Department[] newArray(int i10) {
            return new Department[i10];
        }
    }

    public Department(String str, String str2, String id2, String name, String str3, boolean z10, String collectionId, List<Department> subcategories) {
        String str4;
        List listA1;
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        Intrinsics.j(collectionId, "collectionId");
        Intrinsics.j(subcategories, "subcategories");
        this.parentId = str;
        this.type = str2;
        this.id = id2;
        this.name = name;
        this.url = str3;
        this.hide = z10;
        this.collectionId = collectionId;
        this.subcategories = subcategories;
        String str5 = StringsKt.W(id2, "L", false, 2, null) ? id2 : null;
        if (str5 == null || (listA1 = StringsKt.a1(str5, new String[]{"-"}, false, 0, 6, null)) == null || (str4 = (String) CollectionsKt.s0(listA1)) == null) {
            str4 = (Intrinsics.e(id2, "departments") ? id2 : null) != null ? "L0" : "";
        }
        this.level = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Department)) {
            return false;
        }
        Department department = (Department) other;
        return Intrinsics.e(this.parentId, department.parentId) && Intrinsics.e(this.type, department.type) && Intrinsics.e(this.id, department.id) && Intrinsics.e(this.name, department.name) && Intrinsics.e(this.url, department.url) && this.hide == department.hide && Intrinsics.e(this.collectionId, department.collectionId) && Intrinsics.e(this.subcategories, department.subcategories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.parentId);
        dest.writeString(this.type);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.url);
        dest.writeInt(this.hide ? 1 : 0);
        dest.writeString(this.collectionId);
        List<Department> list = this.subcategories;
        dest.writeInt(list.size());
        Iterator<Department> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* renamed from: d, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final mk.l e() {
        return StringsKt.r0(this.collectionId) ? new l.Department(this.id, this.name) : new l.BrowseCollection(this.collectionId, this.name);
    }

    public final List<Department> f() {
        return this.subcategories;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.parentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str3 = this.url;
        return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.hide)) * 31) + this.collectionId.hashCode()) * 31) + this.subcategories.hashCode();
    }

    public String toString() {
        return "Department(parentId=" + this.parentId + ", type=" + this.type + ", id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", hide=" + this.hide + ", collectionId=" + this.collectionId + ", subcategories=" + this.subcategories + ')';
    }

    public /* synthetic */ Department(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? "" : str3, str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? "" : str6, (i10 & 128) != 0 ? CollectionsKt.m() : list);
    }
}
