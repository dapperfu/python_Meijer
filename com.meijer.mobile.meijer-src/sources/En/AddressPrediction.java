package En;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LEn/A;", "", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "", "placeId", "primaryText", "secondaryText", "<init>", "(Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "d", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "b", "Ljava/lang/String;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: En.A, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class AddressPrediction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AutocompleteSessionToken sessionToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String primaryText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondaryText;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressPrediction)) {
            return false;
        }
        AddressPrediction addressPrediction = (AddressPrediction) other;
        return Intrinsics.e(this.sessionToken, addressPrediction.sessionToken) && Intrinsics.e(this.placeId, addressPrediction.placeId) && Intrinsics.e(this.primaryText, addressPrediction.primaryText) && Intrinsics.e(this.secondaryText, addressPrediction.secondaryText);
    }

    public AddressPrediction(AutocompleteSessionToken sessionToken, String placeId, String primaryText, String secondaryText) {
        Intrinsics.j(sessionToken, "sessionToken");
        Intrinsics.j(placeId, "placeId");
        Intrinsics.j(primaryText, "primaryText");
        Intrinsics.j(secondaryText, "secondaryText");
        this.sessionToken = sessionToken;
        this.placeId = placeId;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
    }

    /* renamed from: a, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: c, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: d, reason: from getter */
    public final AutocompleteSessionToken getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        return (((((this.sessionToken.hashCode() * 31) + this.placeId.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
    }

    public String toString() {
        return "AddressPrediction(sessionToken=" + this.sessionToken + ", placeId=" + this.placeId + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ')';
    }
}
