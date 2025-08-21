package Eh;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, d2 = {"LEh/o;", "", "LEh/p;", "preferenceKey", "", "isEnabled", "", "name", "description", "<init>", "(LEh/p;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/p;", "c", "()LEh/p;", "b", "Z", "d", "()Z", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.o, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Preference {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p preferenceKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    public Preference(p preferenceKey, boolean z10, String str, String str2) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        this.preferenceKey = preferenceKey;
        this.isEnabled = z10;
        this.name = str;
        this.description = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) other;
        return this.preferenceKey == preference.preferenceKey && this.isEnabled == preference.isEnabled && Intrinsics.e(this.name, preference.name) && Intrinsics.e(this.description, preference.description);
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final p getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.preferenceKey.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Preference(preferenceKey=" + this.preferenceKey + ", isEnabled=" + this.isEnabled + ", name=" + this.name + ", description=" + this.description + ')';
    }

    public /* synthetic */ Preference(p pVar, boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, z10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
