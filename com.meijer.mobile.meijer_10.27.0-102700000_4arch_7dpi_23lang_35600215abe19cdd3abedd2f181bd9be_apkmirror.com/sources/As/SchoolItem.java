package As;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"LAs/e;", "", "", PreferencesHelper.PREF_ID, "", "name", "street", "city", "state", "zip", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "e", "d", "f", "supplylists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: As.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SchoolItem {

    /* renamed from: g, reason: collision with root package name */
    public static final int f1528g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchoolItem)) {
            return false;
        }
        SchoolItem schoolItem = (SchoolItem) other;
        return this.id == schoolItem.id && Intrinsics.e(this.name, schoolItem.name) && Intrinsics.e(this.street, schoolItem.street) && Intrinsics.e(this.city, schoolItem.city) && Intrinsics.e(this.state, schoolItem.state) && Intrinsics.e(this.zip, schoolItem.zip);
    }

    public SchoolItem(int i10, String name, String street, String city, String state, String zip) {
        Intrinsics.j(name, "name");
        Intrinsics.j(street, "street");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        this.id = i10;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /* renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: e, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* renamed from: f, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.street.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode();
    }

    public String toString() {
        return "SchoolItem(id=" + this.id + ", name=" + this.name + ", street=" + this.street + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ')';
    }
}
