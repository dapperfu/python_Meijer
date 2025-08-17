package Xh;

import Hk.Validation;
import Zh.e;
import ak.AbstractC5607a;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R$\u00107\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001060\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010-¨\u00068"}, d2 = {"LXh/e;", "", "LZh/e;", "", "vehicleId", "LZh/e$a;", "grocerySubstitution", "LZh/e$b;", "vehicleDescription", "", "", "substitutions", "Lak/a;", "updateErrorMessage", "loadingErrorMessage", "", "isLoading", "<init>", "(ILZh/e$a;LZh/e$b;Ljava/util/List;Lak/a;Lak/a;Z)V", "field", "n", "(LZh/e;)LXh/e;", "e", "(ILZh/e$a;LZh/e$b;Ljava/util/List;Lak/a;Lak/a;Z)LXh/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "l", "b", "LZh/e$a;", "g", "()LZh/e$a;", "c", "LZh/e$b;", "k", "()LZh/e$b;", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "Lak/a;", "j", "()Lak/a;", "f", "h", "Z", "m", "()Z", "LHk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xh.e, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class OrderPreferencesDecorator implements Hk.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vehicleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e.GrocerySubstitution grocerySubstitution;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e.VehicleDescription vehicleDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> substitutions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a updateErrorMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a loadingErrorMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    public OrderPreferencesDecorator() {
        this(0, null, null, null, null, null, false, l3.f92485d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPreferencesDecorator)) {
            return false;
        }
        OrderPreferencesDecorator orderPreferencesDecorator = (OrderPreferencesDecorator) other;
        return this.vehicleId == orderPreferencesDecorator.vehicleId && Intrinsics.e(this.grocerySubstitution, orderPreferencesDecorator.grocerySubstitution) && Intrinsics.e(this.vehicleDescription, orderPreferencesDecorator.vehicleDescription) && Intrinsics.e(this.substitutions, orderPreferencesDecorator.substitutions) && Intrinsics.e(this.updateErrorMessage, orderPreferencesDecorator.updateErrorMessage) && Intrinsics.e(this.loadingErrorMessage, orderPreferencesDecorator.loadingErrorMessage) && this.isLoading == orderPreferencesDecorator.isLoading;
    }

    public OrderPreferencesDecorator(int i10, e.GrocerySubstitution grocerySubstitution, e.VehicleDescription vehicleDescription, List<String> substitutions, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10) {
        Intrinsics.j(grocerySubstitution, "grocerySubstitution");
        Intrinsics.j(vehicleDescription, "vehicleDescription");
        Intrinsics.j(substitutions, "substitutions");
        this.vehicleId = i10;
        this.grocerySubstitution = grocerySubstitution;
        this.vehicleDescription = vehicleDescription;
        this.substitutions = substitutions;
        this.updateErrorMessage = abstractC5607a;
        this.loadingErrorMessage = abstractC5607a2;
        this.isLoading = z10;
    }

    public static /* synthetic */ OrderPreferencesDecorator f(OrderPreferencesDecorator orderPreferencesDecorator, int i10, e.GrocerySubstitution grocerySubstitution, e.VehicleDescription vehicleDescription, List list, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = orderPreferencesDecorator.vehicleId;
        }
        if ((i11 & 2) != 0) {
            grocerySubstitution = orderPreferencesDecorator.grocerySubstitution;
        }
        if ((i11 & 4) != 0) {
            vehicleDescription = orderPreferencesDecorator.vehicleDescription;
        }
        if ((i11 & 8) != 0) {
            list = orderPreferencesDecorator.substitutions;
        }
        if ((i11 & 16) != 0) {
            abstractC5607a = orderPreferencesDecorator.updateErrorMessage;
        }
        if ((i11 & 32) != 0) {
            abstractC5607a2 = orderPreferencesDecorator.loadingErrorMessage;
        }
        if ((i11 & 64) != 0) {
            z10 = orderPreferencesDecorator.isLoading;
        }
        AbstractC5607a abstractC5607a3 = abstractC5607a2;
        boolean z11 = z10;
        AbstractC5607a abstractC5607a4 = abstractC5607a;
        e.VehicleDescription vehicleDescription2 = vehicleDescription;
        return orderPreferencesDecorator.e(i10, grocerySubstitution, vehicleDescription2, list, abstractC5607a4, abstractC5607a3, z11);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.grocerySubstitution.c(), this.vehicleDescription.c());
    }

    public final OrderPreferencesDecorator e(int vehicleId, e.GrocerySubstitution grocerySubstitution, e.VehicleDescription vehicleDescription, List<String> substitutions, AbstractC5607a updateErrorMessage, AbstractC5607a loadingErrorMessage, boolean isLoading) {
        Intrinsics.j(grocerySubstitution, "grocerySubstitution");
        Intrinsics.j(vehicleDescription, "vehicleDescription");
        Intrinsics.j(substitutions, "substitutions");
        return new OrderPreferencesDecorator(vehicleId, grocerySubstitution, vehicleDescription, substitutions, updateErrorMessage, loadingErrorMessage, isLoading);
    }

    /* renamed from: g, reason: from getter */
    public final e.GrocerySubstitution getGrocerySubstitution() {
        return this.grocerySubstitution;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC5607a getLoadingErrorMessage() {
        return this.loadingErrorMessage;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.vehicleId) * 31) + this.grocerySubstitution.hashCode()) * 31) + this.vehicleDescription.hashCode()) * 31) + this.substitutions.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.updateErrorMessage;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.loadingErrorMessage;
        return ((iHashCode2 + (abstractC5607a2 != null ? abstractC5607a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public final List<String> i() {
        return this.substitutions;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC5607a getUpdateErrorMessage() {
        return this.updateErrorMessage;
    }

    /* renamed from: k, reason: from getter */
    public final e.VehicleDescription getVehicleDescription() {
        return this.vehicleDescription;
    }

    /* renamed from: l, reason: from getter */
    public final int getVehicleId() {
        return this.vehicleId;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public OrderPreferencesDecorator n(Zh.e<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof e.GrocerySubstitution) {
            return f(this, 0, ((e.GrocerySubstitution) field).f(), null, null, null, null, false, 125, null);
        }
        if (field instanceof e.VehicleDescription) {
            return f(this, 0, null, ((e.VehicleDescription) field).f(), null, null, null, false, 123, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return "OrderPreferencesDecorator(vehicleId=" + this.vehicleId + ", grocerySubstitution=" + this.grocerySubstitution + ", vehicleDescription=" + this.vehicleDescription + ", substitutions=" + this.substitutions + ", updateErrorMessage=" + this.updateErrorMessage + ", loadingErrorMessage=" + this.loadingErrorMessage + ", isLoading=" + this.isLoading + ')';
    }

    public /* synthetic */ OrderPreferencesDecorator(int i10, e.GrocerySubstitution grocerySubstitution, e.VehicleDescription vehicleDescription, List list, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? new e.GrocerySubstitution(null, null, 0, 7, null) : grocerySubstitution, (i11 & 4) != 0 ? new e.VehicleDescription(null, null, 3, null) : vehicleDescription, (i11 & 8) != 0 ? CollectionsKt.m() : list, (i11 & 16) != 0 ? null : abstractC5607a, (i11 & 32) != 0 ? null : abstractC5607a2, (i11 & 64) != 0 ? false : z10);
    }
}
