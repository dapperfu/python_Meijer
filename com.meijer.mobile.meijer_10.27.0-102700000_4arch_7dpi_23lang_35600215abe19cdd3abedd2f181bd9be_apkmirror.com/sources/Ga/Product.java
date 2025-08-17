package Ga;

import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010 R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010'\u001a\u0004\bD\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\bL\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010'\u001a\u0004\bN\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010'\u001a\u0004\bP\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010'\u001a\u0004\bR\u0010 R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bS\u0010'\u001a\u0004\bT\u0010 R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"LGa/c;", "", "", "productId", "title", "linkUrl", "feature", "cohort", "", "customFields", "imageUrlString", "Ljava/net/URL;", "imageUrl", "zoomImageUrlString", "zoomImageUrl", "categoryPath", "", "available", "productDescription", "", "price", "msrp", "album", "actor", "artist", "author", "brand", "", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProductId", "b", "getTitle", "c", "getLinkUrl", "d", "getFeature", "e", "getCohort", "f", "Ljava/util/Map;", "getCustomFields", "()Ljava/util/Map;", "g", "h", "Ljava/net/URL;", "getImageUrl", "()Ljava/net/URL;", "i", "j", "getZoomImageUrl", "k", "getCategoryPath", "l", "Ljava/lang/Boolean;", "getAvailable", "()Ljava/lang/Boolean;", "m", "getProductDescription", "n", "Ljava/lang/Float;", "getPrice", "()Ljava/lang/Float;", "o", "getMsrp", "p", "getAlbum", "q", "getActor", "r", "getArtist", "s", "getAuthor", "t", "getBrand", "u", "Ljava/lang/Integer;", "getYear", "()Ljava/lang/Integer;", "predict-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ga.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Product {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String linkUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String feature;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cohort;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> customFields;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrlString;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL imageUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zoomImageUrlString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL zoomImageUrl;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryPath;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean available;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productDescription;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float price;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float msrp;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String album;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String actor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String artist;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String author;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brand;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer year;

    public Product(String productId, String title, String linkUrl, String feature, String cohort, Map<String, String> customFields, String str, URL url, String str2, URL url2, String str3, Boolean bool, String str4, Float f10, Float f11, String str5, String str6, String str7, String str8, String str9, Integer num) {
        Intrinsics.j(productId, "productId");
        Intrinsics.j(title, "title");
        Intrinsics.j(linkUrl, "linkUrl");
        Intrinsics.j(feature, "feature");
        Intrinsics.j(cohort, "cohort");
        Intrinsics.j(customFields, "customFields");
        this.productId = productId;
        this.title = title;
        this.linkUrl = linkUrl;
        this.feature = feature;
        this.cohort = cohort;
        this.customFields = customFields;
        this.imageUrlString = str;
        this.imageUrl = url;
        this.zoomImageUrlString = str2;
        this.zoomImageUrl = url2;
        this.categoryPath = str3;
        this.available = bool;
        this.productDescription = str4;
        this.price = f10;
        this.msrp = f11;
        this.album = str5;
        this.actor = str6;
        this.artist = str7;
        this.author = str8;
        this.brand = str9;
        this.year = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return Intrinsics.e(this.productId, product.productId) && Intrinsics.e(this.title, product.title) && Intrinsics.e(this.linkUrl, product.linkUrl) && Intrinsics.e(this.feature, product.feature) && Intrinsics.e(this.cohort, product.cohort) && Intrinsics.e(this.customFields, product.customFields) && Intrinsics.e(this.imageUrlString, product.imageUrlString) && Intrinsics.e(this.imageUrl, product.imageUrl) && Intrinsics.e(this.zoomImageUrlString, product.zoomImageUrlString) && Intrinsics.e(this.zoomImageUrl, product.zoomImageUrl) && Intrinsics.e(this.categoryPath, product.categoryPath) && Intrinsics.e(this.available, product.available) && Intrinsics.e(this.productDescription, product.productDescription) && Intrinsics.e(this.price, product.price) && Intrinsics.e(this.msrp, product.msrp) && Intrinsics.e(this.album, product.album) && Intrinsics.e(this.actor, product.actor) && Intrinsics.e(this.artist, product.artist) && Intrinsics.e(this.author, product.author) && Intrinsics.e(this.brand, product.brand) && Intrinsics.e(this.year, product.year);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.productId.hashCode() * 31) + this.title.hashCode()) * 31) + this.linkUrl.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.cohort.hashCode()) * 31) + this.customFields.hashCode()) * 31;
        String str = this.imageUrlString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        URL url = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        String str2 = this.zoomImageUrlString;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        URL url2 = this.zoomImageUrl;
        int iHashCode5 = (iHashCode4 + (url2 == null ? 0 : url2.hashCode())) * 31;
        String str3 = this.categoryPath;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.available;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.productDescription;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.price;
        int iHashCode9 = (iHashCode8 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.msrp;
        int iHashCode10 = (iHashCode9 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str5 = this.album;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.actor;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.artist;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.author;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.brand;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.year;
        return iHashCode15 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Product(productId=" + this.productId + ", title=" + this.title + ", linkUrl=" + this.linkUrl + ", feature=" + this.feature + ", cohort=" + this.cohort + ", customFields=" + this.customFields + ", imageUrlString=" + this.imageUrlString + ", imageUrl=" + this.imageUrl + ", zoomImageUrlString=" + this.zoomImageUrlString + ", zoomImageUrl=" + this.zoomImageUrl + ", categoryPath=" + this.categoryPath + ", available=" + this.available + ", productDescription=" + this.productDescription + ", price=" + this.price + ", msrp=" + this.msrp + ", album=" + this.album + ", actor=" + this.actor + ", artist=" + this.artist + ", author=" + this.author + ", brand=" + this.brand + ", year=" + this.year + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ Product(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map r30, java.lang.String r31, java.net.URL r32, java.lang.String r33, java.net.URL r34, java.lang.String r35, java.lang.Boolean r36, java.lang.String r37, java.lang.Float r38, java.lang.Float r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.Integer r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ga.Product.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.net.URL, java.lang.String, java.net.URL, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
