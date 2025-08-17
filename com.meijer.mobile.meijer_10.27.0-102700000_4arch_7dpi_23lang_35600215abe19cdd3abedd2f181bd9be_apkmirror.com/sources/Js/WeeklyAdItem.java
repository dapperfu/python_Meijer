package Js;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<B\u008d\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0096\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00100J\u001a\u00108\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b;\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u00100R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u00104R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bA\u0010DR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010J\u001a\u0004\bI\u0010LR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bN\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010O\u001a\u0004\b>\u0010PR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u0010DR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010YR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bV\u0010?\u001a\u0004\bZ\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\b_\u00104R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\b`\u0010DR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bE\u00104R\u0019\u0010!\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bf\u0010?\u001a\u0004\bg\u00104R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bG\u00104R\u0011\u0010h\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bM\u0010c¨\u0006i"}, d2 = {"LJs/b;", "Landroid/os/Parcelable;", "", "itemId", "flyerId", "", "productName", "description", "", "categories", "page", "pageDestination", "j$/time/LocalDate", "startDate", "endDate", "saleStory", "", "adBlockId", "LJs/b$b;", "priceText", "", "offerIdsList", "LJs/d;", "itemType", "webUrl", "LJs/f;", "videoType", "videoUrl", "Lmk/f;", "products", "", "isAddedToShoppingList", "detailImageUrl", "thumbnailImageUrl", "disclaimerText", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;IILj$/time/LocalDate;Lj$/time/LocalDate;Ljava/lang/String;JLJs/b$b;Ljava/util/List;LJs/d;Ljava/lang/String;LJs/f;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "shoppingListListingId", "isShoppingListFromWeeklyAd", "C", "(Ljava/lang/String;Z)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;IILj$/time/LocalDate;Lj$/time/LocalDate;Ljava/lang/String;JLJs/b$b;Ljava/util/List;LJs/d;Ljava/lang/String;LJs/f;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)LJs/b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "k", "b", "i", "c", "Ljava/lang/String;", "s", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "q", "g", "getPageDestination", "h", "Lj$/time/LocalDate;", "v", "()Lj$/time/LocalDate;", "j", "t", "J", "()J", "l", "LJs/b$b;", "r", "()LJs/b$b;", "m", "o", "n", "LJs/d;", "()LJs/d;", "A", "p", "LJs/f;", "x", "()LJs/f;", "y", "getProducts", "Z", "B", "()Z", "setAddedToShoppingList", "(Z)V", "u", "w", "hasRelatedCoupons", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Js.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class WeeklyAdItem implements Parcelable {
    public static final Parcelable.Creator<WeeklyAdItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> categories;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int page;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pageDestination;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate startDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate endDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String saleStory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long adBlockId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final PriceText priceText;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> offerIdsList;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final d itemType;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webUrl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final f videoType;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String videoUrl;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<mk.f> products;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAddedToShoppingList;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String detailImageUrl;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailImageUrl;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimerText;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Js.b$a */
    public static final class a implements Parcelable.Creator<WeeklyAdItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeeklyAdItem createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            String string3 = parcel.readString();
            long j10 = parcel.readLong();
            PriceText priceTextCreateFromParcel = parcel.readInt() == 0 ? null : PriceText.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList.add(Long.valueOf(parcel.readLong()));
                i15++;
                i14 = i14;
            }
            d dVarValueOf = d.valueOf(parcel.readString());
            String string4 = parcel.readString();
            f fVarValueOf = parcel.readInt() == 0 ? null : f.valueOf(parcel.readString());
            String string5 = parcel.readString();
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList2.add(parcel.readParcelable(WeeklyAdItem.class.getClassLoader()));
                i17++;
                i16 = i16;
            }
            return new WeeklyAdItem(i10, i11, string, string2, arrayListCreateStringArrayList, i12, i13, localDate, localDate2, string3, j10, priceTextCreateFromParcel, arrayList, dVarValueOf, string4, fVarValueOf, string5, arrayList2, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WeeklyAdItem[] newArray(int i10) {
            return new WeeklyAdItem[i10];
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006!"}, d2 = {"LJs/b$b;", "Landroid/os/Parcelable;", "", "priceText", "prePriceText", "postPriceText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPriceText", "b", "getPrePriceText", "c", "getPostPriceText", "text", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Js.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class PriceText implements Parcelable {
        public static final Parcelable.Creator<PriceText> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String prePriceText;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postPriceText;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Js.b$b$a */
        public static final class a implements Parcelable.Creator<PriceText> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PriceText createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new PriceText(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PriceText[] newArray(int i10) {
                return new PriceText[i10];
            }
        }

        public PriceText() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceText)) {
                return false;
            }
            PriceText priceText = (PriceText) other;
            return Intrinsics.e(this.priceText, priceText.priceText) && Intrinsics.e(this.prePriceText, priceText.prePriceText) && Intrinsics.e(this.postPriceText, priceText.postPriceText);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.priceText);
            dest.writeString(this.prePriceText);
            dest.writeString(this.postPriceText);
        }

        public PriceText(String str, String str2, String str3) {
            this.priceText = str;
            this.prePriceText = str2;
            this.postPriceText = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a() {
            /*
                r11 = this;
                java.lang.String r0 = r11.prePriceText
                r1 = 0
                if (r0 == 0) goto L18
                java.util.Locale r2 = java.util.Locale.getDefault()
                java.lang.String r3 = "getDefault(...)"
                kotlin.jvm.internal.Intrinsics.i(r2, r3)
                java.lang.String r0 = r0.toUpperCase(r2)
                java.lang.String r2 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.i(r0, r2)
                goto L19
            L18:
                r0 = r1
            L19:
                java.lang.String r2 = r11.priceText
                if (r2 == 0) goto L30
                boolean r3 = kotlin.text.StringsKt.r0(r2)
                if (r3 != 0) goto L24
                goto L25
            L24:
                r2 = r1
            L25:
                if (r2 == 0) goto L30
                double r2 = java.lang.Double.parseDouble(r2)
                java.lang.String r2 = Fk.g.b(r2)
                goto L31
            L30:
                r2 = r1
            L31:
                java.lang.String r3 = r11.postPriceText
                java.lang.String[] r0 = new java.lang.String[]{r0, r2, r3}
                java.util.List r0 = kotlin.collections.CollectionsKt.r(r0)
                r2 = r0
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                r9 = 62
                r10 = 0
                java.lang.String r3 = " "
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.String r0 = kotlin.collections.CollectionsKt.B0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r2 = kotlin.text.StringsKt.r0(r0)
                if (r2 != 0) goto L53
                return r0
            L53:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Js.WeeklyAdItem.PriceText.a():java.lang.String");
        }

        public int hashCode() {
            String str = this.priceText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.prePriceText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.postPriceText;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "PriceText(priceText=" + this.priceText + ", prePriceText=" + this.prePriceText + ", postPriceText=" + this.postPriceText + ')';
        }

        public /* synthetic */ PriceText(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public WeeklyAdItem() {
        this(0, 0, null, null, null, 0, 0, null, null, null, 0L, null, null, null, null, null, null, null, false, null, null, null, 4194303, null);
    }

    public static /* synthetic */ WeeklyAdItem b(WeeklyAdItem weeklyAdItem, int i10, int i11, String str, String str2, List list, int i12, int i13, LocalDate localDate, LocalDate localDate2, String str3, long j10, PriceText priceText, List list2, d dVar, String str4, f fVar, String str5, List list3, boolean z10, String str6, String str7, String str8, int i14, Object obj) {
        String str9;
        String str10;
        int i15 = (i14 & 1) != 0 ? weeklyAdItem.itemId : i10;
        int i16 = (i14 & 2) != 0 ? weeklyAdItem.flyerId : i11;
        String str11 = (i14 & 4) != 0 ? weeklyAdItem.productName : str;
        String str12 = (i14 & 8) != 0 ? weeklyAdItem.description : str2;
        List list4 = (i14 & 16) != 0 ? weeklyAdItem.categories : list;
        int i17 = (i14 & 32) != 0 ? weeklyAdItem.page : i12;
        int i18 = (i14 & 64) != 0 ? weeklyAdItem.pageDestination : i13;
        LocalDate localDate3 = (i14 & 128) != 0 ? weeklyAdItem.startDate : localDate;
        LocalDate localDate4 = (i14 & 256) != 0 ? weeklyAdItem.endDate : localDate2;
        String str13 = (i14 & 512) != 0 ? weeklyAdItem.saleStory : str3;
        long j11 = (i14 & 1024) != 0 ? weeklyAdItem.adBlockId : j10;
        PriceText priceText2 = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? weeklyAdItem.priceText : priceText;
        List list5 = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? weeklyAdItem.offerIdsList : list2;
        int i19 = i15;
        d dVar2 = (i14 & 8192) != 0 ? weeklyAdItem.itemType : dVar;
        String str14 = (i14 & 16384) != 0 ? weeklyAdItem.webUrl : str4;
        f fVar2 = (i14 & 32768) != 0 ? weeklyAdItem.videoType : fVar;
        String str15 = (i14 & 65536) != 0 ? weeklyAdItem.videoUrl : str5;
        List list6 = (i14 & 131072) != 0 ? weeklyAdItem.products : list3;
        boolean z11 = (i14 & 262144) != 0 ? weeklyAdItem.isAddedToShoppingList : z10;
        String str16 = (i14 & 524288) != 0 ? weeklyAdItem.detailImageUrl : str6;
        String str17 = (i14 & 1048576) != 0 ? weeklyAdItem.thumbnailImageUrl : str7;
        if ((i14 & 2097152) != 0) {
            str10 = str17;
            str9 = weeklyAdItem.disclaimerText;
        } else {
            str9 = str8;
            str10 = str17;
        }
        return weeklyAdItem.a(i19, i16, str11, str12, list4, i17, i18, localDate3, localDate4, str13, j11, priceText2, list5, dVar2, str14, fVar2, str15, list6, z11, str16, str10, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdItem)) {
            return false;
        }
        WeeklyAdItem weeklyAdItem = (WeeklyAdItem) other;
        return this.itemId == weeklyAdItem.itemId && this.flyerId == weeklyAdItem.flyerId && Intrinsics.e(this.productName, weeklyAdItem.productName) && Intrinsics.e(this.description, weeklyAdItem.description) && Intrinsics.e(this.categories, weeklyAdItem.categories) && this.page == weeklyAdItem.page && this.pageDestination == weeklyAdItem.pageDestination && Intrinsics.e(this.startDate, weeklyAdItem.startDate) && Intrinsics.e(this.endDate, weeklyAdItem.endDate) && Intrinsics.e(this.saleStory, weeklyAdItem.saleStory) && this.adBlockId == weeklyAdItem.adBlockId && Intrinsics.e(this.priceText, weeklyAdItem.priceText) && Intrinsics.e(this.offerIdsList, weeklyAdItem.offerIdsList) && this.itemType == weeklyAdItem.itemType && Intrinsics.e(this.webUrl, weeklyAdItem.webUrl) && this.videoType == weeklyAdItem.videoType && Intrinsics.e(this.videoUrl, weeklyAdItem.videoUrl) && Intrinsics.e(this.products, weeklyAdItem.products) && this.isAddedToShoppingList == weeklyAdItem.isAddedToShoppingList && Intrinsics.e(this.detailImageUrl, weeklyAdItem.detailImageUrl) && Intrinsics.e(this.thumbnailImageUrl, weeklyAdItem.thumbnailImageUrl) && Intrinsics.e(this.disclaimerText, weeklyAdItem.disclaimerText);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.itemId);
        dest.writeInt(this.flyerId);
        dest.writeString(this.productName);
        dest.writeString(this.description);
        dest.writeStringList(this.categories);
        dest.writeInt(this.page);
        dest.writeInt(this.pageDestination);
        dest.writeSerializable(this.startDate);
        dest.writeSerializable(this.endDate);
        dest.writeString(this.saleStory);
        dest.writeLong(this.adBlockId);
        PriceText priceText = this.priceText;
        if (priceText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            priceText.writeToParcel(dest, flags);
        }
        List<Long> list = this.offerIdsList;
        dest.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            dest.writeLong(it.next().longValue());
        }
        dest.writeString(this.itemType.name());
        dest.writeString(this.webUrl);
        f fVar = this.videoType;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeString(this.videoUrl);
        List<mk.f> list2 = this.products;
        dest.writeInt(list2.size());
        Iterator<mk.f> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeInt(this.isAddedToShoppingList ? 1 : 0);
        dest.writeString(this.detailImageUrl);
        dest.writeString(this.thumbnailImageUrl);
        dest.writeString(this.disclaimerText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeeklyAdItem(int i10, int i11, String str, String str2, List<String> categories, int i12, int i13, LocalDate localDate, LocalDate localDate2, String str3, long j10, PriceText priceText, List<Long> offerIdsList, d itemType, String str4, f fVar, String str5, List<? extends mk.f> products, boolean z10, String str6, String str7, String str8) {
        Intrinsics.j(categories, "categories");
        Intrinsics.j(offerIdsList, "offerIdsList");
        Intrinsics.j(itemType, "itemType");
        Intrinsics.j(products, "products");
        this.itemId = i10;
        this.flyerId = i11;
        this.productName = str;
        this.description = str2;
        this.categories = categories;
        this.page = i12;
        this.pageDestination = i13;
        this.startDate = localDate;
        this.endDate = localDate2;
        this.saleStory = str3;
        this.adBlockId = j10;
        this.priceText = priceText;
        this.offerIdsList = offerIdsList;
        this.itemType = itemType;
        this.webUrl = str4;
        this.videoType = fVar;
        this.videoUrl = str5;
        this.products = products;
        this.isAddedToShoppingList = z10;
        this.detailImageUrl = str6;
        this.thumbnailImageUrl = str7;
        this.disclaimerText = str8;
    }

    /* renamed from: A, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsAddedToShoppingList() {
        return this.isAddedToShoppingList;
    }

    public final boolean C(String shoppingListListingId, boolean isShoppingListFromWeeklyAd) {
        return isShoppingListFromWeeklyAd && Intrinsics.e(String.valueOf(this.itemId), shoppingListListingId);
    }

    public final WeeklyAdItem a(int itemId, int flyerId, String productName, String description, List<String> categories, int page, int pageDestination, LocalDate startDate, LocalDate endDate, String saleStory, long adBlockId, PriceText priceText, List<Long> offerIdsList, d itemType, String webUrl, f videoType, String videoUrl, List<? extends mk.f> products, boolean isAddedToShoppingList, String detailImageUrl, String thumbnailImageUrl, String disclaimerText) {
        Intrinsics.j(categories, "categories");
        Intrinsics.j(offerIdsList, "offerIdsList");
        Intrinsics.j(itemType, "itemType");
        Intrinsics.j(products, "products");
        return new WeeklyAdItem(itemId, flyerId, productName, description, categories, page, pageDestination, startDate, endDate, saleStory, adBlockId, priceText, offerIdsList, itemType, webUrl, videoType, videoUrl, products, isAddedToShoppingList, detailImageUrl, thumbnailImageUrl, disclaimerText);
    }

    /* renamed from: c, reason: from getter */
    public final long getAdBlockId() {
        return this.adBlockId;
    }

    public final List<String> d() {
        return this.categories;
    }

    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: f, reason: from getter */
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    /* renamed from: h, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.itemId) * 31) + Integer.hashCode(this.flyerId)) * 31;
        String str = this.productName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.categories.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageDestination)) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.endDate;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str3 = this.saleStory;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.adBlockId)) * 31;
        PriceText priceText = this.priceText;
        int iHashCode7 = (((((iHashCode6 + (priceText == null ? 0 : priceText.hashCode())) * 31) + this.offerIdsList.hashCode()) * 31) + this.itemType.hashCode()) * 31;
        String str4 = this.webUrl;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        f fVar = this.videoType;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str5 = this.videoUrl;
        int iHashCode10 = (((((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.products.hashCode()) * 31) + Boolean.hashCode(this.isAddedToShoppingList)) * 31;
        String str6 = this.detailImageUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.thumbnailImageUrl;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.disclaimerText;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getFlyerId() {
        return this.flyerId;
    }

    public final boolean j() {
        return !this.offerIdsList.isEmpty();
    }

    /* renamed from: k, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: n, reason: from getter */
    public final d getItemType() {
        return this.itemType;
    }

    public final List<Long> o() {
        return this.offerIdsList;
    }

    /* renamed from: q, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: r, reason: from getter */
    public final PriceText getPriceText() {
        return this.priceText;
    }

    /* renamed from: s, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: t, reason: from getter */
    public final String getSaleStory() {
        return this.saleStory;
    }

    public String toString() {
        return "WeeklyAdItem(itemId=" + this.itemId + ", flyerId=" + this.flyerId + ", productName=" + this.productName + ", description=" + this.description + ", categories=" + this.categories + ", page=" + this.page + ", pageDestination=" + this.pageDestination + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", saleStory=" + this.saleStory + ", adBlockId=" + this.adBlockId + ", priceText=" + this.priceText + ", offerIdsList=" + this.offerIdsList + ", itemType=" + this.itemType + ", webUrl=" + this.webUrl + ", videoType=" + this.videoType + ", videoUrl=" + this.videoUrl + ", products=" + this.products + ", isAddedToShoppingList=" + this.isAddedToShoppingList + ", detailImageUrl=" + this.detailImageUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", disclaimerText=" + this.disclaimerText + ')';
    }

    /* renamed from: v, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: w, reason: from getter */
    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    /* renamed from: x, reason: from getter */
    public final f getVideoType() {
        return this.videoType;
    }

    /* renamed from: y, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public /* synthetic */ WeeklyAdItem(int i10, int i11, String str, String str2, List list, int i12, int i13, LocalDate localDate, LocalDate localDate2, String str3, long j10, PriceText priceText, List list2, d dVar, String str4, f fVar, String str5, List list3, boolean z10, String str6, String str7, String str8, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? CollectionsKt.m() : list, (i14 & 32) != 0 ? 1 : i12, (i14 & 64) == 0 ? i13 : 1, (i14 & 128) != 0 ? null : localDate, (i14 & 256) != 0 ? null : localDate2, (i14 & 512) != 0 ? null : str3, (i14 & 1024) != 0 ? 0L : j10, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? null : priceText, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ArrayList() : list2, (i14 & 8192) != 0 ? d.f16106b : dVar, (i14 & 16384) != 0 ? null : str4, (i14 & 32768) != 0 ? null : fVar, (i14 & 65536) != 0 ? null : str5, (i14 & 131072) != 0 ? CollectionsKt.m() : list3, (i14 & 262144) != 0 ? false : z10, (i14 & 524288) != 0 ? null : str6, (i14 & 1048576) != 0 ? null : str7, (i14 & 2097152) != 0 ? null : str8);
    }
}
