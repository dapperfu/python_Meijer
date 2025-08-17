package com.radiusnetworks.flybuy.sdk.data.pickup_config;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0083\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\u0002\u0010\u0018J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0099\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012HÆ\u0001J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006;"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "", "pickupConfig", "Lcom/radiusnetworks/flybuy/api/model/PickupConfig;", "(Lcom/radiusnetworks/flybuy/api/model/PickupConfig;)V", "type", "", PreferencesHelper.PREF_ID, "", "customerNameEditingEnabled", "", "pickupTypeSelectionEnabled", "askToAskImageUrl", "projectAccentColor", "projectAccentTextColor", "termsOfServiceUrl", "privacyPolicyUrl", "availablePickupTypes", "", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupTypeConfig;", "availableHandoffVehicleLocations", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/AvailableHandoffVehicleLocation;", "orderProgressStates", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/OrderProgressState;", "(Ljava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAskToAskImageUrl", "()Ljava/lang/String;", "getAvailableHandoffVehicleLocations", "()Ljava/util/List;", "getAvailablePickupTypes", "getCustomerNameEditingEnabled", "()Z", "getId", "()I", "getOrderProgressStates", "getPickupTypeSelectionEnabled", "getPrivacyPolicyUrl", "getProjectAccentColor", "getProjectAccentTextColor", "getTermsOfServiceUrl", "getType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PickupConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_ACCENT_COLOR = "#000000";
    public static final String DEFAULT_ACCENT_TEXT_COLOR = "#FFFFFF";
    private static final PickupConfig DEFAULT_PICKUP_CONFIG = new PickupConfig("pickup_config", 0, false, false, null, DEFAULT_ACCENT_COLOR, DEFAULT_ACCENT_TEXT_COLOR, null, null, CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), HttpResponseStatus.ERROR_BAD_REQUEST, null);

    @InterfaceC15617c("ask_to_ask_image_url")
    private final String askToAskImageUrl;

    @InterfaceC15617c("available_vehicle_handoff_locations")
    private final List<AvailableHandoffVehicleLocation> availableHandoffVehicleLocations;

    @InterfaceC15617c("available_pickup_types")
    private final List<PickupTypeConfig> availablePickupTypes;

    @InterfaceC15617c("customer_name_editing_enabled")
    private final boolean customerNameEditingEnabled;
    private final int id;

    @InterfaceC15617c("order_progress_states")
    private final List<OrderProgressState> orderProgressStates;

    @InterfaceC15617c("pickup_type_selection_enabled")
    private final boolean pickupTypeSelectionEnabled;

    @InterfaceC15617c("privacy_policy_url")
    private final String privacyPolicyUrl;

    @InterfaceC15617c("project_accent_color")
    private final String projectAccentColor;

    @InterfaceC15617c("project accent_text_color")
    private final String projectAccentTextColor;

    @InterfaceC15617c("terms_of_service_url")
    private final String termsOfServiceUrl;
    private final String type;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig$Companion;", "", "()V", "DEFAULT_ACCENT_COLOR", "", "DEFAULT_ACCENT_TEXT_COLOR", "DEFAULT_PICKUP_CONFIG", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "getDEFAULT_PICKUP_CONFIG", "()Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PickupConfig getDEFAULT_PICKUP_CONFIG() {
            return PickupConfig.DEFAULT_PICKUP_CONFIG;
        }
    }

    public PickupConfig(String type, int i10, boolean z10, boolean z11, String str, String projectAccentColor, String projectAccentTextColor, String str2, String str3, List<PickupTypeConfig> availablePickupTypes, List<AvailableHandoffVehicleLocation> availableHandoffVehicleLocations, List<OrderProgressState> orderProgressStates) {
        Intrinsics.j(type, "type");
        Intrinsics.j(projectAccentColor, "projectAccentColor");
        Intrinsics.j(projectAccentTextColor, "projectAccentTextColor");
        Intrinsics.j(availablePickupTypes, "availablePickupTypes");
        Intrinsics.j(availableHandoffVehicleLocations, "availableHandoffVehicleLocations");
        Intrinsics.j(orderProgressStates, "orderProgressStates");
        this.type = type;
        this.id = i10;
        this.customerNameEditingEnabled = z10;
        this.pickupTypeSelectionEnabled = z11;
        this.askToAskImageUrl = str;
        this.projectAccentColor = projectAccentColor;
        this.projectAccentTextColor = projectAccentTextColor;
        this.termsOfServiceUrl = str2;
        this.privacyPolicyUrl = str3;
        this.availablePickupTypes = availablePickupTypes;
        this.availableHandoffVehicleLocations = availableHandoffVehicleLocations;
        this.orderProgressStates = orderProgressStates;
    }

    public static /* synthetic */ PickupConfig copy$default(PickupConfig pickupConfig, String str, int i10, boolean z10, boolean z11, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickupConfig.type;
        }
        if ((i11 & 2) != 0) {
            i10 = pickupConfig.id;
        }
        if ((i11 & 4) != 0) {
            z10 = pickupConfig.customerNameEditingEnabled;
        }
        if ((i11 & 8) != 0) {
            z11 = pickupConfig.pickupTypeSelectionEnabled;
        }
        if ((i11 & 16) != 0) {
            str2 = pickupConfig.askToAskImageUrl;
        }
        if ((i11 & 32) != 0) {
            str3 = pickupConfig.projectAccentColor;
        }
        if ((i11 & 64) != 0) {
            str4 = pickupConfig.projectAccentTextColor;
        }
        if ((i11 & 128) != 0) {
            str5 = pickupConfig.termsOfServiceUrl;
        }
        if ((i11 & 256) != 0) {
            str6 = pickupConfig.privacyPolicyUrl;
        }
        if ((i11 & 512) != 0) {
            list = pickupConfig.availablePickupTypes;
        }
        if ((i11 & 1024) != 0) {
            list2 = pickupConfig.availableHandoffVehicleLocations;
        }
        if ((i11 & RecyclerView.m.FLAG_MOVED) != 0) {
            list3 = pickupConfig.orderProgressStates;
        }
        List list4 = list2;
        List list5 = list3;
        String str7 = str6;
        List list6 = list;
        String str8 = str4;
        String str9 = str5;
        String str10 = str2;
        String str11 = str3;
        return pickupConfig.copy(str, i10, z10, z11, str10, str11, str8, str9, str7, list6, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<PickupTypeConfig> component10() {
        return this.availablePickupTypes;
    }

    public final List<AvailableHandoffVehicleLocation> component11() {
        return this.availableHandoffVehicleLocations;
    }

    public final List<OrderProgressState> component12() {
        return this.orderProgressStates;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCustomerNameEditingEnabled() {
        return this.customerNameEditingEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPickupTypeSelectionEnabled() {
        return this.pickupTypeSelectionEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAskToAskImageUrl() {
        return this.askToAskImageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final PickupConfig copy(String type, int id2, boolean customerNameEditingEnabled, boolean pickupTypeSelectionEnabled, String askToAskImageUrl, String projectAccentColor, String projectAccentTextColor, String termsOfServiceUrl, String privacyPolicyUrl, List<PickupTypeConfig> availablePickupTypes, List<AvailableHandoffVehicleLocation> availableHandoffVehicleLocations, List<OrderProgressState> orderProgressStates) {
        Intrinsics.j(type, "type");
        Intrinsics.j(projectAccentColor, "projectAccentColor");
        Intrinsics.j(projectAccentTextColor, "projectAccentTextColor");
        Intrinsics.j(availablePickupTypes, "availablePickupTypes");
        Intrinsics.j(availableHandoffVehicleLocations, "availableHandoffVehicleLocations");
        Intrinsics.j(orderProgressStates, "orderProgressStates");
        return new PickupConfig(type, id2, customerNameEditingEnabled, pickupTypeSelectionEnabled, askToAskImageUrl, projectAccentColor, projectAccentTextColor, termsOfServiceUrl, privacyPolicyUrl, availablePickupTypes, availableHandoffVehicleLocations, orderProgressStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupConfig)) {
            return false;
        }
        PickupConfig pickupConfig = (PickupConfig) other;
        return Intrinsics.e(this.type, pickupConfig.type) && this.id == pickupConfig.id && this.customerNameEditingEnabled == pickupConfig.customerNameEditingEnabled && this.pickupTypeSelectionEnabled == pickupConfig.pickupTypeSelectionEnabled && Intrinsics.e(this.askToAskImageUrl, pickupConfig.askToAskImageUrl) && Intrinsics.e(this.projectAccentColor, pickupConfig.projectAccentColor) && Intrinsics.e(this.projectAccentTextColor, pickupConfig.projectAccentTextColor) && Intrinsics.e(this.termsOfServiceUrl, pickupConfig.termsOfServiceUrl) && Intrinsics.e(this.privacyPolicyUrl, pickupConfig.privacyPolicyUrl) && Intrinsics.e(this.availablePickupTypes, pickupConfig.availablePickupTypes) && Intrinsics.e(this.availableHandoffVehicleLocations, pickupConfig.availableHandoffVehicleLocations) && Intrinsics.e(this.orderProgressStates, pickupConfig.orderProgressStates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.id) + (this.type.hashCode() * 31)) * 31;
        boolean z10 = this.customerNameEditingEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.pickupTypeSelectionEnabled;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.askToAskImageUrl;
        int iHashCode2 = (this.projectAccentTextColor.hashCode() + ((this.projectAccentColor.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.termsOfServiceUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.privacyPolicyUrl;
        return this.orderProgressStates.hashCode() + ((this.availableHandoffVehicleLocations.hashCode() + ((this.availablePickupTypes.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PickupConfig(type=" + this.type + ", id=" + this.id + ", customerNameEditingEnabled=" + this.customerNameEditingEnabled + ", pickupTypeSelectionEnabled=" + this.pickupTypeSelectionEnabled + ", askToAskImageUrl=" + this.askToAskImageUrl + ", projectAccentColor=" + this.projectAccentColor + ", projectAccentTextColor=" + this.projectAccentTextColor + ", termsOfServiceUrl=" + this.termsOfServiceUrl + ", privacyPolicyUrl=" + this.privacyPolicyUrl + ", availablePickupTypes=" + this.availablePickupTypes + ", availableHandoffVehicleLocations=" + this.availableHandoffVehicleLocations + ", orderProgressStates=" + this.orderProgressStates + ')';
    }

    public final String getAskToAskImageUrl() {
        return this.askToAskImageUrl;
    }

    public final List<AvailableHandoffVehicleLocation> getAvailableHandoffVehicleLocations() {
        return this.availableHandoffVehicleLocations;
    }

    public final List<PickupTypeConfig> getAvailablePickupTypes() {
        return this.availablePickupTypes;
    }

    public final boolean getCustomerNameEditingEnabled() {
        return this.customerNameEditingEnabled;
    }

    public final int getId() {
        return this.id;
    }

    public final List<OrderProgressState> getOrderProgressStates() {
        return this.orderProgressStates;
    }

    public final boolean getPickupTypeSelectionEnabled() {
        return this.pickupTypeSelectionEnabled;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    public final String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PickupConfig(String str, int i10, boolean z10, boolean z11, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        List list4;
        List list5;
        List list6;
        String str7;
        str2 = (i11 & 16) != 0 ? null : str2;
        str5 = (i11 & 128) != 0 ? null : str5;
        if ((i11 & 256) != 0) {
            list4 = list3;
            list5 = list2;
            list6 = list;
            str7 = null;
        } else {
            list4 = list3;
            list5 = list2;
            list6 = list;
            str7 = str6;
        }
        this(str, i10, z10, z11, str2, str3, str4, str5, str7, list6, list5, list4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PickupConfig(com.radiusnetworks.flybuy.api.model.PickupConfig pickupConfig) {
        Intrinsics.j(pickupConfig, "pickupConfig");
        String type = pickupConfig.getType();
        int id2 = pickupConfig.getId();
        boolean customerNameEditingEnabled = pickupConfig.getCustomerNameEditingEnabled();
        List<com.radiusnetworks.flybuy.api.model.PickupTypeConfig> availablePickupTypes = pickupConfig.getAvailablePickupTypes();
        boolean pickupTypeSelectionEnabled = (availablePickupTypes == null || availablePickupTypes.isEmpty()) ? false : pickupConfig.getPickupTypeSelectionEnabled();
        String askToAskImageUrl = pickupConfig.getAskToAskImageUrl();
        String projectAccentColor = pickupConfig.getProjectAccentColor();
        String str = projectAccentColor == null ? DEFAULT_ACCENT_COLOR : projectAccentColor;
        String projectAccentTextColor = pickupConfig.getProjectAccentTextColor();
        this(type, id2, customerNameEditingEnabled, pickupTypeSelectionEnabled, askToAskImageUrl, str, projectAccentTextColor == null ? DEFAULT_ACCENT_TEXT_COLOR : projectAccentTextColor, pickupConfig.getTermsOfServiceUrl(), pickupConfig.getPrivacyPolicyUrl(), PickupTypeConfigKt.toPickupTypeConfigs(pickupConfig.getAvailablePickupTypes()), AvailableHandoffVehicleLocationKt.toAvailableHandoffVehicleLocations(pickupConfig.getAvailableHandoffVehicleLocations()), OrderProgressStateKt.toOrderStatusOrderStates(pickupConfig.getOrderProgressStates()));
    }
}
