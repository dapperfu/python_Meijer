package Yk;

import Fq.ShoppingListItem;
import Pk.Coupon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wl.CartEntry;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b$\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b(\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b.\u00106R\u001d\u0010=\u001a\u0002078\u0006¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b2\u0010:R\u0018\u0010B\u001a\u00060>j\u0002`?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"LYk/c;", "Landroid/os/Parcelable;", "LPk/c;", "LPk/a;", "coupon", "LTq/h;", PlaceTypes.STORE, "LYk/b;", "associatedProductsState", "LFq/c;", "shoppingListItem", "", "Lwl/a;", "cartEntries", "LQk/b;", "couponActionLoadingState", "<init>", "(LPk/a;LTq/h;LYk/b;LFq/c;Ljava/util/List;LQk/b;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "c", "()LPk/a;", "b", "LTq/h;", "getStore", "()LTq/h;", "LYk/b;", "()LYk/b;", "d", "LFq/c;", "f", "()LFq/c;", "e", "Ljava/util/List;", "()Ljava/util/List;", "LQk/b;", "()LQk/b;", "LYk/c$b;", "g", "LYk/c$b;", "()LYk/c$b;", "getProgress$annotations", "()V", "progress", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "Y0", "()J", "offerId", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Yk.c, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CouponState implements Parcelable, Pk.c {
    public static final Parcelable.Creator<CouponState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coupon coupon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Tq.h store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AssociatedProductsState associatedProductsState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingListItem shoppingListItem;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CartEntry> cartEntries;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Qk.b couponActionLoadingState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b progress;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yk.c$a */
    public static final class a implements Parcelable.Creator<CouponState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponState createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            Coupon coupon = (Coupon) parcel.readParcelable(CouponState.class.getClassLoader());
            Tq.h hVar = (Tq.h) parcel.readParcelable(CouponState.class.getClassLoader());
            AssociatedProductsState associatedProductsStateCreateFromParcel = AssociatedProductsState.CREATOR.createFromParcel(parcel);
            ShoppingListItem shoppingListItem = (ShoppingListItem) parcel.readParcelable(CouponState.class.getClassLoader());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(CouponState.class.getClassLoader()));
            }
            return new CouponState(coupon, hVar, associatedProductsStateCreateFromParcel, shoppingListItem, arrayList, Qk.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponState[] newArray(int i10) {
            return new CouponState[i10];
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LYk/c$b;", "", "<init>", "()V", "", "d", "()Z", "isEarned", "b", "c", "a", "LYk/c$b$a;", "LYk/c$b$c;", "LYk/c$b$d;", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yk.c$b */
    public static abstract class b {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019*\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LYk/c$b$a;", "LYk/c$b;", "LYk/c$b$b;", "", "acquired", "required", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "d", "()Z", "isEarned$delegate", "(LYk/c$b$a;)Ljava/lang/Object;", "isEarned", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yk.c$b$a, reason: from toString */
        public static final /* data */ class Buy extends b implements InterfaceC0911b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double acquired;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double required;

            public Buy(double d10, double d11) {
                super(null);
                this.acquired = d10;
                this.required = d11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Buy)) {
                    return false;
                }
                Buy buy = (Buy) other;
                return Double.compare(this.acquired, buy.acquired) == 0 && Double.compare(this.required, buy.required) == 0;
            }

            @Override // Yk.CouponState.b.InterfaceC0911b
            /* renamed from: a, reason: from getter */
            public double getRequired() {
                return this.required;
            }

            @Override // Yk.CouponState.b.InterfaceC0911b
            /* renamed from: c, reason: from getter */
            public double getAcquired() {
                return this.acquired;
            }

            public int hashCode() {
                return (Double.hashCode(this.acquired) * 31) + Double.hashCode(this.required);
            }

            public String toString() {
                return "Buy(acquired=" + this.acquired + ", required=" + this.required + ')';
            }

            @Override // Yk.CouponState.b
            public boolean d() {
                return b();
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LYk/c$b$c;", "LYk/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "d", "()Z", "isEarned", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yk.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C0912c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0912c f43140a = new C0912c();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final boolean isEarned = true;

            private C0912c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0912c);
            }

            @Override // Yk.CouponState.b
            public boolean d() {
                return isEarned;
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return -1513735849;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019*\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LYk/c$b$d;", "LYk/c$b;", "LYk/c$b$b;", "", "acquired", "required", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "d", "()Z", "isEarned$delegate", "(LYk/c$b$d;)Ljava/lang/Object;", "isEarned", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yk.c$b$d, reason: from toString */
        public static final /* data */ class Spend extends b implements InterfaceC0911b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double acquired;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double required;

            public Spend(double d10, double d11) {
                super(null);
                this.acquired = d10;
                this.required = d11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spend)) {
                    return false;
                }
                Spend spend = (Spend) other;
                return Double.compare(this.acquired, spend.acquired) == 0 && Double.compare(this.required, spend.required) == 0;
            }

            @Override // Yk.CouponState.b.InterfaceC0911b
            /* renamed from: a, reason: from getter */
            public double getRequired() {
                return this.required;
            }

            @Override // Yk.CouponState.b.InterfaceC0911b
            /* renamed from: c, reason: from getter */
            public double getAcquired() {
                return this.acquired;
            }

            public int hashCode() {
                return (Double.hashCode(this.acquired) * 31) + Double.hashCode(this.required);
            }

            public String toString() {
                return "Spend(acquired=" + this.acquired + ", required=" + this.required + ')';
            }

            @Override // Yk.CouponState.b
            public boolean d() {
                return b();
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean d();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LYk/c$b$b;", "", "", "c", "()D", "acquired", "a", "required", "", "b", "()Z", "goalReached", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yk.c$b$b, reason: collision with other inner class name */
        public interface InterfaceC0911b {
            /* renamed from: a */
            double getRequired();

            /* renamed from: c */
            double getAcquired();

            default boolean b() {
                if (getAcquired() >= getRequired()) {
                    return true;
                }
                return false;
            }
        }

        private b() {
        }
    }

    public CouponState(Coupon coupon, Tq.h hVar, AssociatedProductsState associatedProductsState, ShoppingListItem shoppingListItem, List<CartEntry> cartEntries, Qk.b couponActionLoadingState) {
        b buy;
        b bVar;
        Intrinsics.j(coupon, "coupon");
        Intrinsics.j(associatedProductsState, "associatedProductsState");
        Intrinsics.j(cartEntries, "cartEntries");
        Intrinsics.j(couponActionLoadingState, "couponActionLoadingState");
        this.coupon = coupon;
        this.store = hVar;
        this.associatedProductsState = associatedProductsState;
        this.shoppingListItem = shoppingListItem;
        this.cartEntries = cartEntries;
        this.couponActionLoadingState = couponActionLoadingState;
        Coupon.c earnCondition = coupon.getEarnCondition();
        if (Intrinsics.e(earnCondition, Coupon.c.b.f26149b)) {
            bVar = b.C0912c.f43140a;
        } else {
            double quantity = 0.0d;
            if (earnCondition instanceof Coupon.c.Spend) {
                Iterator<T> it = cartEntries.iterator();
                while (it.hasNext()) {
                    quantity += ((CartEntry) it.next()).getTotalPrice();
                }
                buy = new b.Spend(quantity, ((Coupon.c.Spend) earnCondition).getGoal());
            } else {
                if (!(earnCondition instanceof Coupon.c.Buy)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it2 = cartEntries.iterator();
                while (it2.hasNext()) {
                    quantity += ((CartEntry) it2.next()).getQuantity();
                }
                buy = new b.Buy(quantity, ((Coupon.c.Buy) earnCondition).getGoal());
            }
            bVar = buy;
        }
        this.progress = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponState)) {
            return false;
        }
        CouponState couponState = (CouponState) other;
        return Intrinsics.e(this.coupon, couponState.coupon) && Intrinsics.e(this.store, couponState.store) && Intrinsics.e(this.associatedProductsState, couponState.associatedProductsState) && Intrinsics.e(this.shoppingListItem, couponState.shoppingListItem) && Intrinsics.e(this.cartEntries, couponState.cartEntries) && this.couponActionLoadingState == couponState.couponActionLoadingState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeParcelable(this.coupon, flags);
        dest.writeParcelable(this.store, flags);
        this.associatedProductsState.writeToParcel(dest, flags);
        dest.writeParcelable(this.shoppingListItem, flags);
        List<CartEntry> list = this.cartEntries;
        dest.writeInt(list.size());
        Iterator<CartEntry> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.couponActionLoadingState.name());
    }

    @Override // Pk.c
    /* renamed from: Y0 */
    public long getOfferId() {
        return this.coupon.getOfferId();
    }

    /* renamed from: a, reason: from getter */
    public final AssociatedProductsState getAssociatedProductsState() {
        return this.associatedProductsState;
    }

    public final List<CartEntry> b() {
        return this.cartEntries;
    }

    /* renamed from: c, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: d, reason: from getter */
    public final Qk.b getCouponActionLoadingState() {
        return this.couponActionLoadingState;
    }

    /* renamed from: e, reason: from getter */
    public final b getProgress() {
        return this.progress;
    }

    /* renamed from: f, reason: from getter */
    public final ShoppingListItem getShoppingListItem() {
        return this.shoppingListItem;
    }

    public int hashCode() {
        int iHashCode = this.coupon.hashCode() * 31;
        Tq.h hVar = this.store;
        int iHashCode2 = (((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.associatedProductsState.hashCode()) * 31;
        ShoppingListItem shoppingListItem = this.shoppingListItem;
        return ((((iHashCode2 + (shoppingListItem != null ? shoppingListItem.hashCode() : 0)) * 31) + this.cartEntries.hashCode()) * 31) + this.couponActionLoadingState.hashCode();
    }

    public String toString() {
        return "CouponState(coupon=" + this.coupon + ", store=" + this.store + ", associatedProductsState=" + this.associatedProductsState + ", shoppingListItem=" + this.shoppingListItem + ", cartEntries=" + this.cartEntries + ", couponActionLoadingState=" + this.couponActionLoadingState + ')';
    }

    public /* synthetic */ CouponState(Coupon coupon, Tq.h hVar, AssociatedProductsState associatedProductsState, ShoppingListItem shoppingListItem, List list, Qk.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(coupon, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? new AssociatedProductsState(null, null, 3, null) : associatedProductsState, (i10 & 8) != 0 ? null : shoppingListItem, (i10 & 16) != 0 ? CollectionsKt.m() : list, (i10 & 32) != 0 ? Qk.b.f31033b : bVar);
    }
}
