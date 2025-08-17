package vs;

import Eo.Nutrient;
import ak.AbstractC5607a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import us.C17305C;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d¨\u0006#"}, d2 = {"Lvs/k;", "", "", "name", "amount", "unitOfMeasure", "dailyPercentValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LEo/a;", "nutrient", "(LEo/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Lak/a;", "e", "Lkotlin/Lazy;", "()Lak/a;", "amountWithUnit", "f", "summaryName", "label", "percentDailyValue", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductNutrientDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dailyPercentValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy amountWithUnit;

    public ProductNutrientDecorator() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductNutrientDecorator)) {
            return false;
        }
        ProductNutrientDecorator productNutrientDecorator = (ProductNutrientDecorator) other;
        return Intrinsics.e(this.name, productNutrientDecorator.name) && Intrinsics.e(this.amount, productNutrientDecorator.amount) && Intrinsics.e(this.unitOfMeasure, productNutrientDecorator.unitOfMeasure) && Intrinsics.e(this.dailyPercentValue, productNutrientDecorator.dailyPercentValue);
    }

    public ProductNutrientDecorator(String str, String str2, String str3, String str4) {
        this.name = str;
        this.amount = str2;
        this.unitOfMeasure = str3;
        this.dailyPercentValue = str4;
        this.amountWithUnit = LazyKt.b(new Function0() { // from class: vs.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductNutrientDecorator.b(this.f165057a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a b(ProductNutrientDecorator productNutrientDecorator) {
        String str;
        String str2 = productNutrientDecorator.amount;
        if (str2 != null && !StringsKt.r0(str2) && (str = productNutrientDecorator.unitOfMeasure) != null && !StringsKt.r0(str) && !Intrinsics.e(productNutrientDecorator.unitOfMeasure, "Cal")) {
            return AbstractC5607a.INSTANCE.d(C17305C.f163307D, productNutrientDecorator.amount, productNutrientDecorator.unitOfMeasure);
        }
        String str3 = productNutrientDecorator.amount;
        if (str3 != null) {
            if (StringsKt.r0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                return AbstractC5607a.INSTANCE.c(str3);
            }
        }
        return null;
    }

    public final AbstractC5607a c() {
        return (AbstractC5607a) this.amountWithUnit.getValue();
    }

    public final AbstractC5607a d() {
        String str = this.name;
        if (str != null && !StringsKt.r0(str) && c() != null) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = C17305C.f163347v;
            String str2 = this.name;
            AbstractC5607a abstractC5607aC = c();
            Intrinsics.g(abstractC5607aC);
            return companion.d(i10, str2, abstractC5607aC);
        }
        String str3 = this.name;
        if (str3 == null || StringsKt.r0(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            return AbstractC5607a.INSTANCE.c(str3);
        }
        return null;
    }

    public final AbstractC5607a e() {
        String str = this.dailyPercentValue;
        if (str != null) {
            if (StringsKt.r0(str)) {
                str = null;
            }
            if (str != null) {
                return AbstractC5607a.INSTANCE.d(C17305C.f163306C, this.dailyPercentValue);
            }
        }
        return null;
    }

    public final AbstractC5607a f() {
        String strJ0;
        String str = this.name;
        if (str != null) {
            if (StringsKt.r0(str)) {
                str = null;
            }
            if (str != null && (strJ0 = StringsKt.J0(str, "Total ")) != null) {
                if (Intrinsics.e(strJ0, "Carbohydrate")) {
                    strJ0 = "Carbs";
                }
                return AbstractC5607a.INSTANCE.c(strJ0);
            }
        }
        return null;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unitOfMeasure;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dailyPercentValue;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ProductNutrientDecorator(name=" + this.name + ", amount=" + this.amount + ", unitOfMeasure=" + this.unitOfMeasure + ", dailyPercentValue=" + this.dailyPercentValue + ')';
    }

    public /* synthetic */ ProductNutrientDecorator(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductNutrientDecorator(Nutrient nutrient) {
        Intrinsics.j(nutrient, "nutrient");
        String name = nutrient.getName();
        String value = nutrient.getValue();
        String unitOfMeasure = nutrient.getUnitOfMeasure();
        String dailyPercentageValue = nutrient.getDailyPercentageValue();
        this(name, value, unitOfMeasure, dailyPercentageValue == null ? "" : dailyPercentageValue);
    }
}
