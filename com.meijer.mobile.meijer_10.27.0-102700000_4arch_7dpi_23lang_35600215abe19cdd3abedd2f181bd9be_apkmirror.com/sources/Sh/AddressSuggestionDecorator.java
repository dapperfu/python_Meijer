package Sh;

import ak.AbstractC5607a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uh.EnumC17262d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"LSh/c;", "", "Lak/a;", "title", "", "", "", PlaceTypes.ADDRESS, "isSelected", "Luh/d;", "addressValidationType", "<init>", "(Lak/a;Ljava/util/Map;ZLuh/d;)V", "a", "(Lak/a;Ljava/util/Map;ZLuh/d;)LSh/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "e", "()Lak/a;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Z", "f", "()Z", "d", "Luh/d;", "()Luh/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sh.c, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class AddressSuggestionDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Boolean> address;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17262d addressValidationType;

    public AddressSuggestionDecorator(AbstractC5607a title, Map<String, Boolean> address, boolean z10, EnumC17262d addressValidationType) {
        Intrinsics.j(title, "title");
        Intrinsics.j(address, "address");
        Intrinsics.j(addressValidationType, "addressValidationType");
        this.title = title;
        this.address = address;
        this.isSelected = z10;
        this.addressValidationType = addressValidationType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSuggestionDecorator)) {
            return false;
        }
        AddressSuggestionDecorator addressSuggestionDecorator = (AddressSuggestionDecorator) other;
        return Intrinsics.e(this.title, addressSuggestionDecorator.title) && Intrinsics.e(this.address, addressSuggestionDecorator.address) && this.isSelected == addressSuggestionDecorator.isSelected && this.addressValidationType == addressSuggestionDecorator.addressValidationType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSuggestionDecorator b(AddressSuggestionDecorator addressSuggestionDecorator, AbstractC5607a abstractC5607a, Map map, boolean z10, EnumC17262d enumC17262d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5607a = addressSuggestionDecorator.title;
        }
        if ((i10 & 2) != 0) {
            map = addressSuggestionDecorator.address;
        }
        if ((i10 & 4) != 0) {
            z10 = addressSuggestionDecorator.isSelected;
        }
        if ((i10 & 8) != 0) {
            enumC17262d = addressSuggestionDecorator.addressValidationType;
        }
        return addressSuggestionDecorator.a(abstractC5607a, map, z10, enumC17262d);
    }

    public final AddressSuggestionDecorator a(AbstractC5607a title, Map<String, Boolean> address, boolean isSelected, EnumC17262d addressValidationType) {
        Intrinsics.j(title, "title");
        Intrinsics.j(address, "address");
        Intrinsics.j(addressValidationType, "addressValidationType");
        return new AddressSuggestionDecorator(title, address, isSelected, addressValidationType);
    }

    public final Map<String, Boolean> c() {
        return this.address;
    }

    /* renamed from: d, reason: from getter */
    public final EnumC17262d getAddressValidationType() {
        return this.addressValidationType;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.addressValidationType.hashCode();
    }

    public String toString() {
        return "AddressSuggestionDecorator(title=" + this.title + ", address=" + this.address + ", isSelected=" + this.isSelected + ", addressValidationType=" + this.addressValidationType + ')';
    }

    public /* synthetic */ AddressSuggestionDecorator(AbstractC5607a abstractC5607a, Map map, boolean z10, EnumC17262d enumC17262d, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, map, z10, (i10 & 8) != 0 ? EnumC17262d.f162971b : enumC17262d);
    }
}
