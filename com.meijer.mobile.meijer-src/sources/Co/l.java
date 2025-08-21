package Co;

import Fo.Discount;
import Fo.Price;
import j$.time.OffsetDateTime;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import nk.InterfaceC15960a;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aM\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001ai\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010\"\u001a\u00020!*\u00020\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "Lnk/f;", "g", "(Ljava/lang/String;)Lnk/f;", "name", "Lnk/c;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lnk/c;", "currencyIso", "unit", "", "value", "formattedValue", "averagePoundEach", "priceText", "Lnk/b;", "e", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;)Lnk/b;", "", "map", "j$/time/OffsetDateTime", "priceGoodThrough", "salePriceText", "salePriceType", "salePriceValue", "savingsText", "", "unitFactor", "Lnk/a;", "b", "(ZLj$/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ID)Lnk/a;", "LCo/h;", "a", "(Lnk/f;)LCo/h;", "fulldetails_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes12.dex */
public final class l {
    public static final ProductFullDetails a(nk.f fVar) {
        Intrinsics.j(fVar, "<this>");
        ProductFullDetails hVar = fVar instanceof ProductFullDetails ? (ProductFullDetails) fVar : null;
        if (hVar == null) {
            return new ProductFullDetails(fVar.getCode(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null);
        }
        return hVar;
    }

    public static final InterfaceC15960a b(boolean z10, OffsetDateTime offsetDateTime, String salePriceText, String salePriceType, double d10, String savingsText, String unit, int i10, double d11) {
        Intrinsics.j(salePriceText, "salePriceText");
        Intrinsics.j(salePriceType, "salePriceType");
        Intrinsics.j(savingsText, "savingsText");
        Intrinsics.j(unit, "unit");
        return new Discount(z10, offsetDateTime, salePriceText, salePriceType, d10, savingsText, unit, i10, d11);
    }

    public static /* synthetic */ InterfaceC15960a c(boolean z10, OffsetDateTime offsetDateTime, String str, String str2, double d10, String str3, String str4, int i10, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            offsetDateTime = null;
        }
        if ((i11 & 4) != 0) {
            str = "";
        }
        String str5 = (i11 & 8) != 0 ? "" : str2;
        double d12 = (i11 & 16) != 0 ? 0.0d : d10;
        String str6 = (i11 & 32) != 0 ? "" : str3;
        String str7 = (i11 & 64) == 0 ? str4 : "";
        int i12 = (i11 & 128) == 0 ? i10 : 0;
        if ((i11 & 256) != 0) {
            d11 = 0.0d;
        }
        return b(z10, offsetDateTime, str, str5, d12, str6, str7, i12, d11);
    }

    public static final nk.c d(String code, String name) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        return new SimpleNamedProduct(code, name);
    }

    public static final nk.b e(String currencyIso, String str, double d10, String formattedValue, double d11, String str2) {
        Intrinsics.j(currencyIso, "currencyIso");
        Intrinsics.j(formattedValue, "formattedValue");
        return new Price(currencyIso, formattedValue, null, str, d10, Double.valueOf(d11), str2, 4, null);
    }

    public static /* synthetic */ nk.b f(String str, String str2, double d10, String str3, double d11, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "USD";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            d10 = 0.0d;
        }
        if ((i10 & 8) != 0) {
            str3 = NumberFormat.getCurrencyInstance().format(d10);
        }
        if ((i10 & 16) != 0) {
            d11 = 0.0d;
        }
        return e(str, str2, d10, str3, d11, (i10 & 32) != 0 ? null : str4);
    }

    public static final nk.f g(String code) {
        Intrinsics.j(code, "code");
        return new SimpleProductIdentity(code);
    }
}
