package Eh;

import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001\u0017B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\"R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u0014\u0010-\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f¨\u0006/"}, d2 = {"LEh/y;", "LCs/c;", "", "enrolledForMobileNotifications", "enrolledForEmailReceipts", "", "firstEnrolledInDigitalReceipts", "grocerySubstitutionChoice", "hasEnrolledInMeijerNews", "hasEnrolledInTextAlerts", "userPhoneIsTextable", "hasEnrolledInRewardsEmail", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "f", "(Z)V", "b", "c", "e", "Ljava/lang/String;", "d", "g", "(Ljava/lang/String;)V", "getGrocerySubstitutionChoice", "h", "getHasEnrolledInMeijerNews", "setHasEnrolledInMeijerNews", "getHasEnrolledInTextAlerts", "setHasEnrolledInTextAlerts", "getUserPhoneIsTextable", "setUserPhoneIsTextable", "getHasEnrolledInRewardsEmail", "setHasEnrolledInRewardsEmail", "firstEnrollInDigitalReceipts", "i", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.y, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class SettingsPreferences implements Cs.c {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean enrolledForMobileNotifications;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean enrolledForEmailReceipts;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstEnrolledInDigitalReceipts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String grocerySubstitutionChoice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasEnrolledInMeijerNews;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasEnrolledInTextAlerts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean userPhoneIsTextable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasEnrolledInRewardsEmail;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LEh/y$a;", "", "<init>", "()V", "", "LEh/k;", "preferenceList", "LEh/y;", "a", "(Ljava/util/List;)LEh/y;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Eh.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SettingsPreferences a(List<CustomerPreference> preferenceList) {
            Intrinsics.j(preferenceList, "preferenceList");
            SettingsPreferences settingsPreferences = new SettingsPreferences(false, false, null, null, false, false, false, false, l3.f93323c, null);
            for (CustomerPreference customerPreference : preferenceList) {
                String preferenceTypeName = customerPreference.getPreferenceTypeName();
                if (Intrinsics.e(preferenceTypeName, r.f7593c.getPreferenceTypeName())) {
                    settingsPreferences.e(Boolean.parseBoolean(customerPreference.getPreferenceValue()));
                } else if (Intrinsics.e(preferenceTypeName, r.f7596f.getPreferenceTypeName())) {
                    settingsPreferences.f(Boolean.parseBoolean(customerPreference.getPreferenceValue()));
                } else if (Intrinsics.e(preferenceTypeName, r.f7594d.getPreferenceTypeName())) {
                    settingsPreferences.g(customerPreference.getPreferenceValue());
                } else if (Intrinsics.e(preferenceTypeName, r.f7595e.getPreferenceTypeName())) {
                    settingsPreferences.h(customerPreference.getPreferenceValue());
                }
            }
            String firstEnrolledInDigitalReceipts = settingsPreferences.getFirstEnrolledInDigitalReceipts();
            if (firstEnrolledInDigitalReceipts == null) {
                firstEnrolledInDigitalReceipts = "";
            }
            settingsPreferences.g(firstEnrolledInDigitalReceipts);
            return settingsPreferences;
        }
    }

    public SettingsPreferences() {
        this(false, false, null, null, false, false, false, false, l3.f93323c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsPreferences)) {
            return false;
        }
        SettingsPreferences settingsPreferences = (SettingsPreferences) other;
        return this.enrolledForMobileNotifications == settingsPreferences.enrolledForMobileNotifications && this.enrolledForEmailReceipts == settingsPreferences.enrolledForEmailReceipts && Intrinsics.e(this.firstEnrolledInDigitalReceipts, settingsPreferences.firstEnrolledInDigitalReceipts) && Intrinsics.e(this.grocerySubstitutionChoice, settingsPreferences.grocerySubstitutionChoice) && this.hasEnrolledInMeijerNews == settingsPreferences.hasEnrolledInMeijerNews && this.hasEnrolledInTextAlerts == settingsPreferences.hasEnrolledInTextAlerts && this.userPhoneIsTextable == settingsPreferences.userPhoneIsTextable && this.hasEnrolledInRewardsEmail == settingsPreferences.hasEnrolledInRewardsEmail;
    }

    public SettingsPreferences(boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.enrolledForMobileNotifications = z10;
        this.enrolledForEmailReceipts = z11;
        this.firstEnrolledInDigitalReceipts = str;
        this.grocerySubstitutionChoice = str2;
        this.hasEnrolledInMeijerNews = z12;
        this.hasEnrolledInTextAlerts = z13;
        this.userPhoneIsTextable = z14;
        this.hasEnrolledInRewardsEmail = z15;
    }

    @Override // Cs.c
    /* renamed from: a, reason: from getter */
    public boolean getEnrolledForMobileNotifications() {
        return this.enrolledForMobileNotifications;
    }

    @Override // Cs.c
    public String b() {
        String str = this.firstEnrolledInDigitalReceipts;
        return str == null ? "" : str;
    }

    @Override // Cs.c
    /* renamed from: c, reason: from getter */
    public boolean getEnrolledForEmailReceipts() {
        return this.enrolledForEmailReceipts;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstEnrolledInDigitalReceipts() {
        return this.firstEnrolledInDigitalReceipts;
    }

    public void e(boolean z10) {
        this.enrolledForEmailReceipts = z10;
    }

    public void f(boolean z10) {
        this.enrolledForMobileNotifications = z10;
    }

    public final void g(String str) {
        this.firstEnrolledInDigitalReceipts = str;
    }

    public final void h(String str) {
        this.grocerySubstitutionChoice = str;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.enrolledForMobileNotifications) * 31) + Boolean.hashCode(this.enrolledForEmailReceipts)) * 31;
        String str = this.firstEnrolledInDigitalReceipts;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.grocerySubstitutionChoice;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasEnrolledInMeijerNews)) * 31) + Boolean.hashCode(this.hasEnrolledInTextAlerts)) * 31) + Boolean.hashCode(this.userPhoneIsTextable)) * 31) + Boolean.hashCode(this.hasEnrolledInRewardsEmail);
    }

    public String toString() {
        return "SettingsPreferences(enrolledForMobileNotifications=" + this.enrolledForMobileNotifications + ", enrolledForEmailReceipts=" + this.enrolledForEmailReceipts + ", firstEnrolledInDigitalReceipts=" + this.firstEnrolledInDigitalReceipts + ", grocerySubstitutionChoice=" + this.grocerySubstitutionChoice + ", hasEnrolledInMeijerNews=" + this.hasEnrolledInMeijerNews + ", hasEnrolledInTextAlerts=" + this.hasEnrolledInTextAlerts + ", userPhoneIsTextable=" + this.userPhoneIsTextable + ", hasEnrolledInRewardsEmail=" + this.hasEnrolledInRewardsEmail + ')';
    }

    public /* synthetic */ SettingsPreferences(boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, boolean z14, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13, (i10 & 64) != 0 ? false : z14, (i10 & 128) != 0 ? false : z15);
    }
}
