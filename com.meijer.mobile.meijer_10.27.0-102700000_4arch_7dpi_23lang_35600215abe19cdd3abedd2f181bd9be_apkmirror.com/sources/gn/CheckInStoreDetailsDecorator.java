package gn;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.StoreDetails;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgn/a;", "", "Lak/a;", "storeAddress", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckInStoreDetailsDecorator {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f133822c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a storeAddress;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgn/a$a;", "", "<init>", "()V", "Lok/h;", "storeDetails", "Lgn/a;", "a", "(Lok/h;)Lgn/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CheckInStoreDetailsDecorator a(StoreDetails storeDetails) {
            Intrinsics.j(storeDetails, "storeDetails");
            return new CheckInStoreDetailsDecorator(AbstractC5607a.INSTANCE.d(Y.f99508Cf, String.valueOf(storeDetails.getName()), String.valueOf(storeDetails.getStreetAddress())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckInStoreDetailsDecorator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckInStoreDetailsDecorator) && Intrinsics.e(this.storeAddress, ((CheckInStoreDetailsDecorator) other).storeAddress);
    }

    public CheckInStoreDetailsDecorator(AbstractC5607a abstractC5607a) {
        this.storeAddress = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getStoreAddress() {
        return this.storeAddress;
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.storeAddress;
        if (abstractC5607a == null) {
            return 0;
        }
        return abstractC5607a.hashCode();
    }

    public String toString() {
        return "CheckInStoreDetailsDecorator(storeAddress=" + this.storeAddress + ')';
    }

    public /* synthetic */ CheckInStoreDetailsDecorator(AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a);
    }
}
