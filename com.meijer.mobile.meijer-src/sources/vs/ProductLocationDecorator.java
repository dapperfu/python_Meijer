package vs;

import Co.ProductFullDetails;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import us.C17457C;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001\u0015BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u000eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010(\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0015\u0010'R\u0017\u0010*\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b\u001b\u0010'R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006."}, d2 = {"Lvs/i;", "", "", "isNewILC", "", "zoneCode", "departmentName", "aisle", "storeName", "section", "isFromSisterStore", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getZoneCode", "c", "getDepartmentName", "d", "getAisle", "e", "getStoreName", "f", "getSection", "g", "Lbk/a;", "h", "Lbk/a;", "()Lbk/a;", "displayLocation", "i", "displayStore", "j", "displaySection", "k", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vs.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductLocationDecorator {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f166280l = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNewILC;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zoneCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String departmentName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aisle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String section;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromSisterStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a displayLocation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a displayStore;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a displaySection;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvs/i$a;", "", "<init>", "()V", "LCo/h;", "product", "", "storeName", "Lvs/i;", "a", "(LCo/h;Ljava/lang/String;)Lvs/i;", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vs.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ProductLocationDecorator b(Companion companion, ProductFullDetails productFullDetails, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.a(productFullDetails, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final vs.ProductLocationDecorator a(Co.ProductFullDetails r14, java.lang.String r15) {
            /*
                r13 = this;
                java.lang.String r0 = "product"
                kotlin.jvm.internal.Intrinsics.j(r14, r0)
                Co.o r0 = r14.getStockInfo()
                Co.g r0 = r0.getIlcPrimary()
                java.lang.String r1 = "SISTER"
                java.lang.String r2 = ""
                r3 = 0
                if (r0 == 0) goto L7b
                Co.o r4 = r14.getStockInfo()
                boolean r6 = r4.getIsNewILC()
                java.lang.String r7 = r0.getZoneCode()
                Co.g$c r4 = r0.getZone()
                if (r4 == 0) goto L2f
                java.lang.String r4 = r4.getName()
                if (r4 != 0) goto L2d
                goto L2f
            L2d:
                r8 = r4
                goto L34
            L2f:
                java.lang.String r4 = r14.getDepartment()
                goto L2d
            L34:
                Co.o r4 = r14.getStockInfo()
                boolean r4 = r4.getIsNewILC()
                if (r4 == 0) goto L44
                java.lang.String r3 = r0.getAisle()
            L42:
                r9 = r3
                goto L60
            L44:
                java.lang.String r4 = r0.getAisle()
                Co.g$c r5 = r0.getZone()
                if (r5 == 0) goto L53
                java.lang.String r5 = r5.getCode()
                goto L54
            L53:
                r5 = r3
            L54:
                java.lang.String r9 = "GROC"
                boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r9)
                if (r5 == 0) goto L5d
                r3 = r4
            L5d:
                if (r3 != 0) goto L42
                r9 = r2
            L60:
                if (r15 != 0) goto L64
                r10 = r2
                goto L65
            L64:
                r10 = r15
            L65:
                java.lang.String r11 = r0.getSection()
                Co.o r14 = r14.getStockInfo()
                java.lang.String r14 = r14.getEligibility()
                boolean r12 = kotlin.jvm.internal.Intrinsics.e(r14, r1)
                vs.i r5 = new vs.i
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return r5
            L7b:
                java.lang.String r0 = r14.getDepartment()
                boolean r4 = kotlin.text.StringsKt.s0(r0)
                if (r4 != 0) goto L87
                r8 = r0
                goto L88
            L87:
                r8 = r3
            L88:
                if (r8 == 0) goto La8
                vs.i r5 = new vs.i
                if (r15 != 0) goto L90
                r10 = r2
                goto L91
            L90:
                r10 = r15
            L91:
                Co.o r14 = r14.getStockInfo()
                java.lang.String r14 = r14.getEligibility()
                boolean r12 = kotlin.jvm.internal.Intrinsics.e(r14, r1)
                r6 = 0
                java.lang.String r7 = ""
                java.lang.String r9 = ""
                java.lang.String r11 = ""
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return r5
            La8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: vs.ProductLocationDecorator.Companion.a(Co.h, java.lang.String):vs.i");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductLocationDecorator)) {
            return false;
        }
        ProductLocationDecorator productLocationDecorator = (ProductLocationDecorator) other;
        return this.isNewILC == productLocationDecorator.isNewILC && Intrinsics.e(this.zoneCode, productLocationDecorator.zoneCode) && Intrinsics.e(this.departmentName, productLocationDecorator.departmentName) && Intrinsics.e(this.aisle, productLocationDecorator.aisle) && Intrinsics.e(this.storeName, productLocationDecorator.storeName) && Intrinsics.e(this.section, productLocationDecorator.section) && this.isFromSisterStore == productLocationDecorator.isFromSisterStore;
    }

    public ProductLocationDecorator(boolean z10, String zoneCode, String departmentName, String aisle, String storeName, String section, boolean z11) {
        Intrinsics.j(zoneCode, "zoneCode");
        Intrinsics.j(departmentName, "departmentName");
        Intrinsics.j(aisle, "aisle");
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(section, "section");
        this.isNewILC = z10;
        this.zoneCode = zoneCode;
        this.departmentName = departmentName;
        this.aisle = aisle;
        this.storeName = storeName;
        this.section = section;
        this.isFromSisterStore = z11;
        this.displayLocation = StringsKt.v(aisle) == null ? AbstractC6392a.INSTANCE.c(departmentName) : z10 ? AbstractC6392a.INSTANCE.d(C17457C.f164387F, zoneCode, aisle) : AbstractC6392a.INSTANCE.d(C17457C.f164427x, departmentName, aisle);
        AbstractC6392a.Companion c1204a = AbstractC6392a.INSTANCE;
        this.displayStore = c1204a.d(C17457C.f164428y, storeName);
        this.displaySection = c1204a.d(C17457C.f164386E, section);
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDisplayLocation() {
        return this.displayLocation;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getDisplaySection() {
        return this.displaySection;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getDisplayStore() {
        return this.displayStore;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsFromSisterStore() {
        return this.isFromSisterStore;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isNewILC) * 31) + this.zoneCode.hashCode()) * 31) + this.departmentName.hashCode()) * 31) + this.aisle.hashCode()) * 31) + this.storeName.hashCode()) * 31) + this.section.hashCode()) * 31) + Boolean.hashCode(this.isFromSisterStore);
    }

    public String toString() {
        return "ProductLocationDecorator(isNewILC=" + this.isNewILC + ", zoneCode=" + this.zoneCode + ", departmentName=" + this.departmentName + ", aisle=" + this.aisle + ", storeName=" + this.storeName + ", section=" + this.section + ", isFromSisterStore=" + this.isFromSisterStore + ')';
    }
}
