package fs;

import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nk.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lfs/a;", "", "<init>", "()V", "c", "d", "b", "a", "Lfs/a$a;", "Lfs/a$b;", "Lfs/a$c;", "Lfs/a$d;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC14072a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lfs/a$a;", "Lfs/a;", "", "beaconUrl", "Lnk/c;", "product", "Lkk/a;", "carouselType", "<init>", "(Ljava/lang/String;Lnk/c;Lkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnk/c;", "c", "()Lnk/c;", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fs.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class OnBasketChangeBeacon extends AbstractC14072a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String beaconUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public /* synthetic */ OnBasketChangeBeacon(String str, c cVar, EnumC15218a enumC15218a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : enumC15218a);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBasketChangeBeacon)) {
                return false;
            }
            OnBasketChangeBeacon onBasketChangeBeacon = (OnBasketChangeBeacon) other;
            return Intrinsics.e(this.beaconUrl, onBasketChangeBeacon.beaconUrl) && Intrinsics.e(this.product, onBasketChangeBeacon.product) && this.carouselType == onBasketChangeBeacon.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBasketChangeBeacon(String beaconUrl, c cVar, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(beaconUrl, "beaconUrl");
            this.beaconUrl = beaconUrl;
            this.product = cVar;
            this.carouselType = enumC15218a;
        }

        /* renamed from: a, reason: from getter */
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        /* renamed from: b, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        public int hashCode() {
            int iHashCode = this.beaconUrl.hashCode() * 31;
            c cVar = this.product;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode2 + (enumC15218a != null ? enumC15218a.hashCode() : 0);
        }

        public String toString() {
            return "OnBasketChangeBeacon(beaconUrl=" + this.beaconUrl + ", product=" + this.product + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"Lfs/a$b;", "Lfs/a;", "", "", "beaconUrl", "Lnk/c;", "product", "", "isFormatLevel", "Lkk/a;", "carouselType", "<init>", "(Ljava/util/List;Lnk/c;ZLkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lnk/c;", "c", "()Lnk/c;", "Z", "d", "()Z", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fs.a$b, reason: from toString */
    public static final /* data */ class OnClickBeacon extends AbstractC14072a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> beaconUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFormatLevel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public /* synthetic */ OnClickBeacon(List list, c cVar, boolean z10, EnumC15218a enumC15218a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : enumC15218a);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnClickBeacon)) {
                return false;
            }
            OnClickBeacon onClickBeacon = (OnClickBeacon) other;
            return Intrinsics.e(this.beaconUrl, onClickBeacon.beaconUrl) && Intrinsics.e(this.product, onClickBeacon.product) && this.isFormatLevel == onClickBeacon.isFormatLevel && this.carouselType == onClickBeacon.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnClickBeacon(List<String> beaconUrl, c cVar, boolean z10, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(beaconUrl, "beaconUrl");
            this.beaconUrl = beaconUrl;
            this.product = cVar;
            this.isFormatLevel = z10;
            this.carouselType = enumC15218a;
        }

        public final List<String> a() {
            return this.beaconUrl;
        }

        /* renamed from: b, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsFormatLevel() {
            return this.isFormatLevel;
        }

        public int hashCode() {
            int iHashCode = this.beaconUrl.hashCode() * 31;
            c cVar = this.product;
            int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isFormatLevel)) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode2 + (enumC15218a != null ? enumC15218a.hashCode() : 0);
        }

        public String toString() {
            return "OnClickBeacon(beaconUrl=" + this.beaconUrl + ", product=" + this.product + ", isFormatLevel=" + this.isFormatLevel + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006 "}, d2 = {"Lfs/a$c;", "Lfs/a;", "", "beaconUrl", "Lnk/c;", "product", "", "isFormatLevel", "Lkk/a;", "carouselType", "<init>", "(Ljava/lang/String;Lnk/c;ZLkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnk/c;", "c", "()Lnk/c;", "Z", "d", "()Z", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fs.a$c, reason: from toString */
    public static final /* data */ class OnLoadBeacon extends AbstractC14072a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String beaconUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFormatLevel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public /* synthetic */ OnLoadBeacon(String str, c cVar, boolean z10, EnumC15218a enumC15218a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, enumC15218a);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnLoadBeacon)) {
                return false;
            }
            OnLoadBeacon onLoadBeacon = (OnLoadBeacon) other;
            return Intrinsics.e(this.beaconUrl, onLoadBeacon.beaconUrl) && Intrinsics.e(this.product, onLoadBeacon.product) && this.isFormatLevel == onLoadBeacon.isFormatLevel && this.carouselType == onLoadBeacon.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadBeacon(String beaconUrl, c cVar, boolean z10, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(beaconUrl, "beaconUrl");
            this.beaconUrl = beaconUrl;
            this.product = cVar;
            this.isFormatLevel = z10;
            this.carouselType = enumC15218a;
        }

        /* renamed from: a, reason: from getter */
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        /* renamed from: b, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsFormatLevel() {
            return this.isFormatLevel;
        }

        public int hashCode() {
            int iHashCode = this.beaconUrl.hashCode() * 31;
            c cVar = this.product;
            int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isFormatLevel)) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode2 + (enumC15218a != null ? enumC15218a.hashCode() : 0);
        }

        public String toString() {
            return "OnLoadBeacon(beaconUrl=" + this.beaconUrl + ", product=" + this.product + ", isFormatLevel=" + this.isFormatLevel + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"Lfs/a$d;", "Lfs/a;", "", "", "beaconUrl", "Lnk/c;", "product", "", "isFormatLevel", "Lkk/a;", "carouselType", "<init>", "(Ljava/util/List;Lnk/c;ZLkk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lnk/c;", "c", "()Lnk/c;", "Z", "d", "()Z", "Lkk/a;", "()Lkk/a;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fs.a$d, reason: from toString */
    public static final /* data */ class OnViewBeacon extends AbstractC14072a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> beaconUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFormatLevel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a carouselType;

        public /* synthetic */ OnViewBeacon(List list, c cVar, boolean z10, EnumC15218a enumC15218a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : enumC15218a);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnViewBeacon)) {
                return false;
            }
            OnViewBeacon onViewBeacon = (OnViewBeacon) other;
            return Intrinsics.e(this.beaconUrl, onViewBeacon.beaconUrl) && Intrinsics.e(this.product, onViewBeacon.product) && this.isFormatLevel == onViewBeacon.isFormatLevel && this.carouselType == onViewBeacon.carouselType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewBeacon(List<String> beaconUrl, c cVar, boolean z10, EnumC15218a enumC15218a) {
            super(null);
            Intrinsics.j(beaconUrl, "beaconUrl");
            this.beaconUrl = beaconUrl;
            this.product = cVar;
            this.isFormatLevel = z10;
            this.carouselType = enumC15218a;
        }

        public final List<String> a() {
            return this.beaconUrl;
        }

        /* renamed from: b, reason: from getter */
        public final EnumC15218a getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsFormatLevel() {
            return this.isFormatLevel;
        }

        public int hashCode() {
            int iHashCode = this.beaconUrl.hashCode() * 31;
            c cVar = this.product;
            int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isFormatLevel)) * 31;
            EnumC15218a enumC15218a = this.carouselType;
            return iHashCode2 + (enumC15218a != null ? enumC15218a.hashCode() : 0);
        }

        public String toString() {
            return "OnViewBeacon(beaconUrl=" + this.beaconUrl + ", product=" + this.product + ", isFormatLevel=" + this.isFormatLevel + ", carouselType=" + this.carouselType + ')';
        }
    }

    public /* synthetic */ AbstractC14072a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14072a() {
    }
}
