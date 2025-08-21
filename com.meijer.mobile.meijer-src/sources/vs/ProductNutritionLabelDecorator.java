package vs;

import Eo.Nutrient;
import Eo.NutritionLabel;
import Eo.ServingSize;
import bk.AbstractC6392a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import us.C17457C;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010 ¨\u0006,"}, d2 = {"Lvs/l;", "", "LEo/g;", "nutritionLabel", "<init>", "(LEo/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEo/g;", "getNutritionLabel", "()LEo/g;", "Lbk/a;", "i", "()Lbk/a;", "servingsPerContainer", "h", "servingSizes", "calories", "b", "caloriesFromFat", "", "Lvs/k;", "f", "()Ljava/util/List;", "nutrients", "j", "vitamins", "d", "minerals", "c", "microNutrients", "g", "secondaryNutrients", "e", "nutrientTotals", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductNutritionLabelDecorator {

    /* renamed from: b, reason: collision with root package name */
    public static final int f166297b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NutritionLabel nutritionLabel;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductNutritionLabelDecorator) && Intrinsics.e(this.nutritionLabel, ((ProductNutritionLabelDecorator) other).nutritionLabel);
    }

    public ProductNutritionLabelDecorator(NutritionLabel nutritionLabel) {
        Intrinsics.j(nutritionLabel, "nutritionLabel");
        this.nutritionLabel = nutritionLabel;
    }

    public final String a() {
        Nutrient nutrientJ = this.nutritionLabel.j();
        if (nutrientJ != null) {
            return nutrientJ.getValue();
        }
        return null;
    }

    public final AbstractC6392a b() {
        Nutrient nutrientK = this.nutritionLabel.k();
        if (nutrientK != null) {
            String value = nutrientK.getValue();
            if (value == null || StringsKt.s0(value)) {
                nutrientK = null;
            }
            if (nutrientK != null) {
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                int i10 = C17457C.f164425v;
                String name = nutrientK.getName();
                String value2 = nutrientK.getValue();
                Intrinsics.g(value2);
                return companion.d(i10, name, value2);
            }
        }
        return null;
    }

    public final List<ProductNutrientDecorator> c() {
        List<Nutrient> listR = this.nutritionLabel.r();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listR, 10));
        Iterator<T> it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductNutrientDecorator((Nutrient) it.next()));
        }
        return arrayList;
    }

    public final List<ProductNutrientDecorator> d() {
        List<Nutrient> listS = this.nutritionLabel.s();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listS, 10));
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductNutrientDecorator((Nutrient) it.next()));
        }
        return arrayList;
    }

    public final List<ProductNutrientDecorator> e() {
        List listR = CollectionsKt.r(this.nutritionLabel.j(), this.nutritionLabel.o(), this.nutritionLabel.n(), this.nutritionLabel.v());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductNutrientDecorator((Nutrient) it.next()));
        }
        return arrayList;
    }

    public final List<ProductNutrientDecorator> f() {
        List<Nutrient> listT = this.nutritionLabel.t();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listT, 10));
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductNutrientDecorator((Nutrient) it.next()));
        }
        return arrayList;
    }

    public final AbstractC6392a h() {
        List<ServingSize> listB = this.nutritionLabel.getHeader().b();
        if (listB.size() > 1) {
            ServingSize servingSize = listB.get(0);
            ServingSize servingSize2 = listB.get(1);
            return AbstractC6392a.INSTANCE.d(C17457C.f164382A, servingSize.getValue(), servingSize.getUnitOfMeasure(), servingSize2.getValue(), servingSize2.getUnitOfMeasure());
        }
        if (listB.size() != 1) {
            return null;
        }
        ServingSize servingSize3 = (ServingSize) CollectionsKt.s0(listB);
        return AbstractC6392a.INSTANCE.d(C17457C.f164385D, servingSize3.getValue(), servingSize3.getUnitOfMeasure());
    }

    public int hashCode() {
        return this.nutritionLabel.hashCode();
    }

    public final AbstractC6392a i() {
        String servingsPerContainer = this.nutritionLabel.getHeader().getServingsPerContainer();
        if (StringsKt.s0(servingsPerContainer)) {
            servingsPerContainer = null;
        }
        if (servingsPerContainer != null) {
            return AbstractC6392a.INSTANCE.d(C17457C.f164383B, servingsPerContainer);
        }
        return null;
    }

    public final List<ProductNutrientDecorator> j() {
        List<Nutrient> listW = this.nutritionLabel.w();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listW, 10));
        Iterator<T> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductNutrientDecorator((Nutrient) it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "ProductNutritionLabelDecorator(nutritionLabel=" + this.nutritionLabel + ')';
    }

    public final List<ProductNutrientDecorator> g() {
        return CollectionsKt.P0(CollectionsKt.P0(j(), d()), c());
    }
}
