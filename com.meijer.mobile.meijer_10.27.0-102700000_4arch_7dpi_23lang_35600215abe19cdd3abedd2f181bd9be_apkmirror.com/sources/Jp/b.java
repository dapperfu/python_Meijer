package Jp;

import Hp.g;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import com.bazaarvoice.bvandroidsdk.SortOrder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LJp/b;", "", "Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Sort;", "sortBy", "", "description", "Lcom/bazaarvoice/bvandroidsdk/SortOrder;", "order", "<init>", "(Ljava/lang/String;ILcom/bazaarvoice/bvandroidsdk/ReviewOptions$Sort;ILcom/bazaarvoice/bvandroidsdk/SortOrder;)V", "a", "Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Sort;", "m", "()Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Sort;", "b", "I", "()I", "c", "Lcom/bazaarvoice/bvandroidsdk/SortOrder;", "l", "()Lcom/bazaarvoice/bvandroidsdk/SortOrder;", "d", "e", "f", "g", "h", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16055d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f16056e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f16057f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f16058g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f16059h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f16060i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16061j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReviewOptions.Sort sortBy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SortOrder order;

    public static EnumEntries<b> e() {
        return f16061j;
    }

    static {
        ReviewOptions.Sort sort = ReviewOptions.Sort.IsFeatured;
        int i10 = g.f13094e;
        SortOrder sortOrder = SortOrder.DESC;
        f16055d = new b("FEATURE", 0, sort, i10, sortOrder);
        f16056e = new b("HELPFULNESS", 1, ReviewOptions.Sort.Helpfulness, g.f13092c, sortOrder);
        ReviewOptions.Sort sort2 = ReviewOptions.Sort.Rating;
        f16057f = new b("RATING_ASC", 2, sort2, g.f13090a, sortOrder);
        f16058g = new b("RATING_DES", 3, sort2, g.f13091b, SortOrder.ASC);
        f16059h = new b("RECENT", 4, ReviewOptions.Sort.LastModificationTime, g.f13093d, sortOrder);
        b[] bVarArrA = a();
        f16060i = bVarArrA;
        f16061j = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f16055d, f16056e, f16057f, f16058g, f16059h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16060i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: l, reason: from getter */
    public final SortOrder getOrder() {
        return this.order;
    }

    /* renamed from: m, reason: from getter */
    public final ReviewOptions.Sort getSortBy() {
        return this.sortBy;
    }

    private b(String str, int i10, ReviewOptions.Sort sort, int i11, SortOrder sortOrder) {
        this.sortBy = sort;
        this.description = i11;
        this.order = sortOrder;
    }
}
