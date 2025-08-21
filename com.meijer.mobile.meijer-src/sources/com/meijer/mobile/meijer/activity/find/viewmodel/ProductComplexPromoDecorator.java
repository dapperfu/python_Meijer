package com.meijer.mobile.meijer.activity.find.viewmodel;

import Xk.ProductComplexPromo;
import bk.AbstractC6392a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "", "", PreferencesHelper.PREF_ID, "", "text", "Lbk/a;", "formattedText", "<init>", "(JLjava/lang/String;Lbk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "c", "Lbk/a;", "()Lbk/a;", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.w, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductComplexPromoDecorator {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f109897e = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a formattedText;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/w$a;", "", "<init>", "()V", "LXk/a;", "complexPromo", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "a", "(LXk/a;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductComplexPromoDecorator a(ProductComplexPromo complexPromo) {
            Intrinsics.j(complexPromo, "complexPromo");
            long promoId = complexPromo.getPromoId();
            String promoText = complexPromo.getPromoText();
            String promoText2 = complexPromo.getPromoText();
            return new ProductComplexPromoDecorator(promoId, promoText, promoText2 != null ? AbstractC6392a.INSTANCE.c(promoText2) : null);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductComplexPromoDecorator)) {
            return false;
        }
        ProductComplexPromoDecorator productComplexPromoDecorator = (ProductComplexPromoDecorator) other;
        return this.id == productComplexPromoDecorator.id && Intrinsics.e(this.text, productComplexPromoDecorator.text) && Intrinsics.e(this.formattedText, productComplexPromoDecorator.formattedText);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC6392a abstractC6392a = this.formattedText;
        return iHashCode2 + (abstractC6392a != null ? abstractC6392a.hashCode() : 0);
    }

    public String toString() {
        return "ProductComplexPromoDecorator(id=" + this.id + ", text=" + this.text + ", formattedText=" + this.formattedText + ')';
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getFormattedText() {
        return this.formattedText;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public ProductComplexPromoDecorator(long j10, String str, AbstractC6392a abstractC6392a) {
        this.id = j10;
        this.text = str;
        this.formattedText = abstractC6392a;
    }
}
