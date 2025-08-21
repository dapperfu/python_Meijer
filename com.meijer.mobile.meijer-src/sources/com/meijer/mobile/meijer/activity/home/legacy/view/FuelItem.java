package com.meijer.mobile.meijer.activity.home.legacy.view;

import F1.a;
import Gk.g;
import H1.v;
import H1.w;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "", "", "label", "", "price", "<init>", "(Ljava/lang/String;D)V", "LH1/v;", "regularTextSize", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedFuelPrice--R2X_6o", "(J)Landroidx/compose/ui/text/AnnotatedString;", "annotatedFuelPrice", "component1", "()Ljava/lang/String;", "component2", "()D", "copy", "(Ljava/lang/String;D)Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "D", "getPrice", "Landroid/text/SpannableString;", "getSuperscriptFuelPrice", "()Landroid/text/SpannableString;", "superscriptFuelPrice", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class FuelItem {
    public static final int $stable = 0;
    private final String label;
    private final double price;

    public static /* synthetic */ FuelItem copy$default(FuelItem fuelItem, String str, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fuelItem.label;
        }
        if ((i10 & 2) != 0) {
            d10 = fuelItem.price;
        }
        return fuelItem.copy(str, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    public final FuelItem copy(String label, double price) {
        Intrinsics.j(label, "label");
        return new FuelItem(label, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuelItem)) {
            return false;
        }
        FuelItem fuelItem = (FuelItem) other;
        return Intrinsics.e(this.label, fuelItem.label) && Double.compare(this.price, fuelItem.price) == 0;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + Double.hashCode(this.price);
    }

    public String toString() {
        return "FuelItem(label=" + this.label + ", price=" + this.price + ')';
    }

    public FuelItem(String label, double d10) {
        Intrinsics.j(label, "label");
        this.label = label;
        this.price = d10;
    }

    /* renamed from: annotatedFuelPrice--R2X_6o, reason: not valid java name */
    public final AnnotatedString m63annotatedFuelPriceR2X_6o(long regularTextSize) {
        double d10 = this.price;
        if (d10 % 1 == 0.0d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('$');
            sb2.append(this.price);
            return new AnnotatedString(sb2.toString(), null, 2, null);
        }
        String strD = g.f13088a.d(d10);
        AnnotatedString.b bVar = new AnnotatedString.b(strD);
        float fC = a.INSTANCE.c();
        w.b(regularTextSize);
        bVar.a(new SpanStyle(0L, w.k(v.f(regularTextSize), v.h(regularTextSize) * 0.625f), null, null, null, null, null, 0L, a.d(fC), null, null, 0L, null, null, null, null, 65277, null), StringsKt.k0(strD), strD.length());
        return bVar.q();
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getPrice() {
        return this.price;
    }

    public final SpannableString getSuperscriptFuelPrice() {
        double d10 = this.price;
        if (d10 % 1 == 0.0d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('$');
            sb2.append(this.price);
            return new SpannableString(sb2.toString());
        }
        String strD = g.f13088a.d(d10);
        SpannableString spannableString = new SpannableString(strD);
        spannableString.setSpan(new SuperscriptSpan(), StringsKt.k0(strD), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.625f), StringsKt.k0(strD), spannableString.length(), 17);
        return spannableString;
    }
}
