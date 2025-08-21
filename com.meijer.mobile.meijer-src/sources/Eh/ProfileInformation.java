package Eh;

import Cs.MeijerAccount;
import Fh.DiscretePreferenceChoice;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"LEh/v;", "", "LCs/a;", "meijerAccount", "", "storeId", "", "storeName", "", "LEh/k;", "customerPreferenceList", "LEh/J;", "vehicleInformation", "LFh/b;", "discretePreferenceChoicesList", "<init>", "(LCs/a;ILjava/lang/String;Ljava/util/List;LEh/J;Ljava/util/List;)V", "a", "(LCs/a;ILjava/lang/String;Ljava/util/List;LEh/J;Ljava/util/List;)LEh/v;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCs/a;", "e", "()LCs/a;", "b", "I", "f", "c", "Ljava/lang/String;", "g", "d", "Ljava/util/List;", "()Ljava/util/List;", "LEh/J;", "h", "()LEh/J;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.v, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ProfileInformation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeijerAccount meijerAccount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CustomerPreference> customerPreferenceList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleInformation vehicleInformation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DiscretePreferenceChoice> discretePreferenceChoicesList;

    public ProfileInformation() {
        this(null, 0, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInformation)) {
            return false;
        }
        ProfileInformation profileInformation = (ProfileInformation) other;
        return Intrinsics.e(this.meijerAccount, profileInformation.meijerAccount) && this.storeId == profileInformation.storeId && Intrinsics.e(this.storeName, profileInformation.storeName) && Intrinsics.e(this.customerPreferenceList, profileInformation.customerPreferenceList) && Intrinsics.e(this.vehicleInformation, profileInformation.vehicleInformation) && Intrinsics.e(this.discretePreferenceChoicesList, profileInformation.discretePreferenceChoicesList);
    }

    public ProfileInformation(MeijerAccount meijerAccount, int i10, String str, List<CustomerPreference> customerPreferenceList, VehicleInformation vehicleInformation, List<DiscretePreferenceChoice> discretePreferenceChoicesList) {
        Intrinsics.j(customerPreferenceList, "customerPreferenceList");
        Intrinsics.j(discretePreferenceChoicesList, "discretePreferenceChoicesList");
        this.meijerAccount = meijerAccount;
        this.storeId = i10;
        this.storeName = str;
        this.customerPreferenceList = customerPreferenceList;
        this.vehicleInformation = vehicleInformation;
        this.discretePreferenceChoicesList = discretePreferenceChoicesList;
    }

    public static /* synthetic */ ProfileInformation b(ProfileInformation profileInformation, MeijerAccount meijerAccount, int i10, String str, List list, VehicleInformation vehicleInformation, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            meijerAccount = profileInformation.meijerAccount;
        }
        if ((i11 & 2) != 0) {
            i10 = profileInformation.storeId;
        }
        if ((i11 & 4) != 0) {
            str = profileInformation.storeName;
        }
        if ((i11 & 8) != 0) {
            list = profileInformation.customerPreferenceList;
        }
        if ((i11 & 16) != 0) {
            vehicleInformation = profileInformation.vehicleInformation;
        }
        if ((i11 & 32) != 0) {
            list2 = profileInformation.discretePreferenceChoicesList;
        }
        VehicleInformation vehicleInformation2 = vehicleInformation;
        List list3 = list2;
        return profileInformation.a(meijerAccount, i10, str, list, vehicleInformation2, list3);
    }

    public final ProfileInformation a(MeijerAccount meijerAccount, int storeId, String storeName, List<CustomerPreference> customerPreferenceList, VehicleInformation vehicleInformation, List<DiscretePreferenceChoice> discretePreferenceChoicesList) {
        Intrinsics.j(customerPreferenceList, "customerPreferenceList");
        Intrinsics.j(discretePreferenceChoicesList, "discretePreferenceChoicesList");
        return new ProfileInformation(meijerAccount, storeId, storeName, customerPreferenceList, vehicleInformation, discretePreferenceChoicesList);
    }

    public final List<CustomerPreference> c() {
        return this.customerPreferenceList;
    }

    public final List<DiscretePreferenceChoice> d() {
        return this.discretePreferenceChoicesList;
    }

    /* renamed from: e, reason: from getter */
    public final MeijerAccount getMeijerAccount() {
        return this.meijerAccount;
    }

    /* renamed from: f, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: g, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: h, reason: from getter */
    public final VehicleInformation getVehicleInformation() {
        return this.vehicleInformation;
    }

    public int hashCode() {
        MeijerAccount meijerAccount = this.meijerAccount;
        int iHashCode = (((meijerAccount == null ? 0 : meijerAccount.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str = this.storeName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.customerPreferenceList.hashCode()) * 31;
        VehicleInformation vehicleInformation = this.vehicleInformation;
        return ((iHashCode2 + (vehicleInformation != null ? vehicleInformation.hashCode() : 0)) * 31) + this.discretePreferenceChoicesList.hashCode();
    }

    public String toString() {
        return "ProfileInformation(meijerAccount=" + this.meijerAccount + ", storeId=" + this.storeId + ", storeName=" + this.storeName + ", customerPreferenceList=" + this.customerPreferenceList + ", vehicleInformation=" + this.vehicleInformation + ", discretePreferenceChoicesList=" + this.discretePreferenceChoicesList + ')';
    }

    public /* synthetic */ ProfileInformation(MeijerAccount meijerAccount, int i10, String str, List list, VehicleInformation vehicleInformation, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : meijerAccount, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? CollectionsKt.m() : list, (i11 & 16) != 0 ? null : vehicleInformation, (i11 & 32) != 0 ? CollectionsKt.m() : list2);
    }
}
